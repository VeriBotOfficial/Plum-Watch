package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: GlassesKey.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J'\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u0019R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u0019R\u001a\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u0019¨\u0006="}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesKey;", "", "keyId", "", "keyType", "keySide", "<init>", "(III)V", "getKeyId", "()I", "getKeyType", "getKeySide", "singleClickOptional", "", "getSingleClickOptional", "()Ljava/util/List;", "doubleClickOptional", "getDoubleClickOptional", "tripleClickOptional", "getTripleClickOptional", "pressOptional", "getPressOptional", "singleClickFunction", "getSingleClickFunction", "setSingleClickFunction", "(I)V", "doubleClickFunction", "getDoubleClickFunction", "setDoubleClickFunction", "tripleClickFunction", "getTripleClickFunction", "setTripleClickFunction", "pressTwoFunction", "getPressTwoFunction", "setPressTwoFunction", "pressThreeFunction", "getPressThreeFunction", "setPressThreeFunction", "pressFourFunction", "getPressFourFunction", "setPressFourFunction", "pressFiveFunction", "getPressFiveFunction", "setPressFiveFunction", "frontSlipFunction", "getFrontSlipFunction", "setFrontSlipFunction", "backSlipSlipFunction", "getBackSlipSlipFunction", "setBackSlipSlipFunction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesKey {
    public static final int ID_INTERRUPT_VOICE_BROADCAST = 6;
    public static final int ID_MUSIC_CONTROL_PLAY = 8;
    public static final int ID_MUSIC_CONTROL_STOP = 13;
    public static final int ID_NEXT_MUSIC = 10;
    public static final int ID_NO_FUNCTION = 0;
    public static final int ID_ON_OFF = 4;
    public static final int ID_PICTURE_RECORD = 2;
    public static final int ID_PRE_MUSIC = 11;
    public static final int ID_SWITCH_MUSIC_MODE = 9;
    public static final int ID_TAKE_PICTURE = 1;
    public static final int ID_VOICE_ASSISTANT = 7;
    public static final int ID_VOICE_PHONE_ASSISTANT = 12;
    public static final int ID_VOICE_RECORD = 3;
    public static final int ID_VOLUME_DOWN = 15;
    public static final int ID_VOLUME_UP = 14;
    public static final int KEY_TYPE_BACK_SLIP = 8;
    public static final int KEY_TYPE_CLICK = 0;
    public static final int KEY_TYPE_DOUBLE_CLICK = 1;
    public static final int KEY_TYPE_FRONT_SLIP = 7;
    public static final int KEY_TYPE_LONG_2S = 3;
    public static final int KEY_TYPE_LONG_3S = 4;
    public static final int KEY_TYPE_LONG_4S = 5;
    public static final int KEY_TYPE_LONG_5S = 6;
    public static final int KEY_TYPE_THREE_CLICK = 2;
    private int backSlipSlipFunction;
    private int doubleClickFunction;
    private int frontSlipFunction;
    private final int keyId;
    private final int keySide;
    private final int keyType;
    private int pressFiveFunction;
    private int pressFourFunction;
    private int pressThreeFunction;
    private int pressTwoFunction;
    private int singleClickFunction;
    private int tripleClickFunction;
    private final List<Integer> singleClickOptional = CollectionsKt.emptyList();
    private final List<Integer> doubleClickOptional = CollectionsKt.emptyList();
    private final List<Integer> tripleClickOptional = CollectionsKt.emptyList();
    private final List<Integer> pressOptional = CollectionsKt.emptyList();

    public static /* synthetic */ GlassesKey copy$default(GlassesKey glassesKey, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = glassesKey.keyId;
        }
        if ((i4 & 2) != 0) {
            i2 = glassesKey.keyType;
        }
        if ((i4 & 4) != 0) {
            i3 = glassesKey.keySide;
        }
        return glassesKey.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getKeyId() {
        return this.keyId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getKeyType() {
        return this.keyType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getKeySide() {
        return this.keySide;
    }

    public final GlassesKey copy(int keyId, int keyType, int keySide) {
        return new GlassesKey(keyId, keyType, keySide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesKey)) {
            return false;
        }
        GlassesKey glassesKey = (GlassesKey) other;
        return this.keyId == glassesKey.keyId && this.keyType == glassesKey.keyType && this.keySide == glassesKey.keySide;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.keyId) * 31) + Integer.hashCode(this.keyType)) * 31) + Integer.hashCode(this.keySide);
    }

    public String toString() {
        return "GlassesKey(keyId=" + this.keyId + ", keyType=" + this.keyType + ", keySide=" + this.keySide + Separators.RPAREN;
    }

    public GlassesKey(int i, int i2, int i3) {
        this.keyId = i;
        this.keyType = i2;
        this.keySide = i3;
    }

    public final int getKeyId() {
        return this.keyId;
    }

    public final int getKeyType() {
        return this.keyType;
    }

    public final int getKeySide() {
        return this.keySide;
    }

    public final List<Integer> getSingleClickOptional() {
        return this.singleClickOptional;
    }

    public final List<Integer> getDoubleClickOptional() {
        return this.doubleClickOptional;
    }

    public final List<Integer> getTripleClickOptional() {
        return this.tripleClickOptional;
    }

    public final List<Integer> getPressOptional() {
        return this.pressOptional;
    }

    public final int getSingleClickFunction() {
        return this.singleClickFunction;
    }

    public final void setSingleClickFunction(int i) {
        this.singleClickFunction = i;
    }

    public final int getDoubleClickFunction() {
        return this.doubleClickFunction;
    }

    public final void setDoubleClickFunction(int i) {
        this.doubleClickFunction = i;
    }

    public final int getTripleClickFunction() {
        return this.tripleClickFunction;
    }

    public final void setTripleClickFunction(int i) {
        this.tripleClickFunction = i;
    }

    public final int getPressTwoFunction() {
        return this.pressTwoFunction;
    }

    public final void setPressTwoFunction(int i) {
        this.pressTwoFunction = i;
    }

    public final int getPressThreeFunction() {
        return this.pressThreeFunction;
    }

    public final void setPressThreeFunction(int i) {
        this.pressThreeFunction = i;
    }

    public final int getPressFourFunction() {
        return this.pressFourFunction;
    }

    public final void setPressFourFunction(int i) {
        this.pressFourFunction = i;
    }

    public final int getPressFiveFunction() {
        return this.pressFiveFunction;
    }

    public final void setPressFiveFunction(int i) {
        this.pressFiveFunction = i;
    }

    public final int getFrontSlipFunction() {
        return this.frontSlipFunction;
    }

    public final void setFrontSlipFunction(int i) {
        this.frontSlipFunction = i;
    }

    public final int getBackSlipSlipFunction() {
        return this.backSlipSlipFunction;
    }

    public final void setBackSlipSlipFunction(int i) {
        this.backSlipSlipFunction = i;
    }
}
