package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: TIOStreamTransport.java */
/* loaded from: classes2.dex */
public class ce extends cg {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f13827a;
    protected OutputStream b;

    @Override // com.umeng.analytics.pro.cg
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.cg
    public void b() throws ch {
    }

    protected ce() {
        this.f13827a = null;
        this.b = null;
    }

    public ce(InputStream inputStream) {
        this.b = null;
        this.f13827a = inputStream;
    }

    public ce(OutputStream outputStream) {
        this.f13827a = null;
        this.b = outputStream;
    }

    public ce(InputStream inputStream, OutputStream outputStream) {
        this.f13827a = inputStream;
        this.b = outputStream;
    }

    @Override // com.umeng.analytics.pro.cg
    public void c() {
        InputStream inputStream = this.f13827a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f13827a = null;
        }
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public int a(byte[] bArr, int i, int i2) throws ch {
        InputStream inputStream = this.f13827a;
        if (inputStream == null) {
            throw new ch(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new ch(4);
        } catch (IOException e) {
            throw new ch(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public void b(byte[] bArr, int i, int i2) throws ch {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new ch(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new ch(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.cg
    public void d() throws ch {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new ch(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new ch(0, e);
        }
    }
}
