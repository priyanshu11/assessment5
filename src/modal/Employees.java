package modal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import modal.Employees;


@Entity
@Table(name="employees")
public class Employees{
	@Id
	@GeneratedValue(generator="id_gen")
	@GenericGenerator(name="id_gen", strategy="uuid2")
	private String empid;

	private String name;
	private String email;
	
	private String trainingbatch;
	
	private String performance;
	
	
	public Employees(){
	}



	public Employees(String name, String email,String trainingbatch,String performance) {
		super();
		
		this.name = name;
		this.email = email;
		this.trainingbatch = trainingbatch;
		this.performance= performance;
	}



	public String getEmpid() {
		return empid;
	}



	public void setEmpid(String empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTrainingbatch() {
		return trainingbatch;
	}



	public void setTrainingbatch(String trainingbatch) {
		this.trainingbatch = trainingbatch;
	}



	public String getPerformance() {
		return performance;
	}



	public void setPerformance(String performance) {
		this.performance = performance;
	}




}
	
	


