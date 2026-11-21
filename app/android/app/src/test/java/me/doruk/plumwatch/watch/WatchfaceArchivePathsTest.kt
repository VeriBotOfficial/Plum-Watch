package me.doruk.plumwatch.watch

import java.io.File
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class WatchfaceArchivePathsTest {
    @Test
    fun normalizesZipPathsForTheWatch() {
        assertEquals(
            "/dyn/dynamic_app/watchface/face.dsc",
            WatchfaceArchivePaths.toWatchPath("dyn\\dynamic_app\\watchface\\face.dsc")
        )
        assertEquals(
            "/dyn/dynamic_app/watchface/face.dsc",
            WatchfaceArchivePaths.toWatchPath("/dyn/dynamic_app/watchface/face.dsc")
        )
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsParentDirectoryTraversal() {
        WatchfaceArchivePaths.toWatchPath("dyn/../../private/file")
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsEmptyPathSegments() {
        WatchfaceArchivePaths.toWatchPath("dyn//watchface/file.dsc")
    }

    @Test
    fun localExtractionPathRemainsInsideTemporaryDirectory() {
        val root = File(System.getProperty("java.io.tmpdir"), "plum-watchface-test")
        val destination = WatchfaceArchivePaths.resolveInside(
            root,
            WatchfaceArchivePaths.toWatchPath("dyn/watchface/face.dsc")
        )
        val expected = File(root.canonicalFile, "dyn/watchface/face.dsc").canonicalFile

        assertEquals(expected.path, destination.path)
        assertTrue(destination.path.startsWith(root.canonicalPath + File.separator))
    }
}
