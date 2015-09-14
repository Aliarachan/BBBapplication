package Model;

import java.util.Calendar;


public class Appointment {
    
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
    protected Appointment (Calendar date, int dni, String address, boolean done){
        this.date = date;
        this.dni = dni;
        this.address = address;
        this.done = done;
        
    }
    
    /**
     * setter of date
     * @param date 
     */
    public void setDate (Calendar date) {
        this.date = date;
    }
    
    /**
     * getter of date
     * @return 
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
     * @return 
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
     * @return 
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
     * @return 
     */
    public boolean getDone(){
        return this.done;
    }
    
    /**
     * toString returns the address of the apartment visited.
     * @return 
     */
    @Override
    public String toString(){
        return this.address;
    }
}
