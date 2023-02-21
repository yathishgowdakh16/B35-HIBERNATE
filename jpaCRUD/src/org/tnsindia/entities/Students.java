package org.tnsindia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	//private data members
	//getters and setters method
       @Id
		private int RollNo;
		private String Name;
		public int getRollNo() {
			return RollNo;
		}
		public void setRollNo(int rollNo) {
			RollNo = rollNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		
		}
}
	