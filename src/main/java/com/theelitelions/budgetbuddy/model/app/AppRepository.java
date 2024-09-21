package com.theelitelions.budgetbuddy.model.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends CrudRepository<App, Integer> {
}
