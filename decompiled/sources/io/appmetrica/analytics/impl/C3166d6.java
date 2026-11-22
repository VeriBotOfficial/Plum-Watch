package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3166d6 extends MessageNano {
    public static volatile C3166d6[] d;

    /* renamed from: a, reason: collision with root package name */
    public C3141c6 f18231a;
    public String b;
    public int c;

    public C3166d6() {
        a();
    }

    public static C3166d6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new C3166d6[0];
                }
            }
        }
        return d;
    }

    public final C3166d6 a() {
        this.f18231a = null;
        this.b = "";
        this.c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3141c6 c3141c6 = this.f18231a;
        if (c3141c6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3141c6);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        int i = this.c;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3141c6 c3141c6 = this.f18231a;
        if (c3141c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3141c6);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        int i = this.c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3166d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18231a == null) {
                    this.f18231a = new C3141c6();
                }
                codedInputByteBufferNano.readMessage(this.f18231a);
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.c = readInt32;
                }
            }
        }
        return this;
    }

    public static C3166d6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3166d6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3166d6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3166d6) MessageNano.mergeFrom(new C3166d6(), bArr);
    }
}
