package com.vivo.push.b;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* compiled from: ReporterCommand.java */
/* loaded from: classes2.dex */
public final class y extends com.vivo.push.v {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f14061a;
    private long b;

    public y() {
        super(2012);
    }

    public y(long j) {
        this();
        this.b = j;
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f14061a = hashMap;
    }

    @Override // com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        dVar.a("ReporterCommand.EXTRA_PARAMS", this.f14061a);
        dVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        this.f14061a = (HashMap) dVar.d("ReporterCommand.EXTRA_PARAMS");
        this.b = dVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "ReporterCommand（" + this.b + Separators.RPAREN;
    }

    public final void e() {
        if (this.f14061a == null) {
            com.vivo.push.util.t.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder append = new StringBuilder("report message reportType:").append(this.b).append(",msgId:");
        String str = this.f14061a.get(com.heytap.mcssdk.constant.b.c);
        if (TextUtils.isEmpty(str)) {
            str = this.f14061a.get(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        com.vivo.push.util.t.d("ReporterCommand", append.append(str).toString());
    }
}
