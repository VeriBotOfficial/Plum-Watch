package sg.bigo.ads.api.core;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public final class m implements sg.bigo.ads.api.a.j, sg.bigo.ads.common.f {

    /* renamed from: a, reason: collision with root package name */
    public long f19542a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeLong(this.f19542a);
    }

    @Override // sg.bigo.ads.api.a.j
    public final boolean a(int i) {
        return (this.f19542a & (1 << i)) != 0;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f19542a = parcel.readLong();
    }

    public final String toString() {
        return "{value=" + this.f19542a + AbstractJsonLexerKt.END_OBJ;
    }
}
