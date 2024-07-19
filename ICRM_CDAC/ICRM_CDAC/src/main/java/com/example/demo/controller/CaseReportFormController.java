package com.example.demo.controller;

import com.example.demo.dto.CaseReportFormDTO;
import com.example.demo.services.CaseReportFormService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("case-report-form")
public class CaseReportFormController {
    private final CaseReportFormService caseReportFormService;

    @PostMapping
    private ResponseEntity<?> saveReport(@RequestBody CaseReportFormDTO caseReportFormDTO) {
        try {
            return ResponseEntity.ok(caseReportFormService.saveResponse(caseReportFormDTO));
        } catch (Exception e) {
            log.error("Error while saving report: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
