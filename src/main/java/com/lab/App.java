package com.lab;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.internal.SessionFactoryBuilderImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
		Metadata md=new MetadataSources().getMetadataBuilder(ssr).build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s= sf.openSession();
		Transaction t;
		
		
		
		
		// insert in studentDetails Table
		StudentDetails sd1= new StudentDetails();
		sd1.setSname("Yashu");
		sd1.setGender('F');
		sd1.setDept("cse");
		sd1.setProg("btech");
		sd1.setDob("2004-03-27");		
		sd1.setContno("9154669874");
		sd1.setGradStatus("yes");
		sd1.setCgpa((float) 9.8);
		sd1.setNoofBlacklogs(1);
		t = s.beginTransaction();
		s.save(sd1);
        t.commit();
        System.out.println("Data Inserted in StudentDetails");
        
        
        
		
        // update studentdetails table
        StudentDetails sd2= s.find(StudentDetails.class, 1);
        sd2.setSname("milli");
        t=s.beginTransaction();
        s.save(sd2);
        t.commit();
        System.out.println("data updated Succesfully");
        
        
        
		
		
		// delete studentdetails 1 row
        StudentDetails sd3=s.find(StudentDetails.class, 2);
        t=s.beginTransaction();
        s.delete(sd3);
        t.commit();
        System.out.println("data deleted Succesfully");
        
		
		
		
		 // fetch details by using id		 
		StudentDetails sd4= s.find(StudentDetails.class, 1);
		System.out.println(sd4.toString());
		
		
		
		
		//HQL query to display all student records with all columns.
		Query<StudentDetails> q= s.createQuery("select st from StudentDetails st",StudentDetails.class);
		List<StudentDetails> l=q.getResultList();
		for(StudentDetails sd5 : l) 
		{
			System.out.println(sd5);
		}
		
		
		
		
		
			/*
				//HQL query to display all student records with  specific columns.
				Query<Float> q= s.createQuery("select sd.cgpa from StudentDetails sd",Float.class);
				List<Float> l = q.getResultList();
				for (Float cgpa : l) {
				    System.out.println("CGPA: " + cgpa);
				}
			*/
		
		
		
		/*
		//HQL query to display only names of all students whose CGPA is greater than 7.
		Query<String> q=s.createQuery("select sd.sname from StudentDetails sd where sd.cgpa>7", String.class);
		List<String> l=q.getResultList();
		for(String sd:l) {
			System.out.println("Student name= "+sd);
		}
		*/
		
		
		
		//HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as well as named parameter (:) 
		/*
		 * Query<?> query1 =
		 * s.createQuery("delete from com.lab.StudentDetails where id = ?1");
		 * query1.setParameter(1, 5); // Replace '?' with the student ID int result1 =
		 * query1.executeUpdate();
		 * System.out.println("Number of rows affected (input parameter): " + result1);
		 */
		
		
	}

}
