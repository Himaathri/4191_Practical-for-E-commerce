 package lk.ac.vau.Model;

public class PrimaryId<U>{

	private U Id;
	
	public PrimaryId() {
		
	}

	public PrimaryId(U id) {
		Id=id;
	}

	
	public U getId() {
		return Id;
	}

	public void setId(U id) {
		Id = id;
	}

	
}
