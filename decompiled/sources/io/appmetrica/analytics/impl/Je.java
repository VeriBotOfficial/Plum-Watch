package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Je implements Wc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17919a;
    public final String b;
    public final String c;

    public Je(Context context, String str, String str2) {
        this.f17919a = context;
        this.b = str;
        this.c = str2;
    }

    public final Je a(Context context, String str, String str2) {
        return new Je(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je)) {
            return false;
        }
        Je je = (Je) obj;
        return Intrinsics.areEqual(this.f17919a, je.f17919a) && Intrinsics.areEqual(this.b, je.b) && Intrinsics.areEqual(this.c, je.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17919a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f17919a + ", prefName=" + this.b + ", prefValueName=" + this.c + ')';
    }

    public static Je a(Je je, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = je.f17919a;
        }
        if ((i & 2) != 0) {
            str = je.b;
        }
        if ((i & 4) != 0) {
            str2 = je.c;
        }
        je.getClass();
        return new Je(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final String a() {
        String string = this.f17919a.getSharedPreferences(this.b, 0).getString(this.c, "");
        return string == null ? "" : string;
    }
}
