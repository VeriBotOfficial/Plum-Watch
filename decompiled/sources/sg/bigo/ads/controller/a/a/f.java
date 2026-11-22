package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.ICloneData;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.i;
import sg.bigo.ads.controller.a.k;

/* loaded from: classes9.dex */
public final class f extends g implements sg.bigo.ads.common.f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f19809a = r.c.a(2);
    private long e;
    private List<a> d = c();
    private long b = f19809a;

    static class a extends sg.bigo.ads.controller.a.a.a {
        private static final f.a<a> e = new f.a<a>() { // from class: sg.bigo.ads.controller.a.a.f.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ a a() {
                return new a();
            }
        };
        private String f;

        public a() {
        }

        public a(String str, String str2, boolean z, String str3) {
            super(str, str2, z);
            this.f = str3;
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            super.a(parcel);
            parcel.writeString(this.f);
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            super.b(parcel);
            this.f = n.a(parcel, "");
        }
    }

    private k b(final String str) {
        k kVar;
        synchronized (this) {
            if (!sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
                a aVar = (a) a(sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.1
                    @Override // java.lang.Comparable
                    public final /* synthetic */ int compareTo(a aVar2) {
                        a aVar3 = aVar2;
                        return (aVar3 == null || !aVar3.d || aVar3.b || !TextUtils.equals(aVar3.f, str)) ? 0 : 1;
                    }
                }));
                if (aVar != null) {
                    return aVar;
                }
                List a2 = sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.2
                    @Override // java.lang.Comparable
                    public final /* synthetic */ int compareTo(a aVar2) {
                        a aVar3 = aVar2;
                        return (aVar3 != null && aVar3.d && aVar3.b && TextUtils.equals(aVar3.f, str)) ? 1 : 0;
                    }
                });
                if (sg.bigo.ads.common.utils.k.a((Collection) a2)) {
                    List a3 = sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.3
                        @Override // java.lang.Comparable
                        public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 == null || !aVar3.d || aVar3.b) ? 0 : 1;
                        }
                    });
                    if (sg.bigo.ads.common.utils.k.a((Collection) a3)) {
                        kVar = (a) a(sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.4
                            @Override // java.lang.Comparable
                            public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                a aVar3 = aVar2;
                                return (aVar3 != null && aVar3.d && aVar3.b) ? 1 : 0;
                            }
                        }));
                        if (kVar != null) {
                        }
                    } else {
                        kVar = a((List<k>) a3);
                    }
                } else {
                    kVar = a((List<k>) a2);
                }
                return kVar;
            }
            return null;
        }
    }

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("AWS", "https://ad-host-backup-asia.s3.ap-southeast-1.amazonaws.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new a("AWS", "https://ad-host-backup-europe.s3.eu-central-1.amazonaws.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new a("AWS", "https://ad-host-backup-america.s3.us-west-1.amazonaws.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final k a(String str) {
        if (sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
            return null;
        }
        return b(i.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.b);
            n.a(parcel, this.d);
            parcel.writeLong(this.e);
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            long max = Math.max(jSONObject.optLong(ak.aT, f19809a / 1000) * 1000, c);
            List<a> c = c();
            JSONArray optJSONArray = jSONObject.optJSONArray(ICloneData.URLS);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name", "");
                    String optString2 = optJSONObject.optString("url", "");
                    String optString3 = optJSONObject.optString("region", "");
                    if (URLUtil.isNetworkUrl(optString2)) {
                        c.add(new a(optString, optString2, false, optString3));
                    }
                }
            }
            this.b = max;
            this.d = c;
        }
    }

    public final boolean a() {
        return Math.abs(System.currentTimeMillis() - this.e) > this.b;
    }

    public final void b() {
        this.e = System.currentTimeMillis();
        synchronized (this) {
            if (!sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
                Iterator<a> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().d = true;
                }
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        synchronized (this) {
            this.b = n.a(parcel, f19809a);
            List<a> a2 = n.a(parcel, a.e);
            this.d = a2;
            if (sg.bigo.ads.common.utils.k.a((Collection) a2)) {
                this.d = c();
            }
            this.e = n.a(parcel, 0L);
        }
    }
}
