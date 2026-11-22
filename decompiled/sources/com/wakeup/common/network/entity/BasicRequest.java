package com.wakeup.common.network.entity;

import android.gov.nist.core.Separators;
import androidx.autofill.HintConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.wakeup.common.Constants;
import com.wakeup.feature.health.dashboard.HdContent;
import com.wakeup.feature.health.dashboard.HdScenes;
import com.wakeup.feature.user.constant.UserConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b8\bÆ\u0002\u0018\u00002\u00020\u0001:5\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345678B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u00069"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest;", "", "<init>", "()V", "UserOrder", "OverseasUserOrder", "DialOrder", "UserOrderDetail", "UserCert", "SyncOrder", "SaveStep", "NewUpdateFirmware", "ActivateLicense", "Login", "SmsLogin", "SmsCheckRegister", "PlatformLogin", "MembersUserInfo", "MembersUserInfoFree", "MembersUserInfoOverseas", "LoginWithOneKey", "LoginWithOneKeyCache", "FeedBack", "Verification", "WeatherAllInfo", "Register", "UpdatePwd", "Bind", "Logout", "BindAccount", "Repassword", "HealthCheckTime", "Questionnaire", "IntegrationRecord", "HealthDataUpload", "AddBindRecord", "PlatformBindPhone", "ForceBinding", "ExAssetsCode", "ModifyPhoneRequest", "setPasswordRequest", "WeikePay", "SyncAppPayOrder", "LikeBean", "ErrorPost", "UserAdd", "UpdateSiche", "MenstrualQuery", "RecentlyRealtime", "UserComponent", "HomePageParam", "HomePageRequestParam", "ScanCodeLongin", "DeviceFunctionComponent", "LicenseRequestBody", "TimbreListRequestBody", "SetTimbreRequestBody", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BasicRequest {
    public static final BasicRequest INSTANCE = new BasicRequest();

    private BasicRequest() {
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006'"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UserOrder;", "", "orderType", "", "locale", "", "appTime", "", "curPage", "pageSize", "<init>", "(ILjava/lang/String;JII)V", "getOrderType", "()I", "setOrderType", "(I)V", "getLocale", "()Ljava/lang/String;", "setLocale", "(Ljava/lang/String;)V", "getAppTime", "()J", "setAppTime", "(J)V", "getCurPage", "setCurPage", "getPageSize", "setPageSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserOrder {
        private long appTime;
        private int curPage;
        private String locale;
        private int orderType;
        private int pageSize;

        public static /* synthetic */ UserOrder copy$default(UserOrder userOrder, int i, String str, long j, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = userOrder.orderType;
            }
            if ((i4 & 2) != 0) {
                str = userOrder.locale;
            }
            if ((i4 & 4) != 0) {
                j = userOrder.appTime;
            }
            if ((i4 & 8) != 0) {
                i2 = userOrder.curPage;
            }
            if ((i4 & 16) != 0) {
                i3 = userOrder.pageSize;
            }
            long j2 = j;
            return userOrder.copy(i, str, j2, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOrderType() {
            return this.orderType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCurPage() {
            return this.curPage;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        public final UserOrder copy(int orderType, String locale, long appTime, int curPage, int pageSize) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new UserOrder(orderType, locale, appTime, curPage, pageSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserOrder)) {
                return false;
            }
            UserOrder userOrder = (UserOrder) other;
            return this.orderType == userOrder.orderType && Intrinsics.areEqual(this.locale, userOrder.locale) && this.appTime == userOrder.appTime && this.curPage == userOrder.curPage && this.pageSize == userOrder.pageSize;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.orderType) * 31) + this.locale.hashCode()) * 31) + Long.hashCode(this.appTime)) * 31) + Integer.hashCode(this.curPage)) * 31) + Integer.hashCode(this.pageSize);
        }

        public String toString() {
            return "UserOrder(orderType=" + this.orderType + ", locale=" + this.locale + ", appTime=" + this.appTime + ", curPage=" + this.curPage + ", pageSize=" + this.pageSize + Separators.RPAREN;
        }

        public UserOrder(int i, String locale, long j, int i2, int i3) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.orderType = i;
            this.locale = locale;
            this.appTime = j;
            this.curPage = i2;
            this.pageSize = i3;
        }

        public final int getOrderType() {
            return this.orderType;
        }

        public final void setOrderType(int i) {
            this.orderType = i;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getCurPage() {
            return this.curPage;
        }

        public final void setCurPage(int i) {
            this.curPage = i;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final void setPageSize(int i) {
            this.pageSize = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$OverseasUserOrder;", "", "pageNum", "", "pageSize", "<init>", "(II)V", "getPageNum", "()I", "setPageNum", "(I)V", "getPageSize", "setPageSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OverseasUserOrder {
        private int pageNum;
        private int pageSize;

        public static /* synthetic */ OverseasUserOrder copy$default(OverseasUserOrder overseasUserOrder, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = overseasUserOrder.pageNum;
            }
            if ((i3 & 2) != 0) {
                i2 = overseasUserOrder.pageSize;
            }
            return overseasUserOrder.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        public final OverseasUserOrder copy(int pageNum, int pageSize) {
            return new OverseasUserOrder(pageNum, pageSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverseasUserOrder)) {
                return false;
            }
            OverseasUserOrder overseasUserOrder = (OverseasUserOrder) other;
            return this.pageNum == overseasUserOrder.pageNum && this.pageSize == overseasUserOrder.pageSize;
        }

        public int hashCode() {
            return (Integer.hashCode(this.pageNum) * 31) + Integer.hashCode(this.pageSize);
        }

        public String toString() {
            return "OverseasUserOrder(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + Separators.RPAREN;
        }

        public OverseasUserOrder(int i, int i2) {
            this.pageNum = i;
            this.pageSize = i2;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final void setPageNum(int i) {
            this.pageNum = i;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final void setPageSize(int i) {
            this.pageSize = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$DialOrder;", "", "orderType", "", "pageNum", "pageSize", "<init>", "(III)V", "getOrderType", "()I", "setOrderType", "(I)V", "getPageNum", "setPageNum", "getPageSize", "setPageSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DialOrder {
        private int orderType;
        private int pageNum;
        private int pageSize;

        public static /* synthetic */ DialOrder copy$default(DialOrder dialOrder, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = dialOrder.orderType;
            }
            if ((i4 & 2) != 0) {
                i2 = dialOrder.pageNum;
            }
            if ((i4 & 4) != 0) {
                i3 = dialOrder.pageSize;
            }
            return dialOrder.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOrderType() {
            return this.orderType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        public final DialOrder copy(int orderType, int pageNum, int pageSize) {
            return new DialOrder(orderType, pageNum, pageSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialOrder)) {
                return false;
            }
            DialOrder dialOrder = (DialOrder) other;
            return this.orderType == dialOrder.orderType && this.pageNum == dialOrder.pageNum && this.pageSize == dialOrder.pageSize;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.orderType) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize);
        }

        public String toString() {
            return "DialOrder(orderType=" + this.orderType + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + Separators.RPAREN;
        }

        public DialOrder(int i, int i2, int i3) {
            this.orderType = i;
            this.pageNum = i2;
            this.pageSize = i3;
        }

        public final int getOrderType() {
            return this.orderType;
        }

        public final void setOrderType(int i) {
            this.orderType = i;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final void setPageNum(int i) {
            this.pageNum = i;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final void setPageSize(int i) {
            this.pageSize = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UserOrderDetail;", "", "orderType", "", "locale", "", "appTime", "", "orderId", "<init>", "(ILjava/lang/String;JJ)V", "getOrderType", "()I", "setOrderType", "(I)V", "getLocale", "()Ljava/lang/String;", "setLocale", "(Ljava/lang/String;)V", "getAppTime", "()J", "setAppTime", "(J)V", "getOrderId", "setOrderId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserOrderDetail {
        private long appTime;
        private String locale;
        private long orderId;
        private int orderType;

        public static /* synthetic */ UserOrderDetail copy$default(UserOrderDetail userOrderDetail, int i, String str, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = userOrderDetail.orderType;
            }
            if ((i2 & 2) != 0) {
                str = userOrderDetail.locale;
            }
            if ((i2 & 4) != 0) {
                j = userOrderDetail.appTime;
            }
            if ((i2 & 8) != 0) {
                j2 = userOrderDetail.orderId;
            }
            long j3 = j2;
            return userOrderDetail.copy(i, str, j, j3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOrderType() {
            return this.orderType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component4, reason: from getter */
        public final long getOrderId() {
            return this.orderId;
        }

        public final UserOrderDetail copy(int orderType, String locale, long appTime, long orderId) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new UserOrderDetail(orderType, locale, appTime, orderId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserOrderDetail)) {
                return false;
            }
            UserOrderDetail userOrderDetail = (UserOrderDetail) other;
            return this.orderType == userOrderDetail.orderType && Intrinsics.areEqual(this.locale, userOrderDetail.locale) && this.appTime == userOrderDetail.appTime && this.orderId == userOrderDetail.orderId;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.orderType) * 31) + this.locale.hashCode()) * 31) + Long.hashCode(this.appTime)) * 31) + Long.hashCode(this.orderId);
        }

        public String toString() {
            return "UserOrderDetail(orderType=" + this.orderType + ", locale=" + this.locale + ", appTime=" + this.appTime + ", orderId=" + this.orderId + Separators.RPAREN;
        }

        public UserOrderDetail(int i, String locale, long j, long j2) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.orderType = i;
            this.locale = locale;
            this.appTime = j;
            this.orderId = j2;
        }

        public final int getOrderType() {
            return this.orderType;
        }

        public final void setOrderType(int i) {
            this.orderType = i;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getOrderId() {
            return this.orderId;
        }

        public final void setOrderId(long j) {
            this.orderId = j;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UserCert;", "", "verifyType", "", "scene", "phoneNo", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVerifyType", "()Ljava/lang/String;", "setVerifyType", "(Ljava/lang/String;)V", "getScene", "setScene", "getPhoneNo", "setPhoneNo", "getEmail", "setEmail", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserCert {
        private String email;
        private String phoneNo;
        private String scene;
        private String verifyType;

        public static /* synthetic */ UserCert copy$default(UserCert userCert, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userCert.verifyType;
            }
            if ((i & 2) != 0) {
                str2 = userCert.scene;
            }
            if ((i & 4) != 0) {
                str3 = userCert.phoneNo;
            }
            if ((i & 8) != 0) {
                str4 = userCert.email;
            }
            return userCert.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerifyType() {
            return this.verifyType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScene() {
            return this.scene;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final UserCert copy(String verifyType, String scene, String phoneNo, String email) {
            Intrinsics.checkNotNullParameter(verifyType, "verifyType");
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
            return new UserCert(verifyType, scene, phoneNo, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserCert)) {
                return false;
            }
            UserCert userCert = (UserCert) other;
            return Intrinsics.areEqual(this.verifyType, userCert.verifyType) && Intrinsics.areEqual(this.scene, userCert.scene) && Intrinsics.areEqual(this.phoneNo, userCert.phoneNo) && Intrinsics.areEqual(this.email, userCert.email);
        }

        public int hashCode() {
            int hashCode = ((((this.verifyType.hashCode() * 31) + this.scene.hashCode()) * 31) + this.phoneNo.hashCode()) * 31;
            String str = this.email;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "UserCert(verifyType=" + this.verifyType + ", scene=" + this.scene + ", phoneNo=" + this.phoneNo + ", email=" + this.email + Separators.RPAREN;
        }

        public UserCert(String verifyType, String scene, String phoneNo, String str) {
            Intrinsics.checkNotNullParameter(verifyType, "verifyType");
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
            this.verifyType = verifyType;
            this.scene = scene;
            this.phoneNo = phoneNo;
            this.email = str;
        }

        public final String getVerifyType() {
            return this.verifyType;
        }

        public final void setVerifyType(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.verifyType = str;
        }

        public final String getScene() {
            return this.scene;
        }

        public final void setScene(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.scene = str;
        }

        public final String getPhoneNo() {
            return this.phoneNo;
        }

        public final void setPhoneNo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.phoneNo = str;
        }

        public final String getEmail() {
            return this.email;
        }

        public final void setEmail(String str) {
            this.email = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SyncOrder;", "", "orderNo", "", "payResult", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "getPayResult", "setPayResult", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SyncOrder {
        private String orderNo;
        private String payResult;

        public static /* synthetic */ SyncOrder copy$default(SyncOrder syncOrder, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncOrder.orderNo;
            }
            if ((i & 2) != 0) {
                str2 = syncOrder.payResult;
            }
            return syncOrder.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPayResult() {
            return this.payResult;
        }

        public final SyncOrder copy(String orderNo, String payResult) {
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            Intrinsics.checkNotNullParameter(payResult, "payResult");
            return new SyncOrder(orderNo, payResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncOrder)) {
                return false;
            }
            SyncOrder syncOrder = (SyncOrder) other;
            return Intrinsics.areEqual(this.orderNo, syncOrder.orderNo) && Intrinsics.areEqual(this.payResult, syncOrder.payResult);
        }

        public int hashCode() {
            return (this.orderNo.hashCode() * 31) + this.payResult.hashCode();
        }

        public String toString() {
            return "SyncOrder(orderNo=" + this.orderNo + ", payResult=" + this.payResult + Separators.RPAREN;
        }

        public SyncOrder(String orderNo, String payResult) {
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            Intrinsics.checkNotNullParameter(payResult, "payResult");
            this.orderNo = orderNo;
            this.payResult = payResult;
        }

        public final String getOrderNo() {
            return this.orderNo;
        }

        public final void setOrderNo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.orderNo = str;
        }

        public final String getPayResult() {
            return this.payResult;
        }

        public final void setPayResult(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.payResult = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SaveStep;", "", "userId", "", "stepCount", "dayNo", "<init>", "(III)V", "getUserId", "()I", "setUserId", "(I)V", "getStepCount", "setStepCount", "getDayNo", "setDayNo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveStep {
        private int dayNo;
        private int stepCount;
        private int userId;

        public static /* synthetic */ SaveStep copy$default(SaveStep saveStep, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = saveStep.userId;
            }
            if ((i4 & 2) != 0) {
                i2 = saveStep.stepCount;
            }
            if ((i4 & 4) != 0) {
                i3 = saveStep.dayNo;
            }
            return saveStep.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStepCount() {
            return this.stepCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDayNo() {
            return this.dayNo;
        }

        public final SaveStep copy(int userId, int stepCount, int dayNo) {
            return new SaveStep(userId, stepCount, dayNo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveStep)) {
                return false;
            }
            SaveStep saveStep = (SaveStep) other;
            return this.userId == saveStep.userId && this.stepCount == saveStep.stepCount && this.dayNo == saveStep.dayNo;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.stepCount)) * 31) + Integer.hashCode(this.dayNo);
        }

        public String toString() {
            return "SaveStep(userId=" + this.userId + ", stepCount=" + this.stepCount + ", dayNo=" + this.dayNo + Separators.RPAREN;
        }

        public SaveStep(int i, int i2, int i3) {
            this.userId = i;
            this.stepCount = i2;
            this.dayNo = i3;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final void setUserId(int i) {
            this.userId = i;
        }

        public final int getStepCount() {
            return this.stepCount;
        }

        public final void setStepCount(int i) {
            this.stepCount = i;
        }

        public final int getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(int i) {
            this.dayNo = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$NewUpdateFirmware;", "", "equipmentCode", "", "equipmentVersion", "projectType", "code", "mac", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEquipmentCode", "()Ljava/lang/String;", "setEquipmentCode", "(Ljava/lang/String;)V", "getEquipmentVersion", "setEquipmentVersion", "getProjectType", "setProjectType", "getCode", "setCode", "getMac", "setMac", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewUpdateFirmware {
        private String code;
        private String equipmentCode;
        private String equipmentVersion;
        private String mac;
        private String projectType;

        public NewUpdateFirmware() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ NewUpdateFirmware copy$default(NewUpdateFirmware newUpdateFirmware, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newUpdateFirmware.equipmentCode;
            }
            if ((i & 2) != 0) {
                str2 = newUpdateFirmware.equipmentVersion;
            }
            if ((i & 4) != 0) {
                str3 = newUpdateFirmware.projectType;
            }
            if ((i & 8) != 0) {
                str4 = newUpdateFirmware.code;
            }
            if ((i & 16) != 0) {
                str5 = newUpdateFirmware.mac;
            }
            String str6 = str5;
            String str7 = str3;
            return newUpdateFirmware.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEquipmentCode() {
            return this.equipmentCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEquipmentVersion() {
            return this.equipmentVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProjectType() {
            return this.projectType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        public final NewUpdateFirmware copy(String equipmentCode, String equipmentVersion, String projectType, String code, String mac) {
            return new NewUpdateFirmware(equipmentCode, equipmentVersion, projectType, code, mac);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewUpdateFirmware)) {
                return false;
            }
            NewUpdateFirmware newUpdateFirmware = (NewUpdateFirmware) other;
            return Intrinsics.areEqual(this.equipmentCode, newUpdateFirmware.equipmentCode) && Intrinsics.areEqual(this.equipmentVersion, newUpdateFirmware.equipmentVersion) && Intrinsics.areEqual(this.projectType, newUpdateFirmware.projectType) && Intrinsics.areEqual(this.code, newUpdateFirmware.code) && Intrinsics.areEqual(this.mac, newUpdateFirmware.mac);
        }

        public int hashCode() {
            String str = this.equipmentCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.equipmentVersion;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.projectType;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.code;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mac;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "NewUpdateFirmware(equipmentCode=" + this.equipmentCode + ", equipmentVersion=" + this.equipmentVersion + ", projectType=" + this.projectType + ", code=" + this.code + ", mac=" + this.mac + Separators.RPAREN;
        }

        public NewUpdateFirmware(String str, String str2, String str3, String str4, String str5) {
            this.equipmentCode = str;
            this.equipmentVersion = str2;
            this.projectType = str3;
            this.code = str4;
            this.mac = str5;
        }

        public /* synthetic */ NewUpdateFirmware(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public final String getEquipmentCode() {
            return this.equipmentCode;
        }

        public final void setEquipmentCode(String str) {
            this.equipmentCode = str;
        }

        public final String getEquipmentVersion() {
            return this.equipmentVersion;
        }

        public final void setEquipmentVersion(String str) {
            this.equipmentVersion = str;
        }

        public final String getProjectType() {
            return this.projectType;
        }

        public final void setProjectType(String str) {
            this.projectType = str;
        }

        public final String getCode() {
            return this.code;
        }

        public final void setCode(String str) {
            this.code = str;
        }

        public final String getMac() {
            return this.mac;
        }

        public final void setMac(String str) {
            this.mac = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ActivateLicense;", "", "licenseCode", "", "bluetoothName", "mac", "activateCityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLicenseCode", "()Ljava/lang/String;", "setLicenseCode", "(Ljava/lang/String;)V", "getBluetoothName", "setBluetoothName", "getMac", "setMac", "getActivateCityName", "setActivateCityName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivateLicense {
        private String activateCityName;
        private String bluetoothName;
        private String licenseCode;
        private String mac;

        public static /* synthetic */ ActivateLicense copy$default(ActivateLicense activateLicense, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activateLicense.licenseCode;
            }
            if ((i & 2) != 0) {
                str2 = activateLicense.bluetoothName;
            }
            if ((i & 4) != 0) {
                str3 = activateLicense.mac;
            }
            if ((i & 8) != 0) {
                str4 = activateLicense.activateCityName;
            }
            return activateLicense.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLicenseCode() {
            return this.licenseCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        /* renamed from: component4, reason: from getter */
        public final String getActivateCityName() {
            return this.activateCityName;
        }

        public final ActivateLicense copy(String licenseCode, String bluetoothName, String mac, String activateCityName) {
            Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
            return new ActivateLicense(licenseCode, bluetoothName, mac, activateCityName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivateLicense)) {
                return false;
            }
            ActivateLicense activateLicense = (ActivateLicense) other;
            return Intrinsics.areEqual(this.licenseCode, activateLicense.licenseCode) && Intrinsics.areEqual(this.bluetoothName, activateLicense.bluetoothName) && Intrinsics.areEqual(this.mac, activateLicense.mac) && Intrinsics.areEqual(this.activateCityName, activateLicense.activateCityName);
        }

        public int hashCode() {
            int hashCode = this.licenseCode.hashCode() * 31;
            String str = this.bluetoothName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mac;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.activateCityName;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ActivateLicense(licenseCode=" + this.licenseCode + ", bluetoothName=" + this.bluetoothName + ", mac=" + this.mac + ", activateCityName=" + this.activateCityName + Separators.RPAREN;
        }

        public ActivateLicense(String licenseCode, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
            this.licenseCode = licenseCode;
            this.bluetoothName = str;
            this.mac = str2;
            this.activateCityName = str3;
        }

        public /* synthetic */ ActivateLicense(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }

        public final String getLicenseCode() {
            return this.licenseCode;
        }

        public final void setLicenseCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.licenseCode = str;
        }

        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        public final void setBluetoothName(String str) {
            this.bluetoothName = str;
        }

        public final String getMac() {
            return this.mac;
        }

        public final void setMac(String str) {
            this.mac = str;
        }

        public final String getActivateCityName() {
            return this.activateCityName;
        }

        public final void setActivateCityName(String str) {
            this.activateCityName = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Login;", "", Constants.BundleKey.ACCOUNT, "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "setAccount", "(Ljava/lang/String;)V", "getPassword", "setPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Login {
        private String account;
        private String password;

        public static /* synthetic */ Login copy$default(Login login, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = login.account;
            }
            if ((i & 2) != 0) {
                str2 = login.password;
            }
            return login.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final Login copy(String account, String password) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(password, "password");
            return new Login(account, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Login)) {
                return false;
            }
            Login login = (Login) other;
            return Intrinsics.areEqual(this.account, login.account) && Intrinsics.areEqual(this.password, login.password);
        }

        public int hashCode() {
            return (this.account.hashCode() * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Login(account=" + this.account + ", password=" + this.password + Separators.RPAREN;
        }

        public Login(String account, String password) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(password, "password");
            this.account = account;
            this.password = password;
        }

        public final String getAccount() {
            return this.account;
        }

        public final void setAccount(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.account = str;
        }

        public final String getPassword() {
            return this.password;
        }

        public final void setPassword(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.password = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SmsLogin;", "", Constants.BundleKey.ACCOUNT, "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "setAccount", "(Ljava/lang/String;)V", "getCode", "setCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmsLogin {
        private String account;
        private String code;

        public static /* synthetic */ SmsLogin copy$default(SmsLogin smsLogin, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = smsLogin.account;
            }
            if ((i & 2) != 0) {
                str2 = smsLogin.code;
            }
            return smsLogin.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final SmsLogin copy(String account, String code) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            return new SmsLogin(account, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmsLogin)) {
                return false;
            }
            SmsLogin smsLogin = (SmsLogin) other;
            return Intrinsics.areEqual(this.account, smsLogin.account) && Intrinsics.areEqual(this.code, smsLogin.code);
        }

        public int hashCode() {
            return (this.account.hashCode() * 31) + this.code.hashCode();
        }

        public String toString() {
            return "SmsLogin(account=" + this.account + ", code=" + this.code + Separators.RPAREN;
        }

        public SmsLogin(String account, String code) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            this.account = account;
            this.code = code;
        }

        public final String getAccount() {
            return this.account;
        }

        public final void setAccount(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.account = str;
        }

        public final String getCode() {
            return this.code;
        }

        public final void setCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.code = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SmsCheckRegister;", "", Constants.BundleKey.ACCOUNT, "", "<init>", "(Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "setAccount", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmsCheckRegister {
        private String account;

        public static /* synthetic */ SmsCheckRegister copy$default(SmsCheckRegister smsCheckRegister, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = smsCheckRegister.account;
            }
            return smsCheckRegister.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        public final SmsCheckRegister copy(String account) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new SmsCheckRegister(account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SmsCheckRegister) && Intrinsics.areEqual(this.account, ((SmsCheckRegister) other).account);
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "SmsCheckRegister(account=" + this.account + Separators.RPAREN;
        }

        public SmsCheckRegister(String account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final String getAccount() {
            return this.account;
        }

        public final void setAccount(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.account = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$PlatformLogin;", "", "avatar", "", "nickname", "openId", "platform", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getNickname", "setNickname", "getOpenId", "setOpenId", "getPlatform", "()I", "setPlatform", "(I)V", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlatformLogin {
        private String avatar;
        private String nickname;
        private String openId;
        private int platform;
        private String timestamp;

        public static /* synthetic */ PlatformLogin copy$default(PlatformLogin platformLogin, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = platformLogin.avatar;
            }
            if ((i2 & 2) != 0) {
                str2 = platformLogin.nickname;
            }
            if ((i2 & 4) != 0) {
                str3 = platformLogin.openId;
            }
            if ((i2 & 8) != 0) {
                i = platformLogin.platform;
            }
            if ((i2 & 16) != 0) {
                str4 = platformLogin.timestamp;
            }
            String str5 = str4;
            String str6 = str3;
            return platformLogin.copy(str, str2, str6, i, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOpenId() {
            return this.openId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlatform() {
            return this.platform;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final PlatformLogin copy(String avatar, String nickname, String openId, int platform, String timestamp) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            Intrinsics.checkNotNullParameter(openId, "openId");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new PlatformLogin(avatar, nickname, openId, platform, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlatformLogin)) {
                return false;
            }
            PlatformLogin platformLogin = (PlatformLogin) other;
            return Intrinsics.areEqual(this.avatar, platformLogin.avatar) && Intrinsics.areEqual(this.nickname, platformLogin.nickname) && Intrinsics.areEqual(this.openId, platformLogin.openId) && this.platform == platformLogin.platform && Intrinsics.areEqual(this.timestamp, platformLogin.timestamp);
        }

        public int hashCode() {
            return (((((((this.avatar.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.openId.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31) + this.timestamp.hashCode();
        }

        public String toString() {
            return "PlatformLogin(avatar=" + this.avatar + ", nickname=" + this.nickname + ", openId=" + this.openId + ", platform=" + this.platform + ", timestamp=" + this.timestamp + Separators.RPAREN;
        }

        public PlatformLogin(String avatar, String nickname, String openId, int i, String timestamp) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            Intrinsics.checkNotNullParameter(openId, "openId");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.avatar = avatar;
            this.nickname = nickname;
            this.openId = openId;
            this.platform = i;
            this.timestamp = timestamp;
        }

        public final String getAvatar() {
            return this.avatar;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final void setAvatar(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.avatar = str;
        }

        public final void setNickname(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.nickname = str;
        }

        public final String getOpenId() {
            return this.openId;
        }

        public final int getPlatform() {
            return this.platform;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public final void setOpenId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.openId = str;
        }

        public final void setPlatform(int i) {
            this.platform = i;
        }

        public final void setTimestamp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.timestamp = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$MembersUserInfo;", "", "appTime", "", "locale", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "()V", "getAppTime", "()Ljava/lang/String;", "setAppTime", "(Ljava/lang/String;)V", "getLocale", "setLocale", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MembersUserInfo {
        private String appTime;
        private String locale;
        private int type;

        public static /* synthetic */ MembersUserInfo copy$default(MembersUserInfo membersUserInfo, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = membersUserInfo.appTime;
            }
            if ((i2 & 2) != 0) {
                str2 = membersUserInfo.locale;
            }
            if ((i2 & 4) != 0) {
                i = membersUserInfo.type;
            }
            return membersUserInfo.copy(str, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final MembersUserInfo copy(String appTime, String locale, int type) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new MembersUserInfo(appTime, locale, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MembersUserInfo)) {
                return false;
            }
            MembersUserInfo membersUserInfo = (MembersUserInfo) other;
            return Intrinsics.areEqual(this.appTime, membersUserInfo.appTime) && Intrinsics.areEqual(this.locale, membersUserInfo.locale) && this.type == membersUserInfo.type;
        }

        public int hashCode() {
            return (((this.appTime.hashCode() * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.type);
        }

        public String toString() {
            return "MembersUserInfo(appTime=" + this.appTime + ", locale=" + this.locale + ", type=" + this.type + Separators.RPAREN;
        }

        public MembersUserInfo(String appTime, String locale, int i) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.appTime = appTime;
            this.locale = locale;
            this.type = i;
        }

        public final String getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appTime = str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MembersUserInfo() {
            /*
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r2
                long r0 = r0 / r2
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.util.Locale r1 = com.wakeup.common.utils.SystemUtils.getLanguage()
                java.lang.String r1 = r1.getLanguage()
                java.lang.String r2 = "getLanguage(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r2 = 0
                r4.<init>(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.BasicRequest.MembersUserInfo.<init>():void");
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\n¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$MembersUserInfoFree;", "", "appTime", "", "locale", "type", "", "member7dFreeActivityStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "(I)V", "getAppTime", "()Ljava/lang/String;", "setAppTime", "(Ljava/lang/String;)V", "getLocale", "setLocale", "getType", "()I", "setType", "getMember7dFreeActivityStatus", "setMember7dFreeActivityStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MembersUserInfoFree {
        private String appTime;
        private String locale;
        private int member7dFreeActivityStatus;
        private int type;

        public static /* synthetic */ MembersUserInfoFree copy$default(MembersUserInfoFree membersUserInfoFree, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = membersUserInfoFree.appTime;
            }
            if ((i3 & 2) != 0) {
                str2 = membersUserInfoFree.locale;
            }
            if ((i3 & 4) != 0) {
                i = membersUserInfoFree.type;
            }
            if ((i3 & 8) != 0) {
                i2 = membersUserInfoFree.member7dFreeActivityStatus;
            }
            return membersUserInfoFree.copy(str, str2, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMember7dFreeActivityStatus() {
            return this.member7dFreeActivityStatus;
        }

        public final MembersUserInfoFree copy(String appTime, String locale, int type, int member7dFreeActivityStatus) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new MembersUserInfoFree(appTime, locale, type, member7dFreeActivityStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MembersUserInfoFree)) {
                return false;
            }
            MembersUserInfoFree membersUserInfoFree = (MembersUserInfoFree) other;
            return Intrinsics.areEqual(this.appTime, membersUserInfoFree.appTime) && Intrinsics.areEqual(this.locale, membersUserInfoFree.locale) && this.type == membersUserInfoFree.type && this.member7dFreeActivityStatus == membersUserInfoFree.member7dFreeActivityStatus;
        }

        public int hashCode() {
            return (((((this.appTime.hashCode() * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.member7dFreeActivityStatus);
        }

        public String toString() {
            return "MembersUserInfoFree(appTime=" + this.appTime + ", locale=" + this.locale + ", type=" + this.type + ", member7dFreeActivityStatus=" + this.member7dFreeActivityStatus + Separators.RPAREN;
        }

        public MembersUserInfoFree(String appTime, String locale, int i, int i2) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.appTime = appTime;
            this.locale = locale;
            this.type = i;
            this.member7dFreeActivityStatus = i2;
        }

        public final String getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appTime = str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final int getMember7dFreeActivityStatus() {
            return this.member7dFreeActivityStatus;
        }

        public final void setMember7dFreeActivityStatus(int i) {
            this.member7dFreeActivityStatus = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MembersUserInfoFree(int r5) {
            /*
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r2
                long r0 = r0 / r2
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.util.Locale r1 = com.wakeup.common.utils.SystemUtils.getLanguage()
                java.lang.String r1 = r1.getLanguage()
                java.lang.String r2 = "getLanguage(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r2 = 0
                r4.<init>(r0, r1, r2, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.BasicRequest.MembersUserInfoFree.<init>(int):void");
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$MembersUserInfoOverseas;", "", "latitude", "", "longitude", "appTime", "", "locale", "type", "", "<init>", "(DDLjava/lang/String;Ljava/lang/String;I)V", "(DD)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getAppTime", "()Ljava/lang/String;", "setAppTime", "(Ljava/lang/String;)V", "getLocale", "setLocale", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MembersUserInfoOverseas {
        private String appTime;
        private double latitude;
        private String locale;
        private double longitude;
        private int type;

        public static /* synthetic */ MembersUserInfoOverseas copy$default(MembersUserInfoOverseas membersUserInfoOverseas, double d, double d2, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = membersUserInfoOverseas.latitude;
            }
            double d3 = d;
            if ((i2 & 2) != 0) {
                d2 = membersUserInfoOverseas.longitude;
            }
            double d4 = d2;
            if ((i2 & 4) != 0) {
                str = membersUserInfoOverseas.appTime;
            }
            String str3 = str;
            if ((i2 & 8) != 0) {
                str2 = membersUserInfoOverseas.locale;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                i = membersUserInfoOverseas.type;
            }
            return membersUserInfoOverseas.copy(d3, d4, str3, str4, i);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAppTime() {
            return this.appTime;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component5, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final MembersUserInfoOverseas copy(double latitude, double longitude, String appTime, String locale, int type) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new MembersUserInfoOverseas(latitude, longitude, appTime, locale, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MembersUserInfoOverseas)) {
                return false;
            }
            MembersUserInfoOverseas membersUserInfoOverseas = (MembersUserInfoOverseas) other;
            return Double.compare(this.latitude, membersUserInfoOverseas.latitude) == 0 && Double.compare(this.longitude, membersUserInfoOverseas.longitude) == 0 && Intrinsics.areEqual(this.appTime, membersUserInfoOverseas.appTime) && Intrinsics.areEqual(this.locale, membersUserInfoOverseas.locale) && this.type == membersUserInfoOverseas.type;
        }

        public int hashCode() {
            return (((((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + this.appTime.hashCode()) * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.type);
        }

        public String toString() {
            return "MembersUserInfoOverseas(latitude=" + this.latitude + ", longitude=" + this.longitude + ", appTime=" + this.appTime + ", locale=" + this.locale + ", type=" + this.type + Separators.RPAREN;
        }

        public MembersUserInfoOverseas(double d, double d2, String appTime, String locale, int i) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.latitude = d;
            this.longitude = d2;
            this.appTime = appTime;
            this.locale = locale;
            this.type = i;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final void setLatitude(double d) {
            this.latitude = d;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final void setLongitude(double d) {
            this.longitude = d;
        }

        public final String getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appTime = str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MembersUserInfoOverseas(double r11, double r13) {
            /*
                r10 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r2
                long r0 = r0 / r2
                java.lang.String r7 = java.lang.String.valueOf(r0)
                java.util.Locale r0 = com.wakeup.common.utils.SystemUtils.getLanguage()
                java.lang.String r8 = r0.getLanguage()
                java.lang.String r0 = "getLanguage(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
                r9 = 0
                r2 = r10
                r3 = r11
                r5 = r13
                r2.<init>(r3, r5, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.BasicRequest.MembersUserInfoOverseas.<init>(double, double):void");
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKey;", "", "youmengToken", "", "platform", "", "<init>", "(Ljava/lang/String;I)V", "getYoumengToken", "()Ljava/lang/String;", "setYoumengToken", "(Ljava/lang/String;)V", "getPlatform", "()I", "setPlatform", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoginWithOneKey {
        private int platform;
        private String youmengToken;

        public static /* synthetic */ LoginWithOneKey copy$default(LoginWithOneKey loginWithOneKey, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loginWithOneKey.youmengToken;
            }
            if ((i2 & 2) != 0) {
                i = loginWithOneKey.platform;
            }
            return loginWithOneKey.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getYoumengToken() {
            return this.youmengToken;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPlatform() {
            return this.platform;
        }

        public final LoginWithOneKey copy(String youmengToken, int platform) {
            Intrinsics.checkNotNullParameter(youmengToken, "youmengToken");
            return new LoginWithOneKey(youmengToken, platform);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginWithOneKey)) {
                return false;
            }
            LoginWithOneKey loginWithOneKey = (LoginWithOneKey) other;
            return Intrinsics.areEqual(this.youmengToken, loginWithOneKey.youmengToken) && this.platform == loginWithOneKey.platform;
        }

        public int hashCode() {
            return (this.youmengToken.hashCode() * 31) + Integer.hashCode(this.platform);
        }

        public String toString() {
            return "LoginWithOneKey(youmengToken=" + this.youmengToken + ", platform=" + this.platform + Separators.RPAREN;
        }

        public LoginWithOneKey(String youmengToken, int i) {
            Intrinsics.checkNotNullParameter(youmengToken, "youmengToken");
            this.youmengToken = youmengToken;
            this.platform = i;
        }

        public final String getYoumengToken() {
            return this.youmengToken;
        }

        public final void setYoumengToken(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.youmengToken = str;
        }

        public final int getPlatform() {
            return this.platform;
        }

        public final void setPlatform(int i) {
            this.platform = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKeyCache;", "", "oldYoumengToken", "", "oldPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldYoumengToken", "()Ljava/lang/String;", "setOldYoumengToken", "(Ljava/lang/String;)V", "getOldPhone", "setOldPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoginWithOneKeyCache {
        private String oldPhone;
        private String oldYoumengToken;

        public static /* synthetic */ LoginWithOneKeyCache copy$default(LoginWithOneKeyCache loginWithOneKeyCache, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginWithOneKeyCache.oldYoumengToken;
            }
            if ((i & 2) != 0) {
                str2 = loginWithOneKeyCache.oldPhone;
            }
            return loginWithOneKeyCache.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOldYoumengToken() {
            return this.oldYoumengToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOldPhone() {
            return this.oldPhone;
        }

        public final LoginWithOneKeyCache copy(String oldYoumengToken, String oldPhone) {
            Intrinsics.checkNotNullParameter(oldYoumengToken, "oldYoumengToken");
            Intrinsics.checkNotNullParameter(oldPhone, "oldPhone");
            return new LoginWithOneKeyCache(oldYoumengToken, oldPhone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginWithOneKeyCache)) {
                return false;
            }
            LoginWithOneKeyCache loginWithOneKeyCache = (LoginWithOneKeyCache) other;
            return Intrinsics.areEqual(this.oldYoumengToken, loginWithOneKeyCache.oldYoumengToken) && Intrinsics.areEqual(this.oldPhone, loginWithOneKeyCache.oldPhone);
        }

        public int hashCode() {
            return (this.oldYoumengToken.hashCode() * 31) + this.oldPhone.hashCode();
        }

        public String toString() {
            return "LoginWithOneKeyCache(oldYoumengToken=" + this.oldYoumengToken + ", oldPhone=" + this.oldPhone + Separators.RPAREN;
        }

        public LoginWithOneKeyCache(String oldYoumengToken, String oldPhone) {
            Intrinsics.checkNotNullParameter(oldYoumengToken, "oldYoumengToken");
            Intrinsics.checkNotNullParameter(oldPhone, "oldPhone");
            this.oldYoumengToken = oldYoumengToken;
            this.oldPhone = oldPhone;
        }

        public final String getOldYoumengToken() {
            return this.oldYoumengToken;
        }

        public final void setOldYoumengToken(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.oldYoumengToken = str;
        }

        public final String getOldPhone() {
            return this.oldPhone;
        }

        public final void setOldPhone(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.oldPhone = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$FeedBack;", "", "issue", "", "appVersion", "system", "problemType", "equipment_type", "", "logFile", "feedImgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getIssue", "()Ljava/lang/String;", "getAppVersion", "getSystem", "getProblemType", "getEquipment_type", "()I", "getLogFile", "getFeedImgs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeedBack {
        private final String appVersion;
        private final int equipment_type;
        private final String feedImgs;
        private final String issue;
        private final String logFile;
        private final String problemType;
        private final String system;

        public static /* synthetic */ FeedBack copy$default(FeedBack feedBack, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = feedBack.issue;
            }
            if ((i2 & 2) != 0) {
                str2 = feedBack.appVersion;
            }
            if ((i2 & 4) != 0) {
                str3 = feedBack.system;
            }
            if ((i2 & 8) != 0) {
                str4 = feedBack.problemType;
            }
            if ((i2 & 16) != 0) {
                i = feedBack.equipment_type;
            }
            if ((i2 & 32) != 0) {
                str5 = feedBack.logFile;
            }
            if ((i2 & 64) != 0) {
                str6 = feedBack.feedImgs;
            }
            String str7 = str5;
            String str8 = str6;
            int i3 = i;
            String str9 = str3;
            return feedBack.copy(str, str2, str9, str4, i3, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIssue() {
            return this.issue;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSystem() {
            return this.system;
        }

        /* renamed from: component4, reason: from getter */
        public final String getProblemType() {
            return this.problemType;
        }

        /* renamed from: component5, reason: from getter */
        public final int getEquipment_type() {
            return this.equipment_type;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLogFile() {
            return this.logFile;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFeedImgs() {
            return this.feedImgs;
        }

        public final FeedBack copy(String issue, String appVersion, String system, String problemType, int equipment_type, String logFile, String feedImgs) {
            Intrinsics.checkNotNullParameter(issue, "issue");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(system, "system");
            Intrinsics.checkNotNullParameter(problemType, "problemType");
            Intrinsics.checkNotNullParameter(logFile, "logFile");
            Intrinsics.checkNotNullParameter(feedImgs, "feedImgs");
            return new FeedBack(issue, appVersion, system, problemType, equipment_type, logFile, feedImgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedBack)) {
                return false;
            }
            FeedBack feedBack = (FeedBack) other;
            return Intrinsics.areEqual(this.issue, feedBack.issue) && Intrinsics.areEqual(this.appVersion, feedBack.appVersion) && Intrinsics.areEqual(this.system, feedBack.system) && Intrinsics.areEqual(this.problemType, feedBack.problemType) && this.equipment_type == feedBack.equipment_type && Intrinsics.areEqual(this.logFile, feedBack.logFile) && Intrinsics.areEqual(this.feedImgs, feedBack.feedImgs);
        }

        public int hashCode() {
            return (((((((((((this.issue.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.system.hashCode()) * 31) + this.problemType.hashCode()) * 31) + Integer.hashCode(this.equipment_type)) * 31) + this.logFile.hashCode()) * 31) + this.feedImgs.hashCode();
        }

        public String toString() {
            return "FeedBack(issue=" + this.issue + ", appVersion=" + this.appVersion + ", system=" + this.system + ", problemType=" + this.problemType + ", equipment_type=" + this.equipment_type + ", logFile=" + this.logFile + ", feedImgs=" + this.feedImgs + Separators.RPAREN;
        }

        public FeedBack(String issue, String appVersion, String system, String problemType, int i, String logFile, String feedImgs) {
            Intrinsics.checkNotNullParameter(issue, "issue");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(system, "system");
            Intrinsics.checkNotNullParameter(problemType, "problemType");
            Intrinsics.checkNotNullParameter(logFile, "logFile");
            Intrinsics.checkNotNullParameter(feedImgs, "feedImgs");
            this.issue = issue;
            this.appVersion = appVersion;
            this.system = system;
            this.problemType = problemType;
            this.equipment_type = i;
            this.logFile = logFile;
            this.feedImgs = feedImgs;
        }

        public final String getIssue() {
            return this.issue;
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getSystem() {
            return this.system;
        }

        public final String getProblemType() {
            return this.problemType;
        }

        public final int getEquipment_type() {
            return this.equipment_type;
        }

        public final String getLogFile() {
            return this.logFile;
        }

        public final String getFeedImgs() {
            return this.feedImgs;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Verification;", "", Constants.BundleKey.ACCOUNT, "", "code", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getCode", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Verification {
        private final String account;
        private final String code;
        private final String type;

        public static /* synthetic */ Verification copy$default(Verification verification, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verification.account;
            }
            if ((i & 2) != 0) {
                str2 = verification.code;
            }
            if ((i & 4) != 0) {
                str3 = verification.type;
            }
            return verification.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Verification copy(String account, String code, String type) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Verification(account, code, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) other;
            return Intrinsics.areEqual(this.account, verification.account) && Intrinsics.areEqual(this.code, verification.code) && Intrinsics.areEqual(this.type, verification.type);
        }

        public int hashCode() {
            return (((this.account.hashCode() * 31) + this.code.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Verification(account=" + this.account + ", code=" + this.code + ", type=" + this.type + Separators.RPAREN;
        }

        public Verification(String account, String code, String type) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(type, "type");
            this.account = account;
            this.code = code;
            this.type = type;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$WeatherAllInfo;", "", "version", "", "code", "", "lon", "", "bluetoothName", "lat", "<init>", "(Ljava/lang/String;IDLjava/lang/String;D)V", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "getCode", "()I", "getLon", "()D", "getBluetoothName", "getLat", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeatherAllInfo {
        private final String bluetoothName;
        private final int code;
        private final double lat;
        private final double lon;
        private final String version;

        public static /* synthetic */ WeatherAllInfo copy$default(WeatherAllInfo weatherAllInfo, String str, int i, double d, String str2, double d2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = weatherAllInfo.version;
            }
            if ((i2 & 2) != 0) {
                i = weatherAllInfo.code;
            }
            if ((i2 & 4) != 0) {
                d = weatherAllInfo.lon;
            }
            if ((i2 & 8) != 0) {
                str2 = weatherAllInfo.bluetoothName;
            }
            if ((i2 & 16) != 0) {
                d2 = weatherAllInfo.lat;
            }
            String str3 = str2;
            double d3 = d;
            return weatherAllInfo.copy(str, i, d3, str3, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final double getLon() {
            return this.lon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        /* renamed from: component5, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        public final WeatherAllInfo copy(String version, int code, double lon, String bluetoothName, double lat) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
            return new WeatherAllInfo(version, code, lon, bluetoothName, lat);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeatherAllInfo)) {
                return false;
            }
            WeatherAllInfo weatherAllInfo = (WeatherAllInfo) other;
            return Intrinsics.areEqual(this.version, weatherAllInfo.version) && this.code == weatherAllInfo.code && Double.compare(this.lon, weatherAllInfo.lon) == 0 && Intrinsics.areEqual(this.bluetoothName, weatherAllInfo.bluetoothName) && Double.compare(this.lat, weatherAllInfo.lat) == 0;
        }

        public int hashCode() {
            return (((((((this.version.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + Double.hashCode(this.lon)) * 31) + this.bluetoothName.hashCode()) * 31) + Double.hashCode(this.lat);
        }

        public String toString() {
            return "WeatherAllInfo(version=" + this.version + ", code=" + this.code + ", lon=" + this.lon + ", bluetoothName=" + this.bluetoothName + ", lat=" + this.lat + Separators.RPAREN;
        }

        public WeatherAllInfo(String version, int i, double d, String bluetoothName, double d2) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
            this.version = version;
            this.code = i;
            this.lon = d;
            this.bluetoothName = bluetoothName;
            this.lat = d2;
        }

        public final String getVersion() {
            return this.version;
        }

        public final int getCode() {
            return this.code;
        }

        public final double getLon() {
            return this.lon;
        }

        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        public final double getLat() {
            return this.lat;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Register;", "", Constants.BundleKey.ACCOUNT, "", UserConstants.AREA_ID, "password", "code", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getAreaId", "getPassword", "getCode", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Register {
        private final String account;
        private final String areaId;
        private final String code;
        private final String password;
        private final String timestamp;

        public static /* synthetic */ Register copy$default(Register register, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = register.account;
            }
            if ((i & 2) != 0) {
                str2 = register.areaId;
            }
            if ((i & 4) != 0) {
                str3 = register.password;
            }
            if ((i & 8) != 0) {
                str4 = register.code;
            }
            if ((i & 16) != 0) {
                str5 = register.timestamp;
            }
            String str6 = str5;
            String str7 = str3;
            return register.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAreaId() {
            return this.areaId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final Register copy(String account, String areaId, String password, String code, String timestamp) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(areaId, "areaId");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Register(account, areaId, password, code, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Register)) {
                return false;
            }
            Register register = (Register) other;
            return Intrinsics.areEqual(this.account, register.account) && Intrinsics.areEqual(this.areaId, register.areaId) && Intrinsics.areEqual(this.password, register.password) && Intrinsics.areEqual(this.code, register.code) && Intrinsics.areEqual(this.timestamp, register.timestamp);
        }

        public int hashCode() {
            return (((((((this.account.hashCode() * 31) + this.areaId.hashCode()) * 31) + this.password.hashCode()) * 31) + this.code.hashCode()) * 31) + this.timestamp.hashCode();
        }

        public String toString() {
            return "Register(account=" + this.account + ", areaId=" + this.areaId + ", password=" + this.password + ", code=" + this.code + ", timestamp=" + this.timestamp + Separators.RPAREN;
        }

        public Register(String account, String areaId, String password, String code, String timestamp) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(areaId, "areaId");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.account = account;
            this.areaId = areaId;
            this.password = password;
            this.code = code;
            this.timestamp = timestamp;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getAreaId() {
            return this.areaId;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UpdatePwd;", "", HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewPassword", "()Ljava/lang/String;", "getCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatePwd {
        private final String code;
        private final String newPassword;

        public static /* synthetic */ UpdatePwd copy$default(UpdatePwd updatePwd, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updatePwd.newPassword;
            }
            if ((i & 2) != 0) {
                str2 = updatePwd.code;
            }
            return updatePwd.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNewPassword() {
            return this.newPassword;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final UpdatePwd copy(String newPassword, String code) {
            Intrinsics.checkNotNullParameter(newPassword, "newPassword");
            Intrinsics.checkNotNullParameter(code, "code");
            return new UpdatePwd(newPassword, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatePwd)) {
                return false;
            }
            UpdatePwd updatePwd = (UpdatePwd) other;
            return Intrinsics.areEqual(this.newPassword, updatePwd.newPassword) && Intrinsics.areEqual(this.code, updatePwd.code);
        }

        public int hashCode() {
            return (this.newPassword.hashCode() * 31) + this.code.hashCode();
        }

        public String toString() {
            return "UpdatePwd(newPassword=" + this.newPassword + ", code=" + this.code + Separators.RPAREN;
        }

        public UpdatePwd(String newPassword, String code) {
            Intrinsics.checkNotNullParameter(newPassword, "newPassword");
            Intrinsics.checkNotNullParameter(code, "code");
            this.newPassword = newPassword;
            this.code = code;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getNewPassword() {
            return this.newPassword;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Bind;", "", "platform", "", "openId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getOpenId", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bind {
        private final String openId;
        private final String platform;
        private final String type;

        public static /* synthetic */ Bind copy$default(Bind bind, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bind.platform;
            }
            if ((i & 2) != 0) {
                str2 = bind.openId;
            }
            if ((i & 4) != 0) {
                str3 = bind.type;
            }
            return bind.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOpenId() {
            return this.openId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Bind copy(String platform, String openId, String type) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(openId, "openId");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Bind(platform, openId, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bind)) {
                return false;
            }
            Bind bind = (Bind) other;
            return Intrinsics.areEqual(this.platform, bind.platform) && Intrinsics.areEqual(this.openId, bind.openId) && Intrinsics.areEqual(this.type, bind.type);
        }

        public int hashCode() {
            return (((this.platform.hashCode() * 31) + this.openId.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Bind(platform=" + this.platform + ", openId=" + this.openId + ", type=" + this.type + Separators.RPAREN;
        }

        public Bind(String platform, String openId, String type) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(openId, "openId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.platform = platform;
            this.openId = openId;
            this.type = type;
        }

        public final String getOpenId() {
            return this.openId;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Logout;", "", "code", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Logout {
        private final String code;
        private final String timestamp;

        public static /* synthetic */ Logout copy$default(Logout logout, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logout.code;
            }
            if ((i & 2) != 0) {
                str2 = logout.timestamp;
            }
            return logout.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final Logout copy(String code, String timestamp) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Logout(code, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logout)) {
                return false;
            }
            Logout logout = (Logout) other;
            return Intrinsics.areEqual(this.code, logout.code) && Intrinsics.areEqual(this.timestamp, logout.timestamp);
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.timestamp.hashCode();
        }

        public String toString() {
            return "Logout(code=" + this.code + ", timestamp=" + this.timestamp + Separators.RPAREN;
        }

        public Logout(String code, String timestamp) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.code = code;
            this.timestamp = timestamp;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$BindAccount;", "", Constants.BundleKey.ACCOUNT, "", "code", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getCode", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindAccount {
        private final String account;
        private final String code;
        private final String password;

        public static /* synthetic */ BindAccount copy$default(BindAccount bindAccount, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bindAccount.account;
            }
            if ((i & 2) != 0) {
                str2 = bindAccount.code;
            }
            if ((i & 4) != 0) {
                str3 = bindAccount.password;
            }
            return bindAccount.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final BindAccount copy(String account, String code, String password) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(password, "password");
            return new BindAccount(account, code, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindAccount)) {
                return false;
            }
            BindAccount bindAccount = (BindAccount) other;
            return Intrinsics.areEqual(this.account, bindAccount.account) && Intrinsics.areEqual(this.code, bindAccount.code) && Intrinsics.areEqual(this.password, bindAccount.password);
        }

        public int hashCode() {
            return (((this.account.hashCode() * 31) + this.code.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "BindAccount(account=" + this.account + ", code=" + this.code + ", password=" + this.password + Separators.RPAREN;
        }

        public BindAccount(String account, String code, String password) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(password, "password");
            this.account = account;
            this.code = code;
            this.password = password;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Repassword;", "", Constants.BundleKey.ACCOUNT, "", "password", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getPassword", "getCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Repassword {
        private final String account;
        private final String code;
        private final String password;

        public static /* synthetic */ Repassword copy$default(Repassword repassword, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repassword.account;
            }
            if ((i & 2) != 0) {
                str2 = repassword.password;
            }
            if ((i & 4) != 0) {
                str3 = repassword.code;
            }
            return repassword.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Repassword copy(String account, String password, String code) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            return new Repassword(account, password, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Repassword)) {
                return false;
            }
            Repassword repassword = (Repassword) other;
            return Intrinsics.areEqual(this.account, repassword.account) && Intrinsics.areEqual(this.password, repassword.password) && Intrinsics.areEqual(this.code, repassword.code);
        }

        public int hashCode() {
            return (((this.account.hashCode() * 31) + this.password.hashCode()) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Repassword(account=" + this.account + ", password=" + this.password + ", code=" + this.code + Separators.RPAREN;
        }

        public Repassword(String account, String password, String code) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            this.account = account;
            this.password = password;
            this.code = code;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$HealthCheckTime;", "", "healthType", "", "time", "", "data", "", "is24", "", "is7day", "<init>", "(IJLjava/lang/String;ZZ)V", "getHealthType", "()I", "getTime", "()J", "getData", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HealthCheckTime {
        private final String data;
        private final int healthType;
        private final boolean is24;
        private final boolean is7day;
        private final long time;

        public static /* synthetic */ HealthCheckTime copy$default(HealthCheckTime healthCheckTime, int i, long j, String str, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = healthCheckTime.healthType;
            }
            if ((i2 & 2) != 0) {
                j = healthCheckTime.time;
            }
            if ((i2 & 4) != 0) {
                str = healthCheckTime.data;
            }
            if ((i2 & 8) != 0) {
                z = healthCheckTime.is24;
            }
            if ((i2 & 16) != 0) {
                z2 = healthCheckTime.is7day;
            }
            boolean z3 = z2;
            String str2 = str;
            return healthCheckTime.copy(i, j, str2, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHealthType() {
            return this.healthType;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        /* renamed from: component3, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIs24() {
            return this.is24;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs7day() {
            return this.is7day;
        }

        public final HealthCheckTime copy(int healthType, long time, String data, boolean is24, boolean is7day) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new HealthCheckTime(healthType, time, data, is24, is7day);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthCheckTime)) {
                return false;
            }
            HealthCheckTime healthCheckTime = (HealthCheckTime) other;
            return this.healthType == healthCheckTime.healthType && this.time == healthCheckTime.time && Intrinsics.areEqual(this.data, healthCheckTime.data) && this.is24 == healthCheckTime.is24 && this.is7day == healthCheckTime.is7day;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.healthType) * 31) + Long.hashCode(this.time)) * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.is24)) * 31) + Boolean.hashCode(this.is7day);
        }

        public String toString() {
            return "HealthCheckTime(healthType=" + this.healthType + ", time=" + this.time + ", data=" + this.data + ", is24=" + this.is24 + ", is7day=" + this.is7day + Separators.RPAREN;
        }

        public HealthCheckTime(int i, long j, String data, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.healthType = i;
            this.time = j;
            this.data = data;
            this.is24 = z;
            this.is7day = z2;
        }

        public final int getHealthType() {
            return this.healthType;
        }

        public final long getTime() {
            return this.time;
        }

        public final String getData() {
            return this.data;
        }

        public final boolean is24() {
            return this.is24;
        }

        public final boolean is7day() {
            return this.is7day;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$Questionnaire;", "", "userId", "", "status", "", "<init>", "(Ljava/lang/String;F)V", "getUserId", "()Ljava/lang/String;", "getStatus", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Questionnaire {
        private final float status;
        private final String userId;

        public static /* synthetic */ Questionnaire copy$default(Questionnaire questionnaire, String str, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = questionnaire.userId;
            }
            if ((i & 2) != 0) {
                f = questionnaire.status;
            }
            return questionnaire.copy(str, f);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final float getStatus() {
            return this.status;
        }

        public final Questionnaire copy(String userId, float status) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new Questionnaire(userId, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Questionnaire)) {
                return false;
            }
            Questionnaire questionnaire = (Questionnaire) other;
            return Intrinsics.areEqual(this.userId, questionnaire.userId) && Float.compare(this.status, questionnaire.status) == 0;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + Float.hashCode(this.status);
        }

        public String toString() {
            return "Questionnaire(userId=" + this.userId + ", status=" + this.status + Separators.RPAREN;
        }

        public Questionnaire(String userId, float f) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
            this.status = f;
        }

        public final float getStatus() {
            return this.status;
        }

        public final String getUserId() {
            return this.userId;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$IntegrationRecord;", "", "appTime", "", "locale", "curPage", "", "pageSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getAppTime", "()Ljava/lang/String;", "getLocale", "getCurPage", "()I", "getPageSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IntegrationRecord {
        private final String appTime;
        private final int curPage;
        private final String locale;
        private final int pageSize;

        public static /* synthetic */ IntegrationRecord copy$default(IntegrationRecord integrationRecord, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = integrationRecord.appTime;
            }
            if ((i3 & 2) != 0) {
                str2 = integrationRecord.locale;
            }
            if ((i3 & 4) != 0) {
                i = integrationRecord.curPage;
            }
            if ((i3 & 8) != 0) {
                i2 = integrationRecord.pageSize;
            }
            return integrationRecord.copy(str, str2, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCurPage() {
            return this.curPage;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        public final IntegrationRecord copy(String appTime, String locale, int curPage, int pageSize) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new IntegrationRecord(appTime, locale, curPage, pageSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationRecord)) {
                return false;
            }
            IntegrationRecord integrationRecord = (IntegrationRecord) other;
            return Intrinsics.areEqual(this.appTime, integrationRecord.appTime) && Intrinsics.areEqual(this.locale, integrationRecord.locale) && this.curPage == integrationRecord.curPage && this.pageSize == integrationRecord.pageSize;
        }

        public int hashCode() {
            return (((((this.appTime.hashCode() * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.curPage)) * 31) + Integer.hashCode(this.pageSize);
        }

        public String toString() {
            return "IntegrationRecord(appTime=" + this.appTime + ", locale=" + this.locale + ", curPage=" + this.curPage + ", pageSize=" + this.pageSize + Separators.RPAREN;
        }

        public IntegrationRecord(String appTime, String locale, int i, int i2) {
            Intrinsics.checkNotNullParameter(appTime, "appTime");
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.appTime = appTime;
            this.locale = locale;
            this.curPage = i;
            this.pageSize = i2;
        }

        public final String getAppTime() {
            return this.appTime;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final int getCurPage() {
            return this.curPage;
        }

        public final int getPageSize() {
            return this.pageSize;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$HealthDataUpload;", "", "type", "", "timestamp", "", "heartBeat", "systolicBloodPressure", "diastolicBloodPressure", "<init>", "(IJIII)V", "getType", "()I", "getTimestamp", "()J", "getHeartBeat", "getSystolicBloodPressure", "getDiastolicBloodPressure", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HealthDataUpload {
        private final int diastolicBloodPressure;
        private final int heartBeat;
        private final int systolicBloodPressure;
        private final long timestamp;
        private final int type;

        public static /* synthetic */ HealthDataUpload copy$default(HealthDataUpload healthDataUpload, int i, long j, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = healthDataUpload.type;
            }
            if ((i5 & 2) != 0) {
                j = healthDataUpload.timestamp;
            }
            if ((i5 & 4) != 0) {
                i2 = healthDataUpload.heartBeat;
            }
            if ((i5 & 8) != 0) {
                i3 = healthDataUpload.systolicBloodPressure;
            }
            if ((i5 & 16) != 0) {
                i4 = healthDataUpload.diastolicBloodPressure;
            }
            int i6 = i4;
            int i7 = i2;
            return healthDataUpload.copy(i, j, i7, i3, i6);
        }

        /* renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHeartBeat() {
            return this.heartBeat;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSystolicBloodPressure() {
            return this.systolicBloodPressure;
        }

        /* renamed from: component5, reason: from getter */
        public final int getDiastolicBloodPressure() {
            return this.diastolicBloodPressure;
        }

        public final HealthDataUpload copy(int type, long timestamp, int heartBeat, int systolicBloodPressure, int diastolicBloodPressure) {
            return new HealthDataUpload(type, timestamp, heartBeat, systolicBloodPressure, diastolicBloodPressure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthDataUpload)) {
                return false;
            }
            HealthDataUpload healthDataUpload = (HealthDataUpload) other;
            return this.type == healthDataUpload.type && this.timestamp == healthDataUpload.timestamp && this.heartBeat == healthDataUpload.heartBeat && this.systolicBloodPressure == healthDataUpload.systolicBloodPressure && this.diastolicBloodPressure == healthDataUpload.diastolicBloodPressure;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.heartBeat)) * 31) + Integer.hashCode(this.systolicBloodPressure)) * 31) + Integer.hashCode(this.diastolicBloodPressure);
        }

        public String toString() {
            return "HealthDataUpload(type=" + this.type + ", timestamp=" + this.timestamp + ", heartBeat=" + this.heartBeat + ", systolicBloodPressure=" + this.systolicBloodPressure + ", diastolicBloodPressure=" + this.diastolicBloodPressure + Separators.RPAREN;
        }

        public HealthDataUpload(int i, long j, int i2, int i3, int i4) {
            this.type = i;
            this.timestamp = j;
            this.heartBeat = i2;
            this.systolicBloodPressure = i3;
            this.diastolicBloodPressure = i4;
        }

        public final int getType() {
            return this.type;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final int getHeartBeat() {
            return this.heartBeat;
        }

        public final int getSystolicBloodPressure() {
            return this.systolicBloodPressure;
        }

        public final int getDiastolicBloodPressure() {
            return this.diastolicBloodPressure;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$AddBindRecord;", "", "userId", "", "zfbMac", "", "<init>", "(ILjava/lang/String;)V", "getUserId", "()I", "getZfbMac", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddBindRecord {
        private final int userId;
        private final String zfbMac;

        public static /* synthetic */ AddBindRecord copy$default(AddBindRecord addBindRecord, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = addBindRecord.userId;
            }
            if ((i2 & 2) != 0) {
                str = addBindRecord.zfbMac;
            }
            return addBindRecord.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getZfbMac() {
            return this.zfbMac;
        }

        public final AddBindRecord copy(int userId, String zfbMac) {
            Intrinsics.checkNotNullParameter(zfbMac, "zfbMac");
            return new AddBindRecord(userId, zfbMac);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddBindRecord)) {
                return false;
            }
            AddBindRecord addBindRecord = (AddBindRecord) other;
            return this.userId == addBindRecord.userId && Intrinsics.areEqual(this.zfbMac, addBindRecord.zfbMac);
        }

        public int hashCode() {
            return (Integer.hashCode(this.userId) * 31) + this.zfbMac.hashCode();
        }

        public String toString() {
            return "AddBindRecord(userId=" + this.userId + ", zfbMac=" + this.zfbMac + Separators.RPAREN;
        }

        public AddBindRecord(int i, String zfbMac) {
            Intrinsics.checkNotNullParameter(zfbMac, "zfbMac");
            this.userId = i;
            this.zfbMac = zfbMac;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final String getZfbMac() {
            return this.zfbMac;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$PlatformBindPhone;", "", "openId", "", "platform", "", "youmengToken", "system", "phone", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getOpenId", "()Ljava/lang/String;", "getPlatform", "()I", "getYoumengToken", "getSystem", "getPhone", "getCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlatformBindPhone {
        private final String code;
        private final String openId;
        private final String phone;
        private final int platform;
        private final int system;
        private final String youmengToken;

        public static /* synthetic */ PlatformBindPhone copy$default(PlatformBindPhone platformBindPhone, String str, int i, String str2, int i2, String str3, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = platformBindPhone.openId;
            }
            if ((i3 & 2) != 0) {
                i = platformBindPhone.platform;
            }
            if ((i3 & 4) != 0) {
                str2 = platformBindPhone.youmengToken;
            }
            if ((i3 & 8) != 0) {
                i2 = platformBindPhone.system;
            }
            if ((i3 & 16) != 0) {
                str3 = platformBindPhone.phone;
            }
            if ((i3 & 32) != 0) {
                str4 = platformBindPhone.code;
            }
            String str5 = str3;
            String str6 = str4;
            return platformBindPhone.copy(str, i, str2, i2, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOpenId() {
            return this.openId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPlatform() {
            return this.platform;
        }

        /* renamed from: component3, reason: from getter */
        public final String getYoumengToken() {
            return this.youmengToken;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSystem() {
            return this.system;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final PlatformBindPhone copy(String openId, int platform, String youmengToken, int system, String phone, String code) {
            return new PlatformBindPhone(openId, platform, youmengToken, system, phone, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlatformBindPhone)) {
                return false;
            }
            PlatformBindPhone platformBindPhone = (PlatformBindPhone) other;
            return Intrinsics.areEqual(this.openId, platformBindPhone.openId) && this.platform == platformBindPhone.platform && Intrinsics.areEqual(this.youmengToken, platformBindPhone.youmengToken) && this.system == platformBindPhone.system && Intrinsics.areEqual(this.phone, platformBindPhone.phone) && Intrinsics.areEqual(this.code, platformBindPhone.code);
        }

        public int hashCode() {
            String str = this.openId;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31;
            String str2 = this.youmengToken;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.system)) * 31;
            String str3 = this.phone;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.code;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "PlatformBindPhone(openId=" + this.openId + ", platform=" + this.platform + ", youmengToken=" + this.youmengToken + ", system=" + this.system + ", phone=" + this.phone + ", code=" + this.code + Separators.RPAREN;
        }

        public PlatformBindPhone(String str, int i, String str2, int i2, String str3, String str4) {
            this.openId = str;
            this.platform = i;
            this.youmengToken = str2;
            this.system = i2;
            this.phone = str3;
            this.code = str4;
        }

        public /* synthetic */ PlatformBindPhone(String str, int i, String str2, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i3 & 8) != 0 ? 1 : i2, str3, str4);
        }

        public final String getOpenId() {
            return this.openId;
        }

        public final int getPlatform() {
            return this.platform;
        }

        public final String getYoumengToken() {
            return this.youmengToken;
        }

        public final int getSystem() {
            return this.system;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ForceBinding;", "", "openId", "", "platform", "", "keepPlatform", "phone", "token", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getOpenId", "()Ljava/lang/String;", "getPlatform", "()I", "getKeepPlatform", "getPhone", "getToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ForceBinding {
        private final int keepPlatform;
        private final String openId;
        private final String phone;
        private final int platform;
        private final String token;

        public static /* synthetic */ ForceBinding copy$default(ForceBinding forceBinding, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = forceBinding.openId;
            }
            if ((i3 & 2) != 0) {
                i = forceBinding.platform;
            }
            if ((i3 & 4) != 0) {
                i2 = forceBinding.keepPlatform;
            }
            if ((i3 & 8) != 0) {
                str2 = forceBinding.phone;
            }
            if ((i3 & 16) != 0) {
                str3 = forceBinding.token;
            }
            String str4 = str3;
            int i4 = i2;
            return forceBinding.copy(str, i, i4, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOpenId() {
            return this.openId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPlatform() {
            return this.platform;
        }

        /* renamed from: component3, reason: from getter */
        public final int getKeepPlatform() {
            return this.keepPlatform;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component5, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final ForceBinding copy(String openId, int platform, int keepPlatform, String phone, String token) {
            Intrinsics.checkNotNullParameter(openId, "openId");
            return new ForceBinding(openId, platform, keepPlatform, phone, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForceBinding)) {
                return false;
            }
            ForceBinding forceBinding = (ForceBinding) other;
            return Intrinsics.areEqual(this.openId, forceBinding.openId) && this.platform == forceBinding.platform && this.keepPlatform == forceBinding.keepPlatform && Intrinsics.areEqual(this.phone, forceBinding.phone) && Intrinsics.areEqual(this.token, forceBinding.token);
        }

        public int hashCode() {
            int hashCode = ((((this.openId.hashCode() * 31) + Integer.hashCode(this.platform)) * 31) + Integer.hashCode(this.keepPlatform)) * 31;
            String str = this.phone;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.token;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ForceBinding(openId=" + this.openId + ", platform=" + this.platform + ", keepPlatform=" + this.keepPlatform + ", phone=" + this.phone + ", token=" + this.token + Separators.RPAREN;
        }

        public ForceBinding(String openId, int i, int i2, String str, String str2) {
            Intrinsics.checkNotNullParameter(openId, "openId");
            this.openId = openId;
            this.platform = i;
            this.keepPlatform = i2;
            this.phone = str;
            this.token = str2;
        }

        public final String getOpenId() {
            return this.openId;
        }

        public final int getPlatform() {
            return this.platform;
        }

        public final int getKeepPlatform() {
            return this.keepPlatform;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getToken() {
            return this.token;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ExAssetsCode;", "", "cdkey", "", "exchangeId", "", "exchangeType", "<init>", "(Ljava/lang/String;II)V", "getCdkey", "()Ljava/lang/String;", "getExchangeId", "()I", "getExchangeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExAssetsCode {
        private final String cdkey;
        private final int exchangeId;
        private final int exchangeType;

        public static /* synthetic */ ExAssetsCode copy$default(ExAssetsCode exAssetsCode, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = exAssetsCode.cdkey;
            }
            if ((i3 & 2) != 0) {
                i = exAssetsCode.exchangeId;
            }
            if ((i3 & 4) != 0) {
                i2 = exAssetsCode.exchangeType;
            }
            return exAssetsCode.copy(str, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCdkey() {
            return this.cdkey;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExchangeId() {
            return this.exchangeId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getExchangeType() {
            return this.exchangeType;
        }

        public final ExAssetsCode copy(String cdkey, int exchangeId, int exchangeType) {
            Intrinsics.checkNotNullParameter(cdkey, "cdkey");
            return new ExAssetsCode(cdkey, exchangeId, exchangeType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExAssetsCode)) {
                return false;
            }
            ExAssetsCode exAssetsCode = (ExAssetsCode) other;
            return Intrinsics.areEqual(this.cdkey, exAssetsCode.cdkey) && this.exchangeId == exAssetsCode.exchangeId && this.exchangeType == exAssetsCode.exchangeType;
        }

        public int hashCode() {
            return (((this.cdkey.hashCode() * 31) + Integer.hashCode(this.exchangeId)) * 31) + Integer.hashCode(this.exchangeType);
        }

        public String toString() {
            return "ExAssetsCode(cdkey=" + this.cdkey + ", exchangeId=" + this.exchangeId + ", exchangeType=" + this.exchangeType + Separators.RPAREN;
        }

        public ExAssetsCode(String cdkey, int i, int i2) {
            Intrinsics.checkNotNullParameter(cdkey, "cdkey");
            this.cdkey = cdkey;
            this.exchangeId = i;
            this.exchangeType = i2;
        }

        public final String getCdkey() {
            return this.cdkey;
        }

        public final int getExchangeId() {
            return this.exchangeId;
        }

        public final int getExchangeType() {
            return this.exchangeType;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ModifyPhoneRequest;", "", "originalPhone", "", "newPhone", "captcha", "code", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getOriginalPhone", "()Ljava/lang/String;", "getNewPhone", "getCaptcha", "getCode", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ModifyPhoneRequest {
        private final String captcha;
        private final String code;
        private final String newPhone;
        private final String originalPhone;
        private final int type;

        public static /* synthetic */ ModifyPhoneRequest copy$default(ModifyPhoneRequest modifyPhoneRequest, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = modifyPhoneRequest.originalPhone;
            }
            if ((i2 & 2) != 0) {
                str2 = modifyPhoneRequest.newPhone;
            }
            if ((i2 & 4) != 0) {
                str3 = modifyPhoneRequest.captcha;
            }
            if ((i2 & 8) != 0) {
                str4 = modifyPhoneRequest.code;
            }
            if ((i2 & 16) != 0) {
                i = modifyPhoneRequest.type;
            }
            int i3 = i;
            String str5 = str3;
            return modifyPhoneRequest.copy(str, str2, str5, str4, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOriginalPhone() {
            return this.originalPhone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNewPhone() {
            return this.newPhone;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCaptcha() {
            return this.captcha;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component5, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final ModifyPhoneRequest copy(String originalPhone, String newPhone, String captcha, String code, int type) {
            Intrinsics.checkNotNullParameter(originalPhone, "originalPhone");
            Intrinsics.checkNotNullParameter(newPhone, "newPhone");
            Intrinsics.checkNotNullParameter(captcha, "captcha");
            Intrinsics.checkNotNullParameter(code, "code");
            return new ModifyPhoneRequest(originalPhone, newPhone, captcha, code, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModifyPhoneRequest)) {
                return false;
            }
            ModifyPhoneRequest modifyPhoneRequest = (ModifyPhoneRequest) other;
            return Intrinsics.areEqual(this.originalPhone, modifyPhoneRequest.originalPhone) && Intrinsics.areEqual(this.newPhone, modifyPhoneRequest.newPhone) && Intrinsics.areEqual(this.captcha, modifyPhoneRequest.captcha) && Intrinsics.areEqual(this.code, modifyPhoneRequest.code) && this.type == modifyPhoneRequest.type;
        }

        public int hashCode() {
            return (((((((this.originalPhone.hashCode() * 31) + this.newPhone.hashCode()) * 31) + this.captcha.hashCode()) * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.type);
        }

        public String toString() {
            return "ModifyPhoneRequest(originalPhone=" + this.originalPhone + ", newPhone=" + this.newPhone + ", captcha=" + this.captcha + ", code=" + this.code + ", type=" + this.type + Separators.RPAREN;
        }

        public ModifyPhoneRequest(String originalPhone, String newPhone, String captcha, String code, int i) {
            Intrinsics.checkNotNullParameter(originalPhone, "originalPhone");
            Intrinsics.checkNotNullParameter(newPhone, "newPhone");
            Intrinsics.checkNotNullParameter(captcha, "captcha");
            Intrinsics.checkNotNullParameter(code, "code");
            this.originalPhone = originalPhone;
            this.newPhone = newPhone;
            this.captcha = captcha;
            this.code = code;
            this.type = i;
        }

        public final String getOriginalPhone() {
            return this.originalPhone;
        }

        public final String getNewPhone() {
            return this.newPhone;
        }

        public final String getCaptcha() {
            return this.captcha;
        }

        public final String getCode() {
            return this.code;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$setPasswordRequest;", "", "phone", "", "password", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPassword", "getCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class setPasswordRequest {
        private final String code;
        private final String password;
        private final String phone;

        public static /* synthetic */ setPasswordRequest copy$default(setPasswordRequest setpasswordrequest, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setpasswordrequest.phone;
            }
            if ((i & 2) != 0) {
                str2 = setpasswordrequest.password;
            }
            if ((i & 4) != 0) {
                str3 = setpasswordrequest.code;
            }
            return setpasswordrequest.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final setPasswordRequest copy(String phone, String password, String code) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            return new setPasswordRequest(phone, password, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof setPasswordRequest)) {
                return false;
            }
            setPasswordRequest setpasswordrequest = (setPasswordRequest) other;
            return Intrinsics.areEqual(this.phone, setpasswordrequest.phone) && Intrinsics.areEqual(this.password, setpasswordrequest.password) && Intrinsics.areEqual(this.code, setpasswordrequest.code);
        }

        public int hashCode() {
            return (((this.phone.hashCode() * 31) + this.password.hashCode()) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "setPasswordRequest(phone=" + this.phone + ", password=" + this.password + ", code=" + this.code + Separators.RPAREN;
        }

        public setPasswordRequest(String phone, String password, String code) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(code, "code");
            this.phone = phone;
            this.password = password;
            this.code = code;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$WeikePay;", "", "userIdOut", "", "payArea", "", "paySource", "payType", "relationId", "payClientType", "remark", "appTime", "", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;J)V", "(IIILjava/lang/String;)V", "getUserIdOut", "()Ljava/lang/String;", "getPayArea", "()I", "getPaySource", "getPayType", "getRelationId", "getPayClientType", "getRemark", "getAppTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeikePay {
        private final long appTime;
        private final int payArea;
        private final int payClientType;
        private final int paySource;
        private final int payType;
        private final int relationId;
        private final String remark;
        private final String userIdOut;

        public static /* synthetic */ WeikePay copy$default(WeikePay weikePay, String str, int i, int i2, int i3, int i4, int i5, String str2, long j, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = weikePay.userIdOut;
            }
            if ((i6 & 2) != 0) {
                i = weikePay.payArea;
            }
            if ((i6 & 4) != 0) {
                i2 = weikePay.paySource;
            }
            if ((i6 & 8) != 0) {
                i3 = weikePay.payType;
            }
            if ((i6 & 16) != 0) {
                i4 = weikePay.relationId;
            }
            if ((i6 & 32) != 0) {
                i5 = weikePay.payClientType;
            }
            if ((i6 & 64) != 0) {
                str2 = weikePay.remark;
            }
            if ((i6 & 128) != 0) {
                j = weikePay.appTime;
            }
            long j2 = j;
            int i7 = i5;
            String str3 = str2;
            int i8 = i4;
            int i9 = i2;
            return weikePay.copy(str, i, i9, i3, i8, i7, str3, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserIdOut() {
            return this.userIdOut;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPayArea() {
            return this.payArea;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPaySource() {
            return this.paySource;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPayType() {
            return this.payType;
        }

        /* renamed from: component5, reason: from getter */
        public final int getRelationId() {
            return this.relationId;
        }

        /* renamed from: component6, reason: from getter */
        public final int getPayClientType() {
            return this.payClientType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRemark() {
            return this.remark;
        }

        /* renamed from: component8, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        public final WeikePay copy(String userIdOut, int payArea, int paySource, int payType, int relationId, int payClientType, String remark, long appTime) {
            Intrinsics.checkNotNullParameter(userIdOut, "userIdOut");
            Intrinsics.checkNotNullParameter(remark, "remark");
            return new WeikePay(userIdOut, payArea, paySource, payType, relationId, payClientType, remark, appTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeikePay)) {
                return false;
            }
            WeikePay weikePay = (WeikePay) other;
            return Intrinsics.areEqual(this.userIdOut, weikePay.userIdOut) && this.payArea == weikePay.payArea && this.paySource == weikePay.paySource && this.payType == weikePay.payType && this.relationId == weikePay.relationId && this.payClientType == weikePay.payClientType && Intrinsics.areEqual(this.remark, weikePay.remark) && this.appTime == weikePay.appTime;
        }

        public int hashCode() {
            return (((((((((((((this.userIdOut.hashCode() * 31) + Integer.hashCode(this.payArea)) * 31) + Integer.hashCode(this.paySource)) * 31) + Integer.hashCode(this.payType)) * 31) + Integer.hashCode(this.relationId)) * 31) + Integer.hashCode(this.payClientType)) * 31) + this.remark.hashCode()) * 31) + Long.hashCode(this.appTime);
        }

        public String toString() {
            return "WeikePay(userIdOut=" + this.userIdOut + ", payArea=" + this.payArea + ", paySource=" + this.paySource + ", payType=" + this.payType + ", relationId=" + this.relationId + ", payClientType=" + this.payClientType + ", remark=" + this.remark + ", appTime=" + this.appTime + Separators.RPAREN;
        }

        public WeikePay(String userIdOut, int i, int i2, int i3, int i4, int i5, String remark, long j) {
            Intrinsics.checkNotNullParameter(userIdOut, "userIdOut");
            Intrinsics.checkNotNullParameter(remark, "remark");
            this.userIdOut = userIdOut;
            this.payArea = i;
            this.paySource = i2;
            this.payType = i3;
            this.relationId = i4;
            this.payClientType = i5;
            this.remark = remark;
            this.appTime = j;
        }

        public final String getUserIdOut() {
            return this.userIdOut;
        }

        public final int getPayArea() {
            return this.payArea;
        }

        public final int getPaySource() {
            return this.paySource;
        }

        public final int getPayType() {
            return this.payType;
        }

        public final int getRelationId() {
            return this.relationId;
        }

        public final int getPayClientType() {
            return this.payClientType;
        }

        public final String getRemark() {
            return this.remark;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WeikePay(int r12, int r13, int r14, java.lang.String r15) {
            /*
                r11 = this;
                java.lang.String r0 = "remark"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                com.wakeup.common.storage.model.UserModel r0 = com.wakeup.common.storage.UserDao.getUser()
                java.lang.String r2 = r0.getUserIdEncrypt()
                java.lang.String r0 = "getUserIdEncrypt(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                long r0 = java.lang.System.currentTimeMillis()
                r3 = 1000(0x3e8, float:1.401E-42)
                long r3 = (long) r3
                long r9 = r0 / r3
                r6 = 0
                r7 = 1
                r1 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r8 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.BasicRequest.WeikePay.<init>(int, int, int, java.lang.String):void");
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SyncAppPayOrder;", "", "orderNo", "", "appleData", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "getAppleData", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SyncAppPayOrder {
        private final String appleData;
        private final String orderNo;
        private final String transactionId;

        public static /* synthetic */ SyncAppPayOrder copy$default(SyncAppPayOrder syncAppPayOrder, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncAppPayOrder.orderNo;
            }
            if ((i & 2) != 0) {
                str2 = syncAppPayOrder.appleData;
            }
            if ((i & 4) != 0) {
                str3 = syncAppPayOrder.transactionId;
            }
            return syncAppPayOrder.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAppleData() {
            return this.appleData;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        public final SyncAppPayOrder copy(String orderNo, String appleData, String transactionId) {
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            Intrinsics.checkNotNullParameter(appleData, "appleData");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new SyncAppPayOrder(orderNo, appleData, transactionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncAppPayOrder)) {
                return false;
            }
            SyncAppPayOrder syncAppPayOrder = (SyncAppPayOrder) other;
            return Intrinsics.areEqual(this.orderNo, syncAppPayOrder.orderNo) && Intrinsics.areEqual(this.appleData, syncAppPayOrder.appleData) && Intrinsics.areEqual(this.transactionId, syncAppPayOrder.transactionId);
        }

        public int hashCode() {
            return (((this.orderNo.hashCode() * 31) + this.appleData.hashCode()) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "SyncAppPayOrder(orderNo=" + this.orderNo + ", appleData=" + this.appleData + ", transactionId=" + this.transactionId + Separators.RPAREN;
        }

        public SyncAppPayOrder(String orderNo, String appleData, String transactionId) {
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            Intrinsics.checkNotNullParameter(appleData, "appleData");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.orderNo = orderNo;
            this.appleData = appleData;
            this.transactionId = transactionId;
        }

        public final String getOrderNo() {
            return this.orderNo;
        }

        public final String getAppleData() {
            return this.appleData;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SyncAppPayOrder(String orderNo) {
            this(orderNo, "", "");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$LikeBean;", "", "otherId", "", "type", "likeType", "<init>", "(III)V", "getOtherId", "()I", "getType", "getLikeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LikeBean {
        private final int likeType;
        private final int otherId;
        private final int type;

        public static /* synthetic */ LikeBean copy$default(LikeBean likeBean, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = likeBean.otherId;
            }
            if ((i4 & 2) != 0) {
                i2 = likeBean.type;
            }
            if ((i4 & 4) != 0) {
                i3 = likeBean.likeType;
            }
            return likeBean.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOtherId() {
            return this.otherId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLikeType() {
            return this.likeType;
        }

        public final LikeBean copy(int otherId, int type, int likeType) {
            return new LikeBean(otherId, type, likeType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LikeBean)) {
                return false;
            }
            LikeBean likeBean = (LikeBean) other;
            return this.otherId == likeBean.otherId && this.type == likeBean.type && this.likeType == likeBean.likeType;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.otherId) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.likeType);
        }

        public String toString() {
            return "LikeBean(otherId=" + this.otherId + ", type=" + this.type + ", likeType=" + this.likeType + Separators.RPAREN;
        }

        public LikeBean(int i, int i2, int i3) {
            this.otherId = i;
            this.type = i2;
            this.likeType = i3;
        }

        public final int getOtherId() {
            return this.otherId;
        }

        public final int getType() {
            return this.type;
        }

        public final int getLikeType() {
            return this.likeType;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ErrorPost;", "", "methodType", "", "reqUrl", "", "respParams", "clientVersion", "watchBluetoothName", "watchTypeCode", "braceletVersion", "appTime", "", "clientType", "userId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V", "getMethodType", "()I", "getReqUrl", "()Ljava/lang/String;", "getRespParams", "getClientVersion", "getWatchBluetoothName", "getWatchTypeCode", "getBraceletVersion", "getAppTime", "()J", "getClientType", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorPost {
        private final long appTime;
        private final String braceletVersion;
        private final int clientType;
        private final String clientVersion;
        private final int methodType;
        private final String reqUrl;
        private final String respParams;
        private final int userId;
        private final String watchBluetoothName;
        private final String watchTypeCode;

        public static /* synthetic */ ErrorPost copy$default(ErrorPost errorPost, int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = errorPost.methodType;
            }
            if ((i4 & 2) != 0) {
                str = errorPost.reqUrl;
            }
            if ((i4 & 4) != 0) {
                str2 = errorPost.respParams;
            }
            if ((i4 & 8) != 0) {
                str3 = errorPost.clientVersion;
            }
            if ((i4 & 16) != 0) {
                str4 = errorPost.watchBluetoothName;
            }
            if ((i4 & 32) != 0) {
                str5 = errorPost.watchTypeCode;
            }
            if ((i4 & 64) != 0) {
                str6 = errorPost.braceletVersion;
            }
            if ((i4 & 128) != 0) {
                j = errorPost.appTime;
            }
            if ((i4 & 256) != 0) {
                i2 = errorPost.clientType;
            }
            if ((i4 & 512) != 0) {
                i3 = errorPost.userId;
            }
            long j2 = j;
            String str7 = str5;
            String str8 = str6;
            String str9 = str3;
            String str10 = str4;
            String str11 = str2;
            return errorPost.copy(i, str, str11, str9, str10, str7, str8, j2, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMethodType() {
            return this.methodType;
        }

        /* renamed from: component10, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReqUrl() {
            return this.reqUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRespParams() {
            return this.respParams;
        }

        /* renamed from: component4, reason: from getter */
        public final String getClientVersion() {
            return this.clientVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final String getWatchBluetoothName() {
            return this.watchBluetoothName;
        }

        /* renamed from: component6, reason: from getter */
        public final String getWatchTypeCode() {
            return this.watchTypeCode;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBraceletVersion() {
            return this.braceletVersion;
        }

        /* renamed from: component8, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component9, reason: from getter */
        public final int getClientType() {
            return this.clientType;
        }

        public final ErrorPost copy(int methodType, String reqUrl, String respParams, String clientVersion, String watchBluetoothName, String watchTypeCode, String braceletVersion, long appTime, int clientType, int userId) {
            Intrinsics.checkNotNullParameter(reqUrl, "reqUrl");
            Intrinsics.checkNotNullParameter(respParams, "respParams");
            Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
            Intrinsics.checkNotNullParameter(watchBluetoothName, "watchBluetoothName");
            Intrinsics.checkNotNullParameter(watchTypeCode, "watchTypeCode");
            Intrinsics.checkNotNullParameter(braceletVersion, "braceletVersion");
            return new ErrorPost(methodType, reqUrl, respParams, clientVersion, watchBluetoothName, watchTypeCode, braceletVersion, appTime, clientType, userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorPost)) {
                return false;
            }
            ErrorPost errorPost = (ErrorPost) other;
            return this.methodType == errorPost.methodType && Intrinsics.areEqual(this.reqUrl, errorPost.reqUrl) && Intrinsics.areEqual(this.respParams, errorPost.respParams) && Intrinsics.areEqual(this.clientVersion, errorPost.clientVersion) && Intrinsics.areEqual(this.watchBluetoothName, errorPost.watchBluetoothName) && Intrinsics.areEqual(this.watchTypeCode, errorPost.watchTypeCode) && Intrinsics.areEqual(this.braceletVersion, errorPost.braceletVersion) && this.appTime == errorPost.appTime && this.clientType == errorPost.clientType && this.userId == errorPost.userId;
        }

        public int hashCode() {
            return (((((((((((((((((Integer.hashCode(this.methodType) * 31) + this.reqUrl.hashCode()) * 31) + this.respParams.hashCode()) * 31) + this.clientVersion.hashCode()) * 31) + this.watchBluetoothName.hashCode()) * 31) + this.watchTypeCode.hashCode()) * 31) + this.braceletVersion.hashCode()) * 31) + Long.hashCode(this.appTime)) * 31) + Integer.hashCode(this.clientType)) * 31) + Integer.hashCode(this.userId);
        }

        public String toString() {
            return "ErrorPost(methodType=" + this.methodType + ", reqUrl=" + this.reqUrl + ", respParams=" + this.respParams + ", clientVersion=" + this.clientVersion + ", watchBluetoothName=" + this.watchBluetoothName + ", watchTypeCode=" + this.watchTypeCode + ", braceletVersion=" + this.braceletVersion + ", appTime=" + this.appTime + ", clientType=" + this.clientType + ", userId=" + this.userId + Separators.RPAREN;
        }

        public ErrorPost(int i, String reqUrl, String respParams, String clientVersion, String watchBluetoothName, String watchTypeCode, String braceletVersion, long j, int i2, int i3) {
            Intrinsics.checkNotNullParameter(reqUrl, "reqUrl");
            Intrinsics.checkNotNullParameter(respParams, "respParams");
            Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
            Intrinsics.checkNotNullParameter(watchBluetoothName, "watchBluetoothName");
            Intrinsics.checkNotNullParameter(watchTypeCode, "watchTypeCode");
            Intrinsics.checkNotNullParameter(braceletVersion, "braceletVersion");
            this.methodType = i;
            this.reqUrl = reqUrl;
            this.respParams = respParams;
            this.clientVersion = clientVersion;
            this.watchBluetoothName = watchBluetoothName;
            this.watchTypeCode = watchTypeCode;
            this.braceletVersion = braceletVersion;
            this.appTime = j;
            this.clientType = i2;
            this.userId = i3;
        }

        public /* synthetic */ ErrorPost(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, str4, str5, str6, j, (i4 & 256) != 0 ? 1 : i2, (i4 & 512) != 0 ? 0 : i3);
        }

        public final int getMethodType() {
            return this.methodType;
        }

        public final String getReqUrl() {
            return this.reqUrl;
        }

        public final String getRespParams() {
            return this.respParams;
        }

        public final String getClientVersion() {
            return this.clientVersion;
        }

        public final String getWatchBluetoothName() {
            return this.watchBluetoothName;
        }

        public final String getWatchTypeCode() {
            return this.watchTypeCode;
        }

        public final String getBraceletVersion() {
            return this.braceletVersion;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final int getClientType() {
            return this.clientType;
        }

        public final int getUserId() {
            return this.userId;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UserAdd;", "", "id", "", "createTime", "", "system", "areaType", "<init>", "(IJII)V", "getId", "()I", "getCreateTime", "()J", "getSystem", "getAreaType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserAdd {
        private final int areaType;
        private final long createTime;
        private final int id;
        private final int system;

        public static /* synthetic */ UserAdd copy$default(UserAdd userAdd, int i, long j, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = userAdd.id;
            }
            if ((i4 & 2) != 0) {
                j = userAdd.createTime;
            }
            if ((i4 & 4) != 0) {
                i2 = userAdd.system;
            }
            if ((i4 & 8) != 0) {
                i3 = userAdd.areaType;
            }
            return userAdd.copy(i, j, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSystem() {
            return this.system;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAreaType() {
            return this.areaType;
        }

        public final UserAdd copy(int id2, long createTime, int system, int areaType) {
            return new UserAdd(id2, createTime, system, areaType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserAdd)) {
                return false;
            }
            UserAdd userAdd = (UserAdd) other;
            return this.id == userAdd.id && this.createTime == userAdd.createTime && this.system == userAdd.system && this.areaType == userAdd.areaType;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.system)) * 31) + Integer.hashCode(this.areaType);
        }

        public String toString() {
            return "UserAdd(id=" + this.id + ", createTime=" + this.createTime + ", system=" + this.system + ", areaType=" + this.areaType + Separators.RPAREN;
        }

        public UserAdd(int i, long j, int i2, int i3) {
            this.id = i;
            this.createTime = j;
            this.system = i2;
            this.areaType = i3;
        }

        public final int getId() {
            return this.id;
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        public final int getSystem() {
            return this.system;
        }

        public final int getAreaType() {
            return this.areaType;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UpdateSiche;", "", "code", "", "version", "bluetoothName", "mac", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", MobileAdsBridge.versionMethodName, "getBluetoothName", "getMac", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateSiche {
        private final String bluetoothName;
        private final String code;
        private final String mac;
        private final String version;

        public static /* synthetic */ UpdateSiche copy$default(UpdateSiche updateSiche, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateSiche.code;
            }
            if ((i & 2) != 0) {
                str2 = updateSiche.version;
            }
            if ((i & 4) != 0) {
                str3 = updateSiche.bluetoothName;
            }
            if ((i & 8) != 0) {
                str4 = updateSiche.mac;
            }
            return updateSiche.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        public final UpdateSiche copy(String code, String version, String bluetoothName, String mac) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
            Intrinsics.checkNotNullParameter(mac, "mac");
            return new UpdateSiche(code, version, bluetoothName, mac);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateSiche)) {
                return false;
            }
            UpdateSiche updateSiche = (UpdateSiche) other;
            return Intrinsics.areEqual(this.code, updateSiche.code) && Intrinsics.areEqual(this.version, updateSiche.version) && Intrinsics.areEqual(this.bluetoothName, updateSiche.bluetoothName) && Intrinsics.areEqual(this.mac, updateSiche.mac);
        }

        public int hashCode() {
            return (((((this.code.hashCode() * 31) + this.version.hashCode()) * 31) + this.bluetoothName.hashCode()) * 31) + this.mac.hashCode();
        }

        public String toString() {
            return "UpdateSiche(code=" + this.code + ", version=" + this.version + ", bluetoothName=" + this.bluetoothName + ", mac=" + this.mac + Separators.RPAREN;
        }

        public UpdateSiche(String code, String version, String bluetoothName, String mac) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
            Intrinsics.checkNotNullParameter(mac, "mac");
            this.code = code;
            this.version = version;
            this.bluetoothName = bluetoothName;
            this.mac = mac;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getBluetoothName() {
            return this.bluetoothName;
        }

        public final String getMac() {
            return this.mac;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$MenstrualQuery;", "", "lastDate", "", "intervals", "", "len", "<init>", "(JII)V", "getLastDate", "()J", "getIntervals", "()I", "getLen", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MenstrualQuery {
        private final int intervals;
        private final long lastDate;
        private final int len;

        public static /* synthetic */ MenstrualQuery copy$default(MenstrualQuery menstrualQuery, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = menstrualQuery.lastDate;
            }
            if ((i3 & 2) != 0) {
                i = menstrualQuery.intervals;
            }
            if ((i3 & 4) != 0) {
                i2 = menstrualQuery.len;
            }
            return menstrualQuery.copy(j, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLastDate() {
            return this.lastDate;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIntervals() {
            return this.intervals;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        public final MenstrualQuery copy(long lastDate, int intervals, int len) {
            return new MenstrualQuery(lastDate, intervals, len);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenstrualQuery)) {
                return false;
            }
            MenstrualQuery menstrualQuery = (MenstrualQuery) other;
            return this.lastDate == menstrualQuery.lastDate && this.intervals == menstrualQuery.intervals && this.len == menstrualQuery.len;
        }

        public int hashCode() {
            return (((Long.hashCode(this.lastDate) * 31) + Integer.hashCode(this.intervals)) * 31) + Integer.hashCode(this.len);
        }

        public String toString() {
            return "MenstrualQuery(lastDate=" + this.lastDate + ", intervals=" + this.intervals + ", len=" + this.len + Separators.RPAREN;
        }

        public MenstrualQuery(long j, int i, int i2) {
            this.lastDate = j;
            this.intervals = i;
            this.len = i2;
        }

        public final long getLastDate() {
            return this.lastDate;
        }

        public final int getIntervals() {
            return this.intervals;
        }

        public final int getLen() {
            return this.len;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J~\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001a¨\u0006B"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$RecentlyRealtime;", "", "appTime", "", HdContent.LINK, "", "diastolic", "glucose", "", "heartbeat", "oxygen", HdScenes.SLEEP, "stress", "systolic", "intensity", "glucoseType", "<init>", "(Ljava/lang/Long;IIDIIIIIII)V", "getAppTime", "()Ljava/lang/Long;", "setAppTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getBreathe", "()I", "setBreathe", "(I)V", "getDiastolic", "setDiastolic", "getGlucose", "()D", "setGlucose", "(D)V", "getHeartbeat", "setHeartbeat", "getOxygen", "setOxygen", "getSleep", "setSleep", "getStress", "setStress", "getSystolic", "setSystolic", "getIntensity", "setIntensity", "getGlucoseType", "setGlucoseType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Long;IIDIIIIIII)Lcom/wakeup/common/network/entity/BasicRequest$RecentlyRealtime;", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentlyRealtime {
        private Long appTime;
        private int breathe;
        private int diastolic;
        private double glucose;
        private int glucoseType;
        private int heartbeat;
        private int intensity;
        private int oxygen;
        private int sleep;
        private int stress;
        private int systolic;

        public RecentlyRealtime() {
            this(null, 0, 0, 0.0d, 0, 0, 0, 0, 0, 0, 0, 2047, null);
        }

        public static /* synthetic */ RecentlyRealtime copy$default(RecentlyRealtime recentlyRealtime, Long l, int i, int i2, double d, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l = recentlyRealtime.appTime;
            }
            if ((i10 & 2) != 0) {
                i = recentlyRealtime.breathe;
            }
            if ((i10 & 4) != 0) {
                i2 = recentlyRealtime.diastolic;
            }
            if ((i10 & 8) != 0) {
                d = recentlyRealtime.glucose;
            }
            if ((i10 & 16) != 0) {
                i3 = recentlyRealtime.heartbeat;
            }
            if ((i10 & 32) != 0) {
                i4 = recentlyRealtime.oxygen;
            }
            if ((i10 & 64) != 0) {
                i5 = recentlyRealtime.sleep;
            }
            if ((i10 & 128) != 0) {
                i6 = recentlyRealtime.stress;
            }
            if ((i10 & 256) != 0) {
                i7 = recentlyRealtime.systolic;
            }
            if ((i10 & 512) != 0) {
                i8 = recentlyRealtime.intensity;
            }
            if ((i10 & 1024) != 0) {
                i9 = recentlyRealtime.glucoseType;
            }
            int i11 = i8;
            int i12 = i9;
            int i13 = i7;
            int i14 = i5;
            int i15 = i3;
            double d2 = d;
            int i16 = i2;
            return recentlyRealtime.copy(l, i, i16, d2, i15, i4, i14, i6, i13, i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component10, reason: from getter */
        public final int getIntensity() {
            return this.intensity;
        }

        /* renamed from: component11, reason: from getter */
        public final int getGlucoseType() {
            return this.glucoseType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBreathe() {
            return this.breathe;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDiastolic() {
            return this.diastolic;
        }

        /* renamed from: component4, reason: from getter */
        public final double getGlucose() {
            return this.glucose;
        }

        /* renamed from: component5, reason: from getter */
        public final int getHeartbeat() {
            return this.heartbeat;
        }

        /* renamed from: component6, reason: from getter */
        public final int getOxygen() {
            return this.oxygen;
        }

        /* renamed from: component7, reason: from getter */
        public final int getSleep() {
            return this.sleep;
        }

        /* renamed from: component8, reason: from getter */
        public final int getStress() {
            return this.stress;
        }

        /* renamed from: component9, reason: from getter */
        public final int getSystolic() {
            return this.systolic;
        }

        public final RecentlyRealtime copy(Long appTime, int breathe, int diastolic, double glucose, int heartbeat, int oxygen, int sleep, int stress, int systolic, int intensity, int glucoseType) {
            return new RecentlyRealtime(appTime, breathe, diastolic, glucose, heartbeat, oxygen, sleep, stress, systolic, intensity, glucoseType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecentlyRealtime)) {
                return false;
            }
            RecentlyRealtime recentlyRealtime = (RecentlyRealtime) other;
            return Intrinsics.areEqual(this.appTime, recentlyRealtime.appTime) && this.breathe == recentlyRealtime.breathe && this.diastolic == recentlyRealtime.diastolic && Double.compare(this.glucose, recentlyRealtime.glucose) == 0 && this.heartbeat == recentlyRealtime.heartbeat && this.oxygen == recentlyRealtime.oxygen && this.sleep == recentlyRealtime.sleep && this.stress == recentlyRealtime.stress && this.systolic == recentlyRealtime.systolic && this.intensity == recentlyRealtime.intensity && this.glucoseType == recentlyRealtime.glucoseType;
        }

        public int hashCode() {
            Long l = this.appTime;
            return ((((((((((((((((((((l == null ? 0 : l.hashCode()) * 31) + Integer.hashCode(this.breathe)) * 31) + Integer.hashCode(this.diastolic)) * 31) + Double.hashCode(this.glucose)) * 31) + Integer.hashCode(this.heartbeat)) * 31) + Integer.hashCode(this.oxygen)) * 31) + Integer.hashCode(this.sleep)) * 31) + Integer.hashCode(this.stress)) * 31) + Integer.hashCode(this.systolic)) * 31) + Integer.hashCode(this.intensity)) * 31) + Integer.hashCode(this.glucoseType);
        }

        public String toString() {
            return "RecentlyRealtime(appTime=" + this.appTime + ", breathe=" + this.breathe + ", diastolic=" + this.diastolic + ", glucose=" + this.glucose + ", heartbeat=" + this.heartbeat + ", oxygen=" + this.oxygen + ", sleep=" + this.sleep + ", stress=" + this.stress + ", systolic=" + this.systolic + ", intensity=" + this.intensity + ", glucoseType=" + this.glucoseType + Separators.RPAREN;
        }

        public RecentlyRealtime(Long l, int i, int i2, double d, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.appTime = l;
            this.breathe = i;
            this.diastolic = i2;
            this.glucose = d;
            this.heartbeat = i3;
            this.oxygen = i4;
            this.sleep = i5;
            this.stress = i6;
            this.systolic = i7;
            this.intensity = i8;
            this.glucoseType = i9;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ RecentlyRealtime(java.lang.Long r2, int r3, int r4, double r5, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r1 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L5
                r2 = 0
            L5:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lb
                r3 = r0
            Lb:
                r15 = r14 & 4
                if (r15 == 0) goto L10
                r4 = r0
            L10:
                r15 = r14 & 8
                if (r15 == 0) goto L16
                r5 = 0
            L16:
                r15 = r14 & 16
                if (r15 == 0) goto L1b
                r7 = r0
            L1b:
                r15 = r14 & 32
                if (r15 == 0) goto L20
                r8 = r0
            L20:
                r15 = r14 & 64
                if (r15 == 0) goto L25
                r9 = r0
            L25:
                r15 = r14 & 128(0x80, float:1.8E-43)
                if (r15 == 0) goto L2a
                r10 = r0
            L2a:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L2f
                r11 = r0
            L2f:
                r15 = r14 & 512(0x200, float:7.17E-43)
                if (r15 == 0) goto L34
                r12 = r0
            L34:
                r14 = r14 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L40
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                goto L47
            L40:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r9 = r7
            L47:
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.BasicRequest.RecentlyRealtime.<init>(java.lang.Long, int, int, double, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(Long l) {
            this.appTime = l;
        }

        public final int getBreathe() {
            return this.breathe;
        }

        public final void setBreathe(int i) {
            this.breathe = i;
        }

        public final int getDiastolic() {
            return this.diastolic;
        }

        public final void setDiastolic(int i) {
            this.diastolic = i;
        }

        public final double getGlucose() {
            return this.glucose;
        }

        public final void setGlucose(double d) {
            this.glucose = d;
        }

        public final int getHeartbeat() {
            return this.heartbeat;
        }

        public final void setHeartbeat(int i) {
            this.heartbeat = i;
        }

        public final int getOxygen() {
            return this.oxygen;
        }

        public final void setOxygen(int i) {
            this.oxygen = i;
        }

        public final int getSleep() {
            return this.sleep;
        }

        public final void setSleep(int i) {
            this.sleep = i;
        }

        public final int getStress() {
            return this.stress;
        }

        public final void setStress(int i) {
            this.stress = i;
        }

        public final int getSystolic() {
            return this.systolic;
        }

        public final void setSystolic(int i) {
            this.systolic = i;
        }

        public final int getIntensity() {
            return this.intensity;
        }

        public final void setIntensity(int i) {
            this.intensity = i;
        }

        public final int getGlucoseType() {
            return this.glucoseType;
        }

        public final void setGlucoseType(int i) {
            this.glucoseType = i;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$UserComponent;", "", "operateType", "", "componentIds", "", "", "<init>", "(ILjava/util/List;)V", "getOperateType", "()I", "setOperateType", "(I)V", "getComponentIds", "()Ljava/util/List;", "setComponentIds", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserComponent {
        private List<String> componentIds;
        private int operateType;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserComponent copy$default(UserComponent userComponent, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = userComponent.operateType;
            }
            if ((i2 & 2) != 0) {
                list = userComponent.componentIds;
            }
            return userComponent.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOperateType() {
            return this.operateType;
        }

        public final List<String> component2() {
            return this.componentIds;
        }

        public final UserComponent copy(int operateType, List<String> componentIds) {
            Intrinsics.checkNotNullParameter(componentIds, "componentIds");
            return new UserComponent(operateType, componentIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserComponent)) {
                return false;
            }
            UserComponent userComponent = (UserComponent) other;
            return this.operateType == userComponent.operateType && Intrinsics.areEqual(this.componentIds, userComponent.componentIds);
        }

        public int hashCode() {
            return (Integer.hashCode(this.operateType) * 31) + this.componentIds.hashCode();
        }

        public String toString() {
            return "UserComponent(operateType=" + this.operateType + ", componentIds=" + this.componentIds + Separators.RPAREN;
        }

        public UserComponent(int i, List<String> componentIds) {
            Intrinsics.checkNotNullParameter(componentIds, "componentIds");
            this.operateType = i;
            this.componentIds = componentIds;
        }

        public final int getOperateType() {
            return this.operateType;
        }

        public final void setOperateType(int i) {
            this.operateType = i;
        }

        public final List<String> getComponentIds() {
            return this.componentIds;
        }

        public final void setComponentIds(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.componentIds = list;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "", "productId", "", "features", "", "<init>", "(ILjava/util/List;)V", "getProductId", "()I", "setProductId", "(I)V", "getFeatures", "()Ljava/util/List;", "setFeatures", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomePageParam {
        private List<Integer> features;
        private int productId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HomePageParam copy$default(HomePageParam homePageParam, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = homePageParam.productId;
            }
            if ((i2 & 2) != 0) {
                list = homePageParam.features;
            }
            return homePageParam.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProductId() {
            return this.productId;
        }

        public final List<Integer> component2() {
            return this.features;
        }

        public final HomePageParam copy(int productId, List<Integer> features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new HomePageParam(productId, features);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomePageParam)) {
                return false;
            }
            HomePageParam homePageParam = (HomePageParam) other;
            return this.productId == homePageParam.productId && Intrinsics.areEqual(this.features, homePageParam.features);
        }

        public int hashCode() {
            return (Integer.hashCode(this.productId) * 31) + this.features.hashCode();
        }

        public String toString() {
            return "HomePageParam(productId=" + this.productId + ", features=" + this.features + Separators.RPAREN;
        }

        public HomePageParam(int i, List<Integer> features) {
            Intrinsics.checkNotNullParameter(features, "features");
            this.productId = i;
            this.features = features;
        }

        public final int getProductId() {
            return this.productId;
        }

        public final void setProductId(int i) {
            this.productId = i;
        }

        public final List<Integer> getFeatures() {
            return this.features;
        }

        public final void setFeatures(List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.features = list;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$HomePageRequestParam;", "", "requestParam", "", "Lcom/wakeup/common/network/entity/BasicRequest$HomePageParam;", "<init>", "(Ljava/util/List;)V", "getRequestParam", "()Ljava/util/List;", "setRequestParam", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomePageRequestParam {
        private List<HomePageParam> requestParam;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HomePageRequestParam copy$default(HomePageRequestParam homePageRequestParam, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = homePageRequestParam.requestParam;
            }
            return homePageRequestParam.copy(list);
        }

        public final List<HomePageParam> component1() {
            return this.requestParam;
        }

        public final HomePageRequestParam copy(List<HomePageParam> requestParam) {
            Intrinsics.checkNotNullParameter(requestParam, "requestParam");
            return new HomePageRequestParam(requestParam);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HomePageRequestParam) && Intrinsics.areEqual(this.requestParam, ((HomePageRequestParam) other).requestParam);
        }

        public int hashCode() {
            return this.requestParam.hashCode();
        }

        public String toString() {
            return "HomePageRequestParam(requestParam=" + this.requestParam + Separators.RPAREN;
        }

        public HomePageRequestParam(List<HomePageParam> requestParam) {
            Intrinsics.checkNotNullParameter(requestParam, "requestParam");
            this.requestParam = requestParam;
        }

        public final List<HomePageParam> getRequestParam() {
            return this.requestParam;
        }

        public final void setRequestParam(List<HomePageParam> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.requestParam = list;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u001e\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u001e\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010¨\u0006D"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$ScanCodeLongin;", "", "status", "", "qrcode", "", "<init>", "(ILjava/lang/String;)V", "getStatus", "()I", "getQrcode", "()Ljava/lang/String;", HdScenes.SLEEP, "getSleep", "()Ljava/lang/Integer;", "setSleep", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "oxygen", "getOxygen", "setOxygen", "appTime", "", "getAppTime", "()Ljava/lang/Long;", "setAppTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", HdContent.LINK, "getBreathe", "setBreathe", "locale", "getLocale", "setLocale", "(Ljava/lang/String;)V", "heartbeat", "getHeartbeat", "setHeartbeat", "systolic", "getSystolic", "setSystolic", "diastolic", "getDiastolic", "setDiastolic", "glucoseType", "getGlucoseType", "setGlucoseType", "stress", "getStress", "setStress", "glucose", "", "getGlucose", "()Ljava/lang/Double;", "setGlucose", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "intensity", "getIntensity", "setIntensity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScanCodeLongin {
        private Long appTime;
        private Integer breathe;
        private Integer diastolic;
        private Double glucose;
        private Integer glucoseType;
        private Integer heartbeat;
        private Integer intensity;
        private String locale;
        private Integer oxygen;
        private final String qrcode;
        private Integer sleep;
        private final int status;
        private Integer stress;
        private Integer systolic;

        public static /* synthetic */ ScanCodeLongin copy$default(ScanCodeLongin scanCodeLongin, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = scanCodeLongin.status;
            }
            if ((i2 & 2) != 0) {
                str = scanCodeLongin.qrcode;
            }
            return scanCodeLongin.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final String getQrcode() {
            return this.qrcode;
        }

        public final ScanCodeLongin copy(int status, String qrcode) {
            return new ScanCodeLongin(status, qrcode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScanCodeLongin)) {
                return false;
            }
            ScanCodeLongin scanCodeLongin = (ScanCodeLongin) other;
            return this.status == scanCodeLongin.status && Intrinsics.areEqual(this.qrcode, scanCodeLongin.qrcode);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.status) * 31;
            String str = this.qrcode;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ScanCodeLongin(status=" + this.status + ", qrcode=" + this.qrcode + Separators.RPAREN;
        }

        public ScanCodeLongin(int i, String str) {
            this.status = i;
            this.qrcode = str;
        }

        public final int getStatus() {
            return this.status;
        }

        public final String getQrcode() {
            return this.qrcode;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final void setSleep(Integer num) {
            this.sleep = num;
        }

        public final Integer getOxygen() {
            return this.oxygen;
        }

        public final void setOxygen(Integer num) {
            this.oxygen = num;
        }

        public final Long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(Long l) {
            this.appTime = l;
        }

        public final Integer getBreathe() {
            return this.breathe;
        }

        public final void setBreathe(Integer num) {
            this.breathe = num;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final Integer getHeartbeat() {
            return this.heartbeat;
        }

        public final void setHeartbeat(Integer num) {
            this.heartbeat = num;
        }

        public final Integer getSystolic() {
            return this.systolic;
        }

        public final void setSystolic(Integer num) {
            this.systolic = num;
        }

        public final Integer getDiastolic() {
            return this.diastolic;
        }

        public final void setDiastolic(Integer num) {
            this.diastolic = num;
        }

        public final Integer getGlucoseType() {
            return this.glucoseType;
        }

        public final void setGlucoseType(Integer num) {
            this.glucoseType = num;
        }

        public final Integer getStress() {
            return this.stress;
        }

        public final void setStress(Integer num) {
            this.stress = num;
        }

        public final Double getGlucose() {
            return this.glucose;
        }

        public final void setGlucose(Double d) {
            this.glucose = d;
        }

        public final Integer getIntensity() {
            return this.intensity;
        }

        public final void setIntensity(Integer num) {
            this.intensity = num;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$DeviceFunctionComponent;", "", "code", "", "mac", "", "functionIdStr", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getFunctionIdStr", "setFunctionIdStr", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/BasicRequest$DeviceFunctionComponent;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceFunctionComponent {
        private Integer code;
        private String functionIdStr;
        private String mac;

        public DeviceFunctionComponent() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ DeviceFunctionComponent copy$default(DeviceFunctionComponent deviceFunctionComponent, Integer num, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = deviceFunctionComponent.code;
            }
            if ((i & 2) != 0) {
                str = deviceFunctionComponent.mac;
            }
            if ((i & 4) != 0) {
                str2 = deviceFunctionComponent.functionIdStr;
            }
            return deviceFunctionComponent.copy(num, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFunctionIdStr() {
            return this.functionIdStr;
        }

        public final DeviceFunctionComponent copy(Integer code, String mac, String functionIdStr) {
            return new DeviceFunctionComponent(code, mac, functionIdStr);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceFunctionComponent)) {
                return false;
            }
            DeviceFunctionComponent deviceFunctionComponent = (DeviceFunctionComponent) other;
            return Intrinsics.areEqual(this.code, deviceFunctionComponent.code) && Intrinsics.areEqual(this.mac, deviceFunctionComponent.mac) && Intrinsics.areEqual(this.functionIdStr, deviceFunctionComponent.functionIdStr);
        }

        public int hashCode() {
            Integer num = this.code;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.mac;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.functionIdStr;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "DeviceFunctionComponent(code=" + this.code + ", mac=" + this.mac + ", functionIdStr=" + this.functionIdStr + Separators.RPAREN;
        }

        public DeviceFunctionComponent(Integer num, String str, String str2) {
            this.code = num;
            this.mac = str;
            this.functionIdStr = str2;
        }

        public /* synthetic */ DeviceFunctionComponent(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final void setCode(Integer num) {
            this.code = num;
        }

        public final String getMac() {
            return this.mac;
        }

        public final void setMac(String str) {
            this.mac = str;
        }

        public final String getFunctionIdStr() {
            return this.functionIdStr;
        }

        public final void setFunctionIdStr(String str) {
            this.functionIdStr = str;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$LicenseRequestBody;", "", "platform", "", "encryptedInfo", "", "<init>", "(ILjava/lang/String;)V", "getPlatform", "()I", "getEncryptedInfo", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LicenseRequestBody {
        private final String encryptedInfo;
        private final int platform;

        public static /* synthetic */ LicenseRequestBody copy$default(LicenseRequestBody licenseRequestBody, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = licenseRequestBody.platform;
            }
            if ((i2 & 2) != 0) {
                str = licenseRequestBody.encryptedInfo;
            }
            return licenseRequestBody.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEncryptedInfo() {
            return this.encryptedInfo;
        }

        public final LicenseRequestBody copy(int platform, String encryptedInfo) {
            Intrinsics.checkNotNullParameter(encryptedInfo, "encryptedInfo");
            return new LicenseRequestBody(platform, encryptedInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LicenseRequestBody)) {
                return false;
            }
            LicenseRequestBody licenseRequestBody = (LicenseRequestBody) other;
            return this.platform == licenseRequestBody.platform && Intrinsics.areEqual(this.encryptedInfo, licenseRequestBody.encryptedInfo);
        }

        public int hashCode() {
            return (Integer.hashCode(this.platform) * 31) + this.encryptedInfo.hashCode();
        }

        public String toString() {
            return "LicenseRequestBody(platform=" + this.platform + ", encryptedInfo=" + this.encryptedInfo + Separators.RPAREN;
        }

        public LicenseRequestBody(int i, String encryptedInfo) {
            Intrinsics.checkNotNullParameter(encryptedInfo, "encryptedInfo");
            this.platform = i;
            this.encryptedInfo = encryptedInfo;
        }

        public final int getPlatform() {
            return this.platform;
        }

        public final String getEncryptedInfo() {
            return this.encryptedInfo;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$TimbreListRequestBody;", "", "appLanguageCode", "", "deviceCode", "deviceSnCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppLanguageCode", "()Ljava/lang/String;", "getDeviceCode", "getDeviceSnCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimbreListRequestBody {
        private final String appLanguageCode;
        private final String deviceCode;
        private final String deviceSnCode;

        public static /* synthetic */ TimbreListRequestBody copy$default(TimbreListRequestBody timbreListRequestBody, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timbreListRequestBody.appLanguageCode;
            }
            if ((i & 2) != 0) {
                str2 = timbreListRequestBody.deviceCode;
            }
            if ((i & 4) != 0) {
                str3 = timbreListRequestBody.deviceSnCode;
            }
            return timbreListRequestBody.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppLanguageCode() {
            return this.appLanguageCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeviceCode() {
            return this.deviceCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeviceSnCode() {
            return this.deviceSnCode;
        }

        public final TimbreListRequestBody copy(String appLanguageCode, String deviceCode, String deviceSnCode) {
            Intrinsics.checkNotNullParameter(appLanguageCode, "appLanguageCode");
            Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
            Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
            return new TimbreListRequestBody(appLanguageCode, deviceCode, deviceSnCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimbreListRequestBody)) {
                return false;
            }
            TimbreListRequestBody timbreListRequestBody = (TimbreListRequestBody) other;
            return Intrinsics.areEqual(this.appLanguageCode, timbreListRequestBody.appLanguageCode) && Intrinsics.areEqual(this.deviceCode, timbreListRequestBody.deviceCode) && Intrinsics.areEqual(this.deviceSnCode, timbreListRequestBody.deviceSnCode);
        }

        public int hashCode() {
            return (((this.appLanguageCode.hashCode() * 31) + this.deviceCode.hashCode()) * 31) + this.deviceSnCode.hashCode();
        }

        public String toString() {
            return "TimbreListRequestBody(appLanguageCode=" + this.appLanguageCode + ", deviceCode=" + this.deviceCode + ", deviceSnCode=" + this.deviceSnCode + Separators.RPAREN;
        }

        public TimbreListRequestBody(String appLanguageCode, String deviceCode, String deviceSnCode) {
            Intrinsics.checkNotNullParameter(appLanguageCode, "appLanguageCode");
            Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
            Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
            this.appLanguageCode = appLanguageCode;
            this.deviceCode = deviceCode;
            this.deviceSnCode = deviceSnCode;
        }

        public final String getAppLanguageCode() {
            return this.appLanguageCode;
        }

        public final String getDeviceCode() {
            return this.deviceCode;
        }

        public final String getDeviceSnCode() {
            return this.deviceSnCode;
        }
    }

    /* compiled from: BasicRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicRequest$SetTimbreRequestBody;", "", "languageId", "", "ttsVoiceCode", "", "deviceCode", "deviceSnCode", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLanguageId", "()I", "getTtsVoiceCode", "()Ljava/lang/String;", "getDeviceCode", "getDeviceSnCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetTimbreRequestBody {
        private final String deviceCode;
        private final String deviceSnCode;
        private final int languageId;
        private final String ttsVoiceCode;

        public static /* synthetic */ SetTimbreRequestBody copy$default(SetTimbreRequestBody setTimbreRequestBody, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setTimbreRequestBody.languageId;
            }
            if ((i2 & 2) != 0) {
                str = setTimbreRequestBody.ttsVoiceCode;
            }
            if ((i2 & 4) != 0) {
                str2 = setTimbreRequestBody.deviceCode;
            }
            if ((i2 & 8) != 0) {
                str3 = setTimbreRequestBody.deviceSnCode;
            }
            return setTimbreRequestBody.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLanguageId() {
            return this.languageId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeviceCode() {
            return this.deviceCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeviceSnCode() {
            return this.deviceSnCode;
        }

        public final SetTimbreRequestBody copy(int languageId, String ttsVoiceCode, String deviceCode, String deviceSnCode) {
            Intrinsics.checkNotNullParameter(ttsVoiceCode, "ttsVoiceCode");
            Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
            Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
            return new SetTimbreRequestBody(languageId, ttsVoiceCode, deviceCode, deviceSnCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetTimbreRequestBody)) {
                return false;
            }
            SetTimbreRequestBody setTimbreRequestBody = (SetTimbreRequestBody) other;
            return this.languageId == setTimbreRequestBody.languageId && Intrinsics.areEqual(this.ttsVoiceCode, setTimbreRequestBody.ttsVoiceCode) && Intrinsics.areEqual(this.deviceCode, setTimbreRequestBody.deviceCode) && Intrinsics.areEqual(this.deviceSnCode, setTimbreRequestBody.deviceSnCode);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.languageId) * 31) + this.ttsVoiceCode.hashCode()) * 31) + this.deviceCode.hashCode()) * 31) + this.deviceSnCode.hashCode();
        }

        public String toString() {
            return "SetTimbreRequestBody(languageId=" + this.languageId + ", ttsVoiceCode=" + this.ttsVoiceCode + ", deviceCode=" + this.deviceCode + ", deviceSnCode=" + this.deviceSnCode + Separators.RPAREN;
        }

        public SetTimbreRequestBody(int i, String ttsVoiceCode, String deviceCode, String deviceSnCode) {
            Intrinsics.checkNotNullParameter(ttsVoiceCode, "ttsVoiceCode");
            Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
            Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
            this.languageId = i;
            this.ttsVoiceCode = ttsVoiceCode;
            this.deviceCode = deviceCode;
            this.deviceSnCode = deviceSnCode;
        }

        public final int getLanguageId() {
            return this.languageId;
        }

        public final String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        public final String getDeviceCode() {
            return this.deviceCode;
        }

        public final String getDeviceSnCode() {
            return this.deviceSnCode;
        }
    }
}
