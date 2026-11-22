package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class l implements sg.bigo.ads.api.a.g {

    /* renamed from: a, reason: collision with root package name */
    private int f19541a = 2;
    private int b = 3;
    private int c = 5;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f19541a + "," + this.b + "," + this.c);
    }

    @Override // sg.bigo.ads.api.a.g
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f19541a = jSONObject.optInt("id_show_loading", 2);
            this.b = jSONObject.optInt("loading_timeout", 3);
            this.c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final boolean a() {
        return this.f19541a == 2;
    }

    @Override // sg.bigo.ads.api.a.g
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        String[] split;
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString) || (split = readString.split(",")) == null || split.length != 3) {
                return;
            }
            this.f19541a = sg.bigo.ads.common.utils.q.a(split[0], 2);
            this.b = sg.bigo.ads.common.utils.q.a(split[1], 3);
            this.c = sg.bigo.ads.common.utils.q.a(split[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final int c() {
        return this.c;
    }
}
