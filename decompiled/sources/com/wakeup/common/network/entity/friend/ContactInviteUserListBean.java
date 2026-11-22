package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactInviteUserListBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001/BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0000H\u0096\u0002J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JU\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010!\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/wakeup/common/network/entity/friend/ContactInviteUserListBean;", "Ljava/io/Serializable;", "", "contactId", "", "avatar", "", "localUserName", "phone", "registerUserId", Constants.BundleKey.NICKNAME, "state", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V", "getContactId", "()J", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getLocalUserName", "getPhone", "getRegisterUserId", "setRegisterUserId", "(J)V", "getNickName", "setNickName", "getState", "()I", "setState", "(I)V", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContactInviteUserListBean implements Serializable, Comparable<ContactInviteUserListBean> {
    public static final int ALREADY_FOLLOWED_STATE = 2;
    public static final int ALREADY_REGISTER_STATE = 1;
    private String avatar;
    private final long contactId;
    private final String localUserName;
    private String nickName;
    private final String phone;
    private long registerUserId;
    private int state;

    public static /* synthetic */ ContactInviteUserListBean copy$default(ContactInviteUserListBean contactInviteUserListBean, long j, String str, String str2, String str3, long j2, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = contactInviteUserListBean.contactId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = contactInviteUserListBean.avatar;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = contactInviteUserListBean.localUserName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = contactInviteUserListBean.phone;
        }
        return contactInviteUserListBean.copy(j3, str5, str6, str3, (i2 & 16) != 0 ? contactInviteUserListBean.registerUserId : j2, (i2 & 32) != 0 ? contactInviteUserListBean.nickName : str4, (i2 & 64) != 0 ? contactInviteUserListBean.state : i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getContactId() {
        return this.contactId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocalUserName() {
        return this.localUserName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRegisterUserId() {
        return this.registerUserId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final ContactInviteUserListBean copy(long contactId, String avatar, String localUserName, String phone, long registerUserId, String nickName, int state) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ContactInviteUserListBean(contactId, avatar, localUserName, phone, registerUserId, nickName, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInviteUserListBean)) {
            return false;
        }
        ContactInviteUserListBean contactInviteUserListBean = (ContactInviteUserListBean) other;
        return this.contactId == contactInviteUserListBean.contactId && Intrinsics.areEqual(this.avatar, contactInviteUserListBean.avatar) && Intrinsics.areEqual(this.localUserName, contactInviteUserListBean.localUserName) && Intrinsics.areEqual(this.phone, contactInviteUserListBean.phone) && this.registerUserId == contactInviteUserListBean.registerUserId && Intrinsics.areEqual(this.nickName, contactInviteUserListBean.nickName) && this.state == contactInviteUserListBean.state;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.contactId) * 31;
        String str = this.avatar;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localUserName;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.phone.hashCode()) * 31) + Long.hashCode(this.registerUserId)) * 31;
        String str3 = this.nickName;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.state);
    }

    public String toString() {
        return "ContactInviteUserListBean(contactId=" + this.contactId + ", avatar=" + this.avatar + ", localUserName=" + this.localUserName + ", phone=" + this.phone + ", registerUserId=" + this.registerUserId + ", nickName=" + this.nickName + ", state=" + this.state + Separators.RPAREN;
    }

    public ContactInviteUserListBean(long j, String str, String str2, String phone, long j2, String str3, int i) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.contactId = j;
        this.avatar = str;
        this.localUserName = str2;
        this.phone = phone;
        this.registerUserId = j2;
        this.nickName = str3;
        this.state = i;
    }

    public final long getContactId() {
        return this.contactId;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final String getLocalUserName() {
        return this.localUserName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final long getRegisterUserId() {
        return this.registerUserId;
    }

    public final void setRegisterUserId(long j) {
        this.registerUserId = j;
    }

    public /* synthetic */ ContactInviteUserListBean(long j, String str, String str2, String str3, long j2, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, str3, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? 0 : i);
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(ContactInviteUserListBean other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.state;
        int i2 = other.state;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
