package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes7.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int utf8Length(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeUInt(OutputStream outputStream, long j, int r9) throws IOException {
        byte[] bArr = new byte[r9];
        for (int r1 = 0; r1 < r9; r1++) {
            bArr[r1] = (byte) ((j >> (r1 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void writeUInt8(OutputStream outputStream, int r3) throws IOException {
        writeUInt(outputStream, r3, 1);
    }

    static void writeUInt16(OutputStream outputStream, int r3) throws IOException {
        writeUInt(outputStream, r3, 2);
    }

    static void writeUInt32(OutputStream outputStream, long j) throws IOException {
        writeUInt(outputStream, j, 4);
    }

    static void writeString(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static int bitsToBytes(int r0) {
        return ((r0 + 7) & (-8)) / 8;
    }

    static byte[] read(InputStream inputStream, int r4) throws IOException {
        byte[] bArr = new byte[r4];
        int r1 = 0;
        while (r1 < r4) {
            int r2 = inputStream.read(bArr, r1, r4 - r1);
            if (r2 < 0) {
                throw error("Not enough bytes to read: " + r4);
            }
            r1 += r2;
        }
        return bArr;
    }

    static long readUInt(InputStream inputStream, int r7) throws IOException {
        byte[] bArr = read(inputStream, r7);
        long j = 0;
        for (int r2 = 0; r2 < r7; r2++) {
            j += ((long) (bArr[r2] & 255)) << (r2 * 8);
        }
        return j;
    }

    static int readUInt8(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 1);
    }

    static int readUInt16(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 2);
    }

    static long readUInt32(InputStream inputStream) throws IOException {
        return readUInt(inputStream, 4);
    }

    static String readString(InputStream inputStream, int r2) throws IOException {
        return new String(read(inputStream, r2), StandardCharsets.UTF_8);
    }

    static byte[] readCompressed(InputStream inputStream, int r9, int r10) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[r10];
            byte[] bArr2 = new byte[2048];
            int r4 = 0;
            int r5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && r4 < r9) {
                int r6 = inputStream.read(bArr2);
                if (r6 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");
                }
                inflater.setInput(bArr2, 0, r6);
                try {
                    r5 += inflater.inflate(bArr, r5, r10 - r5);
                    r4 += r6;
                } catch (DataFormatException e) {
                    throw error(e.getMessage());
                }
            }
            if (r4 != r9) {
                throw error("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);
            }
            if (!inflater.finished()) {
                throw error("Inflater did not finish");
            }
            inflater.end();
            return bArr;
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    static void writeCompressed(OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    static byte[] compress(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    static void writeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int r1 = inputStream.read(bArr);
            if (r1 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, r1);
            }
        }
    }

    static RuntimeException error(String str) {
        return new IllegalStateException(str);
    }
}
