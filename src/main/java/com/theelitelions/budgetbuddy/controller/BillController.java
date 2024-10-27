package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.bill.BillDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BillController {

    @Autowired
    private BillDao billDao;

    @GetMapping("/bill/get-all")
    public List<Bill> getAllBills(){
        return billDao.getAllBills();
    }

    @PostMapping("/bill/save")
    public Bill save(@RequestBody Bill bill){
        return billDao.save(bill);
    }

    @DeleteMapping("/bill/delete/{id}")
    public ResponseEntity<Void> deleteBillById(@PathVariable int id) {
        boolean isDeleted = billDao.deleteBillById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/bill/update/{id}")
    public ResponseEntity<Bill> updateBill(@PathVariable int id, @RequestBody Bill updatedBill) {
        Bill bill = billDao.updateBill(id, updatedBill);
        if (bill != null) {
            return ResponseEntity.ok(bill); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
