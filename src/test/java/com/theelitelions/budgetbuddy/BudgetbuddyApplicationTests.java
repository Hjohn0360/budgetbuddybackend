package com.theelitelions.budgetbuddy;

import com.theelitelions.budgetbuddy.model.app.App;
import com.theelitelions.budgetbuddy.model.app.AppDao;
import com.theelitelions.budgetbuddy.model.budget.Budget;
import com.theelitelions.budgetbuddy.model.budget.BudgetDao;
import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserDao;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReport;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReportDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BudgetbuddyApplicationTests {

	@Autowired
	private UserDao userDao;
	//private AppDao appDao;
	//private BudgetDao budgetDao;
	//private YearlyReportDao yearlyReportDao;

	//The test won't run if it's commented out

	@Test
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


	/*
	//@Test
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


	 */

	/*
	//@Test
	void addBudgetTest(){
		Budget budget = new Budget();
		budget.setAmount_to_invest(200);
		budget.setSpending_limit(40);
		budget.setEmergency_fund(50);
		budget.setAmount_to_save(120);
		budgetDao.save(budget);
	}

	//@Test
	void getAllBudgetsThenDeleteThem(){
		List<Budget> budgets = budgetDao.getAllBudgets();
		for (Budget budget : budgets){
			budgetDao.delete(budget);
		}
	}

	 */

	/*
	//@Test
	void addYearlyReportTest(){
		YearlyReport yearlyReport = new YearlyReport();
		yearlyReport.setAnnuel_amount_made(150000);
		yearlyReport.setAmount_made_from_investments(15000);
		yearlyReport.setAnnuel_amount_saved(60000);
		yearlyReport.setAnnuel_amount_spent(35000);
		yearlyReport.setEnd_of_the_year(true);
		yearlyReportDao.save(yearlyReport);
	}

	//@Test
	void getAllYearlyReportsThenDeleteThem(){
		List<YearlyReport> yearlyReports = yearlyReportDao.getAllYearlyReports();
		for (YearlyReport yearlyReport : yearlyReports){
			yearlyReportDao.delete(yearlyReport);
		}
	}

	 */

}
