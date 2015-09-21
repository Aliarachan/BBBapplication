package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Catalog class: Has all the information about the apartments available.
 * @author jose
 */
public class Catalog implements Serializable{
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
    public boolean isEmpty(){
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
     * Method to sort the list of apartments by address.
     */
    public void sortByAddress () {
        list.sort(null);  
    }
    
    /**
     * Method to sort the list of apartments by the number of visits done.
     */
    public void sortByNumberOfVisits(){
        int i;
        boolean flag = true;
        Apartment aux;
         while(flag){
             flag = false;
             for(i=0;i<list.size();i++){
                 if(list.get(i).getNumVisits() <list.get(i+1).getNumVisits()){
                     aux = list.get(i);
                     list.set(i,list.get(i+1));
                     list.set(i+1,aux);
                     flag = true;
                 }
             }
         
         }
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
    