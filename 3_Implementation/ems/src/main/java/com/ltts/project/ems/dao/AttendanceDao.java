package com.ltts.project.ems.dao;

import com.ltts.project.ems.model.Attendance;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AttendanceDao extends JpaRepository<Attendance,Integer>{
    
    List<Attendance> findAttendanceByEmpId(int empId);
}
