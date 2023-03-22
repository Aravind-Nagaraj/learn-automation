public class Spectacles {

    static String brandNameNew = "EyeCare";
    static double rangeNew = 4.5;
    static byte pairOfGlassesDone =  5;
    static boolean notReadableNews = false;

 public static void main(String[] args){

    String brandName = "Lenskart";
    double range = 4.5;
    byte pairOfGlasses =  4;
    boolean notReadable = false;

     System.out.println("brandName="brandName);
     System.out.println(range);
     System.out.println(pairOfGlasses);
     System.out.println(notReadable);

  System.out.println("brandNameNew ="+Spectacles.brandNameNew);
  System.out.println("rangeNew ="+Spectacles.rangeNew);
  System.out.println("pairOfGlassesDone ="+Spectacles.pairOfGlassesDone);
  System.out.println("notReadableNews ="+Spectacles.notReadableNews);

 }

}

public class SpectaclesMethods {
    static String brandName;
    static double lensRange;
    static byte fitting = 2;
    static boolean readableAfterWear;

    public static void main(String[] arguments){
        System.out.println("main()method will be called by JVM with stylish looks");
        ImproveVision();
        ChangeTheLook();
        ImproveEyePower();
        Stylish();
    }

    static void ImproveVision() {
        System.out.println("Invoke Improve Vision()");
    }
    static void ChangeTheLook() {
        System.out.println("Invoke ChangeTheLook than before()");
    }

    static void ImproveEyePower() {
        System.out.println("Invoke Improves eye shortsight vision()");
    }

    static String Stylish()
    {
        System.out.println("New Brand Stylish occurance");
        String returnValue = "Suits to new trend";
        return returnValue;
    }

}

public class WashingMachine {
    static String companyName;
    static double washingMachineCost;
    static byte pipes = 2;
    static boolean isTopLoad;

    public static void main(String[] arguments){
        System.out.println("main()method will be called by JVM with Damsung Company name");
        QuickWash();
        CleansClothes();
        ReduceHumanEffort();
        LessSpace();
    }

    static void QuickWash() {
        System.out.println("Invoke QuickWash()");
    }
    static void CleansClothes() {
        System.out.println("Invoke CleansClothes()");
    }

    static void ReduceHumanEffort() {
        System.out.println("Invoke ReduceHumanEffort()");
    }

    static String LessSpace()
    {
        System.out.println("New Brand with Less Space consumption");
        String returnValue = "Suits the budget ";
        return returnValue;
    }


    public class Bike {
        static int  noOfGears=5;
        static String name;
        static double price;
        static boolean isMoving=false;

        public static void main(String[] args){
            System.out.println("main()method will be called by JVM with Damsung Company name");
            IncreaseSpeed();
            ChangeGears();
            ReduceTravelTime();
            FuelConsumption();
        }

        static void IncreaseSpeed() {
            System.out.println("Invoke IncreaseSpeed()");
        }
        static void ChangeGears() {
            System.out.println("Invoke ChangeGears()");
        }

        static void ReduceTravelTime() {
            System.out.println("Invoke ReduceTravelTime()");
        }

        static String FuelConsumption()
        {
            System.out.println("New Bike with Less Fuel consumption and more mileage");
            String returnValue = "Suits the latest style";
            return returnValue;
        }
}


public class  {
    static String companyName;
    static double pipeLength;
    static byte numberOfPorts = 2;
    static boolean isTopLoad;

    public static void main(String[] arguments){
        System.out.println("main()method will be called by JVM with company name as Samsung Washing Machine");
        boolean argument1=false;
        boolean function = isMachineOff(argument1);
        multipleWashOptions();
        totalWashTime();
    }

    static void multipleConnections() {
        System.out.println("Invoke multipleConnections()");
    }
    static void numberOfPluginsAvailable() {
        System.out.println("Invoke numberOfPluginsAvailable are 4()");
    }

    static boolean isSwitchOff(boolean parameter1)
    {
        System.out.println("invoked isSwitchOff()");
        System.out.println(parameter1);
        boolean returnValue=parameter1;
        return returnValue;
    }

}

