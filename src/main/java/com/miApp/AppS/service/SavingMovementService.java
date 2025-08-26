package com.miApp.AppS.service;

import com.miApp.AppS.dto.SavingMovementDTO;
import com.miApp.AppS.entity.SavingMovement;

import java.util.List;

public interface SavingMovementService {

    List<SavingMovementDTO> getAllSavingMovement();
    SavingMovementDTO findAllSavingMovements();

    SavingMovementDTO createSavingMovement(SavingMovementDTO savingMovementDTO);
    SavingMovementDTO getSavingMovementById(Long savingMovementId);
    SavingMovementDTO updateSavingMovement(Long savingMovementId, SavingMovementDTO savingMovementDTO);
    boolean deleteSavingMovement(Long savingMovementId);





}
