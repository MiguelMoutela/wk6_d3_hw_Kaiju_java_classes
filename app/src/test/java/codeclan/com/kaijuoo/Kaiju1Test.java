package codeclan.com.kaijuoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 02/11/2017.
 */


    public class Kaiju1Test {
        Kaiju1 kaiju1;
        Vehicle1 testVehicle;


        @Before
        public void before(){
            kaiju1 = new Kaiju1("Kaiju1", 100, 10);
            testVehicle = new Vehicle1("crashTestVehicle", 20);
        }

        @Test
        public void testKaijuHasName() {
            assertEquals("Kaiju1", kaiju1.getName());
        }

        @Test
        public void testKaijuHasHealthValue() {
            assertEquals(100, kaiju1.getHealthValue());
        }

        @Test
        public void testKaijuHasAttackValue() {
            assertEquals(10, kaiju1.getAttackValue());
        }

        @Test
        public void KaijuCanRoar(){
            assertEquals("ROAR!", kaiju1.roar());
        }
        @Test void KaijuCanAttack(){
            kaiju1.attack(testVehicle)
            assertEquals(10, testVehicle.healthValue());
        }

    }
