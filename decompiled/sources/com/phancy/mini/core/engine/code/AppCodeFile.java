package com.phancy.mini.core.engine.code;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppCodeFile.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/phancy/mini/core/engine/code/AppCodeFile;", "", "src", "", "script", "(Ljava/lang/String;Ljava/lang/String;)V", "getScript", "()Ljava/lang/String;", "getSrc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AppCodeFile {
    private final String script;
    private final String src;

    public static /* synthetic */ AppCodeFile copy$default(AppCodeFile appCodeFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appCodeFile.src;
        }
        if ((i & 2) != 0) {
            str2 = appCodeFile.script;
        }
        return appCodeFile.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScript() {
        return this.script;
    }

    public final AppCodeFile copy(String src, String script) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(script, "script");
        return new AppCodeFile(src, script);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCodeFile)) {
            return false;
        }
        AppCodeFile appCodeFile = (AppCodeFile) other;
        return Intrinsics.areEqual(this.src, appCodeFile.src) && Intrinsics.areEqual(this.script, appCodeFile.script);
    }

    public int hashCode() {
        return (this.src.hashCode() * 31) + this.script.hashCode();
    }

    public String toString() {
        return "AppCodeFile(src=" + this.src + ", script=" + this.script + ')';
    }

    public AppCodeFile(String src, String script) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(script, "script");
        this.src = src;
        this.script = script;
    }

    public final String getScript() {
        return this.script;
    }

    public final String getSrc() {
        return this.src;
    }
}
