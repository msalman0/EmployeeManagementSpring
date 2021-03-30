/**
 *
 */
package com.voda.hr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String name;
	private String email;
	private String phone;
	private String imageUrl;
	private String title;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param imageUrl
	 * @param code
	 */
	public Employee(final long id, final String name, final String email, final String phone, final String imageUrl,
			final String code) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.title = code;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(final String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the code
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param code the code to set
	 */
	public void setTitle(final String code) {
		this.title = code;
	}

}
