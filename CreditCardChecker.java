import ou.*;
import java.util.*;

/**
 * Answer to TMA01 Question 1.
 * 
 * @author (Anna Duncan) 
 * @version (05 Dec 2020)
 */
public class CreditCardChecker
{
   // instance variables - replace the example below with your own
   private String longNumber;
   private String firstFifteen;
   private int i;
   private int number;
   private int sumOfNum;
   private int c; 
 public CreditCardChecker(String longNumber)
   
   {
      this.longNumber = longNumber;
 
   }
   /**
    * Method for getting longNumber
    */
 public String getLongNumber()
   {
      return this.longNumber;
   }

   /**
   * Check if number of digits in longNumber equals 16
   */
public boolean isCorrectLength()
{
  if (((this.getLongNumber()).length()) == 16)
  return true;
  else return false;

}
/**
 * This method returns first 15 digits of longNumber
 */
public String firstFifteen()
   
   {
   firstFifteen = this.getLongNumber().substring(0,((this.getLongNumber()).length()) - 1);
   return firstFifteen;
   } 
/**
 * This method calculates S and C, and returns C 
 */
public int calculateCheckNumber() 
   {

    sumOfNum = 0;
    
    for  (i = 0; i <=14 ;)
      {
         
         if ((i == 0) || (i %2 ==0)) 
         {  number = Character.getNumericValue(longNumber.charAt(i)) * (2);
            if (number > 9)
               {
                  number = number - 9;
                  i = i + 1;
               }
               else 
               {
                  number = number;
                  i = i + 1;
               }
            }
         else
         { 
            number = Character.getNumericValue(longNumber.charAt(i));
            i = i +1;
          }
         sumOfNum = sumOfNum + number;
   }
    c = ((sumOfNum/10) * 10) + 10 - sumOfNum;
    
    return c;  
   }
/**
 * This method checks if the number is correct lenght and if 'c' is the same as the last digit of the number.
 * If it is it "Could be valid" else displays a message saying "Not valid".

*/
public void validNumberResults()
   {
      if (this.isCorrectLength()== true && this.calculateCheckNumber() == Character.getNumericValue(this.getLongNumber().charAt(15))) 
               {
                  System.out.println("Could be valid");
               }
      else 
               {
                  System.out.println("Not valid");
               }}
   }

