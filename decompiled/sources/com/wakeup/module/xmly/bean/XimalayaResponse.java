package com.wakeup.module.xmly.bean;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import com.heytap.mcssdk.constant.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XimalayaResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/xmly/bean/XimalayaResponse;", "", b.y, "", "params", "Lcom/wakeup/module/xmly/bean/XimalayaPlayParams;", "<init>", "(Ljava/lang/String;Lcom/wakeup/module/xmly/bean/XimalayaPlayParams;)V", "getCommand", "()Ljava/lang/String;", "getParams", "()Lcom/wakeup/module/xmly/bean/XimalayaPlayParams;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module-xmly_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class XimalayaResponse {

    @SerializedName(b.y)
    private final String command;

    @SerializedName("params")
    private final XimalayaPlayParams params;

    public static /* synthetic */ XimalayaResponse copy$default(XimalayaResponse ximalayaResponse, String str, XimalayaPlayParams ximalayaPlayParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ximalayaResponse.command;
        }
        if ((i & 2) != 0) {
            ximalayaPlayParams = ximalayaResponse.params;
        }
        return ximalayaResponse.copy(str, ximalayaPlayParams);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* renamed from: component2, reason: from getter */
    public final XimalayaPlayParams getParams() {
        return this.params;
    }

    public final XimalayaResponse copy(String command, XimalayaPlayParams params) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(params, "params");
        return new XimalayaResponse(command, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XimalayaResponse)) {
            return false;
        }
        XimalayaResponse ximalayaResponse = (XimalayaResponse) other;
        return Intrinsics.areEqual(this.command, ximalayaResponse.command) && Intrinsics.areEqual(this.params, ximalayaResponse.params);
    }

    public int hashCode() {
        return (this.command.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        return "XimalayaResponse(command=" + this.command + ", params=" + this.params + Separators.RPAREN;
    }

    public XimalayaResponse(String command, XimalayaPlayParams params) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(params, "params");
        this.command = command;
        this.params = params;
    }

    public final String getCommand() {
        return this.command;
    }

    public final XimalayaPlayParams getParams() {
        return this.params;
    }
}
