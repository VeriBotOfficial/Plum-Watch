package com.bytedance.adsdk.kg.gff;

import android.util.Pair;

/* loaded from: classes13.dex */
public class sg<T> {
    T fxn;
    T kg;

    public void fxn(T t, T t2) {
        this.fxn = t;
        this.kg = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return kg(pair.first, this.fxn) && kg(pair.second, this.kg);
    }

    private static boolean kg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.fxn;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.kg;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.fxn + " " + this.kg + "}";
    }
}
