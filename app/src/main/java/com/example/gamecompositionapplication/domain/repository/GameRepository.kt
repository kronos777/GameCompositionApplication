package com.example.gamecompositionapplication.domain.repository

import com.example.gamecompositionapplication.domain.entity.GameSettings
import com.example.gamecompositionapplication.domain.entity.Level
import com.example.gamecompositionapplication.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}