/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author MH
 */
public interface ProfileRepository extends JpaRepository<Profile, Object>{
    
}
