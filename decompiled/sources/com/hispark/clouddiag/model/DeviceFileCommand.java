package com.hispark.clouddiag.model;

import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\t\u0010S\u001a\u00020\u0011HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003JÑ\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010X\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR*\u00105\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000f@@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b<\u0010\u001dR\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bB\u0010\u001d¨\u0006]"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommand;", "", "originalObjectDeviceId", "", "normalizedDeviceId", "taskId", "type", "Lcom/hispark/clouddiag/model/DeviceFileCommandType;", "path", "filePath", "dirPath", "uploadUrl", "sourceDownloadUrl", "fileName", "fileSize", "", "overwrite", "", "createDirs", Constants.MAX_FILE_SIZE_KEY, "archiveFormat", "recursive", "allowRoot", "mqttServiceId", "completeEventType", "progressEventType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hispark/clouddiag/model/DeviceFileCommandType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalObjectDeviceId", "()Ljava/lang/String;", "getNormalizedDeviceId", "getTaskId", "getType", "()Lcom/hispark/clouddiag/model/DeviceFileCommandType;", "getPath", "getFilePath", "getDirPath", "getUploadUrl", "getSourceDownloadUrl", "getFileName", "getFileSize", "()J", "getOverwrite", "()Z", "getCreateDirs", "getMaxFileSize", "getArchiveFormat", "getRecursive", "getAllowRoot", "getMqttServiceId", "getCompleteEventType", "getProgressEventType", "value", "maxTotalBytes", "getMaxTotalBytes", "()Ljava/lang/Long;", "setMaxTotalBytes$cloud_sdk_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "targetPath", "getTargetPath", "conflictPolicy", "Lcom/hispark/clouddiag/model/DeviceFileConflictPolicy;", "getConflictPolicy", "()Lcom/hispark/clouddiag/model/DeviceFileConflictPolicy;", "uploadFilePath", "getUploadFilePath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeviceFileCommand {
    private final boolean allowRoot;
    private final String archiveFormat;
    private final String completeEventType;
    private final boolean createDirs;
    private final String dirPath;
    private final String fileName;
    private final String filePath;
    private final long fileSize;
    private final long maxFileSize;
    private Long maxTotalBytes;
    private final String mqttServiceId;
    private final String normalizedDeviceId;
    private final String originalObjectDeviceId;
    private final boolean overwrite;
    private final String path;
    private final String progressEventType;
    private final boolean recursive;
    private final String sourceDownloadUrl;
    private final String taskId;
    private final DeviceFileCommandType type;
    private final String uploadUrl;

    /* compiled from: DeviceFileCommand.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceFileCommandType.values().length];
            try {
                iArr[DeviceFileCommandType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceFileCommandType.DOWNLOAD_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceFileCommandType.DELETE_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceFileCommandType.DOWNLOAD_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceFileCommandType.DELETE_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceFileCommandType.UPLOAD_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceFileCommandType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ DeviceFileCommand copy$default(DeviceFileCommand deviceFileCommand, String str, String str2, String str3, DeviceFileCommandType deviceFileCommandType, String str4, String str5, String str6, String str7, String str8, String str9, long j, boolean z, boolean z2, long j2, String str10, boolean z3, boolean z4, String str11, String str12, String str13, int i, Object obj) {
        String str14;
        String str15;
        String str16 = (i & 1) != 0 ? deviceFileCommand.originalObjectDeviceId : str;
        String str17 = (i & 2) != 0 ? deviceFileCommand.normalizedDeviceId : str2;
        String str18 = (i & 4) != 0 ? deviceFileCommand.taskId : str3;
        DeviceFileCommandType deviceFileCommandType2 = (i & 8) != 0 ? deviceFileCommand.type : deviceFileCommandType;
        String str19 = (i & 16) != 0 ? deviceFileCommand.path : str4;
        String str20 = (i & 32) != 0 ? deviceFileCommand.filePath : str5;
        String str21 = (i & 64) != 0 ? deviceFileCommand.dirPath : str6;
        String str22 = (i & 128) != 0 ? deviceFileCommand.uploadUrl : str7;
        String str23 = (i & 256) != 0 ? deviceFileCommand.sourceDownloadUrl : str8;
        String str24 = (i & 512) != 0 ? deviceFileCommand.fileName : str9;
        long j3 = (i & 1024) != 0 ? deviceFileCommand.fileSize : j;
        boolean z5 = (i & 2048) != 0 ? deviceFileCommand.overwrite : z;
        boolean z6 = (i & 4096) != 0 ? deviceFileCommand.createDirs : z2;
        String str25 = str16;
        String str26 = str17;
        long j4 = (i & 8192) != 0 ? deviceFileCommand.maxFileSize : j2;
        String str27 = (i & 16384) != 0 ? deviceFileCommand.archiveFormat : str10;
        boolean z7 = (32768 & i) != 0 ? deviceFileCommand.recursive : z3;
        boolean z8 = (i & 65536) != 0 ? deviceFileCommand.allowRoot : z4;
        String str28 = (i & 131072) != 0 ? deviceFileCommand.mqttServiceId : str11;
        String str29 = (i & 262144) != 0 ? deviceFileCommand.completeEventType : str12;
        if ((i & 524288) != 0) {
            str15 = str29;
            str14 = deviceFileCommand.progressEventType;
        } else {
            str14 = str13;
            str15 = str29;
        }
        return deviceFileCommand.copy(str25, str26, str18, deviceFileCommandType2, str19, str20, str21, str22, str23, str24, j3, z5, z6, j4, str27, z7, z8, str28, str15, str14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component11, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCreateDirs() {
        return this.createDirs;
    }

    /* renamed from: component14, reason: from getter */
    public final long getMaxFileSize() {
        return this.maxFileSize;
    }

    /* renamed from: component15, reason: from getter */
    public final String getArchiveFormat() {
        return this.archiveFormat;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getRecursive() {
        return this.recursive;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getAllowRoot() {
        return this.allowRoot;
    }

    /* renamed from: component18, reason: from getter */
    public final String getMqttServiceId() {
        return this.mqttServiceId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCompleteEventType() {
        return this.completeEventType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNormalizedDeviceId() {
        return this.normalizedDeviceId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getProgressEventType() {
        return this.progressEventType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component4, reason: from getter */
    public final DeviceFileCommandType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDirPath() {
        return this.dirPath;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSourceDownloadUrl() {
        return this.sourceDownloadUrl;
    }

    public final DeviceFileCommand copy(String originalObjectDeviceId, String normalizedDeviceId, String taskId, DeviceFileCommandType type, String path, String filePath, String dirPath, String uploadUrl, String sourceDownloadUrl, String fileName, long fileSize, boolean overwrite, boolean createDirs, long maxFileSize, String archiveFormat, boolean recursive, boolean allowRoot, String mqttServiceId, String completeEventType, String progressEventType) {
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(normalizedDeviceId, "normalizedDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(sourceDownloadUrl, "sourceDownloadUrl");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(archiveFormat, "archiveFormat");
        Intrinsics.checkNotNullParameter(mqttServiceId, "mqttServiceId");
        Intrinsics.checkNotNullParameter(completeEventType, "completeEventType");
        Intrinsics.checkNotNullParameter(progressEventType, "progressEventType");
        return new DeviceFileCommand(originalObjectDeviceId, normalizedDeviceId, taskId, type, path, filePath, dirPath, uploadUrl, sourceDownloadUrl, fileName, fileSize, overwrite, createDirs, maxFileSize, archiveFormat, recursive, allowRoot, mqttServiceId, completeEventType, progressEventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFileCommand)) {
            return false;
        }
        DeviceFileCommand deviceFileCommand = (DeviceFileCommand) other;
        return Intrinsics.areEqual(this.originalObjectDeviceId, deviceFileCommand.originalObjectDeviceId) && Intrinsics.areEqual(this.normalizedDeviceId, deviceFileCommand.normalizedDeviceId) && Intrinsics.areEqual(this.taskId, deviceFileCommand.taskId) && this.type == deviceFileCommand.type && Intrinsics.areEqual(this.path, deviceFileCommand.path) && Intrinsics.areEqual(this.filePath, deviceFileCommand.filePath) && Intrinsics.areEqual(this.dirPath, deviceFileCommand.dirPath) && Intrinsics.areEqual(this.uploadUrl, deviceFileCommand.uploadUrl) && Intrinsics.areEqual(this.sourceDownloadUrl, deviceFileCommand.sourceDownloadUrl) && Intrinsics.areEqual(this.fileName, deviceFileCommand.fileName) && this.fileSize == deviceFileCommand.fileSize && this.overwrite == deviceFileCommand.overwrite && this.createDirs == deviceFileCommand.createDirs && this.maxFileSize == deviceFileCommand.maxFileSize && Intrinsics.areEqual(this.archiveFormat, deviceFileCommand.archiveFormat) && this.recursive == deviceFileCommand.recursive && this.allowRoot == deviceFileCommand.allowRoot && Intrinsics.areEqual(this.mqttServiceId, deviceFileCommand.mqttServiceId) && Intrinsics.areEqual(this.completeEventType, deviceFileCommand.completeEventType) && Intrinsics.areEqual(this.progressEventType, deviceFileCommand.progressEventType);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.originalObjectDeviceId.hashCode() * 31) + this.normalizedDeviceId.hashCode()) * 31) + this.taskId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.path.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.dirPath.hashCode()) * 31) + this.uploadUrl.hashCode()) * 31) + this.sourceDownloadUrl.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + Boolean.hashCode(this.overwrite)) * 31) + Boolean.hashCode(this.createDirs)) * 31) + Long.hashCode(this.maxFileSize)) * 31) + this.archiveFormat.hashCode()) * 31) + Boolean.hashCode(this.recursive)) * 31) + Boolean.hashCode(this.allowRoot)) * 31) + this.mqttServiceId.hashCode()) * 31) + this.completeEventType.hashCode()) * 31) + this.progressEventType.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceFileCommand(originalObjectDeviceId=");
        sb.append(this.originalObjectDeviceId).append(", normalizedDeviceId=").append(this.normalizedDeviceId).append(", taskId=").append(this.taskId).append(", type=").append(this.type).append(", path=").append(this.path).append(", filePath=").append(this.filePath).append(", dirPath=").append(this.dirPath).append(", uploadUrl=").append(this.uploadUrl).append(", sourceDownloadUrl=").append(this.sourceDownloadUrl).append(", fileName=").append(this.fileName).append(", fileSize=").append(this.fileSize).append(", overwrite=");
        sb.append(this.overwrite).append(", createDirs=").append(this.createDirs).append(", maxFileSize=").append(this.maxFileSize).append(", archiveFormat=").append(this.archiveFormat).append(", recursive=").append(this.recursive).append(", allowRoot=").append(this.allowRoot).append(", mqttServiceId=").append(this.mqttServiceId).append(", completeEventType=").append(this.completeEventType).append(", progressEventType=").append(this.progressEventType).append(')');
        return sb.toString();
    }

    public DeviceFileCommand(String originalObjectDeviceId, String normalizedDeviceId, String taskId, DeviceFileCommandType type, String path, String filePath, String dirPath, String uploadUrl, String sourceDownloadUrl, String fileName, long j, boolean z, boolean z2, long j2, String archiveFormat, boolean z3, boolean z4, String mqttServiceId, String completeEventType, String progressEventType) {
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(normalizedDeviceId, "normalizedDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(sourceDownloadUrl, "sourceDownloadUrl");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(archiveFormat, "archiveFormat");
        Intrinsics.checkNotNullParameter(mqttServiceId, "mqttServiceId");
        Intrinsics.checkNotNullParameter(completeEventType, "completeEventType");
        Intrinsics.checkNotNullParameter(progressEventType, "progressEventType");
        this.originalObjectDeviceId = originalObjectDeviceId;
        this.normalizedDeviceId = normalizedDeviceId;
        this.taskId = taskId;
        this.type = type;
        this.path = path;
        this.filePath = filePath;
        this.dirPath = dirPath;
        this.uploadUrl = uploadUrl;
        this.sourceDownloadUrl = sourceDownloadUrl;
        this.fileName = fileName;
        this.fileSize = j;
        this.overwrite = z;
        this.createDirs = z2;
        this.maxFileSize = j2;
        this.archiveFormat = archiveFormat;
        this.recursive = z3;
        this.allowRoot = z4;
        this.mqttServiceId = mqttServiceId;
        this.completeEventType = completeEventType;
        this.progressEventType = progressEventType;
    }

    public /* synthetic */ DeviceFileCommand(String str, String str2, String str3, DeviceFileCommandType deviceFileCommandType, String str4, String str5, String str6, String str7, String str8, String str9, long j, boolean z, boolean z2, long j2, String str10, boolean z3, boolean z4, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, deviceFileCommandType, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? 0L : j, (i & 2048) != 0 ? true : z, (i & 4096) != 0 ? true : z2, (i & 8192) != 0 ? 20971520L : j2, (i & 16384) != 0 ? "zip" : str10, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? false : z4, (131072 & i) != 0 ? DeviceFileMqttPayloads.SERVICE_ID_DEVICE_FILE : str11, (262144 & i) != 0 ? "" : str12, (i & 524288) != 0 ? DeviceFileMqttPayloads.EVENT_PROGRESS : str13);
    }

    public final String getOriginalObjectDeviceId() {
        return this.originalObjectDeviceId;
    }

    public final String getNormalizedDeviceId() {
        return this.normalizedDeviceId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final DeviceFileCommandType getType() {
        return this.type;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getDirPath() {
        return this.dirPath;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final String getSourceDownloadUrl() {
        return this.sourceDownloadUrl;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final boolean getCreateDirs() {
        return this.createDirs;
    }

    public final long getMaxFileSize() {
        return this.maxFileSize;
    }

    public final String getArchiveFormat() {
        return this.archiveFormat;
    }

    public final boolean getRecursive() {
        return this.recursive;
    }

    public final boolean getAllowRoot() {
        return this.allowRoot;
    }

    public final String getMqttServiceId() {
        return this.mqttServiceId;
    }

    public final String getCompleteEventType() {
        return this.completeEventType;
    }

    public final String getProgressEventType() {
        return this.progressEventType;
    }

    public final Long getMaxTotalBytes() {
        return this.maxTotalBytes;
    }

    public final void setMaxTotalBytes$cloud_sdk_release(Long l) {
        this.maxTotalBytes = l;
    }

    public final String getTargetPath() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                return this.path;
            case 2:
            case 3:
                return this.filePath;
            case 4:
            case 5:
                return this.dirPath;
            case 6:
                return getUploadFilePath();
            case 7:
                String str = this.filePath;
                if (StringsKt.isBlank(str)) {
                    String str2 = this.dirPath;
                    if (StringsKt.isBlank(str2)) {
                        str2 = this.path;
                    }
                    str = str2;
                }
                return str;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final DeviceFileConflictPolicy getConflictPolicy() {
        return this.overwrite ? DeviceFileConflictPolicy.OVERWRITE : DeviceFileConflictPolicy.SKIP;
    }

    public final String getUploadFilePath() {
        return StringsKt.isBlank(this.dirPath) ? this.fileName : Intrinsics.areEqual(this.dirPath, "/") ? "/" + this.fileName : StringsKt.trimEnd(this.dirPath, '/') + '/' + this.fileName;
    }
}
