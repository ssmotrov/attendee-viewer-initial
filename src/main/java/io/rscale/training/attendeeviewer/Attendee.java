package io.rscale.training.attendeeviewer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attendee {

	private String uuid;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String companyGuid;

	public Attendee() {}
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyGuid() {
		return companyGuid;
	}

	public void setCompanyName(String companyGuid) {
		this.companyGuid = companyGuid;
	}

	@Override
	public String toString() {
		return "Attendee [uuid=" + uuid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", companyGuid=" + companyGuid + "]";
	}


}
