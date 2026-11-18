package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DigestPrintWriter.java */
/* JADX INFO: loaded from: classes16.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f6070a;
    private Charset b;
    private a c;

    /* JADX INFO: compiled from: DigestPrintWriter.java */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.b = null;
        this.f6070a = messageDigest;
        this.c = aVar;
        if (messageDigest != null) {
            this.b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int r2, int r3) {
        super.write(cArr, r2, r3);
        MessageDigest messageDigest = this.f6070a;
        if (messageDigest != null) {
            messageDigest.update(this.b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int r2) {
        super.write(r2);
        MessageDigest messageDigest = this.f6070a;
        if (messageDigest != null) {
            messageDigest.update((byte) r2);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int r4, int r5) {
        super.write(str, r4, r5);
        if (this.f6070a != null) {
            a aVar = this.c;
            if (aVar == null || aVar.a(str)) {
                this.f6070a.update(this.b.encode(CharBuffer.wrap(str, r4, r5 + r4)).array());
            }
        }
    }
}
