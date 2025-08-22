package com.miApp.AppS.dto;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionDTO {


    private Long idTransaction;

    private Long idUser;

    private Long idCategory;

    private String type;

    private Double amount;

    private LocalDateTime transactionDate;

    private String description;

}
