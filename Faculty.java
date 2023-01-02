public class Faculty extends Employee {

	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phone, String mail, int office, double salary, String officeHours, String rank) {
		super(name, address, phone, mail, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}