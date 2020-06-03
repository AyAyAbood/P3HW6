/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aabood.P3HW6n.controllers;

import com.aabood.P3HW6n.models.Registration;
import com.aabood.P3HW6n.repositories.RegistrationRepository;
import com.aabood.P3HW6n.repositories.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AboOod_shbika99
 */
@RestController
public class MainController {
    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    RegistrationRepository registrationRepository;
    
    @RequestMapping("/")
    public String index(){
        return String.format("%s", "man");
    }
    
    @RequestMapping("/showall")
    public String ShowAll(){
        List<Registration> registrations = registrationRepository.findAll();
        String str = "";
        for(Registration e: registrations)
            str += e + "<br>";
        return String.format("%s", str);
    }
}
