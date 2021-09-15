package com.ltts.project.ems.dao;

import com.ltts.project.ems.model.Attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AttendanceDao extends JpaRepository<Attendance,Integer>{
    
}
