
public class Mars {
    
    public static void main(String[] args) throws InterruptedException {
        GuessingGame guessingGame = new GuessingGame();
        MarsExpedition marsExpedition = new MarsExpedition();
        FindingsLists findingsLists = new FindingsLists();

        String ColonyName = "Rangers";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * .5);
        System.out.println(ShipFood);

        ShipPopulation += 5;

        String LandingLocation = "The Hill";

        if (LandingLocation.equalsIgnoreCase("The Hill")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        Landing = LandingCheck(100);

    }

    private static boolean LandingCheck(int Loops) {
        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");

            }

        }
        System.out.println("Landed");
        return false;

        

        

    }
}
