/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author italo
 */
@Controller
public class LoginController {
  /*  @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login(){
        return "login";
    }
*/
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String verifyLogin(@RequestParam String userId, 
            @RequestParam String password, HttpSession session) {
        
        Customer customer = new Customer();
        customer.id ="italo";
        customer.password="123";        
        Customer c = customer.loginCustomer(userId, password);
        if(c == null){
            return "Login";
        }
        session.setAttribute("LoggedInUser", c);
        return "redirect:/";
    }
    
}
