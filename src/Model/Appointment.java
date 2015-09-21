package Model;

import java.io.Serializable;
import java.util.Calendar;


/**
 * Appointment class: Has all the information about an appointment.
 * @author jose
 */
public class Appointment implements Serializable{
    
    private Calendar date;
    private int dni;
    private String address;
    private boolean done;
    
    /**
     * Constructor of the class Appointment 
     * @param date 
     * @param dni 
     * @param address 
     * @param done 
     */
    public Appointment (Calendar date, int dni, String address, boolean done){
        //These are all the camps required.
        this.date = date;
        this.dni = dni;
        this.address = address;
        this.done = done;
        
    }
    
    //As long as the atributes are private we need getter and setter functions 
    //to access them
    
    /**
     * setter of date
     * @param date 
     */
    public void setDate (Calendar date) {
        this.date = date;
    }
    
    /**
     * getter of date
     * @return Calendar date
     */
    public Calendar getDate(){
        return this.date;
    }
    
    /**
     * setter of DNI
     * @param dni 
     */
    public void setDNI (int dni) {
        this.dni = dni;
    }
    
    /**
     * getter of DNI
     * @return int dni
     */
    public int getDNI (){
        return this.dni;
    }
    
    /**
     * setter of address
     * @param address 
     */
    public void setAddress(String address){
        this.address = address;
    }
    
    /**
     * getter of address
     * @return String of the apartment's address
     */
    public String getAddress(){
        return this.address;
    }
    
    /**
     * setter of done
     * @param done 
     */
    public void setDone(boolean done){
        this.done = done;
    }
    
    /**
     * getter of done
     * @return boolean done
     */
    public boolean getDone(){
        return this.done;
    }
    
    /**
     * Method to check if two appointments are the same
     * @param a
     * @return true if the appointments are the same, false if they are different.
     */
    public boolean equals(Appointment a){
        return ((a.getDate().equals(this.date)) & (a.getAddress().equals(this.address)));
        
    }
    
    /**
     * toString returns the address of the apartment visited.
     * @return  String of the address of the apartment visited
     */
    @Override
    public String toString(){
        String s;
        s = "Day: " + date.get(Calendar.DAY_OF_MONTH) + " | Month:  " + date.get(Calendar.MONTH) + " | Year:  " + date.get(Calendar.YEAR) + " | Address: " + this.address;
        return s;
    }
}
