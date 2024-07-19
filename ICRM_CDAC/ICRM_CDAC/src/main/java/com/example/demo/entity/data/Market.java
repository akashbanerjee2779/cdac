package com.example.demo.entity.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="m_market")
public class Market {
    @Id
    private int market_id;
    private int state_id;
    private int district_id;
    private String market_name;


}
