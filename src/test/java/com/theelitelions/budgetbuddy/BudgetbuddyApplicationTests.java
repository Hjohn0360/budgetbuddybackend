package com.theelitelions.budgetbuddy;

import com.theelitelions.budgetbuddy.model.app.App;
import com.theelitelions.budgetbuddy.model.app.AppDao;
import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BudgetbuddyApplicationTests {

	@Autowired
	//private UserDao userDao;
	private AppDao appDao;

	//The test won't run if it's commented out
/*
	//@Test
	void addUserTest() {
		User user = new User();
		user.setFirst_name("John");
		user.setLast_name("Harris");
		user.setAge(21);
		user.setUsername("Hjohn0360");
		userDao.save(user);
	}

	//@Test
	void getAllUsersThenDeleteThem(){
		List<User> users = userDao.getAllUsers();
		for(User user : users){
			userDao.delete(user);
		}
	}

 */
	@Test
	void addAppTest(){
		App app = new App();
		app.setName("DoorDash");
		app.setSpending_limit(50);
		app.setIgnore_limit_amount(25);
		app.setBlocked(true);
		app.setSpending_limit_exceeded(true);
		appDao.save(app);
	}

	//@Test
	void getAllAppsThenDeleteThem(){
		List<App> apps = appDao.getAllApps();
		for (App app : apps){
			appDao.delete(app);
		}
	}

}
