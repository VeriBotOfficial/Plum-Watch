package com.anythink.expressad.c;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4741a = "UnzipUtility";
    private static final int b = 4096;

    public static int a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        String canonicalPath;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        InputStream inputStream = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            fileOutputStream = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement == null) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    e.getMessage();
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    e2.getMessage();
                                }
                            }
                            return 2;
                        }
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                canonicalPath = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                canonicalPath = "";
                            }
                            if (TextUtils.isEmpty(canonicalPath) || canonicalPath.startsWith("..") || canonicalPath.startsWith("../") || !canonicalPath.startsWith(str2)) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        e3.getMessage();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.getMessage();
                                    }
                                }
                                return 2;
                            }
                            if (zipEntryNextElement.isDirectory()) {
                                file2.mkdirs();
                            } else {
                                if (!file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                try {
                                    inputStream = zipFile.getInputStream(zipEntryNextElement);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int r9 = inputStream.read(bArr, 0, 1024);
                                        if (r9 == -1) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, r9);
                                        fileOutputStream2.flush();
                                    }
                                    fileOutputStream = fileOutputStream2;
                                } catch (IOException e5) {
                                    e = e5;
                                    fileOutputStream = fileOutputStream2;
                                    e.getMessage();
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e6) {
                                            e6.getMessage();
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        return 3;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        return 3;
                                    } catch (IOException e7) {
                                        e7.getMessage();
                                        return 3;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e8) {
                                            e8.getMessage();
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException e9) {
                                        e9.getMessage();
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                e10.getMessage();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e11) {
                                e11.getMessage();
                            }
                        }
                        return 2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            }
            zipFile.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.getMessage();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e14) {
                    e14.getMessage();
                }
            }
            return 0;
        } catch (IOException e15) {
            e = e15;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void a(ZipInputStream zipInputStream, String str) throws Throwable {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int r0 = zipInputStream.read(bArr);
                        if (r0 != -1) {
                            bufferedOutputStream2.write(bArr, 0, r0);
                        } else {
                            bufferedOutputStream2.close();
                            return;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
