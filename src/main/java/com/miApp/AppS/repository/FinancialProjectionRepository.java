package com.miApp.AppS.repository;


import com.miApp.AppS.entity.FinancialProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FinancialProjectionRepository extends JpaRepository<FinancialProjection, Long> {

   Optional <FinancialProjection> findById(Long id);

}
