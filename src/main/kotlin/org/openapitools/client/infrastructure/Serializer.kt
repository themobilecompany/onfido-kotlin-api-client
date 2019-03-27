package org.openapitools.client.infrastructure

import com.squareup.moshi.Moshi
import java.time.LocalDateTime

object Serializer {
    @JvmStatic
    val moshi: Moshi = Moshi.Builder()
            .add(LocalDateTime::class.javaObjectType, LocalDateTimeAdapter())
            .build()
}
