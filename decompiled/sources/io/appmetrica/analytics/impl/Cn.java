package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Cn extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static volatile Cn[] i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17803a;
    public int b;
    public Dn c;
    public En d;

    public Cn() {
        a();
    }

    public static Cn[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (i == null) {
                    i = new Cn[0];
                }
            }
        }
        return i;
    }

    public final Cn a() {
        this.f17803a = WireFormatNano.EMPTY_BYTES;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f17803a) + super.computeSerializedSize();
        Dn dn = this.c;
        if (dn != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, dn);
        }
        En en = this.d;
        return en != null ? CodedOutputByteBufferNano.computeMessageSize(4, en) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f17803a);
        codedOutputByteBufferNano.writeInt32(2, this.b);
        Dn dn = this.c;
        if (dn != null) {
            codedOutputByteBufferNano.writeMessage(3, dn);
        }
        En en = this.d;
        if (en != null) {
            codedOutputByteBufferNano.writeMessage(4, en);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f17803a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new Dn();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.d == null) {
                    this.d = new En();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
        return this;
    }

    public static Cn b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Cn().mergeFrom(codedInputByteBufferNano);
    }

    public static Cn a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Cn) MessageNano.mergeFrom(new Cn(), bArr);
    }
}
