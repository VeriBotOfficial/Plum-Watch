package com.efs.sdk.net.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int r0 = inputStream.read(bArr);
            if (r0 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, r0);
            }
        }
    }
}
