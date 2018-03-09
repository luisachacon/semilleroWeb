package com.youtube.demo1.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{
	private static final int serialVersionUID = (int) 5096004387476874847L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id",unique=true,nullable=false)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
