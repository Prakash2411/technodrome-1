package com.example.restApi.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Employee_master")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Employee_ID;
	@Column
	private String First_Name;
	@Column
	private String Last_Name;
	@Column
	private Date Date_of_Birth;
	@Column
	private String Gender;
	@Column
	private String Nationality;
	@Column
	private String Address;
	@Column
	private String Contact_Number;
	@Column
	private String Department;
	@Column
	private String Position;
	
	
	
	

}
