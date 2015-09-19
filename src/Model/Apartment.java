
package Model;

/**
 * Apartment class: Has all the information about an apartment
 * @author jose
 */
public class Apartment {
    
    private Client client;
    private String address;
    private boolean selling;
    private boolean renting;
    private int monthly;
    private long totalPrice;
    private String inventory;
            
    //Posible lista de clientes que estan interesados
    //Posible lista de clientes que han visitado el piso

    /**
     * Constructor of the class Apartment.
     * @param client
     * @param address 
     */
    public Apartment (Client client, String address) {    
        // These are the minimun attributes required.
        this.client = client;
        this.address = address;
    }
    
    //As long as the atributes are private we need getter and setter functions 
    //to access them
    
    
    //public void setClient(Client client) {
    //    this.client = client;
    //}
    
    /**
     * getter of client
     * @return Client 
     */
    public Client getClient() {
        return this.client;
    }
    
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
     * setter of inventory
     * @param inventory 
     */
    public void setInventory(String inventory){
        this.inventory = inventory;
    }
    
    /**
     * getter of inventory
     * @return String inventory
     */
    public String getInventory() {
        return this.inventory;
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
