package com.ltts.project.ems.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int attId;
    private int empId;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private String  status;

    

    public Attendance() {
    }
    public Attendance(int attId, int empId, LocalDateTime inTime, LocalDateTime outTime, String status) {
        this.attId = attId;
        this.empId = empId;
        this.inTime = inTime;
        this.outTime = outTime;
        this.status = status;
    }
    public int getAttId() {
        return attId;
    }
    public void setAttId(int attId) {
        this.attId = attId;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public LocalDateTime getInTime() {
        return inTime;
    }
    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }
    public LocalDateTime getOutTime() {
        return outTime;
    }
    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Attendance [attId=" + attId + ", empId=" + empId + ", inTime=" + inTime + ", outTime=" + outTime
                + ", status=" + status + "]";
    }
    
    
}
