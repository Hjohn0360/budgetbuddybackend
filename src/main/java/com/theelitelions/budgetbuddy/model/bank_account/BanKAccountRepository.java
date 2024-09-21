package com.theelitelions.budgetbuddy.model.bank_account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanKAccountRepository extends CrudRepository<BankAccount, Integer> {
}
