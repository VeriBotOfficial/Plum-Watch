package sg.bigo.ads.core.player.a.a;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.core.d.b;

/* loaded from: classes9.dex */
public final class a implements sg.bigo.ads.core.player.a.a {

    /* renamed from: a, reason: collision with root package name */
    public File f20123a;
    public sg.bigo.ads.common.h.a b;
    private RandomAccessFile c;

    public a(sg.bigo.ads.common.h.a aVar) {
        try {
            this.b = aVar;
            File file = new File(aVar.a());
            this.f20123a = file;
            this.f20123a = file.exists() ? this.f20123a : new File(this.f20123a.getParentFile(), f.c(this.f20123a.getName()));
            this.c = new RandomAccessFile(this.f20123a, "r");
        } catch (IOException e) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error using file " + this.f20123a + " as disc cache, error message is : " + e.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized int a(byte[] bArr, long j) {
        int i;
        i = 0;
        try {
            this.c.seek(j);
            i = this.c.read(bArr, 0, 8192);
        } catch (IOException e) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading 8192 bytes with offset " + j + " from file[" + a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e.toString());
        }
        return i;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized long a() {
        long j;
        try {
            j = this.c.length();
        } catch (IOException e) {
            b.a(AuthApiStatusCodes.AUTH_URL_RESOLUTION, 10112, e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading length of file " + this.f20123a + ", error message is : " + e.toString());
            j = 0;
        }
        return j;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized void b() {
        try {
            this.c.close();
        } catch (IOException e) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing file " + this.f20123a + ", error message is : " + e.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized boolean c() {
        return this.b.b();
    }
}
