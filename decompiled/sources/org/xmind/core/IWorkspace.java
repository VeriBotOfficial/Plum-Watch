package org.xmind.core;

import java.io.File;

/* loaded from: classes7.dex */
public interface IWorkspace {
    public static final String DIR_TEMP = "temp";
    public static final String FILE_OPENED = ".opened";
    public static final String FILE_TO_RECOVER = ".toRecover";

    File createTempFile(String str, String str2, String str3);

    String getAbsolutePath(String str);

    String getTempDir();

    String getTempDir(String str);

    String getTempFile(String str);

    String getWorkingDirectory();

    void setWorkingDirectory(String str);
}
