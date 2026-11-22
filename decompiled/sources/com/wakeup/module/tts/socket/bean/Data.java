package com.wakeup.module.tts.socket.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Data.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/tts/socket/bean/Data;", "", "status", "", "audio", "", "<init>", "(ILjava/lang/String;)V", "getStatus", "()I", "getAudio", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Data {
    private final String audio;
    private final int status;

    public static /* synthetic */ Data copy$default(Data data, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = data.status;
        }
        if ((i2 & 2) != 0) {
            str = data.audio;
        }
        return data.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudio() {
        return this.audio;
    }

    public final Data copy(int status, String audio) {
        return new Data(status, audio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.status == data.status && Intrinsics.areEqual(this.audio, data.audio);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.audio;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Data(status=" + this.status + ", audio=" + this.audio + Separators.RPAREN;
    }

    public Data(int i, String str) {
        this.status = i;
        this.audio = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getAudio() {
        return this.audio;
    }
}
