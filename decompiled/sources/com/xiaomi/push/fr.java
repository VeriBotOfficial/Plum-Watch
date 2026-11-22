package com.xiaomi.push;

import android.gov.nist.core.Separators;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class fr extends fp {

    /* renamed from: a, reason: collision with root package name */
    private int f14597a;

    /* renamed from: a, reason: collision with other field name */
    private a f550a;

    /* renamed from: a, reason: collision with other field name */
    private b f551a;
    private String b;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public fr(b bVar) {
        this.f551a = b.available;
        this.b = null;
        this.f14597a = Integer.MIN_VALUE;
        this.f550a = null;
        a(bVar);
    }

    public fr(Bundle bundle) {
        super(bundle);
        this.f551a = b.available;
        this.b = null;
        this.f14597a = Integer.MIN_VALUE;
        this.f550a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f551a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f14597a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f550a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    @Override // com.xiaomi.push.fp
    public Bundle a() {
        Bundle a2 = super.a();
        b bVar = this.f551a;
        if (bVar != null) {
            a2.putString("ext_pres_type", bVar.toString());
        }
        String str = this.b;
        if (str != null) {
            a2.putString("ext_pres_status", str);
        }
        int i = this.f14597a;
        if (i != Integer.MIN_VALUE) {
            a2.putInt("ext_pres_prio", i);
        }
        a aVar = this.f550a;
        if (aVar != null && aVar != a.available) {
            a2.putString("ext_pres_mode", this.f550a.toString());
        }
        return a2;
    }

    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.f551a = bVar;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f14597a = i;
    }

    public void a(a aVar) {
        this.f550a = aVar;
    }

    @Override // com.xiaomi.push.fp
    /* renamed from: a */
    public String mo12164a() {
        StringBuilder sb = new StringBuilder("<presence");
        if (p() != null) {
            sb.append(" xmlns=\"").append(p()).append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"").append(j()).append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"").append(fy.a(l())).append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"").append(fy.a(m())).append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"").append(fy.a(k())).append("\"");
        }
        if (this.f551a != null) {
            sb.append(" type=\"").append(this.f551a).append("\"");
        }
        sb.append(Separators.GREATER_THAN);
        if (this.b != null) {
            sb.append("<status>").append(fy.a(this.b)).append("</status>");
        }
        if (this.f14597a != Integer.MIN_VALUE) {
            sb.append("<priority>").append(this.f14597a).append("</priority>");
        }
        a aVar = this.f550a;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>").append(this.f550a).append("</show>");
        }
        sb.append(o());
        ft a2 = a();
        if (a2 != null) {
            sb.append(a2.m12168a());
        }
        sb.append("</presence>");
        return sb.toString();
    }
}
