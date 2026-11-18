package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class Table {
    protected ByteBuffer bb;
    protected int bb_pos;
    private static final ThreadLocal<CharsetDecoder> UTF8_DECODER = new ThreadLocal<CharsetDecoder>() { // from class: com.google.flatbuffers.Table.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    };
    public static final ThreadLocal<Charset> UTF8_CHARSET = new ThreadLocal<Charset>() { // from class: com.google.flatbuffers.Table.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    };
    private static final ThreadLocal<CharBuffer> CHAR_BUFFER = new ThreadLocal<>();

    protected static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int r2 = 0; r2 < 4; r2++) {
            if (str.charAt(r2) != ((char) byteBuffer.get(byteBuffer.position() + 4 + r2))) {
                return false;
            }
        }
        return true;
    }

    protected static int compareStrings(int r6, int r7, ByteBuffer byteBuffer) {
        int r8 = r6 + byteBuffer.getInt(r6);
        int r9 = r7 + byteBuffer.getInt(r7);
        int r0 = byteBuffer.getInt(r8);
        int r1 = byteBuffer.getInt(r9);
        int r10 = r8 + 4;
        int r11 = r9 + 4;
        int r2 = Math.min(r0, r1);
        byte[] bArrArray = byteBuffer.array();
        for (int r3 = 0; r3 < r2; r3++) {
            byte b = bArrArray[r3 + r10];
            byte b2 = bArrArray[r3 + r11];
            if (b != b2) {
                return b - b2;
            }
        }
        return r0 - r1;
    }

    protected int __indirect(int r2) {
        return r2 + this.bb.getInt(r2);
    }

    protected int __offset(int r3) {
        int r0 = this.bb_pos;
        int r1 = r0 - this.bb.getInt(r0);
        if (r3 < this.bb.getShort(r1)) {
            return this.bb.getShort(r1 + r3);
        }
        return 0;
    }

    protected String __string(int r6) {
        CharsetDecoder charsetDecoder = UTF8_DECODER.get();
        charsetDecoder.reset();
        int r7 = r6 + this.bb.getInt(r6);
        ByteBuffer byteBufferOrder = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int r2 = byteBufferOrder.getInt(r7);
        int r8 = r7 + 4;
        byteBufferOrder.position(r8);
        byteBufferOrder.limit(r8 + r2);
        int r9 = (int) (r2 * charsetDecoder.maxCharsPerByte());
        ThreadLocal<CharBuffer> threadLocal = CHAR_BUFFER;
        CharBuffer charBufferAllocate = threadLocal.get();
        if (charBufferAllocate == null || charBufferAllocate.capacity() < r9) {
            charBufferAllocate = CharBuffer.allocate(r9);
            threadLocal.set(charBufferAllocate);
        }
        charBufferAllocate.clear();
        try {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBufferOrder, charBufferAllocate, true);
            if (!coderResultDecode.isUnderflow()) {
                coderResultDecode.throwException();
            }
            return charBufferAllocate.flip().toString();
        } catch (CharacterCodingException e) {
            throw new Error(e);
        }
    }

    protected Table __union(Table table, int r3) {
        int r4 = r3 + this.bb_pos;
        table.bb_pos = r4 + this.bb.getInt(r4);
        table.bb = this.bb;
        return table;
    }

    protected int __vector(int r2) {
        int r3 = r2 + this.bb_pos;
        return r3 + this.bb.getInt(r3) + 4;
    }

    protected ByteBuffer __vector_as_bytebuffer(int r3, int r4) {
        int r5 = __offset(r3);
        if (r5 == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int r1 = __vector(r5);
        byteBufferOrder.position(r1);
        byteBufferOrder.limit(r1 + (__vector_len(r5) * r4));
        return byteBufferOrder;
    }

    protected int __vector_len(int r2) {
        int r3 = r2 + this.bb_pos;
        return this.bb.getInt(r3 + this.bb.getInt(r3));
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    protected int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected void sortTables(int[] r5, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[r5.length];
        for (int r2 = 0; r2 < r5.length; r2++) {
            numArr[r2] = Integer.valueOf(r5[r2]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: com.google.flatbuffers.Table.3
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int r1 = 0; r1 < r5.length; r1++) {
            r5[r1] = numArr[r1].intValue();
        }
    }

    protected static int __indirect(int r0, ByteBuffer byteBuffer) {
        return r0 + byteBuffer.getInt(r0);
    }

    protected static int __offset(int r1, int r2, ByteBuffer byteBuffer) {
        int length = byteBuffer.array().length - r2;
        return byteBuffer.getShort((r1 + length) - byteBuffer.getInt(length)) + length;
    }

    protected static int compareStrings(int r6, byte[] bArr, ByteBuffer byteBuffer) {
        int r7 = r6 + byteBuffer.getInt(r6);
        int r0 = byteBuffer.getInt(r7);
        int length = bArr.length;
        int r8 = r7 + 4;
        int r2 = Math.min(r0, length);
        byte[] bArrArray = byteBuffer.array();
        for (int r3 = 0; r3 < r2; r3++) {
            byte b = bArrArray[r3 + r8];
            byte b2 = bArr[r3];
            if (b != b2) {
                return b - b2;
            }
        }
        return r0 - length;
    }
}
