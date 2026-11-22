package com.hispark.crashdump;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/hispark/crashdump/DumpDirectoryArtifacts;", "", "files", "", "Lcom/hispark/crashdump/DumpArtifactResolution;", "directories", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "getDirectories", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpDirectoryArtifacts {
    private final List<String> directories;
    private final List<DumpArtifactResolution> files;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DumpDirectoryArtifacts copy$default(DumpDirectoryArtifacts dumpDirectoryArtifacts, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dumpDirectoryArtifacts.files;
        }
        if ((i & 2) != 0) {
            list2 = dumpDirectoryArtifacts.directories;
        }
        return dumpDirectoryArtifacts.copy(list, list2);
    }

    public final List<DumpArtifactResolution> component1() {
        return this.files;
    }

    public final List<String> component2() {
        return this.directories;
    }

    public final DumpDirectoryArtifacts copy(List<DumpArtifactResolution> files, List<String> directories) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(directories, "directories");
        return new DumpDirectoryArtifacts(files, directories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpDirectoryArtifacts)) {
            return false;
        }
        DumpDirectoryArtifacts dumpDirectoryArtifacts = (DumpDirectoryArtifacts) other;
        return Intrinsics.areEqual(this.files, dumpDirectoryArtifacts.files) && Intrinsics.areEqual(this.directories, dumpDirectoryArtifacts.directories);
    }

    public int hashCode() {
        return (this.files.hashCode() * 31) + this.directories.hashCode();
    }

    public String toString() {
        return "DumpDirectoryArtifacts(files=" + this.files + ", directories=" + this.directories + ')';
    }

    public DumpDirectoryArtifacts(List<DumpArtifactResolution> files, List<String> directories) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(directories, "directories");
        this.files = files;
        this.directories = directories;
    }

    public final List<DumpArtifactResolution> getFiles() {
        return this.files;
    }

    public final List<String> getDirectories() {
        return this.directories;
    }
}
