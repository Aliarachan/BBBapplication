
package Model;

import java.io.Serializable;

/**
 * Apartment class: Has all the information about an apartment
 * @author jose
 */
public class Apartment implements Serializable {
    
    private String address;
    private boolean selling;
    private boolean renting;
    private int monthly;
    private long totalPrice;
    private int numVisits;
            
    /**
     * Constructor of the class Apartment.
     * @param address 
     */
    public Apartment (String address) {    
        // These are the minimun attributes required.
        this.address = address;
    }
    
    //Since the atributes are private we need getter and setter functions 
    //to access them
    
    
    /**
     * setter of the address
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * getter of the address
     * @return String of the phisic address
     */
    public String getAddress() {
        return this.address;
    }
    
    /**
     * setter of selling
     * @param selling 
     */
    public void setSelling (boolean selling) {
        this.selling = selling;
    }
    
    /**
     * getter of selling
     * @return boolean selling
     */
    public boolean getSelling() {
        return this.selling;
    }
    
    /**
     * setter of renting
     * @param renting 
     */
    public void setRenting(boolean renting){
        this.renting = renting;
    }
    
    /**
     * getter of renting
     * @return boolean renting
     */
    public boolean getRenting() {
        return this.renting;
    }
    
    /**
     * setter of monthly
     * @param monthly 
     */
    public void setMonthly(int monthly) {
        this.monthly = monthly;
    }
    
    /**
     * getter of monthly
     * @return int monthly
     */
    public int getMonthly(){
        return this.monthly;
    }
    
    /**
     * setter of totalPrice
     * @param totalPrice 
     */
    public void setTotalPrice(long totalPrice){
        this.totalPrice = totalPrice;
    }
    
    /**
     * getter of totalPrice
     * @return long totalPrice
     */
    public long getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
     * setter of numVisits
     * @param numVisits 
     */
    public void setNumVisits(int numVisits){
        this.numVisits = numVisits;
    }
    
    /**
     * getter of numVisits
     * @return 
     */
    public int getNumVisits(){
        return this.numVisits;
    }
    
    /**
     * Increments the number of visits of this apartment.
     */
    public void incrementNumVisits(){
        this.numVisits++;
    }
    
    /**
     * Overwrite compareTo in order to compare two apartments by address.
     * @param apart Apartment to compare with.
     * @return int 
     */
    public int compareTo(Apartment apart) {
        // Compare two flats by address.
        return this.address.compareTo(apart.getAddress());
    }
    
    
    /**
     * toString returns the address of the apartment.
     * @return String of the apartment's address.
     */
    @Override
    public String toString () {
        return this.address;
        
    }
}
