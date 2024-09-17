package com.theelitelions.budgetbuddy;

import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BudgetbuddyApplicationTests {

	@Autowired
	private UserDao userDao;

	//The test won't run if it's commented out
	//@Test
	void addUserTest() {
		User user = new User();
		user.setFirst_name("");
		user.setLast_name("");
		user.setAge(0);
		user.setUsername("");
		userDao.save(user);
	}



	//@Test
	void getAllUsersThenDeleteThem(){
		List<User> users = userDao.getAllUsers();
		for(User user : users){
			userDao.delete(user);
		}
	}

}
