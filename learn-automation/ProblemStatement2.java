import java.util.Scanner;
public class ProblemStatement2 {

public static void main(String[] args) {


int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age you want to check if the person is Child or Adult:");
        age = scan.nextInt();
        scan.close();
        if(age > 15)
        {
            System.out.println(age+" Adult Ticket");
        }
        else if(age < 15)
        {
           System.out.println(age+" Child Ticket");
        }
        else
        {
            System.out.println(" please enter age in number");
        }
        }
}


