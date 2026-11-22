package com.hispark.crashdump.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/hispark/crashdump/protocol/BoardProtocolListItem;", "", "<init>", "()V", "Entry", "End", "Lcom/hispark/crashdump/protocol/BoardProtocolListItem$End;", "Lcom/hispark/crashdump/protocol/BoardProtocolListItem$Entry;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BoardProtocolListItem {
    public /* synthetic */ BoardProtocolListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: BoardFileProtocol.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/hispark/crashdump/protocol/BoardProtocolListItem$Entry;", "Lcom/hispark/crashdump/protocol/BoardProtocolListItem;", "name", "", "isFile", "", "size", "", "<init>", "(Ljava/lang/String;ZI)V", "getName", "()Ljava/lang/String;", "()Z", "getSize", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Entry extends BoardProtocolListItem {
        private final boolean isFile;
        private final String name;
        private final int size;

        public static /* synthetic */ Entry copy$default(Entry entry, String str, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = entry.name;
            }
            if ((i2 & 2) != 0) {
                z = entry.isFile;
            }
            if ((i2 & 4) != 0) {
                i = entry.size;
            }
            return entry.copy(str, z, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFile() {
            return this.isFile;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public final Entry copy(String name, boolean isFile, int size) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Entry(name, isFile, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(this.name, entry.name) && this.isFile == entry.isFile && this.size == entry.size;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + Boolean.hashCode(this.isFile)) * 31) + Integer.hashCode(this.size);
        }

        public String toString() {
            return "Entry(name=" + this.name + ", isFile=" + this.isFile + ", size=" + this.size + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Entry(String name, boolean z, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.isFile = z;
            this.size = i;
        }

        public final String getName() {
            return this.name;
        }

        public final int getSize() {
            return this.size;
        }

        public final boolean isFile() {
            return this.isFile;
        }
    }

    private BoardProtocolListItem() {
    }

    /* compiled from: BoardFileProtocol.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/hispark/crashdump/protocol/BoardProtocolListItem$End;", "Lcom/hispark/crashdump/protocol/BoardProtocolListItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class End extends BoardProtocolListItem {
        public static final End INSTANCE = new End();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof End)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -679411176;
        }

        public String toString() {
            return "End";
        }

        private End() {
            super(null);
        }
    }
}
