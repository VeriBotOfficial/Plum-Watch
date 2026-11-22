package com.hispark.clouddiag.protocol;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HsoMessageProtocol.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/hispark/clouddiag/protocol/HsoMessageProtocol;", "", "<init>", "()V", "HEADER_SIZE", "", "MIN_BODY_SIZE", "SOF", "", "splitCompleteMessagesOrOriginal", "", "", "payload", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HsoMessageProtocol {
    private static final int HEADER_SIZE = 4;
    public static final HsoMessageProtocol INSTANCE = new HsoMessageProtocol();
    private static final int MIN_BODY_SIZE = 2;
    private static final byte SOF = -81;

    private HsoMessageProtocol() {
    }

    public final List<byte[]> splitCompleteMessagesOrOriginal(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length >= 4) {
            int i = 0;
            if (payload[0] == -81) {
                ArrayList arrayList = new ArrayList();
                while (i < payload.length) {
                    int i2 = i + 4;
                    if (i2 > payload.length || payload[i] != -81) {
                        return CollectionsKt.listOf(payload);
                    }
                    int i3 = (payload[i + 2] & 255) | ((payload[i + 3] & 255) << 8);
                    if (i3 < 2) {
                        return CollectionsKt.listOf(payload);
                    }
                    int i4 = i2 + i3;
                    if (i4 > payload.length) {
                        return CollectionsKt.listOf(payload);
                    }
                    arrayList.add(ArraysKt.copyOfRange(payload, i, i4));
                    i = i4;
                }
                return arrayList.size() > 1 ? arrayList : CollectionsKt.listOf(payload);
            }
        }
        return CollectionsKt.listOf(payload);
    }
}
