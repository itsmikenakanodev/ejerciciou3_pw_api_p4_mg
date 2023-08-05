package com.example.demo.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class VehiculoTO extends RepresentationModel<VehiculoTO> implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String placa;

	private String marca;

	private String modelo;

	private String capacidad;
	
	//Constructor
	
	public VehiculoTO(Integer id, String placa, String marca, String modelo, String capacidad) {
		super();
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}
	
	public VehiculoTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	//SET Y GET
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
