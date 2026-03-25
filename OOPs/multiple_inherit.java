package OOPs;

interface LandVehicle{
    default void landInfo(){
        System.out.println("These are Land Vehicles.");
    }
}
interface WaterVehicle{
    default void waterInfo(){
        System.out.println("These are water vehicles.");
    }
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle{

    AmphibiousVehicle() {
        System.out.println("These are amphibious vehicle.");
    }
    
}
public class multiple_inherit {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();

        }
}
