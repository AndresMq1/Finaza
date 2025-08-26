package com.miApp.AppS.controller;

import com.miApp.AppS.dto.SavingMovementDTO;
import com.miApp.AppS.entity.SavingMovement;
import com.miApp.AppS.service.SavingMovementService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/movement")
public class SavingMovementController {

    private final SavingMovementService savingMovementService;


    public SavingMovementController(SavingMovementService savingMovementService) {
        this.savingMovementService = savingMovementService;

    }

    @GetMapping("/all")
    public ResponseEntity<List<SavingMovementDTO>> getAllSavingMovement(){
        List<SavingMovementDTO> savings = savingMovementService.getAllSavingMovement();
        return ResponseEntity.ok(savings);
    }
    @GetMapping("/id/{idSaving}")
    public ResponseEntity<SavingMovementDTO> getSavingMovementById(@PathVariable Long idSaving){
        SavingMovementDTO savingMovementDTO = savingMovementService.getSavingMovementById(idSaving);
        return ResponseEntity.ok(savingMovementDTO);
    }
    @PostMapping("/crear")
    public ResponseEntity<SavingMovementDTO> createSavingMovement(@Validated @RequestBody SavingMovementDTO savingMovementDTO){
        savingMovementService.createSavingMovement(savingMovementDTO);
        return ResponseEntity.ok(savingMovementDTO);
    }
    @PutMapping("/actualizar/{idSaving}")
    public ResponseEntity<SavingMovementDTO> updateSavingMovement(@RequestBody SavingMovementDTO savingMovementDTO, @PathVariable Long idSaving) {
        SavingMovementDTO saving = savingMovementService.updateSavingMovement(idSaving, savingMovementDTO);
        return ResponseEntity.ok(saving);
    }

    @DeleteMapping("/eliminar/{idSaving}")
    public ResponseEntity<Long> deleteUser(@PathVariable Long idSaving){
        savingMovementService.deleteSavingMovement(idSaving);
        return ResponseEntity.ok(idSaving);
    }



}
