
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bassamwayyani
 */

// this class inherits from the super class Car
public class MyCars extends Car{
   
    
    MyCars(){
    super("","","","",0,0,0);
    }
    
    
    
    
    Scanner in = new Scanner(System.in);
    int i;
    int inI;
    
    // arraylist which is a custom arraylist because its type is a class.
   ArrayList<Car> carList = new ArrayList<Car>();
   
   // object that will be stored in an arraylist from a classtype.
   Car x = new Car(getmake(),getmodel(),getcondition(),getavailability(),getyear(),getodometer(),getprice());

   
   /* 
   this method is for the condition of the car if its new then 
the odometer will be set to 0 otherwise the user will enter it.
   */
    public void condition(){          
     System.out.println("enter the condition of the car: ");
          System.out.println("if new enter the No 1");
     System.out.println("if used enter the No 2");
        inI=in.nextInt();
        if(inI==1){   
        setcondition("new");
        setodometer(0);
        }
       else if (inI==2){
        setcondition("used");
        System.out.println("enter the odometer of the car: ");
        setodometer(in.nextInt());       
               }
       else{
       condition();}
        
    }
    
    
    
       //this method adds a car to the arraylist
      public void sellCar(){ 
        
        System.out.println("enter the car make: ");
        setmake(in.nextLine());
                 
        System.out.println("enter the car model: ");
        setmodel(in.nextLine());
       
       condition();
               
        System.out.println("enter the year of the car in numbers: ");
        setyear(in.nextInt());
          
        System.out.println("enter the price of the car: ");
        setprice(in.nextInt());
        
        setavailability("available");
        
          x = new Car(getmake(),getmodel(),getcondition(),getavailability(),getyear(),getodometer(),getprice());
       carList.add(x);
        in.nextLine();
        }
      
     
      
      
      
       // this method changes the availability of the car and prints a message 
     public void buyCar(){
        i=0;
    if (carList.isEmpty()){
    System.out.println("there are no cars for sale! \n");
    }
    else {
       System.out.println("[Car List]");
        while(i<carList.size()){
       System.out.println("-------------Car no.("+(i+1)+")---------------");
       System.out.println("make: "+carList.get(i).getmake());
       System.out.println("model: "+carList.get(i).getmodel());
       System.out.println("condition: "+carList.get(i).getcondition());
       System.out.println("year: "+carList.get(i).getyear());
       System.out.println("odometer: "+carList.get(i).getodometer()+" km");
       System.out.println("price: "+carList.get(i).getprice()+" Riyal");
       System.out.println("availability: "+carList.get(i).getavailability());
       System.out.println("--------------------------------------");
       i++;
      
           
    }
         if (carList.size()>0){
       System.out.println("[choose a number from the list to buy a car]");
       inI=in.nextInt();
       }
       
       if (inI<=carList.size()){
           if (carList.get(inI-1).getavailability().equals("Sold")){
               System.out.println("that car is sold");
           }
           else{
      System.out.println("Congratulations! you are now a proud owner of "+ carList.get(inI-1).getyear()+ " " +carList.get(inI-1).getmake()+" "+carList.get(inI-1).getmodel());
              setmake(carList.get(inI-1).getmake());
               setmodel(carList.get(inI-1).getmodel());
               setcondition(carList.get(inI-1).getcondition());
               setyear(carList.get(inI-1).getyear());
               setodometer(carList.get(inI-1).getodometer());
               setprice(carList.get(inI-1).getprice());   
               setavailability("Sold");
      x = new Car(getmake(),getmodel(),getcondition(),getavailability(),getyear(),getodometer(),getprice());
      carList.set(inI-1,x);
      in.nextLine();
           }
        }
        else
       {
       System.out.println("That listing isn't available");
       in.nextLine();
                }
    }
    }
     
     
     
     
  
     
      

    }
    
    


    
    

