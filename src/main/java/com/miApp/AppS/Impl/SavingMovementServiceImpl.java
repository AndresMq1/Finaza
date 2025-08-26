package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.SavingMovementDTO;
import com.miApp.AppS.entity.SavingMovement;
import com.miApp.AppS.exceptions.CustomException;
import com.miApp.AppS.repository.SavingMovementRepository;
import com.miApp.AppS.service.SavingMovementService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SavingMovementServiceImpl implements SavingMovementService {

    private final SavingMovementRepository savingMovementRepository;
    private final ModelMapper modelMapper;

    public SavingMovementServiceImpl(SavingMovementRepository savingMovementRepository, ModelMapper modelMapper) {
        this.savingMovementRepository = savingMovementRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<SavingMovementDTO> getAllSavingMovement(){
        List<SavingMovement> savingMovements = savingMovementRepository.findAll();
        return savingMovements.stream()
                .map(savingMovement -> modelMapper.map(savingMovements,SavingMovementDTO.class))
                .collect(Collectors.toList());
    }


    @Override
    public SavingMovementDTO findAllSavingMovements() {
        return null;
    }

    @Override
    public SavingMovementDTO createSavingMovement(SavingMovementDTO savingMovementDTO) {
        SavingMovement savingMovement = modelMapper.map(savingMovementDTO,SavingMovement.class);
        savingMovement = savingMovementRepository.save(savingMovement);
        return modelMapper.map(savingMovement,SavingMovementDTO.class);
    }

    @Override
    public SavingMovementDTO getSavingMovementById(Long savingMovementId) {
        SavingMovement savingMovement = savingMovementRepository.findById(savingMovementId)
                .orElseThrow(()-> new CustomException("No se encuentra el ID"+savingMovementId));

        return modelMapper.map(savingMovement,SavingMovementDTO.class);
    }

    @Override
    public SavingMovementDTO updateSavingMovement(Long savingMovementId, SavingMovementDTO savingMovementDTO) {
        SavingMovement savingMovement = savingMovementRepository.findById(savingMovementId)
                .orElseThrow(() -> new CustomException("no se encontro el id" + savingMovementId));
        modelMapper.map(savingMovementDTO,savingMovement);
        SavingMovement saving = savingMovementRepository.save(savingMovement);

        return modelMapper.map(saving,SavingMovementDTO.class);
    }

    @Override
    public boolean deleteSavingMovement(Long savingMovementId) {
        if (!savingMovementRepository.existsById(savingMovementId)) {
            throw new CustomException("saving not found with id:" + savingMovementId);
        }
        savingMovementRepository.deleteById(savingMovementId);
        return true;
    }
}
