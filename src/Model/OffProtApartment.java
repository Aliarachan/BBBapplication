/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jlamasro7.alumnes
 */
public class OffProtApartment extends Apartment {    
    private long idNumber;
    
    public OffProtApartment(String address, long idNumber){
        super(address);
        this.idNumber = idNumber;
    }
}
