package com.theelitelions.budgetbuddy.model.invested_company;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.invested_company.InvestedCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestedCompanyRepository extends CrudRepository<InvestedCompany, Integer>  {
}
