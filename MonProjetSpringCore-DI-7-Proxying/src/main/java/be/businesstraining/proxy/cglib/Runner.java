package be.businesstraining.proxy.cglib;

import be.businesstraining.dao.DepartmentDao;
import be.businesstraining.domain.Department;
import org.springframework.cglib.proxy.Enhancer;

public class Runner {
    public static void main(String[] args) {
        System.out.println(" ===== PROXYING using CGLIB =====");
        Enhancer enhancer  = new Enhancer();
        enhancer.setCallback(new DepartmentDaoMethodInterceptor());
        enhancer.setSuperclass(DepartmentDao.class);
        DepartmentDao departmentDao = (DepartmentDao) enhancer.create();
        departmentDao.save(new Department());
        Department department = departmentDao.findById(5);

    }
}
