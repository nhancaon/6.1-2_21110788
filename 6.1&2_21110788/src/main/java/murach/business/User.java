package murach.business;

import java.io.Serializable;

public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String heardFrom;
	private String updates;
	private String contactVia;

	public User() {
		firstName = "";
		lastName = "";
		email = "";
		dateOfBirth = "";
		heardFrom = "";
		updates = "";
		contactVia = "";
	}

	public User(String firstName, String lastName, String email, String dateOfBirth, String heardFrom, String updates,
			String contactVia) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.heardFrom = heardFrom;
		this.updates = updates;
		this.contactVia = contactVia;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHeardFrom() {
		return heardFrom;
	}

	public void setHeardFrom(String heardFrom) {
		this.heardFrom = heardFrom;
	}

	public String getUpdates() {
		return updates;
	}

	public void setUpdates(String updates) {
		this.updates = updates;
	}

	public String getContactVia() {
		return contactVia;
	}

	public void setContactVia(String contactVia) {
		this.contactVia = contactVia;
	}
}
