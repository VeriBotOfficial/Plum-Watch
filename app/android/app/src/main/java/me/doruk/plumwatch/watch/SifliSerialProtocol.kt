package me.doruk.plumwatch.watch

import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

/**
 * Pure codec for the SiFli serial transport used by the watchface service.
 *
 * The transport packet is:
 *   category (1), fragment flag (1), complete-message length (2, first packet only),
 *   payload bytes.
 *
 * A complete inner protocol message contains:
 *   message id (2), payload length (2), payload bytes.
 */
internal object SifliSerialProtocol {
    const val WATCHFACE_CATEGORY = 0x04
    private const val SERIAL_HEADER_SIZE = 4
    private const val CONTINUATION_HEADER_SIZE = 2
    private const val MAX_MESSAGE_LENGTH = 65_535

    fun encodeMessage(messageId: Int, payload: ByteArray): ByteArray {
        require(messageId in 0..0xFFFF) { "SiFli message ID is out of range." }
        require(payload.size + 4 <= MAX_MESSAGE_LENGTH) {
            "SiFli message exceeds the 65,535-byte transport limit."
        }
        return ByteBuffer.allocate(4 + payload.size)
            .order(ByteOrder.LITTLE_ENDIAN)
            .putShort(messageId.toShort())
            .putShort(payload.size.toShort())
            .put(payload)
            .array()
    }

    /**
     * Returns serial frames whose ATT payloads fit within the negotiated MTU.
     * ATT's 3-byte header and the serial transport's 4-byte first-frame header
     * are both accounted for when calculating the fragment capacity.
     */
    fun fragmentMessage(
        messageId: Int,
        payload: ByteArray,
        mtu: Int,
        category: Int = WATCHFACE_CATEGORY
    ): List<ByteArray> {
        require(category in 0..0xFF) { "SiFli category is out of range." }
        val message = encodeMessage(messageId, payload)
        val fragmentCapacity = mtu - 7
        require(fragmentCapacity > 0) { "The negotiated BLE MTU is too small for SiFli transport." }

        if (message.size <= fragmentCapacity) {
            return listOf(
                ByteBuffer.allocate(SERIAL_HEADER_SIZE + message.size)
                    .order(ByteOrder.LITTLE_ENDIAN)
                    .put(category.toByte())
                    .put(0)
                    .putShort(message.size.toShort())
                    .put(message)
                    .array()
            )
        }

        val frames = ArrayList<ByteArray>()
        var offset = 0
        var first = true
        while (offset < message.size) {
            val count = minOf(fragmentCapacity, message.size - offset)
            val flag = when {
                first -> 1
                offset + count == message.size -> 3
                else -> 2
            }
            val headerSize = if (first) SERIAL_HEADER_SIZE else CONTINUATION_HEADER_SIZE
            val frame = ByteArray(headerSize + count)
            frame[0] = category.toByte()
            frame[1] = flag.toByte()
            if (first) {
                frame[2] = (message.size and 0xFF).toByte()
                frame[3] = ((message.size ushr 8) and 0xFF).toByte()
            }
            System.arraycopy(message, offset, frame, headerSize, count)
            frames += frame
            offset += count
            first = false
        }
        return frames
    }

    class Reassembler(
        private val category: Int = WATCHFACE_CATEGORY,
        private val maxMessageLength: Int = MAX_MESSAGE_LENGTH
    ) {
        private var assembly: ByteArrayOutputStream? = null
        private var expectedLength = 0

        fun reset() {
            assembly = null
            expectedLength = 0
        }

        /** Returns one complete inner message, or null while a frame is incomplete/invalid. */
        fun accept(frame: ByteArray): ByteArray? {
            if (frame.size < 2) return null
            if ((frame[0].toInt() and 0xFF) != category) return null

            return when (frame[1].toInt() and 0xFF) {
                0 -> {
                    reset()
                    if (frame.size < SERIAL_HEADER_SIZE) return null
                    val length = readUnsignedShort(frame, 2)
                    if (length <= 0 || frame.size < SERIAL_HEADER_SIZE + length) return null
                    frame.copyOfRange(SERIAL_HEADER_SIZE, SERIAL_HEADER_SIZE + length)
                }
                1 -> {
                    reset()
                    if (frame.size < SERIAL_HEADER_SIZE) return null
                    val length = readUnsignedShort(frame, 2)
                    if (length <= 0 || length > maxMessageLength) return null
                    val buffer = ByteArrayOutputStream(length)
                    buffer.write(frame, SERIAL_HEADER_SIZE, frame.size - SERIAL_HEADER_SIZE)
                    if (buffer.size() > length) {
                        reset()
                        return null
                    }
                    assembly = buffer
                    expectedLength = length
                    null
                }
                2, 3 -> {
                    val buffer = assembly ?: return null
                    if (frame.size > CONTINUATION_HEADER_SIZE) {
                        buffer.write(
                            frame,
                            CONTINUATION_HEADER_SIZE,
                            frame.size - CONTINUATION_HEADER_SIZE
                        )
                    }
                    if (buffer.size() > expectedLength) {
                        reset()
                        return null
                    }
                    if ((frame[1].toInt() and 0xFF) == 3) {
                        val complete = if (buffer.size() == expectedLength) buffer.toByteArray() else null
                        reset()
                        complete
                    } else {
                        null
                    }
                }
                else -> {
                    reset()
                    null
                }
            }
        }

        private fun readUnsignedShort(bytes: ByteArray, offset: Int): Int {
            if (offset < 0 || offset + 1 >= bytes.size) return -1
            return (bytes[offset].toInt() and 0xFF) or
                ((bytes[offset + 1].toInt() and 0xFF) shl 8)
        }
    }
}
