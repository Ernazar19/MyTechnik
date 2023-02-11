import java.time.LocalDate;

public class Tchnick {
    private String marka;
    private String color;
    private LocalDate yearOfMade;
    private  String countryOfManufacture;
    private long id;
    private double volumeEngine;
    private String detined;

    public Tchnick(String marka, String color, LocalDate yearOfMade,
                   String countryOfManufacture, long id,double volumeEngine,String detined) {
        this.marka = marka;
        this.color = color;
        this.yearOfMade = yearOfMade;
        this.countryOfManufacture = countryOfManufacture;
        this.id = id;
        this.volumeEngine = volumeEngine;
        this.detined = detined;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(LocalDate yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public double getVolumeEngine(){
      return volumeEngine;
    }public void setVolumeEngine(double volumeEngine){
        this.volumeEngine = volumeEngine;
    }

    public String getDetined() {
        return detined;
    }

    public void setDetined(String detined) {
        this.detined = detined;
    }

    @Override
    public String toString() {
        return "Technick " +
                "marka " + marka + "\n" +
                "color " + color + "\n"  +
                "yearOfMade " + yearOfMade +"\n"+
                "countryOfManufactur " + countryOfManufacture + "\n" +
                "id " + id +"\n"+
                "volumeEngine " + volumeEngine +"\n"+
                "detined " + detined ;
    }
}
