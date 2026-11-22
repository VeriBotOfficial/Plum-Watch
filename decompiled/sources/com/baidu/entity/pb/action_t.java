package com.baidu.entity.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;

/* loaded from: classes13.dex */
public final class action_t extends MessageMicro {
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private boolean hasKey;
    private boolean hasText;
    private boolean hasValue;
    private int key_ = 0;
    private ByteStringMicro value_ = ByteStringMicro.EMPTY;
    private ByteStringMicro text_ = ByteStringMicro.EMPTY;
    private int cachedSize = -1;

    public static action_t parseFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        return new action_t().mergeFrom(codedInputStreamMicro);
    }

    public static action_t parseFrom(byte[] bArr) throws InvalidProtocolBufferMicroException {
        return (action_t) new action_t().mergeFrom(bArr);
    }

    public final action_t clear() {
        clearKey();
        clearValue();
        clearText();
        this.cachedSize = -1;
        return this;
    }

    public action_t clearKey() {
        this.hasKey = false;
        this.key_ = 0;
        return this;
    }

    public action_t clearText() {
        this.hasText = false;
        this.text_ = ByteStringMicro.EMPTY;
        return this;
    }

    public action_t clearValue() {
        this.hasValue = false;
        this.value_ = ByteStringMicro.EMPTY;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getKey() {
        return this.key_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasKey() ? CodedOutputStreamMicro.computeInt32Size(1, getKey()) : 0;
        if (hasValue()) {
            computeInt32Size += CodedOutputStreamMicro.computeBytesSize(2, getValue());
        }
        if (hasText()) {
            computeInt32Size += CodedOutputStreamMicro.computeBytesSize(3, getText());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public ByteStringMicro getText() {
        return this.text_;
    }

    public ByteStringMicro getValue() {
        return this.value_;
    }

    public boolean hasKey() {
        return this.hasKey;
    }

    public boolean hasText() {
        return this.hasText;
    }

    public boolean hasValue() {
        return this.hasValue;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public action_t mergeFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                setKey(codedInputStreamMicro.readInt32());
            } else if (readTag == 18) {
                setValue(codedInputStreamMicro.readBytes());
            } else if (readTag == 26) {
                setText(codedInputStreamMicro.readBytes());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                break;
            }
        }
        return this;
    }

    public action_t setKey(int i) {
        this.hasKey = true;
        this.key_ = i;
        return this;
    }

    public action_t setText(ByteStringMicro byteStringMicro) {
        this.hasText = true;
        this.text_ = byteStringMicro;
        return this;
    }

    public action_t setValue(ByteStringMicro byteStringMicro) {
        this.hasValue = true;
        this.value_ = byteStringMicro;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) throws IOException {
        if (hasKey()) {
            codedOutputStreamMicro.writeInt32(1, getKey());
        }
        if (hasValue()) {
            codedOutputStreamMicro.writeBytes(2, getValue());
        }
        if (hasText()) {
            codedOutputStreamMicro.writeBytes(3, getText());
        }
    }
}
