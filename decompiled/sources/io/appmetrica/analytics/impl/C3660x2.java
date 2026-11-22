package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3660x2 extends MessageNano {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static volatile C3660x2[] f;

    /* renamed from: a, reason: collision with root package name */
    public C3635w2[] f18573a;
    public boolean b;

    public C3660x2() {
        a();
    }

    public static C3660x2[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f == null) {
                    f = new C3660x2[0];
                }
            }
        }
        return f;
    }

    public final C3660x2 a() {
        this.f18573a = C3635w2.b();
        this.b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3635w2[] c3635w2Arr = this.f18573a;
        if (c3635w2Arr != null && c3635w2Arr.length > 0) {
            int i = 0;
            while (true) {
                C3635w2[] c3635w2Arr2 = this.f18573a;
                if (i >= c3635w2Arr2.length) {
                    break;
                }
                C3635w2 c3635w2 = c3635w2Arr2[i];
                if (c3635w2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3635w2);
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3635w2[] c3635w2Arr = this.f18573a;
        if (c3635w2Arr != null && c3635w2Arr.length > 0) {
            int i = 0;
            while (true) {
                C3635w2[] c3635w2Arr2 = this.f18573a;
                if (i >= c3635w2Arr2.length) {
                    break;
                }
                C3635w2 c3635w2 = c3635w2Arr2[i];
                if (c3635w2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3635w2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3660x2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3635w2[] c3635w2Arr = this.f18573a;
                int length = c3635w2Arr == null ? 0 : c3635w2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3635w2[] c3635w2Arr2 = new C3635w2[i];
                if (length != 0) {
                    System.arraycopy(c3635w2Arr, 0, c3635w2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3635w2 c3635w2 = new C3635w2();
                    c3635w2Arr2[length] = c3635w2;
                    codedInputByteBufferNano.readMessage(c3635w2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3635w2 c3635w22 = new C3635w2();
                c3635w2Arr2[length] = c3635w22;
                codedInputByteBufferNano.readMessage(c3635w22);
                this.f18573a = c3635w2Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C3660x2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3660x2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3660x2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3660x2) MessageNano.mergeFrom(new C3660x2(), bArr);
    }
}
