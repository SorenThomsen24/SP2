public abstract class AFuelCar extends ACar
{
    public abstract String getFuelType();

    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre(){
        return kmPrLitre;
    }

    @Override
    public String toString() {
        String str = super.toString();

        str  += " kmPrLitre = " + kmPrLitre;
        return str;
    }
}
