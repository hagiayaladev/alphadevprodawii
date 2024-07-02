package com.alfadevpro.entities;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso")
public class CursoEntity extends BaseEntity {
	@Column(name="Titulo", length = 60)
	private String titulo;
	@Column(name="Descripcion", length = 100)
	private String descripcion;
	@Column(name="Precio")
	private Double precio;
	@Column(name="Portada URL")
	private String portadaUrl;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="Categoria_id")
	private CategoriaEntity categoria;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<EstudianteEntity> estudiante;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="Instructor_id")
	private InstructorEntity instructor;

}
