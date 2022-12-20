package ru.courses.company;

public class Employee {
    private String name;
    private Department department;

    Employee(String name){
        this(name, null);
    }
    Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        if(department.getBoss()==null) return name + " работает в отделе " + department.getName();
        if(this.getName()==department.getBoss().getName()) return name + " начальник отдела " + department.getName();
        else
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().getName();
    }
}
