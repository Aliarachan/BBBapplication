package Model;

import Exceptions.ClientException;
import java.io.Serializable;
import java.util.ArrayList;

public class ClientList implements Serializable{
    private ArrayList<Client> list;
    
    /**
     * Constructor of the class.
     */
    public ClientList(){
         list = new ArrayList<Client>();
    }
    
    /**
     * Method that returns a client of the list selected by it's index.
     * @param n
     * @return 
     */
    public Client getClientByIndex(int n){
        return list.get(n-1);
    }
 
    /**
     * Method that adds a client to the current list.
     * @param c
     * @return 
     * @throws Exceptions.ClientException 
     */
    public boolean addClient(Client c) throws ClientException{
        int i;
        for(i=0;i<list.size();i++){
            if(c.equals(list.get(i))){
                throw new ClientException("This client is repeated.");
            }
        }
        return list.add(c);
    }
    
    /**
     * Method taht removes a client selected by client object.
     * @param c 
     */
    public void removeClient(Client c){
        list.remove(c);
    }
    
    /**
     * Method that removes a client selected by index.
     * @param n 
     */
    public void removeClient(int n){
        list.remove(n);
    }
    
    /**
     * Method that returns the number of the current clients.
     * @return 
     */
    public int clientNumber(){
        return list.size();
    }
    
    /**
     * Method that returns the array list of clients. 
     * @return 
     */
    public ArrayList getArrayList(){
        return this.list;
    }
    
    /**
     * Checks if the list has any elements.
     * @return boolean
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    /**
     * Method toString of the class.
     * @return 
     */
    @Override
    public String toString(){
        int i;
        String aux="";
        for(i=0;i<list.size();i++){
            aux = aux + list.get(i).toString() + "\n";
        }
        return aux;
    }
    
    /**
     * Method that checks if a client is in the current client list.
     * @param c
     * @return 
     */
    public boolean checkClientOnClientList(Client c){
        return list.contains(c);
    }
    
    /**
     * Searches through the list, founds a client given his DNI key and increments his number of visits.
     * @param DNI 
     */
    public void incrementClientVisit(long DNI){
        int i = 0;
        boolean found = false;
        while (i < list.size() && !found){
            if(list.get(i).getDNI() == DNI){
                found = true;
            } else {
                i++;
            }
        }
        list.get(i).incrementNumVisits();
    }
    
    /**
     * Method that sorts the list by number of visits. Bubblesort method.
     */
    public void sortByNumberOfVisits(){
        int i; 
        boolean flag = true; 
        Client aux;  
        //One element means that no sorting is needed
        if (list.size() > 1){   
            while(flag){
                flag = false;
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
}
