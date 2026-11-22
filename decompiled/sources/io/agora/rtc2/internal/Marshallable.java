package io.agora.rtc2.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Marshallable {
    public static final int PROTO_PACKET_SIZE = 8192;
    private ByteBuffer mBuffer;

    public Marshallable() {
        ByteBuffer allocate = ByteBuffer.allocate(8192);
        this.mBuffer = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.mBuffer.position(2);
    }

    public void clear() {
        this.mBuffer.position(10);
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public void marshall(ByteBuffer buf) {
        this.mBuffer = buf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] marshall() {
        int position = (short) this.mBuffer.position();
        this.mBuffer.putShort(0, position);
        byte[] bArr = new byte[position];
        this.mBuffer.position(0);
        this.mBuffer.get(bArr);
        return bArr;
    }

    public byte[] popAll() {
        byte[] bArr = new byte[this.mBuffer.remaining()];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public Boolean popBool() {
        return Boolean.valueOf(this.mBuffer.get() == 1);
    }

    public byte popByte() {
        return this.mBuffer.get();
    }

    public byte[] popBytes() {
        int i = this.mBuffer.getShort();
        byte[] bArr = new byte[0];
        if (i <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        this.mBuffer.get(bArr2);
        return bArr2;
    }

    public byte[] popBytes32() {
        int i = this.mBuffer.getInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public double popDouble() {
        return this.mBuffer.getDouble();
    }

    public int popInt() {
        return this.mBuffer.getInt();
    }

    public long popInt64() {
        return this.mBuffer.getLong();
    }

    public int[] popIntArray() {
        int popInt = popInt();
        int[] iArr = new int[popInt];
        for (int i = 0; i < popInt; i++) {
            iArr[i] = popInt();
        }
        return iArr;
    }

    public short popShort() {
        return this.mBuffer.getShort();
    }

    public short[] popShortArray() {
        int popInt = popInt();
        short[] sArr = new short[popInt];
        for (int i = 0; i < popInt; i++) {
            sArr[i] = popShort();
        }
        return sArr;
    }

    public String popString16() {
        int i = this.mBuffer.getShort();
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String popString16UTF8() {
        int i = this.mBuffer.getShort();
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        this.mBuffer.get(bArr);
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void pushBool(Boolean bool) {
        this.mBuffer.put(bool.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public void pushByte(byte val) {
        this.mBuffer.put(val);
    }

    public void pushBytes(byte[] buf) {
        this.mBuffer.putShort((short) buf.length);
        this.mBuffer.put(buf);
    }

    public void pushBytes32(byte[] buf) {
        this.mBuffer.putInt(buf.length);
        this.mBuffer.put(buf);
    }

    public void pushDouble(double val) {
        this.mBuffer.putDouble(val);
    }

    public void pushInt(int val) {
        this.mBuffer.putInt(val);
    }

    public void pushInt64(long val) {
        this.mBuffer.putLong(val);
    }

    public void pushIntArray(int[] vals) {
        if (vals == null) {
            pushInt(0);
            return;
        }
        pushInt(vals.length);
        for (int i : vals) {
            pushInt(i);
        }
    }

    public void pushIntArray(Integer[] vals) {
        if (vals == null) {
            pushInt(0);
            return;
        }
        pushInt(vals.length);
        for (Integer num : vals) {
            pushInt(num.intValue());
        }
    }

    public void pushShort(short val) {
        this.mBuffer.putShort(val);
    }

    public void pushShortArray(short[] vals) {
        if (vals == null) {
            pushInt(0);
            return;
        }
        pushInt(vals.length);
        for (short s : vals) {
            pushShort(s);
        }
    }

    public void pushString16(String val) {
        if (val == null) {
            this.mBuffer.putShort((short) 0);
            return;
        }
        this.mBuffer.putShort((short) val.getBytes().length);
        if (val.getBytes().length > 0) {
            this.mBuffer.put(val.getBytes());
        }
    }

    public void pushStringArray(ArrayList<String> vals) {
        if (vals == null) {
            pushInt(0);
            return;
        }
        int size = vals.size();
        pushShort((short) size);
        for (int i = 0; i < size; i++) {
            pushBytes(vals.get(i).getBytes());
        }
    }

    public void unmarshall(ByteBuffer buf) {
        this.mBuffer = buf;
    }

    public void unmarshall(byte[] buf) {
        ByteBuffer wrap = ByteBuffer.wrap(buf);
        this.mBuffer = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        popShort();
    }
}
