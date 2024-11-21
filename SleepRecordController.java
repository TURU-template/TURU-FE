package com.example.demo.controller;

import com.example.demo.model.SleepRecord;
import com.example.demo.service.SleepRecordService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/sleep")
public class SleepRecordController {

    @Autowired
    private SleepRecordService service;

    @PostMapping("/add")
    public ResponseEntity<String> addSleepRecord(@RequestParam Long userId, @RequestParam double hoursSlept) {
        LocalDate today = LocalDate.now();
        service.addSleepRecord(userId, hoursSlept, today);
        return ResponseEntity.ok("Data tidur berhasil ditambahkan");
    }

}

