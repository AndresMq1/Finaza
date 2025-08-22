package com.miApp.AppS.controller;

import com.miApp.AppS.Impl.TransactionServiceImpl;
import com.miApp.AppS.dto.TransactionDTO;
import com.miApp.AppS.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/Transacton")
public class TransactionController {


    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }


    @GetMapping("/listartodo")
    public ResponseEntity<List<TransactionDTO>> getAllTransactions() {
        List<TransactionDTO> transaction = transactionService.getAlltransaction();
        return ResponseEntity.ok(transaction);
    }

    @PostMapping("/crearTransaction")
    public ResponseEntity<TransactionDTO> createTransaction(@Validated @RequestBody TransactionDTO transactionDTO) {
        transactionService.createTransaction(transactionDTO);
        return ResponseEntity.ok(transactionDTO);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<TransactionDTO> getTransactionById(@PathVariable Long id) {
        TransactionDTO transactionDTO = transactionService.getTransactionById(id);
        return ResponseEntity.ok(transactionDTO);
    }
}
