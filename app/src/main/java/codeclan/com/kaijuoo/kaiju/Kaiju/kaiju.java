package codeclan.com.kaijuoo.kaiju.Kaiju;

/**
 * Created by user on 02/11/2017.
 */

public class kaiju {
    public abstract class Kaiju {
        public String name;
        public int healthValue;
        public int attackValue;

        public Kaiju(String name, int healthValue, int attackValue) {
            this.name = name;
            this.healthValue = healthValue;
            this.attackValue = attackValue;
        }
        public String roar() {
            return "ROAR!";
        }

        public String getName() {
            return name;
        }

        public int getHealthValue() {
            return healthValue;
        }

        public int getAttackValue() {
            return attackValue;
        }
        public String attack(Vehicle1 vehicle) {
            vehicle.healthValue -= attackValue;
            return "CRASH!";
        }
        public String fly() {

        }

    }

    /**
     * Created by user on 02/11/2017.
     */

    public static class Kaiju1 {
        public class Kaiju1 extends Kaiju {

            public Kaiju1(String name, int healthValue, int attackValue) {
                super(name, healthValue, attackValue);

                this.name = name;
                this.healthValue = healthValue;
                this.attackValue = attackValue;

            }
    }
