package com.example.demo.entity.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="m_district")
public class District {
    @Id
    @Column(name = "district_id")
    private int id;
    @Column(name = "state_id")
    private int stateId;
    private String district_name;
    private String district_code;
    private int center_id;
}
