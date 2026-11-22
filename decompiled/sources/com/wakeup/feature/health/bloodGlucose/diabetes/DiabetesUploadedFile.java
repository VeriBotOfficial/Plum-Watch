package com.wakeup.feature.health.bloodGlucose.diabetes;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiabetesFormData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile;", "Ljava/io/Serializable;", "localPath", "", "displayName", "sizeBytes", "", "fileId", "uploadProgress", "", "uploadState", "Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile$UploadState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile$UploadState;)V", "getLocalPath", "()Ljava/lang/String;", "getDisplayName", "getSizeBytes", "()J", "getFileId", "setFileId", "(Ljava/lang/String;)V", "getUploadProgress", "()I", "setUploadProgress", "(I)V", "getUploadState", "()Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile$UploadState;", "setUploadState", "(Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile$UploadState;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "UploadState", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiabetesUploadedFile implements Serializable {
    public static final int $stable = 8;
    private final String displayName;
    private String fileId;
    private final String localPath;
    private final long sizeBytes;
    private int uploadProgress;
    private UploadState uploadState;

    public DiabetesUploadedFile() {
        this(null, null, 0L, null, 0, null, 63, null);
    }

    public static /* synthetic */ DiabetesUploadedFile copy$default(DiabetesUploadedFile diabetesUploadedFile, String str, String str2, long j, String str3, int i, UploadState uploadState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = diabetesUploadedFile.localPath;
        }
        if ((i2 & 2) != 0) {
            str2 = diabetesUploadedFile.displayName;
        }
        if ((i2 & 4) != 0) {
            j = diabetesUploadedFile.sizeBytes;
        }
        if ((i2 & 8) != 0) {
            str3 = diabetesUploadedFile.fileId;
        }
        if ((i2 & 16) != 0) {
            i = diabetesUploadedFile.uploadProgress;
        }
        if ((i2 & 32) != 0) {
            uploadState = diabetesUploadedFile.uploadState;
        }
        UploadState uploadState2 = uploadState;
        String str4 = str3;
        long j2 = j;
        return diabetesUploadedFile.copy(str, str2, j2, str4, i, uploadState2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    /* renamed from: component6, reason: from getter */
    public final UploadState getUploadState() {
        return this.uploadState;
    }

    public final DiabetesUploadedFile copy(String localPath, String displayName, long sizeBytes, String fileId, int uploadProgress, UploadState uploadState) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(uploadState, "uploadState");
        return new DiabetesUploadedFile(localPath, displayName, sizeBytes, fileId, uploadProgress, uploadState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiabetesUploadedFile)) {
            return false;
        }
        DiabetesUploadedFile diabetesUploadedFile = (DiabetesUploadedFile) other;
        return Intrinsics.areEqual(this.localPath, diabetesUploadedFile.localPath) && Intrinsics.areEqual(this.displayName, diabetesUploadedFile.displayName) && this.sizeBytes == diabetesUploadedFile.sizeBytes && Intrinsics.areEqual(this.fileId, diabetesUploadedFile.fileId) && this.uploadProgress == diabetesUploadedFile.uploadProgress && this.uploadState == diabetesUploadedFile.uploadState;
    }

    public int hashCode() {
        return (((((((((this.localPath.hashCode() * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.sizeBytes)) * 31) + this.fileId.hashCode()) * 31) + Integer.hashCode(this.uploadProgress)) * 31) + this.uploadState.hashCode();
    }

    public String toString() {
        return "DiabetesUploadedFile(localPath=" + this.localPath + ", displayName=" + this.displayName + ", sizeBytes=" + this.sizeBytes + ", fileId=" + this.fileId + ", uploadProgress=" + this.uploadProgress + ", uploadState=" + this.uploadState + Separators.RPAREN;
    }

    public DiabetesUploadedFile(String localPath, String displayName, long j, String fileId, int i, UploadState uploadState) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(uploadState, "uploadState");
        this.localPath = localPath;
        this.displayName = displayName;
        this.sizeBytes = j;
        this.fileId = fileId;
        this.uploadProgress = i;
        this.uploadState = uploadState;
    }

    public /* synthetic */ DiabetesUploadedFile(String str, String str2, long j, String str3, int i, UploadState uploadState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? UploadState.PENDING : uploadState);
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final void setFileId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileId = str;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    public final void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public final UploadState getUploadState() {
        return this.uploadState;
    }

    public final void setUploadState(UploadState uploadState) {
        Intrinsics.checkNotNullParameter(uploadState, "<set-?>");
        this.uploadState = uploadState;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DiabetesFormData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesUploadedFile$UploadState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "UPLOADING", "READY", "FAILED", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UploadState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UploadState[] $VALUES;
        public static final UploadState PENDING = new UploadState("PENDING", 0);
        public static final UploadState UPLOADING = new UploadState("UPLOADING", 1);
        public static final UploadState READY = new UploadState("READY", 2);
        public static final UploadState FAILED = new UploadState("FAILED", 3);

        private static final /* synthetic */ UploadState[] $values() {
            return new UploadState[]{PENDING, UPLOADING, READY, FAILED};
        }

        public static EnumEntries<UploadState> getEntries() {
            return $ENTRIES;
        }

        static {
            UploadState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private UploadState(String str, int i) {
        }

        public static UploadState valueOf(String str) {
            return (UploadState) Enum.valueOf(UploadState.class, str);
        }

        public static UploadState[] values() {
            return (UploadState[]) $VALUES.clone();
        }
    }
}
