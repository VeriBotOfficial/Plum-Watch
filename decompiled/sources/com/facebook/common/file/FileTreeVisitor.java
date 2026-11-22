package com.facebook.common.file;

import java.io.File;

/* loaded from: classes14.dex */
public interface FileTreeVisitor {
    void postVisitDirectory(File file);

    void preVisitDirectory(File file);

    void visitFile(File file);
}
