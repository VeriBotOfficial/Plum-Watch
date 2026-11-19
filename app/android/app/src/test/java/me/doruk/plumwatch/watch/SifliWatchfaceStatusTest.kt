package me.doruk.plumwatch.watch

import org.junit.Assert.assertEquals
import org.junit.Test

class SifliWatchfaceStatusTest {
    @Test
    fun parsesWatchResponseStatusWithoutRequestLengthField() {
        // Response format: message ID (2 bytes), status (2 bytes).
        assertEquals(22, SifliWatchfaceStatus.readResponseStatus(byteArrayOf(3, 0, 22, 0)))
        assertEquals(0, SifliWatchfaceStatus.readResponseStatus(byteArrayOf(7, 0, 0, 0)))
        assertEquals(null, SifliWatchfaceStatus.readResponseStatus(byteArrayOf(7, 0, 0)))
    }

    @Test
    fun mapsPathFailurePrecisely() {
        assertEquals(
            "watch application rejected the destination file path",
            SifliWatchfaceStatus.describe(22)
        )
    }

    @Test
    fun mapsKnownFirmwareFilesystemFailures() {
        assertEquals("watch could not open the destination file", SifliWatchfaceStatus.describe(25))
        assertEquals("watch rejected the file extension", SifliWatchfaceStatus.describe(29))
        assertEquals("watch could not create the destination directory", SifliWatchfaceStatus.describe(30))
        assertEquals("watch does not have enough storage space", SifliWatchfaceStatus.describe(37))
    }

    @Test
    fun unknownValuesRemainExplicitlyUnknown() {
        assertEquals("unknown SiFli receiver error", SifliWatchfaceStatus.describe(99))
    }
}
