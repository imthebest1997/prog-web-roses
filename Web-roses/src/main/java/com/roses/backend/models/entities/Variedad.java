package com.roses.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variedades")
public class Variedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo_var")
	private Integer idVariedad;//Atributo que se mapea con la Primary Key

	@Column(name = "nombre_var")
	private String nombre;

	@Column(name = "tamano_boton_var")
	private int tamanoBoton;

	@Column(name = "dias_florero_var")
	private int diasFlorero;

	@Column(name = "numero_petalos_var")
	private int numeroPetalos;
	
	@Column(name = "color_1_var")
	private String color1;
	
	@Column(name = "color_2_var")
	private String color2;
	
	@Column(name = "longitud_minima_var")
	private int longitudMinima;
	
	@Column(name = "longitud_maxima_var")
	private int longitudMaxima;
	
	public Variedad() {
		super();
	}
	
	public Variedad(int id) {
		super();
		this.idVariedad = id;
	}

	public Integer getIdVariedad() {
		return idVariedad;
	}

	public void setIdVariedad(Integer idVariedad) {
		this.idVariedad = idVariedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanoBoton() {
		return tamanoBoton;
	}

	public void setTamanoBoton(int tamanoBoton) {
		this.tamanoBoton = tamanoBoton;
	}

	public int getDiasFlorero() {
		return diasFlorero;
	}

	public void setDiasFlorero(int diasFlorero) {
		this.diasFlorero = diasFlorero;
	}

	public int getNumeroPetalos() {
		return numeroPetalos;
	}

	public void setNumeroPetalos(int numeroPetalos) {
		this.numeroPetalos = numeroPetalos;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public int getLongitudMinima() {
		return longitudMinima;
	}

	public void setLongitudMinima(int longitudMinima) {
		this.longitudMinima = longitudMinima;
	}

	public int getLongitudMaxima() {
		return longitudMaxima;
	}

	public void setLongitudMaxima(int longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

	
	
}
