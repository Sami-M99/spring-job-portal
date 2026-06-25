package com.sami.jobportal_demo.service.impl;

import com.sami.jobportal_demo.dto.CompanyDto;
import com.sami.jobportal_demo.entity.Company;
import com.sami.jobportal_demo.repository.CompanyRepository;
import com.sami.jobportal_demo.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

//    @Autowired   // Optional
//    public CompanyServiceImpl(CompanyRepository companyRepository) {
//        this.companyRepository = companyRepository;
//    }

//    @Override
//    public List<Company> getAllCompanies() {
//        return companyRepository.findAll();
//    }

    @Override
    public List<CompanyDto> getAllCompanies() {
        List<Company> companyList =companyRepository.findAll();
        return companyList.stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private CompanyDto transformToDto(Company company) {
        return new CompanyDto(company.getId(), company.getName(), company.getLogo(),
                company.getIndustry(), company.getSize(), company.getRating(),
                company.getLocations(), company.getFounded(), company.getDescription(),
                company.getEmployees(), company.getWebsite(), company.getCreatedAt());
    }
}
