package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReport;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YearlyReportController {

    @Autowired
    private YearlyReportDao yearlyReportDao;

    @GetMapping("/yearReport/get-all")
    public List<YearlyReport> getAllYearlyReports(){
        return yearlyReportDao.getAllYearlyReports();
    }

    @PostMapping("/yearlyReport/save")
    public YearlyReport save(@RequestBody YearlyReport yearlyReport){
        return yearlyReportDao.save(yearlyReport);
    }
}
