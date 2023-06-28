package com.kosa.scheduleManagement.dao;

import java.util.List;

import com.kosa.scheduleManagement.dto.Emp;

public interface EmpDao {
	//특정 부서 소속 사원리스트
	List<Emp> getEmpList(int deptno);
	
	
}
