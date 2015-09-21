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
        if(list.contains(c)){
            throw new ClientException("This client is repeated.");
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
     * Method that sorts the list by number of visits.
     */
    public void sortByNumberOfVisits(){
        int i;
        boolean flag = true;
        Client aux;
         while(flag){
             flag = false;
             for(i=0;i<list.size();i++){
                 if(list.get(i).getNumVisits()<list.get(i+1).getNumVisits()){
                     aux = list.get(i);
                     list.set(i,list.get(i+1));
                     list.set(i+1,aux);
                     flag = true;
                 }
             }
         
         }
    }
}
