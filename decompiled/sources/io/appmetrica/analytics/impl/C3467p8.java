package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3467p8 extends MessageNano {
    public static volatile C3467p8[] b;

    /* renamed from: a, reason: collision with root package name */
    public C3417n8 f18447a;

    public C3467p8() {
        a();
    }

    public static C3467p8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C3467p8[0];
                }
            }
        }
        return b;
    }

    public final C3467p8 a() {
        this.f18447a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3417n8 c3417n8 = this.f18447a;
        return c3417n8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c3417n8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3417n8 c3417n8 = this.f18447a;
        if (c3417n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3417n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3467p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f18447a == null) {
                    this.f18447a = new C3417n8();
                }
                codedInputByteBufferNano.readMessage(this.f18447a);
            }
        }
        return this;
    }

    public static C3467p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3467p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3467p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3467p8) MessageNano.mergeFrom(new C3467p8(), bArr);
    }
}
