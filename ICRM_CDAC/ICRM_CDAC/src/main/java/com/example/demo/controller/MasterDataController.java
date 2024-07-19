package com.example.demo.controller;

import com.example.demo.services.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class MasterDataController {

    @Autowired
    MasterDataService masterDataService;

    @GetMapping("/getCategory")
    public ResponseEntity<?> getCategory(){
        return new ResponseEntity<>(masterDataService.getAllCategoryService(), HttpStatus.OK);
    }
}
