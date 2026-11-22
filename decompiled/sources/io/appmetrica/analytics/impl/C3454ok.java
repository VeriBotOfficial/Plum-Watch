package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3454ok extends MessageNano {
    public static volatile C3454ok[] b;

    /* renamed from: a, reason: collision with root package name */
    public C3479pk[] f18436a;

    public C3454ok() {
        a();
    }

    public static C3454ok[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C3454ok[0];
                }
            }
        }
        return b;
    }

    public final C3454ok a() {
        this.f18436a = C3479pk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3479pk[] c3479pkArr = this.f18436a;
        if (c3479pkArr != null && c3479pkArr.length > 0) {
            int i = 0;
            while (true) {
                C3479pk[] c3479pkArr2 = this.f18436a;
                if (i >= c3479pkArr2.length) {
                    break;
                }
                C3479pk c3479pk = c3479pkArr2[i];
                if (c3479pk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3479pk) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3479pk[] c3479pkArr = this.f18436a;
        if (c3479pkArr != null && c3479pkArr.length > 0) {
            int i = 0;
            while (true) {
                C3479pk[] c3479pkArr2 = this.f18436a;
                if (i >= c3479pkArr2.length) {
                    break;
                }
                C3479pk c3479pk = c3479pkArr2[i];
                if (c3479pk != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3479pk);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3454ok mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3479pk[] c3479pkArr = this.f18436a;
                int length = c3479pkArr == null ? 0 : c3479pkArr.length;
                int i = repeatedFieldArrayLength + length;
                C3479pk[] c3479pkArr2 = new C3479pk[i];
                if (length != 0) {
                    System.arraycopy(c3479pkArr, 0, c3479pkArr2, 0, length);
                }
                while (length < i - 1) {
                    C3479pk c3479pk = new C3479pk();
                    c3479pkArr2[length] = c3479pk;
                    codedInputByteBufferNano.readMessage(c3479pk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3479pk c3479pk2 = new C3479pk();
                c3479pkArr2[length] = c3479pk2;
                codedInputByteBufferNano.readMessage(c3479pk2);
                this.f18436a = c3479pkArr2;
            }
        }
        return this;
    }

    public static C3454ok b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3454ok().mergeFrom(codedInputByteBufferNano);
    }

    public static C3454ok a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3454ok) MessageNano.mergeFrom(new C3454ok(), bArr);
    }
}
