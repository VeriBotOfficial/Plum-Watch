package me.doruk.plumwatch.watch

import java.util.Calendar
import java.util.TimeZone
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class BluetoothCurrentTimeTest {
    @Test
    fun encodesCurrentTimeUsingBluetoothFieldOrder() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC")).apply {
            clear()
            set(2026, Calendar.APRIL, 5, 14, 8, 9)
        }

        assertArrayEquals(
            byteArrayOf(
                0xEA.toByte(), 0x07, // Year 2026, little endian
                4, 5,                // Month and day
                14, 8, 9,            // Hour, minute, second
                7,                   // Sunday is day 7 in the Bluetooth profile
                0, 0                 // Fractions256 and Adjust Reason
            ),
            BluetoothCurrentTime.encode(calendar)
        )
    }
}
