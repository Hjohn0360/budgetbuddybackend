package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.invested_company.InvestedCompany;
import com.theelitelions.budgetbuddy.model.invested_company.InvestedCompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class InvestedCompanyController {

    @Autowired
    private InvestedCompanyDao investedCompanyDao;

    @GetMapping("/investedCompany/get-all")
    public List<InvestedCompany> getAllInvestedCompanies(){
        return investedCompanyDao.getAllInvestedCompanies();
    }

    @PostMapping("/investedCompany/save")
    public InvestedCompany save(@RequestBody InvestedCompany investedCompany){
        return investedCompanyDao.save(investedCompany);
    }
}
