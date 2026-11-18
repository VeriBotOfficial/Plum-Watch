package com.iflytek.cloud.record;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f11208a;
    private short b;
    private int c;
    private short d;

    public d(File file, int r4) throws IOException {
        a(file, (short) 1, r4, (short) 16);
    }

    private boolean a(File file, short s, int r5, short s2) throws IOException {
        if (file == null) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f11208a = randomAccessFile;
        this.b = s;
        this.c = r5;
        this.d = s2;
        randomAccessFile.write(new byte[44]);
        return true;
    }

    public int b() throws IOException {
        return (int) (this.f11208a.length() - 44);
    }

    public void c() throws IOException {
        this.f11208a.seek(0L);
        a("RIFF");
        a(b() + 36);
        a("WAVE");
        a("fmt ");
        a(16);
        a((short) 1);
        a(this.b);
        a(this.c);
        a(((this.b * this.c) * this.d) / 8);
        a((short) ((this.b * this.d) / 8));
        a(this.d);
        a("data");
        a(b());
    }

    public void a(String str) throws IOException {
        for (int r0 = 0; r0 < str.length(); r0++) {
            this.f11208a.write(str.charAt(r0));
        }
    }

    public void a(int r3) throws IOException {
        this.f11208a.write(r3);
        this.f11208a.write(r3 >> 8);
        this.f11208a.write(r3 >> 16);
        this.f11208a.write(r3 >> 24);
    }

    public void a(short s) throws IOException {
        this.f11208a.write(s);
        this.f11208a.write(s >> 8);
    }

    public void a() throws IOException {
        RandomAccessFile randomAccessFile = this.f11208a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f11208a = null;
        }
    }
}
