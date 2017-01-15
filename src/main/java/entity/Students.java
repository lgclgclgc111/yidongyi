package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "students")  
public class Students {
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;  
	
	@Column(name = "name", nullable = false, length = 30)  
    private String name; 
 
@Column(name = "numbers", nullable = false, length = 10)  
    private int numbers;

@Column(name = "sex", nullable = false, length = 10)  
private String sex;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumbers() {
	return numbers;
}

public void setNumbers(int numbers) {
	this.numbers = numbers;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public String getClassid() {
	return classid;
}

public void setClassid(String classid) {
	this.classid = classid;
}

@Column(name = "classid", nullable = false, length = 10)  
private String classid;



}
