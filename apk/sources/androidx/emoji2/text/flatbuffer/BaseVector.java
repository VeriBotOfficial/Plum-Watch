package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class BaseVector {
    protected ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    protected int __vector() {
        return this.vector;
    }

    protected int __element(int r3) {
        return this.vector + (r3 * this.element_size);
    }

    protected void __reset(int r1, int r2, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = r1;
            this.length = byteBuffer.getInt(r1 - 4);
            this.element_size = r2;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public void reset() {
        __reset(0, 0, null);
    }

    public int length() {
        return this.length;
    }
}
