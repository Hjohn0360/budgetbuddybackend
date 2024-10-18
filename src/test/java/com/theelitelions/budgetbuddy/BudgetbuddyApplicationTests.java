package com.theelitelions.budgetbuddy;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.bill.BillDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BudgetbuddyApplicationTests {

	@Autowired
	//private UserDao userDao;
	//private AppDao appDao;
	//private BudgetDao budgetDao;
	//private YearlyReportDao yearlyReportDao;
	//private BankAccountDao bankAccountDao;
	//private InvestmentPortfolioDao investmentPortfolioDao;
	private BillDao billDao;


	//The test won't run if it's commented out

/*
	//@Test
	void addUserTest() {
		User user = new User();
		user.setFirst_name("Sabrina");
		user.setLast_name("Lang");
		user.setAge(22);
		user.setUsername("CSabrina96");
		userDao.save(user);
	}

	@Test
	void getAllUsersThenDeleteThem(){
		List<User> users = userDao.getAllUsers();
		for(User user : users){
			userDao.delete(user);
		}
	}

 */




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
		yearlyReport.setAnnual_amount_made(150000);
		yearlyReport.setAmount_made_from_investments(15000);
		yearlyReport.setAnnual_amount_saved(60000);
		yearlyReport.setAnnual_amount_spent(35000);
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
/*
	//@Test
	void addBankAccountTest(){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBank_connected(true);
		bankAccount.setAccount_number(12568439);
		bankAccount.setRouting_number(9128474);
		bankAccount.setBank_name("Chase");
		bankAccount.setMonthly_earnings(32871.51);
		bankAccount.setEncryption("Asymmetric");
		bankAccountDao.save(bankAccount);
	}

	//@Test
	void getAllBankAccountsThenDeleteThem(){
		List<BankAccount> bankAccounts = bankAccountDao.getAllBankAccounts();
		for (BankAccount bankAccount : bankAccounts){
			bankAccountDao.delete(bankAccount);
		}
	}

 */
/*
	//@Test
	void addInvestmentPortfolioTest() {
		InvestmentPortfolio investmentPortfolio = new InvestmentPortfolio();
		investmentPortfolio.setUser_id(23);
		investmentPortfolio.setTotal_annual_return(55.2);
		investmentPortfolio.setCompany_id(11);
		investmentPortfolioDao.save(investmentPortfolio);
	}

	@Test
	void getAllInvestmentPortfoliosThenDeleteThem(){
		List<InvestmentPortfolio> investmentPortfolios = investmentPortfolioDao.getAllInvestmentPortfolios();
		for(InvestmentPortfolio investmentPortfolio : investmentPortfolios){
			investmentPortfolioDao.delete(investmentPortfolio);
		}
	}

 */

	//@Test
	void addBillTest() {
		Bill bill = new Bill();
		bill.setName("Crunchy Roll");
		bill.setPrice(14.99);
		bill.setAutomatic_payments_on(false);
		bill.setRecurring_payment(true);
		billDao.save(bill);
	}

	@Test
	void getAllBillsThenDeleteThem(){
		List<Bill> bills = billDao.getAllBills();
		for(Bill bill : bills){
			billDao.delete(bill);
		}
	}


}
