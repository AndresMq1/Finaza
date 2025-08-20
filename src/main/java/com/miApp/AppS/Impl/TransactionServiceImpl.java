package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.TransactionDTO;
import com.miApp.AppS.entity.Transaction;
import com.miApp.AppS.exceptions.CustomException;
import com.miApp.AppS.repository.TransactionRepository;
import com.miApp.AppS.repository.UserRepository;
import com.miApp.AppS.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl  implements TransactionService {


    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, ModelMapper modelMapper) {
        this.transactionRepository = transactionRepository;
        this.modelMapper = modelMapper;
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
        Transaction transaction = modelMapper.map(transactionDTO, Transaction.class);
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
        return null;
    }

    @Override
    public void deleteTransaction(Long transactionId) {

    }
}
