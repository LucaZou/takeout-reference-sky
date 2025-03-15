package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 根据给定的状态启用或禁用指定员工账号。
     *
     * @param status 员工状态，0表示禁用，1表示启用
     * @param id     员工ID
     * @return 返回操作结果
     */
    void startOrStop(Integer status, long id);

    /**
     * 根据员工ID查询员工信息
     *
     * @param id 员工ID
     * @return 员工信息
     */
    Employee getById(long id);

    /**
     * 更新员工信息
     * @param employeeDTO 员工信息
     */
    void update(EmployeeDTO employeeDTO);
}
