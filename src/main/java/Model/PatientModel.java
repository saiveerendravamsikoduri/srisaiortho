package Model;

public class PatientModel {
	private int id;
	private String name;
	private String mobileNumber;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "PatientModel [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ "]";
	}
	public PatientModel(int id, String name, String mobileNumber, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public PatientModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
