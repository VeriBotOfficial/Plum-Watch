package sg.bigo.ads.common.h;

import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19620a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    long m;
    public String p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f19621q;
    private c s;
    public int j = 0;
    public int k = 0;
    public long l = 0;
    public boolean n = false;
    public boolean o = false;
    private C1076a r = new C1076a();

    /* renamed from: sg.bigo.ads.common.h.a$a, reason: collision with other inner class name */
    public static class C1076a {

        /* renamed from: a, reason: collision with root package name */
        int f19623a = -1;
        public boolean b = false;

        final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f19623a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(String str, String str2, String str3, boolean z, boolean z2, boolean z3, c cVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z ? 1 : 0;
        this.f = z3;
        this.f19621q = z2;
        String a2 = a();
        long a3 = f.a(a2, 1);
        this.g = a3 <= 0 ? f.a(f.d(a2), 1) : a3;
        String valueOf = String.valueOf(str.hashCode());
        this.f19620a = valueOf;
        this.s = cVar;
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "newInstance mId = " + valueOf + ", savedSize = " + this.g + ", mIsSupportFillTime = " + c());
    }

    public final String a() {
        return this.c + File.separator + this.d;
    }

    public final boolean b() {
        return this.j == 3;
    }

    public final boolean c() {
        c cVar = this.s;
        return cVar != null && cVar.f19637a;
    }

    public final boolean d() {
        c cVar = this.s;
        return cVar != null && cVar.b;
    }

    public final int e() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.c.equals(aVar.c);
    }

    public final int f() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.s;
        if (cVar != null) {
            return cVar.e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.b.endsWith(PictureMimeType.MP4) && this.r.f19623a == -1) {
            if (f.a(f.d(a()))) {
                this.r.f19623a = 1;
            } else {
                this.r.f19623a = 0;
            }
        }
        return this.r.f19623a == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" url = ");
        sb.append(this.b).append(", fileName = ");
        sb.append(this.d).append(", filePath = ");
        sb.append(this.c).append(", downloadCount = ");
        sb.append(this.k).append(", totalSize = ");
        sb.append(this.i).append(", loadedSize = ");
        sb.append(this.g).append(", mState = ");
        sb.append(this.j).append(", mLastDownloadEndTime = ");
        sb.append(this.l).append(", mExt = ");
        sb.append(this.r.a()).append(", contentType = ");
        sb.append(this.p);
        sb.append(" isSupportFillTime = ").append(c());
        sb.append(" adFillTime = ").append(e());
        sb.append(" adCheckProcessTime = ").append(f());
        sb.append(" adCheckMinProcess = ").append(g());
        return sb.toString();
    }
}
