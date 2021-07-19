package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campo")
public class Campo extends Trabajador{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_campo")	
	private Long idCampo;

	@Column(name = "rol")	
	private String rol;

	public Campo() {
		super();
	}
	
	public Campo(Long idCampo) {
		super();
		this.idCampo = idCampo;
	}
}
