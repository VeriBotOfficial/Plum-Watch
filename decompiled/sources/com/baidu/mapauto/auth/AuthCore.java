package com.baidu.mapauto.auth;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.net.c;
import com.baidu.mapauto.auth.util.LogUtil;
import com.wakeup.commponent.module.baidu.BaiduMapToolManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes13.dex */
public class AuthCore {
    public static final String TAG = "AuthCore";
    public static final int TYPE_LICENSE_ALL = 3;
    public static final int TYPE_LICENSE_FILE = 1;
    public static final int TYPE_LICENSE_FUNCTION = 2;

    /* renamed from: a, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.a f8237a;
    public volatile com.baidu.mapauto.auth.data.license.impl.b b;
    public final ThreadPoolExecutor c;
    public final ThreadPoolExecutor d;
    public volatile com.baidu.mapauto.auth.process.a e;
    public volatile com.baidu.mapauto.auth.process.b f;
    public String g;
    public String h;
    public String i = "";

    public static class AuthParam extends HashMap<String, Object> {
        public static final String KEY_EXTRA_APP_VERSION = "extra_app_version";
        public static final String KEY_EXTRA_CUID = "extra_cuid";
        public static final String KEY_EXTRA_MODE = "extra_mode";
        public static final String KEY_EXTRA_MODEL = "extra_model";
        public static final String KEY_EXTRA_OS_VERSION = "extra_os_version";

        public AuthParam() {
        }

        public AuthParam(String str, String str2, String str3, String str4, String str5, int i, Map<String, Object> map) {
            put("ak", str);
            put("channel", str2);
            put("device_id", str3);
            put("service_name", str4);
            put("function_name", str5);
            put("need_active", Integer.valueOf(i));
            if (map != null) {
                putAll(map);
            }
            put(HttpConstants.SDK_VERSION_NAME, "1.0.0");
            put(HttpConstants.SDK_VERSION_CODE, 1);
        }

        public final AuthParam a() {
            AuthParam authParam = new AuthParam();
            for (String str : keySet()) {
                authParam.put(str, get(str));
            }
            return authParam;
        }

        public final boolean a(int i) {
            boolean z = (TextUtils.isEmpty(b()) || TextUtils.isEmpty(e())) ? false : true;
            if ((i & 2) == 2) {
                z = z && !TextUtils.isEmpty(c());
            }
            return (i & 1) == 1 ? z && !TextUtils.isEmpty(d()) : z;
        }

        public final String b() {
            Object obj = get("ak");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String c() {
            Object obj = get("channel");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String d() {
            Object obj = get("device_id");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String e() {
            Object obj = get("service_name");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
    }

    public class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return !TextUtils.isEmpty(str) && BaiduMapToolManager.searchHost.contains(str);
        }
    }

    public static final class b implements ILicenseAuthListener {

        /* renamed from: a, reason: collision with root package name */
        public final ILicenseAuthListener f8238a;
        public final Handler b = new Handler(Looper.getMainLooper());

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map f8239a;

