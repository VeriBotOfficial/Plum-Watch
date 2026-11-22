package com.mbridge.msdk.foundation.same.report;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;

/* compiled from: SocketStack.java */
/* loaded from: classes17.dex */
public class m extends com.mbridge.msdk.tracker.network.toolbox.a {
    private static final AtomicInteger b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final byte f11623a;

    public m(byte b2) {
        this.f11623a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x0136, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0136, blocks: (B:32:0x00ac, B:35:0x00bc, B:38:0x00ce, B:44:0x00eb, B:47:0x0102, B:49:0x0106, B:52:0x011f), top: B:31:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[Catch: all -> 0x0136, TRY_ENTER, TryCatch #1 {all -> 0x0136, blocks: (B:32:0x00ac, B:35:0x00bc, B:38:0x00ce, B:44:0x00eb, B:47:0x0102, B:49:0x0106, B:52:0x011f), top: B:31:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083 A[Catch: all -> 0x013b, TryCatch #3 {all -> 0x013b, blocks: (B:15:0x004d, B:17:0x005e, B:20:0x0062, B:21:0x006a, B:23:0x0077, B:26:0x007b, B:29:0x0084, B:30:0x009c, B:68:0x0083, B:69:0x0092, B:70:0x0067), top: B:14:0x004d }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.tracker.network.toolbox.g a(com.mbridge.msdk.tracker.network.t<?> r12, java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.m.a(com.mbridge.msdk.tracker.network.t, java.util.Map):com.mbridge.msdk.tracker.network.toolbox.g");
    }

    public byte[] a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
