package me.doruk.plumwatch.watch

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class SifliSerialProtocolTest {
    @Test
    fun completeMessageUsesLittleEndianHeaders() {
        val frame = SifliSerialProtocol.fragmentMessage(
            messageId = 2,
            payload = byteArrayOf(0x34, 0x12),
            mtu = 247
        ).single()

        assertArrayEquals(
            byteArrayOf(
                0x04, 0x00, 0x06, 0x00,
                0x02, 0x00, 0x02, 0x00, 0x34, 0x12
            ),
            frame
        )
    }

    @Test
    fun fragmentedMessageRoundTripsAtDefaultMtu() {
        val payload = ByteArray(1_200) { (it % 251).toByte() }
        val expected = SifliSerialProtocol.encodeMessage(4, payload)
        val frames = SifliSerialProtocol.fragmentMessage(4, payload, mtu = 23)
        val reassembler = SifliSerialProtocol.Reassembler()

        assertEquals(1, frames.first()[1].toInt())
        assertEquals(3, frames.last()[1].toInt())
        var actual: ByteArray? = null
        frames.forEach { frame ->
            reassembler.accept(frame)?.let { actual = it }
        }
        assertArrayEquals(expected, actual)
    }

    @Test
    fun negotiatedMaxMtuNeverCreatesOversizedGattAttributeValues() {
        val payload = ByteArray(9_000) { (it % 251).toByte() }
        val expected = SifliSerialProtocol.encodeMessage(4, payload)
        val frames = SifliSerialProtocol.fragmentMessage(4, payload, mtu = 517)
        val reassembler = SifliSerialProtocol.Reassembler()

        assertEquals(true, frames.all { it.size <= 512 })
        assertEquals(512, frames.first().size)
        var actual: ByteArray? = null
        frames.forEach { frame ->
            reassembler.accept(frame)?.let { actual = it }
        }
        assertArrayEquals(expected, actual)
    }

    @Test
    fun ignoresOtherCategories() {
        val reassembler = SifliSerialProtocol.Reassembler()
        val otherCategory = byteArrayOf(0x05, 0x00, 0x04, 0x00, 0, 0, 0, 0)
        assertNull(reassembler.accept(otherCategory))
    }

    @Test
    fun rejectsMalformedFirstFragmentAndRecoversForNextMessage() {
        val reassembler = SifliSerialProtocol.Reassembler()
        val incomplete = byteArrayOf(0x04, 0x01, 0x08, 0x00, 1, 2, 3)
        assertNull(reassembler.accept(incomplete))

        // This first fragment claims a four-byte message but carries five bytes.
        val oversizedFirst = byteArrayOf(0x04, 0x01, 0x04, 0x00, 1, 2, 3, 4, 5)
        assertNull(reassembler.accept(oversizedFirst))

        val nextPayload = byteArrayOf(7, 8, 9)
        val expected = SifliSerialProtocol.encodeMessage(3, nextPayload)
        val frames = SifliSerialProtocol.fragmentMessage(3, nextPayload, mtu = 23)
        var actual: ByteArray? = null
        frames.forEach { frame ->
            reassembler.accept(frame)?.let { actual = it }
        }
        assertArrayEquals(expected, actual)
    }
}
