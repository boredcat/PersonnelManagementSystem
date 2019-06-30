package com.evan.sm.dao;

import com.evan.sm.entity.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department department);
    void delete(Integer id);
    void update(Department department);
    Department selectById(Integer id);
    List<Department> selectAll();
}
