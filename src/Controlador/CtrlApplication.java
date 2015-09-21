/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Exceptions.ClientException;
import Model.Apartment;
import Model.Appointment;
import Model.Catalog;
import Model.Client;
import Model.ClientList;
import Model.Data;
import Model.Schedule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author aferrama10.alumnes
 */
public class CtrlApplication {
    private Data data;
    
    
    public CtrlApplication(){
        data = new Data();
    }
    
    /**
     * Inter method that calls data to add a certain apartment.
     * @param a apartment to add
     */
    public void addApartment(Apartment a){
        data.addApartment(a);
    }
    
    /**
     * Inter method that calls data to remove a certain apartment.
     * @param a apartment to remove
     */
    public void removeApartment(Apartment a){
        data.removeApartment(a);
    }
    
    /**
     * Inter method that calls data to give a certain apartment.
     * @param n given index where the apartment is located in the list
     * @return Apartment object
     */
    public Apartment getApartment(int n){
        return data.getApartment(n);
    }
    
    /**
     * Inter method that calls data to add a certain appointment.
     * @param a object appointment to add.
     */
    public void addAppointment(Appointment a){
        data.addAppointment(a);
    }
    
    /**
     * Inter method that calls data to remove a certain appointment.
     * @param a object appointment to remove.
     */
    public void removeAppointment(Appointment a){
        data.removeAppointment(a);
    }
    
    /**
     * Inter method that calls data to give a certain appointment given the index.
     * @param n index where the appointment is located in the list.
     * @return Appointment object
     */
    public Appointment getAppointment(int n){
        return data.getAppointment(n);
    }
    
    /**
     * Inter method that calls data to add a certain client.
     * @param c object client to add.
     */
    public void addClient(Client c) throws ClientException{
        data.addClient(c);
    }
    
    /**
     * Inter method that calls data to remove a certain client.
     * @param c  object client to remove
     */
    public void removeClient(Client c){
        data.removeClient(c);
    }
    
    /**
     * Inter method that calls data to give a certain client.
     * @param n index in the list where the client is located.
     * @return client object.
     */
    public Client getClient(int n){
        return data.getClient(n);
    }
    
    /**
     * Inter method that calls data to give its catalog.
     * @return object catalog
     */
    public Catalog getCatalog(){
        return data.getCatalog();
    }
    
    /**
     * Inter method that calls data to give its schedule.
     * @return object schedule 
     */
    public Schedule getSchedule(){
        return data.getSchedule();
    }
    
    /**
     * Inter method that calls data to give its client list.
     * @return object client list
     */
    public ClientList getClientList(){
        return data.getClientList();
    }
    
    /**
     * Method that allows the application to save the data collected. 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void saveData () throws FileNotFoundException, IOException{
        File fi = new File("data.txt");
        FileOutputStream fout = new FileOutputStream(fi);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(this); 
        fout.close();
        
    }
    
    /**
     * Method that allows the application to load the data collected. 
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Data loadData() throws FileNotFoundException, IOException, ClassNotFoundException{
        File fi = new File ("data.txt");
        FileInputStream fin = new FileInputStream(fi);
        ObjectInputStream ois = new ObjectInputStream(fin);  
        Data datas = (Data) ois.readObject();  
        fin.close();
        return datas;
        
    }
}
