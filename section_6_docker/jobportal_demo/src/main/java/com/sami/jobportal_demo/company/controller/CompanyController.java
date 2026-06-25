package com.sami.jobportal_demo.company.controller;

import com.sami.jobportal_demo.dto.CompanyDto;
import com.sami.jobportal_demo.entity.Company;
import com.sami.jobportal_demo.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
//@CrossOrigin(origins = {"http://localhost:5173"})
public class CompanyController {
    private final ICompanyService companyService;

//    @Autowired // Optional
//    public CompanyController(ICompanyService companyService) {
//        this.companyService = companyService;
//    }

//    @GetMapping(version = "1.0")
//    public ResponseEntity<List<Company>> getAllCompanies() {
//        List<Company> companyList = companyService.getAllCompanies();
//        return ResponseEntity.ok().body(companyList);
//    }

    @GetMapping(version = "1.0")
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        List<CompanyDto> companyList = companyService.getAllCompanies();
        return ResponseEntity.ok().body(companyList);
    }

}
