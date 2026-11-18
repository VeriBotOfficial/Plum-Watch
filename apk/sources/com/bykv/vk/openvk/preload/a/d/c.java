package com.bykv.vk.openvk.preload.a.d;

import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes15.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f9149a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int r0 = 0; r0 <= 31; r0++) {
            f9149a[r0] = String.format("\\u%04x", Integer.valueOf(r0));
        }
        String[] strArr = f9149a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final boolean a() {
        return this.h;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final boolean b() {
        return this.i;
    }

    public final void c(boolean z) {
        this.k = z;
    }

    public final boolean c() {
        return this.k;
    }

    public final c d() throws IOException {
        j();
        return a(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public final c e() throws IOException {
        return a(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public final c f() throws IOException {
        j();
        return a(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public final c g() throws IOException {
        return a(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    private c a(int r1, char c) throws IOException {
        m();
        a(r1);
        this.c.write(c);
        return this;
    }

    private c a(int r2, int r3, char c) throws IOException {
        int i = i();
        if (i != r3 && i != r2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.e--;
        if (i == r3) {
            k();
        }
        this.c.write(c);
        return this;
    }

    private void a(int r4) {
        int r0 = this.e;
        int[] r1 = this.d;
        if (r0 == r1.length) {
            this.d = Arrays.copyOf(r1, r0 << 1);
        }
        int[] r2 = this.d;
        int r3 = this.e;
        this.e = r3 + 1;
        r2[r3] = r4;
    }

    private int i() {
        int r0 = this.e;
        if (r0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.d[r0 - 1];
    }

    private void b(int r3) {
        this.d[this.e - 1] = r3;
    }

    public final c a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = str;
        return this;
    }

    private void j() throws IOException {
        if (this.j != null) {
            l();
            c(this.j);
            this.j = null;
        }
    }

    public final c b(String str) throws IOException {
        if (str == null) {
            return h();
        }
        j();
        m();
        c(str);
        return this;
    }

    public final c h() throws IOException {
        if (this.j != null) {
            if (this.k) {
                j();
            } else {
                this.j = null;
                return this;
            }
        }
        m();
        this.c.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final c d(boolean z) throws IOException {
        j();
        m();
        this.c.write(z ? MediaConstraintKeys.TRUE : "false");
        return this;
    }

    public final c a(Boolean bool) throws IOException {
        if (bool == null) {
            return h();
        }
        j();
        m();
        this.c.write(bool.booleanValue() ? MediaConstraintKeys.TRUE : "false");
        return this;
    }

    public final c a(long j) throws IOException {
        j();
        m();
        this.c.write(Long.toString(j));
        return this;
    }

    public final c a(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        j();
        String string = number.toString();
        if (!this.h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        m();
        this.c.append((CharSequence) string);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
        int r0 = this.e;
        if (r0 > 1 || (r0 == 1 && this.d[r0 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void c(String str) throws IOException {
        String str2;
        String[] strArr = this.i ? b : f9149a;
        this.c.write(34);
        int length = str.length();
        int r4 = 0;
        for (int r3 = 0; r3 < length; r3++) {
            char cCharAt = str.charAt(r3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (r4 < r3) {
                        this.c.write(str, r4, r3 - r4);
                    }
                    this.c.write(str2);
                    r4 = r3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (r4 < r3) {
                    this.c.write(str, r4, r3 - r4);
                }
                this.c.write(str2);
                r4 = r3 + 1;
            }
        }
        if (r4 < length) {
            this.c.write(str, r4, length - r4);
        }
        this.c.write(34);
    }

    private void k() throws IOException {
        if (this.f == null) {
            return;
        }
        this.c.write(10);
        int r0 = this.e;
        for (int r1 = 1; r1 < r0; r1++) {
            this.c.write(this.f);
        }
    }

    private void l() throws IOException {
        int i = i();
        if (i == 5) {
            this.c.write(44);
        } else if (i != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    private void m() throws IOException {
        int i = i();
        if (i == 1) {
            b(2);
            k();
            return;
        }
        if (i == 2) {
            this.c.append(AbstractJsonLexerKt.COMMA);
            k();
        } else {
            if (i != 4) {
                if (i != 6) {
                    if (i == 7) {
                        if (!this.h) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                b(7);
                return;
            }
            this.c.append((CharSequence) this.g);
            b(5);
        }
    }
}
