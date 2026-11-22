package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class ii extends il {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f14679a;

    /* renamed from: a, reason: collision with other field name */
    protected OutputStream f921a;

    protected ii() {
        this.f14679a = null;
        this.f921a = null;
    }

    public ii(OutputStream outputStream) {
        this.f14679a = null;
        this.f921a = outputStream;
    }

    @Override // com.xiaomi.push.il
    public int a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f14679a;
        if (inputStream == null) {
            throw new im(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new im(4);
        } catch (IOException e) {
            throw new im(0, e);
        }
    }

    @Override // com.xiaomi.push.il
    /* renamed from: a, reason: collision with other method in class */
    public void mo12353a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f921a;
        if (outputStream == null) {
            throw new im(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new im(0, e);
        }
    }
}
