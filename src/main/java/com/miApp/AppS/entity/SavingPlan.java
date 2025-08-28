package com.miApp.AppS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "SavindPlans")
@Data
public class SavingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSavingPlan;

    @ManyToOne
    @JoinColumn(name = "idUser",  nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String namesavingplan;

    @Column(nullable = false)
    private Double savinggoal;

    @Column(nullable = false)
    private LocalDate savingdate;

    @Column(nullable = false)
    private Double amountSaving;

    @Column(nullable = false, length = 100)
    private String estados;


}
