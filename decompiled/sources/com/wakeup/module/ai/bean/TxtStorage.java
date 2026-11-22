package com.wakeup.module.ai.bean;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TxtStorage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/ai/bean/TxtStorage;", "", "i", "", "c", "", "<init>", "(ILjava/lang/String;)V", "getI", "()I", "getC", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TxtStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String c;
    private final int i;

    public static /* synthetic */ TxtStorage copy$default(TxtStorage txtStorage, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = txtStorage.i;
        }
        if ((i2 & 2) != 0) {
            str = txtStorage.c;
        }
        return txtStorage.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getI() {
        return this.i;
    }

    /* renamed from: component2, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final TxtStorage copy(int i, String c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return new TxtStorage(i, c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TxtStorage)) {
            return false;
        }
        TxtStorage txtStorage = (TxtStorage) other;
        return this.i == txtStorage.i && Intrinsics.areEqual(this.c, txtStorage.c);
    }

    public int hashCode() {
        return (Integer.hashCode(this.i) * 31) + this.c.hashCode();
    }

    public TxtStorage(int i, String c) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.i = i;
        this.c = c;
    }

    public final String getC() {
        return this.c;
    }

    public final int getI() {
        return this.i;
    }

    /* compiled from: TxtStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/wakeup/module/ai/bean/TxtStorage$Companion;", "", "<init>", "()V", "analysis", "", "line", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String analysis(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            try {
                return ((TxtStorage) new Gson().fromJson(line, TxtStorage.class)).getC();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
