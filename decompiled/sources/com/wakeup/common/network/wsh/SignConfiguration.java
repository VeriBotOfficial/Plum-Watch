package com.wakeup.common.network.wsh;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import kotlin.Metadata;

/* compiled from: SignInTimeListBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010,\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/wakeup/common/network/wsh/SignConfiguration;", "", "id", "", "name", "", a.C0193a.k, "", "prizeType", "prizeId", "jumpTarget", "jumpType", "point", "description", "languageId", "state", "", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "getDay", "()I", "getPrizeType", "getPrizeId", "getJumpTarget", "setJumpTarget", "(Ljava/lang/String;)V", "getJumpType", "setJumpType", "getPoint", "setPoint", "(I)V", "getDescription", "setDescription", "getLanguageId", "getState", "()Z", "setState", "(Z)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SignConfiguration {
    private final int day;
    private String description;
    private long id;
    private String jumpTarget;
    private String jumpType;
    private final int languageId;
    private final String name;
    private int point;
    private final String prizeId;
    private final String prizeType;
    private boolean state;

    public SignConfiguration(long j, String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, int i3, boolean z) {
        this.id = j;
        this.name = str;
        this.day = i;
        this.prizeType = str2;
        this.prizeId = str3;
        this.jumpTarget = str4;
        this.jumpType = str5;
        this.point = i2;
        this.description = str6;
        this.languageId = i3;
        this.state = z;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getName() {
        return this.name;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getPrizeType() {
        return this.prizeType;
    }

    public final String getPrizeId() {
        return this.prizeId;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }

    public final void setJumpTarget(String str) {
        this.jumpTarget = str;
    }

    public final String getJumpType() {
        return this.jumpType;
    }

    public final void setJumpType(String str) {
        this.jumpType = str;
    }

    public final int getPoint() {
        return this.point;
    }

    public final void setPoint(int i) {
        this.point = i;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final boolean getState() {
        return this.state;
    }

    public final void setState(boolean z) {
        this.state = z;
    }

    public String toString() {
        return "SignConfiguration(id=" + this.id + ", name=" + this.name + ", day=" + this.day + ", prizeType=" + this.prizeType + ", prizeId=" + this.prizeId + ", jumpTarget=" + this.jumpTarget + ", jumpType=" + this.jumpType + ", point=" + this.point + ", description=" + this.description + ", languageId=" + this.languageId + ", state=" + this.state + Separators.RPAREN;
    }
}
