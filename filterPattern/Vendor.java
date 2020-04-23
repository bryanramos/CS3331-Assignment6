package filterPattern;

public class Vendor {
	
	private String type, name, image, description, 
	email, phoneNumber, url;
	
	public Vendor(String type, String name, String image, String description,
			String email, String phoneNumber, String url) {
		this.type = type;
		this.name = name;
		this.image = image;
		this.description = description;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.url = url;
	}

	/* setter for vendor data */
	void setType(String type) {
		this.type = type;
	}
	void setName(String name) {
		this.name = name;
	}
	void setImage(String image) {
		this.image = image;
	}
	void setDescription(String description) {
		this.description = description;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	void setUrl(String url) {
		this.url = url;
	}
	
	/* getters for vendor properties */
	String getType() {
		return type;
	}
	String getName() {
		return name;
	}
	String getImage() {
		return image;
	}
	String getDescription() {
		return description;
	}
	String getEmail() {
		return email;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
	String getUrl() {
		return url;
	}
}
