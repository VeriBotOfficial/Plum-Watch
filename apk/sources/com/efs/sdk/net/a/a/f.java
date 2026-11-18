package com.efs.sdk.net.a.a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public interface f {

    public interface a {
        String a(int r1);

        String b(int r1);

        int e();
    }

    public interface b extends c {
        String b();

        String c();

        byte[] d();
    }

    public interface c extends a {
        String a();
    }

    public interface d extends e {
    }

    public interface e extends a {
        String a();

        int b();
    }

    InputStream a(String str, String str2, String str3, InputStream inputStream);

    void a();

    void a(b bVar);

    void a(d dVar);
}
