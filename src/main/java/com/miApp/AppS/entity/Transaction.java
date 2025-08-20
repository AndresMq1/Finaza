package com.miApp.AppS.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name= "transactions")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    // Relación con la entidad User
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    // Relación con la entidad Category
    private Category category;

    @Column(name = "type", nullable = false, length = 50)
    private String type; // tipo de transacción (ingreso, gasto, inversión, etc.)

    @Column(name = "amount", nullable = false)
    private Double amount; // monto de la transacción

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate; // fecha y hora de la transacción

    @Column(name = "description", length = 255)
    private String description;

}
