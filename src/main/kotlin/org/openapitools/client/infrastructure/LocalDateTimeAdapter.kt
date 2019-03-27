package org.openapitools.client.infrastructure

import com.squareup.moshi.*
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class LocalDateTimeAdapter: JsonAdapter<LocalDateTime>() {
    @Synchronized
    @ToJson
    override fun toJson(writer: JsonWriter, value: LocalDateTime?) {
        var string: String? = null
        if (value != null)  string = FORMATTER.format(value)
        writer.value(string)
    }

    @Synchronized
    @Throws(IOException::class)
    @FromJson
    override fun fromJson(reader: JsonReader): LocalDateTime? {
        val string = reader.nextString()
        return LocalDateTime.parse(string, DateTimeFormatter.ISO_DATE_TIME)
    }

    companion object {
        private val FORMATTER = DateTimeFormatter.ISO_DATE_TIME
    }
}
