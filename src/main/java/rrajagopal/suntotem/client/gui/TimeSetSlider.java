package rrajagopal.suntotem.client.gui;

import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.gui.widget.Slider;

@OnlyIn(Dist.CLIENT)
public class TimeSetSlider extends Slider {
    public TimeSetSlider(int time) {
        super(40, 40, 200, 10, new StringTextComponent("Midnight"), new StringTextComponent("Noon"), 0D, 23999D, time, false, false, null);
    }
}
