package com.theelitelions.budgetbuddy.model.investment_portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InvestmentPortfolioDao {
    @Autowired
    private InvestmentPortfolioRepository repository;

    public InvestmentPortfolio save(InvestmentPortfolio investmentPortfolio){
        return repository.save(investmentPortfolio);
    }

    //Gives a list of all the users
    public List<InvestmentPortfolio> getAllInvestmentPortfolios(){
        List<InvestmentPortfolio> investmentPortfolios = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(investmentPortfolios :: add);
        return investmentPortfolios;
    }

    // TODO -- Delete and Update methods(Keyron)
}
