package com.company;

public class Teacher extends Person{
    private String faculty;
    private String subject;
    private int salary;

    public Teacher(String age, String name, String surname,String faculty,String subject,int salary) {
        super(age, name, surname);
        this.faculty=faculty;
        this.subject=subject;
        this.salary=salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int YearSalary(){
        return 12*salary;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age='" + getAge() + '\'' +
                ", gpa='" + faculty + '\'' +
                ", group='" +subject + '\'' +
                '}';
    }
}
