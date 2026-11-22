package com.wakeup.common.network.entity;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/BindEntity;", "", Constants.BundleKey.ACCOUNT, "", "list", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAccount", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BindEntity {
    private final String account;
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindEntity copy$default(BindEntity bindEntity, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindEntity.account;
        }
        if ((i & 2) != 0) {
            list = bindEntity.list;
        }
        return bindEntity.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    public final List<Integer> component2() {
        return this.list;
    }

    public final BindEntity copy(String account, List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new BindEntity(account, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindEntity)) {
            return false;
        }
        BindEntity bindEntity = (BindEntity) other;
        return Intrinsics.areEqual(this.account, bindEntity.account) && Intrinsics.areEqual(this.list, bindEntity.list);
    }

    public int hashCode() {
        String str = this.account;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "BindEntity(account=" + this.account + ", list=" + this.list + Separators.RPAREN;
    }

    public BindEntity(String str, List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.account = str;
        this.list = list;
    }

    public final String getAccount() {
        return this.account;
    }

    public final List<Integer> getList() {
        return this.list;
    }
}
