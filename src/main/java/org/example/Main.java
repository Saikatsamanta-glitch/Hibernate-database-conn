package org.example;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hibernate Practical Code");

        student_detail sd = null;

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student_detail.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
// n reason for this to not work : transactions
        Transaction tx = session.beginTransaction(); // create / updating or deleting
        try{
//            session.save(sd);
            sd = (student_detail) session.get(student_detail.class, 2);
            System.out.println(sd.getFirst_Name()+sd.getLast_Name()+sd.getId());
            tx.commit();
        }catch(Exception err){
            System.out.println("Error");
            tx.rollback();
        }

    }
}