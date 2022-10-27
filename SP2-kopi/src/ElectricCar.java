public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public int getWhrPrKm()
    {
        return (getBatteryCapacity() *1000 / getMaxRange());
    }
    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\n batteryCapacity = " + batteryCapacity + "\n maxRange = " + maxRange + "\n getWhrPrKm = " + getWhrPrKm() +  " \n registrationFee = " + getRegistrationFee();
        return str;
    }


    public int getRegistrationFee() {
        int kmPrLitre = Math.round(100 / (getWhrPrKm() / 91.25f));
        int fee = 0;
        if (kmPrLitre >= 20 && kmPrLitre < 50) {
            fee = 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            fee =  1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            fee =  2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            fee =  5500;
        } else {
            fee =  10470;
        }
        return fee;
    }
}
