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

