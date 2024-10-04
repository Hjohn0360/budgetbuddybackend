package com.theelitelions.budgetbuddy.controller;


import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolio;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolioDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
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

}
