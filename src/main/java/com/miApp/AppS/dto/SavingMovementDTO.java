package com.miApp.AppS.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class SavingMovementDTO {

    private Long idSaving;

    private Long userId;

    private String type;

    private String descriptionMovement;

    private Double amount;

    private LocalDateTime SavingDate;

    private String createdAt;

    private String updatedAt;


}
