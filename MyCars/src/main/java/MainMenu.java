
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bassamwayyani
 */

// this class inherits from MyCars class and MyCars Class inherits from Car Class
public class MainMenu extends MyCars {
    
    
    // method for main menu which is always in a loop expect when the No 4 is entered.
    public void mainmenu(){
        Scanner input = new Scanner(System.in);
          System.out.println("Welcome to MyCars!\n");
        int choosingOptions;
do{
     System.out.println("---------------------- Main Menu ---------------------- \n");
     System.out.println("write the number for the option that you want to go to:");
     System.out.println("1-buy a car");
     System.out.println("2-sell a car");
     System.out.println("3-Admin");
     System.out.println("4-EXIT");

     
    choosingOptions = input.nextInt();
    
       if (choosingOptions==1){
                  buyCar();          
       }
       else if (choosingOptions==2)
       { 
           sellCar();
       }
       else if (choosingOptions==3)
       {
           admin();
       }
        else if (choosingOptions==4)
       {
 System.out.println("---------------------------");
 System.out.println("Thank you for using MyCars!");
 System.out.println("---------------------------");
       }
       
        }

while(choosingOptions !=4);
    }
        }

