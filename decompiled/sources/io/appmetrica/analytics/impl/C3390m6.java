package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3390m6 extends MessageNano {
    public static volatile C3390m6[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f18393a;
    public String b;
    public C3340k6[] c;
    public C3390m6 d;
    public C3390m6[] e;

    public C3390m6() {
        a();
    }

    public static C3390m6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f == null) {
                    f = new C3390m6[0];
                }
            }
        }
        return f;
    }

    public final C3390m6 a() {
        this.f18393a = "";
        this.b = "";
        this.c = C3340k6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f18393a) + super.computeSerializedSize();
        if (!this.b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        C3340k6[] c3340k6Arr = this.c;
        int i = 0;
        if (c3340k6Arr != null && c3340k6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3340k6[] c3340k6Arr2 = this.c;
                if (i2 >= c3340k6Arr2.length) {
                    break;
                }
                C3340k6 c3340k6 = c3340k6Arr2[i2];
                if (c3340k6 != null) {
                    computeStringSize += CodedOutputByteBufferNano.computeMessageSize(3, c3340k6);
                }
                i2++;
            }
        }
        C3390m6 c3390m6 = this.d;
        if (c3390m6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c3390m6);
        }
        C3390m6[] c3390m6Arr = this.e;
        if (c3390m6Arr != null && c3390m6Arr.length > 0) {
            while (true) {
                C3390m6[] c3390m6Arr2 = this.e;
                if (i >= c3390m6Arr2.length) {
                    break;
                }
                C3390m6 c3390m62 = c3390m6Arr2[i];
                if (c3390m62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c3390m62) + computeStringSize;
                }
                i++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f18393a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        C3340k6[] c3340k6Arr = this.c;
        int i = 0;
        if (c3340k6Arr != null && c3340k6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3340k6[] c3340k6Arr2 = this.c;
                if (i2 >= c3340k6Arr2.length) {
                    break;
                }
                C3340k6 c3340k6 = c3340k6Arr2[i2];
                if (c3340k6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3340k6);
                }
                i2++;
            }
        }
        C3390m6 c3390m6 = this.d;
        if (c3390m6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3390m6);
        }
        C3390m6[] c3390m6Arr = this.e;
        if (c3390m6Arr != null && c3390m6Arr.length > 0) {
            while (true) {
                C3390m6[] c3390m6Arr2 = this.e;
                if (i >= c3390m6Arr2.length) {
                    break;
                }
                C3390m6 c3390m62 = c3390m6Arr2[i];
                if (c3390m62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c3390m62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3390m6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f18393a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3340k6[] c3340k6Arr = this.c;
                int length = c3340k6Arr == null ? 0 : c3340k6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C3340k6[] c3340k6Arr2 = new C3340k6[i];
                if (length != 0) {
                    System.arraycopy(c3340k6Arr, 0, c3340k6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C3340k6 c3340k6 = new C3340k6();
                    c3340k6Arr2[length] = c3340k6;
                    codedInputByteBufferNano.readMessage(c3340k6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3340k6 c3340k62 = new C3340k6();
                c3340k6Arr2[length] = c3340k62;
                codedInputByteBufferNano.readMessage(c3340k62);
                this.c = c3340k6Arr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C3390m6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C3390m6[] c3390m6Arr = this.e;
                int length2 = c3390m6Arr == null ? 0 : c3390m6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C3390m6[] c3390m6Arr2 = new C3390m6[i2];
                if (length2 != 0) {
                    System.arraycopy(c3390m6Arr, 0, c3390m6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C3390m6 c3390m6 = new C3390m6();
                    c3390m6Arr2[length2] = c3390m6;
                    codedInputByteBufferNano.readMessage(c3390m6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C3390m6 c3390m62 = new C3390m6();
                c3390m6Arr2[length2] = c3390m62;
                codedInputByteBufferNano.readMessage(c3390m62);
                this.e = c3390m6Arr2;
            }
        }
        return this;
    }

    public static C3390m6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3390m6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3390m6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3390m6) MessageNano.mergeFrom(new C3390m6(), bArr);
    }
}
