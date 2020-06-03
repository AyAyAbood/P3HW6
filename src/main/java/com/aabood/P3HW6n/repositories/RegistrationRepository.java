/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aabood.P3HW6n.repositories;

import com.aabood.P3HW6n.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AboOod_shbika99
 */
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{
    
}
