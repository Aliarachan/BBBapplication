/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aferrama10.alumnes
 */
public class Client {
    
    protected String name;
    protected int number;
    protected int dni;
    protected String email;
    protected String address;
    protected String bankAccount;
    protected boolean offers;
    protected boolean demands;
    
    //Lista pisos
    
    protected void Client(String name, int number, int dni, String email, String address, String bankAccount){
        this.name = name;
        this.number = number;
        this.dni = dni;
        this.email = email;
        this.address = address;
        
        
    }
    
    protected void setName(String name){
        this.name = name;
    }
    
    
    
}
