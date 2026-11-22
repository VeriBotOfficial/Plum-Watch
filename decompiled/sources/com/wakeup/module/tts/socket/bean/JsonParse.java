package com.wakeup.module.tts.socket.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonParse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/tts/socket/bean/JsonParse;", "", "code", "", "sid", "", "data", "Lcom/wakeup/module/tts/socket/bean/Data;", "<init>", "(ILjava/lang/String;Lcom/wakeup/module/tts/socket/bean/Data;)V", "getCode", "()I", "getSid", "()Ljava/lang/String;", "getData", "()Lcom/wakeup/module/tts/socket/bean/Data;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class JsonParse {
    private final int code;
    private final Data data;
    private final String sid;

    public static /* synthetic */ JsonParse copy$default(JsonParse jsonParse, int i, String str, Data data, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsonParse.code;
        }
        if ((i2 & 2) != 0) {
            str = jsonParse.sid;
        }
        if ((i2 & 4) != 0) {
            data = jsonParse.data;
        }
        return jsonParse.copy(i, str, data);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: component3, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final JsonParse copy(int code, String sid, Data data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new JsonParse(code, sid, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonParse)) {
            return false;
        }
        JsonParse jsonParse = (JsonParse) other;
        return this.code == jsonParse.code && Intrinsics.areEqual(this.sid, jsonParse.sid) && Intrinsics.areEqual(this.data, jsonParse.data);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.code) * 31) + this.sid.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data == null ? 0 : data.hashCode());
    }

    public String toString() {
        return "JsonParse(code=" + this.code + ", sid=" + this.sid + ", data=" + this.data + Separators.RPAREN;
    }

    public JsonParse(int i, String sid, Data data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.code = i;
        this.sid = sid;
        this.data = data;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Data getData() {
        return this.data;
    }
}
