package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3716z8 extends MessageNano {
    public static volatile C3716z8[] b;

    /* renamed from: a, reason: collision with root package name */
    public C3641w8 f18607a;

    public C3716z8() {
        a();
    }

    public static C3716z8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C3716z8[0];
                }
            }
        }
        return b;
    }

    public final C3716z8 a() {
        this.f18607a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3641w8 c3641w8 = this.f18607a;
        return c3641w8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c3641w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3641w8 c3641w8 = this.f18607a;
        if (c3641w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3641w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3716z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f18607a == null) {
                    this.f18607a = new C3641w8();
                }
                codedInputByteBufferNano.readMessage(this.f18607a);
            }
        }
        return this;
    }

    public static C3716z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3716z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3716z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3716z8) MessageNano.mergeFrom(new C3716z8(), bArr);
    }
}
