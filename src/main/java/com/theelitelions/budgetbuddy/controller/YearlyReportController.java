package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReport;
import com.theelitelions.budgetbuddy.model.yearly_report.YearlyReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class YearlyReportController {

    @Autowired
    private YearlyReportDao yearlyReportDao;

    @GetMapping("/yearlyReport/get-all")
    public List<YearlyReport> getAllYearlyReports(){
        return yearlyReportDao.getAllYearlyReports();
    }

    @PostMapping("/yearlyReport/save")
    public YearlyReport save(@RequestBody YearlyReport yearlyReport){
        return yearlyReportDao.save(yearlyReport);
    }

    @DeleteMapping("/yearlyReport/delete/{id}")
    public ResponseEntity<Void> deleteYearlyReportById(@PathVariable int id) {
        boolean isDeleted = yearlyReportDao.deleteYearlyReportById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/yearlyReport/update/{id}")
    public ResponseEntity<YearlyReport> updateYearlyReport(@PathVariable int id, @RequestBody YearlyReport updatedYearlyReport) {
        YearlyReport yearlyReport = yearlyReportDao.updateYearlyReport(id, updatedYearlyReport);
        if (yearlyReport != null) {
            return ResponseEntity.ok(yearlyReport); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
