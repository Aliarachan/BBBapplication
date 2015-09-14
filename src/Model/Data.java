package Model;

public class Data {
    
    private Catalog catalog;
    private Schedule schedule;
    private ClientList clientList;
    
    public Data(){
        catalog = new Catalog();
        schedule = new Schedule();
        clientList = new ClientList();
    }
    
    
}
