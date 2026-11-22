package com.xmly.businesssdk.ai;

import com.xmly.businesssdk.BuildConfig;
import com.xmly.businesssdk.a;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIModuleHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/ai/AIModuleHelper;", "", "()V", "TAG", "", "initAIModule", "", "isAIModuleAvailable", "withAIModule", "action", "Lkotlin/Function0;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AIModuleHelper {
    public static final AIModuleHelper INSTANCE = new AIModuleHelper();
    private static final String TAG = "AIModuleHelper";

    private AIModuleHelper() {
    }

    public final boolean initAIModule() {
        if (!isAIModuleAvailable()) {
            Logger.d(TAG, "AI模块未启用，跳过初始化");
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.xmly.aimodule.AIService");
            cls.getMethod("init", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            Logger.d(TAG, "AI模块初始化成功");
            return true;
        } catch (Exception e) {
            a.a(e, c.a("AI模块初始化失败: "), TAG);
            return false;
        }
    }

    public final boolean isAIModuleAvailable() {
        Boolean enabled = BuildConfig.INCLUDE_AI_MODULE;
        Logger.d(TAG, "AI模块是否启用: " + enabled);
        Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
        return enabled.booleanValue();
    }

    public final boolean withAIModule(Function0<Boolean> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!isAIModuleAvailable()) {
            Logger.d(TAG, "AI模块未启用，跳过操作");
            return false;
        }
        try {
            return action.invoke().booleanValue();
        } catch (Exception e) {
            a.a(e, c.a("AI模块操作失败: "), TAG);
            return false;
        }
    }
}
