package com.miApp.AppS.repository;


import com.miApp.AppS.entity.CapitalizationSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CapitalizatinSettingsRepository extends JpaRepository <CapitalizationSettings, Long> {

    Optional <CapitalizationSettings> findById(Long id);
}


