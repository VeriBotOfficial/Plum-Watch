package com.xmly.businesssdk.trace.uploader.encoder;

import com.xmly.businesssdk.trace.uploader.formatter.FormattedData;
import java.io.ByteArrayOutputStream;
import java.nio.ByteOrder;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: DataEncoder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/trace/uploader/encoder/DataEncoder;", "", "()V", "compress", "", "globalJson", "", "globalLength", "", "eventData", "encode", "data", "Lcom/xmly/businesssdk/trace/uploader/formatter/FormattedData;", "getLengthAsLittleEndian", "length", "xorEncrypt", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DataEncoder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final byte[] ENCRYPTION_KEY;

    /* compiled from: DataEncoder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/xmly/businesssdk/trace/uploader/encoder/DataEncoder$Companion;", "", "()V", "ENCRYPTION_KEY", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        byte[] bytes = "shfkdlkjf&sdf#13".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ENCRYPTION_KEY = bytes;
    }

    private final byte[] compress(String globalJson, short globalLength, byte[] eventData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(getLengthAsLittleEndian(globalLength));
                gZIPOutputStream.flush();
                byte[] bytes = globalJson.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.write(eventData);
                gZIPOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(gZIPOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } catch (Exception e) {
            throw new RuntimeException("数据压缩失败", e);
        }
    }

    private final byte[] getLengthAsLittleEndian(short length) {
        byte[] bArr = {(byte) (length & 255), (byte) ((length >> 8) & 255)};
        return Intrinsics.areEqual(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN) ? new byte[]{bArr[1], bArr[0]} : bArr;
    }

    private final byte[] xorEncrypt(byte[] data) {
        byte[] bArr = new byte[data.length];
        int length = data.length;
        for (int i = 0; i < length; i++) {
            byte[] bArr2 = ENCRYPTION_KEY;
            int length2 = i % bArr2.length;
            bArr[i] = (byte) (bArr2[length2] ^ data[i]);
        }
        return bArr;
    }

    public final byte[] encode(FormattedData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bytes = data.getGlobalJson().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = data.getEventData().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        return xorEncrypt(compress(data.getGlobalJson(), (short) bytes.length, bytes2));
    }
}
