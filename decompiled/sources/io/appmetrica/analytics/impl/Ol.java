package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Ol extends MessageNano {
    public static volatile Ol[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f18003a;
    public Nl b;

    public Ol() {
        a();
    }

    public static Ol[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new Ol[0];
                }
            }
        }
        return c;
    }

    public final Ol a() {
        this.f18003a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f18003a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f18003a);
        }
        Nl nl = this.b;
        return nl != null ? CodedOutputByteBufferNano.computeMessageSize(2, nl) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f18003a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f18003a);
        }
        Nl nl = this.b;
        if (nl != null) {
            codedOutputByteBufferNano.writeMessage(2, nl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ol mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f18003a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.b == null) {
                    this.b = new Nl();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static Ol b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ol().mergeFrom(codedInputByteBufferNano);
    }

    public static Ol a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ol) MessageNano.mergeFrom(new Ol(), bArr);
    }
}
