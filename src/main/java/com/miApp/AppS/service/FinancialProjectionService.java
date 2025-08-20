package com.miApp.AppS.service;

import com.miApp.AppS.dto.FinancialProjectionDTO;

public interface FinancialProjectionService {

    FinancialProjectionDTO findAllFinancialProjections();

    FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO financialProjectionDTO);
    FinancialProjectionDTO getFinancialProjectionById(Long financialProjectionId);
    FinancialProjectionDTO updateFinancialProjection(Long financialProjectionId, FinancialProjectionDTO financialProjectionDTO);
    void deleteFinancialProjection(Long financialProjectionId);


}
