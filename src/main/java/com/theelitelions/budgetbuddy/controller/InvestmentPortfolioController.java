package com.theelitelions.budgetbuddy.controller;


import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolio;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolioDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class InvestmentPortfolioController {
    @Autowired
    private InvestmentPortfolioDao investmentPortfolioDao;

    @GetMapping("/investmentPortfolio/get-all")
    public List<InvestmentPortfolio> getAllInvestmentPortfolios(){
        return investmentPortfolioDao.getAllInvestmentPortfolios();
    }

    @PostMapping("/investmentPortfolio/save")
    public InvestmentPortfolio save(@RequestBody InvestmentPortfolio investmentPortfolio){
        return investmentPortfolioDao.save(investmentPortfolio);
    }

    @DeleteMapping("/investmentPorfolio/delete/{id}")
    public ResponseEntity<Void> deleteInvestmentPortfolioById(@PathVariable int id) {
        boolean isDeleted = investmentPortfolioDao.deleteInvestmentPortfololioById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/investmentPortfolio/update/{id}")
    public ResponseEntity<InvestmentPortfolio> updateInvestmentPortfolio(@PathVariable int id, @RequestBody InvestmentPortfolio updatedInvestmentPortfolio) {
        InvestmentPortfolio investmentPortfolio = investmentPortfolioDao.updateInvestmentPortfolio(id, updatedInvestmentPortfolio);
        if (investmentPortfolio != null) {
            return ResponseEntity.ok(investmentPortfolio); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

}
