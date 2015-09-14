package Model;



/**
 * Client class, has all the information needed to identify a BBB client.
 * @author aferrama10.alumnes
 */
public class Client {
    
    //Attributes are private so we can only access them through the getters/setters functions.
    private String name;
    private int number;
    private int dni;
    private String email;
    private String address;
    private String bankAccount;
    private boolean offertant;
    private boolean demandant;
    

    /**
     * Class constructor
     * @param name name of the client
     * @param number telephon number
     * @param dni dni identificator
     * @param email e-mail address
     * @param address phisic address
     * @param bankAccount number of the bank account
     */
    public Client(String name, int dni, int number){
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
    public int getNumber (){
        return this.number;
    }
    
    /**
     * Setter function for the client number
     * @param number 
     */
    public void setNumber(int number){
        this.number = number;
    }
    
    /**
     * Getter function for the client DNI
     * @return int DNI
     */
    public int getDNI(){
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
     * @param adress 
     */
    public void setAddress(String adress){
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
}
