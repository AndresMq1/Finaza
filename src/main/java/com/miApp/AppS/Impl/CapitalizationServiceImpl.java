package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.CapitalizationSettingsDTO;
import com.miApp.AppS.service.CapitalizationSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapitalizationServiceImpl implements CapitalizationSettingsService {

    private final CapitalizationSettingsService capitalizationSettingsService;

    public CapitalizationServiceImpl(CapitalizationSettingsService capitalizationSettingsService) {
        this.capitalizationSettingsService = capitalizationSettingsService;
    }

    public CapitalizationServiceImpl() {
        this.capitalizationSettingsService = null; // This is not a good practice, but included to match the constructor signature.
    }

    @Override
    public CapitalizationSettingsDTO findAllCapitalizationSettings() {
        return null;
    }

    @Override
    public CapitalizationSettingsDTO createCapitalizationSettings(CapitalizationSettingsDTO capitalizationSttingsDTO) {
        return null;
    }

    @Override
    public CapitalizationSettingsDTO getCapitalizationSettingsById(Long idCapitalizationSettings) {
        return null;
    }

    @Override
    public CapitalizationSettingsDTO updateCapitalizationSettings(Long idCapitalizationSettings, CapitalizationSettingsDTO capitalizationSttingsDTO) {
        return null;
    }

    @Override
    public void deleteCapitalizationSettings(Long idCapitalizationSettings) {

    }
}
