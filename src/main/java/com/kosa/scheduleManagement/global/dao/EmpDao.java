package com.kosa.scheduleManagement.global.dao;

import java.util.List;

import com.kosa.scheduleManagement.global.dto.Emp;

public interface EmpDao {
	//특정 부서 소속 사원리스트
	List<Emp> getEmpList(int deptno);
	
	
}
