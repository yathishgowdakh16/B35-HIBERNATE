package org.tnsif.unidirecational;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver program
public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//added one student
		Student s=new Student();
		s.setRollno(101);
		s.setName("Yogesh");
		
		Address a=new Address();
		a.setPincode(440015);
		a.setCity("Nagpur");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		em.persist(s);
		System.out.println("Data is added");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	}package org.tnsf.bidirecational;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	//@Column(name="DeptId")
	private int deptid;
	private String deptname;
	
	/*@OneToMany(mappedBy="department")
	private Set<Employee>employee;*/
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
	
	
}