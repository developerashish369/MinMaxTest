/*
  Ashish Acharya
  Chapter 4 - Lab 1B Assignment
  Due Date:March 9,2018
  
  Write a program  with a loop that lets the user enter a series of integers . The user should 
  enter -99 to signal the end of the series. After all the numbers have been entered, the
  program  should display the largest and smallest numbers entered. The value  -99 is not to
  be counted as part of the series.*/

import java.util.Scanner;
public class MinMaxTest{
public static void main(String [] args) {
	        
 
			int max=0;
			int min=999999;
			int counter = 0;
         int number = 0;
         
         //crates a scanner object
         Scanner input = new Scanner(System.in);
         
         //using pre-condition looop
         while (number != -99){
         
            //prompt a user to input
            System.out.print("Enter a positive integer (enter -99 to end): ");
   		   number = input.nextInt();
            
            if (number> max ){
   			     max = number;	
   			 }
            if (number<min && number != -99) {
   			     min = number;
   			 }
   			
   		}
         
         System.out.println("The smallest number was:"+min);
         System.out.println("The largest number was:" +max);
   	}
   }