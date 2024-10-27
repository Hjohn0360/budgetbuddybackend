package com.theelitelions.budgetbuddy.model.invested_company;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.bill.BillRepository;
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
}
