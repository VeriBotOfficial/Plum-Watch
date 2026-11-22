package com.qumeng.overseas.advlib.__remote__.core.proto.request;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.coreutils.a;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.d;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.d0;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.g;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import com.qumeng.overseas.advlib.__remote__.utils.m;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class Device extends JSONBeanFrm {
    private static final String TAG = "Device";
    private static final List<a> extDeviceInfoList = new CopyOnWriteArrayList();
    public static int is_recommend = -1;
    public String ag_version;
    public String device_name;
    public int dpi;
    public long elapse_time;
    public String gaid;
    public int height;
    public String hms_os_version;
    public String hms_version;
    public String id_aisdk;
    public List<String> installed_pkgs;
    public int is_proxy;
    public String language;
    public int lmt;
    private Context mContext;
    public long physical_memory;
    public int ppi;
    public String privacy_consent;
    public int privacy_status;

    @JSONBeanFrm.a(fieldname = "priv_level")
    public int privilegeLevel;
    public String rom_version;
    public long storage_memory;
    public String sys_compiling_time;
    public int width;
    public String id_androidid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F;
    public String brand = Build.BRAND;
    public String model = Build.MODEL;
    public String os_version = Build.VERSION.RELEASE;
    public int os_version_code = Build.VERSION.SDK_INT;
    public int os_type = 1;
    public String id_imei = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B;
    public String id_imei2 = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.C;
    public String id_meid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.D;
    public String id_imsi = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.E;
    public String id_mac = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.J;
    public String major_uid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o;
    public String id_lifetime = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12827q;

    public interface a {
        Map<String, Serializable> onGrabbingData();
    }

    public Device(Context context) {
        this.ag_version = "";
        this.hms_version = "";
        this.hms_os_version = "";
        this.id_aisdk = "";
        this.rom_version = "";
        this.sys_compiling_time = "";
        this.privilegeLevel = 0;
        this.mContext = null;
        this.height = context.getResources().getDisplayMetrics().heightPixels;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.width = i;
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.Z = this.height;
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.Y = i;
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.b0 = context.getResources().getDisplayMetrics().density;
        this.mContext = context.getApplicationContext();
        this.privilegeLevel = oqms.a.g() ? 1 : 0;
        acquireDeviceID();
        this.id_aisdk = a.C0785a.getDevId(this.mContext);
        this.rom_version = Build.MANUFACTURER;
        this.sys_compiling_time = Build.TIME + "";
        this.elapse_time = SystemClock.elapsedRealtime();
        this.gaid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O;
        if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.R || com.qumeng.overseas.advlib.__remote__.core.coreutils.a.S) {
            this.lmt = 1;
        }
        this.ag_version = a.C0785a.directGetAgVersionCode(this.mContext);
        this.hms_version = a.C0785a.directGetHmsVersionCode(this.mContext);
        this.hms_os_version = g.c();
        this.dpi = s.a(context);
        this.ppi = s.a(context);
        if (is_recommend == -1) {
            is_recommend = oqme.a.b(oqme.a.Z);
            n.c(TAG, "初始化is_recommend：" + is_recommend, new Object[0]);
        }
        this.physical_memory = g.d();
        this.storage_memory = g.e();
        try {
            this.device_name = Settings.Global.getString(this.mContext.getContentResolver(), "device_name");
        } catch (Throwable unused) {
        }
        this.language = m.a(context);
        if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.d()) {
            this.privacy_status = 3;
            this.privacy_consent = "";
            return;
        }
        this.privacy_status = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.X;
        String b = com.qumeng.overseas.advlib.__remote__.utils.g.b(this.mContext);
        this.privacy_consent = b;
        if (b == null) {
            this.privacy_consent = "";
        }
    }

    private void acquireDeviceID() {
        this.id_androidid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F;
        this.id_imei = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B;
        this.id_imei2 = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.C;
        this.id_imsi = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.E;
        this.id_meid = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.D;
        this.id_mac = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.J;
    }

    private static boolean isIdNull(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains("unknown") && !str.contains(AbstractJsonLexerKt.NULL) && !str.contains("nil")) {
            int i = 0;
            for (int i2 = 0; i2 <= str.length() - 1; i2++) {
                if ('0' == str.charAt(i2) && (i = i + 1) > str.length() / 2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void putExtraDeviceInfoCallback(a aVar) {
        extDeviceInfoList.add(aVar);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm
    public JSONObject marshal() {
        acquireDeviceID();
        this.id_aisdk = a.C0785a.getDevId(this.mContext);
        this.elapse_time = SystemClock.elapsedRealtime();
        this.is_proxy = d0.k() ? 1 : 0;
        JSONObject marshal = super.marshal();
        for (a aVar : extDeviceInfoList) {
            if (aVar != null) {
                try {
                    Map<String, Serializable> onGrabbingData = aVar.onGrabbingData();
                    if (!d.a((Map<? extends Object, ? extends Object>) onGrabbingData)) {
                        for (String str : onGrabbingData.keySet()) {
                            Serializable serializable = onGrabbingData.get(str);
                            if ((serializable instanceof String) || (serializable instanceof Number) || (serializable instanceof Boolean)) {
                                marshal.put(str, serializable);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_Device_marshal", th);
                }
            }
        }
        return marshal;
    }
}
