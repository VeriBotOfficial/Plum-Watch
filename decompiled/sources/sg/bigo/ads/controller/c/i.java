package sg.bigo.ads.controller.c;

import com.phancy.mini.api.file.FileSystemManager;
import org.json.JSONObject;
import sg.bigo.ads.api.core.o;

/* loaded from: classes9.dex */
public final class i implements o.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f19859a;
    private final int b;
    private final String c;
    private final String d;

    public i(JSONObject jSONObject) {
        this.f19859a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        this.d = jSONObject.optString(FileSystemManager.DIGEST_MD5);
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int a() {
        return this.f19859a;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final String c() {
        return this.c;
    }
}
