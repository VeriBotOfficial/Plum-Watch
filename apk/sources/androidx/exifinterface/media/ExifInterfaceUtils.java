package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    private ExifInterfaceUtils() {
    }

    static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int r2 = 0;
        while (true) {
            int r3 = inputStream.read(bArr);
            if (r3 == -1) {
                return r2;
            }
            r2 += r3;
            outputStream.write(bArr, 0, r3);
        }
    }

    static void copy(InputStream inputStream, OutputStream outputStream, int r7) throws IOException {
        byte[] bArr = new byte[8192];
        while (r7 > 0) {
            int r2 = Math.min(r7, 8192);
            int r4 = inputStream.read(bArr, 0, r2);
            if (r4 != r2) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            r7 -= r4;
            outputStream.write(bArr, 0, r4);
        }
    }

    static long[] convertToLongArray(Object obj) {
        if (obj instanceof int[]) {
            int[] r4 = (int[]) obj;
            long[] jArr = new long[r4.length];
            for (int r1 = 0; r1 < r4.length; r1++) {
                jArr[r1] = r4[r1];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int r1 = 0; r1 < bArr2.length; r1++) {
            if (bArr[r1] != bArr2[r1]) {
                return false;
            }
        }
        return true;
    }

    static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    static long parseSubSeconds(String str) {
        try {
            int r0 = Math.min(str.length(), 3);
            long j = Long.parseLong(str.substring(0, r0));
            while (r0 < 3) {
                j *= 10;
                r0++;
            }
            return j;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    static void closeFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Api21Impl.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e(TAG, "Error closing fd.");
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static FileDescriptor dup(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        static long lseek(FileDescriptor fileDescriptor, long j, int r3) throws ErrnoException {
            return Os.lseek(fileDescriptor, j, r3);
        }

        static void close(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }
}
