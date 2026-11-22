package com.eclipsesource.v8;

import com.eclipsesource.v8.PlatformDetector;
import com.umeng.crash.UCrashCallback;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes14.dex */
class LibraryLoader {
    static final String DELIMITER = System.getProperty("line.separator");
    static final String SEPARATOR = System.getProperty("file.separator");
    static final String SWT_LIB_DIR = ".j2v8";

    LibraryLoader() {
    }

    public static String computeLibraryShortName(boolean z) {
        String name = (z && PlatformDetector.OS.isLinux()) ? PlatformDetector.Vendor.getName() : null;
        return "j2v8" + (name != null ? Constants.ACCEPT_TIME_SEPARATOR_SERVER + name : "") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + PlatformDetector.OS.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + PlatformDetector.Arch.getName();
    }

    public static String computeLibraryFullName(boolean z) {
        return "lib" + computeLibraryShortName(z) + "." + PlatformDetector.OS.getLibFileExtension();
    }

    static boolean tryLoad(boolean z, StringBuffer stringBuffer) {
        String computeLibraryShortName = computeLibraryShortName(z);
        String computeLibraryFullName = computeLibraryFullName(z);
        StringBuilder append = new StringBuilder().append(System.getProperty("user.dir"));
        String str = SEPARATOR;
        String sb = append.append(str).append(UCrashCallback.TYPE_NATIVE).append(str).append(computeLibraryFullName).toString();
        if (load(computeLibraryFullName, stringBuffer) || load(computeLibraryShortName, stringBuffer)) {
            return true;
        }
        return new File(sb).exists() && load(sb, stringBuffer);
    }

    static void loadLibrary(String str) {
        if (PlatformDetector.OS.isAndroid()) {
            System.loadLibrary("j2v8");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (tryLoad(true, stringBuffer) || tryLoad(false, stringBuffer)) {
            return;
        }
        if (str == null) {
            str = System.getProperty("java.io.tmpdir");
        }
        if (!extract(str, true, stringBuffer) && !extract(str, false, stringBuffer)) {
            throw new UnsatisfiedLinkError("Could not load J2V8 library. Reasons: " + stringBuffer.toString());
        }
    }

    static boolean load(String str, StringBuffer stringBuffer) {
        try {
            if (str.indexOf(SEPARATOR) != -1) {
                System.load(str);
                return true;
            }
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(DELIMITER);
            }
            stringBuffer.append('\t');
            stringBuffer.append(e.getMessage());
            stringBuffer.append(DELIMITER);
            return false;
        }
    }

    static boolean extract(String str, boolean z, StringBuffer stringBuffer) {
        String computeLibraryFullName = computeLibraryFullName(z);
        return extract(str + SEPARATOR + computeLibraryFullName, computeLibraryFullName, stringBuffer);
    }

    static boolean extract(String str, String str2, StringBuffer stringBuffer) {
        InputStream inputStream;
        boolean z;
        File file = new File(str);
        FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            inputStream = LibraryLoader.class.getResourceAsStream("/" + str2);
            if (inputStream != null) {
                z = true;
                try {
                    byte[] bArr = new byte[4096];
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Throwable unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (z && file.exists()) {
                                file.delete();
                            }
                            return false;
                        }
                    }
                    fileOutputStream2.close();
                    inputStream.close();
                    chmod("755", str);
                    if (load(str, stringBuffer)) {
                        return true;
                    }
                } catch (Throwable unused4) {
                }
            }
        } catch (Throwable unused5) {
            inputStream = null;
            z = false;
        }
        return false;
    }

    static void chmod(String str, String str2) {
        if (PlatformDetector.OS.isWindows()) {
            return;
        }
        try {
            Runtime.getRuntime().exec(new String[]{"chmod", str, str2}).waitFor();
        } catch (Throwable unused) {
        }
    }
}
