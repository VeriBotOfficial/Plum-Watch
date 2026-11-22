package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.ps0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class qs0 implements ps0, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f16696a;
    private final by1 b;
    private final Context c;
    private final Lazy d;
    private final LinkedHashSet e;

    static final class a extends Lambda implements Function0<SharedPreferences> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return by1.a(qs0.this.b, qs0.this.c, qs0.this.f16696a);
        }
    }

    public qs0(Context context, String fileName, by1 preferencesFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(preferencesFactory, "preferencesFactory");
        this.f16696a = fileName;
        this.b = preferencesFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
        this.d = LazyKt.lazy(new a());
        this.e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final String d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.d.getValue()).getString(key, null);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void clear() {
        ((SharedPreferences) this.d.getValue()).edit().clear().apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final int b(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).contains(key);
        return ((SharedPreferences) this.d.getValue()).getInt(key, i);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final boolean c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.d.getValue()).contains(key);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final Map<String, ?> a() {
        Map<String, ?> all = ((SharedPreferences) this.d.getValue()).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final boolean a(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.d.getValue()).getBoolean(key, z);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final long b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.d.getValue()).getLong(key, 0L);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final Set<String> a(String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.d.getValue()).getStringSet(key, set);
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void b(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().putBoolean(key, z).apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().putInt(key, i).apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().putLong(key, j).apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().putString(key, str).apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(String key, HashSet hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().putStringSet(key, hashSet).apply();
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(ps0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.e.isEmpty()) {
            ((SharedPreferences) this.d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.e.add(new WeakReference(listener));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ps0.a aVar = (ps0.a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ps0
    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.d.getValue()).edit().remove(key).apply();
    }
}
