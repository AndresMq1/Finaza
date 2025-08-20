package com.miApp.AppS.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "CapitalizationSettings")
@Data

public class CapitalizationSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_CapitalizationS", nullable = false, unique = true)
    private Long idCapitalizationSettings;

    @Column (name = "user_id", nullable = false)
    private String name;

    @Column(name = "type", nullable = false, length = 50)
    private String type; // Tipo de capitalización (diaria, semanal, mensual, etc.)

    @Column(name = "description", length = 255)
    private String description; // Descripción de la capitalización

    @Column(name = "amount", nullable = false)
    private Double amount; // Monto de la capitalización

    @Column(name = "date", nullable = false)
    private LocalDateTime date; // Fecha de la capitalización

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt; // Fecha de creación de la capitalización

    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedAt; // Fecha de actualización de la capitalización

    @Column(name = "status", nullable = false, length = 20)
    private String status; // Estado de la capitalización (activa, inactiva, completada)


}
