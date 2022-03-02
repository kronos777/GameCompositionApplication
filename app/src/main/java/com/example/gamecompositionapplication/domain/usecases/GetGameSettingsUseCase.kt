package com.example.gamecompositionapplication.domain.usecases

import com.example.gamecompositionapplication.domain.entity.GameSettings
import com.example.gamecompositionapplication.domain.entity.Level
import com.example.gamecompositionapplication.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}