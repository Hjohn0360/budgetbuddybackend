package com.theelitelions.budgetbuddy.model.invested_company;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.bill.BillRepository;
import com.theelitelions.budgetbuddy.model.budget.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestedCompanyDao {

    @Autowired
    private InvestedCompanyRepository repository;

    public InvestedCompany save(InvestedCompany InvestedCompany) {
        return repository.save(InvestedCompany);
    }

    public List<InvestedCompany> getAllInvestedCompanies(){
        List<InvestedCompany> investedCompany = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(investedCompany :: add);
        return investedCompany;
    }

    // TODO -- Delete and update methods(Keyron)
    public boolean deleteInvestedCompanyById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public InvestedCompany updateInvestedCompany(int id, InvestedCompany updatedInvestedCompany) {
        return repository.findById(id)
                .map(investedCompany -> {
                    investedCompany.setName(updatedInvestedCompany.getName());
                    investedCompany.setDividend_value(updatedInvestedCompany.getDividend_value());// Updates the field
                    investedCompany.setDividend_yield(updatedInvestedCompany.getDividend_yield());
                    investedCompany.setAnnual_return(updatedInvestedCompany.getAnnual_return());
                    investedCompany.setProjected_annual_return(updatedInvestedCompany.getProjected_annual_return());
                    investedCompany.setInvested_amount(updatedInvestedCompany.getInvested_amount());
                    return repository.save(investedCompany);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
