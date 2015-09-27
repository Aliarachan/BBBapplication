package Model;

import java.io.Serializable;

/**
 * OffProtApartment class: Has the information about an official protected apartment.
 */
public class OffProtApartment extends Apartment implements Serializable{    
    private long idNumber;
    
    public OffProtApartment(String address, long idNumber){
        super(address);
        this.idNumber = idNumber;
    }
    
    /**
     * setter of idNumber
     * @param idNumber 
     */
    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }
    
    /**
     * getter of idNumber
     * @return 
     */
    public long getIdNumber(){
        return this.idNumber;
    }
    
    /**
     * ToString method of the OffProtection Apartment class.
     * @return String information
     */
    @Override
    public String toString(){
        String s = "Offprotection Apartment. Offprotection code: " + Long.toString(idNumber)+ " | Address: " + super.getAddress();
        return s;
    }
}
