package me.doruk.plumwatch.watch

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class WearfitProtocolTest {
    @Test
    fun buildsDocumentedLanguagePacket() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 4, 0xFF.toByte(), 0x7B, 0x80.toByte(), 1),
            WearfitProtocol.enabledSetting(0x7B, true)
        )
    }

    @Test
    fun buildsNotificationPacketWithWearfitMarker() {
        assertArrayEquals(
            byteArrayOf(0xDE.toByte(), 0, 6, 0xFF.toByte(), 0x72, 1, 3, 1, 1),
            WearfitProtocol.notificationDisplay(iconPrompt = 3, show = true, hideDetails = true)
        )
    }

    @Test
    fun buildsSleepModePacket() {
        assertArrayEquals(
            byteArrayOf(0xDE.toByte(), 0, 7, 0xFF.toByte(), 0x7F, 1, 1, 2, 1, 1),
            WearfitProtocol.sleepMode(enabled = true, mode = 2, tracking = true, chargeReminder = true)
        )
    }

    @Test
    fun preservesNonStandardPhysicalTrainingSeparator() {
        assertArrayEquals(
            byteArrayOf(0xDE.toByte(), 0, 7, 0, 1, 1, 1, 1, 0, 1),
            WearfitProtocol.physicalTraining(
                autoPause = true,
                startPrompt = true,
                stopPrompt = false,
                keyPause = true
            )
        )
    }

    @Test
    fun buildsHeartRateZonePacketWithEightThresholds() {
        val packet = WearfitProtocol.heartRateZones((1..8).toList())
        assertEquals(14, packet.size)
        assertEquals(0xFC.toByte(), packet[4])
        assertEquals(1, packet[5].toInt())
        assertEquals(8, packet.last().toInt())
    }

    @Test
    fun buildsSedentaryReminderPacket() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 9, 0xFF.toByte(), 0x75, 0x80.toByte(), 1, 9, 0, 21, 30, 60),
            WearfitProtocol.reminder(0x75, true, 9, 0, 21, 30, 60)
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsIncompleteHeartRateZoneConfiguration() {
        WearfitProtocol.heartRateZones(listOf(1, 2, 3))
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsInvalidReminderTime() {
        WearfitProtocol.reminder(0xA3, true, 25, 0, 21, 0, 60)
    }
}
