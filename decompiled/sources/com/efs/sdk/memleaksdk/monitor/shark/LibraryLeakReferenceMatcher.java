package com.efs.sdk.memleaksdk.monitor.shark;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/LibraryLeakReferenceMatcher;", "Lcom/efs/sdk/memleaksdk/monitor/shark/ReferenceMatcher;", "pattern", "Lcom/efs/sdk/memleaksdk/monitor/shark/ReferencePattern;", "description", "", "patternApplies", "Lkotlin/Function1;", "Lcom/efs/sdk/memleaksdk/monitor/shark/HeapGraph;", "", "(Lcom/efs/sdk/memleaksdk/monitor/shark/ReferencePattern;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDescription", "()Ljava/lang/String;", "getPattern", "()Lcom/efs/sdk/memleaksdk/monitor/shark/ReferencePattern;", "getPatternApplies", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.efs.sdk.memleaksdk.monitor.internal.bn, reason: from Kotlin metadata */
/* loaded from: classes14.dex */
public final /* data */ class LibraryLeakReferenceMatcher extends ReferenceMatcher {

    /* renamed from: a, reason: collision with root package name */
    final String f9841a;
    public final Function1<HeapGraph, Boolean> b;
    private final ReferencePattern c;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LibraryLeakReferenceMatcher)) {
            return false;
        }
        LibraryLeakReferenceMatcher libraryLeakReferenceMatcher = (LibraryLeakReferenceMatcher) other;
        return Intrinsics.areEqual(getC(), libraryLeakReferenceMatcher.getC()) && Intrinsics.areEqual(this.f9841a, libraryLeakReferenceMatcher.f9841a) && Intrinsics.areEqual(this.b, libraryLeakReferenceMatcher.b);
    }

    public int hashCode() {
        ReferencePattern c = getC();
        int hashCode = (c != null ? c.hashCode() : 0) * 31;
        String str = this.f9841a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Function1<HeapGraph, Boolean> function1 = this.b;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ReferenceMatcher
    /* renamed from: a, reason: from getter */
    public ReferencePattern getC() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LibraryLeakReferenceMatcher(ReferencePattern pattern, String description, Function1<? super HeapGraph, Boolean> patternApplies) {
        super((byte) 0);
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(patternApplies, "patternApplies");
        this.c = pattern;
        this.f9841a = description;
        this.b = patternApplies;
    }

    public String toString() {
        return "library leak: " + getC();
    }
}
