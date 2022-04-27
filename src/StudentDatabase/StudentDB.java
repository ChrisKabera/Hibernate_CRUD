/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDatabase;

import StudentModel.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;






/**
 *
 * @author GRACE
 */
public class StudentDB {

    public StudentDB() {
    }
    
    public void  saveStudent(Student st1){
    
    Configuration conf= new Configuration().configure().addAnnotatedClass(Student.class);
    
    
    Session session=conf.buildSessionFactory().openSession();
    
    session.getTransaction().begin();
    session.save(st1);
    
    session.getTransaction().commit();
    session.close();
    }
    // Display
    public List<Student> getStudents(){
    Configuration conf= new Configuration().configure().addAnnotatedClass(Student.class);
    
    
    Session session=conf.buildSessionFactory().openSession();
    
    session.getTransaction().begin(); 
    
        Query qr=session.createQuery("from studentHib");
        
        List<Student> ls= new ArrayList<>();
        
        ls=qr.list();
     return ls;
    }
    // Update
    public void updateStudent(Student st1){
     Configuration conf= new Configuration ().configure().addAnnotatedClass(Student.class);
    
    
    Session session=conf.buildSessionFactory().openSession();
    
    session.getTransaction().begin();
    session.update(st1);
    
    session.getTransaction().commit();
    session.close();
    
    }
    // Delete
    public void DeleteStudent(Student st1){
    Configuration conf= new Configuration ().configure().addAnnotatedClass(Student.class);
    
    
    Session session=conf.buildSessionFactory().openSession();
    
    session.getTransaction().begin();
    session.delete(st1);
    
    session.getTransaction().commit();
    session.close();
        
    }
    public Student getStudentById(String id){
    Configuration conf= new Configuration ().configure().addAnnotatedClass(Student.class);
    Student st= new Student();
    
    Session session=conf.buildSessionFactory().openSession();
    
    session.getTransaction().begin();
    st=(Student) session.get(Student.class,id);
    
    session.close();
     return st;   
    }
}
