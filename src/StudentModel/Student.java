/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentModel;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GRACE
 */
@Entity(name="studentHib") 
public class Student {
    
    @Id
   private String Id;
   private String Name;
   private String Gender;
   private String DoB;
   private String Phone;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Student(String Id, String Name, String Gender, String DoB, String Phone) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.DoB = DoB;
        this.Phone = Phone;
    }

    public Student() {
    }
    
    
}
