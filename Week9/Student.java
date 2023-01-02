class Student extends Person {
	private int status;
	public final static int freshman = 1;
	public final static int junior = 2;
	public final static int sophomore = 3;
	public final static int senior = 4;

	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}
	public void setStatus(int status) {
		this.status = status; 
	}
	public String getStatus() {
		switch (status) {
			case 1: return "freshman"; 		 	
			case 2: return "junior"; 	 			
			case 3: return "sophomore"; 	 		 	
			case 4: return "senior"; 	 			
		}
		return "Unknown";
	}
	public String toString() {
		return "Status: " + getStatus();
	}
}