package com.hispark.clouddiag.model;

import com.anythink.core.common.e.a;
import com.google.gson.annotations.SerializedName;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OTAMessage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0003\u0016\u0017\u0018B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/hispark/clouddiag/model/OTAMessage;", "", "services", "", "Lcom/hispark/clouddiag/model/OTAMessage$OTAService;", "objectDeviceId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getServices", "()Ljava/util/List;", "getObjectDeviceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "OTAService", "OTAParas", "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OTAMessage {
    public static final String EVENT_TYPE_OTA_CANCEL = "ota_cancel";
    public static final String EVENT_TYPE_OTA_REQUEST = "ota_request";
    public static final String EVENT_TYPE_OTA_UPGRADE = "ota_upgrade";
    public static final String EVENT_TYPE_PROGRESS_REPORT = "upgrade_progress_report";

    @SerializedName("object_device_id")
    private final String objectDeviceId;

    @SerializedName("services")
    private final List<OTAService> services;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OTAMessage copy$default(OTAMessage oTAMessage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oTAMessage.services;
        }
        if ((i & 2) != 0) {
            str = oTAMessage.objectDeviceId;
        }
        return oTAMessage.copy(list, str);
    }

    public final List<OTAService> component1() {
        return this.services;
    }

    /* renamed from: component2, reason: from getter */
    public final String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    public final OTAMessage copy(List<OTAService> services, String objectDeviceId) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(objectDeviceId, "objectDeviceId");
        return new OTAMessage(services, objectDeviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTAMessage)) {
            return false;
        }
        OTAMessage oTAMessage = (OTAMessage) other;
        return Intrinsics.areEqual(this.services, oTAMessage.services) && Intrinsics.areEqual(this.objectDeviceId, oTAMessage.objectDeviceId);
    }

    public int hashCode() {
        return (this.services.hashCode() * 31) + this.objectDeviceId.hashCode();
    }

    public String toString() {
        return "OTAMessage(services=" + this.services + ", objectDeviceId=" + this.objectDeviceId + ')';
    }

    public OTAMessage(List<OTAService> services, String objectDeviceId) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(objectDeviceId, "objectDeviceId");
        this.services = services;
        this.objectDeviceId = objectDeviceId;
    }

    public final List<OTAService> getServices() {
        return this.services;
    }

    public final String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    /* compiled from: OTAMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/hispark/clouddiag/model/OTAMessage$OTAService;", "", "eventType", "", "serviceId", "paras", "Lcom/hispark/clouddiag/model/OTAMessage$OTAParas;", "eventTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/hispark/clouddiag/model/OTAMessage$OTAParas;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getServiceId", "getParas", "()Lcom/hispark/clouddiag/model/OTAMessage$OTAParas;", "getEventTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OTAService {

        @SerializedName("event_time")
        private final String eventTime;

        @SerializedName(a.C0193a.b)
        private final String eventType;
        private final OTAParas paras;

        @SerializedName("service_id")
        private final String serviceId;

        public static /* synthetic */ OTAService copy$default(OTAService oTAService, String str, String str2, OTAParas oTAParas, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oTAService.eventType;
            }
            if ((i & 2) != 0) {
                str2 = oTAService.serviceId;
            }
            if ((i & 4) != 0) {
                oTAParas = oTAService.paras;
            }
            if ((i & 8) != 0) {
                str3 = oTAService.eventTime;
            }
            return oTAService.copy(str, str2, oTAParas, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getServiceId() {
            return this.serviceId;
        }

        /* renamed from: component3, reason: from getter */
        public final OTAParas getParas() {
            return this.paras;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEventTime() {
            return this.eventTime;
        }

        public final OTAService copy(String eventType, String serviceId, OTAParas paras, String eventTime) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(serviceId, "serviceId");
            Intrinsics.checkNotNullParameter(paras, "paras");
            Intrinsics.checkNotNullParameter(eventTime, "eventTime");
            return new OTAService(eventType, serviceId, paras, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OTAService)) {
                return false;
            }
            OTAService oTAService = (OTAService) other;
            return Intrinsics.areEqual(this.eventType, oTAService.eventType) && Intrinsics.areEqual(this.serviceId, oTAService.serviceId) && Intrinsics.areEqual(this.paras, oTAService.paras) && Intrinsics.areEqual(this.eventTime, oTAService.eventTime);
        }

        public int hashCode() {
            return (((((this.eventType.hashCode() * 31) + this.serviceId.hashCode()) * 31) + this.paras.hashCode()) * 31) + this.eventTime.hashCode();
        }

        public String toString() {
            return "OTAService(eventType=" + this.eventType + ", serviceId=" + this.serviceId + ", paras=" + this.paras + ", eventTime=" + this.eventTime + ')';
        }

        public OTAService(String eventType, String serviceId, OTAParas paras, String eventTime) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(serviceId, "serviceId");
            Intrinsics.checkNotNullParameter(paras, "paras");
            Intrinsics.checkNotNullParameter(eventTime, "eventTime");
            this.eventType = eventType;
            this.serviceId = serviceId;
            this.paras = paras;
            this.eventTime = eventTime;
        }

        public final String getEventType() {
            return this.eventType;
        }

        public final String getServiceId() {
            return this.serviceId;
        }

        public final OTAParas getParas() {
            return this.paras;
        }

        public final String getEventTime() {
            return this.eventTime;
        }
    }

    /* compiled from: OTAMessage.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00012B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0006\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00063"}, d2 = {"Lcom/hispark/clouddiag/model/OTAMessage$OTAParas;", "", "taskId", "", "taskExtInfo", "Lcom/hispark/clouddiag/model/OTAMessage$OTAParas$TaskExtInfo;", "isForce", "", "url", "version", "fileName", "fileSize", "sign", "customInfo", "deviceStoragePath", "reason", "<init>", "(Ljava/lang/String;Lcom/hispark/clouddiag/model/OTAMessage$OTAParas$TaskExtInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getTaskExtInfo", "()Lcom/hispark/clouddiag/model/OTAMessage$OTAParas$TaskExtInfo;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUrl", MobileAdsBridge.versionMethodName, "getFileName", "getFileSize", "getSign", "getCustomInfo", "getDeviceStoragePath", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lcom/hispark/clouddiag/model/OTAMessage$OTAParas$TaskExtInfo;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/hispark/clouddiag/model/OTAMessage$OTAParas;", "equals", "other", "hashCode", "", "toString", "TaskExtInfo", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OTAParas {

        @SerializedName("custom_info")
        private final String customInfo;

        @SerializedName("device_storage_path")
        private final String deviceStoragePath;

        @SerializedName(DownloadModel.FILE_NAME)
        private final String fileName;

        @SerializedName("file_size")
        private final String fileSize;

        @SerializedName("is_force")
        private final Boolean isForce;

        @SerializedName("reason")
        private final String reason;

        @SerializedName("sign")
        private final String sign;

        @SerializedName("task_ext_info")
        private final TaskExtInfo taskExtInfo;

        @SerializedName("task_id")
        private final String taskId;

        @SerializedName("url")
        private final String url;

        @SerializedName("version")
        private final String version;

        public OTAParas() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public static /* synthetic */ OTAParas copy$default(OTAParas oTAParas, String str, TaskExtInfo taskExtInfo, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oTAParas.taskId;
            }
            if ((i & 2) != 0) {
                taskExtInfo = oTAParas.taskExtInfo;
            }
            if ((i & 4) != 0) {
                bool = oTAParas.isForce;
            }
            if ((i & 8) != 0) {
                str2 = oTAParas.url;
            }
            if ((i & 16) != 0) {
                str3 = oTAParas.version;
            }
            if ((i & 32) != 0) {
                str4 = oTAParas.fileName;
            }
            if ((i & 64) != 0) {
                str5 = oTAParas.fileSize;
            }
            if ((i & 128) != 0) {
                str6 = oTAParas.sign;
            }
            if ((i & 256) != 0) {
                str7 = oTAParas.customInfo;
            }
            if ((i & 512) != 0) {
                str8 = oTAParas.deviceStoragePath;
            }
            if ((i & 1024) != 0) {
                str9 = oTAParas.reason;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str4;
            String str15 = str5;
            String str16 = str3;
            Boolean bool2 = bool;
            return oTAParas.copy(str, taskExtInfo, bool2, str2, str16, str14, str15, str12, str13, str10, str11);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDeviceStoragePath() {
            return this.deviceStoragePath;
        }

        /* renamed from: component11, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final TaskExtInfo getTaskExtInfo() {
            return this.taskExtInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsForce() {
            return this.isForce;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFileSize() {
            return this.fileSize;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSign() {
            return this.sign;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCustomInfo() {
            return this.customInfo;
        }

        public final OTAParas copy(String taskId, TaskExtInfo taskExtInfo, Boolean isForce, String url, String version, String fileName, String fileSize, String sign, String customInfo, String deviceStoragePath, String reason) {
            return new OTAParas(taskId, taskExtInfo, isForce, url, version, fileName, fileSize, sign, customInfo, deviceStoragePath, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OTAParas)) {
                return false;
            }
            OTAParas oTAParas = (OTAParas) other;
            return Intrinsics.areEqual(this.taskId, oTAParas.taskId) && Intrinsics.areEqual(this.taskExtInfo, oTAParas.taskExtInfo) && Intrinsics.areEqual(this.isForce, oTAParas.isForce) && Intrinsics.areEqual(this.url, oTAParas.url) && Intrinsics.areEqual(this.version, oTAParas.version) && Intrinsics.areEqual(this.fileName, oTAParas.fileName) && Intrinsics.areEqual(this.fileSize, oTAParas.fileSize) && Intrinsics.areEqual(this.sign, oTAParas.sign) && Intrinsics.areEqual(this.customInfo, oTAParas.customInfo) && Intrinsics.areEqual(this.deviceStoragePath, oTAParas.deviceStoragePath) && Intrinsics.areEqual(this.reason, oTAParas.reason);
        }

        public int hashCode() {
            String str = this.taskId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            TaskExtInfo taskExtInfo = this.taskExtInfo;
            int hashCode2 = (hashCode + (taskExtInfo == null ? 0 : taskExtInfo.hashCode())) * 31;
            Boolean bool = this.isForce;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.url;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.version;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fileName;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fileSize;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sign;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.customInfo;
            int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.deviceStoragePath;
            int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.reason;
            return hashCode10 + (str9 != null ? str9.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("OTAParas(taskId=");
            sb.append(this.taskId).append(", taskExtInfo=").append(this.taskExtInfo).append(", isForce=").append(this.isForce).append(", url=").append(this.url).append(", version=").append(this.version).append(", fileName=").append(this.fileName).append(", fileSize=").append(this.fileSize).append(", sign=").append(this.sign).append(", customInfo=").append(this.customInfo).append(", deviceStoragePath=").append(this.deviceStoragePath).append(", reason=").append(this.reason).append(')');
            return sb.toString();
        }

        public OTAParas(String str, TaskExtInfo taskExtInfo, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.taskId = str;
            this.taskExtInfo = taskExtInfo;
            this.isForce = bool;
            this.url = str2;
            this.version = str3;
            this.fileName = str4;
            this.fileSize = str5;
            this.sign = str6;
            this.customInfo = str7;
            this.deviceStoragePath = str8;
            this.reason = str9;
        }

        public /* synthetic */ OTAParas(String str, TaskExtInfo taskExtInfo, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : taskExtInfo, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9);
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public final TaskExtInfo getTaskExtInfo() {
            return this.taskExtInfo;
        }

        public final Boolean isForce() {
            return this.isForce;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFileSize() {
            return this.fileSize;
        }

        public final String getSign() {
            return this.sign;
        }

        public final String getCustomInfo() {
            return this.customInfo;
        }

        public final String getDeviceStoragePath() {
            return this.deviceStoragePath;
        }

        public final String getReason() {
            return this.reason;
        }

        /* compiled from: OTAMessage.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/hispark/clouddiag/model/OTAMessage$OTAParas$TaskExtInfo;", "", "data", "", "type", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getType", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TaskExtInfo {

            @SerializedName("data")
            private final String data;

            @SerializedName("status")
            private final String status;

            @SerializedName("type")
            private final String type;

            public TaskExtInfo() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ TaskExtInfo copy$default(TaskExtInfo taskExtInfo, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskExtInfo.data;
                }
                if ((i & 2) != 0) {
                    str2 = taskExtInfo.type;
                }
                if ((i & 4) != 0) {
                    str3 = taskExtInfo.status;
                }
                return taskExtInfo.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component3, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            public final TaskExtInfo copy(String data, String type, String status) {
                return new TaskExtInfo(data, type, status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaskExtInfo)) {
                    return false;
                }
                TaskExtInfo taskExtInfo = (TaskExtInfo) other;
                return Intrinsics.areEqual(this.data, taskExtInfo.data) && Intrinsics.areEqual(this.type, taskExtInfo.type) && Intrinsics.areEqual(this.status, taskExtInfo.status);
            }

            public int hashCode() {
                String str = this.data;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.type;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.status;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "TaskExtInfo(data=" + this.data + ", type=" + this.type + ", status=" + this.status + ')';
            }

            public TaskExtInfo(String str, String str2, String str3) {
                this.data = str;
                this.type = str2;
                this.status = str3;
            }

            public /* synthetic */ TaskExtInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }

            public final String getData() {
                return this.data;
            }

            public final String getType() {
                return this.type;
            }

            public final String getStatus() {
                return this.status;
            }
        }
    }
}
