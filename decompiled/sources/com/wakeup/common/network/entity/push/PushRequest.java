package com.wakeup.common.network.entity.push;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/wakeup/common/network/entity/push/PushRequest;", "", "<init>", "()V", "PushRegister", "PushRegisterWithVersionAndLanguage", "PushReadCallback", "PushGetMessageList", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PushRequest {
    public static final PushRequest INSTANCE = new PushRequest();

    private PushRequest() {
    }

    /* compiled from: PushRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/push/PushRequest$PushRegister;", "", "deviceType", "", "regId", "", "userId", "deviceSn", "deviceInfo", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceType", "()I", "setDeviceType", "(I)V", "getRegId", "()Ljava/lang/String;", "setRegId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getDeviceSn", "setDeviceSn", "getDeviceInfo", "setDeviceInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushRegister {
        private String deviceInfo;
        private String deviceSn;
        private int deviceType;
        private String regId;
        private String userId;

        public static /* synthetic */ PushRegister copy$default(PushRegister pushRegister, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pushRegister.deviceType;
            }
            if ((i2 & 2) != 0) {
                str = pushRegister.regId;
            }
            if ((i2 & 4) != 0) {
                str2 = pushRegister.userId;
            }
            if ((i2 & 8) != 0) {
                str3 = pushRegister.deviceSn;
            }
            if ((i2 & 16) != 0) {
                str4 = pushRegister.deviceInfo;
            }
            String str5 = str4;
            String str6 = str2;
            return pushRegister.copy(i, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegId() {
            return this.regId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeviceSn() {
            return this.deviceSn;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        public final PushRegister copy(int deviceType, String regId, String userId, String deviceSn, String deviceInfo) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            return new PushRegister(deviceType, regId, userId, deviceSn, deviceInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushRegister)) {
                return false;
            }
            PushRegister pushRegister = (PushRegister) other;
            return this.deviceType == pushRegister.deviceType && Intrinsics.areEqual(this.regId, pushRegister.regId) && Intrinsics.areEqual(this.userId, pushRegister.userId) && Intrinsics.areEqual(this.deviceSn, pushRegister.deviceSn) && Intrinsics.areEqual(this.deviceInfo, pushRegister.deviceInfo);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.deviceType) * 31) + this.regId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceInfo.hashCode();
        }

        public String toString() {
            return "PushRegister(deviceType=" + this.deviceType + ", regId=" + this.regId + ", userId=" + this.userId + ", deviceSn=" + this.deviceSn + ", deviceInfo=" + this.deviceInfo + Separators.RPAREN;
        }

        public PushRegister(int i, String regId, String userId, String deviceSn, String deviceInfo) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            this.deviceType = i;
            this.regId = regId;
            this.userId = userId;
            this.deviceSn = deviceSn;
            this.deviceInfo = deviceInfo;
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        public final void setDeviceType(int i) {
            this.deviceType = i;
        }

        public final String getRegId() {
            return this.regId;
        }

        public final void setRegId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.regId = str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setUserId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }

        public final String getDeviceSn() {
            return this.deviceSn;
        }

        public final void setDeviceSn(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceSn = str;
        }

        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        public final void setDeviceInfo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceInfo = str;
        }
    }

    /* compiled from: PushRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006,"}, d2 = {"Lcom/wakeup/common/network/entity/push/PushRequest$PushRegisterWithVersionAndLanguage;", "", "deviceType", "", "regId", "", "userId", "deviceSn", "deviceInfo", "language", "softVersion", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceType", "()I", "setDeviceType", "(I)V", "getRegId", "()Ljava/lang/String;", "setRegId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getDeviceSn", "setDeviceSn", "getDeviceInfo", "setDeviceInfo", "getLanguage", "setLanguage", "getSoftVersion", "setSoftVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushRegisterWithVersionAndLanguage {
        private String deviceInfo;
        private String deviceSn;
        private int deviceType;
        private String language;
        private String regId;
        private String softVersion;
        private String userId;

        public static /* synthetic */ PushRegisterWithVersionAndLanguage copy$default(PushRegisterWithVersionAndLanguage pushRegisterWithVersionAndLanguage, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pushRegisterWithVersionAndLanguage.deviceType;
            }
            if ((i2 & 2) != 0) {
                str = pushRegisterWithVersionAndLanguage.regId;
            }
            if ((i2 & 4) != 0) {
                str2 = pushRegisterWithVersionAndLanguage.userId;
            }
            if ((i2 & 8) != 0) {
                str3 = pushRegisterWithVersionAndLanguage.deviceSn;
            }
            if ((i2 & 16) != 0) {
                str4 = pushRegisterWithVersionAndLanguage.deviceInfo;
            }
            if ((i2 & 32) != 0) {
                str5 = pushRegisterWithVersionAndLanguage.language;
            }
            if ((i2 & 64) != 0) {
                str6 = pushRegisterWithVersionAndLanguage.softVersion;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str2;
            return pushRegisterWithVersionAndLanguage.copy(i, str, str10, str3, str9, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegId() {
            return this.regId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeviceSn() {
            return this.deviceSn;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSoftVersion() {
            return this.softVersion;
        }

        public final PushRegisterWithVersionAndLanguage copy(int deviceType, String regId, String userId, String deviceSn, String deviceInfo, String language, String softVersion) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            return new PushRegisterWithVersionAndLanguage(deviceType, regId, userId, deviceSn, deviceInfo, language, softVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushRegisterWithVersionAndLanguage)) {
                return false;
            }
            PushRegisterWithVersionAndLanguage pushRegisterWithVersionAndLanguage = (PushRegisterWithVersionAndLanguage) other;
            return this.deviceType == pushRegisterWithVersionAndLanguage.deviceType && Intrinsics.areEqual(this.regId, pushRegisterWithVersionAndLanguage.regId) && Intrinsics.areEqual(this.userId, pushRegisterWithVersionAndLanguage.userId) && Intrinsics.areEqual(this.deviceSn, pushRegisterWithVersionAndLanguage.deviceSn) && Intrinsics.areEqual(this.deviceInfo, pushRegisterWithVersionAndLanguage.deviceInfo) && Intrinsics.areEqual(this.language, pushRegisterWithVersionAndLanguage.language) && Intrinsics.areEqual(this.softVersion, pushRegisterWithVersionAndLanguage.softVersion);
        }

        public int hashCode() {
            int hashCode = ((((((((Integer.hashCode(this.deviceType) * 31) + this.regId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31;
            String str = this.language;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.softVersion;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "PushRegisterWithVersionAndLanguage(deviceType=" + this.deviceType + ", regId=" + this.regId + ", userId=" + this.userId + ", deviceSn=" + this.deviceSn + ", deviceInfo=" + this.deviceInfo + ", language=" + this.language + ", softVersion=" + this.softVersion + Separators.RPAREN;
        }

        public PushRegisterWithVersionAndLanguage(int i, String regId, String userId, String deviceSn, String deviceInfo, String str, String str2) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            this.deviceType = i;
            this.regId = regId;
            this.userId = userId;
            this.deviceSn = deviceSn;
            this.deviceInfo = deviceInfo;
            this.language = str;
            this.softVersion = str2;
        }

        public /* synthetic */ PushRegisterWithVersionAndLanguage(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6);
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        public final void setDeviceType(int i) {
            this.deviceType = i;
        }

        public final String getRegId() {
            return this.regId;
        }

        public final void setRegId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.regId = str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setUserId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }

        public final String getDeviceSn() {
            return this.deviceSn;
        }

        public final void setDeviceSn(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceSn = str;
        }

        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        public final void setDeviceInfo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceInfo = str;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final String getSoftVersion() {
            return this.softVersion;
        }

        public final void setSoftVersion(String str) {
            this.softVersion = str;
        }
    }

    /* compiled from: PushRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/push/PushRequest$PushReadCallback;", "", "deviceType", "", "regId", "", "userId", RemoteMessageConst.MSGID, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceType", "()I", "setDeviceType", "(I)V", "getRegId", "()Ljava/lang/String;", "setRegId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getMsgId", "setMsgId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushReadCallback {
        private int deviceType;
        private String msgId;
        private String regId;
        private String userId;

        public static /* synthetic */ PushReadCallback copy$default(PushReadCallback pushReadCallback, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pushReadCallback.deviceType;
            }
            if ((i2 & 2) != 0) {
                str = pushReadCallback.regId;
            }
            if ((i2 & 4) != 0) {
                str2 = pushReadCallback.userId;
            }
            if ((i2 & 8) != 0) {
                str3 = pushReadCallback.msgId;
            }
            return pushReadCallback.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegId() {
            return this.regId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMsgId() {
            return this.msgId;
        }

        public final PushReadCallback copy(int deviceType, String regId, String userId, String msgId) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new PushReadCallback(deviceType, regId, userId, msgId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushReadCallback)) {
                return false;
            }
            PushReadCallback pushReadCallback = (PushReadCallback) other;
            return this.deviceType == pushReadCallback.deviceType && Intrinsics.areEqual(this.regId, pushReadCallback.regId) && Intrinsics.areEqual(this.userId, pushReadCallback.userId) && Intrinsics.areEqual(this.msgId, pushReadCallback.msgId);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.deviceType) * 31) + this.regId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.msgId.hashCode();
        }

        public String toString() {
            return "PushReadCallback(deviceType=" + this.deviceType + ", regId=" + this.regId + ", userId=" + this.userId + ", msgId=" + this.msgId + Separators.RPAREN;
        }

        public PushReadCallback(int i, String regId, String userId, String msgId) {
            Intrinsics.checkNotNullParameter(regId, "regId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.deviceType = i;
            this.regId = regId;
            this.userId = userId;
            this.msgId = msgId;
        }

        public final int getDeviceType() {
            return this.deviceType;
        }

        public final void setDeviceType(int i) {
            this.deviceType = i;
        }

        public final String getRegId() {
            return this.regId;
        }

        public final void setRegId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.regId = str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setUserId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }

        public final String getMsgId() {
            return this.msgId;
        }

        public final void setMsgId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msgId = str;
        }
    }

    /* compiled from: PushRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/push/PushRequest$PushGetMessageList;", "", "userId", "", "pageSize", "", "pageNum", "<init>", "(Ljava/lang/String;II)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getPageSize", "()I", "setPageSize", "(I)V", "getPageNum", "setPageNum", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushGetMessageList {
        private int pageNum;
        private int pageSize;
        private String userId;

        public static /* synthetic */ PushGetMessageList copy$default(PushGetMessageList pushGetMessageList, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = pushGetMessageList.userId;
            }
            if ((i3 & 2) != 0) {
                i = pushGetMessageList.pageSize;
            }
            if ((i3 & 4) != 0) {
                i2 = pushGetMessageList.pageNum;
            }
            return pushGetMessageList.copy(str, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPageNum() {
            return this.pageNum;
        }

        public final PushGetMessageList copy(String userId, int pageSize, int pageNum) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new PushGetMessageList(userId, pageSize, pageNum);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushGetMessageList)) {
                return false;
            }
            PushGetMessageList pushGetMessageList = (PushGetMessageList) other;
            return Intrinsics.areEqual(this.userId, pushGetMessageList.userId) && this.pageSize == pushGetMessageList.pageSize && this.pageNum == pushGetMessageList.pageNum;
        }

        public int hashCode() {
            return (((this.userId.hashCode() * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.pageNum);
        }

        public String toString() {
            return "PushGetMessageList(userId=" + this.userId + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + Separators.RPAREN;
        }

        public PushGetMessageList(String userId, int i, int i2) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
            this.pageSize = i;
            this.pageNum = i2;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setUserId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final void setPageSize(int i) {
            this.pageSize = i;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final void setPageNum(int i) {
            this.pageNum = i;
        }
    }
}
