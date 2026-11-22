package sg.bigo.ads.common;

import android.content.Context;
import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class e implements f {
    public final Context b;

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f19569a = new Runnable() { // from class: sg.bigo.ads.common.e.1
        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.c(eVar.b);
        }
    };
    public boolean c = false;
    protected boolean d = false;

    public e(Context context) {
        this.b = context;
    }

    private void v() {
        this.c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataSaved, ".concat(String.valueOf(this)));
    }

    protected abstract String a();

    public final void a(long j) {
        sg.bigo.ads.common.n.d.a(this.f19569a);
        if (j <= 0) {
            sg.bigo.ads.common.n.d.a(1, this.f19569a);
        } else {
            sg.bigo.ads.common.n.d.a(1, this.f19569a, j);
        }
    }

    protected void a(Context context) {
        this.c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataLoaded, ".concat(String.valueOf(this)));
    }

    protected abstract String b();

    public final synchronized void b(Context context) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                File file = new File(o.a(context), a());
                this.d = file.exists();
                byte[] b = sg.bigo.ads.common.utils.g.b(file);
                if (b == null) {
                    sg.bigo.ads.common.t.a.a(0, 4, b(), "data file not exist");
                    a(context);
                    return;
                }
                byte[] b2 = sg.bigo.ads.common.utils.o.b(b);
                if (b2 == null) {
                    sg.bigo.ads.common.t.a.a(0, b(), "data decrypt failed length=" + b.length);
                    file.delete();
                    a(context);
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(b2);
                try {
                    int available = byteArrayInputStream2.available();
                    byte[] bArr = new byte[available];
                    byteArrayInputStream2.read(bArr);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, available);
                    obtain.setDataPosition(0);
                    b(obtain);
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused) {
                        sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                    }
                    a(context);
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    sg.bigo.ads.common.t.a.a(0, 5, b(), "DataFile load failed");
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused4) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:20|(2:22|(2:24|(2:26|27))(2:28|(2:30|27)))|(2:31|32)|(4:34|35|(1:39)|41)|42|43|44|45|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.e.c(android.content.Context):void");
    }
}
