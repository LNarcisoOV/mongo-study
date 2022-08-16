package com.mongo.model;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {
	
	@Id
	private String addressId;
	
	private Customer customer;
	
	private String type;
	
	private String street;

	private String city;

	private String state;

	private String zipCode;

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, customer, addressId, state, street, type, zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(customer, other.customer)
				&& Objects.equals(addressId, other.addressId) && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street) && type == other.type && Objects.equals(zipCode, other.zipCode);
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", customer=" + customer + ", type=" + type + ", street=" + street + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
	
}
