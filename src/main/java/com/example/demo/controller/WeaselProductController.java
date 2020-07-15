package com.example.demo.controller;

import com.example.demo.VO.Product;
import com.example.demo.dao.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class WeaselProductController {
    @Autowired
    ProductManager pm;

    @GetMapping("/getall")
    public List<Product> getAll(){
        return pm.getDatas();
    }

    @GetMapping("/add")
    public List<Product> addProductByGet(@RequestParam(value = "name", defaultValue = "World") String name,
                                    @RequestParam(value = "price", defaultValue = "0") int price){
        pm.addProduct(new Product(0, name, price));
        return pm.getDatas();
    }

    @PostMapping("/add")
    public List<Product> addProductByPost(@RequestBody Product p){
        pm.addProduct(p);
        return pm.getDatas();
    }

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable int id){
        return pm.getProduct(id);
    }

    @GetMapping("/del/{id}")
    public List<Product> delProduct(@PathVariable int id){
        pm.removeProduct(id);
        return pm.getDatas();
    }
}
