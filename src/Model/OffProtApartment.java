package Model;

/**
 * OffProtApartment class: Has the information about an official protected apartment.
 */
public class OffProtApartment extends Apartment {    
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
    
    
}
