import java.time.LocalDate;

public class Fura extends Tchnick{


    void driver(){
        System.out.println("The Driver got into the cab fura... ");
    } void start() {
        System.out.println("The driver started the fura...");
    }void stop() {
        System.out.println("The driver turned off the fura...");

    }

    public Fura(String marka, String color, LocalDate yearOfMade,
                String countryOfManufacture, long id, double volumeEngine, String detined) {
        super(marka, color, yearOfMade, countryOfManufacture, id, volumeEngine, detined);
    }

    @Override
    public String toString() {
        return "<--Fura-->"+"\n"+
                "marka " + getMarka() + "\n" +
                "color " + getColor() + "\n" +
                "yearOfMade " + getYearOfMade() +"\n"+
                "countryOfManufacture " + getCountryOfManufacture() + "\n" +
                "id " + getId() + "\n" +
                "volumeEngine " + getVolumeEngine()+
                "detined " + getDetined();
    }
}



