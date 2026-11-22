package com.eclipsesource.v8;

import com.facebook.soloader.MinElf;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes14.dex */
public class PlatformDetector {

    public static class Arch {
        public static String getName() {
            String property = System.getProperty("os.arch");
            String normalizeArch = PlatformDetector.normalizeArch(property);
            if (normalizeArch.equals("unknown")) {
                throw new UnsatisfiedLinkError("Unsupported arch: " + property);
            }
            return normalizeArch;
        }
    }

    public static class OS {
        public static String getName() {
            String property = System.getProperty("os.name");
            String normalizeOs = PlatformDetector.normalizeOs(property);
            String property2 = System.getProperty("java.specification.vendor");
            if (PlatformDetector.normalize(property2).contains("android") || normalizeOs.contains("android")) {
                return "android";
            }
            if (normalizeOs.equals("unknown")) {
                throw new UnsatisfiedLinkError("Unsupported platform/vendor: " + property + " / " + property2);
            }
            return normalizeOs;
        }

        public static boolean isWindows() {
            return getName().equals(Platform.WINDOWS);
        }

        public static boolean isMac() {
            return getName().equals(Platform.MACOSX);
        }

        public static boolean isLinux() {
            return getName().equals(Platform.LINUX);
        }

        public static boolean isNativeClient() {
            return getName().equals(Platform.NATIVE_CLIENT);
        }

        public static boolean isAndroid() {
            return getName().equals("android");
        }

        public static String getLibFileExtension() {
            if (isWindows()) {
                return "dll";
            }
            if (isMac()) {
                return "dylib";
            }
            if (isLinux() || isAndroid() || isNativeClient()) {
                return "so";
            }
            throw new UnsatisfiedLinkError("Unsupported platform library-extension for: " + getName());
        }
    }

    public static class Vendor {
        private static final String LINUX_ID_PREFIX = "ID=";
        private static final String[] LINUX_OS_RELEASE_FILES = {"/etc/os-release", "/usr/lib/os-release"};
        private static final String REDHAT_RELEASE_FILE = "/etc/redhat-release";

        public static String getName() {
            if (OS.isWindows()) {
                return "microsoft";
            }
            if (OS.isMac()) {
                return "apple";
            }
            if (OS.isLinux()) {
                return getLinuxOsReleaseId();
            }
            if (OS.isAndroid()) {
                return AndroidStaticDeviceInfoDataSource.STORE_GOOGLE;
            }
            throw new UnsatisfiedLinkError("Unsupported vendor: " + getName());
        }

        private static String getLinuxOsReleaseId() {
            for (String str : LINUX_OS_RELEASE_FILES) {
                File file = new File(str);
                if (file.exists()) {
                    return parseLinuxOsReleaseFile(file);
                }
            }
            File file2 = new File(REDHAT_RELEASE_FILE);
            if (file2.exists()) {
                return parseLinuxRedhatReleaseFile(file2);
            }
            throw new UnsatisfiedLinkError("Unsupported linux vendor: " + getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            r1 = com.eclipsesource.v8.PlatformDetector.normalizeOsReleaseValue(r5.substring(com.eclipsesource.v8.PlatformDetector.Vendor.LINUX_ID_PREFIX.length()));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String parseLinuxOsReleaseFile(java.io.File r5) {
            /*
                java.lang.String r0 = "ID="
                r1 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
                java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
                java.lang.String r5 = "utf-8"
                r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38
            L14:
                java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
                if (r5 == 0) goto L2c
                boolean r3 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
                if (r3 == 0) goto L14
                int r0 = r0.length()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
                java.lang.String r5 = r5.substring(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
                java.lang.String r1 = com.eclipsesource.v8.PlatformDetector.access$300(r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            L2c:
                closeQuietly(r2)
                return r1
            L30:
                r5 = move-exception
                r1 = r2
                goto L34
            L33:
                r5 = move-exception
            L34:
                closeQuietly(r1)
                throw r5
            L38:
                r2 = r1
            L39:
                closeQuietly(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.v8.PlatformDetector.Vendor.parseLinuxOsReleaseFile(java.io.File):java.lang.String");
        }

        private static String parseLinuxRedhatReleaseFile(File file) {
            BufferedReader bufferedReader;
            String str = "fedora";
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String lowerCase = readLine.toLowerCase(Locale.US);
                        if (lowerCase.contains("centos")) {
                            str = "centos";
                        } else if (!lowerCase.contains("fedora")) {
                            if (!lowerCase.contains("red hat enterprise linux")) {
                                closeQuietly(bufferedReader);
                                return null;
                            }
                            str = "rhel";
                        }
                        closeQuietly(bufferedReader);
                        return str;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
            closeQuietly(bufferedReader);
            return null;
        }

        private static void closeQuietly(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeOsReleaseValue(String str) {
        return str.trim().replace("\"", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeOs(String str) {
        String normalize = normalize(str);
        if (normalize.startsWith("aix")) {
            return "aix";
        }
        if (normalize.startsWith("hpux")) {
            return "hpux";
        }
        if (normalize.startsWith("os400") && (normalize.length() <= 5 || !Character.isDigit(normalize.charAt(5)))) {
            return "os400";
        }
        if (normalize.startsWith("android")) {
            return "android";
        }
        if (normalize.startsWith(Platform.LINUX)) {
            return Platform.LINUX;
        }
        if (normalize.startsWith(Platform.NATIVE_CLIENT)) {
            return Platform.NATIVE_CLIENT;
        }
        if (normalize.startsWith(Platform.MACOSX) || normalize.startsWith("osx")) {
            return Platform.MACOSX;
        }
        if (normalize.startsWith("freebsd")) {
            return "freebsd";
        }
        if (normalize.startsWith("openbsd")) {
            return "openbsd";
        }
        if (normalize.startsWith("netbsd")) {
            return "netbsd";
        }
        if (normalize.startsWith("solaris") || normalize.startsWith("sunos")) {
            return "sunos";
        }
        if (normalize.startsWith(Platform.WINDOWS)) {
            return Platform.WINDOWS;
        }
        return "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeArch(String str) {
        String normalize = normalize(str);
        if (normalize.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return MinElf.ISA.X86_64;
        }
        if (normalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            return "x86_32";
        }
        if (normalize.matches("^(ia64|itanium64)$")) {
            return "itanium_64";
        }
        if (normalize.matches("^(sparc|sparc32)$")) {
            return "sparc_32";
        }
        if (normalize.matches("^(sparcv9|sparc64)$")) {
            return "sparc_64";
        }
        if (normalize.matches("^(arm|arm32)$") || normalize.startsWith("armv7")) {
            return "arm_32";
        }
        if ("aarch64".equals(normalize) || normalize.startsWith("armv8")) {
            return "aarch_64";
        }
        if (normalize.matches("^(ppc|ppc32)$")) {
            return "ppc_32";
        }
        if ("ppc64".equals(normalize)) {
            return "ppc_64";
        }
        if ("ppc64le".equals(normalize)) {
            return "ppcle_64";
        }
        if ("s390".equals(normalize)) {
            return "s390_32";
        }
        if ("s390x".equals(normalize)) {
            return "s390_64";
        }
        return "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalize(String str) {
        return str == null ? "" : str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }
}
