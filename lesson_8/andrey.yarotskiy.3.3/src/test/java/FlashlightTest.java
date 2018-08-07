import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


import static org.junit.Assert.*;

public class FlashlightTest {
    private static Flashlight flashlight;
    @Before
    public void init(){
        flashlight = new Flashlight();
        assertThat(flashlight.battery,is(0));
    }
    @Test
    public void insertBatteryTest(){
        flashlight.battery = 0;

        assertThat(flashlight.insertBattery(), equalTo("Flashlight has 1 batteries"));
        assertThat(flashlight.insertBattery(), equalTo("Flashlight has 2 batteries"));
        assertThat(flashlight.insertBattery(), equalTo("Flashlight has 3 batteries"));
        assertThat(flashlight.insertBattery(), equalTo("Flashlight has 4 batteries"));
        assertThat(flashlight.insertBattery(), equalTo("Flashlight has 5 batteries"));
        assertThat(flashlight.insertBattery(), equalTo("Flashlight is full"));
    }

    @Test
    public void shineWhiteTest(){
        flashlight.battery = 0;

        assertThat(flashlight.shineWhite(), is("Not enough batteries"));

        flashlight.insertBattery();

        assertThat(flashlight.shineWhite(), is("Shining white"));
    }
    @Test
    public void shineRedTest(){
        flashlight.battery = 0;
        assertThat(flashlight.shineRed(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineRed(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineRed(), is("Shining red"));
    }
    @Test
    public void shineGreenTest(){
        flashlight.battery = 0;
        assertThat(flashlight.shineGreen(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineGreen(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineGreen(), is("Shining green"));
    }
    @Test
    public void shineBlueTest(){
        flashlight.battery = 0;
        assertThat(flashlight.shineBlue(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineBlue(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.shineBlue(), is("Shining blue"));
    }
    @Test
    public void flickerTest(){
        flashlight.battery = 0;

        assertThat(flashlight.flicker(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.flicker(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.flicker(), is("Not enough batteries"));
        flashlight.insertBattery();
        assertThat(flashlight.flicker(), is("Flickering"));
    }
}
