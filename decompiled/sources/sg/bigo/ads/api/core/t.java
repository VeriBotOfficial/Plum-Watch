package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class t implements sg.bigo.ads.api.a.o {

    /* renamed from: a, reason: collision with root package name */
    private int f19548a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(String.valueOf(this.f19548a));
    }

    @Override // sg.bigo.ads.api.a.o
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f19548a = jSONObject.optInt("ll_on", 0);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(",");
            if (split.length > 0) {
                this.f19548a = sg.bigo.ads.common.utils.q.a(split[0], 0);
            }
        }
    }
}
