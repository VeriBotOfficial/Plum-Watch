package org.apache.commons.net.ftp;

import java.util.Objects;

/* loaded from: classes8.dex */
public class FTPFileFilters {
    public static final FTPFileFilter ALL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters$$ExternalSyntheticLambda0
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public final boolean accept(FTPFile fTPFile) {
            return FTPFileFilters.lambda$static$0(fTPFile);
        }
    };
    public static final FTPFileFilter NON_NULL = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters$$ExternalSyntheticLambda1
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public final boolean accept(FTPFile fTPFile) {
            boolean nonNull;
            nonNull = Objects.nonNull(fTPFile);
            return nonNull;
        }
    };
    public static final FTPFileFilter DIRECTORIES = new FTPFileFilter() { // from class: org.apache.commons.net.ftp.FTPFileFilters$$ExternalSyntheticLambda2
        @Override // org.apache.commons.net.ftp.FTPFileFilter
        public final boolean accept(FTPFile fTPFile) {
            return FTPFileFilters.lambda$static$1(fTPFile);
        }
    };

    static /* synthetic */ boolean lambda$static$0(FTPFile fTPFile) {
        return true;
    }

    static /* synthetic */ boolean lambda$static$1(FTPFile fTPFile) {
        return fTPFile != null && fTPFile.isDirectory();
    }
}
