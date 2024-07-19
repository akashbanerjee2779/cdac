package com.example.demo.entity.casereportform;

import com.example.demo.dto.CaseReportFormDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "case_report_form")
public class CaseReportForm {
    static {
        modelMapper = new ModelMapper();
    }

    private static ModelMapper modelMapper;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private LocationDetail locationDetail;

    public CaseReportFormDTO toDTO() {
        return modelMapper.map(this, CaseReportFormDTO.class);
    }
}
