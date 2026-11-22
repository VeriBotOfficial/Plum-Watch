package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3342k8 extends MessageNano {
    public static volatile C3342k8[] e;

    /* renamed from: a, reason: collision with root package name */
    public C3566t8 f18358a;
    public C3616v8 b;
    public C3392m8 c;
    public C3541s8 d;

    public C3342k8() {
        a();
    }

    public static C3342k8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new C3342k8[0];
                }
            }
        }
        return e;
    }

    public final C3342k8 a() {
        this.f18358a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3566t8 c3566t8 = this.f18358a;
        if (c3566t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3566t8);
        }
        C3616v8 c3616v8 = this.b;
        if (c3616v8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3616v8);
        }
        C3392m8 c3392m8 = this.c;
        if (c3392m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c3392m8);
        }
        C3541s8 c3541s8 = this.d;
        return c3541s8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c3541s8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3566t8 c3566t8 = this.f18358a;
        if (c3566t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3566t8);
        }
        C3616v8 c3616v8 = this.b;
        if (c3616v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3616v8);
        }
        C3392m8 c3392m8 = this.c;
        if (c3392m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c3392m8);
        }
        C3541s8 c3541s8 = this.d;
        if (c3541s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3541s8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3342k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18358a == null) {
                    this.f18358a = new C3566t8();
                }
                codedInputByteBufferNano.readMessage(this.f18358a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C3616v8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C3392m8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.d == null) {
                    this.d = new C3541s8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
        return this;
    }

    public static C3342k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3342k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3342k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3342k8) MessageNano.mergeFrom(new C3342k8(), bArr);
    }
}
