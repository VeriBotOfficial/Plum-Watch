package com.anythink.core.common.n.b.a.e;

/* JADX INFO: loaded from: classes16.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int l;

    private static /* synthetic */ b[] a() {
        return new b[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    b(int r3) {
        this.l = r3;
    }

    public static b a(int r5) {
        for (b bVar : values()) {
            if (bVar.l == r5) {
                return bVar;
            }
        }
        return null;
    }
}
