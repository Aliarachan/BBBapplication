package Model;

import java.util.ArrayList;

public class ClientList {
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
     * Method that add a client to the current list.
     * @param c
     * @return 
     */
    public boolean addClient(Client c){
        return list.add(c);
    }
    
    /**
     * Method taht remove a client selected by client object.
     * @param c 
     */
    public void removeClient(Client c){
        list.remove(c);
    }
    
    /**
     * Method that remove a client selected by index.
     * @param n 
     */
    public void removeClient(int n){
        list.remove(n);
    }
    
    /**
     * Method that return the number of the current clients.
     * @return 
     */
    public int clientNumber(){
        return list.size();
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
}
