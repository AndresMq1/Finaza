package com.miApp.AppS.service;

import com.miApp.AppS.dto.SavingMovementDTO;
import com.miApp.AppS.entity.SavingMovement;

public interface SavingMovementService {

    SavingMovementDTO findAllSavingMovements();

    SavingMovementDTO createSavingMovement(SavingMovementDTO savingMovementDTO);
    SavingMovementDTO getSavingMovementById(Long savingMovementId);
    SavingMovementDTO updateSavingMovement(Long savingMovementId, SavingMovementDTO savingMovementDTO);
    void deleteSavingMovement(Long savingMovementId);





}
