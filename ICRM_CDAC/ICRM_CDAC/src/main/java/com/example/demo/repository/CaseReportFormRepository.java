package com.example.demo.repository;

import com.example.demo.entity.casereportform.CaseReportForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseReportFormRepository extends JpaRepository<CaseReportForm, Long> {
}
