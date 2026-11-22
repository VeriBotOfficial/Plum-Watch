package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3150cf extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C3150cf[] g;

    /* renamed from: a, reason: collision with root package name */
    public C3100af f18215a;
    public C3125bf[] b;

    public C3150cf() {
        a();
    }

    public static C3150cf[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (g == null) {
                    g = new C3150cf[0];
                }
            }
        }
        return g;
    }

    public final C3150cf a() {
        this.f18215a = null;
        this.b = C3125bf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3100af c3100af = this.f18215a;
        if (c3100af != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3100af);
        }
        C3125bf[] c3125bfArr = this.b;
        if (c3125bfArr != null && c3125bfArr.length > 0) {
            int i = 0;
            while (true) {
                C3125bf[] c3125bfArr2 = this.b;
                if (i >= c3125bfArr2.length) {
                    break;
                }
                C3125bf c3125bf = c3125bfArr2[i];
                if (c3125bf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3125bf) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3100af c3100af = this.f18215a;
        if (c3100af != null) {
            codedOutputByteBufferNano.writeMessage(1, c3100af);
        }
        C3125bf[] c3125bfArr = this.b;
        if (c3125bfArr != null && c3125bfArr.length > 0) {
            int i = 0;
            while (true) {
                C3125bf[] c3125bfArr2 = this.b;
                if (i >= c3125bfArr2.length) {
                    break;
                }
                C3125bf c3125bf = c3125bfArr2[i];
                if (c3125bf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3125bf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3150cf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18215a == null) {
                    this.f18215a = new C3100af();
                }
                codedInputByteBufferNano.readMessage(this.f18215a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3125bf[] c3125bfArr = this.b;
                int length = c3125bfArr == null ? 0 : c3125bfArr.length;
                int i = repeatedFieldArrayLength + length;
                C3125bf[] c3125bfArr2 = new C3125bf[i];
                if (length != 0) {
                    System.arraycopy(c3125bfArr, 0, c3125bfArr2, 0, length);
                }
                while (length < i - 1) {
                    C3125bf c3125bf = new C3125bf();
                    c3125bfArr2[length] = c3125bf;
                    codedInputByteBufferNano.readMessage(c3125bf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3125bf c3125bf2 = new C3125bf();
                c3125bfArr2[length] = c3125bf2;
                codedInputByteBufferNano.readMessage(c3125bf2);
                this.b = c3125bfArr2;
            }
        }
        return this;
    }

    public static C3150cf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3150cf().mergeFrom(codedInputByteBufferNano);
    }

    public static C3150cf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3150cf) MessageNano.mergeFrom(new C3150cf(), bArr);
    }
}
