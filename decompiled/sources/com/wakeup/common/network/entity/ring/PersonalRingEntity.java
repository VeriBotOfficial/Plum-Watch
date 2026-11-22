package com.wakeup.common.network.entity.ring;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalRingEntity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0001RB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J1\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010M\u001a\u00020\u00172\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0007HÖ\u0001J\t\u0010Q\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010 R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010$R\u001a\u00101\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010$R\u001a\u00104\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010 R\u001a\u00107\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001a\u0010:\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R\u001a\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u0015R\u001a\u0010@\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010 R\u001a\u0010C\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0010\"\u0004\bE\u0010 R\u0014\u0010F\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0010¨\u0006S"}, d2 = {"Lcom/wakeup/common/network/entity/ring/PersonalRingEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "name", "", "musicCategoryId", "", "musicTypeId", "<init>", "(JLjava/lang/String;II)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getMusicCategoryId", "()I", "getMusicTypeId", "firmwareId", "getFirmwareId", "setFirmwareId", "(J)V", "isLocalFile", "", "()Z", "setLocalFile", "(Z)V", "isSelect", "setSelect", "duration", "getDuration", "setDuration", "(I)V", "cover", "getCover", "setCover", "(Ljava/lang/String;)V", "memberEnable", "getMemberEnable", "setMemberEnable", "playTimes", "", "getPlayTimes", "()D", "setPlayTimes", "(D)V", "singer", "getSinger", "setSinger", "filePath", "getFilePath", "setFilePath", "feeType", "getFeeType", "setFeeType", "price", "getPrice", "setPrice", "dollar", "getDollar", "setDollar", "fileSize", "getFileSize", "setFileSize", "setStatus", "getSetStatus", "setSetStatus", "layoutType", "getLayoutType", "setLayoutType", "itemType", "getItemType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PersonalRingEntity implements MultiItemEntity {
    public static final int LAYOUT_NORMAL = 0;
    public static final int LAYOUT_TITLE = 1;
    private String cover;
    private double dollar;
    private int duration;
    private int feeType;
    private String filePath;
    private long fileSize;
    private long firmwareId;
    private final long id;
    private boolean isLocalFile;
    private boolean isSelect;
    private int layoutType;
    private int memberEnable;
    private final int musicCategoryId;
    private final int musicTypeId;
    private final String name;
    private double playTimes;
    private double price;
    private int setStatus;
    private String singer;

    public PersonalRingEntity() {
        this(0L, null, 0, 0, 15, null);
    }

    public static /* synthetic */ PersonalRingEntity copy$default(PersonalRingEntity personalRingEntity, long j, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = personalRingEntity.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = personalRingEntity.name;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = personalRingEntity.musicCategoryId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = personalRingEntity.musicTypeId;
        }
        return personalRingEntity.copy(j2, str2, i4, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMusicCategoryId() {
        return this.musicCategoryId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMusicTypeId() {
        return this.musicTypeId;
    }

    public final PersonalRingEntity copy(long id2, String name, int musicCategoryId, int musicTypeId) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PersonalRingEntity(id2, name, musicCategoryId, musicTypeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalRingEntity)) {
            return false;
        }
        PersonalRingEntity personalRingEntity = (PersonalRingEntity) other;
        return this.id == personalRingEntity.id && Intrinsics.areEqual(this.name, personalRingEntity.name) && this.musicCategoryId == personalRingEntity.musicCategoryId && this.musicTypeId == personalRingEntity.musicTypeId;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.musicCategoryId)) * 31) + Integer.hashCode(this.musicTypeId);
    }

    public String toString() {
        return "PersonalRingEntity(id=" + this.id + ", name=" + this.name + ", musicCategoryId=" + this.musicCategoryId + ", musicTypeId=" + this.musicTypeId + Separators.RPAREN;
    }

    public PersonalRingEntity(long j, String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.name = name;
        this.musicCategoryId = i;
        this.musicTypeId = i2;
        this.cover = "";
        this.singer = "";
        this.filePath = "";
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ PersonalRingEntity(long j, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public final String getName() {
        return this.name;
    }

    public final int getMusicCategoryId() {
        return this.musicCategoryId;
    }

    public final int getMusicTypeId() {
        return this.musicTypeId;
    }

    public final long getFirmwareId() {
        return this.firmwareId;
    }

    public final void setFirmwareId(long j) {
        this.firmwareId = j;
    }

    /* renamed from: isLocalFile, reason: from getter */
    public final boolean getIsLocalFile() {
        return this.isLocalFile;
    }

    public final void setLocalFile(boolean z) {
        this.isLocalFile = z;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getCover() {
        return this.cover;
    }

    public final void setCover(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cover = str;
    }

    public final int getMemberEnable() {
        return this.memberEnable;
    }

    public final void setMemberEnable(int i) {
        this.memberEnable = i;
    }

    public final double getPlayTimes() {
        return this.playTimes;
    }

    public final void setPlayTimes(double d) {
        this.playTimes = d;
    }

    public final String getSinger() {
        return this.singer;
    }

    public final void setSinger(String str) {
        this.singer = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final int getFeeType() {
        return this.feeType;
    }

    public final void setFeeType(int i) {
        this.feeType = i;
    }

    public final double getPrice() {
        return this.price;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public final double getDollar() {
        return this.dollar;
    }

    public final void setDollar(double d) {
        this.dollar = d;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final int getSetStatus() {
        return this.setStatus;
    }

    public final void setSetStatus(int i) {
        this.setStatus = i;
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final void setLayoutType(int i) {
        this.layoutType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getLayoutType() {
        return this.layoutType;
    }
}
