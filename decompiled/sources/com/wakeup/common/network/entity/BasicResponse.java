package com.wakeup.common.network.entity;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.other.MyOrderModel;
import com.wakeup.common.network.entity.ring.RingOrderModel;
import com.wakeup.common.network.entity.user.UserIntegralRecordModel;
import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.feature.user.constant.UserConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:'\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse;", "", "<init>", "()V", "ControlData", "ResultData", "SaveStepData", "ActivateLicenseData", "UserOrderPageVO", "MenuOrder", "IntegrationRecord", "PaypalResponse", "StripeResponse", "CountryModel", "WeekPlanInfo", "ModelCustomizationBean", "AlpThreeParams", "AlinkDynamicResult", "MenstrualResult", "OtherPackage", "UpAppModel", "BreathingTrain", "BreathingTrainBean", "BreathingTrainInfo", "DescInfo", "MusicList", "MusicItemBean", "MusicInfo", "MusicCollectTabType", "MusicCollect", "BreathTrainRecord", "BackgroundMusic", "BackgroundMusicBean", "MusicFavorite", "AliDialOrderInfo", "FeedBackRecord", "IssueEntity", "MemberInterest", "IntegralMallVO", "ChatGPT", "BaiduAccessToken", "GetDetectLanguageResponse", "RingOrder", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BasicResponse {
    public static final BasicResponse INSTANCE = new BasicResponse();

    private BasicResponse() {
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$ControlData;", "", "shortSwitch", "", "<init>", "(I)V", "getShortSwitch", "()I", "setShortSwitch", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ControlData {
        private int shortSwitch;

        public static /* synthetic */ ControlData copy$default(ControlData controlData, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = controlData.shortSwitch;
            }
            return controlData.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getShortSwitch() {
            return this.shortSwitch;
        }

        public final ControlData copy(int shortSwitch) {
            return new ControlData(shortSwitch);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ControlData) && this.shortSwitch == ((ControlData) other).shortSwitch;
        }

        public int hashCode() {
            return Integer.hashCode(this.shortSwitch);
        }

        public String toString() {
            return "ControlData(shortSwitch=" + this.shortSwitch + Separators.RPAREN;
        }

        public ControlData(int i) {
            this.shortSwitch = i;
        }

        public final int getShortSwitch() {
            return this.shortSwitch;
        }

        public final void setShortSwitch(int i) {
            this.shortSwitch = i;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$ResultData;", "", "code", "", "msg", "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResultData {
        private int code;
        private Object data;
        private String msg;

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i, String str, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = resultData.code;
            }
            if ((i2 & 2) != 0) {
                str = resultData.msg;
            }
            if ((i2 & 4) != 0) {
                obj = resultData.data;
            }
            return resultData.copy(i, str, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        /* renamed from: component3, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        public final ResultData copy(int code, String msg, Object data) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new ResultData(code, msg, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultData)) {
                return false;
            }
            ResultData resultData = (ResultData) other;
            return this.code == resultData.code && Intrinsics.areEqual(this.msg, resultData.msg) && Intrinsics.areEqual(this.data, resultData.data);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
            Object obj = this.data;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "ResultData(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + Separators.RPAREN;
        }

        public ResultData(int i, String msg, Object obj) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.code = i;
            this.msg = msg;
            this.data = obj;
        }

        public final int getCode() {
            return this.code;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final void setMsg(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msg = str;
        }

        public final Object getData() {
            return this.data;
        }

        public final void setData(Object obj) {
            this.data = obj;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$SaveStepData;", "", "code", "", "msg", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getMsg", "setMsg", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveStepData {
        private String code;
        private Object data;
        private String msg;

        public static /* synthetic */ SaveStepData copy$default(SaveStepData saveStepData, String str, String str2, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = saveStepData.code;
            }
            if ((i & 2) != 0) {
                str2 = saveStepData.msg;
            }
            if ((i & 4) != 0) {
                obj = saveStepData.data;
            }
            return saveStepData.copy(str, str2, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        /* renamed from: component3, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        public final SaveStepData copy(String code, String msg, Object data) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new SaveStepData(code, msg, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveStepData)) {
                return false;
            }
            SaveStepData saveStepData = (SaveStepData) other;
            return Intrinsics.areEqual(this.code, saveStepData.code) && Intrinsics.areEqual(this.msg, saveStepData.msg) && Intrinsics.areEqual(this.data, saveStepData.data);
        }

        public int hashCode() {
            int hashCode = ((this.code.hashCode() * 31) + this.msg.hashCode()) * 31;
            Object obj = this.data;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "SaveStepData(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + Separators.RPAREN;
        }

        public SaveStepData(String code, String msg, Object obj) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.code = code;
            this.msg = msg;
            this.data = obj;
        }

        public final String getCode() {
            return this.code;
        }

        public final void setCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.code = str;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final void setMsg(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msg = str;
        }

        public final Object getData() {
            return this.data;
        }

        public final void setData(Object obj) {
            this.data = obj;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$ActivateLicenseData;", "", "code", "", "msg", "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivateLicenseData {
        private int code;
        private Object data;
        private String msg;

        public static /* synthetic */ ActivateLicenseData copy$default(ActivateLicenseData activateLicenseData, int i, String str, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = activateLicenseData.code;
            }
            if ((i2 & 2) != 0) {
                str = activateLicenseData.msg;
            }
            if ((i2 & 4) != 0) {
                obj = activateLicenseData.data;
            }
            return activateLicenseData.copy(i, str, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        /* renamed from: component3, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        public final ActivateLicenseData copy(int code, String msg, Object data) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new ActivateLicenseData(code, msg, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivateLicenseData)) {
                return false;
            }
            ActivateLicenseData activateLicenseData = (ActivateLicenseData) other;
            return this.code == activateLicenseData.code && Intrinsics.areEqual(this.msg, activateLicenseData.msg) && Intrinsics.areEqual(this.data, activateLicenseData.data);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
            Object obj = this.data;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "ActivateLicenseData(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + Separators.RPAREN;
        }

        public ActivateLicenseData(int i, String msg, Object obj) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.code = i;
            this.msg = msg;
            this.data = obj;
        }

        public final int getCode() {
            return this.code;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final void setMsg(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msg = str;
        }

        public final Object getData() {
            return this.data;
        }

        public final void setData(Object obj) {
            this.data = obj;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$UserOrderPageVO;", "", "prizeCount", "", "recordList", "", "Lcom/wakeup/common/network/entity/other/MyOrderModel;", "<init>", "(ILjava/util/List;)V", "getPrizeCount", "()I", "setPrizeCount", "(I)V", "getRecordList", "()Ljava/util/List;", "setRecordList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserOrderPageVO {
        private int prizeCount;
        private List<? extends MyOrderModel> recordList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserOrderPageVO copy$default(UserOrderPageVO userOrderPageVO, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = userOrderPageVO.prizeCount;
            }
            if ((i2 & 2) != 0) {
                list = userOrderPageVO.recordList;
            }
            return userOrderPageVO.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPrizeCount() {
            return this.prizeCount;
        }

        public final List<MyOrderModel> component2() {
            return this.recordList;
        }

        public final UserOrderPageVO copy(int prizeCount, List<? extends MyOrderModel> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            return new UserOrderPageVO(prizeCount, recordList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserOrderPageVO)) {
                return false;
            }
            UserOrderPageVO userOrderPageVO = (UserOrderPageVO) other;
            return this.prizeCount == userOrderPageVO.prizeCount && Intrinsics.areEqual(this.recordList, userOrderPageVO.recordList);
        }

        public int hashCode() {
            return (Integer.hashCode(this.prizeCount) * 31) + this.recordList.hashCode();
        }

        public String toString() {
            return "UserOrderPageVO(prizeCount=" + this.prizeCount + ", recordList=" + this.recordList + Separators.RPAREN;
        }

        public UserOrderPageVO(int i, List<? extends MyOrderModel> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            this.prizeCount = i;
            this.recordList = recordList;
        }

        public final int getPrizeCount() {
            return this.prizeCount;
        }

        public final void setPrizeCount(int i) {
            this.prizeCount = i;
        }

        public final List<MyOrderModel> getRecordList() {
            return this.recordList;
        }

        public final void setRecordList(List<? extends MyOrderModel> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.recordList = list;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MenuOrder;", "", "records", "", "Lcom/wakeup/common/network/entity/other/MyOrderModel;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "setRecords", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MenuOrder {
        private List<? extends MyOrderModel> records;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MenuOrder copy$default(MenuOrder menuOrder, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = menuOrder.records;
            }
            return menuOrder.copy(list);
        }

        public final List<MyOrderModel> component1() {
            return this.records;
        }

        public final MenuOrder copy(List<? extends MyOrderModel> records) {
            Intrinsics.checkNotNullParameter(records, "records");
            return new MenuOrder(records);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MenuOrder) && Intrinsics.areEqual(this.records, ((MenuOrder) other).records);
        }

        public int hashCode() {
            return this.records.hashCode();
        }

        public String toString() {
            return "MenuOrder(records=" + this.records + Separators.RPAREN;
        }

        public MenuOrder(List<? extends MyOrderModel> records) {
            Intrinsics.checkNotNullParameter(records, "records");
            this.records = records;
        }

        public final List<MyOrderModel> getRecords() {
            return this.records;
        }

        public final void setRecords(List<? extends MyOrderModel> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.records = list;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$IntegrationRecord;", "", "recordCount", "", "recordList", "", "Lcom/wakeup/common/network/entity/user/UserIntegralRecordModel;", "<init>", "(ILjava/util/List;)V", "getRecordCount", "()I", "getRecordList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IntegrationRecord {
        private final int recordCount;
        private final List<UserIntegralRecordModel> recordList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IntegrationRecord copy$default(IntegrationRecord integrationRecord, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = integrationRecord.recordCount;
            }
            if ((i2 & 2) != 0) {
                list = integrationRecord.recordList;
            }
            return integrationRecord.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRecordCount() {
            return this.recordCount;
        }

        public final List<UserIntegralRecordModel> component2() {
            return this.recordList;
        }

        public final IntegrationRecord copy(int recordCount, List<UserIntegralRecordModel> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            return new IntegrationRecord(recordCount, recordList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationRecord)) {
                return false;
            }
            IntegrationRecord integrationRecord = (IntegrationRecord) other;
            return this.recordCount == integrationRecord.recordCount && Intrinsics.areEqual(this.recordList, integrationRecord.recordList);
        }

        public int hashCode() {
            return (Integer.hashCode(this.recordCount) * 31) + this.recordList.hashCode();
        }

        public String toString() {
            return "IntegrationRecord(recordCount=" + this.recordCount + ", recordList=" + this.recordList + Separators.RPAREN;
        }

        public IntegrationRecord(int i, List<UserIntegralRecordModel> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            this.recordCount = i;
            this.recordList = recordList;
        }

        public final int getRecordCount() {
            return this.recordCount;
        }

        public final List<UserIntegralRecordModel> getRecordList() {
            return this.recordList;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$PaypalResponse;", "", "payHref", "", "token", "orderNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayHref", "()Ljava/lang/String;", "setPayHref", "(Ljava/lang/String;)V", "getToken", "setToken", "getOrderNo", "setOrderNo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaypalResponse {
        private String orderNo;
        private String payHref;
        private String token;

        public static /* synthetic */ PaypalResponse copy$default(PaypalResponse paypalResponse, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paypalResponse.payHref;
            }
            if ((i & 2) != 0) {
                str2 = paypalResponse.token;
            }
            if ((i & 4) != 0) {
                str3 = paypalResponse.orderNo;
            }
            return paypalResponse.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPayHref() {
            return this.payHref;
        }

        /* renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        public final PaypalResponse copy(String payHref, String token, String orderNo) {
            Intrinsics.checkNotNullParameter(payHref, "payHref");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            return new PaypalResponse(payHref, token, orderNo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaypalResponse)) {
                return false;
            }
            PaypalResponse paypalResponse = (PaypalResponse) other;
            return Intrinsics.areEqual(this.payHref, paypalResponse.payHref) && Intrinsics.areEqual(this.token, paypalResponse.token) && Intrinsics.areEqual(this.orderNo, paypalResponse.orderNo);
        }

        public int hashCode() {
            return (((this.payHref.hashCode() * 31) + this.token.hashCode()) * 31) + this.orderNo.hashCode();
        }

        public String toString() {
            return "PaypalResponse(payHref=" + this.payHref + ", token=" + this.token + ", orderNo=" + this.orderNo + Separators.RPAREN;
        }

        public PaypalResponse(String payHref, String token, String orderNo) {
            Intrinsics.checkNotNullParameter(payHref, "payHref");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            this.payHref = payHref;
            this.token = token;
            this.orderNo = orderNo;
        }

        public final String getPayHref() {
            return this.payHref;
        }

        public final void setPayHref(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.payHref = str;
        }

        public final String getToken() {
            return this.token;
        }

        public final void setToken(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.token = str;
        }

        public final String getOrderNo() {
            return this.orderNo;
        }

        public final void setOrderNo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.orderNo = str;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$StripeResponse;", "", "payUrl", "", "orderNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPayUrl", "()Ljava/lang/String;", "setPayUrl", "(Ljava/lang/String;)V", "getOrderNo", "setOrderNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StripeResponse {
        private String orderNo;
        private String payUrl;

        public static /* synthetic */ StripeResponse copy$default(StripeResponse stripeResponse, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stripeResponse.payUrl;
            }
            if ((i & 2) != 0) {
                str2 = stripeResponse.orderNo;
            }
            return stripeResponse.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPayUrl() {
            return this.payUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        public final StripeResponse copy(String payUrl, String orderNo) {
            Intrinsics.checkNotNullParameter(payUrl, "payUrl");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            return new StripeResponse(payUrl, orderNo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StripeResponse)) {
                return false;
            }
            StripeResponse stripeResponse = (StripeResponse) other;
            return Intrinsics.areEqual(this.payUrl, stripeResponse.payUrl) && Intrinsics.areEqual(this.orderNo, stripeResponse.orderNo);
        }

        public int hashCode() {
            return (this.payUrl.hashCode() * 31) + this.orderNo.hashCode();
        }

        public String toString() {
            return "StripeResponse(payUrl=" + this.payUrl + ", orderNo=" + this.orderNo + Separators.RPAREN;
        }

        public StripeResponse(String payUrl, String orderNo) {
            Intrinsics.checkNotNullParameter(payUrl, "payUrl");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            this.payUrl = payUrl;
            this.orderNo = orderNo;
        }

        public final String getPayUrl() {
            return this.payUrl;
        }

        public final void setPayUrl(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.payUrl = str;
        }

        public final String getOrderNo() {
            return this.orderNo;
        }

        public final void setOrderNo(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.orderNo = str;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003JW\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$CountryModel;", "Ljava/io/Serializable;", UserConstants.AREA_ID, "", "flagUrl", "", "locale", "locale_zh", "groupName", "pid", "isSelect", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getAreaId", "()I", "setAreaId", "(I)V", "getFlagUrl", "()Ljava/lang/String;", "setFlagUrl", "(Ljava/lang/String;)V", "getLocale", "setLocale", "getLocale_zh", "setLocale_zh", "getGroupName", "setGroupName", "getPid", "setPid", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountryModel implements Serializable {
        private int areaId;
        private String flagUrl;
        private String groupName;
        private boolean isSelect;
        private String locale;
        private String locale_zh;
        private int pid;

        public CountryModel() {
            this(0, null, null, null, null, 0, false, 127, null);
        }

        public static /* synthetic */ CountryModel copy$default(CountryModel countryModel, int i, String str, String str2, String str3, String str4, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = countryModel.areaId;
            }
            if ((i3 & 2) != 0) {
                str = countryModel.flagUrl;
            }
            if ((i3 & 4) != 0) {
                str2 = countryModel.locale;
            }
            if ((i3 & 8) != 0) {
                str3 = countryModel.locale_zh;
            }
            if ((i3 & 16) != 0) {
                str4 = countryModel.groupName;
            }
            if ((i3 & 32) != 0) {
                i2 = countryModel.pid;
            }
            if ((i3 & 64) != 0) {
                z = countryModel.isSelect;
            }
            int i4 = i2;
            boolean z2 = z;
            String str5 = str4;
            String str6 = str2;
            return countryModel.copy(i, str, str6, str3, str5, i4, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAreaId() {
            return this.areaId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFlagUrl() {
            return this.flagUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLocale_zh() {
            return this.locale_zh;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* renamed from: component6, reason: from getter */
        public final int getPid() {
            return this.pid;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSelect() {
            return this.isSelect;
        }

        public final CountryModel copy(int areaId, String flagUrl, String locale, String locale_zh, String groupName, int pid, boolean isSelect) {
            return new CountryModel(areaId, flagUrl, locale, locale_zh, groupName, pid, isSelect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryModel)) {
                return false;
            }
            CountryModel countryModel = (CountryModel) other;
            return this.areaId == countryModel.areaId && Intrinsics.areEqual(this.flagUrl, countryModel.flagUrl) && Intrinsics.areEqual(this.locale, countryModel.locale) && Intrinsics.areEqual(this.locale_zh, countryModel.locale_zh) && Intrinsics.areEqual(this.groupName, countryModel.groupName) && this.pid == countryModel.pid && this.isSelect == countryModel.isSelect;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.areaId) * 31;
            String str = this.flagUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.locale;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locale_zh;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.groupName;
            return ((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.pid)) * 31) + Boolean.hashCode(this.isSelect);
        }

        public String toString() {
            return "CountryModel(areaId=" + this.areaId + ", flagUrl=" + this.flagUrl + ", locale=" + this.locale + ", locale_zh=" + this.locale_zh + ", groupName=" + this.groupName + ", pid=" + this.pid + ", isSelect=" + this.isSelect + Separators.RPAREN;
        }

        public CountryModel(int i, String str, String str2, String str3, String str4, int i2, boolean z) {
            this.areaId = i;
            this.flagUrl = str;
            this.locale = str2;
            this.locale_zh = str3;
            this.groupName = str4;
            this.pid = i2;
            this.isSelect = z;
        }

        public /* synthetic */ CountryModel(int i, String str, String str2, String str3, String str4, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z);
        }

        public final int getAreaId() {
            return this.areaId;
        }

        public final void setAreaId(int i) {
            this.areaId = i;
        }

        public final String getFlagUrl() {
            return this.flagUrl;
        }

        public final void setFlagUrl(String str) {
            this.flagUrl = str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final String getLocale_zh() {
            return this.locale_zh;
        }

        public final void setLocale_zh(String str) {
            this.locale_zh = str;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final void setGroupName(String str) {
            this.groupName = str;
        }

        public final int getPid() {
            return this.pid;
        }

        public final void setPid(int i) {
            this.pid = i;
        }

        public final boolean isSelect() {
            return this.isSelect;
        }

        public final void setSelect(boolean z) {
            this.isSelect = z;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$WeekPlanInfo;", "", "countRunning", "", "countTime", "", HealthData.STATISTICS_KCAL_TOTAL, "finishCountPlanDay", "countPlanDay", "percentage", "planType", "modelId", "modelName", "", "countWeekNum", "countComplianceDay", "<init>", "(FIIIIFIILjava/lang/String;II)V", "getCountRunning", "()F", "getCountTime", "()I", "getCountKcal", "getFinishCountPlanDay", "getCountPlanDay", "getPercentage", "getPlanType", "getModelId", "getModelName", "()Ljava/lang/String;", "getCountWeekNum", "getCountComplianceDay", "isEmpty", "", "()Z", "setEmpty", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeekPlanInfo {
        private final int countComplianceDay;
        private final int countKcal;
        private final int countPlanDay;
        private final float countRunning;
        private final int countTime;
        private final int countWeekNum;
        private final int finishCountPlanDay;
        private boolean isEmpty;
        private final int modelId;
        private final String modelName;
        private final float percentage;
        private final int planType;

        public WeekPlanInfo() {
            this(0.0f, 0, 0, 0, 0, 0.0f, 0, 0, null, 0, 0, 2047, null);
        }

        public static /* synthetic */ WeekPlanInfo copy$default(WeekPlanInfo weekPlanInfo, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, String str, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                f = weekPlanInfo.countRunning;
            }
            if ((i9 & 2) != 0) {
                i = weekPlanInfo.countTime;
            }
            if ((i9 & 4) != 0) {
                i2 = weekPlanInfo.countKcal;
            }
            if ((i9 & 8) != 0) {
                i3 = weekPlanInfo.finishCountPlanDay;
            }
            if ((i9 & 16) != 0) {
                i4 = weekPlanInfo.countPlanDay;
            }
            if ((i9 & 32) != 0) {
                f2 = weekPlanInfo.percentage;
            }
            if ((i9 & 64) != 0) {
                i5 = weekPlanInfo.planType;
            }
            if ((i9 & 128) != 0) {
                i6 = weekPlanInfo.modelId;
            }
            if ((i9 & 256) != 0) {
                str = weekPlanInfo.modelName;
            }
            if ((i9 & 512) != 0) {
                i7 = weekPlanInfo.countWeekNum;
            }
            if ((i9 & 1024) != 0) {
                i8 = weekPlanInfo.countComplianceDay;
            }
            int i10 = i7;
            int i11 = i8;
            int i12 = i6;
            String str2 = str;
            float f3 = f2;
            int i13 = i5;
            int i14 = i4;
            int i15 = i2;
            return weekPlanInfo.copy(f, i, i15, i3, i14, f3, i13, i12, str2, i10, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final float getCountRunning() {
            return this.countRunning;
        }

        /* renamed from: component10, reason: from getter */
        public final int getCountWeekNum() {
            return this.countWeekNum;
        }

        /* renamed from: component11, reason: from getter */
        public final int getCountComplianceDay() {
            return this.countComplianceDay;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCountTime() {
            return this.countTime;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCountKcal() {
            return this.countKcal;
        }

        /* renamed from: component4, reason: from getter */
        public final int getFinishCountPlanDay() {
            return this.finishCountPlanDay;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCountPlanDay() {
            return this.countPlanDay;
        }

        /* renamed from: component6, reason: from getter */
        public final float getPercentage() {
            return this.percentage;
        }

        /* renamed from: component7, reason: from getter */
        public final int getPlanType() {
            return this.planType;
        }

        /* renamed from: component8, reason: from getter */
        public final int getModelId() {
            return this.modelId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getModelName() {
            return this.modelName;
        }

        public final WeekPlanInfo copy(float countRunning, int countTime, int countKcal, int finishCountPlanDay, int countPlanDay, float percentage, int planType, int modelId, String modelName, int countWeekNum, int countComplianceDay) {
            Intrinsics.checkNotNullParameter(modelName, "modelName");
            return new WeekPlanInfo(countRunning, countTime, countKcal, finishCountPlanDay, countPlanDay, percentage, planType, modelId, modelName, countWeekNum, countComplianceDay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeekPlanInfo)) {
                return false;
            }
            WeekPlanInfo weekPlanInfo = (WeekPlanInfo) other;
            return Float.compare(this.countRunning, weekPlanInfo.countRunning) == 0 && this.countTime == weekPlanInfo.countTime && this.countKcal == weekPlanInfo.countKcal && this.finishCountPlanDay == weekPlanInfo.finishCountPlanDay && this.countPlanDay == weekPlanInfo.countPlanDay && Float.compare(this.percentage, weekPlanInfo.percentage) == 0 && this.planType == weekPlanInfo.planType && this.modelId == weekPlanInfo.modelId && Intrinsics.areEqual(this.modelName, weekPlanInfo.modelName) && this.countWeekNum == weekPlanInfo.countWeekNum && this.countComplianceDay == weekPlanInfo.countComplianceDay;
        }

        public int hashCode() {
            return (((((((((((((((((((Float.hashCode(this.countRunning) * 31) + Integer.hashCode(this.countTime)) * 31) + Integer.hashCode(this.countKcal)) * 31) + Integer.hashCode(this.finishCountPlanDay)) * 31) + Integer.hashCode(this.countPlanDay)) * 31) + Float.hashCode(this.percentage)) * 31) + Integer.hashCode(this.planType)) * 31) + Integer.hashCode(this.modelId)) * 31) + this.modelName.hashCode()) * 31) + Integer.hashCode(this.countWeekNum)) * 31) + Integer.hashCode(this.countComplianceDay);
        }

        public String toString() {
            return "WeekPlanInfo(countRunning=" + this.countRunning + ", countTime=" + this.countTime + ", countKcal=" + this.countKcal + ", finishCountPlanDay=" + this.finishCountPlanDay + ", countPlanDay=" + this.countPlanDay + ", percentage=" + this.percentage + ", planType=" + this.planType + ", modelId=" + this.modelId + ", modelName=" + this.modelName + ", countWeekNum=" + this.countWeekNum + ", countComplianceDay=" + this.countComplianceDay + Separators.RPAREN;
        }

        public WeekPlanInfo(float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, String modelName, int i7, int i8) {
            Intrinsics.checkNotNullParameter(modelName, "modelName");
            this.countRunning = f;
            this.countTime = i;
            this.countKcal = i2;
            this.finishCountPlanDay = i3;
            this.countPlanDay = i4;
            this.percentage = f2;
            this.planType = i5;
            this.modelId = i6;
            this.modelName = modelName;
            this.countWeekNum = i7;
            this.countComplianceDay = i8;
        }

        public final float getCountRunning() {
            return this.countRunning;
        }

        public final int getCountTime() {
            return this.countTime;
        }

        public final int getCountKcal() {
            return this.countKcal;
        }

        public final int getFinishCountPlanDay() {
            return this.finishCountPlanDay;
        }

        public final int getCountPlanDay() {
            return this.countPlanDay;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        public final int getPlanType() {
            return this.planType;
        }

        public final int getModelId() {
            return this.modelId;
        }

        public /* synthetic */ WeekPlanInfo(float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, String str, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? 0.0f : f, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? 0 : i4, (i9 & 32) != 0 ? 0.0f : f2, (i9 & 64) != 0 ? 0 : i5, (i9 & 128) != 0 ? 0 : i6, (i9 & 256) != 0 ? "" : str, (i9 & 512) != 0 ? 0 : i7, (i9 & 1024) != 0 ? 0 : i8);
        }

        public final String getModelName() {
            return this.modelName;
        }

        public final int getCountWeekNum() {
            return this.countWeekNum;
        }

        public final int getCountComplianceDay() {
            return this.countComplianceDay;
        }

        /* renamed from: isEmpty, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        public final void setEmpty(boolean z) {
            this.isEmpty = z;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$ModelCustomizationBean;", "", "exerciseTimeList", "", "", "<init>", "(Ljava/util/List;)V", "getExerciseTimeList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ModelCustomizationBean {
        private final List<Long> exerciseTimeList;

        /* JADX WARN: Multi-variable type inference failed */
        public ModelCustomizationBean() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ModelCustomizationBean copy$default(ModelCustomizationBean modelCustomizationBean, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = modelCustomizationBean.exerciseTimeList;
            }
            return modelCustomizationBean.copy(list);
        }

        public final List<Long> component1() {
            return this.exerciseTimeList;
        }

        public final ModelCustomizationBean copy(List<Long> exerciseTimeList) {
            return new ModelCustomizationBean(exerciseTimeList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ModelCustomizationBean) && Intrinsics.areEqual(this.exerciseTimeList, ((ModelCustomizationBean) other).exerciseTimeList);
        }

        public int hashCode() {
            List<Long> list = this.exerciseTimeList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "ModelCustomizationBean(exerciseTimeList=" + this.exerciseTimeList + Separators.RPAREN;
        }

        public ModelCustomizationBean(List<Long> list) {
            this.exerciseTimeList = list;
        }

        public /* synthetic */ ModelCustomizationBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }

        public final List<Long> getExerciseTimeList() {
            return this.exerciseTimeList;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$AlpThreeParams;", "", "productKey", "", "deviceName", "projectSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductKey", "()Ljava/lang/String;", "setProductKey", "(Ljava/lang/String;)V", "getDeviceName", "setDeviceName", "getProjectSecret", "setProjectSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlpThreeParams {
        private String deviceName;
        private String productKey;
        private String projectSecret;

        public static /* synthetic */ AlpThreeParams copy$default(AlpThreeParams alpThreeParams, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alpThreeParams.productKey;
            }
            if ((i & 2) != 0) {
                str2 = alpThreeParams.deviceName;
            }
            if ((i & 4) != 0) {
                str3 = alpThreeParams.projectSecret;
            }
            return alpThreeParams.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductKey() {
            return this.productKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeviceName() {
            return this.deviceName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProjectSecret() {
            return this.projectSecret;
        }

        public final AlpThreeParams copy(String productKey, String deviceName, String projectSecret) {
            Intrinsics.checkNotNullParameter(productKey, "productKey");
            Intrinsics.checkNotNullParameter(deviceName, "deviceName");
            Intrinsics.checkNotNullParameter(projectSecret, "projectSecret");
            return new AlpThreeParams(productKey, deviceName, projectSecret);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlpThreeParams)) {
                return false;
            }
            AlpThreeParams alpThreeParams = (AlpThreeParams) other;
            return Intrinsics.areEqual(this.productKey, alpThreeParams.productKey) && Intrinsics.areEqual(this.deviceName, alpThreeParams.deviceName) && Intrinsics.areEqual(this.projectSecret, alpThreeParams.projectSecret);
        }

        public int hashCode() {
            return (((this.productKey.hashCode() * 31) + this.deviceName.hashCode()) * 31) + this.projectSecret.hashCode();
        }

        public String toString() {
            return "AlpThreeParams(productKey=" + this.productKey + ", deviceName=" + this.deviceName + ", projectSecret=" + this.projectSecret + Separators.RPAREN;
        }

        public AlpThreeParams(String productKey, String deviceName, String projectSecret) {
            Intrinsics.checkNotNullParameter(productKey, "productKey");
            Intrinsics.checkNotNullParameter(deviceName, "deviceName");
            Intrinsics.checkNotNullParameter(projectSecret, "projectSecret");
            this.productKey = productKey;
            this.deviceName = deviceName;
            this.projectSecret = projectSecret;
        }

        public final String getProductKey() {
            return this.productKey;
        }

        public final void setProductKey(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.productKey = str;
        }

        public final String getDeviceName() {
            return this.deviceName;
        }

        public final void setDeviceName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceName = str;
        }

        public final String getProjectSecret() {
            return this.projectSecret;
        }

        public final void setProjectSecret(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.projectSecret = str;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$AlinkDynamicResult;", "", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlinkDynamicResult {
        private int code;
        private String message;

        public static /* synthetic */ AlinkDynamicResult copy$default(AlinkDynamicResult alinkDynamicResult, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = alinkDynamicResult.code;
            }
            if ((i2 & 2) != 0) {
                str = alinkDynamicResult.message;
            }
            return alinkDynamicResult.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final AlinkDynamicResult copy(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AlinkDynamicResult(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlinkDynamicResult)) {
                return false;
            }
            AlinkDynamicResult alinkDynamicResult = (AlinkDynamicResult) other;
            return this.code == alinkDynamicResult.code && Intrinsics.areEqual(this.message, alinkDynamicResult.message);
        }

        public int hashCode() {
            return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "AlinkDynamicResult(code=" + this.code + ", message=" + this.message + Separators.RPAREN;
        }

        public AlinkDynamicResult(int i, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i;
            this.message = message;
        }

        public final int getCode() {
            return this.code;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final String getMessage() {
            return this.message;
        }

        public final void setMessage(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MenstrualResult;", "", "lastDate", "", "len", "", "intervals", "<init>", "(JII)V", "getLastDate", "()J", "getLen", "()I", "getIntervals", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MenstrualResult {
        private final int intervals;
        private final long lastDate;
        private final int len;

        public static /* synthetic */ MenstrualResult copy$default(MenstrualResult menstrualResult, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = menstrualResult.lastDate;
            }
            if ((i3 & 2) != 0) {
                i = menstrualResult.len;
            }
            if ((i3 & 4) != 0) {
                i2 = menstrualResult.intervals;
            }
            return menstrualResult.copy(j, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLastDate() {
            return this.lastDate;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        /* renamed from: component3, reason: from getter */
        public final int getIntervals() {
            return this.intervals;
        }

        public final MenstrualResult copy(long lastDate, int len, int intervals) {
            return new MenstrualResult(lastDate, len, intervals);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenstrualResult)) {
                return false;
            }
            MenstrualResult menstrualResult = (MenstrualResult) other;
            return this.lastDate == menstrualResult.lastDate && this.len == menstrualResult.len && this.intervals == menstrualResult.intervals;
        }

        public int hashCode() {
            return (((Long.hashCode(this.lastDate) * 31) + Integer.hashCode(this.len)) * 31) + Integer.hashCode(this.intervals);
        }

        public String toString() {
            return "MenstrualResult(lastDate=" + this.lastDate + ", len=" + this.len + ", intervals=" + this.intervals + Separators.RPAREN;
        }

        public MenstrualResult(long j, int i, int i2) {
            this.lastDate = j;
            this.len = i;
            this.intervals = i2;
        }

        public final long getLastDate() {
            return this.lastDate;
        }

        public final int getLen() {
            return this.len;
        }

        public final int getIntervals() {
            return this.intervals;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$OtherPackage;", "", "applicationName", "", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApplicationName", "()Ljava/lang/String;", "getPackageName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtherPackage {
        private final String applicationName;
        private final String packageName;

        public static /* synthetic */ OtherPackage copy$default(OtherPackage otherPackage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otherPackage.applicationName;
            }
            if ((i & 2) != 0) {
                str2 = otherPackage.packageName;
            }
            return otherPackage.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationName() {
            return this.applicationName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        public final OtherPackage copy(String applicationName, String packageName) {
            Intrinsics.checkNotNullParameter(applicationName, "applicationName");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new OtherPackage(applicationName, packageName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtherPackage)) {
                return false;
            }
            OtherPackage otherPackage = (OtherPackage) other;
            return Intrinsics.areEqual(this.applicationName, otherPackage.applicationName) && Intrinsics.areEqual(this.packageName, otherPackage.packageName);
        }

        public int hashCode() {
            return (this.applicationName.hashCode() * 31) + this.packageName.hashCode();
        }

        public String toString() {
            return "OtherPackage(applicationName=" + this.applicationName + ", packageName=" + this.packageName + Separators.RPAREN;
        }

        public OtherPackage(String applicationName, String packageName) {
            Intrinsics.checkNotNullParameter(applicationName, "applicationName");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.applicationName = applicationName;
            this.packageName = packageName;
        }

        public final String getApplicationName() {
            return this.applicationName;
        }

        public final String getPackageName() {
            return this.packageName;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$UpAppModel;", "", "updateMessage", "", "apkVersionName", "forced", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getUpdateMessage", "()Ljava/lang/String;", "getApkVersionName", "getForced", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpAppModel {
        private final String apkVersionName;
        private final int forced;
        private final String updateMessage;

        public UpAppModel() {
            this(null, null, 0, 7, null);
        }

        public static /* synthetic */ UpAppModel copy$default(UpAppModel upAppModel, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = upAppModel.updateMessage;
            }
            if ((i2 & 2) != 0) {
                str2 = upAppModel.apkVersionName;
            }
            if ((i2 & 4) != 0) {
                i = upAppModel.forced;
            }
            return upAppModel.copy(str, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUpdateMessage() {
            return this.updateMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApkVersionName() {
            return this.apkVersionName;
        }

        /* renamed from: component3, reason: from getter */
        public final int getForced() {
            return this.forced;
        }

        public final UpAppModel copy(String updateMessage, String apkVersionName, int forced) {
            return new UpAppModel(updateMessage, apkVersionName, forced);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpAppModel)) {
                return false;
            }
            UpAppModel upAppModel = (UpAppModel) other;
            return Intrinsics.areEqual(this.updateMessage, upAppModel.updateMessage) && Intrinsics.areEqual(this.apkVersionName, upAppModel.apkVersionName) && this.forced == upAppModel.forced;
        }

        public int hashCode() {
            String str = this.updateMessage;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.apkVersionName;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.forced);
        }

        public String toString() {
            return "UpAppModel(updateMessage=" + this.updateMessage + ", apkVersionName=" + this.apkVersionName + ", forced=" + this.forced + Separators.RPAREN;
        }

        public UpAppModel(String str, String str2, int i) {
            this.updateMessage = str;
            this.apkVersionName = str2;
            this.forced = i;
        }

        public /* synthetic */ UpAppModel(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
        }

        public final String getUpdateMessage() {
            return this.updateMessage;
        }

        public final String getApkVersionName() {
            return this.apkVersionName;
        }

        public final int getForced() {
            return this.forced;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrain;", "", "pageNum", "", "pageSize", "total", "data", "", "Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrainBean;", "<init>", "(JJJLjava/util/List;)V", "getPageNum", "()J", "getPageSize", "getTotal", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BreathingTrain {
        private final List<BreathingTrainBean> data;
        private final long pageNum;
        private final long pageSize;
        private final long total;

        public static /* synthetic */ BreathingTrain copy$default(BreathingTrain breathingTrain, long j, long j2, long j3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = breathingTrain.pageNum;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = breathingTrain.pageSize;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = breathingTrain.total;
            }
            long j6 = j3;
            if ((i & 8) != 0) {
                list = breathingTrain.data;
            }
            return breathingTrain.copy(j4, j5, j6, list);
        }

        /* renamed from: component1, reason: from getter */
        public final long getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component2, reason: from getter */
        public final long getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        public final List<BreathingTrainBean> component4() {
            return this.data;
        }

        public final BreathingTrain copy(long pageNum, long pageSize, long total, List<BreathingTrainBean> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new BreathingTrain(pageNum, pageSize, total, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BreathingTrain)) {
                return false;
            }
            BreathingTrain breathingTrain = (BreathingTrain) other;
            return this.pageNum == breathingTrain.pageNum && this.pageSize == breathingTrain.pageSize && this.total == breathingTrain.total && Intrinsics.areEqual(this.data, breathingTrain.data);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.pageNum) * 31) + Long.hashCode(this.pageSize)) * 31) + Long.hashCode(this.total)) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "BreathingTrain(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ", data=" + this.data + Separators.RPAREN;
        }

        public BreathingTrain(long j, long j2, long j3, List<BreathingTrainBean> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.pageNum = j;
            this.pageSize = j2;
            this.total = j3;
            this.data = data;
        }

        public final long getPageNum() {
            return this.pageNum;
        }

        public final long getPageSize() {
            return this.pageSize;
        }

        public final long getTotal() {
            return this.total;
        }

        public final List<BreathingTrainBean> getData() {
            return this.data;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrainBean;", "", "cover", "", "id", "", "name", "playTimes", "cornerMark", "memberEnable", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;I)V", "getCover", "()Ljava/lang/String;", "getId", "()J", "getName", "getPlayTimes", "getCornerMark", "getMemberEnable", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BreathingTrainBean {
        private final String cornerMark;
        private final String cover;
        private final long id;
        private final int memberEnable;
        private final String name;
        private final long playTimes;

        public static /* synthetic */ BreathingTrainBean copy$default(BreathingTrainBean breathingTrainBean, String str, long j, String str2, long j2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = breathingTrainBean.cover;
            }
            if ((i2 & 2) != 0) {
                j = breathingTrainBean.id;
            }
            if ((i2 & 4) != 0) {
                str2 = breathingTrainBean.name;
            }
            if ((i2 & 8) != 0) {
                j2 = breathingTrainBean.playTimes;
            }
            if ((i2 & 16) != 0) {
                str3 = breathingTrainBean.cornerMark;
            }
            if ((i2 & 32) != 0) {
                i = breathingTrainBean.memberEnable;
            }
            String str4 = str2;
            return breathingTrainBean.copy(str, j, str4, j2, str3, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCover() {
            return this.cover;
        }

        /* renamed from: component2, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final long getPlayTimes() {
            return this.playTimes;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCornerMark() {
            return this.cornerMark;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMemberEnable() {
            return this.memberEnable;
        }

        public final BreathingTrainBean copy(String cover, long id2, String name, long playTimes, String cornerMark, int memberEnable) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(name, "name");
            return new BreathingTrainBean(cover, id2, name, playTimes, cornerMark, memberEnable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BreathingTrainBean)) {
                return false;
            }
            BreathingTrainBean breathingTrainBean = (BreathingTrainBean) other;
            return Intrinsics.areEqual(this.cover, breathingTrainBean.cover) && this.id == breathingTrainBean.id && Intrinsics.areEqual(this.name, breathingTrainBean.name) && this.playTimes == breathingTrainBean.playTimes && Intrinsics.areEqual(this.cornerMark, breathingTrainBean.cornerMark) && this.memberEnable == breathingTrainBean.memberEnable;
        }

        public int hashCode() {
            int hashCode = ((((((this.cover.hashCode() * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.playTimes)) * 31;
            String str = this.cornerMark;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.memberEnable);
        }

        public String toString() {
            return "BreathingTrainBean(cover=" + this.cover + ", id=" + this.id + ", name=" + this.name + ", playTimes=" + this.playTimes + ", cornerMark=" + this.cornerMark + ", memberEnable=" + this.memberEnable + Separators.RPAREN;
        }

        public BreathingTrainBean(String cover, long j, String name, long j2, String str, int i) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(name, "name");
            this.cover = cover;
            this.id = j;
            this.name = name;
            this.playTimes = j2;
            this.cornerMark = str;
            this.memberEnable = i;
        }

        public /* synthetic */ BreathingTrainBean(String str, long j, String str2, long j2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, j2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i);
        }

        public final String getCover() {
            return this.cover;
        }

        public final long getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final long getPlayTimes() {
            return this.playTimes;
        }

        public final String getCornerMark() {
            return this.cornerMark;
        }

        public final int getMemberEnable() {
            return this.memberEnable;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003JÊ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0013HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001b\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006R"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrainInfo;", "Ljava/io/Serializable;", "auditionFile", "", "backgroundMusicCover", "backgroundMusicFile", "filePath", "backgroundMusicId", "", "backgroundMusicImage", "backgroundMusicName", "cover", "description", "duration", "id", "name", "playTimes", Constants.SORT, "memberEnable", "", "summary", "descInfo", "", "Lcom/wakeup/common/network/entity/BasicResponse$DescInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJILjava/lang/String;Ljava/util/List;)V", "getAuditionFile", "()Ljava/lang/String;", "getBackgroundMusicCover", "setBackgroundMusicCover", "(Ljava/lang/String;)V", "getBackgroundMusicFile", "setBackgroundMusicFile", "getFilePath", "setFilePath", "getBackgroundMusicId", "()Ljava/lang/Long;", "setBackgroundMusicId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getBackgroundMusicImage", "setBackgroundMusicImage", "getBackgroundMusicName", "setBackgroundMusicName", "getCover", "getDescription", "getDuration", "()J", "getId", "getName", "getPlayTimes", "getSort", "getMemberEnable", "()I", "getSummary", "getDescInfo", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJILjava/lang/String;Ljava/util/List;)Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrainInfo;", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BreathingTrainInfo implements Serializable {
        private final String auditionFile;
        private String backgroundMusicCover;
        private String backgroundMusicFile;
        private Long backgroundMusicId;
        private String backgroundMusicImage;
        private String backgroundMusicName;
        private final String cover;
        private final List<DescInfo> descInfo;
        private final String description;
        private final long duration;
        private String filePath;
        private final long id;
        private final int memberEnable;
        private final String name;
        private final long playTimes;
        private final long sort;
        private final String summary;

        public static /* synthetic */ BreathingTrainInfo copy$default(BreathingTrainInfo breathingTrainInfo, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, long j, long j2, String str9, long j3, long j4, int i, String str10, List list, int i2, Object obj) {
            String str11 = (i2 & 1) != 0 ? breathingTrainInfo.auditionFile : str;
            String str12 = (i2 & 2) != 0 ? breathingTrainInfo.backgroundMusicCover : str2;
            return breathingTrainInfo.copy(str11, str12, (i2 & 4) != 0 ? breathingTrainInfo.backgroundMusicFile : str3, (i2 & 8) != 0 ? breathingTrainInfo.filePath : str4, (i2 & 16) != 0 ? breathingTrainInfo.backgroundMusicId : l, (i2 & 32) != 0 ? breathingTrainInfo.backgroundMusicImage : str5, (i2 & 64) != 0 ? breathingTrainInfo.backgroundMusicName : str6, (i2 & 128) != 0 ? breathingTrainInfo.cover : str7, (i2 & 256) != 0 ? breathingTrainInfo.description : str8, (i2 & 512) != 0 ? breathingTrainInfo.duration : j, (i2 & 1024) != 0 ? breathingTrainInfo.id : j2, (i2 & 2048) != 0 ? breathingTrainInfo.name : str9, (i2 & 4096) != 0 ? breathingTrainInfo.playTimes : j3, (i2 & 8192) != 0 ? breathingTrainInfo.sort : j4, (i2 & 16384) != 0 ? breathingTrainInfo.memberEnable : i, (32768 & i2) != 0 ? breathingTrainInfo.summary : str10, (i2 & 65536) != 0 ? breathingTrainInfo.descInfo : list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAuditionFile() {
            return this.auditionFile;
        }

        /* renamed from: component10, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component11, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component12, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component13, reason: from getter */
        public final long getPlayTimes() {
            return this.playTimes;
        }

        /* renamed from: component14, reason: from getter */
        public final long getSort() {
            return this.sort;
        }

        /* renamed from: component15, reason: from getter */
        public final int getMemberEnable() {
            return this.memberEnable;
        }

        /* renamed from: component16, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final List<DescInfo> component17() {
            return this.descInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundMusicCover() {
            return this.backgroundMusicCover;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundMusicFile() {
            return this.backgroundMusicFile;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundMusicImage() {
            return this.backgroundMusicImage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBackgroundMusicName() {
            return this.backgroundMusicName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCover() {
            return this.cover;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final BreathingTrainInfo copy(String auditionFile, String backgroundMusicCover, String backgroundMusicFile, String filePath, Long backgroundMusicId, String backgroundMusicImage, String backgroundMusicName, String cover, String description, long duration, long id2, String name, long playTimes, long sort, int memberEnable, String summary, List<DescInfo> descInfo) {
            Intrinsics.checkNotNullParameter(auditionFile, "auditionFile");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(descInfo, "descInfo");
            return new BreathingTrainInfo(auditionFile, backgroundMusicCover, backgroundMusicFile, filePath, backgroundMusicId, backgroundMusicImage, backgroundMusicName, cover, description, duration, id2, name, playTimes, sort, memberEnable, summary, descInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BreathingTrainInfo)) {
                return false;
            }
            BreathingTrainInfo breathingTrainInfo = (BreathingTrainInfo) other;
            return Intrinsics.areEqual(this.auditionFile, breathingTrainInfo.auditionFile) && Intrinsics.areEqual(this.backgroundMusicCover, breathingTrainInfo.backgroundMusicCover) && Intrinsics.areEqual(this.backgroundMusicFile, breathingTrainInfo.backgroundMusicFile) && Intrinsics.areEqual(this.filePath, breathingTrainInfo.filePath) && Intrinsics.areEqual(this.backgroundMusicId, breathingTrainInfo.backgroundMusicId) && Intrinsics.areEqual(this.backgroundMusicImage, breathingTrainInfo.backgroundMusicImage) && Intrinsics.areEqual(this.backgroundMusicName, breathingTrainInfo.backgroundMusicName) && Intrinsics.areEqual(this.cover, breathingTrainInfo.cover) && Intrinsics.areEqual(this.description, breathingTrainInfo.description) && this.duration == breathingTrainInfo.duration && this.id == breathingTrainInfo.id && Intrinsics.areEqual(this.name, breathingTrainInfo.name) && this.playTimes == breathingTrainInfo.playTimes && this.sort == breathingTrainInfo.sort && this.memberEnable == breathingTrainInfo.memberEnable && Intrinsics.areEqual(this.summary, breathingTrainInfo.summary) && Intrinsics.areEqual(this.descInfo, breathingTrainInfo.descInfo);
        }

        public int hashCode() {
            int hashCode = this.auditionFile.hashCode() * 31;
            String str = this.backgroundMusicCover;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundMusicFile;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.filePath;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.backgroundMusicId;
            int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
            String str4 = this.backgroundMusicImage;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.backgroundMusicName;
            return ((((((((((((((((((((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.cover.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.playTimes)) * 31) + Long.hashCode(this.sort)) * 31) + Integer.hashCode(this.memberEnable)) * 31) + this.summary.hashCode()) * 31) + this.descInfo.hashCode();
        }

        public String toString() {
            return "BreathingTrainInfo(auditionFile=" + this.auditionFile + ", backgroundMusicCover=" + this.backgroundMusicCover + ", backgroundMusicFile=" + this.backgroundMusicFile + ", filePath=" + this.filePath + ", backgroundMusicId=" + this.backgroundMusicId + ", backgroundMusicImage=" + this.backgroundMusicImage + ", backgroundMusicName=" + this.backgroundMusicName + ", cover=" + this.cover + ", description=" + this.description + ", duration=" + this.duration + ", id=" + this.id + ", name=" + this.name + ", playTimes=" + this.playTimes + ", sort=" + this.sort + ", memberEnable=" + this.memberEnable + ", summary=" + this.summary + ", descInfo=" + this.descInfo + Separators.RPAREN;
        }

        public BreathingTrainInfo(String auditionFile, String str, String str2, String str3, Long l, String str4, String str5, String cover, String description, long j, long j2, String name, long j3, long j4, int i, String summary, List<DescInfo> descInfo) {
            Intrinsics.checkNotNullParameter(auditionFile, "auditionFile");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(descInfo, "descInfo");
            this.auditionFile = auditionFile;
            this.backgroundMusicCover = str;
            this.backgroundMusicFile = str2;
            this.filePath = str3;
            this.backgroundMusicId = l;
            this.backgroundMusicImage = str4;
            this.backgroundMusicName = str5;
            this.cover = cover;
            this.description = description;
            this.duration = j;
            this.id = j2;
            this.name = name;
            this.playTimes = j3;
            this.sort = j4;
            this.memberEnable = i;
            this.summary = summary;
            this.descInfo = descInfo;
        }

        public /* synthetic */ BreathingTrainInfo(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, long j, long j2, String str9, long j3, long j4, int i, String str10, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, str7, str8, j, j2, str9, j3, j4, i, str10, list);
        }

        public final String getAuditionFile() {
            return this.auditionFile;
        }

        public final String getBackgroundMusicCover() {
            return this.backgroundMusicCover;
        }

        public final void setBackgroundMusicCover(String str) {
            this.backgroundMusicCover = str;
        }

        public final String getBackgroundMusicFile() {
            return this.backgroundMusicFile;
        }

        public final void setBackgroundMusicFile(String str) {
            this.backgroundMusicFile = str;
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public final void setFilePath(String str) {
            this.filePath = str;
        }

        public final Long getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public final void setBackgroundMusicId(Long l) {
            this.backgroundMusicId = l;
        }

        public final String getBackgroundMusicImage() {
            return this.backgroundMusicImage;
        }

        public final void setBackgroundMusicImage(String str) {
            this.backgroundMusicImage = str;
        }

        public final String getBackgroundMusicName() {
            return this.backgroundMusicName;
        }

        public final void setBackgroundMusicName(String str) {
            this.backgroundMusicName = str;
        }

        public final String getCover() {
            return this.cover;
        }

        public final String getDescription() {
            return this.description;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final long getPlayTimes() {
            return this.playTimes;
        }

        public final long getSort() {
            return this.sort;
        }

        public final int getMemberEnable() {
            return this.memberEnable;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final List<DescInfo> getDescInfo() {
            return this.descInfo;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$DescInfo;", "Ljava/io/Serializable;", "title", "", "content", "", Constants.SORT, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Ljava/util/List;", "getSort", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DescInfo implements Serializable {
        private final List<String> content;
        private final String sort;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DescInfo copy$default(DescInfo descInfo, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = descInfo.title;
            }
            if ((i & 2) != 0) {
                list = descInfo.content;
            }
            if ((i & 4) != 0) {
                str2 = descInfo.sort;
            }
            return descInfo.copy(str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<String> component2() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSort() {
            return this.sort;
        }

        public final DescInfo copy(String title, List<String> content, String sort) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(sort, "sort");
            return new DescInfo(title, content, sort);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescInfo)) {
                return false;
            }
            DescInfo descInfo = (DescInfo) other;
            return Intrinsics.areEqual(this.title, descInfo.title) && Intrinsics.areEqual(this.content, descInfo.content) && Intrinsics.areEqual(this.sort, descInfo.sort);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.sort.hashCode();
        }

        public String toString() {
            return "DescInfo(title=" + this.title + ", content=" + this.content + ", sort=" + this.sort + Separators.RPAREN;
        }

        public DescInfo(String title, List<String> content, String sort) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(sort, "sort");
            this.title = title;
            this.content = content;
            this.sort = sort;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<String> getContent() {
            return this.content;
        }

        public final String getSort() {
            return this.sort;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicList;", "", "data", "", "Lcom/wakeup/common/network/entity/BasicResponse$MusicItemBean;", "pageNum", "", "pageSize", "total", "<init>", "(Ljava/util/List;III)V", "getData", "()Ljava/util/List;", "getPageNum", "()I", "getPageSize", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicList {
        private final List<MusicItemBean> data;
        private final int pageNum;
        private final int pageSize;
        private final int total;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicList copy$default(MusicList musicList, List list, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                list = musicList.data;
            }
            if ((i4 & 2) != 0) {
                i = musicList.pageNum;
            }
            if ((i4 & 4) != 0) {
                i2 = musicList.pageSize;
            }
            if ((i4 & 8) != 0) {
                i3 = musicList.total;
            }
            return musicList.copy(list, i, i2, i3);
        }

        public final List<MusicItemBean> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        public final MusicList copy(List<MusicItemBean> data, int pageNum, int pageSize, int total) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new MusicList(data, pageNum, pageSize, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicList)) {
                return false;
            }
            MusicList musicList = (MusicList) other;
            return Intrinsics.areEqual(this.data, musicList.data) && this.pageNum == musicList.pageNum && this.pageSize == musicList.pageSize && this.total == musicList.total;
        }

        public int hashCode() {
            return (((((this.data.hashCode() * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.total);
        }

        public String toString() {
            return "MusicList(data=" + this.data + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + Separators.RPAREN;
        }

        public MusicList(List<MusicItemBean> data, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.pageNum = i;
            this.pageSize = i2;
            this.total = i3;
        }

        public final List<MusicItemBean> getData() {
            return this.data;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final int getTotal() {
            return this.total;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Jy\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00106\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\nHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006:"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicItemBean;", "", "cornerMark", "", "cover", "id", "", "pageLabel", "listLabel", "memberEnable", "", "name", "playTimes", Constants.SORT, "duration", "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JJILjava/lang/String;)V", "getCornerMark", "()Ljava/lang/String;", "getCover", "getId", "()J", "getPageLabel", "getListLabel", "getMemberEnable", "()I", "getName", "getPlayTimes", "getSort", "getDuration", "setDuration", "(I)V", "getFilePath", "setFilePath", "(Ljava/lang/String;)V", "downloaded", "", "getDownloaded", "()Z", "setDownloaded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicItemBean {
        private final String cornerMark;
        private final String cover;
        private boolean downloaded;
        private int duration;
        private String filePath;
        private final long id;
        private final String listLabel;
        private final int memberEnable;
        private final String name;
        private final String pageLabel;
        private final long playTimes;
        private final long sort;

        /* renamed from: component1, reason: from getter */
        public final String getCornerMark() {
            return this.cornerMark;
        }

        /* renamed from: component10, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component11, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCover() {
            return this.cover;
        }

        /* renamed from: component3, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPageLabel() {
            return this.pageLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final String getListLabel() {
            return this.listLabel;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMemberEnable() {
            return this.memberEnable;
        }

        /* renamed from: component7, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component8, reason: from getter */
        public final long getPlayTimes() {
            return this.playTimes;
        }

        /* renamed from: component9, reason: from getter */
        public final long getSort() {
            return this.sort;
        }

        public final MusicItemBean copy(String cornerMark, String cover, long id2, String pageLabel, String listLabel, int memberEnable, String name, long playTimes, long sort, int duration, String filePath) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(pageLabel, "pageLabel");
            Intrinsics.checkNotNullParameter(listLabel, "listLabel");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return new MusicItemBean(cornerMark, cover, id2, pageLabel, listLabel, memberEnable, name, playTimes, sort, duration, filePath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicItemBean)) {
                return false;
            }
            MusicItemBean musicItemBean = (MusicItemBean) other;
            return Intrinsics.areEqual(this.cornerMark, musicItemBean.cornerMark) && Intrinsics.areEqual(this.cover, musicItemBean.cover) && this.id == musicItemBean.id && Intrinsics.areEqual(this.pageLabel, musicItemBean.pageLabel) && Intrinsics.areEqual(this.listLabel, musicItemBean.listLabel) && this.memberEnable == musicItemBean.memberEnable && Intrinsics.areEqual(this.name, musicItemBean.name) && this.playTimes == musicItemBean.playTimes && this.sort == musicItemBean.sort && this.duration == musicItemBean.duration && Intrinsics.areEqual(this.filePath, musicItemBean.filePath);
        }

        public int hashCode() {
            String str = this.cornerMark;
            return ((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.cover.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.pageLabel.hashCode()) * 31) + this.listLabel.hashCode()) * 31) + Integer.hashCode(this.memberEnable)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.playTimes)) * 31) + Long.hashCode(this.sort)) * 31) + Integer.hashCode(this.duration)) * 31) + this.filePath.hashCode();
        }

        public String toString() {
            return "MusicItemBean(cornerMark=" + this.cornerMark + ", cover=" + this.cover + ", id=" + this.id + ", pageLabel=" + this.pageLabel + ", listLabel=" + this.listLabel + ", memberEnable=" + this.memberEnable + ", name=" + this.name + ", playTimes=" + this.playTimes + ", sort=" + this.sort + ", duration=" + this.duration + ", filePath=" + this.filePath + Separators.RPAREN;
        }

        public MusicItemBean(String str, String cover, long j, String pageLabel, String listLabel, int i, String name, long j2, long j3, int i2, String filePath) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(pageLabel, "pageLabel");
            Intrinsics.checkNotNullParameter(listLabel, "listLabel");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            this.cornerMark = str;
            this.cover = cover;
            this.id = j;
            this.pageLabel = pageLabel;
            this.listLabel = listLabel;
            this.memberEnable = i;
            this.name = name;
            this.playTimes = j2;
            this.sort = j3;
            this.duration = i2;
            this.filePath = filePath;
        }

        public /* synthetic */ MusicItemBean(String str, String str2, long j, String str3, String str4, int i, String str5, long j2, long j3, int i2, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, str2, j, str3, str4, i, str5, j2, j3, i2, str6);
        }

        public final String getCornerMark() {
            return this.cornerMark;
        }

        public final String getCover() {
            return this.cover;
        }

        public final long getId() {
            return this.id;
        }

        public final String getPageLabel() {
            return this.pageLabel;
        }

        public final String getListLabel() {
            return this.listLabel;
        }

        public final int getMemberEnable() {
            return this.memberEnable;
        }

        public final String getName() {
            return this.name;
        }

        public final long getPlayTimes() {
            return this.playTimes;
        }

        public final long getSort() {
            return this.sort;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final void setDuration(int i) {
            this.duration = i;
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public final void setFilePath(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.filePath = str;
        }

        public final boolean getDownloaded() {
            return this.downloaded;
        }

        public final void setDownloaded(boolean z) {
            this.downloaded = z;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J×\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\tHÆ\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\tHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#¨\u0006M"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicInfo;", "", "auditionFile", "", "backgroundImg", "contentLabel", "cornerMark", "cover", "duration", "", "filePath", "id", "", "isFavorite", "listLabel", "memberEnable", "memberLabel", "name", "playTimes", Constants.SORT, "summary", "descInfo", "", "Lcom/wakeup/common/network/entity/BasicResponse$DescInfo;", "musicCategoryId", "musicTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/List;II)V", "getAuditionFile", "()Ljava/lang/String;", "getBackgroundImg", "getContentLabel", "getCornerMark", "getCover", "getDuration", "()I", "setDuration", "(I)V", "getFilePath", "getId", "()J", "getListLabel", "getMemberEnable", "getMemberLabel", "getName", "getPlayTimes", "getSort", "getSummary", "getDescInfo", "()Ljava/util/List;", "getMusicCategoryId", "getMusicTypeId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicInfo {
        private final String auditionFile;
        private final String backgroundImg;
        private final String contentLabel;
        private final String cornerMark;
        private final String cover;
        private final List<DescInfo> descInfo;
        private int duration;
        private final String filePath;
        private final long id;
        private final int isFavorite;
        private final String listLabel;
        private final int memberEnable;
        private final String memberLabel;
        private final int musicCategoryId;
        private final int musicTypeId;
        private final String name;
        private final long playTimes;
        private final long sort;
        private final String summary;

        public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, String str3, String str4, String str5, int i, String str6, long j, int i2, String str7, int i3, String str8, String str9, long j2, long j3, String str10, List list, int i4, int i5, int i6, Object obj) {
            int i7;
            int i8;
            String str11 = (i6 & 1) != 0 ? musicInfo.auditionFile : str;
            String str12 = (i6 & 2) != 0 ? musicInfo.backgroundImg : str2;
            String str13 = (i6 & 4) != 0 ? musicInfo.contentLabel : str3;
            String str14 = (i6 & 8) != 0 ? musicInfo.cornerMark : str4;
            String str15 = (i6 & 16) != 0 ? musicInfo.cover : str5;
            int i9 = (i6 & 32) != 0 ? musicInfo.duration : i;
            String str16 = (i6 & 64) != 0 ? musicInfo.filePath : str6;
            long j4 = (i6 & 128) != 0 ? musicInfo.id : j;
            int i10 = (i6 & 256) != 0 ? musicInfo.isFavorite : i2;
            String str17 = (i6 & 512) != 0 ? musicInfo.listLabel : str7;
            int i11 = (i6 & 1024) != 0 ? musicInfo.memberEnable : i3;
            String str18 = (i6 & 2048) != 0 ? musicInfo.memberLabel : str8;
            String str19 = (i6 & 4096) != 0 ? musicInfo.name : str9;
            String str20 = str11;
            String str21 = str12;
            long j5 = (i6 & 8192) != 0 ? musicInfo.playTimes : j2;
            long j6 = (i6 & 16384) != 0 ? musicInfo.sort : j3;
            String str22 = (i6 & 32768) != 0 ? musicInfo.summary : str10;
            List list2 = (i6 & 65536) != 0 ? musicInfo.descInfo : list;
            int i12 = (i6 & 131072) != 0 ? musicInfo.musicCategoryId : i4;
            if ((i6 & 262144) != 0) {
                i8 = i12;
                i7 = musicInfo.musicTypeId;
            } else {
                i7 = i5;
                i8 = i12;
            }
            return musicInfo.copy(str20, str21, str13, str14, str15, i9, str16, j4, i10, str17, i11, str18, str19, j5, j6, str22, list2, i8, i7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAuditionFile() {
            return this.auditionFile;
        }

        /* renamed from: component10, reason: from getter */
        public final String getListLabel() {
            return this.listLabel;
        }

        /* renamed from: component11, reason: from getter */
        public final int getMemberEnable() {
            return this.memberEnable;
        }

        /* renamed from: component12, reason: from getter */
        public final String getMemberLabel() {
            return this.memberLabel;
        }

        /* renamed from: component13, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component14, reason: from getter */
        public final long getPlayTimes() {
            return this.playTimes;
        }

        /* renamed from: component15, reason: from getter */
        public final long getSort() {
            return this.sort;
        }

        /* renamed from: component16, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final List<DescInfo> component17() {
            return this.descInfo;
        }

        /* renamed from: component18, reason: from getter */
        public final int getMusicCategoryId() {
            return this.musicCategoryId;
        }

        /* renamed from: component19, reason: from getter */
        public final int getMusicTypeId() {
            return this.musicTypeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundImg() {
            return this.backgroundImg;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContentLabel() {
            return this.contentLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCornerMark() {
            return this.cornerMark;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCover() {
            return this.cover;
        }

        /* renamed from: component6, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* renamed from: component8, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component9, reason: from getter */
        public final int getIsFavorite() {
            return this.isFavorite;
        }

        public final MusicInfo copy(String auditionFile, String backgroundImg, String contentLabel, String cornerMark, String cover, int duration, String filePath, long id2, int isFavorite, String listLabel, int memberEnable, String memberLabel, String name, long playTimes, long sort, String summary, List<DescInfo> descInfo, int musicCategoryId, int musicTypeId) {
            Intrinsics.checkNotNullParameter(auditionFile, "auditionFile");
            Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
            Intrinsics.checkNotNullParameter(cornerMark, "cornerMark");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(name, "name");
            return new MusicInfo(auditionFile, backgroundImg, contentLabel, cornerMark, cover, duration, filePath, id2, isFavorite, listLabel, memberEnable, memberLabel, name, playTimes, sort, summary, descInfo, musicCategoryId, musicTypeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicInfo)) {
                return false;
            }
            MusicInfo musicInfo = (MusicInfo) other;
            return Intrinsics.areEqual(this.auditionFile, musicInfo.auditionFile) && Intrinsics.areEqual(this.backgroundImg, musicInfo.backgroundImg) && Intrinsics.areEqual(this.contentLabel, musicInfo.contentLabel) && Intrinsics.areEqual(this.cornerMark, musicInfo.cornerMark) && Intrinsics.areEqual(this.cover, musicInfo.cover) && this.duration == musicInfo.duration && Intrinsics.areEqual(this.filePath, musicInfo.filePath) && this.id == musicInfo.id && this.isFavorite == musicInfo.isFavorite && Intrinsics.areEqual(this.listLabel, musicInfo.listLabel) && this.memberEnable == musicInfo.memberEnable && Intrinsics.areEqual(this.memberLabel, musicInfo.memberLabel) && Intrinsics.areEqual(this.name, musicInfo.name) && this.playTimes == musicInfo.playTimes && this.sort == musicInfo.sort && Intrinsics.areEqual(this.summary, musicInfo.summary) && Intrinsics.areEqual(this.descInfo, musicInfo.descInfo) && this.musicCategoryId == musicInfo.musicCategoryId && this.musicTypeId == musicInfo.musicTypeId;
        }

        public int hashCode() {
            int hashCode = ((this.auditionFile.hashCode() * 31) + this.backgroundImg.hashCode()) * 31;
            String str = this.contentLabel;
            int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cornerMark.hashCode()) * 31) + this.cover.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.filePath.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Integer.hashCode(this.isFavorite)) * 31;
            String str2 = this.listLabel;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.memberEnable)) * 31;
            String str3 = this.memberLabel;
            int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.playTimes)) * 31) + Long.hashCode(this.sort)) * 31;
            String str4 = this.summary;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<DescInfo> list = this.descInfo;
            return ((((hashCode5 + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.musicCategoryId)) * 31) + Integer.hashCode(this.musicTypeId);
        }

        public String toString() {
            return "MusicInfo(auditionFile=" + this.auditionFile + ", backgroundImg=" + this.backgroundImg + ", contentLabel=" + this.contentLabel + ", cornerMark=" + this.cornerMark + ", cover=" + this.cover + ", duration=" + this.duration + ", filePath=" + this.filePath + ", id=" + this.id + ", isFavorite=" + this.isFavorite + ", listLabel=" + this.listLabel + ", memberEnable=" + this.memberEnable + ", memberLabel=" + this.memberLabel + ", name=" + this.name + ", playTimes=" + this.playTimes + ", sort=" + this.sort + ", summary=" + this.summary + ", descInfo=" + this.descInfo + ", musicCategoryId=" + this.musicCategoryId + ", musicTypeId=" + this.musicTypeId + Separators.RPAREN;
        }

        public MusicInfo(String auditionFile, String backgroundImg, String str, String cornerMark, String cover, int i, String filePath, long j, int i2, String str2, int i3, String str3, String name, long j2, long j3, String str4, List<DescInfo> list, int i4, int i5) {
            Intrinsics.checkNotNullParameter(auditionFile, "auditionFile");
            Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
            Intrinsics.checkNotNullParameter(cornerMark, "cornerMark");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(name, "name");
            this.auditionFile = auditionFile;
            this.backgroundImg = backgroundImg;
            this.contentLabel = str;
            this.cornerMark = cornerMark;
            this.cover = cover;
            this.duration = i;
            this.filePath = filePath;
            this.id = j;
            this.isFavorite = i2;
            this.listLabel = str2;
            this.memberEnable = i3;
            this.memberLabel = str3;
            this.name = name;
            this.playTimes = j2;
            this.sort = j3;
            this.summary = str4;
            this.descInfo = list;
            this.musicCategoryId = i4;
            this.musicTypeId = i5;
        }

        public /* synthetic */ MusicInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, long j, int i2, String str7, int i3, String str8, String str9, long j2, long j3, String str10, List list, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i6 & 4) != 0 ? null : str3, str4, str5, i, str6, j, i2, (i6 & 512) != 0 ? null : str7, i3, (i6 & 2048) != 0 ? null : str8, str9, j2, j3, (32768 & i6) != 0 ? null : str10, (65536 & i6) != 0 ? null : list, (131072 & i6) != 0 ? 0 : i4, (i6 & 262144) != 0 ? 0 : i5);
        }

        public final String getAuditionFile() {
            return this.auditionFile;
        }

        public final String getBackgroundImg() {
            return this.backgroundImg;
        }

        public final String getContentLabel() {
            return this.contentLabel;
        }

        public final String getCornerMark() {
            return this.cornerMark;
        }

        public final String getCover() {
            return this.cover;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final void setDuration(int i) {
            this.duration = i;
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public final long getId() {
            return this.id;
        }

        public final int isFavorite() {
            return this.isFavorite;
        }

        public final String getListLabel() {
            return this.listLabel;
        }

        public final int getMemberEnable() {
            return this.memberEnable;
        }

        public final String getMemberLabel() {
            return this.memberLabel;
        }

        public final String getName() {
            return this.name;
        }

        public final long getPlayTimes() {
            return this.playTimes;
        }

        public final long getSort() {
            return this.sort;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final List<DescInfo> getDescInfo() {
            return this.descInfo;
        }

        public final int getMusicCategoryId() {
            return this.musicCategoryId;
        }

        public final int getMusicTypeId() {
            return this.musicTypeId;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicCollectTabType;", "", "id", "", "typeId", "", "name", "", "categoryId", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getCategoryId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/BasicResponse$MusicCollectTabType;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicCollectTabType {
        private final Integer categoryId;
        private final Long id;
        private final String name;
        private final Integer typeId;

        public static /* synthetic */ MusicCollectTabType copy$default(MusicCollectTabType musicCollectTabType, Long l, Integer num, String str, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = musicCollectTabType.id;
            }
            if ((i & 2) != 0) {
                num = musicCollectTabType.typeId;
            }
            if ((i & 4) != 0) {
                str = musicCollectTabType.name;
            }
            if ((i & 8) != 0) {
                num2 = musicCollectTabType.categoryId;
            }
            return musicCollectTabType.copy(l, num, str, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getTypeId() {
            return this.typeId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getCategoryId() {
            return this.categoryId;
        }

        public final MusicCollectTabType copy(Long id2, Integer typeId, String name, Integer categoryId) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MusicCollectTabType(id2, typeId, name, categoryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicCollectTabType)) {
                return false;
            }
            MusicCollectTabType musicCollectTabType = (MusicCollectTabType) other;
            return Intrinsics.areEqual(this.id, musicCollectTabType.id) && Intrinsics.areEqual(this.typeId, musicCollectTabType.typeId) && Intrinsics.areEqual(this.name, musicCollectTabType.name) && Intrinsics.areEqual(this.categoryId, musicCollectTabType.categoryId);
        }

        public int hashCode() {
            Long l = this.id;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Integer num = this.typeId;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.name.hashCode()) * 31;
            Integer num2 = this.categoryId;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "MusicCollectTabType(id=" + this.id + ", typeId=" + this.typeId + ", name=" + this.name + ", categoryId=" + this.categoryId + Separators.RPAREN;
        }

        public MusicCollectTabType(Long l, Integer num, String name, Integer num2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = l;
            this.typeId = num;
            this.name = name;
            this.categoryId = num2;
        }

        public /* synthetic */ MusicCollectTabType(Long l, Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, str, (i & 8) != 0 ? null : num2);
        }

        public final Long getId() {
            return this.id;
        }

        public final Integer getTypeId() {
            return this.typeId;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getCategoryId() {
            return this.categoryId;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicCollect;", "", "data", "", "Lcom/wakeup/common/network/entity/BasicResponse$MusicItemBean;", "pageNum", "", "pageSize", "total", "<init>", "(Ljava/util/List;III)V", "getData", "()Ljava/util/List;", "getPageNum", "()I", "getPageSize", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicCollect {
        private final List<MusicItemBean> data;
        private final int pageNum;
        private final int pageSize;
        private final int total;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicCollect copy$default(MusicCollect musicCollect, List list, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                list = musicCollect.data;
            }
            if ((i4 & 2) != 0) {
                i = musicCollect.pageNum;
            }
            if ((i4 & 4) != 0) {
                i2 = musicCollect.pageSize;
            }
            if ((i4 & 8) != 0) {
                i3 = musicCollect.total;
            }
            return musicCollect.copy(list, i, i2, i3);
        }

        public final List<MusicItemBean> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        public final MusicCollect copy(List<MusicItemBean> data, int pageNum, int pageSize, int total) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new MusicCollect(data, pageNum, pageSize, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicCollect)) {
                return false;
            }
            MusicCollect musicCollect = (MusicCollect) other;
            return Intrinsics.areEqual(this.data, musicCollect.data) && this.pageNum == musicCollect.pageNum && this.pageSize == musicCollect.pageSize && this.total == musicCollect.total;
        }

        public int hashCode() {
            return (((((this.data.hashCode() * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.total);
        }

        public String toString() {
            return "MusicCollect(data=" + this.data + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + Separators.RPAREN;
        }

        public MusicCollect(List<MusicItemBean> data, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.pageNum = i;
            this.pageSize = i2;
            this.total = i3;
        }

        public final List<MusicItemBean> getData() {
            return this.data;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final int getTotal() {
            return this.total;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BreathTrainRecord;", "", "totalCount", "", "totalDuration", "image", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<init>", "(IILjava/util/ArrayList;)V", "getTotalCount", "()I", "getTotalDuration", "getImage", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BreathTrainRecord {
        private final ArrayList<String> image;
        private final int totalCount;
        private final int totalDuration;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BreathTrainRecord copy$default(BreathTrainRecord breathTrainRecord, int i, int i2, ArrayList arrayList, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = breathTrainRecord.totalCount;
            }
            if ((i3 & 2) != 0) {
                i2 = breathTrainRecord.totalDuration;
            }
            if ((i3 & 4) != 0) {
                arrayList = breathTrainRecord.image;
            }
            return breathTrainRecord.copy(i, i2, arrayList);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalDuration() {
            return this.totalDuration;
        }

        public final ArrayList<String> component3() {
            return this.image;
        }

        public final BreathTrainRecord copy(int totalCount, int totalDuration, ArrayList<String> image) {
            return new BreathTrainRecord(totalCount, totalDuration, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BreathTrainRecord)) {
                return false;
            }
            BreathTrainRecord breathTrainRecord = (BreathTrainRecord) other;
            return this.totalCount == breathTrainRecord.totalCount && this.totalDuration == breathTrainRecord.totalDuration && Intrinsics.areEqual(this.image, breathTrainRecord.image);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.totalCount) * 31) + Integer.hashCode(this.totalDuration)) * 31;
            ArrayList<String> arrayList = this.image;
            return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
        }

        public String toString() {
            return "BreathTrainRecord(totalCount=" + this.totalCount + ", totalDuration=" + this.totalDuration + ", image=" + this.image + Separators.RPAREN;
        }

        public BreathTrainRecord(int i, int i2, ArrayList<String> arrayList) {
            this.totalCount = i;
            this.totalDuration = i2;
            this.image = arrayList;
        }

        public /* synthetic */ BreathTrainRecord(int i, int i2, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : arrayList);
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final int getTotalDuration() {
            return this.totalDuration;
        }

        public final ArrayList<String> getImage() {
            return this.image;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BackgroundMusic;", "", "data", "", "Lcom/wakeup/common/network/entity/BasicResponse$BackgroundMusicBean;", "pageNum", "", "pageSize", "total", "<init>", "(Ljava/util/List;JJJ)V", "getData", "()Ljava/util/List;", "getPageNum", "()J", "getPageSize", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundMusic {
        private final List<BackgroundMusicBean> data;
        private final long pageNum;
        private final long pageSize;
        private final long total;

        public static /* synthetic */ BackgroundMusic copy$default(BackgroundMusic backgroundMusic, List list, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = backgroundMusic.data;
            }
            if ((i & 2) != 0) {
                j = backgroundMusic.pageNum;
            }
            if ((i & 4) != 0) {
                j2 = backgroundMusic.pageSize;
            }
            if ((i & 8) != 0) {
                j3 = backgroundMusic.total;
            }
            long j4 = j3;
            return backgroundMusic.copy(list, j, j2, j4);
        }

        public final List<BackgroundMusicBean> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final long getPageNum() {
            return this.pageNum;
        }

        /* renamed from: component3, reason: from getter */
        public final long getPageSize() {
            return this.pageSize;
        }

        /* renamed from: component4, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        public final BackgroundMusic copy(List<BackgroundMusicBean> data, long pageNum, long pageSize, long total) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new BackgroundMusic(data, pageNum, pageSize, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundMusic)) {
                return false;
            }
            BackgroundMusic backgroundMusic = (BackgroundMusic) other;
            return Intrinsics.areEqual(this.data, backgroundMusic.data) && this.pageNum == backgroundMusic.pageNum && this.pageSize == backgroundMusic.pageSize && this.total == backgroundMusic.total;
        }

        public int hashCode() {
            return (((((this.data.hashCode() * 31) + Long.hashCode(this.pageNum)) * 31) + Long.hashCode(this.pageSize)) * 31) + Long.hashCode(this.total);
        }

        public String toString() {
            return "BackgroundMusic(data=" + this.data + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + Separators.RPAREN;
        }

        public BackgroundMusic(List<BackgroundMusicBean> data, long j, long j2, long j3) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.pageNum = j;
            this.pageSize = j2;
            this.total = j3;
        }

        public final List<BackgroundMusicBean> getData() {
            return this.data;
        }

        public final long getPageNum() {
            return this.pageNum;
        }

        public final long getPageSize() {
            return this.pageSize;
        }

        public final long getTotal() {
            return this.total;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BackgroundMusicBean;", "Ljava/io/Serializable;", "backgroundImg", "", "cover", "filePath", "id", "", "name", "playTimes", Constants.SORT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJ)V", "getBackgroundImg", "()Ljava/lang/String;", "getCover", "getFilePath", "getId", "()J", "getName", "getPlayTimes", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundMusicBean implements Serializable {
        private final String backgroundImg;
        private final String cover;
        private final String filePath;
        private final long id;
        private final String name;
        private final long playTimes;
        private final long sort;

        public static /* synthetic */ BackgroundMusicBean copy$default(BackgroundMusicBean backgroundMusicBean, String str, String str2, String str3, long j, String str4, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = backgroundMusicBean.backgroundImg;
            }
            if ((i & 2) != 0) {
                str2 = backgroundMusicBean.cover;
            }
            if ((i & 4) != 0) {
                str3 = backgroundMusicBean.filePath;
            }
            if ((i & 8) != 0) {
                j = backgroundMusicBean.id;
            }
            if ((i & 16) != 0) {
                str4 = backgroundMusicBean.name;
            }
            if ((i & 32) != 0) {
                j2 = backgroundMusicBean.playTimes;
            }
            if ((i & 64) != 0) {
                j3 = backgroundMusicBean.sort;
            }
            String str5 = str4;
            long j4 = j;
            String str6 = str3;
            return backgroundMusicBean.copy(str, str2, str6, j4, str5, j2, j3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundImg() {
            return this.backgroundImg;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCover() {
            return this.cover;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* renamed from: component4, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final long getPlayTimes() {
            return this.playTimes;
        }

        /* renamed from: component7, reason: from getter */
        public final long getSort() {
            return this.sort;
        }

        public final BackgroundMusicBean copy(String backgroundImg, String cover, String filePath, long id2, String name, long playTimes, long sort) {
            Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(name, "name");
            return new BackgroundMusicBean(backgroundImg, cover, filePath, id2, name, playTimes, sort);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundMusicBean)) {
                return false;
            }
            BackgroundMusicBean backgroundMusicBean = (BackgroundMusicBean) other;
            return Intrinsics.areEqual(this.backgroundImg, backgroundMusicBean.backgroundImg) && Intrinsics.areEqual(this.cover, backgroundMusicBean.cover) && Intrinsics.areEqual(this.filePath, backgroundMusicBean.filePath) && this.id == backgroundMusicBean.id && Intrinsics.areEqual(this.name, backgroundMusicBean.name) && this.playTimes == backgroundMusicBean.playTimes && this.sort == backgroundMusicBean.sort;
        }

        public int hashCode() {
            return (((((((((((this.backgroundImg.hashCode() * 31) + this.cover.hashCode()) * 31) + this.filePath.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.playTimes)) * 31) + Long.hashCode(this.sort);
        }

        public String toString() {
            return "BackgroundMusicBean(backgroundImg=" + this.backgroundImg + ", cover=" + this.cover + ", filePath=" + this.filePath + ", id=" + this.id + ", name=" + this.name + ", playTimes=" + this.playTimes + ", sort=" + this.sort + Separators.RPAREN;
        }

        public BackgroundMusicBean(String backgroundImg, String cover, String filePath, long j, String name, long j2, long j3) {
            Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
            Intrinsics.checkNotNullParameter(cover, "cover");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(name, "name");
            this.backgroundImg = backgroundImg;
            this.cover = cover;
            this.filePath = filePath;
            this.id = j;
            this.name = name;
            this.playTimes = j2;
            this.sort = j3;
        }

        public final String getBackgroundImg() {
            return this.backgroundImg;
        }

        public final String getCover() {
            return this.cover;
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public final long getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final long getPlayTimes() {
            return this.playTimes;
        }

        public final long getSort() {
            return this.sort;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MusicFavorite;", "", "status", "", "favoritePage", "", "", "favoritePages", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "getStatus", "()I", "getFavoritePage", "()Ljava/util/List;", "getFavoritePages", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicFavorite {
        private final List<String> favoritePage;
        private final String favoritePages;
        private final int status;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicFavorite copy$default(MusicFavorite musicFavorite, int i, List list, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = musicFavorite.status;
            }
            if ((i2 & 2) != 0) {
                list = musicFavorite.favoritePage;
            }
            if ((i2 & 4) != 0) {
                str = musicFavorite.favoritePages;
            }
            return musicFavorite.copy(i, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        public final List<String> component2() {
            return this.favoritePage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFavoritePages() {
            return this.favoritePages;
        }

        public final MusicFavorite copy(int status, List<String> favoritePage, String favoritePages) {
            return new MusicFavorite(status, favoritePage, favoritePages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicFavorite)) {
                return false;
            }
            MusicFavorite musicFavorite = (MusicFavorite) other;
            return this.status == musicFavorite.status && Intrinsics.areEqual(this.favoritePage, musicFavorite.favoritePage) && Intrinsics.areEqual(this.favoritePages, musicFavorite.favoritePages);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.status) * 31;
            List<String> list = this.favoritePage;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.favoritePages;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "MusicFavorite(status=" + this.status + ", favoritePage=" + this.favoritePage + ", favoritePages=" + this.favoritePages + Separators.RPAREN;
        }

        public MusicFavorite(int i, List<String> list, String str) {
            this.status = i;
            this.favoritePage = list;
            this.favoritePages = str;
        }

        public /* synthetic */ MusicFavorite(int i, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str);
        }

        public final int getStatus() {
            return this.status;
        }

        public final List<String> getFavoritePage() {
            return this.favoritePage;
        }

        public final String getFavoritePages() {
            return this.favoritePages;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$AliDialOrderInfo;", "", "paySgin", "", "orderNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaySgin", "()Ljava/lang/String;", "getOrderNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AliDialOrderInfo {
        private final String orderNo;
        private final String paySgin;

        public static /* synthetic */ AliDialOrderInfo copy$default(AliDialOrderInfo aliDialOrderInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aliDialOrderInfo.paySgin;
            }
            if ((i & 2) != 0) {
                str2 = aliDialOrderInfo.orderNo;
            }
            return aliDialOrderInfo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaySgin() {
            return this.paySgin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        public final AliDialOrderInfo copy(String paySgin, String orderNo) {
            Intrinsics.checkNotNullParameter(paySgin, "paySgin");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            return new AliDialOrderInfo(paySgin, orderNo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AliDialOrderInfo)) {
                return false;
            }
            AliDialOrderInfo aliDialOrderInfo = (AliDialOrderInfo) other;
            return Intrinsics.areEqual(this.paySgin, aliDialOrderInfo.paySgin) && Intrinsics.areEqual(this.orderNo, aliDialOrderInfo.orderNo);
        }

        public int hashCode() {
            return (this.paySgin.hashCode() * 31) + this.orderNo.hashCode();
        }

        public String toString() {
            return "AliDialOrderInfo(paySgin=" + this.paySgin + ", orderNo=" + this.orderNo + Separators.RPAREN;
        }

        public AliDialOrderInfo(String paySgin, String orderNo) {
            Intrinsics.checkNotNullParameter(paySgin, "paySgin");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            this.paySgin = paySgin;
            this.orderNo = orderNo;
        }

        public final String getPaySgin() {
            return this.paySgin;
        }

        public final String getOrderNo() {
            return this.orderNo;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$FeedBackRecord;", "", "id", "", "problemType", "", "issue", "logFlag", "issueNo", "problemTypeId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProblemType", "()Ljava/lang/String;", "getIssue", "getLogFlag", "getIssueNo", "getProblemTypeId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/BasicResponse$FeedBackRecord;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeedBackRecord {
        private Integer id;
        private final String issue;
        private final String issueNo;
        private final Integer logFlag;
        private final String problemType;
        private final Integer problemTypeId;

        public FeedBackRecord() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ FeedBackRecord copy$default(FeedBackRecord feedBackRecord, Integer num, String str, String str2, Integer num2, String str3, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = feedBackRecord.id;
            }
            if ((i & 2) != 0) {
                str = feedBackRecord.problemType;
            }
            if ((i & 4) != 0) {
                str2 = feedBackRecord.issue;
            }
            if ((i & 8) != 0) {
                num2 = feedBackRecord.logFlag;
            }
            if ((i & 16) != 0) {
                str3 = feedBackRecord.issueNo;
            }
            if ((i & 32) != 0) {
                num3 = feedBackRecord.problemTypeId;
            }
            String str4 = str3;
            Integer num4 = num3;
            return feedBackRecord.copy(num, str, str2, num2, str4, num4);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProblemType() {
            return this.problemType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIssue() {
            return this.issue;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLogFlag() {
            return this.logFlag;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIssueNo() {
            return this.issueNo;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getProblemTypeId() {
            return this.problemTypeId;
        }

        public final FeedBackRecord copy(Integer id2, String problemType, String issue, Integer logFlag, String issueNo, Integer problemTypeId) {
            return new FeedBackRecord(id2, problemType, issue, logFlag, issueNo, problemTypeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedBackRecord)) {
                return false;
            }
            FeedBackRecord feedBackRecord = (FeedBackRecord) other;
            return Intrinsics.areEqual(this.id, feedBackRecord.id) && Intrinsics.areEqual(this.problemType, feedBackRecord.problemType) && Intrinsics.areEqual(this.issue, feedBackRecord.issue) && Intrinsics.areEqual(this.logFlag, feedBackRecord.logFlag) && Intrinsics.areEqual(this.issueNo, feedBackRecord.issueNo) && Intrinsics.areEqual(this.problemTypeId, feedBackRecord.problemTypeId);
        }

        public int hashCode() {
            Integer num = this.id;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.problemType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.issue;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.logFlag;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.issueNo;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num3 = this.problemTypeId;
            return hashCode5 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "FeedBackRecord(id=" + this.id + ", problemType=" + this.problemType + ", issue=" + this.issue + ", logFlag=" + this.logFlag + ", issueNo=" + this.issueNo + ", problemTypeId=" + this.problemTypeId + Separators.RPAREN;
        }

        public FeedBackRecord(Integer num, String str, String str2, Integer num2, String str3, Integer num3) {
            this.id = num;
            this.problemType = str;
            this.issue = str2;
            this.logFlag = num2;
            this.issueNo = str3;
            this.problemTypeId = num3;
        }

        public /* synthetic */ FeedBackRecord(Integer num, String str, String str2, Integer num2, String str3, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num3);
        }

        public final Integer getId() {
            return this.id;
        }

        public final void setId(Integer num) {
            this.id = num;
        }

        public final String getProblemType() {
            return this.problemType;
        }

        public final String getIssue() {
            return this.issue;
        }

        public final Integer getLogFlag() {
            return this.logFlag;
        }

        public final String getIssueNo() {
            return this.issueNo;
        }

        public final Integer getProblemTypeId() {
            return this.problemTypeId;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$IssueEntity;", "", "userId", "", "typeName", "content", "appVersion", "", "phoneModel", "androidVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getTypeName", "getContent", "getAppVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhoneModel", "getAndroidVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/BasicResponse$IssueEntity;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IssueEntity {
        private final Integer androidVersion;
        private final Integer appVersion;
        private final String content;
        private final String phoneModel;
        private final String typeName;
        private String userId;

        public IssueEntity() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ IssueEntity copy$default(IssueEntity issueEntity, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = issueEntity.userId;
            }
            if ((i & 2) != 0) {
                str2 = issueEntity.typeName;
            }
            if ((i & 4) != 0) {
                str3 = issueEntity.content;
            }
            if ((i & 8) != 0) {
                num = issueEntity.appVersion;
            }
            if ((i & 16) != 0) {
                str4 = issueEntity.phoneModel;
            }
            if ((i & 32) != 0) {
                num2 = issueEntity.androidVersion;
            }
            String str5 = str4;
            Integer num3 = num2;
            return issueEntity.copy(str, str2, str3, num, str5, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPhoneModel() {
            return this.phoneModel;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getAndroidVersion() {
            return this.androidVersion;
        }

        public final IssueEntity copy(String userId, String typeName, String content, Integer appVersion, String phoneModel, Integer androidVersion) {
            return new IssueEntity(userId, typeName, content, appVersion, phoneModel, androidVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IssueEntity)) {
                return false;
            }
            IssueEntity issueEntity = (IssueEntity) other;
            return Intrinsics.areEqual(this.userId, issueEntity.userId) && Intrinsics.areEqual(this.typeName, issueEntity.typeName) && Intrinsics.areEqual(this.content, issueEntity.content) && Intrinsics.areEqual(this.appVersion, issueEntity.appVersion) && Intrinsics.areEqual(this.phoneModel, issueEntity.phoneModel) && Intrinsics.areEqual(this.androidVersion, issueEntity.androidVersion);
        }

        public int hashCode() {
            String str = this.userId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.typeName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.content;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.appVersion;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.phoneModel;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.androidVersion;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "IssueEntity(userId=" + this.userId + ", typeName=" + this.typeName + ", content=" + this.content + ", appVersion=" + this.appVersion + ", phoneModel=" + this.phoneModel + ", androidVersion=" + this.androidVersion + Separators.RPAREN;
        }

        public IssueEntity(String str, String str2, String str3, Integer num, String str4, Integer num2) {
            this.userId = str;
            this.typeName = str2;
            this.content = str3;
            this.appVersion = num;
            this.phoneModel = str4;
            this.androidVersion = num2;
        }

        public /* synthetic */ IssueEntity(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setUserId(String str) {
            this.userId = str;
        }

        public final String getTypeName() {
            return this.typeName;
        }

        public final String getContent() {
            return this.content;
        }

        public final Integer getAppVersion() {
            return this.appVersion;
        }

        public final String getPhoneModel() {
            return this.phoneModel;
        }

        public final Integer getAndroidVersion() {
            return this.androidVersion;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0010¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$MemberInterest;", "Ljava/io/Serializable;", "name", "", SocialConstants.PARAM_IMG_URL, "headline", "url", "pointId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getImg", "getHeadline", "getUrl", "setUrl", "(Ljava/lang/String;)V", "getPointId", "setPointId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MemberInterest implements Serializable {
        private final String headline;
        private final String img;
        private final String name;
        private String pointId;
        private String url;

        public MemberInterest() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ MemberInterest copy$default(MemberInterest memberInterest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = memberInterest.name;
            }
            if ((i & 2) != 0) {
                str2 = memberInterest.img;
            }
            if ((i & 4) != 0) {
                str3 = memberInterest.headline;
            }
            if ((i & 8) != 0) {
                str4 = memberInterest.url;
            }
            if ((i & 16) != 0) {
                str5 = memberInterest.pointId;
            }
            String str6 = str5;
            String str7 = str3;
            return memberInterest.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImg() {
            return this.img;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPointId() {
            return this.pointId;
        }

        public final MemberInterest copy(String name, String img, String headline, String url, String pointId) {
            return new MemberInterest(name, img, headline, url, pointId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MemberInterest)) {
                return false;
            }
            MemberInterest memberInterest = (MemberInterest) other;
            return Intrinsics.areEqual(this.name, memberInterest.name) && Intrinsics.areEqual(this.img, memberInterest.img) && Intrinsics.areEqual(this.headline, memberInterest.headline) && Intrinsics.areEqual(this.url, memberInterest.url) && Intrinsics.areEqual(this.pointId, memberInterest.pointId);
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.img;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headline;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.url;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pointId;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "MemberInterest(name=" + this.name + ", img=" + this.img + ", headline=" + this.headline + ", url=" + this.url + ", pointId=" + this.pointId + Separators.RPAREN;
        }

        public MemberInterest(String str, String str2, String str3, String str4, String str5) {
            this.name = str;
            this.img = str2;
            this.headline = str3;
            this.url = str4;
            this.pointId = str5;
        }

        public /* synthetic */ MemberInterest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public final String getName() {
            return this.name;
        }

        public final String getImg() {
            return this.img;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public final String getPointId() {
            return this.pointId;
        }

        public final void setPointId(String str) {
            this.pointId = str;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\nHÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006,"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$IntegralMallVO;", "Ljava/io/Serializable;", "currentPrice", "", "id", "", SocialConstants.PARAM_IMG_URL, "", "name", "originalPrice", "", "thirdPartyUrl", "pointId", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImg", "()Ljava/lang/String;", "getName", "getOriginalPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThirdPartyUrl", "getPointId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/BasicResponse$IntegralMallVO;", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IntegralMallVO implements Serializable {
        private final Double currentPrice;
        private final Long id;
        private final String img;
        private final String name;
        private final Integer originalPrice;
        private final String pointId;
        private final String thirdPartyUrl;

        public static /* synthetic */ IntegralMallVO copy$default(IntegralMallVO integralMallVO, Double d, Long l, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = integralMallVO.currentPrice;
            }
            if ((i & 2) != 0) {
                l = integralMallVO.id;
            }
            if ((i & 4) != 0) {
                str = integralMallVO.img;
            }
            if ((i & 8) != 0) {
                str2 = integralMallVO.name;
            }
            if ((i & 16) != 0) {
                num = integralMallVO.originalPrice;
            }
            if ((i & 32) != 0) {
                str3 = integralMallVO.thirdPartyUrl;
            }
            if ((i & 64) != 0) {
                str4 = integralMallVO.pointId;
            }
            String str5 = str3;
            String str6 = str4;
            Integer num2 = num;
            String str7 = str;
            return integralMallVO.copy(d, l, str7, str2, num2, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final Double getCurrentPrice() {
            return this.currentPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImg() {
            return this.img;
        }

        /* renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getOriginalPrice() {
            return this.originalPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final String getThirdPartyUrl() {
            return this.thirdPartyUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPointId() {
            return this.pointId;
        }

        public final IntegralMallVO copy(Double currentPrice, Long id2, String img, String name, Integer originalPrice, String thirdPartyUrl, String pointId) {
            Intrinsics.checkNotNullParameter(thirdPartyUrl, "thirdPartyUrl");
            return new IntegralMallVO(currentPrice, id2, img, name, originalPrice, thirdPartyUrl, pointId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegralMallVO)) {
                return false;
            }
            IntegralMallVO integralMallVO = (IntegralMallVO) other;
            return Intrinsics.areEqual((Object) this.currentPrice, (Object) integralMallVO.currentPrice) && Intrinsics.areEqual(this.id, integralMallVO.id) && Intrinsics.areEqual(this.img, integralMallVO.img) && Intrinsics.areEqual(this.name, integralMallVO.name) && Intrinsics.areEqual(this.originalPrice, integralMallVO.originalPrice) && Intrinsics.areEqual(this.thirdPartyUrl, integralMallVO.thirdPartyUrl) && Intrinsics.areEqual(this.pointId, integralMallVO.pointId);
        }

        public int hashCode() {
            Double d = this.currentPrice;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Long l = this.id;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.img;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.originalPrice;
            int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.thirdPartyUrl.hashCode()) * 31;
            String str3 = this.pointId;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "IntegralMallVO(currentPrice=" + this.currentPrice + ", id=" + this.id + ", img=" + this.img + ", name=" + this.name + ", originalPrice=" + this.originalPrice + ", thirdPartyUrl=" + this.thirdPartyUrl + ", pointId=" + this.pointId + Separators.RPAREN;
        }

        public IntegralMallVO(Double d, Long l, String str, String str2, Integer num, String thirdPartyUrl, String str3) {
            Intrinsics.checkNotNullParameter(thirdPartyUrl, "thirdPartyUrl");
            this.currentPrice = d;
            this.id = l;
            this.img = str;
            this.name = str2;
            this.originalPrice = num;
            this.thirdPartyUrl = thirdPartyUrl;
            this.pointId = str3;
        }

        public /* synthetic */ IntegralMallVO(Double d, Long l, String str, String str2, Integer num, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, str3, (i & 64) != 0 ? null : str4);
        }

        public final Double getCurrentPrice() {
            return this.currentPrice;
        }

        public final Long getId() {
            return this.id;
        }

        public final String getImg() {
            return this.img;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getOriginalPrice() {
            return this.originalPrice;
        }

        public final String getThirdPartyUrl() {
            return this.thirdPartyUrl;
        }

        public final String getPointId() {
            return this.pointId;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$ChatGPT;", "", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChatGPT {
        private final String content;

        public static /* synthetic */ ChatGPT copy$default(ChatGPT chatGPT, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatGPT.content;
            }
            return chatGPT.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final ChatGPT copy(String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ChatGPT(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChatGPT) && Intrinsics.areEqual(this.content, ((ChatGPT) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ChatGPT(content=" + this.content + Separators.RPAREN;
        }

        public ChatGPT(String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final String getContent() {
            return this.content;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$BaiduAccessToken;", "", "refresh_token", "", com.tencent.connect.common.Constants.PARAM_EXPIRES_IN, "", "session_key", "access_token", com.tencent.connect.common.Constants.PARAM_SCOPE, "session_secret", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefresh_token", "()Ljava/lang/String;", "getExpires_in", "()J", "getSession_key", "getAccess_token", "getScope", "getSession_secret", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BaiduAccessToken {
        private final String access_token;
        private final long expires_in;
        private final String refresh_token;
        private final String scope;
        private final String session_key;
        private final String session_secret;

        public static /* synthetic */ BaiduAccessToken copy$default(BaiduAccessToken baiduAccessToken, String str, long j, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = baiduAccessToken.refresh_token;
            }
            if ((i & 2) != 0) {
                j = baiduAccessToken.expires_in;
            }
            if ((i & 4) != 0) {
                str2 = baiduAccessToken.session_key;
            }
            if ((i & 8) != 0) {
                str3 = baiduAccessToken.access_token;
            }
            if ((i & 16) != 0) {
                str4 = baiduAccessToken.scope;
            }
            if ((i & 32) != 0) {
                str5 = baiduAccessToken.session_secret;
            }
            return baiduAccessToken.copy(str, j, str2, str3, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRefresh_token() {
            return this.refresh_token;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpires_in() {
            return this.expires_in;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSession_key() {
            return this.session_key;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccess_token() {
            return this.access_token;
        }

        /* renamed from: component5, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSession_secret() {
            return this.session_secret;
        }

        public final BaiduAccessToken copy(String refresh_token, long expires_in, String session_key, String access_token, String scope, String session_secret) {
            Intrinsics.checkNotNullParameter(refresh_token, "refresh_token");
            Intrinsics.checkNotNullParameter(session_key, "session_key");
            Intrinsics.checkNotNullParameter(access_token, "access_token");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(session_secret, "session_secret");
            return new BaiduAccessToken(refresh_token, expires_in, session_key, access_token, scope, session_secret);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaiduAccessToken)) {
                return false;
            }
            BaiduAccessToken baiduAccessToken = (BaiduAccessToken) other;
            return Intrinsics.areEqual(this.refresh_token, baiduAccessToken.refresh_token) && this.expires_in == baiduAccessToken.expires_in && Intrinsics.areEqual(this.session_key, baiduAccessToken.session_key) && Intrinsics.areEqual(this.access_token, baiduAccessToken.access_token) && Intrinsics.areEqual(this.scope, baiduAccessToken.scope) && Intrinsics.areEqual(this.session_secret, baiduAccessToken.session_secret);
        }

        public int hashCode() {
            return (((((((((this.refresh_token.hashCode() * 31) + Long.hashCode(this.expires_in)) * 31) + this.session_key.hashCode()) * 31) + this.access_token.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.session_secret.hashCode();
        }

        public String toString() {
            return "BaiduAccessToken(refresh_token=" + this.refresh_token + ", expires_in=" + this.expires_in + ", session_key=" + this.session_key + ", access_token=" + this.access_token + ", scope=" + this.scope + ", session_secret=" + this.session_secret + Separators.RPAREN;
        }

        public BaiduAccessToken(String refresh_token, long j, String session_key, String access_token, String scope, String session_secret) {
            Intrinsics.checkNotNullParameter(refresh_token, "refresh_token");
            Intrinsics.checkNotNullParameter(session_key, "session_key");
            Intrinsics.checkNotNullParameter(access_token, "access_token");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(session_secret, "session_secret");
            this.refresh_token = refresh_token;
            this.expires_in = j;
            this.session_key = session_key;
            this.access_token = access_token;
            this.scope = scope;
            this.session_secret = session_secret;
        }

        public final String getRefresh_token() {
            return this.refresh_token;
        }

        public final long getExpires_in() {
            return this.expires_in;
        }

        public final String getSession_key() {
            return this.session_key;
        }

        public final String getAccess_token() {
            return this.access_token;
        }

        public final String getScope() {
            return this.scope;
        }

        public final String getSession_secret() {
            return this.session_secret;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$GetDetectLanguageResponse;", "", "RequestId", "", "DetectedLanguage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getDetectedLanguage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GetDetectLanguageResponse {
        private final String DetectedLanguage;
        private final String RequestId;

        public static /* synthetic */ GetDetectLanguageResponse copy$default(GetDetectLanguageResponse getDetectLanguageResponse, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getDetectLanguageResponse.RequestId;
            }
            if ((i & 2) != 0) {
                str2 = getDetectLanguageResponse.DetectedLanguage;
            }
            return getDetectLanguageResponse.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRequestId() {
            return this.RequestId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetectedLanguage() {
            return this.DetectedLanguage;
        }

        public final GetDetectLanguageResponse copy(String RequestId, String DetectedLanguage) {
            Intrinsics.checkNotNullParameter(RequestId, "RequestId");
            Intrinsics.checkNotNullParameter(DetectedLanguage, "DetectedLanguage");
            return new GetDetectLanguageResponse(RequestId, DetectedLanguage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetDetectLanguageResponse)) {
                return false;
            }
            GetDetectLanguageResponse getDetectLanguageResponse = (GetDetectLanguageResponse) other;
            return Intrinsics.areEqual(this.RequestId, getDetectLanguageResponse.RequestId) && Intrinsics.areEqual(this.DetectedLanguage, getDetectLanguageResponse.DetectedLanguage);
        }

        public int hashCode() {
            return (this.RequestId.hashCode() * 31) + this.DetectedLanguage.hashCode();
        }

        public String toString() {
            return "GetDetectLanguageResponse(RequestId=" + this.RequestId + ", DetectedLanguage=" + this.DetectedLanguage + Separators.RPAREN;
        }

        public GetDetectLanguageResponse(String RequestId, String DetectedLanguage) {
            Intrinsics.checkNotNullParameter(RequestId, "RequestId");
            Intrinsics.checkNotNullParameter(DetectedLanguage, "DetectedLanguage");
            this.RequestId = RequestId;
            this.DetectedLanguage = DetectedLanguage;
        }

        public final String getRequestId() {
            return this.RequestId;
        }

        public final String getDetectedLanguage() {
            return this.DetectedLanguage;
        }
    }

    /* compiled from: BasicResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/BasicResponse$RingOrder;", "", "records", "", "Lcom/wakeup/common/network/entity/ring/RingOrderModel;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "setRecords", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RingOrder {
        private List<RingOrderModel> records;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RingOrder copy$default(RingOrder ringOrder, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ringOrder.records;
            }
            return ringOrder.copy(list);
        }

        public final List<RingOrderModel> component1() {
            return this.records;
        }

        public final RingOrder copy(List<RingOrderModel> records) {
            Intrinsics.checkNotNullParameter(records, "records");
            return new RingOrder(records);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RingOrder) && Intrinsics.areEqual(this.records, ((RingOrder) other).records);
        }

        public int hashCode() {
            return this.records.hashCode();
        }

        public String toString() {
            return "RingOrder(records=" + this.records + Separators.RPAREN;
        }

        public RingOrder(List<RingOrderModel> records) {
            Intrinsics.checkNotNullParameter(records, "records");
            this.records = records;
        }

        public final List<RingOrderModel> getRecords() {
            return this.records;
        }

        public final void setRecords(List<RingOrderModel> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.records = list;
        }
    }
}
