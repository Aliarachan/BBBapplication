package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Catalog class: Has all the information about the apartments available.
 * @author jose
 */
public class Catalog {
    private ArrayList <Apartment> list;
    
    /**
     * Constructor of the class Catalog
     */
    public Catalog (){
        list = new ArrayList <Apartment>();
    }
    
    /**
     * Method to return the apartment asociated to the index passed as a parameter.
     * @param index
     * @return 
     */
    public Apartment getApartmentByIndex (int index){
        return this.list.get(index);
    }
    
    /**
     * Method to remove the apartment associated to the index passed as a parameter.
     * @param index 
     */
    public void removeApartment(int index){
        this.list.remove(index);
    }
    
    /**
     * Method to remove the apartment passed as a parameter.
     * @param apartment 
     */
    public void removeApartment(Apartment apartment){
        this.list.remove(apartment);
    }
    
    /**
     * Method to check if the catalog is empty.
     * @return 
     */
    public boolean listIsEmpty(){
        return this.list.isEmpty();
    }
    
    /**
     * Method to add the apartment passed as a parameter if this is not in the list.
     * @param apartment 
     */
    public void addApartment(Apartment apartment){
        if (!(this.list.contains(apartment))){
            this.list.add(apartment);
        }
    }
    
    /**
     * Method to return the list of apartments.
     * @return Arraylist
     */
    public ArrayList getArrayList(){
        return this.list;
    }
    
    /**
     * Method to return the list of apartments sorted by address.
     * @return Arraylist
     */
    
    //REVISAR
    public ArrayList sortByAddress () {
        Collections.sort(list, null);
        return list;
        
    }
    
    /**
     * ToString returns the list of apartments available.
     * @return String of the list of apartments available.
     */
    @Override
    public String toString(){
        int increment = 0;
        String aux = "";
        
        for (increment = 0; increment >= list.size(); increment++){
            aux = aux + list.get(increment).toString() + "/n";
        }
        return aux;
    }
    
}
    