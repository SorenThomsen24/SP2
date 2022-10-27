public class Main {
    public static void main(String[] args){
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(new DieselCar("DH 63735", "AUDI", "A4", 5, 23, true));
        fleet.addCar(new DieselCar("DB 64536", "AUDI", "Q5", 5, 13, false));
        fleet.addCar(new DieselCar("AX 72546", "AUDI", "R8", 3, 16, true));

        fleet.addCar(new GasolineCar("AT 10200", "VW", "GOLF", 5, 34));
        fleet.addCar(new GasolineCar("AX 87435", "SKODA", "FABIA", 5, 23));
        fleet.addCar(new GasolineCar("DJ 28172", "SKODA", "CITIGO", 3, 16));

        fleet.addCar(new ElectricCar("AH 65536", "MERCEDES", "EQC", 5, 23, 400));
        fleet.addCar(new ElectricCar("AT 57483", "TESLA", "MODEL Y", 5, 34, 450));
        fleet.addCar(new ElectricCar("DF 73648", "AUDI", "Q4", 5, 32, 350));

        System.out.println(fleet);

        System.out.println("- Total registration fee: " + fleet.getTotalRegistrationFeeForFleet());
    }


}
