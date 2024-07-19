package com.example.demo.services;

import com.example.demo.entity.data.SampleCategory;
import com.example.demo.repository.SampleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MasterDataService {

    @Autowired
    SampleCategoryRepository sampleCategoryRepository;

    public HashMap<String,?> getAllCategoryService(){
        HashMap<String, ArrayList<SampleCategory>> hashMap = new HashMap<>();
        ArrayList<SampleCategory> sampleCategories = (ArrayList<SampleCategory>) sampleCategoryRepository.findAll();
        hashMap.put("Category", sampleCategories);
        return hashMap;
    }
}
