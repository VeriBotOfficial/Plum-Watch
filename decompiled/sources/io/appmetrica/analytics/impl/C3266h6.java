package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3266h6 extends MessageNano {
    public static volatile C3266h6[] b;

    /* renamed from: a, reason: collision with root package name */
    public String f18303a;

    public C3266h6() {
        a();
    }

    public static C3266h6[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C3266h6[0];
                }
            }
        }
        return b;
    }

    public final C3266h6 a() {
        this.f18303a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f18303a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f18303a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3266h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f18303a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C3266h6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3266h6().mergeFrom(codedInputByteBufferNano);
    }

    public static C3266h6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3266h6) MessageNano.mergeFrom(new C3266h6(), bArr);
    }
}
