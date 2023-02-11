import java.time.LocalDate;

public class Loader extends Tchnick {
    void driver(){
        System.out.println("The Driver got into the cab Loader... ");
    } void start() {
        System.out.println("The driver started the Loader...");
    }void stop() {
        System.out.println("The driver turned off the Loader...");

    }

    public Loader(String marka, String color, LocalDate yearOfMade,
                  String countryOfManufacture, long id, double volumeEngine, String detined) {
        super(marka, color, yearOfMade, countryOfManufacture, id, volumeEngine, detined);
    }

    @Override
    public String toString() {
        return "<--Loader-->"+"\n"+
                "marka " + getMarka() +"\n" +
                "color " + getColor() +"\n" +
                "yearOfMade " + getYearOfMade() +
                "countryOfManufacture " + getCountryOfManufacture() +"\n"+
                "id=" + getId() +"\n"+
                "volumeEngine=" + getVolumeEngine()+"\n"+
                "detined='" + getDetined();
    }
}


