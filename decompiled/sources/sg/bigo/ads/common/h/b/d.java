package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final a f19631a;
    private InputStream b;
    private final File c;
    private final Context d;

    public d(Context context, a aVar) {
        this.d = context;
        this.f19631a = aVar;
        this.c = new File(aVar.b.c, sg.bigo.ads.common.utils.f.c(aVar.b.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r14 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r18.c.length() != r14) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r18.f19631a.e != sg.bigo.ads.common.h.b.h.d) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        r18.c.renameTo(new java.io.File(r18.f19631a.b.c, r18.f19631a.b.d));
        r18.f19631a.e = sg.bigo.ads.common.h.b.h.f;
        r9 = true;
        sg.bigo.ads.common.h.b.f.a().a(r18.f19631a.f19629a);
        a("download is over.");
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.a():void");
    }

    private void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f19631a.f19629a + ", downloadinfo = " + this.f19631a.toString());
    }

    private void b(String str) {
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, str + " , " + this.f19631a.f19629a + " has a error ! " + this.f19631a.toString());
        this.f19631a.f = str;
        this.f19631a.e = h.g;
        f.a().a(this.f19631a.f19629a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (sg.bigo.ads.common.utils.f.c(r7.c) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        b("Failed to create temp file.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.run():void");
    }
}
