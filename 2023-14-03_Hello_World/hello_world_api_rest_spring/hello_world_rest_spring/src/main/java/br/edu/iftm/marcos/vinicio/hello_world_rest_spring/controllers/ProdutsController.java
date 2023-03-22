package br.edu.iftm.marcos.vinicio.hello_world_rest_spring.controllers;

import br.edu.iftm.marcos.vinicio.hello_world_rest_spring.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api")
public class ProdutsController {
    @GetMapping("produts")
    public List<Product> listProducts(){
        var listProducts = new ArrayList<Product>();
        listProducts.add(new Product("Notebok", 1899.00));
        listProducts.add(new Product("Smart TV", 2899.00));
        listProducts.add(new Product("Smartphone", 3899.00));
        return listProducts;
    }
}
