package Model;

import java.util.ArrayList;
import java.util.Calendar;

public class Schedule {
    private ArrayList<Appointment> list;
    
    /**
     * Constructor of the class.
     */
    public Schedule(){
        list =  new ArrayList<Appointment>();
    }
    
    /**
     * Method that returns an appointment of the list selected by it's index.
     * @param n
     * @return 
     */
    public Appointment getAppointmentByIndex(int n){
        return list.get(n);
    }
    
    /**
     * Method that add an appointment to the current list.
     * @param a
     * @return 
     */
    public boolean addAppointment(Appointment a){
        return list.add(a);
    }
    
    /**
     * Method that remove an appointment selected by appointment object.
     * @param a 
     */
    public void removeAppointment(Appointment a){
        list.remove(a);
    }
    
    /**
     * Method that remove an appointment selected by index.
     * @param n 
     */
    public void removeAppointment(int n){
        list.remove(n);
    }
    
    /**
     * Method that return the number of the current appointments.
     * @return 
     */
    public int numberOfAppointments(){
        return list.size();
    }
    
    /**
     * Method toString of the class.
     * @return 
     */
    @Override
    public String toString(){
        int i;
        String aux = "";
        for(i=0;i<list.size();i++){
            aux = aux + list.get(i).toString() + "\n";
        }
        return aux;
    }
    
    /**
     * Method that return an arraylist of appointments wich date is tomorrow.
     * @return 
     */
    public ArrayList<Appointment> getTomorrowAppointments(){
        ArrayList<Appointment> aux = new ArrayList<Appointment>();
        int i;
        Calendar cal = Calendar.getInstance();
        for(i=0;i<list.size();i++){
            if((list.get(i).getDate().get(Calendar.DAY_OF_MONTH)-1)==cal.get(Calendar.DAY_OF_MONTH)&&
                    (list.get(i).getDate().get(Calendar.MONTH))==cal.get(Calendar.MONTH)&&
                    (list.get(i).getDate().get(Calendar.YEAR))==cal.get(Calendar.YEAR)){
                aux.add(list.get(i));
            }
        }
        return aux;
    }
}
