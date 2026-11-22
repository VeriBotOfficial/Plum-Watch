package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3317j8 extends MessageNano {
    public static volatile C3317j8[] b;

    /* renamed from: a, reason: collision with root package name */
    public C3342k8 f18339a;

    public C3317j8() {
        a();
    }

    public static C3317j8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C3317j8[0];
                }
            }
        }
        return b;
    }

    public final C3317j8 a() {
        this.f18339a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3342k8 c3342k8 = this.f18339a;
        return c3342k8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c3342k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3342k8 c3342k8 = this.f18339a;
        if (c3342k8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3342k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3317j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f18339a == null) {
                    this.f18339a = new C3342k8();
                }
                codedInputByteBufferNano.readMessage(this.f18339a);
            }
        }
        return this;
    }

    public static C3317j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3317j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3317j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3317j8) MessageNano.mergeFrom(new C3317j8(), bArr);
    }
}
