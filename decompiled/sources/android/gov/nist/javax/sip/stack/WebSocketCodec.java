package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes.dex */
public class WebSocketCodec {
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private static final byte OPCODE_TEXT = 1;
    private static StackLogger logger = CommonLogger.getLogger(WebSocketCodec.class);
    private static final byte[] trivialMask = {1, 1, 1, 1};
    private final boolean allowExtensions;
    private boolean closeOpcodeReceived;
    private int fragmentedFramesCount;
    private boolean frameFinalFlag;
    private int frameOpcode;
    private long framePayloadLength;
    private int frameRsv;
    private final boolean maskedPayload;
    private int readIndex;
    private byte[] maskingKey = new byte[4];
    private int payloadStartIndex = -1;
    private byte[] decodeBuffer = new byte[2048];
    private int writeIndex = 0;
    private long totalPacketLength = -1;

    public WebSocketCodec(boolean z, boolean z2) {
        this.maskedPayload = z;
        this.allowExtensions = z2;
    }

    private byte readNextByte() {
        int i = this.readIndex;
        if (i >= this.writeIndex) {
            throw new IllegalStateException();
        }
        byte[] bArr = this.decodeBuffer;
        this.readIndex = i + 1;
        return bArr[i];
    }

    public byte[] decode(InputStream inputStream) throws Exception {
        int i;
        long j;
        do {
            int length = this.decodeBuffer.length - this.writeIndex;
            int available = inputStream.available();
            if (available > length - 1) {
                int max = Math.max(this.decodeBuffer.length * 2, available * 4);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Increasing buffer size from " + this.decodeBuffer.length + " avail " + available + " newSize " + max);
                }
                byte[] bArr = new byte[max];
                System.arraycopy(this.decodeBuffer, 0, bArr, 0, this.writeIndex);
                this.decodeBuffer = bArr;
            }
            int read = inputStream.read(this.decodeBuffer, this.writeIndex, length);
            if (read < 0) {
                read = 0;
            }
            this.writeIndex += read;
        } while (inputStream.available() > 0);
        this.readIndex = 0;
        if (this.writeIndex < 4) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Abort decode. Write index is at " + this.writeIndex);
            }
            return null;
        }
        byte readNextByte = readNextByte();
        int i2 = 1;
        this.frameFinalFlag = (readNextByte & 128) != 0;
        this.frameRsv = (readNextByte & BuiltinOptions.ReadVariableOptions) >> 4;
        this.frameOpcode = readNextByte & 15;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Decoding WebSocket Frame opCode=" + this.frameOpcode);
        }
        if (this.frameOpcode == 8) {
            this.closeOpcodeReceived = true;
        }
        byte readNextByte2 = readNextByte();
        boolean z = (readNextByte2 & 128) != 0;
        int i3 = readNextByte2 & Byte.MAX_VALUE;
        if (this.frameRsv != 0 && !this.allowExtensions) {
            protocolViolation("RSV != 0 and no extension negotiated, RSV:" + this.frameRsv);
            return null;
        }
        if (this.maskedPayload && !z) {
            protocolViolation("unmasked client to server frame");
            return null;
        }
        protocolChecks();
        try {
            if (i3 == 126) {
                this.framePayloadLength = ((readNextByte() & 255) << 8) | (readNextByte() & 255);
            } else if (i3 == 127) {
                long j2 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    j2 |= (readNextByte() & 255) << ((7 - i4) * 8);
                }
                this.framePayloadLength = j2;
                if (j2 < 65536) {
                    protocolViolation("invalid data frame length (not using minimal length encoding): " + this.framePayloadLength);
                    return null;
                }
            } else {
                this.framePayloadLength = i3;
            }
            if (this.framePayloadLength < 0) {
                protocolViolation("Negative payload size: " + this.framePayloadLength);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Decoding WebSocket Frame length=" + this.framePayloadLength);
            }
            if (z) {
                for (int i5 = 0; i5 < 4; i5++) {
                    this.maskingKey[i5] = readNextByte();
                }
            }
            int i6 = this.readIndex;
            this.payloadStartIndex = i6;
            long j3 = this.framePayloadLength;
            long j4 = i6 + j3;
            this.totalPacketLength = j4;
            if (this.writeIndex < j4) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Abort decode. Write index is at " + this.writeIndex + " and totalPacketLength is " + this.totalPacketLength);
                }
                return null;
            }
            if (z) {
                unmask(this.decodeBuffer, i6, (int) (i6 + j3));
            }
            long j5 = this.framePayloadLength;
            byte[] bArr2 = new byte[(int) j5];
            System.arraycopy(this.decodeBuffer, this.payloadStartIndex, bArr2, 0, (int) j5);
            while (true) {
                long j6 = i2;
                i = this.writeIndex;
                j = this.totalPacketLength;
                if (j6 >= i - j) {
                    break;
                }
                byte[] bArr3 = this.decodeBuffer;
                bArr3[i2] = bArr3[((int) j) + i2];
                i2++;
            }
            this.writeIndex = (int) (i - j);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("writeIndex = " + this.writeIndex + " " + this.totalPacketLength);
            }
            return bArr2;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    protected static byte[] encode(byte[] bArr, int i, boolean z, boolean z2) throws Exception {
        return encode(bArr, i, z, z2, (byte) 1);
    }

    protected static byte[] encode(byte[] bArr, int i, boolean z, boolean z2, byte b) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Encoding WebSocket Frame opCode=" + ((int) b) + " length=" + length);
        }
        int i2 = ((i % 8) << 4) | (z ? 128 : 0) | (b % 128);
        if (length <= 125) {
            byteArrayOutputStream.write(i2);
            int i3 = (byte) length;
            if (z2) {
                i3 |= 128;
            }
            byteArrayOutputStream.write((byte) i3);
        } else if (length <= 65535) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(z2 ? 254 : 126);
            byteArrayOutputStream.write((byte) (length >>> 8));
            byteArrayOutputStream.write((byte) length);
        } else {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(z2 ? 255 : 127);
            for (int i4 = 0; i4 < 8; i4++) {
                byteArrayOutputStream.write((byte) (length >>> ((7 - i4) * 8)));
            }
        }
        if (z2) {
            byte[] bArr2 = trivialMask;
            byteArrayOutputStream.write(bArr2);
            applyMask(bArr, 0, bArr.length, bArr2);
        }
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream.toByteArray();
    }

    private void unmask(byte[] bArr, int i, int i2) {
        applyMask(bArr, i, i2, this.maskingKey);
    }

    public static void applyMask(byte[] bArr, int i, int i2, byte[] bArr2) {
        for (int i3 = 0; i3 < i2 - i; i3++) {
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3 % 4]);
        }
    }

    private void protocolViolation(String str) {
        throw new RuntimeException(str);
    }

    private void protocolChecks() {
        int i;
        int i2 = this.frameOpcode;
        if (i2 > 7) {
            if (!this.frameFinalFlag) {
                protocolViolation("fragmented control frame");
            }
            int i3 = this.frameOpcode;
            if (i3 == 8 || i3 == 9 || i3 == 10) {
                return;
            }
            protocolViolation("control frame using reserved opcode " + this.frameOpcode);
            return;
        }
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            protocolViolation("data frame using reserved opcode " + this.frameOpcode);
        }
        if (this.fragmentedFramesCount == 0 && this.frameOpcode == 0) {
            protocolViolation("received continuation data frame outside fragmented message");
        }
        if (this.fragmentedFramesCount == 0 || (i = this.frameOpcode) == 0 || i == 9) {
            return;
        }
        protocolViolation("received non-continuation data frame while inside fragmented message");
    }

    public boolean isCloseOpcodeReceived() {
        return this.closeOpcodeReceived;
    }
}
