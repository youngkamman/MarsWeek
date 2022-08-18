

public class Mars {
    public static void main(String[] args) {
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

    }
}
