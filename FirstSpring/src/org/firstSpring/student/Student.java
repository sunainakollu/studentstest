package org.firstSpring.student;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void displayInfo(){  
    System.out.println("Hello: "+name);  
    System.out.println("added change");
    System.out.println("Change class change");
}  
}
