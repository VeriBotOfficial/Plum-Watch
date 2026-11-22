package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.amap.api.maps.model.LatLng;
import com.autonavi.aps.amapapi.config.Const;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FriendHomeBean.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002&'BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u001d\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u001d\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0007HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0002\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendHomeBean;", "Ljava/io/Serializable;", "isDrainage", "", "locationList", "Ljava/util/ArrayList;", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "Lkotlin/collections/ArrayList;", "relativesFriends", "userInfos", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "<init>", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "()Ljava/lang/Integer;", "setDrainage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLocationList", "()Ljava/util/ArrayList;", "setLocationList", "(Ljava/util/ArrayList;)V", "getRelativesFriends", "setRelativesFriends", "getUserInfos", "setUserInfos", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/wakeup/common/network/entity/friend/FriendHomeBean;", "equals", "", "other", "", "hashCode", "toString", "", "FriendLocationBean", "FriendUserInfo", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FriendHomeBean implements Serializable {
    private Integer isDrainage;
    private ArrayList<FriendLocationBean> locationList;
    private Integer relativesFriends;
    private ArrayList<FriendUserInfo> userInfos;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendHomeBean copy$default(FriendHomeBean friendHomeBean, Integer num, ArrayList arrayList, Integer num2, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = friendHomeBean.isDrainage;
        }
        if ((i & 2) != 0) {
            arrayList = friendHomeBean.locationList;
        }
        if ((i & 4) != 0) {
            num2 = friendHomeBean.relativesFriends;
        }
        if ((i & 8) != 0) {
            arrayList2 = friendHomeBean.userInfos;
        }
        return friendHomeBean.copy(num, arrayList, num2, arrayList2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getIsDrainage() {
        return this.isDrainage;
    }

    public final ArrayList<FriendLocationBean> component2() {
        return this.locationList;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRelativesFriends() {
        return this.relativesFriends;
    }

    public final ArrayList<FriendUserInfo> component4() {
        return this.userInfos;
    }

    public final FriendHomeBean copy(Integer isDrainage, ArrayList<FriendLocationBean> locationList, Integer relativesFriends, ArrayList<FriendUserInfo> userInfos) {
        return new FriendHomeBean(isDrainage, locationList, relativesFriends, userInfos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendHomeBean)) {
            return false;
        }
        FriendHomeBean friendHomeBean = (FriendHomeBean) other;
        return Intrinsics.areEqual(this.isDrainage, friendHomeBean.isDrainage) && Intrinsics.areEqual(this.locationList, friendHomeBean.locationList) && Intrinsics.areEqual(this.relativesFriends, friendHomeBean.relativesFriends) && Intrinsics.areEqual(this.userInfos, friendHomeBean.userInfos);
    }

    public int hashCode() {
        Integer num = this.isDrainage;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ArrayList<FriendLocationBean> arrayList = this.locationList;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num2 = this.relativesFriends;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArrayList<FriendUserInfo> arrayList2 = this.userInfos;
        return hashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public String toString() {
        return "FriendHomeBean(isDrainage=" + this.isDrainage + ", locationList=" + this.locationList + ", relativesFriends=" + this.relativesFriends + ", userInfos=" + this.userInfos + Separators.RPAREN;
    }

    public FriendHomeBean(Integer num, ArrayList<FriendLocationBean> arrayList, Integer num2, ArrayList<FriendUserInfo> arrayList2) {
        this.isDrainage = num;
        this.locationList = arrayList;
        this.relativesFriends = num2;
        this.userInfos = arrayList2;
    }

    public final Integer isDrainage() {
        return this.isDrainage;
    }

    public final void setDrainage(Integer num) {
        this.isDrainage = num;
    }

    public final ArrayList<FriendLocationBean> getLocationList() {
        return this.locationList;
    }

    public final void setLocationList(ArrayList<FriendLocationBean> arrayList) {
        this.locationList = arrayList;
    }

    public final Integer getRelativesFriends() {
        return this.relativesFriends;
    }

    public final void setRelativesFriends(Integer num) {
        this.relativesFriends = num;
    }

    public final ArrayList<FriendUserInfo> getUserInfos() {
        return this.userInfos;
    }

    public final void setUserInfos(ArrayList<FriendUserInfo> arrayList) {
        this.userInfos = arrayList;
    }

    /* compiled from: FriendHomeBean.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\r\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010%J\r\u0010&\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010%J\b\u0010'\u001a\u0004\u0018\u00010(J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006:"}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "Ljava/io/Serializable;", Const.JSON_KEY_ADDRESS, "", "locationData", "locationSmallPic", "locationTimestamp", "", "userAvatar", "userId", "userName", "locationBitmapString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getLocationData", "setLocationData", "getLocationSmallPic", "setLocationSmallPic", "getLocationTimestamp", "()Ljava/lang/Long;", "setLocationTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUserAvatar", "setUserAvatar", "getUserId", "setUserId", "getUserName", "setUserName", "getLocationBitmapString", "setLocationBitmapString", "getLat", "", "()Ljava/lang/Double;", "getLon", "getLatLng", "Lcom/amap/api/maps/model/LatLng;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FriendLocationBean implements Serializable {
        private String address;
        private String locationBitmapString;
        private String locationData;
        private String locationSmallPic;
        private Long locationTimestamp;
        private String userAvatar;
        private Long userId;
        private String userName;

        public static /* synthetic */ FriendLocationBean copy$default(FriendLocationBean friendLocationBean, String str, String str2, String str3, Long l, String str4, Long l2, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = friendLocationBean.address;
            }
            if ((i & 2) != 0) {
                str2 = friendLocationBean.locationData;
            }
            if ((i & 4) != 0) {
                str3 = friendLocationBean.locationSmallPic;
            }
            if ((i & 8) != 0) {
                l = friendLocationBean.locationTimestamp;
            }
            if ((i & 16) != 0) {
                str4 = friendLocationBean.userAvatar;
            }
            if ((i & 32) != 0) {
                l2 = friendLocationBean.userId;
            }
            if ((i & 64) != 0) {
                str5 = friendLocationBean.userName;
            }
            if ((i & 128) != 0) {
                str6 = friendLocationBean.locationBitmapString;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            Long l3 = l2;
            return friendLocationBean.copy(str, str2, str3, l, str9, l3, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocationData() {
            return this.locationData;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocationSmallPic() {
            return this.locationSmallPic;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getLocationTimestamp() {
            return this.locationTimestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUserAvatar() {
            return this.userAvatar;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getUserId() {
            return this.userId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getLocationBitmapString() {
            return this.locationBitmapString;
        }

        public final FriendLocationBean copy(String address, String locationData, String locationSmallPic, Long locationTimestamp, String userAvatar, Long userId, String userName, String locationBitmapString) {
            return new FriendLocationBean(address, locationData, locationSmallPic, locationTimestamp, userAvatar, userId, userName, locationBitmapString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FriendLocationBean)) {
                return false;
            }
            FriendLocationBean friendLocationBean = (FriendLocationBean) other;
            return Intrinsics.areEqual(this.address, friendLocationBean.address) && Intrinsics.areEqual(this.locationData, friendLocationBean.locationData) && Intrinsics.areEqual(this.locationSmallPic, friendLocationBean.locationSmallPic) && Intrinsics.areEqual(this.locationTimestamp, friendLocationBean.locationTimestamp) && Intrinsics.areEqual(this.userAvatar, friendLocationBean.userAvatar) && Intrinsics.areEqual(this.userId, friendLocationBean.userId) && Intrinsics.areEqual(this.userName, friendLocationBean.userName) && Intrinsics.areEqual(this.locationBitmapString, friendLocationBean.locationBitmapString);
        }

        public int hashCode() {
            String str = this.address;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.locationData;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locationSmallPic;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.locationTimestamp;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str4 = this.userAvatar;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l2 = this.userId;
            int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str5 = this.userName;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.locationBitmapString;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "FriendLocationBean(address=" + this.address + ", locationData=" + this.locationData + ", locationSmallPic=" + this.locationSmallPic + ", locationTimestamp=" + this.locationTimestamp + ", userAvatar=" + this.userAvatar + ", userId=" + this.userId + ", userName=" + this.userName + ", locationBitmapString=" + this.locationBitmapString + Separators.RPAREN;
        }

        public FriendLocationBean(String str, String str2, String str3, Long l, String str4, Long l2, String str5, String str6) {
            this.address = str;
            this.locationData = str2;
            this.locationSmallPic = str3;
            this.locationTimestamp = l;
            this.userAvatar = str4;
            this.userId = l2;
            this.userName = str5;
            this.locationBitmapString = str6;
        }

        public final String getAddress() {
            return this.address;
        }

        public final void setAddress(String str) {
            this.address = str;
        }

        public final String getLocationData() {
            return this.locationData;
        }

        public final void setLocationData(String str) {
            this.locationData = str;
        }

        public final String getLocationSmallPic() {
            return this.locationSmallPic;
        }

        public final void setLocationSmallPic(String str) {
            this.locationSmallPic = str;
        }

        public final Long getLocationTimestamp() {
            return this.locationTimestamp;
        }

        public final void setLocationTimestamp(Long l) {
            this.locationTimestamp = l;
        }

        public final String getUserAvatar() {
            return this.userAvatar;
        }

        public final void setUserAvatar(String str) {
            this.userAvatar = str;
        }

        public final Long getUserId() {
            return this.userId;
        }

        public final void setUserId(Long l) {
            this.userId = l;
        }

        public final String getUserName() {
            return this.userName;
        }

        public final void setUserName(String str) {
            this.userName = str;
        }

        public final String getLocationBitmapString() {
            return this.locationBitmapString;
        }

        public final void setLocationBitmapString(String str) {
            this.locationBitmapString = str;
        }

        public final Double getLat() {
            String str = this.locationData;
            if (str != null) {
                return Double.valueOf(Double.parseDouble((String) StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(0)));
            }
            return null;
        }

        public final Double getLon() {
            String str = this.locationData;
            if (str != null) {
                return Double.valueOf(Double.parseDouble((String) StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(1)));
            }
            return null;
        }

        public final LatLng getLatLng() {
            if (getLat() == null || getLon() == null) {
                return null;
            }
            Double lat = getLat();
            Intrinsics.checkNotNull(lat);
            double doubleValue = lat.doubleValue();
            Double lon = getLon();
            Intrinsics.checkNotNull(lon);
            return new LatLng(doubleValue, lon.doubleValue());
        }
    }

    /* compiled from: FriendHomeBean.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006."}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "Ljava/io/Serializable;", "addTimestamp", "", "dataFunctionIds", "", "userAvatar", "userId", "userName", "locationTimestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;)V", "getAddTimestamp", "()Ljava/lang/Long;", "setAddTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDataFunctionIds", "()Ljava/lang/String;", "setDataFunctionIds", "(Ljava/lang/String;)V", "getUserAvatar", "setUserAvatar", "getUserId", "()J", "setUserId", "(J)V", "getUserName", "setUserName", "getLocationTimestamp", "setLocationTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FriendUserInfo implements Serializable {
        private Long addTimestamp;
        private String dataFunctionIds;
        private Long locationTimestamp;
        private String userAvatar;
        private long userId;
        private String userName;

        public static /* synthetic */ FriendUserInfo copy$default(FriendUserInfo friendUserInfo, Long l, String str, String str2, long j, String str3, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = friendUserInfo.addTimestamp;
            }
            if ((i & 2) != 0) {
                str = friendUserInfo.dataFunctionIds;
            }
            if ((i & 4) != 0) {
                str2 = friendUserInfo.userAvatar;
            }
            if ((i & 8) != 0) {
                j = friendUserInfo.userId;
            }
            if ((i & 16) != 0) {
                str3 = friendUserInfo.userName;
            }
            if ((i & 32) != 0) {
                l2 = friendUserInfo.locationTimestamp;
            }
            long j2 = j;
            String str4 = str2;
            return friendUserInfo.copy(l, str, str4, j2, str3, l2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getAddTimestamp() {
            return this.addTimestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDataFunctionIds() {
            return this.dataFunctionIds;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserAvatar() {
            return this.userAvatar;
        }

        /* renamed from: component4, reason: from getter */
        public final long getUserId() {
            return this.userId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getLocationTimestamp() {
            return this.locationTimestamp;
        }

        public final FriendUserInfo copy(Long addTimestamp, String dataFunctionIds, String userAvatar, long userId, String userName, Long locationTimestamp) {
            return new FriendUserInfo(addTimestamp, dataFunctionIds, userAvatar, userId, userName, locationTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FriendUserInfo)) {
                return false;
            }
            FriendUserInfo friendUserInfo = (FriendUserInfo) other;
            return Intrinsics.areEqual(this.addTimestamp, friendUserInfo.addTimestamp) && Intrinsics.areEqual(this.dataFunctionIds, friendUserInfo.dataFunctionIds) && Intrinsics.areEqual(this.userAvatar, friendUserInfo.userAvatar) && this.userId == friendUserInfo.userId && Intrinsics.areEqual(this.userName, friendUserInfo.userName) && Intrinsics.areEqual(this.locationTimestamp, friendUserInfo.locationTimestamp);
        }

        public int hashCode() {
            Long l = this.addTimestamp;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.dataFunctionIds;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.userAvatar;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.userId)) * 31;
            String str3 = this.userName;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l2 = this.locationTimestamp;
            return hashCode4 + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "FriendUserInfo(addTimestamp=" + this.addTimestamp + ", dataFunctionIds=" + this.dataFunctionIds + ", userAvatar=" + this.userAvatar + ", userId=" + this.userId + ", userName=" + this.userName + ", locationTimestamp=" + this.locationTimestamp + Separators.RPAREN;
        }

        public FriendUserInfo(Long l, String str, String str2, long j, String str3, Long l2) {
            this.addTimestamp = l;
            this.dataFunctionIds = str;
            this.userAvatar = str2;
            this.userId = j;
            this.userName = str3;
            this.locationTimestamp = l2;
        }

        public final Long getAddTimestamp() {
            return this.addTimestamp;
        }

        public final void setAddTimestamp(Long l) {
            this.addTimestamp = l;
        }

        public /* synthetic */ FriendUserInfo(Long l, String str, String str2, long j, String str3, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(l, (i & 2) != 0 ? "" : str, str2, j, str3, (i & 32) != 0 ? 0L : l2);
        }

        public final String getDataFunctionIds() {
            return this.dataFunctionIds;
        }

        public final void setDataFunctionIds(String str) {
            this.dataFunctionIds = str;
        }

        public final String getUserAvatar() {
            return this.userAvatar;
        }

        public final void setUserAvatar(String str) {
            this.userAvatar = str;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final String getUserName() {
            return this.userName;
        }

        public final void setUserName(String str) {
            this.userName = str;
        }

        public final Long getLocationTimestamp() {
            return this.locationTimestamp;
        }

        public final void setLocationTimestamp(Long l) {
            this.locationTimestamp = l;
        }
    }
}
