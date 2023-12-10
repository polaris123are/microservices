package org.emsi.Client.Controller;

import org.emsi.Client.Entities.Client;
import org.emsi.Client.Reposetory.ClientReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

        @Autowired
        ClientReposetory clientRepository ;
        @GetMapping("/clients")
        public List findallclients(){
            return clientRepository.findAll();
        }
        @GetMapping("/clients/{id}")
        public Client findaclientbyid (@PathVariable Long id) throws Exception{

            return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistnt"));

        }}


