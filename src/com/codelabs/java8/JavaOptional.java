package com.codelabs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaOptional {
	
	public static void main(String[] args)
    {
		List<Person> PersonList = createPersonList();
        Optional<Person> PersonOpt = findPerson(PersonList,"Adam");
        if(PersonOpt.isPresent()) {
            Person Person = PersonOpt.get();
            System.out.println("Person name: "+Person.getName());
        }else {
            System.out.println("There is no Person with name Adam");
        }
    }
 
	public static Optional<Person> findPerson(List<Person> PersonList,String name)
    {
        for(Person e:PersonList)
        {
            if(e.getName().equalsIgnoreCase(name))
            {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }
	
    public static List<Person> createPersonList()
    {
        List<Person> PersonList=new ArrayList<>();
 
        Person e1=new Person("John",21);
        Person e2=new Person("Martin",22);
        Person e3=new Person("Mary",31);
        Person e4=new Person("Stephan",18);
        Person e5=new Person("Gary",26);
 
        PersonList.add(e1);
        PersonList.add(e2);
        PersonList.add(e3);
        PersonList.add(e4);
        PersonList.add(e5);
 
        return PersonList;
 
    }
 
}

class Person {
    private String name;
    private int age;
 
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
