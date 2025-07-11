package com.example.userservice.entity;

import java.sql.Timestamp;

import jakarta.persistence.*;


@Entity
@Table(name = "admins")
public class AdminsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private Integer id;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name = "role")
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Boolean getEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		isEmailVerified = emailVerified;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public AdminsEntity() {

	}

	@Column(name="admin_first_name")
	private String firstName;

	@Column(name="admin_last_name")
	private String lastName;

	@Column(name="admin_email")
	private String email;

	@Column(name="admin_password")
	private String password;

	@Column(name="admin_address")
	private String address;

	@Column(name="admin_phone_number")
	private String phoneNumber;


	@Column(name="store_id")
	private Integer storeId;

	@Column(name="admin_email_verified")
	private Boolean isEmailVerified;

	@Column(name="admin_created_at")
	private Timestamp createdDate;

	@Column(name="admin_updated_at")
	private Timestamp updatedDate;


	public AdminsEntity(String firstName, String lastName, String password, String email, String address, String phoneNumber, Integer storeId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.storeId = storeId;

	}
}