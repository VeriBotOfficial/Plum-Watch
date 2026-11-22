package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class R3 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile R3[] g;

    /* renamed from: a, reason: collision with root package name */
    public O3 f18038a;
    public O3[] b;

    public R3() {
        a();
    }

    public static R3[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (g == null) {
                    g = new R3[0];
                }
            }
        }
        return g;
    }

    public final R3 a() {
        this.f18038a = null;
        this.b = O3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        O3 o3 = this.f18038a;
        if (o3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, o3);
        }
        O3[] o3Arr = this.b;
        if (o3Arr != null && o3Arr.length > 0) {
            int i = 0;
            while (true) {
                O3[] o3Arr2 = this.b;
                if (i >= o3Arr2.length) {
                    break;
                }
                O3 o32 = o3Arr2[i];
                if (o32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, o32) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        O3 o3 = this.f18038a;
        if (o3 != null) {
            codedOutputByteBufferNano.writeMessage(1, o3);
        }
        O3[] o3Arr = this.b;
        if (o3Arr != null && o3Arr.length > 0) {
            int i = 0;
            while (true) {
                O3[] o3Arr2 = this.b;
                if (i >= o3Arr2.length) {
                    break;
                }
                O3 o32 = o3Arr2[i];
                if (o32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, o32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18038a == null) {
                    this.f18038a = new O3();
                }
                codedInputByteBufferNano.readMessage(this.f18038a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                O3[] o3Arr = this.b;
                int length = o3Arr == null ? 0 : o3Arr.length;
                int i = repeatedFieldArrayLength + length;
                O3[] o3Arr2 = new O3[i];
                if (length != 0) {
                    System.arraycopy(o3Arr, 0, o3Arr2, 0, length);
                }
                while (length < i - 1) {
                    O3 o3 = new O3();
                    o3Arr2[length] = o3;
                    codedInputByteBufferNano.readMessage(o3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                O3 o32 = new O3();
                o3Arr2[length] = o32;
                codedInputByteBufferNano.readMessage(o32);
                this.b = o3Arr2;
            }
        }
        return this;
    }

    public static R3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R3().mergeFrom(codedInputByteBufferNano);
    }

    public static R3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R3) MessageNano.mergeFrom(new R3(), bArr);
    }
}
