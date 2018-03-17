package models;

public class DVD extends Material {
	
	private String director;
	private String catalogNo;
	private int runningTime;
	private boolean licensed;

	public DVD(String id, String title, String branch, String director, String catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catalogNo = catalogNo;
		this.runningTime = runningTime;
		licensed = false;
	}

	public String getDirector() {
		return director;
	}

	public String getCatalogNo() {
		return catalogNo;
	}

	public int getRunningTime() {
		return runningTime;
	}
	
	public void license() {
		licensed = true;
	}
	
	public boolean lend(Customer customer) {
		if(licensed) {
			return super.lend(customer);
		}else {
			return false;
		}
	}

	@Override
	public int getLoanPeriod() {
		return 7;
	}
	
	@Override
	public String toString() {
		return "DVD: " + getID() + " " + getTitle() + " / " + getDirector();
	}

}
