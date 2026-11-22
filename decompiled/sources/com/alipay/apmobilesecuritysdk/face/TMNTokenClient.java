package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.sdk.m.d0.a;
import com.alipay.sdk.m.n.b;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class TMNTokenClient {

    /* renamed from: a, reason: collision with root package name */
    private static TMNTokenClient f1306a;
    private Context b;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    private TMNTokenClient(Context context) {
        this.b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f1306a == null) {
            synchronized (TMNTokenClient.class) {
                if (f1306a == null) {
                    f1306a = new TMNTokenClient(context);
                }
            }
        }
        return f1306a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.a(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.a(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(b.g, UtdidWrapper.getUtdid(this.b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put(JsonStorageKeyNames.SESSION_ID_KEY, str3);
        hashMap.put("rpcVersion", "8");
        com.alipay.apmobilesecuritysdk.f.b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            public final /* synthetic */ TMNTokenClient d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                int a2 = new com.alipay.apmobilesecuritysdk.a.a(this.d.b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (a2 != 0) {
                    initResultListener2.onResult("", a2);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(this.d.b, str), 0);
                }
            }
        });
    }
}
