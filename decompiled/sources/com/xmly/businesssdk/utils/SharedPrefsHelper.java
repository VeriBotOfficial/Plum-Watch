package com.xmly.businesssdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: SharedPrefsHelper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000fJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007J\u0016\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u001c\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aJ\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xmly/businesssdk/utils/SharedPrefsHelper;", "", "context", "Landroid/content/Context;", "prefsName", "", DOMConstants.ATTR_MODE, "", "(Landroid/content/Context;Ljava/lang/String;I)V", "sharedPreferences", "Landroid/content/SharedPreferences;", SDPKeywords.CLEAR, "", "commitChanges", "contains", "", "key", "getBoolean", "defaultValue", "getFloat", "", "getInt", "getLong", "", "getString", "getStringSet", "", "putBoolean", "value", "putFloat", "putInt", "putLong", "putString", "putStringSet", "remove", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedPrefsHelper {
    private final SharedPreferences sharedPreferences;

    public SharedPrefsHelper(Context context, String prefsName, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsName, "prefsName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName, i);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(prefsName, mode)");
        this.sharedPreferences = sharedPreferences;
    }

    public static /* synthetic */ boolean getBoolean$default(SharedPrefsHelper sharedPrefsHelper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sharedPrefsHelper.getBoolean(str, z);
    }

    public static /* synthetic */ float getFloat$default(SharedPrefsHelper sharedPrefsHelper, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return sharedPrefsHelper.getFloat(str, f);
    }

    public static /* synthetic */ int getInt$default(SharedPrefsHelper sharedPrefsHelper, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sharedPrefsHelper.getInt(str, i);
    }

    public static /* synthetic */ long getLong$default(SharedPrefsHelper sharedPrefsHelper, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return sharedPrefsHelper.getLong(str, j);
    }

    public static /* synthetic */ String getString$default(SharedPrefsHelper sharedPrefsHelper, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return sharedPrefsHelper.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPrefsHelper sharedPrefsHelper, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return sharedPrefsHelper.getStringSet(str, set);
    }

    public final void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    public final void commitChanges() {
        this.sharedPreferences.edit().commit();
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.contains(key);
    }

    public final boolean getBoolean(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getBoolean(key, defaultValue);
    }

    public final float getFloat(String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getFloat(key, defaultValue);
    }

    public final int getInt(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getInt(key, defaultValue);
    }

    public final long getLong(String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getLong(key, defaultValue);
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String string = this.sharedPreferences.getString(key, defaultValue);
        return string == null ? defaultValue : string;
    }

    public final Set<String> getStringSet(String key, Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Set<String> stringSet = this.sharedPreferences.getStringSet(key, defaultValue);
        return stringSet == null ? defaultValue : stringSet;
    }

    public final void putBoolean(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putBoolean(key, value).apply();
    }

    public final void putFloat(String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putFloat(key, value).apply();
    }

    public final void putInt(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putInt(key, value).apply();
    }

    public final void putLong(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().putLong(key, value).apply();
    }

    public final void putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sharedPreferences.edit().putString(key, value).apply();
    }

    public final void putStringSet(String key, Set<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sharedPreferences.edit().putStringSet(key, value).apply();
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().remove(key).apply();
    }

    public /* synthetic */ SharedPrefsHelper(Context context, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? 0 : i);
    }
}
