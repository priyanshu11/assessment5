package modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Training {

	
	private String track;
	private String batch;
	

	@OneToMany(cascade = CascadeType.ALL)
	private List<Employees> el;


	public Training(String track, String batch, List<Employees> el) {
		super();
		this.track = track;
		this.batch = batch;
		this.el = el;
	}


	public String getTrack() {
		return track;
	}


	public void setTrack(String track) {
		this.track = track;
	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}


	public List<Employees> getEl() {
		return el;
	}


	public void setEl(List<Employees> el) {
		this.el = el;
	}
	
}
