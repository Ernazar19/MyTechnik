import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Excavator excavator = new Excavator("Hunday-3200",
                "Orange", LocalDate.of(2020,5,24),"Korea",
                9438282292L,4.5,"For quarring and trench excvation");
        System.out.println(excavator);
      //  excavator.driver();
      //  excavator.Start();
      //   excavator.stop();
        System.out.println("_________________________________________________________");
        Kamaz kamaz = new Kamaz("kamaz Euro-4","White",
                LocalDate.of(2015,5,12),
                "Russia",5522213344L,10.1,
                "Designed for ttranportation of rocks and mixtures");
        System.out.println(kamaz);
       // kamaz.driver();
       // kamaz.start();
       // kamaz.stop();
        System.out.println("_________________________________________________________");
        Sprinter sprinter = new Sprinter("M-Benz Sprinter","White",
                LocalDate.of(2011,2,13),
                "German",134567899L,2.9,
                "Designed for the transportation of goods and spre parts for cargo");
        System.out.println(sprinter);
      // sprinter.driver();
      // sprinter.start();
      // sprinter.stop();
        System.out.println("_________________________________________________________");
        Loader loader = new Loader("LuiGong","Yellow ",
                LocalDate.of(2018,11,13),
                "China",3342111L,6.0,"Designed for career work");
        System.out.println(loader);
      // loader.driver();
      // loader.start();
      // loader.stop();
        System.out.println("_________________________________________________________");

        Fura fura = new Fura("VolVo","White",LocalDate.of(2022,3,24),
                "Sweden",8439842021L,14.1,
                "Designed for long-distance transportation");
        System.out.println(loader);
       // fura.driver();
       // fura.start();
       // fura.stop();
    }
}