package com.miApp.AppS.Impl;


import com.miApp.AppS.dto.FinancialProjectionDTO;
import com.miApp.AppS.service.FinancialProjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialProjectionServiceImpl implements FinancialProjectionService {

    private final FinancialProjectionService financialProjectionService;
    public FinancialProjectionServiceImpl(FinancialProjectionService financialProjectionService) {
        this.financialProjectionService = financialProjectionService;
    }

    public FinancialProjectionServiceImpl() {
        this.financialProjectionService = null; // This is not a good practice, but included to match the constructor signature.

    }
    @Override
    public FinancialProjectionDTO findAllFinancialProjections() {
        return null;
    }

    @Override
    public FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO financialProjectionDTO) {
        return null;
    }

    @Override
    public FinancialProjectionDTO getFinancialProjectionById(Long financialProjectionId) {
        return null;
    }

    @Override
    public FinancialProjectionDTO updateFinancialProjection(Long financialProjectionId, FinancialProjectionDTO financialProjectionDTO) {
        return null;
    }

    @Override
    public void deleteFinancialProjection(Long financialProjectionId) {

    }
}
