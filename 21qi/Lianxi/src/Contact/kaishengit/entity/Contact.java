package Contact.kaishengit.entity;

public class Contact{
	
	
	private String name;
	private String phone;
	private String sexualit;
	private String birthday;
	
	public Contact(){
		
	}
	
	public Contact(String name,String phone,String sexualit,String birthday){
		this.name = name;
		this.phone = phone;
		this.sexualit = sexualit;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSexualit() {
		return sexualit;
	}

	public void setSexualit(String sexualit) {
		this.sexualit = sexualit;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
