package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.TransactionDTO;
import com.miApp.AppS.entity.Category;
import com.miApp.AppS.entity.Transaction;
import com.miApp.AppS.exceptions.CustomException;
import com.miApp.AppS.repository.CategoryRepository;
import com.miApp.AppS.repository.TransactionRepository;
import com.miApp.AppS.repository.UserRepository;
import com.miApp.AppS.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl  implements TransactionService {


    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, ModelMapper modelMapper, CategoryRepository categoryRepository) {
        this.transactionRepository = transactionRepository;
        this.modelMapper = modelMapper;
        this.categoryRepository = categoryRepository;
    }





    @Override
    public List<TransactionDTO> getAlltransaction(){
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream().map(transaction -> modelMapper.map(transaction, TransactionDTO.class)).collect(Collectors.toList());
    }


    @Override
    public TransactionDTO findAllTransactions() {
        return null;
    }

    @Override
    public TransactionDTO createTransaction(TransactionDTO transactionDTO) {

        Category category = categoryRepository.findById(transactionDTO.getIdCategory())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        Transaction transaction = modelMapper.map(transactionDTO, Transaction.class);
        transaction.setCategory(category);
        transaction.setTransactionDate(LocalDateTime.now());
        Transaction savedTransaction = transactionRepository.save(transaction);

        return modelMapper.map(savedTransaction, TransactionDTO.class);
    }

    @Override
    public TransactionDTO getTransactionById(Long transactionId) {
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new CustomException("Transaction not found with id:" + transactionId));
        return modelMapper.map(transaction, TransactionDTO.class);
    }

    @Override
    public TransactionDTO updateTransaction(Long transactionId, TransactionDTO transactionDTO) {
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new CustomException("Transaction no encontrada id:" + transactionId));

        modelMapper.map(transactionDTO, transaction);

        transaction.setTransactionDate(LocalDateTime.now());
        Transaction savedTransaction = transactionRepository.save(transaction);
        return modelMapper.map(savedTransaction, TransactionDTO.class);

    }

    @Override
    public void deleteTransaction(Long transactionId) {

    }
}
