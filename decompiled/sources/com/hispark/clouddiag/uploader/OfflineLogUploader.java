package com.hispark.clouddiag.uploader;

import android.content.Context;
import android.util.Log;
import androidx.core.provider.FontsContractCompat;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.google.gson.Gson;
import com.hispark.clouddiag.BuildConfig;
import com.hispark.clouddiag.uploader.StagedFileUploadHttpClient;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OfflineLogUploader.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0005-./01B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010'JH\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader;", "", "context", "Landroid/content/Context;", "authToken", "", "baseUrl", "beforeNetworkIo", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "gson", "Lcom/google/gson/Gson;", "uploadClient", "Lcom/hispark/clouddiag/uploader/StagedFileUploadHttpClient;", "normalizedBaseUrl", "uploadInitUrl", "uploadCompleteUrl", "uploadOfflineLogFile", "Lkotlin/Result;", "file", "Ljava/io/File;", "deviceInfo", "Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;", "fileType", "logType", "", "uploadOfflineLogFile-yxL6bBk", "(Ljava/io/File;Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initUpload", "Lcom/hispark/clouddiag/uploader/StagedFileUploadHttpClient$InitUploadResult;", "fileName", "fileSize", "", "(Ljava/lang/String;JLcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyUploadComplete", "", "fileId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadMultipleOfflineLogFiles", "", "files", "", "(Ljava/util/List;Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "UploadInitResponse", NativeDeviceInfoSpec.NAME, "UploadInitRequest", "UploadCompleteRequest", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OfflineLogUploader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "OfflineLogUploader";
    private final String authToken;
    private final Context context;
    private final Gson gson;
    private final String normalizedBaseUrl;
    private final StagedFileUploadHttpClient uploadClient;
    private final String uploadCompleteUrl;
    private final String uploadInitUrl;

    public OfflineLogUploader(Context context, String authToken, String baseUrl, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.context = context;
        this.authToken = authToken;
        this.gson = new Gson();
        this.uploadClient = new StagedFileUploadHttpClient(authToken, 0, 0, function0, 6, null);
        String normalizeBaseUrl = INSTANCE.normalizeBaseUrl(baseUrl);
        this.normalizedBaseUrl = normalizeBaseUrl;
        this.uploadInitUrl = normalizeBaseUrl + "/offlineLog/file/upload";
        this.uploadCompleteUrl = normalizeBaseUrl + "/offlineLog/file/complete";
    }

    public /* synthetic */ OfflineLogUploader(Context context, String str, String str2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? BuildConfig.CLOUD_FILE_BASE_URL : str2, (i & 8) != 0 ? null : function0);
    }

    /* compiled from: OfflineLogUploader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader$Companion;", "", "<init>", "()V", "TAG", "", "normalizeBaseUrl", "baseUrl", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String normalizeBaseUrl(String baseUrl) {
            return StringsKt.trimEnd(StringsKt.trim((CharSequence) baseUrl).toString(), '/');
        }
    }

    /* compiled from: OfflineLogUploader.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader$UploadInitResponse;", "", "url", "", FontsContractCompat.Columns.FILE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getFile_id", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadInitResponse {
        private final String file_id;
        private final String url;

        public static /* synthetic */ UploadInitResponse copy$default(UploadInitResponse uploadInitResponse, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadInitResponse.url;
            }
            if ((i & 2) != 0) {
                str2 = uploadInitResponse.file_id;
            }
            return uploadInitResponse.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFile_id() {
            return this.file_id;
        }

        public final UploadInitResponse copy(String url, String file_id) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            return new UploadInitResponse(url, file_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadInitResponse)) {
                return false;
            }
            UploadInitResponse uploadInitResponse = (UploadInitResponse) other;
            return Intrinsics.areEqual(this.url, uploadInitResponse.url) && Intrinsics.areEqual(this.file_id, uploadInitResponse.file_id);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.file_id.hashCode();
        }

        public String toString() {
            return "UploadInitResponse(url=" + this.url + ", file_id=" + this.file_id + ')';
        }

        public UploadInitResponse(String url, String file_id) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            this.url = url;
            this.file_id = file_id;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getFile_id() {
            return this.file_id;
        }
    }

    /* compiled from: OfflineLogUploader.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;", "", "sn", "", "hardwareMode", "version", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSn", "()Ljava/lang/String;", "getHardwareMode", MobileAdsBridge.versionMethodName, "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceInfo {
        private final String hardwareMode;
        private final String sn;
        private final String type;
        private final String version;

        public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceInfo.sn;
            }
            if ((i & 2) != 0) {
                str2 = deviceInfo.hardwareMode;
            }
            if ((i & 4) != 0) {
                str3 = deviceInfo.version;
            }
            if ((i & 8) != 0) {
                str4 = deviceInfo.type;
            }
            return deviceInfo.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSn() {
            return this.sn;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHardwareMode() {
            return this.hardwareMode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DeviceInfo copy(String sn, String hardwareMode, String version, String type) {
            Intrinsics.checkNotNullParameter(sn, "sn");
            Intrinsics.checkNotNullParameter(hardwareMode, "hardwareMode");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(type, "type");
            return new DeviceInfo(sn, hardwareMode, version, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) other;
            return Intrinsics.areEqual(this.sn, deviceInfo.sn) && Intrinsics.areEqual(this.hardwareMode, deviceInfo.hardwareMode) && Intrinsics.areEqual(this.version, deviceInfo.version) && Intrinsics.areEqual(this.type, deviceInfo.type);
        }

        public int hashCode() {
            return (((((this.sn.hashCode() * 31) + this.hardwareMode.hashCode()) * 31) + this.version.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "DeviceInfo(sn=" + this.sn + ", hardwareMode=" + this.hardwareMode + ", version=" + this.version + ", type=" + this.type + ')';
        }

        public DeviceInfo(String sn, String hardwareMode, String version, String type) {
            Intrinsics.checkNotNullParameter(sn, "sn");
            Intrinsics.checkNotNullParameter(hardwareMode, "hardwareMode");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(type, "type");
            this.sn = sn;
            this.hardwareMode = hardwareMode;
            this.version = version;
            this.type = type;
        }

        public final String getSn() {
            return this.sn;
        }

        public final String getHardwareMode() {
            return this.hardwareMode;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: OfflineLogUploader.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader$UploadInitRequest;", "", "device", "Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;", "type", "", "fileName", "fileSize", "", "logType", "", "<init>", "(Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;Ljava/lang/String;Ljava/lang/String;JI)V", "getDevice", "()Lcom/hispark/clouddiag/uploader/OfflineLogUploader$DeviceInfo;", "getType", "()Ljava/lang/String;", "getFileName", "getFileSize", "()J", "getLogType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadInitRequest {
        private final DeviceInfo device;
        private final String fileName;
        private final long fileSize;
        private final int logType;
        private final String type;

        public static /* synthetic */ UploadInitRequest copy$default(UploadInitRequest uploadInitRequest, DeviceInfo deviceInfo, String str, String str2, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                deviceInfo = uploadInitRequest.device;
            }
            if ((i2 & 2) != 0) {
                str = uploadInitRequest.type;
            }
            if ((i2 & 4) != 0) {
                str2 = uploadInitRequest.fileName;
            }
            if ((i2 & 8) != 0) {
                j = uploadInitRequest.fileSize;
            }
            if ((i2 & 16) != 0) {
                i = uploadInitRequest.logType;
            }
            int i3 = i;
            String str3 = str2;
            return uploadInitRequest.copy(deviceInfo, str, str3, j, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final DeviceInfo getDevice() {
            return this.device;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component4, reason: from getter */
        public final long getFileSize() {
            return this.fileSize;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLogType() {
            return this.logType;
        }

        public final UploadInitRequest copy(DeviceInfo device, String type, String fileName, long fileSize, int logType) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new UploadInitRequest(device, type, fileName, fileSize, logType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadInitRequest)) {
                return false;
            }
            UploadInitRequest uploadInitRequest = (UploadInitRequest) other;
            return Intrinsics.areEqual(this.device, uploadInitRequest.device) && Intrinsics.areEqual(this.type, uploadInitRequest.type) && Intrinsics.areEqual(this.fileName, uploadInitRequest.fileName) && this.fileSize == uploadInitRequest.fileSize && this.logType == uploadInitRequest.logType;
        }

        public int hashCode() {
            return (((((((this.device.hashCode() * 31) + this.type.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + Integer.hashCode(this.logType);
        }

        public String toString() {
            return "UploadInitRequest(device=" + this.device + ", type=" + this.type + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", logType=" + this.logType + ')';
        }

        public UploadInitRequest(DeviceInfo device, String type, String fileName, long j, int i) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.device = device;
            this.type = type;
            this.fileName = fileName;
            this.fileSize = j;
            this.logType = i;
        }

        public /* synthetic */ UploadInitRequest(DeviceInfo deviceInfo, String str, String str2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceInfo, str, str2, j, (i2 & 16) != 0 ? 1 : i);
        }

        public final DeviceInfo getDevice() {
            return this.device;
        }

        public final String getType() {
            return this.type;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final int getLogType() {
            return this.logType;
        }
    }

    /* compiled from: OfflineLogUploader.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/hispark/clouddiag/uploader/OfflineLogUploader$UploadCompleteRequest;", "", "fileId", "", "<init>", "(Ljava/lang/String;)V", "getFileId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadCompleteRequest {
        private final String fileId;

        public static /* synthetic */ UploadCompleteRequest copy$default(UploadCompleteRequest uploadCompleteRequest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadCompleteRequest.fileId;
            }
            return uploadCompleteRequest.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        public final UploadCompleteRequest copy(String fileId) {
            Intrinsics.checkNotNullParameter(fileId, "fileId");
            return new UploadCompleteRequest(fileId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadCompleteRequest) && Intrinsics.areEqual(this.fileId, ((UploadCompleteRequest) other).fileId);
        }

        public int hashCode() {
            return this.fileId.hashCode();
        }

        public String toString() {
            return "UploadCompleteRequest(fileId=" + this.fileId + ')';
        }

        public UploadCompleteRequest(String fileId) {
            Intrinsics.checkNotNullParameter(fileId, "fileId");
            this.fileId = fileId;
        }

        public final String getFileId() {
            return this.fileId;
        }
    }

    /* renamed from: uploadOfflineLogFile-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m8144uploadOfflineLogFileyxL6bBk$default(OfflineLogUploader offlineLogUploader, File file, DeviceInfo deviceInfo, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return offlineLogUploader.m8145uploadOfflineLogFileyxL6bBk(file, deviceInfo, str, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: uploadOfflineLogFile-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8145uploadOfflineLogFileyxL6bBk(java.io.File r12, com.hispark.clouddiag.uploader.OfflineLogUploader.DeviceInfo r13, java.lang.String r14, int r15, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$1
            if (r1 == 0) goto L16
            r1 = r0
            com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$1 r1 = (com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$1 r1 = new com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$1
            r1.<init>(r11, r0)
        L1b:
            java.lang.Object r0 = r1.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r10 = 1
            if (r2 == 0) goto L34
            if (r2 != r10) goto L2c
            kotlin.ResultKt.throwOnFailure(r0)
            goto L53
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$2 r2 = new com.hispark.clouddiag.uploader.OfflineLogUploader$uploadOfflineLogFile$2
            r8 = 0
            r4 = r11
            r3 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r1.label = r10
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r2, r1)
            if (r0 != r9) goto L53
            return r9
        L53:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.clouddiag.uploader.OfflineLogUploader.m8145uploadOfflineLogFileyxL6bBk(java.io.File, com.hispark.clouddiag.uploader.OfflineLogUploader$DeviceInfo, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initUpload(String str, long j, DeviceInfo deviceInfo, String str2, int i, Continuation<? super StagedFileUploadHttpClient.InitUploadResult> continuation) {
        try {
            String json = this.gson.toJson(new UploadInitRequest(deviceInfo, str2, str, j, i));
            Log.d(TAG, "Upload init request: " + json);
            StagedFileUploadHttpClient stagedFileUploadHttpClient = this.uploadClient;
            String str3 = this.uploadInitUrl;
            Intrinsics.checkNotNull(json);
            return stagedFileUploadHttpClient.initUpload(str3, json);
        } catch (Exception e) {
            Log.e(TAG, "Error initializing upload", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object notifyUploadComplete(String str, Continuation<? super Boolean> continuation) {
        boolean z;
        try {
            String json = this.gson.toJson(new UploadCompleteRequest(str));
            Log.d(TAG, "Upload complete request: " + json);
            StagedFileUploadHttpClient stagedFileUploadHttpClient = this.uploadClient;
            String str2 = this.uploadCompleteUrl;
            Intrinsics.checkNotNull(json);
            z = stagedFileUploadHttpClient.completeUpload(str2, json);
        } catch (Exception e) {
            Log.e(TAG, "Error notifying upload complete", e);
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    public static /* synthetic */ Object uploadMultipleOfflineLogFiles$default(OfflineLogUploader offlineLogUploader, List list, DeviceInfo deviceInfo, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return offlineLogUploader.uploadMultipleOfflineLogFiles(list, deviceInfo, str, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0092 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadMultipleOfflineLogFiles(java.util.List<? extends java.io.File> r11, com.hispark.clouddiag.uploader.OfflineLogUploader.DeviceInfo r12, java.lang.String r13, int r14, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, kotlin.Result<java.lang.String>>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.hispark.clouddiag.uploader.OfflineLogUploader$uploadMultipleOfflineLogFiles$1
            if (r0 == 0) goto L14
            r0 = r15
            com.hispark.clouddiag.uploader.OfflineLogUploader$uploadMultipleOfflineLogFiles$1 r0 = (com.hispark.clouddiag.uploader.OfflineLogUploader$uploadMultipleOfflineLogFiles$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.hispark.clouddiag.uploader.OfflineLogUploader$uploadMultipleOfflineLogFiles$1 r0 = new com.hispark.clouddiag.uploader.OfflineLogUploader$uploadMultipleOfflineLogFiles$1
            r0.<init>(r10, r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L57
            if (r2 != r3) goto L4f
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$5
            java.io.File r12 = (java.io.File) r12
            java.lang.Object r13 = r0.L$4
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r0.L$3
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$1
            com.hispark.clouddiag.uploader.OfflineLogUploader$DeviceInfo r4 = (com.hispark.clouddiag.uploader.OfflineLogUploader.DeviceInfo) r4
            java.lang.Object r5 = r0.L$0
            com.hispark.clouddiag.uploader.OfflineLogUploader r5 = (com.hispark.clouddiag.uploader.OfflineLogUploader) r5
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.getValue()
            r8 = r11
            r9 = r0
            r7 = r2
            r6 = r4
            r4 = r5
            goto L93
        L4f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L57:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r4 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            r14 = r15
            r9 = r0
            r13 = r11
        L6e:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L9f
            java.lang.Object r11 = r13.next()
            r5 = r11
            java.io.File r5 = (java.io.File) r5
            r9.L$0 = r4
            r9.L$1 = r6
            r9.L$2 = r7
            r9.L$3 = r14
            r9.L$4 = r13
            r9.L$5 = r5
            r9.I$0 = r8
            r9.label = r3
            java.lang.Object r15 = r4.m8145uploadOfflineLogFileyxL6bBk(r5, r6, r7, r8, r9)
            if (r15 != r1) goto L92
            return r1
        L92:
            r12 = r5
        L93:
            kotlin.Result r11 = kotlin.Result.m14056boximpl(r15)
            java.lang.String r12 = r12.getName()
            r14.put(r12, r11)
            goto L6e
        L9f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.clouddiag.uploader.OfflineLogUploader.uploadMultipleOfflineLogFiles(java.util.List, com.hispark.clouddiag.uploader.OfflineLogUploader$DeviceInfo, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
