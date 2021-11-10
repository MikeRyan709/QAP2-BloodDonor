package com.keyin.domain.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class BloodDonationAppointment {
        private int aptID;
        private LocalDate aptDate;
        private LocalTime aptTime;
        private LocalTime aptDuration;
        private String location;
        private String bloodType;
        private boolean fistTimeDonor;
        private int donorID;


        public BloodDonationAppointment(int aptID, LocalDate aptDate, LocalTime aptTime, LocalTime aptDuration, String location, String bloodType, boolean fistTimeDonor, int donorID) {
            this.aptID = aptID;
            this.aptDate = aptDate;
            this.aptTime = aptTime;
            this.aptDuration = aptDuration;
            this.location = location;
            this.bloodType = bloodType;
            this.fistTimeDonor = fistTimeDonor;
            this.donorID = donorID;
    }

    public int getAptID() {
        return aptID;
    }

    public void setAptID(int aptID) {
        this.aptID = aptID;
    }

    public LocalDate getAptDate() {
        return aptDate;
    }

    public void setAptDate(LocalDate aptDate) {
        this.aptDate = aptDate;
    }

    public LocalTime getAptTime() {
        return aptTime;
    }

    public void setAptTime(LocalTime aptTime) {
        this.aptTime = aptTime;
    }

    public LocalTime getAptDuration() {
        return aptDuration;
    }

    public void setAptDuration(LocalTime aptDuration) {
        this.aptDuration = aptDuration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isFistTimeDonor() {
        return fistTimeDonor;
    }

    public void setFistTimeDonor(boolean fistTimeDonor) {
        this.fistTimeDonor = fistTimeDonor;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }
}

