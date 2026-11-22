package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/Result;", "", "type", "", "path", MapBundleKey.MapObjKey.OBJ_QID, "ended", "", "data", "Lcom/google/gson/JsonObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/gson/JsonObject;)V", "getType", "()Ljava/lang/String;", "getPath", "getQid", "getEnded", "()I", "getData", "()Lcom/google/gson/JsonObject;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Result {
    private final JsonObject data;
    private final int ended;
    private final String path;
    private final String qid;
    private final String type;

    public static /* synthetic */ Result copy$default(Result result, String str, String str2, String str3, int i, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = result.type;
        }
        if ((i2 & 2) != 0) {
            str2 = result.path;
        }
        if ((i2 & 4) != 0) {
            str3 = result.qid;
        }
        if ((i2 & 8) != 0) {
            i = result.ended;
        }
        if ((i2 & 16) != 0) {
            jsonObject = result.data;
        }
        JsonObject jsonObject2 = jsonObject;
        String str4 = str3;
        return result.copy(str, str2, str4, i, jsonObject2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQid() {
        return this.qid;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEnded() {
        return this.ended;
    }

    /* renamed from: component5, reason: from getter */
    public final JsonObject getData() {
        return this.data;
    }

    public final Result copy(String type, String path, String qid, int ended, JsonObject data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(qid, "qid");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Result(type, path, qid, ended, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return Intrinsics.areEqual(this.type, result.type) && Intrinsics.areEqual(this.path, result.path) && Intrinsics.areEqual(this.qid, result.qid) && this.ended == result.ended && Intrinsics.areEqual(this.data, result.data);
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.path.hashCode()) * 31) + this.qid.hashCode()) * 31) + Integer.hashCode(this.ended)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "Result(type=" + this.type + ", path=" + this.path + ", qid=" + this.qid + ", ended=" + this.ended + ", data=" + this.data + Separators.RPAREN;
    }

    public Result(String type, String path, String qid, int i, JsonObject data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(qid, "qid");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.path = path;
        this.qid = qid;
        this.ended = i;
        this.data = data;
    }

    public final String getType() {
        return this.type;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getQid() {
        return this.qid;
    }

    public final int getEnded() {
        return this.ended;
    }

    public final JsonObject getData() {
        return this.data;
    }
}
