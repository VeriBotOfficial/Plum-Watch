package com.hispark.clouddiag.uploader;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StagedUploadFileValidator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/uploader/StagedUploadFileValidator;", "", "<init>", "()V", "MAX_FILE_SIZE_BYTES", "", "validate", "Lkotlin/Result;", "file", "Ljava/io/File;", "validate-IoAF18A", "(Ljava/io/File;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StagedUploadFileValidator {
    public static final StagedUploadFileValidator INSTANCE = new StagedUploadFileValidator();
    public static final long MAX_FILE_SIZE_BYTES = 104857600;

    private StagedUploadFileValidator() {
    }

    /* renamed from: validate-IoAF18A, reason: not valid java name */
    public final Object m8146validateIoAF18A(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m14057constructorimpl(ResultKt.createFailure(new IllegalStateException("Upload file does not exist: " + file.getAbsolutePath())));
        }
        if (!file.isFile()) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m14057constructorimpl(ResultKt.createFailure(new IllegalStateException("Upload target is not a file: " + file.getAbsolutePath())));
        }
        if (!file.canRead()) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m14057constructorimpl(ResultKt.createFailure(new IllegalStateException("Upload file is not readable: " + file.getAbsolutePath())));
        }
        long length = file.length();
        if (length <= 0) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m14057constructorimpl(ResultKt.createFailure(new IllegalStateException("Upload file is empty: " + file.getAbsolutePath())));
        }
        if (length > 104857600) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m14057constructorimpl(ResultKt.createFailure(new IllegalStateException("Upload file exceeds 104857600 bytes: " + file.getAbsolutePath() + ", size=" + length)));
        }
        Result.Companion companion6 = Result.INSTANCE;
        return Result.m14057constructorimpl(Long.valueOf(length));
    }
}
