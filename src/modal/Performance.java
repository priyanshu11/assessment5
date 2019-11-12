package modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import modal.Employees;

public class Performance {

	
	
	private float marks;
	

	@OneToOne
	@JoinColumn(name="emp")
	private Employees emp;


	public Performance(float marks, Employees emp) {
		super();
		this.marks = marks;
		this.emp = emp;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public Employees getEmp() {
		return emp;
	}


	public void setEmp(Employees emp) {
		this.emp = emp;
	}
	
	
	
}
