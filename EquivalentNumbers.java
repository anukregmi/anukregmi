/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.Scanner;
public class EquivalentNumbers {
   //main method
   public static void main(String[] args) {
      //creating an object
      Convert obj = new Convert();
      //printing value
      obj.getVal();
      obj.convert();
   }
}
//create Convert class in that declare variables
class Convert {
   //declaring variable
   int num;
   //initialize Convert class construtor
   public void getVal() {
      //Scanner class is used to take input from users
      Scanner sc = new Scanner(System.in);
      //taking input from users
      System.out.println("Enter the Number = ");
      num = sc.nextInt();
   }
   public void convert() {
     //converting the input number to HexaDecimal value
      String hexa = Integer.toHexString(num);
     //printing the hexa decimal value 
      System.out.println("HexaDecimal value is "+hexa);
     //converting the input number to octal value
      String octal = Integer.toOctalString(num);
     //printing the octal value
      System.out.println("Octal value is = "+octal);
     //converting the number to binary 
      String binary = Integer.toBinaryString(num);
     //printing the binary value
      System.out.println("Binary value is = "+binary);
   }
}

