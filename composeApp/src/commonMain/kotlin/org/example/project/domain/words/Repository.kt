package org.example.project.domain.words

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class WordRepository {
  private val client = HttpClient()

  suspend fun greeting(): String {
      val response = client.get("https://ktor.io/docs/")
      return response.bodyAsText()
  }
}