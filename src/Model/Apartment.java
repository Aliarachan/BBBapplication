
package Model;


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
    protected Apartment (Client client, String address) {    
        this.client = client;
        this.address = address;
    }
    
    //
    /**
     * setter of client
     * @param client
     */
    //
    
    //public void setClient(Client client) {
    //    this.client = client;
    //}
    
    /**
     * getter of client
     * @return 
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
     * @return 
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
     * @return 
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
     * @return 
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
     * @return 
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
     * @return 
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
     * @return 
     */
    public String getInventory() {
        return this.inventory;
    }
    
    /**
     * toString returns the address of the apartment.
     * @return 
     */
    @Override
    public String toString () {
        return this.address;
    }
}
