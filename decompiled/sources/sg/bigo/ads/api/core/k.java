package sg.bigo.ads.api.core;

import com.phancy.mini.api.file.FileSystemManager;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class k implements sg.bigo.ads.api.a.f {

    /* renamed from: a, reason: collision with root package name */
    private final int f19540a;
    private final int b;
    private final String c;
    private final String d;

    public k(JSONObject jSONObject) {
        this.f19540a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        this.d = jSONObject.optString(FileSystemManager.DIGEST_MD5);
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f19540a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.c;
    }
}
