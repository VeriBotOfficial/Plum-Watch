package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Nl extends MessageNano {
    public static volatile Nl[] b;

    /* renamed from: a, reason: collision with root package name */
    public String f17988a;

    public Nl() {
        a();
    }

    public static Nl[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new Nl[0];
                }
            }
        }
        return b;
    }

    public final Nl a() {
        this.f17988a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f17988a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f17988a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f17988a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f17988a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f17988a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Nl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Nl().mergeFrom(codedInputByteBufferNano);
    }

    public static Nl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Nl) MessageNano.mergeFrom(new Nl(), bArr);
    }
}
