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
    private String inTime;
    private String outTime;
    private String  status;

    

    public Attendance() {
    }
    public Attendance(int attId, int empId, String inTime, String outTime, String status) {
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
    public String getInTime() {
        return inTime;
    }
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }
    public String getOutTime() {
        return outTime;
    }
    public void setOutTime(String outTime) {
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
