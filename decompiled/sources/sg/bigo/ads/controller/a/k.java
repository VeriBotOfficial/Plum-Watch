package sg.bigo.ads.controller.a;

import android.os.Parcel;
import sg.bigo.ads.common.n;

/* loaded from: classes9.dex */
public class k implements sg.bigo.ads.common.f {

    /* renamed from: a, reason: collision with root package name */
    String f19832a;
    public boolean b;
    private String c;

    public k() {
    }

    public k(String str, String str2, boolean z) {
        this.c = str;
        this.f19832a = str2;
        this.b = z;
    }

    @Override // sg.bigo.ads.common.f
    public void a(Parcel parcel) {
        parcel.writeString(this.c);
        parcel.writeString(this.f19832a);
        n.a(parcel, this.b);
    }

    @Override // sg.bigo.ads.common.f
    public void b(Parcel parcel) {
        this.c = n.a(parcel, "");
        this.f19832a = n.a(parcel, "");
        this.b = n.b(parcel, false);
    }

    public String toString() {
        return super.toString();
    }
}
