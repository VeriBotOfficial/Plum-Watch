package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/opts/MessageEntity;", "", "id", "", "name", "introduce", SocialConstants.PARAM_IMG_URL, "createTime", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getId", "()Ljava/lang/String;", "getName", "getIntroduce", "getImg", "getCreateTime", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageEntity {
    private final String createTime;
    private final String id;
    private final String img;
    private final String introduce;
    private final OptsJumpModel jumpVo;
    private final String name;

    public static /* synthetic */ MessageEntity copy$default(MessageEntity messageEntity, String str, String str2, String str3, String str4, String str5, OptsJumpModel optsJumpModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = messageEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = messageEntity.introduce;
        }
        if ((i & 8) != 0) {
            str4 = messageEntity.img;
        }
        if ((i & 16) != 0) {
            str5 = messageEntity.createTime;
        }
        if ((i & 32) != 0) {
            optsJumpModel = messageEntity.jumpVo;
        }
        String str6 = str5;
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        return messageEntity.copy(str, str2, str3, str4, str6, optsJumpModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final MessageEntity copy(String id2, String name, String introduce, String img, String createTime, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduce, "introduce");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new MessageEntity(id2, name, introduce, img, createTime, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEntity)) {
            return false;
        }
        MessageEntity messageEntity = (MessageEntity) other;
        return Intrinsics.areEqual(this.id, messageEntity.id) && Intrinsics.areEqual(this.name, messageEntity.name) && Intrinsics.areEqual(this.introduce, messageEntity.introduce) && Intrinsics.areEqual(this.img, messageEntity.img) && Intrinsics.areEqual(this.createTime, messageEntity.createTime) && Intrinsics.areEqual(this.jumpVo, messageEntity.jumpVo);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.img.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.jumpVo.hashCode();
    }

    public String toString() {
        return "MessageEntity(id=" + this.id + ", name=" + this.name + ", introduce=" + this.introduce + ", img=" + this.img + ", createTime=" + this.createTime + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public MessageEntity(String id2, String name, String introduce, String img, String createTime, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduce, "introduce");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.id = id2;
        this.name = name;
        this.introduce = introduce;
        this.img = img;
        this.createTime = createTime;
        this.jumpVo = jumpVo;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIntroduce() {
        return this.introduce;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }
}
