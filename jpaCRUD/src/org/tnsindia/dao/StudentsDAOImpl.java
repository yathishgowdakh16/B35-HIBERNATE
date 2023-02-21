package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Student;

public class StudentsDAOImpl implements StudentDAO {
private EntityManager em;
	
	

	public StudentDAOImpl() {
		em=JPAUtil.getEntityManager();
	}

	
	//CRUD
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	public void updateStudent(Student student) {
		em.merge(student);
		
	}

	@Override
	public void deleteStudent(Student student) {
		em.remove(student);
		
	}

	public Student getStudentByID(int RollNo) {
		Student student=em.find(Student.class,RollNo);
		return student;
	}

	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
