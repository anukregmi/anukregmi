/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/
import java.util.Scanner;

public class Employee {
   //Declaring the Variables
   int empid;
   String name;
   int salary;
   //Creating a method
   public void getInput() {
      //Scanner is used to read input form users
      Scanner sc = new Scanner(System.in);
      //taking input from users
      System.out.println("Enter the Empid = ");
      empid = sc.nextInt();
      System.out.println("Enter the Name = ");
      name = sc.next();
      System.out.println("Enter Salary = ");
      salary = sc.nextInt();
   }
   //creating Display method
   public void display() {
      //printing employee details
      System.out.println("Empid = "+empid);
      System.out.println("Name = "+name);
      System.out.println("Salary = "+salary);
   }
   //Create a employee constructor with the two employees
   public static void main (String[] args) {
      Employee obj[] = new Employee[2];
   //check for loop to print two employee details
   for( int i=0; i<2; i++) 
   {
      obj[i] = new Employee();
      obj[i].getInput();
   }
    
    
   for( int i=0;i<2;i++) 
   {

      obj[i].display();
   }
   }
}