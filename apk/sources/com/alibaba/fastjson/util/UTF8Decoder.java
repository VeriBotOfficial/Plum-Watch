package com.alibaba.fastjson.util;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes7.dex */
public class UTF8Decoder extends CharsetDecoder {
    private static final Charset charset = Charset.forName("UTF-8");

    private static boolean isMalformed2(int r0, int r1) {
        return (r0 & 30) == 0 || (r1 & 192) != 128;
    }

    private static boolean isMalformed3(int r2, int r3, int r4) {
        return ((r2 != -32 || (r3 & 224) != 128) && (r3 & 192) == 128 && (r4 & 192) == 128) ? false : true;
    }

    private static boolean isMalformed4(int r1, int r2, int r3) {
        return ((r1 & 192) == 128 && (r2 & 192) == 128 && (r3 & 192) == 128) ? false : true;
    }

    private static boolean isNotContinuation(int r1) {
        return (r1 & 192) != 128;
    }

    public UTF8Decoder() {
        super(charset, 1.0f, 1.0f);
    }

    private static CoderResult lookupN(ByteBuffer byteBuffer, int r3) {
        for (int r0 = 1; r0 < r3; r0++) {
            if (isNotContinuation(byteBuffer.get())) {
                return CoderResult.malformedForLength(r0);
            }
        }
        return CoderResult.malformedForLength(r3);
    }

    public static CoderResult malformedN(ByteBuffer byteBuffer, int r10) {
        int r1 = 1;
        if (r10 == 1) {
            byte b = byteBuffer.get();
            if ((b >> 2) == -2) {
                return byteBuffer.remaining() < 4 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 5);
            }
            if ((b >> 1) == -2) {
                if (byteBuffer.remaining() < 5) {
                    return CoderResult.UNDERFLOW;
                }
                return lookupN(byteBuffer, 6);
            }
            return CoderResult.malformedForLength(1);
        }
        if (r10 == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (r10 == 3) {
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if ((b2 != -32 || (b3 & 224) != 128) && !isNotContinuation(b3)) {
                r1 = 2;
            }
            return CoderResult.malformedForLength(r1);
        }
        if (r10 == 4) {
            int r11 = byteBuffer.get() & 255;
            byte b4 = byteBuffer.get();
            int r5 = b4 & 255;
            if (r11 > 244 || ((r11 == 240 && (r5 < 144 || r5 > 191)) || ((r11 == 244 && (b4 & TransmissionUnpacked.HD_VAL_MAGIC_HB) != 128) || isNotContinuation(r5)))) {
                return CoderResult.malformedForLength(1);
            }
            return isNotContinuation(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
        }
        throw new IllegalStateException();
    }

    private static CoderResult malformed(ByteBuffer byteBuffer, int r2, CharBuffer charBuffer, int r4, int r5) {
        byteBuffer.position(r2 - byteBuffer.arrayOffset());
        CoderResult coderResultMalformedN = malformedN(byteBuffer, r5);
        byteBuffer.position(r2);
        charBuffer.position(r4);
        return coderResultMalformedN;
    }

    private static CoderResult xflow(Buffer buffer, int r1, int r2, Buffer buffer2, int r4, int r5) {
        buffer.position(r1);
        buffer2.position(r4);
        return (r5 == 0 || r2 - r1 < r5) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        int r7;
        byte[] bArrArray = byteBuffer.array();
        int r1 = byteBuffer.arrayOffset() + byteBuffer.position();
        int r6 = byteBuffer.arrayOffset() + byteBuffer.limit();
        char[] cArrArray = charBuffer.array();
        int r3 = charBuffer.arrayOffset() + charBuffer.position();
        int r4 = charBuffer.arrayOffset() + charBuffer.limit();
        int r5 = Math.min(r6 - r1, r4 - r3) + r3;
        while (r3 < r5) {
            byte b = bArrArray[r1];
            if (b < 0) {
                break;
            }
            r1++;
            cArrArray[r3] = (char) b;
            r3++;
        }
        int r8 = r1;
        while (true) {
            int r9 = r3;
            while (r8 < r6) {
                byte b2 = bArrArray[r8];
                if (b2 < 0) {
                    if ((b2 >> 5) == -2) {
                        if (r6 - r8 < 2 || r9 >= r4) {
                            return xflow(byteBuffer, r8, r6, charBuffer, r9, 2);
                        }
                        byte b3 = bArrArray[r8 + 1];
                        if (isMalformed2(b2, b3)) {
                            return malformed(byteBuffer, r8, charBuffer, r9, 2);
                        }
                        r7 = r9 + 1;
                        cArrArray[r9] = (char) (((b2 << 6) ^ b3) ^ 3968);
                        r8 += 2;
                    } else if ((b2 >> 4) == -2) {
                        if (r6 - r8 < 3 || r9 >= r4) {
                            return xflow(byteBuffer, r8, r6, charBuffer, r9, 3);
                        }
                        byte b4 = bArrArray[r8 + 1];
                        byte b5 = bArrArray[r8 + 2];
                        if (isMalformed3(b2, b4, b5)) {
                            return malformed(byteBuffer, r8, charBuffer, r9, 3);
                        }
                        r7 = r9 + 1;
                        cArrArray[r9] = (char) ((((b2 << 12) ^ (b4 << 6)) ^ b5) ^ 8064);
                        r8 += 3;
                    } else {
                        if ((b2 >> 3) != -2) {
                            return malformed(byteBuffer, r8, charBuffer, r9, 1);
                        }
                        if (r6 - r8 < 4 || r4 - r9 < 2) {
                            return xflow(byteBuffer, r8, r6, charBuffer, r9, 4);
                        }
                        byte b6 = bArrArray[r8 + 1];
                        byte b7 = bArrArray[r8 + 2];
                        byte b8 = bArrArray[r8 + 3];
                        int r2 = ((b2 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                        if (isMalformed4(b6, b7, b8) || r2 < 65536 || r2 > 1114111) {
                            return malformed(byteBuffer, r8, charBuffer, r9, 4);
                        }
                        int r10 = r9 + 1;
                        int r11 = r2 - 65536;
                        cArrArray[r9] = (char) (((r11 >> 10) & 1023) | 55296);
                        r9 += 2;
                        cArrArray[r10] = (char) ((r11 & 1023) | 56320);
                        r8 += 4;
                    }
                    r9 = r7;
                } else {
                    if (r9 >= r4) {
                        return xflow(byteBuffer, r8, r6, charBuffer, r9, 1);
                    }
                    r3 = r9 + 1;
                    cArrArray[r9] = (char) b2;
                    r8++;
                }
            }
            return xflow(byteBuffer, r8, r6, charBuffer, r9, 0);
        }
    }

    @Override // java.nio.charset.CharsetDecoder
    protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        return decodeArrayLoop(byteBuffer, charBuffer);
    }
}
