package com.xmly.businesssdk.module;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.Logger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceLocator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ#\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007J+\u0010\u0010\u001a\u00020\t\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00072\u0006\u0010\u0011\u001a\u0002H\u000b¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/module/ServiceLocator;", "", "()V", "TAG", "", "services", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", SDPKeywords.CLEAR, "", "get", "T", "serviceClass", "(Ljava/lang/Class;)Ljava/lang/Object;", "isRegistered", "", MiPushClient.COMMAND_REGISTER, "implementation", "(Ljava/lang/Class;Ljava/lang/Object;)V", MiPushClient.COMMAND_UNREGISTER, "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceLocator {
    private static final String TAG = "ServiceLocator";
    public static final ServiceLocator INSTANCE = new ServiceLocator();
    private static final ConcurrentHashMap<Class<?>, Object> services = new ConcurrentHashMap<>();

    private ServiceLocator() {
    }

    public final synchronized void clear() {
        services.clear();
        Logger.d(TAG, "所有服务已清除");
    }

    public final <T> T get(Class<T> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        T t = (T) services.get(serviceClass);
        if (t != null) {
            return t;
        }
        Logger.w(TAG, c.a("服务未注册: ").append(serviceClass.getSimpleName()).toString());
        throw new IllegalStateException(c.a("服务未注册: ").append(serviceClass.getSimpleName()).toString());
    }

    public final boolean isRegistered(Class<?> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return services.containsKey(serviceClass);
    }

    public final synchronized <T> void register(Class<T> serviceClass, T implementation) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        services.put(serviceClass, implementation);
        Logger.d(TAG, "服务已注册: " + serviceClass.getSimpleName());
    }

    public final synchronized void unregister(Class<?> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        services.remove(serviceClass);
        Logger.d(TAG, "服务已注销: " + serviceClass.getSimpleName());
    }
}
