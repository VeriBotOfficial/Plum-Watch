package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3541s8 extends MessageNano {
    public static volatile C3541s8[] c;

    /* renamed from: a, reason: collision with root package name */
    public C3293i8 f18492a;
    public C3293i8[] b;

    public C3541s8() {
        a();
    }

    public static C3541s8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C3541s8[0];
                }
            }
        }
        return c;
    }

    public final C3541s8 a() {
        this.f18492a = null;
        this.b = C3293i8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3293i8 c3293i8 = this.f18492a;
        if (c3293i8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3293i8);
        }
        C3293i8[] c3293i8Arr = this.b;
        if (c3293i8Arr != null && c3293i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C3293i8[] c3293i8Arr2 = this.b;
                if (i >= c3293i8Arr2.length) {
                    break;
                }
                C3293i8 c3293i82 = c3293i8Arr2[i];
                if (c3293i82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3293i82) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3293i8 c3293i8 = this.f18492a;
        if (c3293i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3293i8);
        }
        C3293i8[] c3293i8Arr = this.b;
        if (c3293i8Arr != null && c3293i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C3293i8[] c3293i8Arr2 = this.b;
                if (i >= c3293i8Arr2.length) {
                    break;
                }
                C3293i8 c3293i82 = c3293i8Arr2[i];
                if (c3293i82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3293i82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3541s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18492a == null) {
                    this.f18492a = new C3293i8();
                }
                codedInputByteBufferNano.readMessage(this.f18492a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3293i8[] c3293i8Arr = this.b;
                int length = c3293i8Arr == null ? 0 : c3293i8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3293i8[] c3293i8Arr2 = new C3293i8[i];
                if (length != 0) {
                    System.arraycopy(c3293i8Arr, 0, c3293i8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3293i8 c3293i8 = new C3293i8();
                    c3293i8Arr2[length] = c3293i8;
                    codedInputByteBufferNano.readMessage(c3293i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3293i8 c3293i82 = new C3293i8();
                c3293i8Arr2[length] = c3293i82;
                codedInputByteBufferNano.readMessage(c3293i82);
                this.b = c3293i8Arr2;
            }
        }
        return this;
    }

    public static C3541s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3541s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3541s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3541s8) MessageNano.mergeFrom(new C3541s8(), bArr);
    }
}
