package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ke extends AbstractC3671xd {
    public static final Ne d = new Ne("UUID_RESULT", null);
    public static final Ne e = new Ne("DEVICE_ID_RESULT", null);
    public static final Ne f = new Ne("DEVICE_ID_HASH_RESULT", null);
    public static final Ne g = new Ne("AD_URL_GET_RESULT", null);
    public static final Ne h = new Ne("AD_URL_REPORT_RESULT", null);
    public static final Ne i = new Ne("CUSTOM_HOSTS", null);
    public static final Ne j = new Ne("SERVER_TIME_OFFSET", null);
    public static final Ne k = new Ne("RESPONSE_CLIDS_RESULT", null);
    public static final Ne l = new Ne("CUSTOM_SDK_HOSTS", null);
    public static final Ne m = new Ne("CLIENT_CLIDS", null);
    public static final Ne n = new Ne("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final Ne o = new Ne("API_LEVEL", null);
    public static final Ne p = new Ne("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ne f17937q = new Ne("GAID", null);
    public static final Ne r = new Ne("HOAID", null);
    public static final Ne s = new Ne("YANDEX_ADV_ID", null);
    public static final Ne t = new Ne("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final Ne u = new Ne("SCREEN_INFO", null);
    public static final Ne v = new Ne("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final Ne w = new Ne("FEATURES", null);
    public static final Ne x = new Ne("APPMETRICA_CLIENT_CONFIG", null);

    public Ke(Oa oa) {
        super(oa);
    }

    public final boolean a(boolean z) {
        return this.f17974a.getBoolean(t.b, z);
    }

    public final long b(long j2) {
        return this.f17974a.getLong(j.f17984a, j2);
    }

    public final Ke c(IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(g.b);
    }

    public final IdentifiersResult e() {
        return h(h.b);
    }

    public final Ke f(IdentifiersResult identifiersResult) {
        return a(f17937q.b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(l.b);
    }

    public final IdentifiersResult i() {
        return h(f.b);
    }

    public final IdentifiersResult j() {
        return h(e.b);
    }

    public final C3145ca k() {
        String string = this.f17974a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C3145ca(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C3145ca(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f17937q.b);
    }

    public final IdentifiersResult m() {
        return h(r.b);
    }

    public final long n() {
        return this.f17974a.getLong(p.b, 0L);
    }

    public final IdentifiersResult o() {
        return h(k.b);
    }

    public final ScreenInfo p() {
        return AbstractC3395mb.e(this.f17974a.getString(u.b, null));
    }

    public final IdentifiersResult q() {
        return h(d.b);
    }

    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.f17974a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.f17974a.getBoolean(v.b, false);
    }

    public final Ke u() {
        return (Ke) b(n.b, true);
    }

    public final void v() {
        b(v.b, true);
    }

    public final List<String> g() {
        String string = this.f17974a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC3395mb.b(string);
    }

    public final long a(long j2) {
        return this.f17974a.getLong(o.b, j2);
    }

    public final Ke b(IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    public final Ke c(long j2) {
        return (Ke) b(o.b, j2);
    }

    public final Ke d(IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    public final Ke e(IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    public final AppMetricaConfig f() {
        String string = this.f17974a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult h(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            io.appmetrica.analytics.impl.Oa r1 = r5.f17974a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r1.getString(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "ID"
            java.lang.String r2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r3)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r4)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r6 != 0) goto L36
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L36:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Ke.h(java.lang.String):io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public final Ke i(IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    public final Ke j(IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    public final Ke g(IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    public final Ke a(IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final Ke b(boolean z) {
        return (Ke) b(t.b, z);
    }

    public final Ke d(long j2) {
        return (Ke) b(p.b, j2);
    }

    public final Ke e(long j2) {
        return (Ke) b(j.b, j2);
    }

    public final String i(String str) {
        return this.f17974a.getString(m.b, str);
    }

    public final Ke j(String str) {
        return (Ke) b(m.b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3671xd
    public final String f(String str) {
        return new Ne(str, null).b;
    }

    public final Ke a(List<String> list) {
        return (Ke) b(i.b, In.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final Ke h(IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    public final Ke a(C3145ca c3145ca) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c3145ca.f18212a).put("STATUS", c3145ca.b.getValue()).putOpt("ERROR_EXPLANATION", c3145ca.c);
        } catch (Throwable unused) {
        }
        return (Ke) b(str, jSONObject.toString());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3671xd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Ke g(String str) {
        return (Ke) d(new Ne(str, null).b);
    }

    public final void a(ScreenInfo screenInfo) {
        b(u.b, AbstractC3395mb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(x.b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.Ke a(java.lang.String r5, io.appmetrica.analytics.internal.IdentifiersResult r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f18623id     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "STATUS"
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = r6.status     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.getValue()     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.errorExplanation     // Catch: java.lang.Throwable -> L22
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2d
            r4.b(r5, r6)
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Ke.a(java.lang.String, io.appmetrica.analytics.internal.IdentifiersResult):io.appmetrica.analytics.impl.Ke");
    }
}
