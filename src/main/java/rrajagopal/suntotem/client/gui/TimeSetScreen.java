package rrajagopal.suntotem.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rrajagopal.suntotem.common.network.NetworkDispatcher;
import rrajagopal.suntotem.common.network.TimeSetMessage;

@OnlyIn(Dist.CLIENT)
public class TimeSetScreen extends Screen {
    private int time;
    private BlockPos pos;
    private TimeSetSlider slider;

    public TimeSetScreen(TextComponent title, BlockPos pos, int time) {
        super(title);
        this.time = time;
        this.pos = pos;
        this.slider = new TimeSetSlider(this.time);
    }

    @Override
    protected void init() {
        super.init();
        this.addButton(this.slider);
    }

    @Override
    public void tick() {
        this.time = (int) this.slider.sliderValue;
    }

    @Override
    public void onClose() {
        NetworkDispatcher.CHANNEL.sendToServer(new TimeSetMessage(this.pos, this.time));
    }
}
