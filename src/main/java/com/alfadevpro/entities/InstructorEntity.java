package com.alfadevpro.entities;

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
@Table(name = "instructor")
public class InstructorEntity extends BaseEntity{
	@Column(name="DNI", length = 8, unique = true)
	private String dni;
	@Column(name="Nombres", length = 100)
	private String nombres;
	@Column(name="Apellidos", length = 100)
	private String apellidos;
	@Column(name="Correo", length = 80)
	private String correo;
}
