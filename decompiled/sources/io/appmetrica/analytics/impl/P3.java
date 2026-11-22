package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class P3 extends MessageNano {
    public static volatile P3[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f18007a;
    public String b;

    public P3() {
        a();
    }

    public static P3[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new P3[0];
                }
            }
        }
        return c;
    }

    public final P3 a() {
        this.f18007a = "";
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f18007a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f18007a);
        }
        return !this.b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f18007a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f18007a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f18007a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static P3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P3().mergeFrom(codedInputByteBufferNano);
    }

    public static P3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P3) MessageNano.mergeFrom(new P3(), bArr);
    }
}
