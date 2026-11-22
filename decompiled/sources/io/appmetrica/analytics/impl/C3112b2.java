package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3112b2 extends MessageNano {
    public static volatile C3112b2[] d;

    /* renamed from: a, reason: collision with root package name */
    public C3087a2[] f18192a;
    public Z1 b;
    public String[] c;

    public C3112b2() {
        a();
    }

    public static C3112b2[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new C3112b2[0];
                }
            }
        }
        return d;
    }

    public final C3112b2 a() {
        this.f18192a = C3087a2.b();
        this.b = null;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3087a2[] c3087a2Arr = this.f18192a;
        int i = 0;
        if (c3087a2Arr != null && c3087a2Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3087a2[] c3087a2Arr2 = this.f18192a;
                if (i2 >= c3087a2Arr2.length) {
                    break;
                }
                C3087a2 c3087a2 = c3087a2Arr2[i2];
                if (c3087a2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3087a2);
                }
                i2++;
            }
        }
        Z1 z1 = this.b;
        if (z1 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, z1);
        }
        String[] strArr = this.c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.c;
            if (i >= strArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            String str = strArr2[i];
            if (str != null) {
                i4++;
                i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3087a2[] c3087a2Arr = this.f18192a;
        int i = 0;
        if (c3087a2Arr != null && c3087a2Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3087a2[] c3087a2Arr2 = this.f18192a;
                if (i2 >= c3087a2Arr2.length) {
                    break;
                }
                C3087a2 c3087a2 = c3087a2Arr2[i2];
                if (c3087a2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3087a2);
                }
                i2++;
            }
        }
        Z1 z1 = this.b;
        if (z1 != null) {
            codedOutputByteBufferNano.writeMessage(2, z1);
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3112b2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3087a2[] c3087a2Arr = this.f18192a;
                int length = c3087a2Arr == null ? 0 : c3087a2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3087a2[] c3087a2Arr2 = new C3087a2[i];
                if (length != 0) {
                    System.arraycopy(c3087a2Arr, 0, c3087a2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3087a2 c3087a2 = new C3087a2();
                    c3087a2Arr2[length] = c3087a2;
                    codedInputByteBufferNano.readMessage(c3087a2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3087a2 c3087a22 = new C3087a2();
                c3087a2Arr2[length] = c3087a22;
                codedInputByteBufferNano.readMessage(c3087a22);
                this.f18192a = c3087a2Arr2;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new Z1();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.c = strArr2;
            }
        }
        return this;
    }

    public static C3112b2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3112b2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3112b2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3112b2) MessageNano.mergeFrom(new C3112b2(), bArr);
    }
}
