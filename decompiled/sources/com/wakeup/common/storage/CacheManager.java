package com.wakeup.common.storage;

import com.google.gson.Gson;
import com.hjq.gson.factory.GsonFactory;
import com.tencent.mmkv.MMKV;
import com.wakeup.common.Constants;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CacheManager.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u0010!\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0005J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\"J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020%H\u0007J\u000e\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020%H\u0007J\u0016\u0010'\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020(J\u000e\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u0010*\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020+J\u000e\u0010,\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0019J\u0006\u0010/\u001a\u00020\u0019J\u0006\u00100\u001a\u00020\u0019J\u000e\u00100\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u00061"}, d2 = {"Lcom/wakeup/common/storage/CacheManager;", "", "<init>", "()V", "TAG", "", "kv", "Lcom/tencent/mmkv/MMKV;", "getKv", "()Lcom/tencent/mmkv/MMKV;", "kv$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGson", "()Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "getData", "T", "key", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "saveData", "", "value", "getString", "defaultValue", "saveString", "saveLong", "", "getLong", "saveInt", "", "getInt", "saveBoolean", "", "getBoolean", "saveFloat", "", "getFloat", "saveDouble", "", "getDouble", "remove", "clearAll", "clearCache", "removeAllCache", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheManager {
    public static final CacheManager INSTANCE = new CacheManager();
    private static final String TAG = "CacheManager";
    private static final Gson gson;

    /* renamed from: kv$delegate, reason: from kotlin metadata */
    private static final Lazy kv;

    private CacheManager() {
    }

    static {
        MMKV.initialize(BaseApplication.getContext());
        kv = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.storage.CacheManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MMKV kv_delegate$lambda$0;
                kv_delegate$lambda$0 = CacheManager.kv_delegate$lambda$0();
                return kv_delegate$lambda$0;
            }
        });
        gson = GsonFactory.getSingletonGson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MMKV kv_delegate$lambda$0() {
        MMKV defaultMMKV = MMKV.defaultMMKV(2, null);
        Intrinsics.checkNotNullExpressionValue(defaultMMKV, "defaultMMKV(...)");
        return defaultMMKV;
    }

    public final MMKV getKv() {
        return (MMKV) kv.getValue();
    }

    public final Gson getGson() {
        return gson;
    }

    public final <T> T getData(String key, Class<T> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            return (T) gson.fromJson(getKv().decodeString(key, ""), (Class) clazz);
        } catch (Exception e) {
            LogUtils.e(TAG, "getData error: " + e.getMessage());
            return null;
        }
    }

    public final void saveData(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        getKv().encode(key, gson.toJson(value));
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String decodeString = getKv().decodeString(key, "");
        Intrinsics.checkNotNull(decodeString);
        return decodeString;
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String decodeString = getKv().decodeString(key, defaultValue);
        Intrinsics.checkNotNull(decodeString);
        return decodeString;
    }

    public final void saveString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        getKv().encode(key, value);
    }

    public final void saveLong(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getKv().encode(key, value);
    }

    public final long getLong(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeLong(key, 0L);
    }

    public final void saveInt(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getKv().encode(key, value);
    }

    public final int getInt(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeInt(key, 0);
    }

    public static /* synthetic */ int getInt$default(CacheManager cacheManager, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return cacheManager.getInt(str, i);
    }

    public final int getInt(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeInt(key, defaultValue);
    }

    @JvmStatic
    public static final void saveBoolean(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        INSTANCE.getKv().encode(key, value);
    }

    public final boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeBool(key, false);
    }

    @JvmStatic
    public static final boolean getBoolean(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getKv().decodeBool(key, defaultValue);
    }

    public final void saveFloat(String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getKv().encode(key, value);
    }

    public final float getFloat(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeFloat(key, 0.0f);
    }

    public final void saveDouble(String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getKv().encode(key, value);
    }

    public final double getDouble(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKv().decodeDouble(key, 0.0d);
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        getKv().remove(key);
    }

    public final void clearAll() {
        getKv().clearAll();
    }

    public final void clearCache() {
        remove(Constants.SPKey.DEVICE_COURSE_VERSION);
    }

    public final void removeAllCache() {
        String[] allKeys = getKv().allKeys();
        if (allKeys != null) {
            for (String str : allKeys) {
                INSTANCE.getKv().remove(str);
            }
        }
    }

    public final void removeAllCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] allKeys = getKv().allKeys();
        if (allKeys != null) {
            for (String str : allKeys) {
                Intrinsics.checkNotNull(str);
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null)) {
                    INSTANCE.getKv().remove(str);
                }
            }
        }
    }
}
