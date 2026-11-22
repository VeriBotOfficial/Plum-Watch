package io.appmetrica.analytics.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3432nn {

    /* renamed from: a, reason: collision with root package name */
    public final C3183dn f18421a;
    public final S b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public C3432nn(C3183dn c3183dn, S s, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f18421a = c3183dn;
        this.b = s;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C3183dn c3183dn = this.f18421a;
        if (c3183dn != null) {
            for (C3231fl c3231fl : c3183dn.c) {
                sb.append("at " + c3231fl.f18278a + "." + c3231fl.e + Separators.LPAREN + c3231fl.b + ":" + c3231fl.c + ":" + c3231fl.d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f18421a + "\n" + sb.toString() + AbstractJsonLexerKt.END_OBJ;
    }
}
