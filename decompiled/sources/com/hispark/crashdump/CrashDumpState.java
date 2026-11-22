package com.hispark.crashdump;

import com.anythink.expressad.foundation.g.g.a.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/hispark/crashdump/CrashDumpState;", "", b.aX, "Lcom/hispark/crashdump/CrashDumpStage;", "message", "", "progressText", "activeRecordId", "isRunning", "", "fileTransfers", "", "Lcom/hispark/crashdump/DumpFileTransferUiItem;", "<init>", "(Lcom/hispark/crashdump/CrashDumpStage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getStage", "()Lcom/hispark/crashdump/CrashDumpStage;", "getMessage", "()Ljava/lang/String;", "getProgressText", "getActiveRecordId", "()Z", "getFileTransfers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CrashDumpState {
    private final String activeRecordId;
    private final List<DumpFileTransferUiItem> fileTransfers;
    private final boolean isRunning;
    private final String message;
    private final String progressText;
    private final CrashDumpStage stage;

    public CrashDumpState() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ CrashDumpState copy$default(CrashDumpState crashDumpState, CrashDumpStage crashDumpStage, String str, String str2, String str3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            crashDumpStage = crashDumpState.stage;
        }
        if ((i & 2) != 0) {
            str = crashDumpState.message;
        }
        if ((i & 4) != 0) {
            str2 = crashDumpState.progressText;
        }
        if ((i & 8) != 0) {
            str3 = crashDumpState.activeRecordId;
        }
        if ((i & 16) != 0) {
            z = crashDumpState.isRunning;
        }
        if ((i & 32) != 0) {
            list = crashDumpState.fileTransfers;
        }
        boolean z2 = z;
        List list2 = list;
        return crashDumpState.copy(crashDumpStage, str, str2, str3, z2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final CrashDumpStage getStage() {
        return this.stage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProgressText() {
        return this.progressText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActiveRecordId() {
        return this.activeRecordId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final List<DumpFileTransferUiItem> component6() {
        return this.fileTransfers;
    }

    public final CrashDumpState copy(CrashDumpStage stage, String message, String progressText, String activeRecordId, boolean isRunning, List<DumpFileTransferUiItem> fileTransfers) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(fileTransfers, "fileTransfers");
        return new CrashDumpState(stage, message, progressText, activeRecordId, isRunning, fileTransfers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashDumpState)) {
            return false;
        }
        CrashDumpState crashDumpState = (CrashDumpState) other;
        return this.stage == crashDumpState.stage && Intrinsics.areEqual(this.message, crashDumpState.message) && Intrinsics.areEqual(this.progressText, crashDumpState.progressText) && Intrinsics.areEqual(this.activeRecordId, crashDumpState.activeRecordId) && this.isRunning == crashDumpState.isRunning && Intrinsics.areEqual(this.fileTransfers, crashDumpState.fileTransfers);
    }

    public int hashCode() {
        int hashCode = ((((this.stage.hashCode() * 31) + this.message.hashCode()) * 31) + this.progressText.hashCode()) * 31;
        String str = this.activeRecordId;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isRunning)) * 31) + this.fileTransfers.hashCode();
    }

    public String toString() {
        return "CrashDumpState(stage=" + this.stage + ", message=" + this.message + ", progressText=" + this.progressText + ", activeRecordId=" + this.activeRecordId + ", isRunning=" + this.isRunning + ", fileTransfers=" + this.fileTransfers + ')';
    }

    public CrashDumpState(CrashDumpStage stage, String message, String progressText, String str, boolean z, List<DumpFileTransferUiItem> fileTransfers) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(fileTransfers, "fileTransfers");
        this.stage = stage;
        this.message = message;
        this.progressText = progressText;
        this.activeRecordId = str;
        this.isRunning = z;
        this.fileTransfers = fileTransfers;
    }

    public /* synthetic */ CrashDumpState(CrashDumpStage crashDumpStage, String str, String str2, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CrashDumpStage.IDLE : crashDumpStage, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final CrashDumpStage getStage() {
        return this.stage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getProgressText() {
        return this.progressText;
    }

    public final String getActiveRecordId() {
        return this.activeRecordId;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final List<DumpFileTransferUiItem> getFileTransfers() {
        return this.fileTransfers;
    }
}
