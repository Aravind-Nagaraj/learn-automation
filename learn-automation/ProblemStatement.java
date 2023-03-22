import java.util.Scanner;
public class ProblemStatement {

public static void main(String[] args) {


int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age you want to check entry for the show:");
        age = scan.nextInt();
        scan.close();
        if(age > 15)
        {
            System.out.println(age+" Welcome to the show");
        }
        else if(age < 15)
        {
           System.out.println(age+" Welcome to the show, Please note that you should be accompanied by an adult");
        }
        else
        {
            System.out.println(age+" please enter age in number");
        }
        }
}
