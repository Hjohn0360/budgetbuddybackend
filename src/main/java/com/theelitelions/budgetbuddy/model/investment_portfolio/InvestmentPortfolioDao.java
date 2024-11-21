package com.theelitelions.budgetbuddy.model.investment_portfolio;

import com.theelitelions.budgetbuddy.model.user.User;
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

    public boolean deleteInvestmentPortfololioById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    public InvestmentPortfolio updateInvestmentPortfolio(int id, InvestmentPortfolio updatedInvestmentPortfolio) {
        return repository.findById(id)
                .map(investmentPortfolio -> {
                    investmentPortfolio.setUser_id(updatedInvestmentPortfolio.getUser_id()); // Updates the fields
                    investmentPortfolio.setTotal_annual_return(updatedInvestmentPortfolio.getTotal_annual_return());
                    investmentPortfolio.setCompany_id(updatedInvestmentPortfolio.getCompany_id());
                    return repository.save(investmentPortfolio);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
