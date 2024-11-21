package com.example.demo.service;

import com.example.demo.model.SleepRecord;
import com.example.demo.repository.SleepRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SleepRecordService {

    @Autowired
    private SleepRecordRepository sleepRecordRepository;

    public void addSleepRecord(Long userId, double hoursSlept, LocalDate date) {
        SleepRecord record = new SleepRecord();
        record.setUserId(userId);
        record.setSleepDurationInHours((int) hoursSlept); // Pastikan durasi tidur dalam jam adalah integer
        record.setDate(date);
        sleepRecordRepository.save(record); // Perbaiki kesalahan nama repository
    }

    public int getWeeklySleepDuration(Long userId, LocalDate startDate) {
        LocalDate endDate = startDate.plusDays(6); // Rentang waktu untuk minggu
        List<SleepRecord> records = sleepRecordRepository.findByUserIdAndDateBetween(userId, startDate, endDate);

        return records.stream()
                      .mapToInt(SleepRecord::getSleepDurationInHours)
                      .sum();
    }
}
