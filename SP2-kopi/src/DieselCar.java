public class DieselCar extends AFuelCar{

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;

    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " Fuel Type = " + getFuelType() + "\n" + "Registration fee = " + getRegistrationFee() + "\n" + "Has ParticleFilter = " + hasParticleFilter() + "\n";
        return str;
    }

    @Override
    public String getFuelType(){
        return "Diesel";
    }

    private final boolean particleFilter;
    boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee(){
        int fee = 0;
        if (kmPrLitre >=20 && kmPrLitre < 50){
            fee = 330+130;
            
            if (!hasParticleFilter())
            {
                fee += 1000;
            }
        }
        else if (kmPrLitre >=15 && kmPrLitre < 20){
            fee = 1050+1390;

            if(!hasParticleFilter())
            {
                fee += 1000;
            }
        }
        else if (kmPrLitre >=10 && kmPrLitre  < 15){
            fee = 2340+1850;

            if(!hasParticleFilter())
            {
                fee += 1000;
            }
        }
        else if (kmPrLitre >=5 && kmPrLitre  < 10){
            fee =  5500+2770;

            if(!hasParticleFilter())
            {
                fee += 1000;
            }
        }
        else{
            fee = 10470+15260;

            if(!hasParticleFilter())
            {
                fee += 1000;
            }
        }
        return fee;

    }
}
