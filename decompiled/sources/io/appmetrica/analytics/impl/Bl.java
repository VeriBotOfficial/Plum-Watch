package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class Bl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f17785a;
    public final String b;
    public final Map<String, String> c;
    public final boolean d;
    public final List<String> e;

    public Bl(C3114b4 c3114b4) {
        this(c3114b4.a().d(), c3114b4.a().e(), c3114b4.a().a(), c3114b4.a().i(), c3114b4.a().b());
    }

    public final boolean a(Bl bl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bl mergeFrom(Bl bl) {
        return new Bl((String) WrapUtils.getOrDefaultNullable(this.f17785a, bl.f17785a), (String) WrapUtils.getOrDefaultNullable(this.b, bl.b), (Map) WrapUtils.getOrDefaultNullable(this.c, bl.c), this.d || bl.d, bl.d ? bl.e : this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f17785a + "', installReferrerSource='" + this.b + "', clientClids=" + this.c + ", hasNewCustomHosts=" + this.d + ", newCustomHosts=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public Bl(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f17785a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public Bl() {
        this(null, null, null, false, null);
    }
}
