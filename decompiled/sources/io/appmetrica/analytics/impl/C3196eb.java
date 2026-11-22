package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3196eb implements Parcelable {
    public static final Parcelable.Creator<C3196eb> CREATOR = new C3171db();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f18252a;
    public final List b;
    public final HashMap c;

    public C3196eb(I6 i6, List list, Map map) {
        this.b = list;
        this.f18252a = i6;
        this.c = map == null ? new HashMap() : new HashMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f18252a);
        if (this.b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.b));
        }
        HashMap hashMap = this.c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC3306im.a((Map) hashMap));
        }
        parcel.writeBundle(bundle);
    }

    public C3196eb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle != null) {
            this.f18252a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.c = AbstractC3306im.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.c = new HashMap();
    }
}
