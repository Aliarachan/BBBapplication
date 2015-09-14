
package Model;


public class Apartment {
    
    private int dni;
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
     * @param dni 
     * @param address 
     * @param selling 
     * @param renting
     * @param monthly
     * @param totalPrice
     * @param inventory 
     */
    protected Apartment (int dni, String address, boolean selling, boolean 
            renting, int monthly, long totalPrice, String inventory) {
        
        this.dni = dni;
        this.address = address;
        this.selling = selling;
        this.renting = renting;
        this.monthly = monthly;
        this.totalPrice = totalPrice;
        this.inventory = inventory;
    }
    
    /**
     * setter of dni
     * @param dni 
     */
    public void setDNI(int dni) {
        this.dni = dni;
    }
    
    /**
     * getter of dni
     * @return 
     */
    public int getDNI() {
        return this.dni;
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
