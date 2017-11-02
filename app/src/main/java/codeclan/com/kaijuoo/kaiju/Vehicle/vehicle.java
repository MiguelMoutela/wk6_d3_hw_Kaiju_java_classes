package codeclan.com.kaijuoo.kaiju.Vehicle;

/**
 * Created by user on 02/11/2017.
 */


    public abstract class Vehicle {
        public String type;
        public int healthValue;

        public Vehicle (String type, int healthValue){
            this.type = type;
            this.healthValue = healthValue;
        }
}
