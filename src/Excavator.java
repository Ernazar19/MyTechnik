import java.time.LocalDate;

public class Excavator extends Tchnick{
    void driver(){
        System.out.println("The Driver got into the cab excavator... ");
    }

    void Start(){
        System.out.println("The driver started the excavator...");
    }void stop(){
        System.out.println("The driver turned off the excavator...");

    }

    public Excavator(String marka, String color, LocalDate yearOfMade,
                     String countryOfManufacture, long id, double volumeEngine, String detined) {
        super(marka, color, yearOfMade, countryOfManufacture, id, volumeEngine, detined);
    }

    @Override
    public String toString() {
        return "<--Excavator-->"+"\n"+
                "marka " + getMarka() + "\n" +
                "color " + getColor() + "\n" +
                "yearOfMade " + getYearOfMade() +"\n"+
                "countryOfManufacture " + getCountryOfManufacture() + "\n" +
                "id " + getId() + "\n" +
                "volumeEngine " + getVolumeEngine()+ "\n" +
                "detined " + getDetined();
    }
}


