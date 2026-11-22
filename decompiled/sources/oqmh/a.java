package oqmh;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class a<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private Map<K, V> f18752a;
    private boolean b;

    public a() {
        this.f18752a = new HashMap();
        this.b = true;
    }

    public a<K, V> a(K k, V v) {
        if (!this.b) {
            throw new IllegalStateException("Underlying map has already been built");
        }
        if (v == null || ((v instanceof String) && TextUtils.isEmpty((CharSequence) v))) {
            return this;
        }
        this.f18752a.put(k, v);
        return this;
    }

    public a(Map<K, V> map) {
        this.f18752a = map;
        this.b = true;
    }

    public a<K, V> a(Map<K, V> map) {
        if (this.b) {
            if (map != null && !this.f18752a.isEmpty()) {
                this.f18752a.putAll(map);
            }
            return this;
        }
        throw new IllegalStateException("Underlying map has already been built");
    }

    public Map<K, V> a() {
        if (this.b) {
            this.b = false;
            return this.f18752a;
        }
        throw new IllegalStateException("Underlying map has already been built");
    }
}
