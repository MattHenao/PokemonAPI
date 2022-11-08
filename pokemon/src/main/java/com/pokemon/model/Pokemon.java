package com.pokemon.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon")

public class Pokemon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idPokedex;
	private String name;
	private String type;
	private Integer attack;
	private String imageUrl;

	public Pokemon() {
	}

	public Pokemon(Integer id, Integer idPokedex, String name, String type, String imageUrl, Integer attack) {

		this.id = id;
		this.idPokedex = idPokedex;
		this.name = name;
		this.type = type;
		this.imageUrl = imageUrl;
		this.attack = attack;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPokedex() {
		return idPokedex;
	}

	public void setIdPokedex(Integer idPokedex) {
		this.idPokedex = idPokedex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	private static final long serialVersionUID = 1L;
}