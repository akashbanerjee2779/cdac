package com.example.demo.dto;

import com.example.demo.entity.data.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDetailDTO {
    private Long id;
    private State state;
    private District district;
    private Market market;
    private Sample sample;
    private SampleCategory sampleCategory;
    private SampleSubCategory sampleSubCategory;
    private SuperCategory superCategory;
}
