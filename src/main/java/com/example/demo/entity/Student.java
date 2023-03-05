package com.example.demo.entity;

import java.sql.Date;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Nom;
	private String Prenom;
	@Temporal(TemporalType.DATE)
	private Date datedenaissance;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDatedenaissance() {
		return datedenaissance;
	}
	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}
	
}
