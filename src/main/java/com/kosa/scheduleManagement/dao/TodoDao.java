package com.kosa.scheduleManagement.dao;

import com.kosa.scheduleManagement.dto.Todo;
import org.mybatis.spring.annotation.MapperScan;

import java.sql.SQLException;
import java.util.List;

public interface TodoDao {
    List<Todo> getTodoList() throws SQLException;
    void insertTodo(Todo todo) throws SQLException;
}
