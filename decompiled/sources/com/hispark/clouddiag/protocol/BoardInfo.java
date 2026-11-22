package com.hispark.clouddiag.protocol;

import com.google.firebase.messaging.Constants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/hispark/clouddiag/protocol/BoardInfo;", "", "version", "", "sn", "hardwareModel", "chipModel", Constants.MessagePayloadKeys.RAW_DATA, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "getSn", "getHardwareModel", "getChipModel", "getRawData", "()[B", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoardInfo {
    private final String chipModel;
    private final String hardwareModel;
    private final byte[] rawData;
    private final String sn;
    private final String version;

    public static /* synthetic */ BoardInfo copy$default(BoardInfo boardInfo, String str, String str2, String str3, String str4, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boardInfo.version;
        }
        if ((i & 2) != 0) {
            str2 = boardInfo.sn;
        }
        if ((i & 4) != 0) {
            str3 = boardInfo.hardwareModel;
        }
        if ((i & 8) != 0) {
            str4 = boardInfo.chipModel;
        }
        if ((i & 16) != 0) {
            bArr = boardInfo.rawData;
        }
        byte[] bArr2 = bArr;
        String str5 = str3;
        return boardInfo.copy(str, str2, str5, str4, bArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChipModel() {
        return this.chipModel;
    }

    /* renamed from: component5, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    public final BoardInfo copy(String version, String sn, String hardwareModel, String chipModel, byte[] rawData) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return new BoardInfo(version, sn, hardwareModel, chipModel, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardInfo)) {
            return false;
        }
        BoardInfo boardInfo = (BoardInfo) other;
        return Intrinsics.areEqual(this.version, boardInfo.version) && Intrinsics.areEqual(this.sn, boardInfo.sn) && Intrinsics.areEqual(this.hardwareModel, boardInfo.hardwareModel) && Intrinsics.areEqual(this.chipModel, boardInfo.chipModel) && Intrinsics.areEqual(this.rawData, boardInfo.rawData);
    }

    public int hashCode() {
        int hashCode = ((((this.version.hashCode() * 31) + this.sn.hashCode()) * 31) + this.hardwareModel.hashCode()) * 31;
        String str = this.chipModel;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.rawData);
    }

    public String toString() {
        return "BoardInfo(version=" + this.version + ", sn=" + this.sn + ", hardwareModel=" + this.hardwareModel + ", chipModel=" + this.chipModel + ", rawData=" + Arrays.toString(this.rawData) + ')';
    }

    public BoardInfo(String version, String sn, String hardwareModel, String str, byte[] rawData) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.version = version;
        this.sn = sn;
        this.hardwareModel = hardwareModel;
        this.chipModel = str;
        this.rawData = rawData;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    public final String getChipModel() {
        return this.chipModel;
    }

    public final byte[] getRawData() {
        return this.rawData;
    }
}
