public class Mars{
    public static void main(String[] args){

        String colonyName = "DogLand";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);
        System.out.println(shipFood);
        shipFood *= 1.5;
        shipPopulation += 5;

        String landingLocation = "The ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzz landing on the plain");
        } else {
            System.out.println("Flight plan already set. Landing on the plain");
        }
        landingCheck(100);
    }
    public static void landingCheck(int loops){
        for(int i = 0; i <= loops; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Keep center");
            } else if (i % 5 == 0){
                System.out.println("Keep right");
            } else if (i % 3 == 0){
                System.out.println("Keep left");
            } else {
                System.out.println("Calculating");
            }

                Thread.sleep(250);
            }
            System.out.println("Landed");
        return false;


    }
}