package ru.courses.company;

public class Department {
    private String name;
    private Employee boss;

    Department(String name){
        this(name, null);
    }
    Department(String name, Employee boss){
        this.name = name;
        setBossPrivate(boss);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getBoss() {
        return new Employee(boss.getName(), boss.getDepartment());
    }

    public void setBoss(Employee boss) {
        setBossPrivate(boss);
    }

    private void setBossPrivate(Employee boss) {
        if(boss==null) this.boss=null;
        else
        if (boss.getDepartment()!=this) throw new IllegalArgumentException("the boss has to work in his department");
        this.boss = boss;
    }

    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", boss=" + boss +
                '}';
    }
}