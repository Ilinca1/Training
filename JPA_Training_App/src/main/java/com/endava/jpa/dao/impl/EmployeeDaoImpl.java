package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.EmployeeDao;
import com.endava.jpa.model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	private String QUERY_FIND_EMPLOYEE_BY_CITY = "Select E from Employee E where e.city = :city_name";

	public Employee find(int id) {
		return entityManager.find(Employee.class, id);
	}

	public List<Employee> find(String cityName) {
		return entityManager.createQuery(QUERY_FIND_EMPLOYEE_BY_CITY)
		.setParameter("city_name",cityName).getResultList();
	}

	public void save(Employee toBeSaved) {

		entityManager.persist(toBeSaved);
	}

	public void update(Employee toBeUpdated) {

		entityManager.merge(toBeUpdated);
	}

	public void remove(Employee toBeRemoved) {

		entityManager.remove(entityManager.merge(toBeRemoved));
	}
}
