package com.theelitelions.budgetbuddy.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// NOTE -- The type for the repositories are the type of the variable 'id'
// NOTE -- so since the user id variable is of the int type, that means we use 'Integer' here
public interface UserRepository extends CrudRepository<User, Integer> {
}
