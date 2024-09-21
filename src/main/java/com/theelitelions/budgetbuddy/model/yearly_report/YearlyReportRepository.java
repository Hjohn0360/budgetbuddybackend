package com.theelitelions.budgetbuddy.model.yearly_report;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearlyReportRepository extends CrudRepository<YearlyReport, Integer> {
}
