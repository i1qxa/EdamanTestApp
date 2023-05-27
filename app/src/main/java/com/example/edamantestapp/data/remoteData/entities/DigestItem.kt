package com.example.edamantestapp.data.remoteData.entities

import kotlinx.serialization.Serializable

@Serializable
data class DigestItem(
   val label: String,
   val tag: String,
   val schemaOrgTag: String,
   val total: Double,
   val hasRDI: Boolean,
   val daily: Double,
   val unit: String,
)
