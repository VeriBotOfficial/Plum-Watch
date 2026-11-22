package io.nats.client.support;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class BuilderBase {
    public static final int ALLOCATION_BOUNDARY = 32;
    public static final int DEFAULT_ASCII_ALLOCATION = 32;
    public static final int DEFAULT_OTHER_ALLOCATION = 64;
    public static final byte[] NULL = AbstractJsonLexerKt.NULL.getBytes(StandardCharsets.US_ASCII);
    protected int allocationSize;
    protected final Charset defaultCharset;

    public abstract int appendUnchecked(byte b);

    public abstract int appendUnchecked(byte[] bArr);

    public abstract int appendUnchecked(byte[] bArr, int i, int i2);

    public abstract int capacity();

    public abstract boolean equals(byte[] bArr);

    public abstract byte[] internalArray();

    public abstract int length();

    public abstract byte[] toByteArray();

    protected BuilderBase(Charset charset, int i) {
        this.defaultCharset = charset;
        _setAllocationSize(i);
    }

    protected void _setAllocationSize(int i) {
        int _defaultCharsetAllocationSize = _defaultCharsetAllocationSize();
        if (i <= _defaultCharsetAllocationSize) {
            this.allocationSize = _defaultCharsetAllocationSize;
        } else {
            this.allocationSize = bufferAllocSize(i, 32);
        }
    }

    public int getAllocationSize() {
        return this.allocationSize;
    }

    private int _defaultCharsetAllocationSize() {
        return this.defaultCharset == StandardCharsets.US_ASCII ? 32 : 64;
    }

    public static int bufferAllocSize(int i, int i2) {
        return i < i2 ? i2 : ((i + i2) / i2) * i2;
    }
}
