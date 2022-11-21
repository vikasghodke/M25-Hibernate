package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInhertanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create an emp
		
		Employee e=new Employee();
		e.setEmpID(45);
		e.setName("vikas");
		e.setSalary(45677);
		em.persist(e);
		
		//create and employee
		Employee e1=new Employee();
		e1.setEmpID(87);
		e1.setName("african");
		e1.setSalary(8888.8);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setEmpID(45);
		m.setName("riya");
		m.setSalary(4556);
		m.setDeptname("HR");
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
		
		
		

	}

}
