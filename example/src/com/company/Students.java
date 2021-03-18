package com.company;

public class Students extends Person{
    private String gpa;
    private String group;

    public Students(String age, String name, String surname, String gpa,String group) {
        super(age, name, surname);
        this.gpa = gpa;
        this.group=group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }



    @Override
    public String toString() {
        return "Students{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age='" + getAge() + '\'' +
                ", gpa='" + gpa + '\'' +
                ", group='" +group + '\'' +
                '}';
    }
}
