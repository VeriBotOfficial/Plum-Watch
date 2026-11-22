package com.xmly.businesssdk.service;

import android.content.Context;
import com.xmly.businesssdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatingPlayerProviderRegistry.kt */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/service/FloatingPlayerProviderRegistry;", "", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/xmly/businesssdk/service/FloatingPlayerProvider;", "factory", "", "registerProviderFactory", "context", "", "createAndRegisterProvider", "getFloatingPlayerProvider", "hasProviderFactory", "clearProviderFactory", "providerFactory", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FloatingPlayerProviderRegistry {
    public static final FloatingPlayerProviderRegistry INSTANCE = new FloatingPlayerProviderRegistry();
    private static volatile Function1<? super Context, ? extends FloatingPlayerProvider> providerFactory;

    private FloatingPlayerProviderRegistry() {
    }

    @JvmStatic
    public static final void clearProviderFactory() {
        providerFactory = null;
        Logger.d("FloatingPlayerProviderRegistry", "悬浮播放器提供者工厂已清除");
    }

    @JvmStatic
    public static final boolean createAndRegisterProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Function1<? super Context, ? extends FloatingPlayerProvider> function1 = providerFactory;
            if (function1 == null) {
                Logger.w("FloatingPlayerProviderRegistry", "悬浮播放器提供者工厂未注册");
                return false;
            }
            FloatingPlayerManager.registerFloatingPlayerProvider(function1.invoke(context));
            Logger.d("FloatingPlayerProviderRegistry", "悬浮播放器提供者创建并注册成功");
            return true;
        } catch (Exception e) {
            Logger.e("FloatingPlayerProviderRegistry", "创建悬浮播放器提供者失败", e);
            return false;
        }
    }

    @JvmStatic
    public static final FloatingPlayerProvider getFloatingPlayerProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Function1<? super Context, ? extends FloatingPlayerProvider> function1 = providerFactory;
            if (function1 != null) {
                return function1.invoke(context);
            }
            Logger.w("FloatingPlayerProviderRegistry", "悬浮播放器提供者工厂未注册");
            return null;
        } catch (Exception e) {
            Logger.e("FloatingPlayerProviderRegistry", "创建悬浮播放器提供者失败", e);
            return null;
        }
    }

    @JvmStatic
    public static final boolean hasProviderFactory() {
        return providerFactory != null;
    }

    @JvmStatic
    public static final void registerProviderFactory(Function1<? super Context, ? extends FloatingPlayerProvider> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        providerFactory = factory;
        Logger.d("FloatingPlayerProviderRegistry", "悬浮播放器提供者工厂已注册");
    }
}
