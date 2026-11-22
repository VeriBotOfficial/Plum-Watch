package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class O3 extends MessageNano {
    public static volatile O3[] c;

    /* renamed from: a, reason: collision with root package name */
    public Q3 f17992a;
    public int b;

    public O3() {
        a();
    }

    public static O3[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new O3[0];
                }
            }
        }
        return c;
    }

    public final O3 a() {
        this.f17992a = null;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Q3 q3 = this.f17992a;
        if (q3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, q3);
        }
        int i = this.b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Q3 q3 = this.f17992a;
        if (q3 != null) {
            codedOutputByteBufferNano.writeMessage(1, q3);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f17992a == null) {
                    this.f17992a = new Q3();
                }
                codedInputByteBufferNano.readMessage(this.f17992a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.b = readInt32;
                }
            }
        }
        return this;
    }

    public static O3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O3().mergeFrom(codedInputByteBufferNano);
    }

    public static O3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O3) MessageNano.mergeFrom(new O3(), bArr);
    }
}
