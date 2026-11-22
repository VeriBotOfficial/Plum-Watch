package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class s implements sg.bigo.ads.api.a.n {

    /* renamed from: a, reason: collision with root package name */
    private int f19547a = 0;
    private long b = 5000;
    private long c = 21600000;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f19547a + "," + this.b + "," + this.c);
    }

    @Override // sg.bigo.ads.api.a.n
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f19547a = jSONObject.optInt("duration_on", 0);
            this.b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final boolean a() {
        return this.f19547a == 1;
    }

    @Override // sg.bigo.ads.api.a.n
    public final long b() {
        return this.b;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(",");
            if (split.length >= 3) {
                this.f19547a = sg.bigo.ads.common.utils.q.a(split[0], 0);
                this.b = sg.bigo.ads.common.utils.q.a(split[1], 5000L);
                this.c = sg.bigo.ads.common.utils.q.a(split[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final long c() {
        return this.c;
    }
}
