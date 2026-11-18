package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    private static int saturatedCast(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    private ByteStreams() {
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int r9) throws IOException {
        int r0 = Math.min(8192, Math.max(128, Integer.highestOneBit(r9) * 2));
        while (r9 < MAX_ARRAY_LEN) {
            int r3 = Math.min(r0, MAX_ARRAY_LEN - r9);
            byte[] bArr = new byte[r3];
            queue.add(bArr);
            int r5 = 0;
            while (r5 < r3) {
                int r6 = inputStream.read(bArr, r5, r3 - r5);
                if (r6 == -1) {
                    return combineBuffers(queue, r9);
                }
                r5 += r6;
                r9 += r6;
            }
            r0 = saturatedCast(((long) r0) * ((long) (r0 < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int r7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == r7) {
            return bArrRemove;
        }
        int length = r7 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, r7);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int r4 = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, r7 - length, r4);
            length -= r4;
        }
        return bArrCopyOf;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    public static InputStream limit(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    private static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            this.mark = -1L;
            this.left = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(this.in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int r3) {
            this.in.mark(r3);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int r0 = this.in.read();
            if (r0 != -1) {
                this.left--;
            }
            return r0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int r8, int r9) throws IOException {
            long j = this.left;
            if (j == 0) {
                return -1;
            }
            int r7 = this.in.read(bArr, r8, (int) Math.min(r9, j));
            if (r7 != -1) {
                this.left -= (long) r7;
            }
            return r7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = this.in.skip(Math.min(j, this.left));
            this.left -= jSkip;
            return jSkip;
        }
    }
}
