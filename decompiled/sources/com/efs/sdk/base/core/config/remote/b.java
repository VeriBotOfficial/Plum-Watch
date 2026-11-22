package com.efs.sdk.base.core.config.remote;

import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.b.h;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f9622a = new Random();
    public IConfigRefreshAction b;
    public boolean c;
    public RemoteConfig d;
    public Map<IConfigCallback, String[]> e;
    public Map<IConfigCallback, String[]> f;
    private Handler g;
    private d h;
    private long i;
    private boolean j;
    private int k;

    /* synthetic */ b(byte b) {
        this();
    }

    private b() {
        this.c = true;
        this.e = new HashMap();
        this.f = new HashMap();
        this.j = false;
        this.k = -1;
        this.g = new Handler(com.efs.sdk.base.core.util.concurrent.a.f9649a.getLooper(), this);
        this.h = new d();
        this.d = RemoteConfig.a();
        this.i = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
        this.j = ControllerCenter.getGlobalEnvStruct().isOpenCodeLog();
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f9626a = new b(0);
    }

    public static b a() {
        return a.f9626a;
    }

    public final void b() {
        this.g.sendEmptyMessage(0);
        this.g.sendEmptyMessageDelayed(2, this.i);
    }

    public final void a(int i) {
        if (i <= this.d.mConfigVersion) {
            Log.i("efs.config", "current config version is " + i + ", no need to refresh");
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        obtain.what = 1;
        this.g.sendMessage(obtain);
    }

    public final String a(String str, String str2) {
        String str3 = this.d.mSDKConfigMap.containsKey(str) ? this.d.mSDKConfigMap.get(str) : str2;
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public final Map<String, String> c() {
        return new HashMap(this.d.mSDKConfigMap);
    }

    public final String a(boolean z) {
        if (z) {
            return "https://" + this.d.c;
        }
        return this.d.b + this.d.c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RemoteConfig remoteConfig;
        String str;
        h hVar;
        int i = message.what;
        if (i == 0) {
            boolean a2 = d.a();
            Log.i("efs.config", "delete old config is ".concat(String.valueOf(a2)));
            if (a2) {
                this.g.sendEmptyMessage(1);
            } else {
                d dVar = this.h;
                dVar.c();
                if (dVar.f9628a == null) {
                    remoteConfig = null;
                } else {
                    RemoteConfig a3 = RemoteConfig.a();
                    a3.mConfigVersion = dVar.f9628a.getInt("cver", -1);
                    Set<String> keySet = dVar.f9628a.getAll().keySet();
                    HashMap hashMap = new HashMap();
                    for (String str2 : keySet) {
                        String string = dVar.f9628a.getString(str2, "");
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    a3.a(hashMap);
                    a3.a(dVar.f9628a.getString("sign", ""));
                    remoteConfig = a3;
                }
                if (remoteConfig == null) {
                    Log.i("efs.config", "first load local config false.");
                } else if (a(remoteConfig)) {
                    Log.i("efs.config", "current config to same.");
                } else {
                    this.d = remoteConfig;
                    if (-1 == remoteConfig.mConfigVersion) {
                        str = "load config from storage";
                    } else {
                        i();
                        Log.i("efs.config.register", "call back");
                        d();
                        j();
                        str = "load config from storage and notify observer";
                    }
                    Log.i("efs.config", str);
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            if (i2 <= this.d.mConfigVersion) {
                Log.i("efs.config", "current config version is " + i2 + ", no need to refresh");
                Log.i("efs.config", "current config version(" + this.d.mConfigVersion + ") is " + i2 + ", no need to refresh");
            } else {
                e();
            }
        } else if (i == 2) {
            try {
                hVar = h.a.f9602a;
                if (hVar.a()) {
                    if (!h()) {
                        Log.i("efs.config", "No update is required, less than 8h since the last update");
                        try {
                            int parseInt = Integer.parseInt(UMEnvelopeBuild.imprintProperty(ControllerCenter.getGlobalEnvStruct().mAppContext, "apm_setting_cver", "-1"));
                            Log.d("efs.config", "APM_CVER_FROM_COMMON from UMEnvelopeBuild.imprintProperty is " + parseInt + " and mRemoteConfig.getConfigVersion() is " + this.d.mConfigVersion);
                            if (parseInt > this.d.mConfigVersion) {
                                this.g.sendEmptyMessage(4);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        Log.i("efs.config", "update config");
                        e();
                    }
                    ImprintHandler.getImprintService(ControllerCenter.getGlobalEnvStruct().mAppContext).registImprintCallback("apm_setting_cver", new UMImprintChangeCallback() { // from class: com.efs.sdk.base.core.config.remote.b.1
                        @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                        public final void onImprintValueChanged(String str3, String str4) {
                            try {
                                int parseInt2 = Integer.parseInt(str4);
                                if (b.this.k != parseInt2) {
                                    b.this.k = parseInt2;
                                    Log.d("efs.config", "APM_CVER_FROM_COMMON from onImprintValueChanged is " + parseInt2 + " and mRemoteConfig.getConfigVersion() is " + b.this.d.mConfigVersion);
                                    if (parseInt2 > b.this.d.mConfigVersion) {
                                        b.this.g.sendEmptyMessage(4);
                                        return;
                                    }
                                    return;
                                }
                                Log.d("efs.config", "APM_CVER_FROM_COMMON from onImprintValueChanged is equals to mCverFromCommonListener");
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } else if (i == 3) {
            f();
        } else if (i == 4) {
            e();
        }
        return true;
    }

    public final void a(String str) {
        RemoteConfig a2 = RemoteConfig.a();
        if (c.a(str, a2)) {
            if (a(a2)) {
                return;
            }
            this.d = a2;
            f();
            i();
            d();
            j();
            return;
        }
        this.g.sendEmptyMessageDelayed(1, 3000L);
    }

    private void f() {
        boolean z;
        try {
            z = this.h.a(this.d);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return;
        }
        this.g.sendEmptyMessageDelayed(3, 3000L);
    }

    private IConfigRefreshAction g() {
        IConfigRefreshAction iConfigRefreshAction = this.b;
        return iConfigRefreshAction == null ? com.efs.sdk.base.core.config.remote.a.a() : iConfigRefreshAction;
    }

    private boolean h() {
        d.b();
        long j = 0;
        try {
            d dVar = this.h;
            dVar.c();
            if (dVar.f9628a != null) {
                j = dVar.f9628a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        boolean z = System.currentTimeMillis() - j >= this.d.d * 60000;
        Log.i("efs.config", "isUpdate ".concat(String.valueOf(z)));
        return z;
    }

    private void i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.d.mSDKConfigMap).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers().iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            Log.e("efs.config", th);
        }
    }

    public final void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.remote.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : b.this.e.keySet()) {
                        String[] strArr = (String[]) b.this.e.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (b.this.d.mSDKConfigMap.containsKey(str)) {
                                    hashMap.put(str, b.this.c().get(str));
                                    Log.i("efs.config.register", "configCallback key is " + str + " ## value is " + b.this.c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    b.this.e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void j() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.remote.b.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : b.this.f.keySet()) {
                        String[] strArr = (String[]) b.this.f.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (b.this.d.mSDKConfigMap.containsKey(str)) {
                                    hashMap.put(str, b.this.c().get(str));
                                    Log.i("efs.config.register", "[from server] configCallback key is " + str + " ## value is " + b.this.c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    b.this.f.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void e() {
        h hVar;
        hVar = h.a.f9602a;
        if (!hVar.a()) {
            Log.i("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.c) {
            Log.i("efs.config", "disable refresh config from remote");
            return;
        }
        String refresh = g().refresh();
        Log.i("efs.config", "from server. efs config is ".concat(String.valueOf(refresh)));
        if (TextUtils.isEmpty(refresh)) {
            Log.e("efs.config", "config is empty");
        } else {
            a(refresh);
        }
    }

    private boolean a(RemoteConfig remoteConfig) {
        if (this.j) {
            return false;
        }
        if (this.d.mConfigVersion >= remoteConfig.mConfigVersion) {
            return true;
        }
        Log.i("efs.config", "current config version (" + this.d.mConfigVersion + ") is older than another (" + remoteConfig.mConfigVersion + Separators.RPAREN);
        return false;
    }
}
