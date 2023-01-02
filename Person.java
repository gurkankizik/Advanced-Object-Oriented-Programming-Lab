class Person {
	public String name, address, mail, phone;
	public Person(String name, String address, String phone, String mail){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return mail;
	}

	public void setName(String name) {
		name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.mail = email;
	}

	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phone + "\nEmail address: " + mail;
	}
}