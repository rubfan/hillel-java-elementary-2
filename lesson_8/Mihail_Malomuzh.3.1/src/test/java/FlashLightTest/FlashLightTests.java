package FlashLightTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import Flashlight.Entity.FlashLight;
import Flashlight.Entity.LightMode;
import org.junit.Before;
import org.junit.Test;

public class FlashLightTests {
    private FlashLight fl;

    @Before
    public void setUp() {
        fl = new FlashLight(1);
    }

    @Test
    public void testSetModeWithBatteriesNumberMoreThanRequired(){
        fl.setBatteriesNumber(4);
        assertThat(fl.setMode(LightMode.FLASH), is(true));
        fl.setBatteriesNumber(2);
        assertThat(fl.setMode(LightMode.RED), is(true));
    }

    @Test
    public void testSetModeWithBatteriesNumberLessThanRequired(){
        fl.setBatteriesNumber(0);
        assertThat(fl.setMode(LightMode.RED), is(false));
        fl.setBatteriesNumber(1);
        assertThat(fl.setMode(LightMode.WHITE), is(false));
    }

    @Test
    public void testSetBatteriesNumberAboveZero(){
        fl.setBatteriesNumber(0);
        assertThat(fl.getLightMode(), is(LightMode.OFF));
        fl.setBatteriesNumber(2);
        assertThat(fl.getLightMode(), is(LightMode.OFF));
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testSetBatteriesNumberLessZero() {
       fl.setBatteriesNumber(-2);
    }





    }
