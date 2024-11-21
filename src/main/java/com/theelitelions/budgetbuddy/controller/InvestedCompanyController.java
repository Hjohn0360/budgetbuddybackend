package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.invested_company.InvestedCompany;
import com.theelitelions.budgetbuddy.model.invested_company.InvestedCompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @DeleteMapping("/investedcompany/delete/{id}")
    public ResponseEntity<Void> deleteBankAccountById(@PathVariable int id) {
        boolean isDeleted = investedCompanyDao.deleteInvestedCompanyById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/investedcompany/update/{id}")
    public ResponseEntity<InvestedCompany> updatedInvestedCompany(@PathVariable int id, @RequestBody InvestedCompany updatedInvestedCompany) {
        InvestedCompany investedCompany = investedCompanyDao.updateInvestedCompany(id,updatedInvestedCompany);
        if (investedCompany != null) {
            return ResponseEntity.ok(investedCompany); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
