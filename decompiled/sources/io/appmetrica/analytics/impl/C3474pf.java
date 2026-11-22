package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3474pf implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final ContentValues f18454a;
    public final ResultReceiver b;
    public static final String c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C3474pf> CREATOR = new C3449of();

    public C3474pf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f18454a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap b = AbstractC3306im.b(map);
            synchronized (this) {
                this.f18454a.put("PROCESS_CFG_CLIDS", AbstractC3395mb.b(b));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f18454a.put("PROCESS_CFG_CUSTOM_HOSTS", In.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f18454a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            j();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f18454a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public final String f() {
        return this.f18454a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer g() {
        return this.f18454a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String h() {
        return this.f18454a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean i() {
        return this.f18454a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void j() {
        this.f18454a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f18454a + ", mDataResultReceiver=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f18454a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC3395mb.c(this.f18454a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final ResultReceiver c() {
        return this.b;
    }

    public final String d() {
        return this.f18454a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public C3474pf(C3474pf c3474pf) {
        synchronized (c3474pf) {
            this.f18454a = new ContentValues(c3474pf.f18454a);
            this.b = c3474pf.b;
        }
    }

    public final ArrayList b() {
        String asString = this.f18454a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC3395mb.b(asString);
    }

    public C3474pf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f18454a = contentValues == null ? new ContentValues() : contentValues;
        this.b = resultReceiver;
    }
}
