package com.example.bonusaufgabeppy.network.data.api

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import javax.inject.Singleton

@Module
@OptIn(ExperimentalSerializationApi::class)
@InstallIn(SingletonComponent::class)
object APIModule {
    private const val MOVIE_API_BASE_URL = "https://api.themoviedb.org/"

    @Provides
    @Singleton
    fun provideHttpClientForApi(): HttpClient = HttpClient(CIO) {
        install(Logging) {
            level = LogLevel.INFO
            logger = object : Logger {
                override fun log(message: String) {
                    Log.v("HttpClient", message)
                }
            }
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                explicitNulls = false
            })
        }
    }

    @Provides
    @Singleton
    fun provideJsonPlaceHolderApi(client: HttpClient): MovieAPI {
        return MovieAPI(client.config {
            defaultRequest {
                url(MOVIE_API_BASE_URL)
            }
        })
    }
}