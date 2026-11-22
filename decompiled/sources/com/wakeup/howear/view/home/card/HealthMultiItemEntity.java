package com.wakeup.howear.view.home.card;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.commponent.module.data.HealthData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthMultiItemEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000e¨\u0006 "}, d2 = {"Lcom/wakeup/howear/view/home/card/HealthMultiItemEntity;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "dataType", "", "type", Const.LBS_FAIL_BD_ENTITY, "", "Lcom/wakeup/commponent/module/data/HealthData;", "otherEntity", "", "<init>", "(IILjava/util/List;Ljava/lang/Object;)V", "getDataType", "()I", "setDataType", "(I)V", "getType", "setType", "getEntity", "()Ljava/util/List;", "setEntity", "(Ljava/util/List;)V", "getOtherEntity", "()Ljava/lang/Object;", "setOtherEntity", "(Ljava/lang/Object;)V", "itemType", "getItemType", "toString", "", "Companion", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthMultiItemEntity implements Serializable, MultiItemEntity {
    public static final int ACTIVE_RAINBOW = 11;
    public static final int ANNUAL_REPORT = 10;
    public static final int BIG_NONE_LAYOUT = 2;
    public static final int BLOOD_SUGAR_LAYOUT = 6;
    public static final int BO_LAYOUT = 13;
    public static final int CARD_AD = 12;
    public static final int EDIT_LAYOUT = -1;
    public static final int HEART_LAYOUT = 14;
    public static final int MENSTRUAL_LAYOUT = 8;
    public static final int NONE_LAYOUT = 1;
    public static final int NORMAL_LAYOUT = 0;
    public static final int PRESSURE_LAYOUT = 7;
    public static final int SLEEP_APNEA_LAYOUT = 15;
    public static final int SLEEP_LAYOUT = 3;
    public static final int SPORT_LAYOUT = 9;
    public static final int TEMPERATURE_LAYOUT = 5;
    public static final int VALID_LAYOUT = 4;
    private int dataType;
    private List<HealthData> entity;
    private Object otherEntity;
    private int type;

    public HealthMultiItemEntity(int i, int i2, List<HealthData> entity, Object obj) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.dataType = i;
        this.type = i2;
        this.entity = entity;
        this.otherEntity = obj;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public /* synthetic */ HealthMultiItemEntity(int i, int i2, ArrayList arrayList, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new ArrayList() : arrayList, (i3 & 8) != 0 ? null : obj);
    }

    public final List<HealthData> getEntity() {
        return this.entity;
    }

    public final void setEntity(List<HealthData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.entity = list;
    }

    public final Object getOtherEntity() {
        return this.otherEntity;
    }

    public final void setOtherEntity(Object obj) {
        this.otherEntity = obj;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return "HealthMultiItemEntity(entity=" + this.entity.size() + ", dataType=" + this.dataType + ", type=" + this.type + ", itemType=" + getType() + Separators.RPAREN;
    }
}
