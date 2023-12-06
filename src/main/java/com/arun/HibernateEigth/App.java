package com.arun.HibernateEigth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Branch;
import com.arun.entity.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory sf=new Configuration().configure().buildSessionFactory();
         
         Session session=sf.openSession();
         
         Transaction tx=session.beginTransaction();
         
         
         Branch b=new Branch();
         
         b.setBid("T-1");
         b.setBranchName("Springers");
         b.setBlocation("Hyd");
         
         
         Students s1=new Students("Rohan","Hyd",b);
         Students s2=new Students("rakesj","HyBd",b);
         Students s3=new Students("raj","Hyd",b);
         
         
         session.save(s1);
         session.save(s2);
         session.save(s3);
         
         tx.commit();
         session.close();
         
         
   
         
         
    }
}
