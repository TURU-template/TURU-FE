package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class SleepRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private LocalDate date; // Tanggal tidur

    private int sleepDurationInHours; // Durasi tidur dalam jam

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSleepDurationInHours() {
        return sleepDurationInHours;
    }

    public void setSleepDurationInHours(int sleepDurationInHours) {
        this.sleepDurationInHours = sleepDurationInHours;
    }
}
