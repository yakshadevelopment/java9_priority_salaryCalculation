package edu.yaksha.salaryCalculation;

public class Employee {
	
	private Integer id;
	private String name;
	private String grade;
	private Integer basic;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, String grade, Integer basic) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.basic = basic;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getBasic() {
		return basic;
	}
	public void setBasic(Integer basic) {
		this.basic = basic;
	}
	


}
