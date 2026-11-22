package me.doruk.plumwatch.watch

/** Packet builders for command layouts verified in the supplied Wearfit Pro APK. */
internal object WearfitProtocol {
    fun packet(
        commandId: Int,
        data: ByteArray,
        marker: Int = 0xAB,
        separator: Int = 0xFF
    ): ByteArray {
        require(commandId in 0..0xFF) { "Command ID must fit in one byte." }
        require(marker in 0..0xFF) { "Marker must fit in one byte." }
        require(separator in 0..0xFF) { "Separator must fit in one byte." }
        val bodyLength = 2 + data.size
        require(bodyLength <= 0xFFFF) { "Wearfit payload exceeds the protocol length field." }
        return byteArrayOf(
            marker.toByte(),
            (bodyLength ushr 8).toByte(),
            bodyLength.toByte(),
            separator.toByte(),
            commandId.toByte()
        ) + data
    }

    fun enabledSetting(commandId: Int, enabled: Boolean): ByteArray =
        packet(commandId, byteArrayOf(0x80.toByte(), if (enabled) 1 else 0))

    /** Camera mode state: Wearfit's CameraControlAnalyzer expects EA 00 04 00 15 04 state. */
    fun cameraPreviewState(enabled: Boolean): ByteArray =
        packet(
            commandId = 0x15,
            data = byteArrayOf(0x04, if (enabled) 1 else 0),
            marker = 0xEA,
            separator = 0x00
        )

    /** Camera callback state: EA 00 06 00 15 03 followed by three one-byte values. */
    fun cameraPhotoState(first: Int, second: Int, third: Int): ByteArray {
        require(first in 0..255 && second in 0..255 && third in 0..255)
        return packet(
            commandId = 0x15,
            data = byteArrayOf(0x03, first.toByte(), second.toByte(), third.toByte()),
            marker = 0xEA,
            separator = 0x00
        )
    }

    /**
     * Wearfit notification content command. This is separate from notificationDisplay().
     * The APK sends AB .. FF 72 80 <icon/type> <source/type> + UTF-8 body through
     * SplitWriter in 19-byte blocks. Its text helper truncates around 321 UTF-8 bytes.
     */
    fun notificationContent(
        content: String,
        iconType: Int = 34,
        messageType: Int = 2
    ): ByteArray {
        require(iconType in 0..255 && messageType in 0..255)
        val bytes = truncateUtf8(content, 321)
        require(bytes.isNotEmpty()) { "Notification content must not be empty." }
        return packet(
            commandId = 0x72,
            data = byteArrayOf(0x80.toByte(), iconType.toByte(), messageType.toByte()) + bytes,
            marker = 0xAB,
            separator = 0xFF
        )
    }

    private fun truncateUtf8(value: String, maxBytes: Int): ByteArray {
        val output = java.io.ByteArrayOutputStream()
        var index = 0
        while (index < value.length) {
            val charCount = if (
                Character.isHighSurrogate(value[index]) &&
                index + 1 < value.length &&
                Character.isLowSurrogate(value[index + 1])
            ) 2 else 1
            val next = value.substring(index, index + charCount).toByteArray(Charsets.UTF_8)
            if (output.size() + next.size > maxBytes) break
            output.write(next)
            index += charCount
        }
        return output.toByteArray()
    }

    fun notificationDisplay(iconPrompt: Int, show: Boolean, hideDetails: Boolean): ByteArray {
        require(iconPrompt in 0..3)
        return packet(
            commandId = 0x72,
            data = byteArrayOf(0x01, iconPrompt.toByte(), if (show) 1 else 0, if (hideDetails) 1 else 0),
            marker = 0xEA
        )
    }

    fun sleepMode(enabled: Boolean, mode: Int, tracking: Boolean, chargeReminder: Boolean): ByteArray {
        require(mode in 0..2)
        return packet(
            commandId = 0x7F,
            data = byteArrayOf(
                0x01,
                if (enabled) 1 else 0,
                mode.toByte(),
                if (tracking) 1 else 0,
                if (chargeReminder) 1 else 0
            ),
            marker = 0xEA
        )
    }

    fun physicalTraining(
        autoPause: Boolean,
        startPrompt: Boolean,
        stopPrompt: Boolean,
        keyPause: Boolean
    ): ByteArray = packet(
        commandId = 0x01,
        data = byteArrayOf(
            0x01,
            if (autoPause) 1 else 0,
            if (startPrompt) 1 else 0,
            if (stopPrompt) 1 else 0,
            if (keyPause) 1 else 0
        ),
        marker = 0xEA,
        separator = 0x00
    )

    fun heartRateZones(values: List<Int>): ByteArray {
        require(values.size == 8) { "Exactly eight heart-rate thresholds are required." }
        require(values.all { it in 0..255 }) { "Heart-rate thresholds must fit in one byte." }
        return packet(
            commandId = 0xA0,
            data = byteArrayOf(0x00) + values.map { it.toByte() }.toByteArray(),
            marker = 0xEA
        )
    }

    fun reminderSchedule(
        commandId: Int,
        enabled: Boolean,
        startHour: Int,
        startMinute: Int,
        endHour: Int,
        endMinute: Int,
        intervalMinutes: Int
    ): ByteArray {
        require(commandId == 0x75 || commandId == 0x53)
        require(startHour in 0..23 && endHour in 0..23)
        require(startMinute in 0..59 && endMinute in 0..59)
        require(intervalMinutes in 1..255)
        return packet(
            commandId,
            byteArrayOf(
                0x80.toByte(),
                if (enabled) 1 else 0,
                startHour.toByte(),
                startMinute.toByte(),
                endHour.toByte(),
                endMinute.toByte(),
                intervalMinutes.toByte()
            )
        )
    }

    fun alarm(
        id: Int,
        enabled: Boolean,
        hour: Int,
        minute: Int,
        repeatMask: Int,
        remindFlags: Int
    ): ByteArray {
        require(id in 0..7)
        require(hour in 0..23)
        require(minute in 0..59)
        require(repeatMask in 0..0xFF)
        require(remindFlags in 0..3)
        return packet(
            commandId = 0x73,
            data = byteArrayOf(
                0x80.toByte(),
                id.toByte(),
                if (enabled) 1 else 0,
                hour.toByte(),
                minute.toByte(),
                repeatMask.toByte(),
                remindFlags.toByte()
            )
        )
    }

    /** Byte order is confirmed by the APK; the meaning of each individual bit remains model data. */
    fun reminderSwitch(otherBits: Int, controlBits: Int): ByteArray {
        require(otherBits in 0..0xFF && controlBits in 0..0xFF)
        return packet(
            commandId = 0xA0,
            data = byteArrayOf(0x80.toByte(), otherBits.toByte(), controlBits.toByte())
        )
    }
}
