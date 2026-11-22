package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomepageChannelList.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/video/Locale;", "", "en", "", "zh", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getZh", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Locale {
    private final String en;
    private final String zh;

    public static /* synthetic */ Locale copy$default(Locale locale, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locale.en;
        }
        if ((i & 2) != 0) {
            str2 = locale.zh;
        }
        return locale.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    /* renamed from: component2, reason: from getter */
    public final String getZh() {
        return this.zh;
    }

    public final Locale copy(String en, String zh) {
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(zh, "zh");
        return new Locale(en, zh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Locale)) {
            return false;
        }
        Locale locale = (Locale) other;
        return Intrinsics.areEqual(this.en, locale.en) && Intrinsics.areEqual(this.zh, locale.zh);
    }

    public int hashCode() {
        return (this.en.hashCode() * 31) + this.zh.hashCode();
    }

    public String toString() {
        return "Locale(en=" + this.en + ", zh=" + this.zh + Separators.RPAREN;
    }

    public Locale(String en, String zh) {
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(zh, "zh");
        this.en = en;
        this.zh = zh;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getZh() {
        return this.zh;
    }
}
