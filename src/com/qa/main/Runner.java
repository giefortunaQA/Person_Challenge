package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		Storage record=new Storage();
		Person person1=new Person("Nikita",24,"Dungeon Master");
		Person person2=new Person("Gie",22,"Chef");
		Person person3=new Person("Peter",23,"Doctor");
		Person person4=new Person("Peprah",23, "Lawyer");
		Person person5=new Person("Emmy",23,"Teacher");
		Person person6=new Person("Nick",25,"Trainer");
		record.people.add(person1);
		record.people.add(person2);
		record.people.add(person3);
		record.people.add(person4);
		record.people.add(person5);
		record.people.add(person6);
		System.out.println(record.retrieve("Gie"));
//		record.retrieveAll();
		
		
	
	}

}
