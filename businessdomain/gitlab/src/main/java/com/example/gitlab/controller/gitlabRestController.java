/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gitlab.controller;

import com.example.gitlab.repository.gitlabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping("/url")
public class gitlabRestController {
       @Autowired
        gitlabRepository gitlabRepository;
}
