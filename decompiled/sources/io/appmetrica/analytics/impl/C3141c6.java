package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3141c6 extends MessageNano {
    public static volatile C3141c6[] d;

    /* renamed from: a, reason: collision with root package name */
    public C3365l6 f18211a;
    public C3365l6[] b;
    public String c;

    public C3141c6() {
        a();
    }

    public static C3141c6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new C3141c6[0];
                }
            }
        }
        return d;
    }

    public final C3141c6 a() {
        this.f18211a = null;
        this.b = C3365l6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3365l6 c3365l6 = this.f18211a;
        if (c3365l6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3365l6);
        }
        C3365l6[] c3365l6Arr = this.b;
        if (c3365l6Arr != null && c3365l6Arr.length > 0) {
            int i = 0;
            while (true) {
                C3365l6[] c3365l6Arr2 = this.b;
                if (i >= c3365l6Arr2.length) {
                    break;
                }
                C3365l6 c3365l62 = c3365l6Arr2[i];
                if (c3365l62 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3365l62);
                }
                i++;
            }
        }
        return !this.c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3365l6 c3365l6 = this.f18211a;
        if (c3365l6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3365l6);
        }
        C3365l6[] c3365l6Arr = this.b;
        if (c3365l6Arr != null && c3365l6Arr.length > 0) {
            int i = 0;
            while (true) {
                C3365l6[] c3365l6Arr2 = this.b;
                if (i >= c3365l6Arr2.length) {
                    break;
                }
                C3365l6 c3365l62 = c3365l6Arr2[i];
                if (c3365l62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3365l62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3141c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f18211a == null) {
                    this.f18211a = new C3365l6();
                }
                codedInputByteBufferNano.readMessage(this.f18211a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3365l6[] c3365l6Arr = this.b;
                int length = c3365l6Arr == null ? 0 : c3365l6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3365l6[] c3365l6Arr2 = new C3365l6[i];
                if (length != 0) {
                    System.arraycopy(c3365l6Arr, 0, c3365l6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3365l6 c3365l6 = new C3365l6();
                    c3365l6Arr2[length] = c3365l6;
                    codedInputByteBufferNano.readMessage(c3365l6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3365l6 c3365l62 = new C3365l6();
                c3365l6Arr2[length] = c3365l62;
                codedInputByteBufferNano.readMessage(c3365l62);
                this.b = c3365l6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C3141c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3141c6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3141c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3141c6) MessageNano.mergeFrom(new C3141c6(), bArr);
    }
}
