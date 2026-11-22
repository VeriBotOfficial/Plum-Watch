package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiLanguage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u001d\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000eHÆ\u0003Jy\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000eHÆ\u0001J\u0013\u00108\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R.\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010,\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)¨\u0006="}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiLanguage;", "Ljava/io/Serializable;", "languageId", "", "languageZhName", "", "languageEnName", "languageCode", "productId", "ruleContentType", "firmwareLanguageId", "supplierType", "unMutualTranslationList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/ArrayList;)V", "getLanguageId", "()I", "setLanguageId", "(I)V", "getLanguageZhName", "()Ljava/lang/String;", "setLanguageZhName", "(Ljava/lang/String;)V", "getLanguageEnName", "setLanguageEnName", "getLanguageCode", "setLanguageCode", "getProductId", "getRuleContentType", "getFirmwareLanguageId", "getSupplierType", "getUnMutualTranslationList", "()Ljava/util/ArrayList;", "setUnMutualTranslationList", "(Ljava/util/ArrayList;)V", "isCheck", "", "()Z", "setCheck", "(Z)V", "isEnable", "setEnable", "isMutualTran", "setMutualTran", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiLanguage implements Serializable {
    private final int firmwareLanguageId;
    private boolean isCheck;
    private boolean isEnable;
    private boolean isMutualTran;
    private String languageCode;
    private String languageEnName;
    private int languageId;
    private String languageZhName;
    private final int productId;
    private final int ruleContentType;
    private final int supplierType;
    private ArrayList<Integer> unMutualTranslationList;

    public AiLanguage() {
        this(0, null, null, null, 0, 0, 0, 0, null, 511, null);
    }

    public static /* synthetic */ AiLanguage copy$default(AiLanguage aiLanguage, int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = aiLanguage.languageId;
        }
        if ((i6 & 2) != 0) {
            str = aiLanguage.languageZhName;
        }
        if ((i6 & 4) != 0) {
            str2 = aiLanguage.languageEnName;
        }
        if ((i6 & 8) != 0) {
            str3 = aiLanguage.languageCode;
        }
        if ((i6 & 16) != 0) {
            i2 = aiLanguage.productId;
        }
        if ((i6 & 32) != 0) {
            i3 = aiLanguage.ruleContentType;
        }
        if ((i6 & 64) != 0) {
            i4 = aiLanguage.firmwareLanguageId;
        }
        if ((i6 & 128) != 0) {
            i5 = aiLanguage.supplierType;
        }
        if ((i6 & 256) != 0) {
            arrayList = aiLanguage.unMutualTranslationList;
        }
        int i7 = i5;
        ArrayList arrayList2 = arrayList;
        int i8 = i3;
        int i9 = i4;
        int i10 = i2;
        String str4 = str2;
        return aiLanguage.copy(i, str, str4, str3, i10, i8, i9, i7, arrayList2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLanguageId() {
        return this.languageId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguageZhName() {
        return this.languageZhName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguageEnName() {
        return this.languageEnName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component5, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getFirmwareLanguageId() {
        return this.firmwareLanguageId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSupplierType() {
        return this.supplierType;
    }

    public final ArrayList<Integer> component9() {
        return this.unMutualTranslationList;
    }

    public final AiLanguage copy(int languageId, String languageZhName, String languageEnName, String languageCode, int productId, int ruleContentType, int firmwareLanguageId, int supplierType, ArrayList<Integer> unMutualTranslationList) {
        Intrinsics.checkNotNullParameter(languageZhName, "languageZhName");
        Intrinsics.checkNotNullParameter(languageEnName, "languageEnName");
        return new AiLanguage(languageId, languageZhName, languageEnName, languageCode, productId, ruleContentType, firmwareLanguageId, supplierType, unMutualTranslationList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiLanguage)) {
            return false;
        }
        AiLanguage aiLanguage = (AiLanguage) other;
        return this.languageId == aiLanguage.languageId && Intrinsics.areEqual(this.languageZhName, aiLanguage.languageZhName) && Intrinsics.areEqual(this.languageEnName, aiLanguage.languageEnName) && Intrinsics.areEqual(this.languageCode, aiLanguage.languageCode) && this.productId == aiLanguage.productId && this.ruleContentType == aiLanguage.ruleContentType && this.firmwareLanguageId == aiLanguage.firmwareLanguageId && this.supplierType == aiLanguage.supplierType && Intrinsics.areEqual(this.unMutualTranslationList, aiLanguage.unMutualTranslationList);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.languageId) * 31) + this.languageZhName.hashCode()) * 31) + this.languageEnName.hashCode()) * 31;
        String str = this.languageCode;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.productId)) * 31) + Integer.hashCode(this.ruleContentType)) * 31) + Integer.hashCode(this.firmwareLanguageId)) * 31) + Integer.hashCode(this.supplierType)) * 31;
        ArrayList<Integer> arrayList = this.unMutualTranslationList;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "AiLanguage(languageId=" + this.languageId + ", languageZhName=" + this.languageZhName + ", languageEnName=" + this.languageEnName + ", languageCode=" + this.languageCode + ", productId=" + this.productId + ", ruleContentType=" + this.ruleContentType + ", firmwareLanguageId=" + this.firmwareLanguageId + ", supplierType=" + this.supplierType + ", unMutualTranslationList=" + this.unMutualTranslationList + Separators.RPAREN;
    }

    public AiLanguage(int i, String languageZhName, String languageEnName, String str, int i2, int i3, int i4, int i5, ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(languageZhName, "languageZhName");
        Intrinsics.checkNotNullParameter(languageEnName, "languageEnName");
        this.languageId = i;
        this.languageZhName = languageZhName;
        this.languageEnName = languageEnName;
        this.languageCode = str;
        this.productId = i2;
        this.ruleContentType = i3;
        this.firmwareLanguageId = i4;
        this.supplierType = i5;
        this.unMutualTranslationList = arrayList;
        this.isEnable = true;
    }

    public /* synthetic */ AiLanguage(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? null : arrayList);
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final void setLanguageId(int i) {
        this.languageId = i;
    }

    public final String getLanguageZhName() {
        return this.languageZhName;
    }

    public final void setLanguageZhName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageZhName = str;
    }

    public final String getLanguageEnName() {
        return this.languageEnName;
    }

    public final void setLanguageEnName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageEnName = str;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    public final int getFirmwareLanguageId() {
        return this.firmwareLanguageId;
    }

    public final int getSupplierType() {
        return this.supplierType;
    }

    public final ArrayList<Integer> getUnMutualTranslationList() {
        return this.unMutualTranslationList;
    }

    public final void setUnMutualTranslationList(ArrayList<Integer> arrayList) {
        this.unMutualTranslationList = arrayList;
    }

    /* renamed from: isCheck, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    /* renamed from: isEnable, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    /* renamed from: isMutualTran, reason: from getter */
    public final boolean getIsMutualTran() {
        return this.isMutualTran;
    }

    public final void setMutualTran(boolean z) {
        this.isMutualTran = z;
    }
}
