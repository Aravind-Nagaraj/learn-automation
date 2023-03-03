public class SpikeBusterMethods {
static String companyName;
static double maxLength;
static byte numberOfPlugins = 4;
static boolean isSwitchOn;

public static void main(String[] arguments){
System.out.println("main()method will be called by JVM with company name as Exide");
boolean argument1=false;
boolean function = isSwitchOff(argument1);
multipleConnections();
numberOfPluginsAvailable();
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
