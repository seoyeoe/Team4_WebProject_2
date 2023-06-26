package com.kosa.scheduleManagement.dto;

import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;

@Data
public class Todo {
    private Long id;
    private String title;
    private String startDate;
    private String endDate;
}
