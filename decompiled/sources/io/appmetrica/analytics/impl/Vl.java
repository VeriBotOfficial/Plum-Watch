package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Vl extends MessageNano {
    public static volatile Vl[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f18113a;
    public byte[] b;

    public Vl() {
        a();
    }

    public static Vl[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new Vl[0];
                }
            }
        }
        return c;
    }

    public final Vl a() {
        this.f18113a = "";
        this.b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f18113a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f18113a);
        }
        return !Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f18113a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f18113a);
        }
        if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f18113a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Vl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vl().mergeFrom(codedInputByteBufferNano);
    }

    public static Vl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vl) MessageNano.mergeFrom(new Vl(), bArr);
    }
}
