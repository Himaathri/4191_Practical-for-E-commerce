package lk.ac.vau.Model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;

public class Work {
	
	@Id
	private int WId;
	private int Time;
	private int Eid;
	private int Did;
	
	//relationship between work and dept
	@OneToOne
	@JoinColumn(name="dept_id",referencedColumnName = "DId")
	private  Department wrk_department;
	
	//relationship between emp and wrk
	@ManyToMany
	@JoinColumn(name="work_id",referencedColumnName = "WId")
	private Work work;

	public Work(int wId, int time, int eid, int did, Department wrk_department, Work work) {
		super();
		WId = wId;
		Time = time;
		Eid = eid;
		Did = did;
		this.wrk_department = wrk_department;
		this.work = work;
	}

	public int getWId() {
		return WId;
	}

	public void setWId(int wId) {
		WId = wId;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public Department getWrk_department() {
		return wrk_department;
	}

	public void setWrk_department(Department wrk_department) {
		this.wrk_department = wrk_department;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}
	
	
}
