package com.miApp.AppS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "financial_projections")
@Data

public class FinancialProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_projection", nullable = false, unique = true)
    private Long idProjection;

    @Column(name = "user_id", nullable = false)
    private Long userId; // ID usuario al que pertenece la proyeccion

    @Column(name = "type", nullable = false, length = 50)
    private String projectionType; // Tipo de proyeccion (ingreso, gasto, ahorro

    @Column(name = "description", length = 255)
    private String descriptionProjection; // Descripción de la proyeccion

    @Column(name = "amount", nullable = false)
    private Double amount; // Monto de la proyeccion

    @Column(name = "date", nullable = false)
    private LocalDateTime projectionDate; // Fecha y hora de la proyeccion

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt; // Fecha de creacion de la proyeccion

    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedAt; // Fecha de actualizacion de la proyeccion

}
