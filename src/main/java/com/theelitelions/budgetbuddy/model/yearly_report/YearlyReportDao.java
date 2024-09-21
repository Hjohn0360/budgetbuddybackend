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

    //Gives a list of all the users
    public List<YearlyReport> getAllYearlyReports(){
        List<YearlyReport> yearlyReports = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(yearlyReports :: add);
        return yearlyReports;
    }

    public void delete(YearlyReport yearlyReport){
        repository.delete(yearlyReport);
    }
}
