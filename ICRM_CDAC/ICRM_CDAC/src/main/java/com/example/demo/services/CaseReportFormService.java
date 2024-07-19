package com.example.demo.services;

import com.example.demo.dto.CaseReportFormDTO;
import com.example.demo.entity.casereportform.CaseReportForm;
import com.example.demo.entity.casereportform.LocationDetail;
import com.example.demo.exception.StateNotFound;
import com.example.demo.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CaseReportFormService {
    private final CaseReportFormRepository caseReportFormRepository;
    private final DistrictRepository districtRepository;
    private final LocationDetailRepository locationDetailRepository;
    private final MarketRepository marketRepository;
    private final SampleCategoryRepository sampleCategoryRepository;
    private final SampleRepository sampleRepository;
    private final SampleSubCategoryRepository sampleSubCategoryRepository;
    private final StateRepository stateRepository;
    private final SuperCategoryRepository superCategoryRepository;

    public CaseReportFormDTO saveResponse(CaseReportFormDTO dto) throws StateNotFound {
        log.info(dto.toString());
        var locationDetailDto = dto.getLocationDetail();

        // Check if entity is present
        var stateId = locationDetailDto.getState().getId();
        var state = stateRepository.findById(stateId).orElseThrow(() -> new StateNotFound(stateId));

        var districtId = locationDetailDto.getDistrict().getId();
        var district = districtRepository.findById(districtId).orElseThrow(() -> new RuntimeException("District not found"));

        if (district.getStateId() != stateId) throw new RuntimeException("District doesn't fall under state");

        var locationDetail = new LocationDetail();
        locationDetail.setState(state);
        locationDetail.setDistrict(district);
        locationDetail = locationDetailRepository.save(locationDetail);

        var caseReportForm = new CaseReportForm();
        caseReportForm.setLocationDetail(locationDetail);
        caseReportForm = caseReportFormRepository.save(caseReportForm);

        return caseReportForm.toDTO();
    }
}
