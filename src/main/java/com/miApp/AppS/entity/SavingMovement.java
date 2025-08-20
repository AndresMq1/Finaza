package com.miApp.AppS.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "saving_movements")
@Data
public class SavingMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_saving", nullable = false, unique = true)
    private Long idSaving;

    @Column(name = "user_id", nullable = false)
    private Long userId; // ID del usuario al que pertenece el movimiento de ahorro

    @Column(name = "type", nullable = false, length = 50)
    private String type; // Tipo de movimiento (ingreso, gasto, etc.)

    @Column(name = "description_movement", length = 255)
    private String descriptionMovement; // Descripción del movimiento de ahorro

    @Column(name = "amount", nullable = false)
    private Double amount; // Monto del movimiento de ahorro

    @Column(name = "date", nullable = false)
    private LocalDateTime SavingDate; // Fecha del movimiento de ahorro

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt; // Fecha de creación del movimiento de ahorro

    @Column(name = "updated_at", nullable = false)
    private String updatedAt; // Fecha de actualización del movimiento de ahorro


}
