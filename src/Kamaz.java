import java.time.LocalDate;

public class Kamaz extends Tchnick {
    void driver(){
        System.out.println("The Driver got into the cab kamaz...");
    } void start() {
        System.out.println("The driver started the kamaz...");
    }void stop() {
        System.out.println("The driver turned off the kamaz...");

    }
    public Kamaz(String marka, String color, LocalDate yearOfMade,
                 String countryOfManufacture, long id, double volumeEngine, String detined) {
        super(marka, color, yearOfMade, countryOfManufacture, id, volumeEngine, detined);
    }

    @Override
    public String toString() {
        return "<--Kamaz-->"+"\n"+
                "marka " + getMarka() + "\n" +
                "color " + getColor() + "\n" +
                "yearOfMade " + getYearOfMade() + "\n"+
                "countryOfManufacture " + getCountryOfManufacture() + "\n" +
                "id " + getId() + "\n" +
                "volumeEngine " + getVolumeEngine()+ "\n" +
                "detined " + getDetined() ;
    }
}