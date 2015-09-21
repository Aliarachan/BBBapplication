package Model;

import Exceptions.ClientException;
import java.io.Serializable;

public class Data implements Serializable{
    
    private Catalog catalog;
    private Schedule schedule;
    private ClientList clientList;
    
     /**
     * Constructor of the class.
     */
    public Data(){
        catalog = new Catalog();
        schedule = new Schedule();
        clientList = new ClientList();
    }
    
    /**
     * Method that adds an apartment to the catalog.
     * @param a 
     */
    public void addApartment(Apartment a){
        catalog.addApartment(a);
    }
    
    /**
     * Method that adds an appointment to the schedule.
     * @param a 
     */
    public void addAppointment(Appointment a){
        schedule.addAppointment(a);
    }
    
    /**
     * Method that adds a client to the client list.
     * @param a 
     */
    public void addClient(Client c) throws ClientException{
        clientList.addClient(c);
    }
    
    /**
     * Method that removes an apartment from the catalog by object.
     * @param a 
     */
    public void removeApartment(Apartment a){
        catalog.removeApartment(a);
    }
    
    /**
     * Method that removes an apartment from the catalog by index.
     * @param n
     */
    public void removeApartment(int n){
        catalog.removeApartment(n);
    }
    
    /**
     * Method that removes an appointment from the schedule by item.
     * @param a 
     */
    public void removeAppointment(Appointment a){
        schedule.removeAppointment(a);
    }
    
    /**
     * Method that removes an appointment from the schedule by index.
     * @param n
     */
    public void removeAppointment(int n){
        schedule.removeAppointment(n);
    }
    
    /**
     * Method that removes a client from the client list by item.
     * @param c
     */
    public void removeClient(Client c){
        clientList.removeClient(c);
    }
    
     /**
     * Method that removes a client from the client list by index.
     * @param n
     */
    public void removeClient(int n){
        clientList.removeClient(n);
    }
    
    /**
     * Method that returns a client selected by index from the clientlist.
     * @param n
     * @return 
     */
    public Client getClient(int n){
        return clientList.getClientByIndex(n);
    }
    
    /**
     * Method that returns an apartment selected by index from the catalog.
     * @param n
     * @return 
     */
    public Apartment getApartment(int n){
        return catalog.getApartmentByIndex(n);
    }
    
    /**
     * Method that returns an appointment selected by index from the schedule.
     * @param n
     * @return 
     */
    public Appointment getAppointment(int n){
        return schedule.getAppointmentByIndex(n);
    }
    
    /**
     * Method that returns the catalog.
     * @return object catalog.
     */
    public Catalog getCatalog(){
        return this.catalog;
    }
    
    /**
     * Method that returns the schedule.
     * @return object schedule.
     */
    public Schedule getSchedule(){
        return this.schedule;
    }
    
    /**
     * Method that returns the client list.
     * @return object client list. 
     */
    public ClientList getClientList(){
        return this.clientList;
    }
    
}
