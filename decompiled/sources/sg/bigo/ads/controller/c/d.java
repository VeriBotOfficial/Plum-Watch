package sg.bigo.ads.controller.c;

import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public final class d extends b implements sg.bigo.ads.api.core.i {
    protected i.b D;
    protected final i.a E;
    private boolean F;
    private boolean G;

    protected d(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        super(j, hVar, lVar, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("display");
        if (optJSONObject != null) {
            this.D = new h(optJSONObject);
        }
        this.E = new e(jSONObject);
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean aA() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean au() {
        return a(32);
    }

    @Override // sg.bigo.ads.api.core.i
    public final i.b av() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.i
    public final i.a aw() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.i
    public final void ax() {
        this.F = true;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean ay() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.i
    public final void az() {
        this.G = true;
    }
}
