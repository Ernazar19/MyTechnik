import java.time.LocalDate;

public class Sprinter extends Tchnick{
    void driver(){
        System.out.println("The Driver got into the cab Sprinter... ");
    } void start() {
        System.out.println("The driver started the Sprinter...");
    }void stop() {
        System.out.println("The driver turned off the Sprinter...");

    }

    public Sprinter(String marka, String color, LocalDate yearOfMade,
                    String countryOfManufacture, long id, double volumeEngine, String detined) {
        super(marka, color, yearOfMade, countryOfManufacture, id, volumeEngine, detined);
    }

    @Override
    public String toString() {
        return "<--Sprinter-->"+
                "marka " + getMarka() + "\n" +
                "color " + getColor() + "\n" +
                "yearOfMade " + getYearOfMade() + "\n"+
                "countryOfManufacture " + getCountryOfManufacture() + "\n" +
                "id " + getId() + "\n"+
                "volumeEngine " + getVolumeEngine()+ "\n" +
                "detined " + getDetined();
    }
}