            public a(Map map) {
                this.f8239a = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.getInstance().i(AuthCore.TAG, com.baidu.mapauto.auth.b.a("授权成功(回调 ").append(b.this.f8238a).append("): ").append(this.f8239a).toString());
                ILicenseAuthListener iLicenseAuthListener = b.this.f8238a;
                if (iLicenseAuthListener != null) {
                    iLicenseAuthListener.onSuccess(this.f8239a);
                }
            }
        }

        /* renamed from: com.baidu.mapauto.auth.AuthCore$b$b, reason: collision with other inner class name */
        public class RunnableC0367b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f8240a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Exception c;

            public RunnableC0367b(int i, String str, Exception exc) {
                this.f8240a = i;
                this.b = str;
                this.c = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.getInstance().e(AuthCore.TAG, com.baidu.mapauto.auth.b.a("授权失败(回调 ").append(b.this.f8238a).append("): code = ").append(this.f8240a).append(", msg = ").append(this.b).toString());
                ILicenseAuthListener iLicenseAuthListener = b.this.f8238a;
                if (iLicenseAuthListener != null) {
                    iLicenseAuthListener.onError(this.f8240a, this.b, this.c);
                }
            }
        }

        public b(ILicenseAuthListener iLicenseAuthListener) {
            this.f8238a = iLicenseAuthListener;
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public final void onError(int i, String str, Exception exc) {
            RunnableC0367b runnableC0367b = new RunnableC0367b(i, str, exc);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                runnableC0367b.run();
            } else {
                this.b.post(runnableC0367b);
            }
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public final void onSuccess(Map<String, Integer> map) {
            a aVar = new a(map);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                aVar.run();
            } else {
                this.b.post(aVar);
            }
        }
    }

    public AuthCore() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(HttpConstants.SDK_VERSION_NAME, "1.0.0");
        hashMap.put(HttpConstants.SDK_VERSION_CODE, 1);
        this.f8237a = new com.baidu.mapauto.auth.data.license.impl.a(new com.baidu.mapauto.auth.net.a(new c.a().d().c().b().a(hashMap).a(new a()).a()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 60L, timeUnit, new LinkedBlockingQueue());
        this.d = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 60L, timeUnit, new LinkedBlockingQueue());
    }

    public final void a(Context context, AuthParam authParam, int i, ILicenseAuthListener iLicenseAuthListener) {
        LogUtil.getInstance().i(TAG, "开始授权");
        b bVar = new b(iLicenseAuthListener);
        if (context == null) {
            bVar.onError(-1002, "context 不可以为空", null);
            return;
        }
        if (!authParam.a(i)) {
            bVar.onError(-1002, "参数错误, 请确保 ak, channel, serviceName 、 file 类型下时的 deviceId 不为空", null);
            return;
        }
        this.g = authParam.b();
        this.h = authParam.d();
        this.i = authParam.c();
        if (this.b == null) {
            synchronized (AuthCore.class) {
                if (this.b == null) {
                    this.b = new com.baidu.mapauto.auth.data.license.impl.b(new com.baidu.mapauto.auth.store.a(context));
                }
            }
        }
        if (this.e == null) {
            synchronized (AuthCore.class) {
                if (this.e == null) {
                    this.e = new com.baidu.mapauto.auth.process.a(3, this.f8237a, this.b);
                }
            }
        }
        if (this.f == null) {
            synchronized (AuthCore.class) {
                if (this.f == null) {
                    this.f = new com.baidu.mapauto.auth.process.b(3, this.f8237a, this.b);
                }
            }
        }
        if (this.b instanceof com.baidu.mapauto.auth.data.license.impl.b) {
            com.baidu.mapauto.auth.data.license.impl.b bVar2 = this.b;
            String b2 = authParam.b();
            authParam.c();
            authParam.e();
            Object obj = authParam.get("function_name");
            if (obj instanceof String) {
            }
            String d = authParam.d();
            bVar2.getClass();
            bVar2.b = b2 + d;
        }
        this.c.submit(new com.baidu.mapauto.auth.a(this, i, bVar, authParam));
    }

    public final HashMap a(Context context, String str, String str2, String str3, String str4, String str5, int i) throws BaseLicenseAuthDataStandardProcess.ProcessException {
        LogUtil logUtil = LogUtil.getInstance();
        String str6 = TAG;
        logUtil.i(str6, "本地: 开始授权");
        if (context == null) {
            LogUtil.getInstance().i(str6, "本地: context 为空");
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(-1002, "context 不可以为空");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.g;
        }
        String str7 = str;
        String str8 = TextUtils.isEmpty(str2) ? this.h : str2;
        AuthParam authParam = new AuthParam(str7, TextUtils.isEmpty(str3) ? this.i : str3, str8, str4, str5, 0, new HashMap(0));
        if (!authParam.a(i)) {
            LogUtil.getInstance().i(str6, "本地: 核心参数检测失败");
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(-1002, "参数错误, 请确保 ak, channel, serviceName 、 file 类型下时的 deviceId 不为空");
        }
        if (this.b == null) {
            synchronized (AuthCore.class) {
                if (this.b == null) {
                    this.b = new com.baidu.mapauto.auth.data.license.impl.b(new com.baidu.mapauto.auth.store.a(context));
                }
            }
        }
        if (this.b instanceof com.baidu.mapauto.auth.data.license.impl.b) {
            com.baidu.mapauto.auth.data.license.impl.b bVar = this.b;
            bVar.getClass();
            bVar.b = str7 + str8;
        }
        ArrayList arrayList = new ArrayList(2);
        if ((i & 1) == 1) {
            arrayList.add(new com.baidu.mapauto.auth.process.a(2, this.f8237a, this.b));
            LogUtil.getInstance().i(str6, "本地: 添加 license file 授权流程");
        }
        if ((i & 2) == 2) {
            arrayList.add(new com.baidu.mapauto.auth.process.b(2, this.f8237a, this.b));
            LogUtil.getInstance().i(str6, "本地: 添加 license function 授权流程");
        }
        if (arrayList.isEmpty()) {
            LogUtil.getInstance().i(str6, "本地: 没有发现任何授权流程");
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                hashMap.putAll(((BaseLicenseAuthDataStandardProcess) it.next()).a(authParam));
            } catch (BaseLicenseAuthDataStandardProcess.ProcessException e) {
                LogUtil.getInstance().i(TAG, com.baidu.mapauto.auth.b.a("本地: 授权异常结束（").append(e.getMessage()).append(Separators.RPAREN).toString());
                throw e;
            }
        }
        LogUtil.getInstance().i(TAG, "本地: 授权成功结束");
        return hashMap;
    }
}
