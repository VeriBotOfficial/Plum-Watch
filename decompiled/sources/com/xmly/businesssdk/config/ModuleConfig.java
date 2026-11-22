package com.xmly.businesssdk.config;

import com.facebook.react.uimanager.ViewProps;
import io.nats.client.support.ApiConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigSDKData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J!\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u0002H\u0016¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/config/ModuleConfig;", "", "moduleName", "", ViewProps.ENABLED, "", ApiConstants.OPTIONS, "", "(Ljava/lang/String;ZLjava/util/Map;)V", "getEnabled", "()Z", "getModuleName", "()Ljava/lang/String;", "getOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "getOption", "T", "key", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ModuleConfig {
    private final boolean enabled;
    private final String moduleName;
    private final Map<String, Object> options;

    public ModuleConfig(String moduleName, boolean z, Map<String, ? extends Object> options) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(options, "options");
        this.moduleName = moduleName;
        this.enabled = z;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleConfig copy$default(ModuleConfig moduleConfig, String str, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleConfig.moduleName;
        }
        if ((i & 2) != 0) {
            z = moduleConfig.enabled;
        }
        if ((i & 4) != 0) {
            map = moduleConfig.options;
        }
        return moduleConfig.copy(str, z, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Map<String, Object> component3() {
        return this.options;
    }

    public final ModuleConfig copy(String moduleName, boolean enabled, Map<String, ? extends Object> options) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(options, "options");
        return new ModuleConfig(moduleName, enabled, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleConfig)) {
            return false;
        }
        ModuleConfig moduleConfig = (ModuleConfig) other;
        return Intrinsics.areEqual(this.moduleName, moduleConfig.moduleName) && this.enabled == moduleConfig.enabled && Intrinsics.areEqual(this.options, moduleConfig.options);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final <T> T getOption(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (this.options.containsKey(key)) {
                return (T) this.options.get(key);
            }
        } catch (Exception unused) {
        }
        return defaultValue;
    }

    public final Map<String, Object> getOptions() {
        return this.options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.moduleName.hashCode() * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.options.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        return com.xmly.businesssdk.c.a("ModuleConfig(moduleName=").append(this.moduleName).append(", enabled=").append(this.enabled).append(", options=").append(this.options).append(')').toString();
    }
}
