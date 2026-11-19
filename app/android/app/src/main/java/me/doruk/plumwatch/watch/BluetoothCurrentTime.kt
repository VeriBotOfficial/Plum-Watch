package me.doruk.plumwatch.watch

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.Calendar

/** Encoder for the Bluetooth Current Time characteristic (0x2A2B). */
internal object BluetoothCurrentTime {
    fun encode(calendar: Calendar = Calendar.getInstance()): ByteArray {
        val dayOfWeek = when (calendar.get(Calendar.DAY_OF_WEEK)) {
            Calendar.SUNDAY -> 7
            else -> calendar.get(Calendar.DAY_OF_WEEK) - 1
        }
        return ByteBuffer.allocate(10)
            .order(ByteOrder.LITTLE_ENDIAN)
            .putShort(calendar.get(Calendar.YEAR).toShort())
            .put((calendar.get(Calendar.MONTH) + 1).toByte())
            .put(calendar.get(Calendar.DAY_OF_MONTH).toByte())
            .put(calendar.get(Calendar.HOUR_OF_DAY).toByte())
            .put(calendar.get(Calendar.MINUTE).toByte())
            .put(calendar.get(Calendar.SECOND).toByte())
            .put(dayOfWeek.toByte())
            .put(0) // Fractions256
            .put(0) // Adjust Reason: no clock-change reason asserted
            .array()
    }
}
