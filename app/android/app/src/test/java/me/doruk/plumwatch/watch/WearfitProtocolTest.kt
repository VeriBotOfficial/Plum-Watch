package me.doruk.plumwatch.watch

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class WearfitProtocolTest {
    @Test
    fun buildsLanguagePacket() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 4, 0xFF.toByte(), 0x7B, 0x80.toByte(), 1),
            WearfitProtocol.enabledSetting(0x7B, true)
        )
    }

    @Test
    fun buildsNotificationPacketWithEaMarker() {
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0, 6, 0xFF.toByte(), 0x72, 1, 3, 1, 1),
            WearfitProtocol.notificationDisplay(iconPrompt = 3, show = true, hideDetails = true)
        )
    }

    @Test
    fun buildsCameraPreviewStatePacket() {
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0, 4, 0, 0x15, 4, 1),
            WearfitProtocol.cameraPreviewState(true)
        )
    }

    @Test
    fun buildsCameraPhotoStatePacket() {
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0, 6, 0, 0x15, 3, 3, 1, 0),
            WearfitProtocol.cameraPhotoState(first = 3, second = 1, third = 0)
        )
    }

    @Test
    fun buildsSplitNotificationContentPacket() {
        assertArrayEquals(
            byteArrayOf(
                0xAB.toByte(), 0, 13, 0xFF.toByte(), 0x72, 0x80.toByte(),
                34, 2, 0x48, 0x69, 0x20, 0x77, 0x61, 0x74, 0x63, 0x68
            ),
            WearfitProtocol.notificationContent("Hi watch")
        )
    }

    @Test
    fun notificationContentTruncationDoesNotSplitUtf8Characters() {
        val packet = WearfitProtocol.notificationContent("é".repeat(400))
        val body = packet.copyOfRange(8, packet.size)
        assertEquals(321, body.size)
        assertArrayEquals(byteArrayOf(0x2E, 0x2E, 0x2E), body.copyOfRange(318, 321))
    }

    @Test
    fun buildsSleepModePacketWithEaMarker() {
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0, 7, 0xFF.toByte(), 0x7F, 1, 1, 2, 1, 1),
            WearfitProtocol.sleepMode(enabled = true, mode = 2, tracking = true, chargeReminder = true)
        )
    }

    @Test
    fun buildsPhysicalTrainingPacketWithEaMarkerAndZeroSeparator() {
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0, 7, 0, 1, 1, 1, 1, 0, 1),
            WearfitProtocol.physicalTraining(
                autoPause = true,
                startPrompt = true,
                stopPrompt = false,
                keyPause = true
            )
        )
    }

    @Test
    fun buildsHeartRateWarningPacketWithA0Command() {
        val packet = WearfitProtocol.heartRateZones((1..8).toList())
        assertEquals(14, packet.size)
        assertEquals(0xEA.toByte(), packet[0])
        assertEquals(0xA0.toByte(), packet[4])
        assertEquals(0, packet[5].toInt())
        assertEquals(8, packet.last().toInt())
    }

    @Test
    fun buildsSedentaryReminderSchedule() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 9, 0xFF.toByte(), 0x75, 0x80.toByte(), 1, 9, 0, 21, 30, 60),
            WearfitProtocol.reminderSchedule(0x75, true, 9, 0, 21, 30, 60)
        )
    }

    @Test
    fun buildsWaterReminderWithCommand53() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 9, 0xFF.toByte(), 0x53, 0x80.toByte(), 1, 9, 0, 21, 30, 60),
            WearfitProtocol.reminderSchedule(0x53, true, 9, 0, 21, 30, 60)
        )
    }

    @Test
    fun buildsAlarmWithLengthDerivedFromPayload() {
        assertArrayEquals(
            byteArrayOf(
                0xAB.toByte(), 0, 9, 0xFF.toByte(), 0x73, 0x80.toByte(),
                2, 1, 7, 30, 0x7F, 3
            ),
            WearfitProtocol.alarm(
                id = 2,
                enabled = true,
                hour = 7,
                minute = 30,
                repeatMask = 0x7F,
                remindFlags = 3
            )
        )
    }

    @Test
    fun reminderSwitchKeepsWearfitOtherThenControlOrder() {
        assertArrayEquals(
            byteArrayOf(0xAB.toByte(), 0, 5, 0xFF.toByte(), 0xA0.toByte(), 0x80.toByte(), 0x12, 0x34),
            WearfitProtocol.reminderSwitch(otherBits = 0x12, controlBits = 0x34)
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsIncompleteHeartRateZoneConfiguration() {
        WearfitProtocol.heartRateZones(listOf(1, 2, 3))
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsInvalidReminderTime() {
        WearfitProtocol.reminderSchedule(0x53, true, 25, 0, 21, 0, 60)
    }
}
