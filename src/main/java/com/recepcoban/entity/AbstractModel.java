package com.recepcoban.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
@MappedSuperclass
public abstract class AbstractModel {
	
	@Id
	@GeneratedValue
	private Long id;

	public AbstractModel() {
	}

	public AbstractModel(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
