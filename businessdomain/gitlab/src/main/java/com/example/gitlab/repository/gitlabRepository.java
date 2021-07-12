/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gitlab.repository;

import com.example.gitlab.entities.gitlab;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author diego
 */
public interface gitlabRepository extends CrudRepository<gitlab, Long> {
    
}
