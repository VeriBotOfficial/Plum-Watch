package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3641w8 extends MessageNano {
    public static volatile C3641w8[] e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f18564a;
    public C3367l8 b;
    public byte[] c;
    public C3516r8 d;

    public C3641w8() {
        a();
    }

    public static C3641w8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new C3641w8[0];
                }
            }
        }
        return e;
    }

    public final C3641w8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f18564a = bArr;
        this.b = null;
        this.c = bArr;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f18564a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f18564a);
        }
        C3367l8 c3367l8 = this.b;
        if (c3367l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3367l8);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.c);
        }
        C3516r8 c3516r8 = this.d;
        return c3516r8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c3516r8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f18564a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f18564a);
        }
        C3367l8 c3367l8 = this.b;
        if (c3367l8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3367l8);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.c);
        }
        C3516r8 c3516r8 = this.d;
        if (c3516r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3516r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3641w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f18564a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C3367l8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.d == null) {
                    this.d = new C3516r8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
        return this;
    }

    public static C3641w8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3641w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3641w8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3641w8) MessageNano.mergeFrom(new C3641w8(), bArr);
    }
}
