package com.example.demo.entity.casereportform;

import com.example.demo.dto.LocationDetailDTO;
import com.example.demo.entity.data.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Entity
@Table(name = "location_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationDetail {
    static {
        modelMapper = new ModelMapper();
    }

    private static ModelMapper modelMapper;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;

    @ManyToOne
    @JoinColumn(name = "sample_id")
    private Sample sample;

    @ManyToOne
    @JoinColumn(name = "sample_category_id")
    private SampleCategory sampleCategory;

    @ManyToOne
    @JoinColumn(name = "sample_sub_category_id")
    private SampleSubCategory sampleSubCategory;

    @ManyToOne
    @JoinColumn(name = "super_category_id")
    private SuperCategory superCategory;

    public LocationDetailDTO toDTO() {
        return modelMapper.map(this, LocationDetailDTO.class);
    }
}
