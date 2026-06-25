package com.sami.jobportal_demo.service;

import com.sami.jobportal_demo.dto.CompanyDto;
import com.sami.jobportal_demo.entity.Company;

import java.util.List;

public interface ICompanyService {
//    List<Company> getAllCompanies();
    List<CompanyDto> getAllCompanies();
}
