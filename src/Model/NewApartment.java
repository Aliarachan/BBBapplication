package Model;

import java.io.Serializable;

/**
 * NewApartment class: Has all the information about the new apartments.
 */
public class NewApartment extends Apartment implements Serializable{
    private Client client;
    private float profit;
    
    public NewApartment(Client client, String address) {
        super(address);
        this.client = client;
    }
    
    /**
     * getter of client
     * @return Client
     */
    public Client getClient(){
        return this.client;
    }
    
    /**
     * setter of profit
     * @param profit 
     */
    public void setProfit(float profit){
        this.profit = profit;
    }
    
    /**
     * getter of profit
     * @return double profit
     */
    public float getProfit(){
        return this.profit;
    }
    
    public String toString(){
        String s = "New Apartment. Owner Name: " + client.getName() + " | Owner DNI: " + Long.toString(client.getDNI()) + " | Address: " + super.getAddress();
        return s;
    }
    
}
