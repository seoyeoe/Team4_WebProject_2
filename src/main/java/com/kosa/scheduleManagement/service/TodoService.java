package com.kosa.scheduleManagement.service;

import com.kosa.scheduleManagement.dao.TodoDao;
import com.kosa.scheduleManagement.dto.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private SqlSession sqlsession;
    @Autowired
    public void setSqlsession(SqlSession sqlsession) {
        this.sqlsession = sqlsession;
    }
    public List<Todo> getTodoList() {
        List<Todo> todoList = null;
        try {
            TodoDao todoDao = sqlsession.getMapper(TodoDao.class);
            todoList = todoDao.getTodoList();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return todoList;
    }
    public boolean insertTodo(Todo todo) {
        boolean result = false;
        try {
            TodoDao todoDao = sqlsession.getMapper(TodoDao.class);
            todoDao.insertTodo(todo);
            result = true;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
