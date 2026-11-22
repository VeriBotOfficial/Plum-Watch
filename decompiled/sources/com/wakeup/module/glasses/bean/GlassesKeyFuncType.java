package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyFuncType.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesKeyFuncType;", "", "typeDesc", "", "keyFuncDesc", "isOptional", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTypeDesc", "()Ljava/lang/String;", "getKeyFuncDesc", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesKeyFuncType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isOptional;
    private final String keyFuncDesc;
    private final String typeDesc;

    public static /* synthetic */ GlassesKeyFuncType copy$default(GlassesKeyFuncType glassesKeyFuncType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesKeyFuncType.typeDesc;
        }
        if ((i & 2) != 0) {
            str2 = glassesKeyFuncType.keyFuncDesc;
        }
        if ((i & 4) != 0) {
            z = glassesKeyFuncType.isOptional;
        }
        return glassesKeyFuncType.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeDesc() {
        return this.typeDesc;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKeyFuncDesc() {
        return this.keyFuncDesc;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    public final GlassesKeyFuncType copy(String typeDesc, String keyFuncDesc, boolean isOptional) {
        Intrinsics.checkNotNullParameter(typeDesc, "typeDesc");
        Intrinsics.checkNotNullParameter(keyFuncDesc, "keyFuncDesc");
        return new GlassesKeyFuncType(typeDesc, keyFuncDesc, isOptional);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesKeyFuncType)) {
            return false;
        }
        GlassesKeyFuncType glassesKeyFuncType = (GlassesKeyFuncType) other;
        return Intrinsics.areEqual(this.typeDesc, glassesKeyFuncType.typeDesc) && Intrinsics.areEqual(this.keyFuncDesc, glassesKeyFuncType.keyFuncDesc) && this.isOptional == glassesKeyFuncType.isOptional;
    }

    public int hashCode() {
        return (((this.typeDesc.hashCode() * 31) + this.keyFuncDesc.hashCode()) * 31) + Boolean.hashCode(this.isOptional);
    }

    public String toString() {
        return "GlassesKeyFuncType(typeDesc=" + this.typeDesc + ", keyFuncDesc=" + this.keyFuncDesc + ", isOptional=" + this.isOptional + Separators.RPAREN;
    }

    public GlassesKeyFuncType(String typeDesc, String keyFuncDesc, boolean z) {
        Intrinsics.checkNotNullParameter(typeDesc, "typeDesc");
        Intrinsics.checkNotNullParameter(keyFuncDesc, "keyFuncDesc");
        this.typeDesc = typeDesc;
        this.keyFuncDesc = keyFuncDesc;
        this.isOptional = z;
    }

    public final String getTypeDesc() {
        return this.typeDesc;
    }

    public final String getKeyFuncDesc() {
        return this.keyFuncDesc;
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    /* compiled from: GlassesKeyFuncType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesKeyFuncType$Companion;", "", "<init>", "()V", "getKeyFuncStr", "", "kotlin.jvm.PlatformType", "key", "", "(I)Ljava/lang/String;", "getKeyTypeStr", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getKeyFuncStr(int key) {
            switch (key) {
                case 1:
                    return StringUtils.getString(R.string.glasses_f_take_picture);
                case 2:
                    return StringUtils.getString(R.string.glasses_f_picture_record);
                case 3:
                    return StringUtils.getString(R.string.glasses_f_voice_record);
                case 4:
                    return StringUtils.getString(R.string.glasses_f_on_off);
                case 5:
                default:
                    return "";
                case 6:
                    return StringUtils.getString(R.string.glasses_f_intercpt_play);
                case 7:
                    return StringUtils.getString(R.string.glasses_f_voice_assistant);
                case 8:
                    return StringUtils.getString(R.string.glasses_f_muisc_control1);
                case 9:
                    return StringUtils.getString(R.string.glasses_f_switch_model);
                case 10:
                    return StringUtils.getString(R.string.headphone_next_track);
                case 11:
                    return StringUtils.getString(R.string.headphone_previous_piece);
                case 12:
                    return StringUtils.getString(R.string.glasses_f_voice_p_assistant);
                case 13:
                    return StringUtils.getString(R.string.glasses_f_muisc_control2);
                case 14:
                    return StringUtils.getString(R.string.g_a_key_func1);
                case 15:
                    return StringUtils.getString(R.string.g_a_key_func2);
            }
        }

        public final String getKeyTypeStr(int key) {
            switch (key) {
                case 0:
                    return StringUtils.getString(R.string.headphone_short_press);
                case 1:
                    return StringUtils.getString(R.string.headphone_double_click);
                case 2:
                    return StringUtils.getString(R.string.headphone_three_click);
                case 3:
                    return StringUtils.getString(R.string.glasses_long_click_2);
                case 4:
                    return StringUtils.getString(R.string.glasses_long_click_3);
                case 5:
                    return StringUtils.getString(R.string.g_a_key_type1);
                case 6:
                    return StringUtils.getString(R.string.g_a_key_type2);
                case 7:
                    return StringUtils.getString(R.string.g_a_key_type3);
                case 8:
                    return StringUtils.getString(R.string.g_a_key_type4);
                default:
                    return "";
            }
        }
    }
}
