package br.edu.iftm.marcos.vinicio.hello_world_rest_spring.controllers;

import br.edu.iftm.marcos.vinicio.hello_world_rest_spring.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @GetMapping("/clients")
    public List<Client> clients(){
        var listClients = new ArrayList<Client>();
        listClients.add(new Client("Marcos Vinício", 36));
        listClients.add(new Client("Daniela", 28));
        listClients.add(new Client("Marília", 38));
        listClients.add(new Client("Vinícius Eduardo", 13));
        listClients.add(new Client("Marina Novais", 11));
        return listClients;
    }

}
