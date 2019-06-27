package test1;

import java.io.Serializable;

public class Peson implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9186292742263742838L;
	private String name;
	private Integer age;
	public Peson(String name,Integer age) {
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Peson [name=" + name + ", age=" + age + "]";
	}
	
}
