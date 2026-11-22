package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.o;

/* loaded from: classes9.dex */
public final class j implements o.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f19860a;
    private final long b;
    private final int c;
    private final long d;

    public j(JSONObject jSONObject) {
        this.f19860a = jSONObject.optInt("video_impression_area_rate", 0);
        this.b = jSONObject.optLong("video_impression_time", 0L);
        this.c = jSONObject.optInt("image_impression_area_rate", 0);
        this.d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int a() {
        return this.f19860a;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int c() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long d() {
        return this.d;
    }
}
