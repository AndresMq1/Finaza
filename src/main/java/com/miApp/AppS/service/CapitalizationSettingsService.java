package com.miApp.AppS.service;

import com.miApp.AppS.dto.CapitalizationSettingsDTO;

public interface CapitalizationSettingsService {

    CapitalizationSettingsDTO findAllCapitalizationSettings();

    CapitalizationSettingsDTO createCapitalizationSettings(CapitalizationSettingsDTO capitalizationSttingsDTO);
    CapitalizationSettingsDTO getCapitalizationSettingsById(Long idCapitalizationSettings);
    CapitalizationSettingsDTO updateCapitalizationSettings(Long idCapitalizationSettings, CapitalizationSettingsDTO capitalizationSttingsDTO);
    void deleteCapitalizationSettings(Long idCapitalizationSettings);

}
