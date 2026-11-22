package sg.bigo.ads.core.e;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.u.h;

/* loaded from: classes9.dex */
public final class b {

    public interface a {
        void a();

        boolean a(int i);

        void b();
    }

    private static void a(int i, String str, sg.bigo.ads.common.u.a aVar, String str2, boolean z, int i2, int i3, Map<String, String> map) {
        b(i, str, "start", aVar, str2, z, i2, i3, map, 0, "");
    }

    public static void a(Context context, int i, String str, sg.bigo.ads.common.u.a aVar, String str2, int i2, Map<String, String> map, a aVar2) {
        a(context, i, str, aVar, str2, i2, false, 0, map, aVar2);
    }

    public static void a(Context context, final int i, final String str, final sg.bigo.ads.common.u.a aVar, final String str2, final int i2, final boolean z, final int i3, final Map<String, String> map, final a aVar2) {
        if (sg.bigo.ads.common.x.a.p()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track url = " + aVar.a());
        if (i.f19524a.n().a(9) && URLUtil.isHttpUrl(aVar.a())) {
            b(i, str, "failure", aVar, str2, z, i3, i2, map, 901, "Invalid http url");
            return;
        }
        a(i, str, aVar, str2, z, i3, i2, map);
        sg.bigo.ads.common.u.b.a aVar3 = new sg.bigo.ads.common.u.b.a(aVar, context);
        aVar3.k = e.g();
        g.a(aVar3, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.core.e.b.1
            private final List<Integer> k = new ArrayList();
            private int l = -1;
            private boolean m = false;

            private boolean a(sg.bigo.ads.common.u.b.a aVar4) {
                Iterator<Integer> it = this.k.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    a aVar5 = a.this;
                    if ((aVar5 != null && aVar5.a(intValue)) || super.a((AnonymousClass1) aVar4, intValue)) {
                        this.l = intValue;
                        this.m = true;
                        return true;
                    }
                }
                return false;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.a a(sg.bigo.ads.common.u.c.a aVar4) {
                return aVar4;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.a aVar4, String str3, int i4) {
                super.a(aVar4, str3, i4);
                this.k.add(Integer.valueOf(i4));
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.a aVar4, sg.bigo.ads.common.u.c.a aVar5) {
                sg.bigo.ads.common.u.c.a aVar6 = aVar5;
                a aVar7 = a.this;
                if (aVar7 != null) {
                    aVar7.b();
                }
                b.b(i, str, "success", aVar, str2, z, i3, i2, map, aVar6.f19707a, "success");
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.a aVar4, h hVar) {
                int i4;
                String str3;
                sg.bigo.ads.common.u.a aVar5;
                String str4;
                boolean z2;
                int i5;
                int i6;
                Map map2;
                int i7;
                String str5;
                String str6;
                sg.bigo.ads.common.u.b.a aVar6 = aVar4;
                if (this.m || a(aVar6)) {
                    a aVar7 = a.this;
                    if (aVar7 != null) {
                        aVar7.b();
                    }
                    i4 = i;
                    str3 = str;
                    aVar5 = aVar;
                    str4 = str2;
                    z2 = z;
                    i5 = i3;
                    i6 = i2;
                    map2 = map;
                    i7 = this.l;
                    str5 = "Something wrong occurs when handling the request, but it is still successful";
                    str6 = "success";
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track onError e=" + hVar.getMessage());
                    a aVar8 = a.this;
                    if (aVar8 != null) {
                        aVar8.a();
                    }
                    i4 = i;
                    str3 = str;
                    aVar5 = aVar;
                    str4 = str2;
                    z2 = z;
                    i5 = i3;
                    i6 = i2;
                    map2 = map;
                    i7 = hVar.f19712a;
                    str5 = hVar.getMessage();
                    str6 = "failure";
                }
                b.b(i4, str3, str6, aVar5, str4, z2, i5, i6, map2, i7, str5);
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ boolean a(sg.bigo.ads.common.u.b.a aVar4, int i4) {
                this.k.add(Integer.valueOf(i4));
                return a(aVar4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, String str, String str2, sg.bigo.ads.common.u.a aVar, String str3, boolean z, int i2, int i3, Map<String, String> map, int i4, String str4) {
        HashMap hashMap;
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap = new HashMap(map);
        hashMap.put("action", str);
        hashMap.put("track_url", aVar.a());
        hashMap.put("domain_front", aVar.e() ? aVar.d() : "");
        hashMap.put("track_name", str3);
        hashMap.put("states", str2);
        hashMap.put("src", z ? "1" : "0");
        hashMap.put("res_code", String.valueOf(i4));
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("res_msg", str4);
        hashMap.put("retry", String.valueOf(i2));
        hashMap.put("out_ad", String.valueOf(i3));
        hashMap.put("replace", String.valueOf(i));
        str.hashCode();
        switch (str) {
            case "va_cpn_cli":
            case "va_cli":
            case "click_track":
                sg.bigo.ads.core.d.b.b(hashMap);
                break;
            case "va_cpn_imp":
            case "impl_track":
            case "va_show":
                sg.bigo.ads.core.d.b.a(hashMap);
                break;
            default:
                sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "reportTrack dont report action =".concat(String.valueOf(str)));
                break;
        }
    }
}
