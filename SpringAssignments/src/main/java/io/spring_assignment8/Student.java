package io.spring_assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
*/
public class Student implements InitializingBean,DisposableBean{
	
	private String studentName;
	
	private int studentId;
	
	private String studentGrade;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public void getDetails() {
		System.out.println("Id = "+getStudentId()+", Name = "+getStudentName()+", Grade = "+getStudentGrade());
	}
	
	public void myInit() {
		System.out.println("Init bean method called in for Student");
	}
	
	public void myDestroy() {
		System.out.println("Destroy bean method called in for Student");
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean interface called for student");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean interface called for student");
	}
	
	  @PostConstruct public void create() {
	  System.out.println("Init bean method called in for Student"); }
	  
	  @PreDestroy public void clean() {
	  System.out.println("Destroy bean method called in for Student"); }
	 

}
