package com.example.springapi20220828.repository;

import com.example.springapi20220828.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Employee employee){
        entityManager.persist(employee);

    }

    public List<Employee> listAllEmployee() {
        Query query = entityManager.createQuery("select employee from Employee employee", Employee.class);

        return query.getResultList();
    }

    public Employee getEmployee(Integer id){
        return entityManager.find(Employee.class, id);
    }

    public List<Employee> serchByFirstName(String firstName) {
        Query query = entityManager.createQuery(
                "select e from Employee e where e.firstName = :firstName", Employee.class);
        query.setParameter("firstName",firstName);

        return query.getResultList();
    }
}
