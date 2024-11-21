package com.example.demo.repository;

import com.example.demo.model.SleepRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;



@Repository
public interface SleepRecordRepository extends JpaRepository<SleepRecord, Long> {
    List<SleepRecord> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
}
