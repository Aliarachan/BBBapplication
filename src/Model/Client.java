package Model;

import java.io.Serializable;



/**
 * Client class, has all the information needed to identify a BBB client.
 * @author aferrama10.alumnes
 */
public class Client implements Serializable{
    
    //Attributes are private so we can only access them through the getters/setters functions.
    private String name;
    private long number;
    private long dni;
    private String email;
    private String address;
    private String bankAccount;
    private boolean offertant;
    private boolean demandant;
    private int dayOfBirth;
    private int monthOfBirth;
    private int numVisits;
    

    /**
     * Class constructor
     * @param name name of the client
     * @param number telephon number
     * @param dni dni identificator
     */
    public Client(String name, long dni, long number){
        //These are the minimum required camps.
        this.name = name;
        this.number = number;
        this.dni = dni;
               
    }
    /**
     * Getter function for the client name
     * @return string name
     */
    public String getName (){
        return this.name;
    }
    
    /**
     * Setter function for the client name
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Getter function for the client number
     * @return int number
     */
    public long getNumber (){
        return this.number;
    }
    
    /**
     * Setter function for the client number
     * @param number 
     */
    public void setNumber(long number){
        this.number = number;
    }
    
    /**
     * Getter function for the client DNI
     * @return int DNI
     */
    public long getDNI(){
        return this.dni;
    }
    
    /**
     * Setter function for the client DNI
     * @param dni 
     */
    public void setDNI(int dni){
       this.dni = dni;
   }
    
    /**
     * Getter function for the client email
     * @return String e-mail
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * Setter function for the client email
     * @param email 
     */
    public void setEmail(String email){
        this.email = email;
    }
    
    /**
     * Getter function for the client address
     * @return String address
     */
    public String getAddress(){
        return this.address;
    }
    
    /**
     * Setter function for the client address
     * @param address 
     */
    public void setAddress(String address){
        this.address = address;
    }
    
    /**
     * Getter function for the client bank account
     * @return String bank account
     */
    public String getAccount(){
        return this.bankAccount;
    }
    
    /**
     * Setter function for the client bank account
     * @param bankAccount 
     */
    public void setAccount(String bankAccount){
        this.bankAccount = bankAccount;
    }
    
    /**
     * Getter function for the state "offertant". 
     * @return boolean, true if the client offers an appartment; otherwise, false.
     */
    public boolean getOffertant(){
        return this.offertant;
    }
    
    /**
     * Setter function for the state "offertant"
     * @param offertant
     */
    public void setOffertant(boolean offertant){
        this.offertant = offertant;
    }
    
    /**
     * Getter function for the "demandant" state.
     * @return boolean, true if the clien is interested in some appartment; otherwise, false.
     */
    public boolean getDemandant(){
        return this.demandant;
    }
    
    /**
     * Setter function for the "demandant" state.
     * @param demandant 
     */
    public void setDemandant(boolean demandant){
        this.demandant = demandant;
    }
    
    /**
     * Getter function for the number of visits.
     * @return 
     */
    public int getNumVisits(){
        return numVisits;
    }
    
    /**
     * Setter function for the number of visits.
     * @param n number of visits
     */
    public void setNumVisits(int n){
        this.numVisits = n;
    }
    
    /**
     * Increments the number of visits done by this client.
     */
    public void incrementNumVisits(){
        this.numVisits++;
    }
    
    /**
     * Getter function for the client's day of birtdhay.
     * @return day of birth
     */
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    
    /**
     * Setter function for the day of birthday
     * @param dayOfBirth
     */
    public void setDayOfBirth (int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    
    /**
     * Getter function for the month of birthday.
     * @return month of birth
     */
    public int getMonthOfBirth(){
        return monthOfBirth;
    }
    
    /**
     * Setter function for the month of birthday.
     * @param monthOfBirth
     */
    public void setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    
    /**
     * Compare function for clients based on their name.
     * @param c client  to be compared.
     * @return 0 if the name of the client is equal, -1 if the name of the Client 1 is lexicographically less than the name of the Client 2; otherwise, returns 1.
     */
    public int compareTo(Client c){
        return this.getName().compareToIgnoreCase(c.getName());
    }
    
    /**
     * Equals function for clients based on their DNI. Two clients are equal when their DNI is the same.
     * @param c Client 
     * @return boolean true if the clients are equal, false otherwise.
     */
    public boolean equals(Client c){
        return (this.getDNI() == c.getDNI());
    }
    
    /**
     * toString method
     * @return string object with a little information about the client
     */
    @Override
    public String toString(){
        String s;
        String strDNI = Long.toString(this.dni);
        String strNumber = Long.toString(this.number);
        s = this.name + " | DNI: " + strDNI + " | Telephon number: " + strNumber;
        return s;
    }
}
