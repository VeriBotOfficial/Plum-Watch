package com.wakeup.module.gpt.entity;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: CreateTypeEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/wakeup/module/gpt/entity/CreateTypeEntity;", "", "type", "", "classify", "iconUrl", "title", "desc", "<init>", "(IIIII)V", "getType", "()I", "getClassify", "getIconUrl", "getTitle", "getDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateTypeEntity {
    public static final int CLASSIFY_HOST = 1;
    public static final int CLASSIFY_PLAY = 4;
    public static final int CLASSIFY_WORK = 2;
    private final int classify;
    private final int desc;
    private final int iconUrl;
    private final int title;
    private final int type;

    public static /* synthetic */ CreateTypeEntity copy$default(CreateTypeEntity createTypeEntity, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = createTypeEntity.type;
        }
        if ((i6 & 2) != 0) {
            i2 = createTypeEntity.classify;
        }
        if ((i6 & 4) != 0) {
            i3 = createTypeEntity.iconUrl;
        }
        if ((i6 & 8) != 0) {
            i4 = createTypeEntity.title;
        }
        if ((i6 & 16) != 0) {
            i5 = createTypeEntity.desc;
        }
        int i7 = i5;
        int i8 = i3;
        return createTypeEntity.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getClassify() {
        return this.classify;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDesc() {
        return this.desc;
    }

    public final CreateTypeEntity copy(int type, int classify, int iconUrl, int title, int desc) {
        return new CreateTypeEntity(type, classify, iconUrl, title, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTypeEntity)) {
            return false;
        }
        CreateTypeEntity createTypeEntity = (CreateTypeEntity) other;
        return this.type == createTypeEntity.type && this.classify == createTypeEntity.classify && this.iconUrl == createTypeEntity.iconUrl && this.title == createTypeEntity.title && this.desc == createTypeEntity.desc;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.classify)) * 31) + Integer.hashCode(this.iconUrl)) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.desc);
    }

    public String toString() {
        return "CreateTypeEntity(type=" + this.type + ", classify=" + this.classify + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", desc=" + this.desc + Separators.RPAREN;
    }

    public CreateTypeEntity(int i, int i2, int i3, int i4, int i5) {
        this.type = i;
        this.classify = i2;
        this.iconUrl = i3;
        this.title = i4;
        this.desc = i5;
    }

    public final int getType() {
        return this.type;
    }

    public final int getClassify() {
        return this.classify;
    }

    public final int getIconUrl() {
        return this.iconUrl;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDesc() {
        return this.desc;
    }
}
