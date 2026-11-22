package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.heytap.mcssdk.constant.MessageConstant;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3091a6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C3091a6> CREATOR = new Z5();

    /* renamed from: a, reason: collision with root package name */
    protected String f18179a;
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public EnumC3344ka k;
    public EnumC3542s9 l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p;

    public C3091a6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(Bundle bundle) {
        this.m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    public final String f() {
        return this.c;
    }

    public final EnumC3344ka g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f18179a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.o;
    }

    public final Bundle i() {
        return this.m;
    }

    public final String j() {
        return this.h;
    }

    public final EnumC3542s9 k() {
        return this.l;
    }

    public final boolean l() {
        return this.f18179a == null;
    }

    public final boolean m() {
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        return -1 == this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f18179a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f18179a;
        String str2 = EnumC3271hb.a(this.d).b;
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f18179a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.f18361a);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        EnumC3542s9 enumC3542s9 = this.l;
        if (enumC3542s9 != null) {
            bundle.putInt("CounterReport.Source", enumC3542s9.f18493a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }

    public C3091a6(String str, int i) {
        this("", str, i);
    }

    public static C3091a6 e(C3091a6 c3091a6) {
        return a(c3091a6, EnumC3271hb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C3091a6(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final Boolean c() {
        return this.n;
    }

    public C3091a6(String str, String str2, int i, SystemTimeProvider systemTimeProvider) {
        this.k = EnumC3344ka.UNKNOWN;
        this.p = new HashMap();
        this.f18179a = str2;
        this.d = i;
        this.b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    public static C3091a6 b(Bundle bundle) {
        if (bundle != null) {
            try {
                C3091a6 c3091a6 = (C3091a6) bundle.getParcelable("CounterReport.Object");
                if (c3091a6 != null) {
                    return c3091a6;
                }
            } catch (Throwable unused) {
                return new C3091a6("", 0);
            }
        }
        return new C3091a6("", 0);
    }

    public static C3091a6 c(C3091a6 c3091a6) {
        return a(c3091a6, EnumC3271hb.EVENT_TYPE_INIT);
    }

    public static C3091a6 d(C3091a6 c3091a6) {
        C3091a6 c3091a62 = new C3091a6("", 0);
        c3091a62.j = c3091a6.j;
        c3091a62.i = c3091a6.i;
        c3091a62.f = c3091a6.f;
        c3091a62.c = c3091a6.c;
        c3091a62.m = c3091a6.m;
        c3091a62.p = c3091a6.p;
        c3091a62.h = c3091a6.h;
        return c3091a62;
    }

    public final void a(EnumC3344ka enumC3344ka) {
        this.k = enumC3344ka;
    }

    public final void a(EnumC3542s9 enumC3542s9) {
        this.l = enumC3542s9;
    }

    public final void a(Boolean bool) {
        this.n = bool;
    }

    public final void a(Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static C3091a6 a(C3091a6 c3091a6, EnumC3271hb enumC3271hb) {
        C3091a6 d = d(c3091a6);
        d.d = enumC3271hb.f18307a;
        return d;
    }

    public static C3091a6 b(C3091a6 c3091a6) {
        return a(c3091a6, EnumC3271hb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C3091a6 a(C3091a6 c3091a6) {
        return a(c3091a6, EnumC3271hb.EVENT_TYPE_ALIVE);
    }

    public static C3091a6 a(C3091a6 c3091a6, T9 t9) {
        C3091a6 a2 = a(c3091a6, EnumC3271hb.EVENT_TYPE_START);
        a2.setValueBytes(MessageNano.toByteArray(new C3617v9().fromModel(new C3592u9((String) t9.b.a()))));
        a2.j = c3091a6.j;
        a2.i = c3091a6.i;
        return a2;
    }

    public static C3091a6 a(C3091a6 c3091a6, Collection<PermissionState> collection, H2 h2, C3237g2 c3237g2, List<String> list) {
        String str;
        String str2;
        C3091a6 d = d(c3091a6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (h2 != null) {
                jSONObject.put("background_restricted", h2.b);
                G2 g2 = h2.f17881a;
                c3237g2.getClass();
                if (g2 != null) {
                    int ordinal = g2.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        d.d = MessageConstant.CommandId.COMMAND_BASE;
        d.setValue(str);
        return d;
    }

    public static C3091a6 a(C3091a6 c3091a6, String str) {
        C3091a6 d = d(c3091a6);
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        d.d = 12289;
        d.setValue(str);
        return d;
    }

    public static C3091a6 a() {
        C3091a6 c3091a6 = new C3091a6("", 0);
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        c3091a6.d = 16384;
        return c3091a6;
    }

    public static C3091a6 a(C3573tf c3573tf) {
        String str = "";
        int i = 0;
        C3091a6 c3091a6 = new C3091a6("", "", 0);
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        c3091a6.d = 40976;
        ProductInfo productInfo = c3573tf.f18514a;
        Ci ci = new Ci();
        ci.f17801a = productInfo.quantity;
        ci.f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        ci.b = str.getBytes();
        ci.c = productInfo.sku.getBytes();
        C3676xi c3676xi = new C3676xi();
        c3676xi.f18580a = productInfo.purchaseOriginalJson.getBytes();
        c3676xi.b = productInfo.signature.getBytes();
        ci.e = c3676xi;
        ci.g = true;
        ci.h = 1;
        ci.i = AbstractC3548sf.f18494a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        Bi bi = new Bi();
        bi.f17784a = productInfo.purchaseToken.getBytes();
        bi.b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        ci.j = bi;
        if (productInfo.type == ProductType.SUBS) {
            Ai ai2 = new Ai();
            ai2.f17769a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                C3726zi c3726zi = new C3726zi();
                c3726zi.f18615a = period.number;
                int i2 = AbstractC3548sf.b[period.timeUnit.ordinal()];
                c3726zi.b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                ai2.b = c3726zi;
            }
            C3701yi c3701yi = new C3701yi();
            c3701yi.f18597a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                C3726zi c3726zi2 = new C3726zi();
                c3726zi2.f18615a = period2.number;
                int i3 = AbstractC3548sf.b[period2.timeUnit.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 == 3) {
                    i = 3;
                } else if (i3 == 4) {
                    i = 4;
                }
                c3726zi2.b = i;
                c3701yi.b = c3726zi2;
            }
            c3701yi.c = productInfo.introductoryPriceCycles;
            ai2.c = c3701yi;
            ci.k = ai2;
        }
        c3091a6.setValueBytes(MessageNano.toByteArray(ci));
        return c3091a6;
    }

    public static C3091a6 a(String str) {
        C3091a6 c3091a6 = new C3091a6("", 0);
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        c3091a6.d = MessageConstant.CommandId.COMMAND_NOTIFICATION_ADVANCE;
        c3091a6.b = str;
        c3091a6.l = EnumC3542s9.JS;
        return c3091a6;
    }
}
