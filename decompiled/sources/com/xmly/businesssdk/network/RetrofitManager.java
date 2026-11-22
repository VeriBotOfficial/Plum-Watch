package com.xmly.businesssdk.network;

import com.xmly.businesssdk.utils.Logger;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes2.dex */
public class RetrofitManager {
    public static String BASE_URL = "https://api.ximalaya.com/";
    private static final String TAG = "RetrofitManager";
    private static boolean sDebugAble = false;
    private static volatile Retrofit sRetrofit;

    private RetrofitManager() {
    }

    private static Retrofit createDebugRetrofit() {
        Logger.d(TAG, "创建调试模式的Retrofit实例");
        return createRetrofit(true);
    }

    public static Retrofit createReleaseRetrofit() {
        return createRetrofit(false);
    }

    private static Retrofit createRetrofit(boolean z) {
        return new Retrofit.Builder().client(HttpManager.createOkHttpClient(z)).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava3CallAdapterFactory.create()).build();
    }

    public static void enableDebug() {
        if (sDebugAble) {
            return;
        }
        Logger.d(TAG, "启用网络请求调试模式");
        HttpManager.resetOkHttpClient();
        sRetrofit = null;
        sDebugAble = true;
    }

    private static Retrofit getRetrofit() {
        if (sRetrofit == null) {
            synchronized (RetrofitManager.class) {
                if (sRetrofit == null) {
                    if (sDebugAble) {
                        sRetrofit = createDebugRetrofit();
                    } else {
                        sRetrofit = createReleaseRetrofit();
                    }
                }
            }
        }
        return sRetrofit;
    }

    public static void initNetworkDebug(boolean z) {
        if (!z) {
            sDebugAble = false;
        } else {
            Logger.d(TAG, "根据SDK配置开启网络调试模式");
            enableDebug();
        }
    }

    public static <T> T instance(Class<T> cls) {
        return (T) getRetrofit().create(cls);
    }

    public static boolean isDebugAble() {
        return sDebugAble;
    }
}
