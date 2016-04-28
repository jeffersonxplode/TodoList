/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn;

/**
 *
 * @author italo
 */
public class Customer {
    
    String id;
    String password;
    
    public Customer loginCustomer(String userId, String password){
       
        if(userId.equals(this.id) && password.equals(this.password)){
            return this;
        }
        else return null;     
    }
}
