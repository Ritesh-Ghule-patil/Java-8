package com.ritesh.model;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isValidPerson(Person p){
        if(p.age>0 && p.age<105)
            return true;
        else
            return false;
    }

    public String ageType(Person p){
        if(p.getAge()>0 && p.age<=18){
            return "Children";
        }
        else if(p.getAge()>18 && p.age<=25){
            return "Teen Ager";
        }
        else if(p.getAge()>25 && p.age<=45){
            return "Adult";
        }
        else if(p.getAge()>45 && p.age<=60){
            return "mid Senior";
        }
        else if(p.getAge()>60 && p.age<=105){
            return "Senior Citizen";
        }
        else
            return "Invalid Age";
    }

    public boolean isInvalidPerson(Person p){
        return p.age <= 0 || p.age > 105;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
