package Model;

public class DoctorModel {
	public int id;
	public String name;
	public String qualification;
	public String password;
	private int experience;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "DoctorModel [id=" + id + ", name=" + name + ", qualification=" + qualification + ", password="
				+ password + ", experience=" + experience + "]";
	}
	public DoctorModel(int id, String name, String qualification, String password, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.password = password;
		this.experience = experience;
	}
	public DoctorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
