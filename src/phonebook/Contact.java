package phonebook;

public class Contact extends Entry {
	
	private String fName;
	private String mName;
	private String lName;
	private String fullName;
	private String telephone;
	private Address address = new Address();
	
	
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact() {
		
	}
	
	public Contact(String fName, String mName, String lName, String telephone, String fullName) {
		
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.fullName = fullName;
		this.telephone = telephone;
		
	}
	
	public String getFullName() {
		return this.fullName;
		
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
		
	}
	
	public String getfName() {
		return this.fName;
		
	}
	
	public void setfName(String fName) {
		this.fName = fName;
		
	}
	
	public String getlName() {
		return this.lName;
		
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	
	}
	
	public String getTelephone() {
		return this.telephone;
		
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
		
	}
	
	public String toString() {
		return this.fName + this.mName + this.lName + this.address.getStreet() + this.address.getCity() + this.address.getState() + this.address.getZip() + this.telephone;
	}
}
