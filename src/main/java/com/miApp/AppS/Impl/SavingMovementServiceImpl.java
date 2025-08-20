package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.SavingMovementDTO;
import com.miApp.AppS.service.SavingMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingMovementServiceImpl implements SavingMovementService {

    private final SavingMovementService savingMovementService;
    public SavingMovementServiceImpl(SavingMovementService savingMovementService) {
        this.savingMovementService = savingMovementService;
    }


    public SavingMovementServiceImpl() {
        this.savingMovementService = null; // This is not a good practice, but included to match the constructor signature.
    }

    @Override
    public SavingMovementDTO findAllSavingMovements() {
        return null;
    }

    @Override
    public SavingMovementDTO createSavingMovement(SavingMovementDTO savingMovementDTO) {
        return null;
    }

    @Override
    public SavingMovementDTO getSavingMovementById(Long savingMovementId) {
        return null;
    }

    @Override
    public SavingMovementDTO updateSavingMovement(Long savingMovementId, SavingMovementDTO savingMovementDTO) {
        return null;
    }

    @Override
    public void deleteSavingMovement(Long savingMovementId) {

    }
}
