package org.fuys.ownutil.instance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Animal implements Comparable<Animal>{
	
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
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
	@Override
	public String toString() {
		return "name:" + this.name + ",age:" + this.age;
	}
	@Override
	public int compareTo(Animal o) {
		if(o == null){
			return -1;
		}
		if(this == o){
			return 0;
		}
		if(this.age > o.age){
			return 1;
		}else if(this.age < o.age){
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
	}
	public boolean equals(Animal animal) {
		if(animal==null){
			return false;
		}
		if(animal==this){
			return true;
		}
		if(this.name.equals(animal.name)
				&& this.age == animal.age){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class SetInstance {
	
	public static void main(String[] args) {
		// set
		Set<Animal> set = new HashSet<>();
		set.add(new Animal("Spike",3));
		set.add(new Animal("Spike",3));
		set.add(new Animal("Tom",3));
		set.add(new Animal("Jerry",2));
		System.out.println(set);
		set.remove(new Animal("Spike",3));
		System.out.println(set);
		
		System.out.println("******************************");
		// set
		set = new TreeSet<>();
		set.add(new Animal("Spike",3));
		set.add(new Animal("Spike",3));
		set.add(new Animal("Tom",3));
		set.add(new Animal("Jerry",2));
		System.out.println(set);
		set.remove(new Animal("Spike",3));
		System.out.println(set);
		
		System.out.println("******************************");
		
		// list
		List<Animal> list = new ArrayList<>();
		list.add(new Animal("Spike",3));
		list.add(new Animal("Spike",3));
		list.add(new Animal("Tom",3));
		list.add(new Animal("Jerry",2));
		System.out.println(list);
		list.remove(new Animal("Spike",3));
		System.out.println(list);
	}

}
