package com.wakeup.feature.translate.entity;

import android.gov.nist.core.Separators;
import com.anythink.expressad.video.dynview.a.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/translate/entity/LanguageEntity;", "", "id", "", "languageCode", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getLanguageCode", "()Ljava/lang/String;", "getBaiduCode", "getAliAsrCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-translate_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LanguageEntity {
    private static final Map<String, String> baiduCode = MapsKt.mapOf(TuplesKt.to("zh", "zh"), TuplesKt.to("en", "en"), TuplesKt.to(a.Y, a.Y), TuplesKt.to(a.X, "ara"), TuplesKt.to("es", "spa"), TuplesKt.to("id", "id"), TuplesKt.to("de", "de"), TuplesKt.to("vi", "vie"), TuplesKt.to(a.T, "jp"), TuplesKt.to(a.V, "kor"));
    private final int id;
    private final String languageCode;

    public static /* synthetic */ LanguageEntity copy$default(LanguageEntity languageEntity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = languageEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = languageEntity.languageCode;
        }
        return languageEntity.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final LanguageEntity copy(int id2, String languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        return new LanguageEntity(id2, languageCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageEntity)) {
            return false;
        }
        LanguageEntity languageEntity = (LanguageEntity) other;
        return this.id == languageEntity.id && Intrinsics.areEqual(this.languageCode, languageEntity.languageCode);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.languageCode.hashCode();
    }

    public String toString() {
        return "LanguageEntity(id=" + this.id + ", languageCode=" + this.languageCode + Separators.RPAREN;
    }

    public LanguageEntity(int i, String languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.id = i;
        this.languageCode = languageCode;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getBaiduCode() {
        String str = baiduCode.get(this.languageCode);
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final String getAliAsrCode() {
        String str = this.languageCode;
        int hashCode = str.hashCode();
        if (hashCode == 3121) {
            return !str.equals(a.X) ? "0" : "11";
        }
        if (hashCode == 3201) {
            return !str.equals("de") ? "0" : "8";
        }
        if (hashCode == 3241) {
            return !str.equals("en") ? "0" : "1";
        }
        if (hashCode == 3246) {
            return !str.equals("es") ? "0" : "3";
        }
        if (hashCode == 3355) {
            return !str.equals("id") ? "0" : "15";
        }
        if (hashCode == 3383) {
            return !str.equals(a.T) ? "0" : "6";
        }
        if (hashCode == 3428) {
            return !str.equals(a.V) ? "0" : "9";
        }
        if (hashCode == 3651) {
            return !str.equals(a.Y) ? "0" : "5";
        }
        if (hashCode == 3763) {
            return !str.equals("vi") ? "0" : "24";
        }
        if (hashCode != 3886) {
            return "0";
        }
        str.equals("zh");
        return "0";
    }
}
