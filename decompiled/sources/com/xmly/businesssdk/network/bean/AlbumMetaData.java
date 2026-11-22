package com.xmly.businesssdk.network.bean;

import com.anythink.core.common.e.a;
import com.google.gson.annotations.SerializedName;
import com.wakeup.common.Constants;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xmly/businesssdk/network/bean/AlbumMetaData;", "", "sourceType", "", Constants.SHARE_URL_PARAMS_JUMP_SOURCE_ID, "", "payType", "playCount", "intro", "", "(IJIJLjava/lang/String;)V", "getIntro", "()Ljava/lang/String;", "getPayType", "()I", "getPlayCount", "()J", "getSourceId", "getSourceType", "albumType", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AlbumMetaData {

    @SerializedName("intro")
    private final String intro;

    @SerializedName("pay_type")
    private final int payType;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName(a.C0193a.h)
    private final long sourceId;

    @SerializedName("source_type")
    private final int sourceType;

    public AlbumMetaData(int i, long j, int i2, long j2, String str) {
        this.sourceType = i;
        this.sourceId = j;
        this.payType = i2;
        this.playCount = j2;
        this.intro = str;
    }

    public final int albumType() {
        int i = this.payType;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public final String getIntro() {
        return this.intro;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final long getSourceId() {
        return this.sourceId;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("AlbumMetaData(sourceType=").append(this.sourceType).append(", sourceId=").append(this.sourceId).append(", payType=").append(this.payType).append(", playCount=").append(this.playCount).append(", intro="), this.intro, ')');
    }
}
