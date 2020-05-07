package com.ldy.controller;

import com.ldy.dao.DepartmentDao;
import com.ldy.dao.EmployeeDao;
import com.ldy.entities.Department;
import com.ldy.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2020-05-06 12:02
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /**
     *查询全部员工
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    /**
     * 查询部门分类跳转到添加页面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String saveEmp(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departs",departments);
        return "/emp/add-emp";
    }

    /**
     * 查询部门分类跳转到添加页面
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String save(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/update")
    public String updateEmp(Model model, @RequestParam("id") Integer id){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departs",departments);
        return "/emp/update-emp";
    }

    /**
     * 修改页面
     * @param employee
     * @return
     */
    @PutMapping("/update")
    public String update(Employee employee){
        System.out.println("employee = " + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public String delete( @RequestParam("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
