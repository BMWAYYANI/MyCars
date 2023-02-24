/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bassamwayyani
 */


// this is a super class
public class Car {
    // OOP which means private variables
    private String make;
    private String model;
    private String condition;
    private String availability;
    private int year;
    private int odometer;
    private int price;
    
    //construtor because we are using one arraylist
    Car(String make,String model, String condition,String availability, int year, int odometer, int price){
        setmake(make);
        setmodel(model);
        setcondition(condition);
        setyear(year);
        setodometer(odometer);
        setprice(price);  
        setavailability(availability);
        
        // setters
    }
    public void setmake(String make){
        this.make=make;
    
    }
    public void setmodel(String model){
        this.model=model;
    
    }
    public void setcondition(String condition){
        this.condition=condition;
    }
    public void setavailability(String availability){
        this.availability=availability;
    }
    
    
    public void setyear(int year){
        this.year=year;
    
    }
    public void setodometer(int odometer){
        this.odometer=odometer;
    
    }
    public void setprice(int price){
        this.price=price;

    }
    
    
    
    // getters
    
    public String getmake(){
    return make;}
    
    public String getmodel(){
    return model;}
    
    public String getcondition(){
    return condition;}
    
     public String getavailability(){
    return availability;}
    
    public int getyear(){
    return year;}
    
    public int getodometer(){
    return odometer;}
    
    public int getprice(){
    return price;}
}
