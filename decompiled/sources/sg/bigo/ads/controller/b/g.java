package sg.bigo.ads.controller.b;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* loaded from: classes9.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* renamed from: a, reason: collision with root package name */
    boolean f19845a = true;
    boolean b = false;
    int c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        n.a(parcel, this.f19845a);
        n.a(parcel, this.b);
        parcel.writeInt(this.c);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f19845a;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f19845a = n.b(parcel, true);
        this.f19845a = n.b(parcel, false);
        this.c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.c;
    }

    public final String toString() {
        return "{isNativeVideoClickable=" + this.f19845a + ", isNativeVideoClickable=" + this.f19845a + ", clickTriggerType=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
