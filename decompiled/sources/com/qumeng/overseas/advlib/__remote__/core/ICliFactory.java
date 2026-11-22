package com.qumeng.overseas.advlib.__remote__.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.__bootstrap__.LibInit;
import com.qumeng.overseas.advlib.__remote__.ui.incite.i;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.core.IMultiAdRequest;
import com.qumeng.overseas.advlib.core.IURLAdapter;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.core._factory;
import java.util.Map;

/* loaded from: classes17.dex */
public class ICliFactory extends Thread implements _factory {
    public static final int CONTENT_IMAGE_AND_TEXT = 1;
    public static final int CONTENT_IMAGE_GROUP = 3;
    public static final int CONTENT_PURE_IMAGE = 2;
    public static final int CONTENT_UNKNOWN = 0;
    public static final int CONTENT_VIDEO = 4;
    public static final String HTTP = "http://";
    public static final String HTTPS = "https://";
    public static final int MATERIAL_BOTTOMING = 2;
    public static final int MATERIAL_DYNAMIC = 0;
    public static final int MATERIAL_NATIVE = 1;
    public static final String client_version = "1.6.0";
    private static ICliFactory instance = null;
    public static boolean isMainProcess = false;
    public static boolean is_urlV6Supported = false;
    public static QMConfig mQmConfig = null;
    public static String model = null;
    public static final String urlBugManReport;
    public static final String urlBugManReportHttps;
    public static final String urlEncryptBidsdk;
    public static final String urlEncryptBidsdkNew;
    public static final String urlEncryptReport;
    public static final String urlEncryptReportNew;
    public static final String urlLogRcvHttps;
    public static final String urlLogRcvHttpsNew;
    public static final String urlReceiveHost = "rcv.adseye.com";
    public static final String urlReport;
    public static final String urlReportBidsdk;
    public static final String urlReportBidsdkNew;
    public static final String urlReportNew;
    private Context mContext;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.c(ICliFactory.this.mContext, "趣盟海外测试版本：1.049");
        }
    }

    static {
        boolean z = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a;
        String concat = (z ? "http://" : "https://").concat("logrcv.adseyeservice.com");
        urlLogRcvHttps = concat;
        urlReport = concat + "/trace";
        urlReportBidsdk = concat + "/bidsdk";
        urlEncryptReport = concat + "/tenew";
        urlEncryptBidsdk = concat + "/besnew";
        String concat2 = (z ? "http://" : "https://").concat("logrcv.oatbeam.com");
        urlLogRcvHttpsNew = concat2;
        urlReportNew = concat2 + "/trace";
        urlReportBidsdkNew = concat2 + "/bidsdk";
        urlEncryptReportNew = concat2 + "/tenew";
        urlEncryptBidsdkNew = concat2 + "/besnew";
        urlBugManReport = concat;
        urlBugManReportHttps = concat + "/trace";
        model = null;
        isMainProcess = true;
        instance = null;
    }

    public ICliFactory(Activity activity) {
        this(activity, (String) null);
    }

    private void getAndroidId() {
        if (!TextUtils.isEmpty(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F) || com.qumeng.overseas.advlib.__remote__.core.coreutils.a.S) {
            return;
        }
        try {
            Context context = this.mContext;
            if (context != null) {
                com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
        } catch (Throwable unused) {
        }
    }

    private void initConfig(Object obj) {
        try {
            if (obj instanceof QMConfig) {
                QMConfig qMConfig = (QMConfig) obj;
                mQmConfig = qMConfig;
                com.qumeng.overseas.advlib.__remote__.utils.f.b(qMConfig);
                com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F = mQmConfig.getAndroidId();
                Map map = mQmConfig.getMap();
                if (map != null) {
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.e0 = ((Boolean) com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, "is_control", Boolean.FALSE)).booleanValue();
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.G = "1".equals(com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, "isPad", "0"));
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.H = "1".equals(com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, "isFoldScreen", "0"));
                    if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.S) {
                        return;
                    }
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B = (String) com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o, "");
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.J = (String) com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, "mac_address", "");
                    com.qumeng.overseas.advlib.__remote__.core.coreutils.a.E = (String) com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a(map, "imsi", "");
                }
            }
        } catch (Throwable unused) {
            if (TextUtils.isEmpty(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F)) {
                getAndroidId();
            }
        }
    }

    public static ICliFactory obtainInstance(Context context, String str) {
        if (instance == null) {
            instance = new ICliFactory(context.getApplicationContext(), str);
        }
        return instance;
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public IMultiAdRequest createNativeMultiAdRequest() {
        return new MultiAdRequest();
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void mediaTrace(String str, String str2, String str3, Map<String, String> map) {
        if (str != null) {
            com.qumeng.overseas.advlib.__remote__.core.scene.a.a().mediaTrace(str, str2, str3, map);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void notifyMsg(int i, Bundle bundle) {
        b.a(i, bundle);
    }

    @Override // java.lang.Thread, java.lang.Runnable, com.qumeng.overseas.advlib.core._factory
    public void run() {
        n.c("ICliFactory", "Factory ended", new Object[0]);
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void setImageAutoDownload(boolean z) {
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void setMediaUserId(String str) {
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.P = str;
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void terminate() {
        com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.d();
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void useDebugServer(int i) {
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void whenPermDialogReturns(int i, String[] strArr, int[] iArr) {
    }

    public ICliFactory(Activity activity, String str) {
        this(activity, (Object) null, str);
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void useDebugServer(boolean z) {
        useDebugServer(0);
    }

    public ICliFactory(Activity activity, String str, IURLAdapter iURLAdapter) {
        this(activity, iURLAdapter, str);
    }

    public ICliFactory(Context context, String str, IURLAdapter iURLAdapter) {
        this(context, iURLAdapter, str);
    }

    @Deprecated
    public static ICliFactory obtainInstance(Context context) {
        return obtainInstance(context, null);
    }

    public ICliFactory(Context context, Object obj, String str) {
        this.mContext = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            LibInit.Init(str);
        }
        try {
            initConfig(obj);
            is_urlV6Supported = oqmv.a.a(context, context.getPackageName()) && oqmv.a.b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        new b().a(this.mContext, mQmConfig);
        instance = this;
    }

    public ICliFactory(Context context, String str) {
        this(context, (Object) null, str);
    }

    @Deprecated
    public ICliFactory(Context context) {
        this(context, (String) null);
    }
}
