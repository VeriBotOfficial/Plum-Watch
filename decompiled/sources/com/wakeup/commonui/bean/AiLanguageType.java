package com.wakeup.commonui.bean;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.ai.AiLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiLanguageType.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/commonui/bean/AiLanguageType;", "", "type", "", "dataList", "", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiLanguageType {
    private final List<AiLanguage> dataList;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiLanguageType copy$default(AiLanguageType aiLanguageType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiLanguageType.type;
        }
        if ((i & 2) != 0) {
            list = aiLanguageType.dataList;
        }
        return aiLanguageType.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<AiLanguage> component2() {
        return this.dataList;
    }

    public final AiLanguageType copy(String type, List<AiLanguage> dataList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new AiLanguageType(type, dataList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiLanguageType)) {
            return false;
        }
        AiLanguageType aiLanguageType = (AiLanguageType) other;
        return Intrinsics.areEqual(this.type, aiLanguageType.type) && Intrinsics.areEqual(this.dataList, aiLanguageType.dataList);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.dataList.hashCode();
    }

    public String toString() {
        return "AiLanguageType(type=" + this.type + ", dataList=" + this.dataList + Separators.RPAREN;
    }

    public AiLanguageType(String type, List<AiLanguage> dataList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.type = type;
        this.dataList = dataList;
    }

    public final String getType() {
        return this.type;
    }

    public final List<AiLanguage> getDataList() {
        return this.dataList;
    }
}
