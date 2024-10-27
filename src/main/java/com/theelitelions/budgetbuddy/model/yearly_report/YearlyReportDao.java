package com.theelitelions.budgetbuddy.model.yearly_report;

import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class YearlyReportDao {

    @Autowired
    private YearlyReportRepository repository;

    public YearlyReport save(YearlyReport yearlyReport){
        return repository.save(yearlyReport);
    }

    // NOTE -- Gives a list of all the Yearly Reports
    public List<YearlyReport> getAllYearlyReports(){
        List<YearlyReport> yearlyReports = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(yearlyReports :: add);
        return yearlyReports;
    }


    public boolean deleteYearlyReportById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public YearlyReport updateYearlyReport(int id, YearlyReport updatedYearlyReport) {
        return repository.findById(id)
                .map(yearlyReport -> {
                    yearlyReport.setEnd_of_the_year(updatedYearlyReport.isEnd_of_the_year()); // Updates the fields
                    yearlyReport.setAmount_made_from_investments(updatedYearlyReport.getAmount_made_from_investments());
                    yearlyReport.setAnnual_amount_invested(updatedYearlyReport.getAnnual_amount_invested());
                    yearlyReport.setAnnual_amount_made(updatedYearlyReport.getAnnual_amount_made());
                    yearlyReport.setAnnual_amount_saved(updatedYearlyReport.getAnnual_amount_saved());
                    yearlyReport.setAnnual_amount_spent(updatedYearlyReport.getAnnual_amount_spent());
                    yearlyReport.setBank_account_id(updatedYearlyReport.getBank_account_id());
                    yearlyReport.setWhat_if_savings_amount(updatedYearlyReport.getWhat_if_savings_amount());
                    return repository.save(yearlyReport);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
