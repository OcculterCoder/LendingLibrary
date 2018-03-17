package models;

public abstract class Material {
	
	private String id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(String id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public String getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBranch() {
		return branch;
	}
	
	public void relocate(String newBranch) {
		this.branch = newBranch;
	}
	
	public boolean lend(Customer customer) {
		if(borrower == null) {
			borrower = customer;
			return true;
		}else {
			return false;
		}
	}
	
	public abstract int getLoanPeriod();

	@Override
	public String toString() {
		return  id +" : "+ getTitle();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() == obj.getClass()) {
			Material compare = (Material) obj;
			if(this.id == compare.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
		
}
