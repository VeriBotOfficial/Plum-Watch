package com.wakeup.common.dfx;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: DfxTool.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/dfx/DfxTool;", "", "<init>", "()V", "FILE_SEP", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "dirPath", "dbName1", "dbName2", "dbName3", "pullDB", "", "pullFile", "fileName", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DfxTool {
    private static final String FILE_SEP;
    public static final DfxTool INSTANCE = new DfxTool();
    private static final String dbName1 = "wearfit_health.db";
    private static final String dbName2 = "wearfit_health.db-shm";
    private static final String dbName3 = "wearfit_health.db-wal";
    private static final String dirPath;

    private DfxTool() {
    }

    static {
        String property = System.getProperty("file.separator");
        FILE_SEP = property;
        dirPath = PathUtils.getExternalAppFilesPath() + property + "db" + property;
    }

    public final void pullDB() {
        pullFile(dbName1);
        pullFile(dbName2);
        pullFile(dbName3);
    }

    private final void pullFile(String fileName) {
        final File file = new File(PathUtils.getInternalAppDbsPath(), fileName);
        final File file2 = new File(dirPath, fileName);
        ThreadsKt.thread$default(true, false, null, null, 0, new Function0() { // from class: com.wakeup.common.dfx.DfxTool$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit pullFile$lambda$0;
                pullFile$lambda$0 = DfxTool.pullFile$lambda$0(file, file2);
                return pullFile$lambda$0;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullFile$lambda$0(File file, File file2) {
        FileUtils.copy(file, file2);
        return Unit.INSTANCE;
    }
}
