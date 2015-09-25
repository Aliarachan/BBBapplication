package Model;

import java.io.Serializable;
import java.util.ArrayList;

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
        // The sort method access to compareTo to order the list of the flats. As 
        // we have overwritten the compareTo method in the Apartment class to order 
        // the flats by their address, there is no need any kind of Comparator.
        list.sort(null);  
    }
    
    /**
     * Method to sort the list of apartments by the number of visits done.
     */
    public void sortByNumberOfVisits(){
        int i; 
        boolean flag = true; //Inicializamos el boolean flag a true.
        Apartment aux; // Creamos una variable de tipo Apartment.
        
        //If the size of the list is 1 or less, there is no need to order the list.
        if (list.size() > 1){   
            //Since the flag variable is true it will be enter in the loop.
            while(flag){
                flag = false;
                // We will iterate over the flat list.
                for(i=0; i<list.size()-1; i++){
                    // If the number of visits of the i flat is less than the next
                    // flat, we will change the position of the flats in the list.
                    if(list.get(i).getNumVisits() < list.get(i+1).getNumVisits()){
                        aux = list.get(i);
                        list.set(i,list.get(i+1));
                        list.set(i+1,aux);
                        flag = true;                                 
                    }

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
    