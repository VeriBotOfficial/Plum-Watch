package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3516r8 extends MessageNano {
    public static volatile C3516r8[] c;

    /* renamed from: a, reason: collision with root package name */
    public C3492q8[] f18477a;
    public int b;

    public C3516r8() {
        a();
    }

    public static C3516r8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C3516r8[0];
                }
            }
        }
        return c;
    }

    public final C3516r8 a() {
        this.f18477a = C3492q8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3492q8[] c3492q8Arr = this.f18477a;
        if (c3492q8Arr != null && c3492q8Arr.length > 0) {
            int i = 0;
            while (true) {
                C3492q8[] c3492q8Arr2 = this.f18477a;
                if (i >= c3492q8Arr2.length) {
                    break;
                }
                C3492q8 c3492q8 = c3492q8Arr2[i];
                if (c3492q8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3492q8);
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3492q8[] c3492q8Arr = this.f18477a;
        if (c3492q8Arr != null && c3492q8Arr.length > 0) {
            int i = 0;
            while (true) {
                C3492q8[] c3492q8Arr2 = this.f18477a;
                if (i >= c3492q8Arr2.length) {
                    break;
                }
                C3492q8 c3492q8 = c3492q8Arr2[i];
                if (c3492q8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3492q8);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3516r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3492q8[] c3492q8Arr = this.f18477a;
                int length = c3492q8Arr == null ? 0 : c3492q8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3492q8[] c3492q8Arr2 = new C3492q8[i];
                if (length != 0) {
                    System.arraycopy(c3492q8Arr, 0, c3492q8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3492q8 c3492q8 = new C3492q8();
                    c3492q8Arr2[length] = c3492q8;
                    codedInputByteBufferNano.readMessage(c3492q8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3492q8 c3492q82 = new C3492q8();
                c3492q8Arr2[length] = c3492q82;
                codedInputByteBufferNano.readMessage(c3492q82);
                this.f18477a = c3492q8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C3516r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3516r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3516r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3516r8) MessageNano.mergeFrom(new C3516r8(), bArr);
    }
}
