package Model;

public class Data {
    
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
     * Method that add an apartment to the catalog.
     * @param a 
     */
    public void addApartment(Apartment a){
        catalog.addApartmetn(a);
    }
    
    /**
     * Method that add an appointment to the schedule.
     * @param a 
     */
    public void addAppointment(Appointment a){
        schedule.addAppointment(a);
    }
    
    /**
     * Method that add a client to the client list.
     * @param a 
     */
    public void addClient(Client c){
        clientList.addClient(c);
    }
    
    /**
     * Method that remove an apartment from the catalog by object.
     * @param a 
     */
    public void removeApartment(Apartment a){
        catalog.removeApartment(a);
    }
    
    /**
     * Method that remove an apartment from the catalog by index.
     * @param n
     */
    public void removeApartment(int n){
        catalog.removeApartment(n);
    }
    
    /**
     * Method that remove an appointment from the schedule by item.
     * @param a 
     */
    public void removeAppointment(Appointment a){
        schedule.removeAppointment(a);
    }
    
    /**
     * Method that remove an appointment from the schedule by index.
     * @param n
     */
    public void removeAppointment(int n){
        schedule.removeAppointment(n);
    }
    
    /**
     * Method that remove a client from the client list by item.
     * @param c
     */
    public void removeClient(Client c){
        clientList.removeClient(c);
    }
    
     /**
     * Method that remove a client from the client list by index.
     * @param n
     */
    public void removeClient(int n){
        clientList.removeClient(n);
    }
    
    /**
     * Method that return a client selected by index from the clientlist.
     * @param n
     * @return 
     */
    public Client getClient(int n){
        return clientList.getClientByIndex(n);
    }
    
    /**
     * Method that return an apartment selected by index from the catalog.
     * @param n
     * @return 
     */
    public Apartment getApartment(int n){
        return catalog.getApartmentByIndex(n);
    }
    
    /**
     * Method that return an appointment selected by index from the schedule.
     * @param n
     * @return 
     */
    public Appointment getAppointment(int n){
        return schedule.getAppointmentByIndex(n);
    }
    
}
