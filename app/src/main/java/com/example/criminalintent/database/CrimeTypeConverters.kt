package com.example.criminalintent.database

import androidx.room.TypeConverter
import java.util.Date
import java.util.UUID

class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date: Date?): Long? = date?.time

    @TypeConverter
    fun toDate(millisSinceEpoch: Long?): Date? = millisSinceEpoch?.let { Date(it) }

    @TypeConverter
    fun fromId(uuid: UUID?): String? = uuid?.toString()

    @TypeConverter
    fun toId(uuid: String?): UUID? = UUID.fromString(uuid)
}