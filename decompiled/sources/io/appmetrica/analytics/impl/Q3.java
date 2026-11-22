package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Q3 extends MessageNano {
    public static volatile Q3[] b;

    /* renamed from: a, reason: collision with root package name */
    public P3[] f18022a;

    public Q3() {
        a();
    }

    public static Q3[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new Q3[0];
                }
            }
        }
        return b;
    }

    public final Q3 a() {
        this.f18022a = P3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        P3[] p3Arr = this.f18022a;
        if (p3Arr != null && p3Arr.length > 0) {
            int i = 0;
            while (true) {
                P3[] p3Arr2 = this.f18022a;
                if (i >= p3Arr2.length) {
                    break;
                }
                P3 p3 = p3Arr2[i];
                if (p3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, p3) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        P3[] p3Arr = this.f18022a;
        if (p3Arr != null && p3Arr.length > 0) {
            int i = 0;
            while (true) {
                P3[] p3Arr2 = this.f18022a;
                if (i >= p3Arr2.length) {
                    break;
                }
                P3 p3 = p3Arr2[i];
                if (p3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, p3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                P3[] p3Arr = this.f18022a;
                int length = p3Arr == null ? 0 : p3Arr.length;
                int i = repeatedFieldArrayLength + length;
                P3[] p3Arr2 = new P3[i];
                if (length != 0) {
                    System.arraycopy(p3Arr, 0, p3Arr2, 0, length);
                }
                while (length < i - 1) {
                    P3 p3 = new P3();
                    p3Arr2[length] = p3;
                    codedInputByteBufferNano.readMessage(p3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                P3 p32 = new P3();
                p3Arr2[length] = p32;
                codedInputByteBufferNano.readMessage(p32);
                this.f18022a = p3Arr2;
            }
        }
        return this;
    }

    public static Q3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q3().mergeFrom(codedInputByteBufferNano);
    }

    public static Q3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q3) MessageNano.mergeFrom(new Q3(), bArr);
    }
}
