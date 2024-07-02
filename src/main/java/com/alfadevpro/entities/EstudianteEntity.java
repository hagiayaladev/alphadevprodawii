package com.alfadevpro.entities;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiante")
public class EstudianteEntity extends BaseEntity{
	@Column(name="DNI", length = 8, unique = true)
	private String dni;
	@Column(name="Nombres", length = 100)
	private String nombres;
	@Column(name="Apellidos", length = 100)
	private String apellidos;
	@Column(name="Celular", length = 10)
	private String celular;
	@Column(name="Fecha de nacimiento")
	private Date fechaNacimiento;
	@Column(name="Correo", length = 80)
	private String correo;
}
