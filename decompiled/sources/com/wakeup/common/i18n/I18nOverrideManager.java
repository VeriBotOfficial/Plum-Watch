package com.wakeup.common.i18n;

import android.content.Context;
import android.content.res.Configuration;
import com.facebook.hermes.intl.Constants;
import com.wakeup.common.ab.NorthStarABManager;
import com.wakeup.common.ab.NorthStartConfigs;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: I18nOverrideManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tRF\u0010\n\u001a:\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\u000bj\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/i18n/I18nOverrideManager;", "", "<init>", "()V", "TAG", "", "ASSET_DIR", "enabledCache", "", "Ljava/lang/Boolean;", "localeMaps", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isEnabled", "isEnabled$annotations", "()Z", "refresh", "", Constants.LOCALEMATCHER_LOOKUP, "config", "Landroid/content/res/Configuration;", "resName", "localeKey", "mapFor", "key", "loadAsset", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class I18nOverrideManager {
    private static final String ASSET_DIR = "i18n_override";
    private static final String TAG = "I18nOverrideManager";
    private static volatile Boolean enabledCache;
    public static final I18nOverrideManager INSTANCE = new I18nOverrideManager();
    private static final HashMap<String, Map<String, String>> localeMaps = new HashMap<>();

    @JvmStatic
    public static /* synthetic */ void isEnabled$annotations() {
    }

    private I18nOverrideManager() {
    }

    public static final boolean isEnabled() {
        Boolean bool = enabledCache;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            z = NorthStarABManager.getABTestBooleanPerPlatform(NorthStartConfigs.ENABLE_I18N_PRECISION, false);
        } catch (Throwable unused) {
        }
        enabledCache = Boolean.valueOf(z);
        return z;
    }

    @JvmStatic
    public static final void refresh() {
        enabledCache = null;
    }

    public final String lookup(Configuration config, String resName) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(resName, "resName");
        if (!isEnabled()) {
            return null;
        }
        String localeKey = localeKey(config);
        Map<String, String> mapFor = mapFor(localeKey);
        if (mapFor == null) {
            String substringBefore$default = StringsKt.substringBefore$default(localeKey, "-r", (String) null, 2, (Object) null);
            mapFor = !Intrinsics.areEqual(substringBefore$default, localeKey) ? mapFor(substringBefore$default) : null;
        }
        if (mapFor != null) {
            return mapFor.get(resName);
        }
        return null;
    }

    private final String localeKey(Configuration config) {
        Locale locale = config.getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = language.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        Locale ROOT2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
        String upperCase = country.toUpperCase(ROOT2);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase.length() > 0 ? lowerCase + "-r" + upperCase : lowerCase;
    }

    private final Map<String, String> mapFor(String key) {
        HashMap<String, Map<String, String>> hashMap = localeMaps;
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        Map<String, String> loadAsset = loadAsset(key);
        synchronized (hashMap) {
            hashMap.put(key, loadAsset);
            Unit unit = Unit.INSTANCE;
        }
        return loadAsset;
    }

    private final Map<String, String> loadAsset(String key) {
        try {
            Context context = BaseApplication.getContext();
            if (context == null) {
                return null;
            }
            InputStream open = context.getAssets().open("i18n_override/" + key + ".json");
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(readText);
                HashMap hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
                LogUtils.i(TAG, "loaded override[" + key + "] size=" + hashMap.size());
                return hashMap;
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
