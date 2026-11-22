package sg.bigo.ads.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class g {
    public static File a(File file) {
        return new File(file.getPath() + ".bak");
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream3 = byteArrayOutputStream2.toString();
                        a((Closeable) inputStream);
                        a(byteArrayOutputStream2);
                        return byteArrayOutputStream3;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
            } catch (IOException unused) {
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                return "";
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.io.File r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.g.b(java.io.File):byte[]");
    }
}
