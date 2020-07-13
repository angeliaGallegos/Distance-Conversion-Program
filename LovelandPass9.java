/*
Angelia
11/03/18
CSCI 1015-W1S
Programming Assignment 9
Purpose of this program is to take user input on distance in meters and provide the 
conversion in kilometers, inches or feet based on choice slection from menu. Program loops 
initial inputted distance until loop is terminated by choice 4. 
*/

import java.util.Scanner;

public class LovelandPass9
{  
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int choice;
      double meters;
      
      //User enters distance in meters
      System.out.print("Enter a distance in meters: ");
      meters = sc.nextDouble();

      //Beginning a while loop to loop program until choice 4 is selected. Inside the loop if and else if statements are used to call on corresponding methods for converting
      while(true)
      {  
         //If statement to reject negative numbers from distance in meters
         if(meters < 0)
         {
            System.out.println("No negative numbers! Please restart program and try again.");
            break;
         }
         
         //Displaying the menu in loop by calling the showMenu method as well as the getting users choice selection
         showMenu();
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
        
         //If statement created to provide invalid selection response
         if(choice != 1 && choice != 2 && choice != 3 && choice != 4)
         {
            System.out.println("Your selection was invalid!");
         }
        
         //Choice 1 calls on the showKilometers method
         else if(choice == 1)
         {
            showKilometers(meters);
         } 
        
         //Choice 2 calls on the showInches method
         else if(choice == 2)
         {
            showInches(meters);
         }
         
         //Choice 3 calls on the showFeet method
         else if(choice == 3)
         {
            showFeet(meters);
         }
        
        //Choice 4 terminates the program
         else if(choice == 4)
         {
            System.out.println("See ya bye!");
            break;
         }
         
      }

   }
   
   //Method for converting meters to kilometers
   public static void showKilometers(double meters)
   {
       double kilometers = meters * 0.001;
       System.out.println(meters+" meters is "+kilometers+" kilometers");
   }
   
   //Method for converting meters to inches
   public static void showInches(double meters)
   {
       double inches = meters * 39.37;
       System.out.println(meters+" meters is "+inches+" inches");
   }
  
   //Method for converting meters to feet
   public static void showFeet(double meters)
   {
      double feet = meters * 3.281;
      System.out.println(meters+" meters is "+feet+" feet");
   }
   
   //Method for displaying the programs selection menu
   public static void showMenu()
   {
       System.out.println();
       System.out.println("1. Convert to kilometers"+
                    "\n"+ "2. Convert to inches"+
                    "\n"+ "3. Convert to feet"+
                    "\n"+ "4. Quit the program");
       System.out.println();
   }
}