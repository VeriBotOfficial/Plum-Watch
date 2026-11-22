package sg.bigo.ads.ad.interstitial.a.b;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: sg.bigo.ads.ad.interstitial.a.b.a$a, reason: collision with other inner class name */
    public static final class C1035a {

        /* renamed from: a, reason: collision with root package name */
        Set<Integer> f19056a = new HashSet();

        public final void a(sg.bigo.ads.api.core.c cVar, int i, long j) {
            if (this.f19056a.contains(Integer.valueOf(i))) {
                return;
            }
            this.f19056a.add(Integer.valueOf(i));
            sg.bigo.ads.core.d.b.a(cVar, i, j, (String) null, -1, (String) null, (String) null);
        }

        public final void a(sg.bigo.ads.api.core.c cVar, int i, long j, String str, int i2, String str2, String str3) {
            if (this.f19056a.contains(Integer.valueOf(i))) {
                return;
            }
            this.f19056a.add(Integer.valueOf(i));
            sg.bigo.ads.core.d.b.a(cVar, i, j, str, i2, str2, str3);
        }
    }

    View a();

    void a(int i);

    void a(int i, int i2);

    boolean a(Context context);

    boolean b();

    void c();

    void d();

    void e();

    void f();
}
