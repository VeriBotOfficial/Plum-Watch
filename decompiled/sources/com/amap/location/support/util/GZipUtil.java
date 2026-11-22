package com.amap.location.support.util;

import com.amap.location.support.storage.IOUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes11.dex */
public class GZipUtil {

    public static class GzFile extends File {
        public GzFile(String str) {
            super(str);
        }

        public GzFile(String str, String str2) {
            super(str, str2);
        }

        public GzFile(File file, String str) {
            super(file, str);
        }

        public GzFile(URI uri) {
            super(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static void compress(File file, GzFile gzFile) throws IOException {
        Throwable th;
        FileInputStream fileInputStream;
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("normal 不合法: 不存在或是一个目录");
        }
        if (gzFile.isDirectory()) {
            throw new IllegalArgumentException("gziped 不合法: 是一个目录");
        }
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    file = new FileOutputStream(gzFile);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(file);
                        try {
                            IOUtil.copy(fileInputStream, gZIPOutputStream);
                            gZIPOutputStream.finish();
                            gZIPOutputStream.flush();
                            IOUtil.closeQuietly(fileInputStream);
                            IOUtil.closeQuietly(file);
                            IOUtil.closeQuietly(gZIPOutputStream);
                        } catch (IOException e) {
                        }
                    } catch (IOException e2) {
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(file);
                        IOUtil.closeQuietly(r0);
                        throw th;
                    }
                } catch (IOException e3) {
                } catch (Throwable th3) {
                    th = th3;
                    file = 0;
                }
            } catch (Throwable th4) {
                r0 = gzFile;
                th = th4;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Throwable th5) {
            th = th5;
            file = 0;
            fileInputStream = null;
        }
    }

    public static void decompress(GzFile gzFile, File file) throws IOException {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        GZIPInputStream gZIPInputStream;
        if (!gzFile.exists() || gzFile.isDirectory()) {
            throw new IllegalArgumentException("gziped 不合法: 不存在或是一个目录");
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException("normal 不合法: 是一个目录");
        }
        GZIPInputStream gZIPInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(gzFile);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    gZIPInputStream = new GZIPInputStream(fileInputStream);
                    try {
                        try {
                            IOUtil.copy(gZIPInputStream, fileOutputStream);
                            fileOutputStream.flush();
                            IOUtil.closeQuietly(fileInputStream);
                            IOUtil.closeQuietly(fileOutputStream);
                            IOUtil.closeQuietly(gZIPInputStream);
                        } catch (IOException e) {
                        }
                    } catch (Throwable th2) {
                        gZIPInputStream2 = gZIPInputStream;
                        th = th2;
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileOutputStream);
                        IOUtil.closeQuietly(gZIPInputStream2);
                        throw th;
                    }
                } catch (IOException e2) {
                } catch (Throwable th3) {
                    th = th3;
                    IOUtil.closeQuietly(fileInputStream);
                    IOUtil.closeQuietly(fileOutputStream);
                    IOUtil.closeQuietly(gZIPInputStream2);
                    throw th;
                }
            } catch (IOException e3) {
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException e4) {
            gZIPInputStream = null;
            fileInputStream = null;
            fileOutputStream = null;
            throw e4;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.ByteArrayOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static byte[] decompress(byte[] bArr) throws Exception {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ?? r2;
        Closeable closeable = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
        } catch (Exception e) {
            e = e;
            byteArrayInputStream = null;
            r2 = 0;
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                r2 = new ByteArrayOutputStream();
                try {
                    try {
                        IOUtil.copy(gZIPInputStream, r2);
                        r2.flush();
                        byte[] byteArray = r2.toByteArray();
                        IOUtil.closeQuietly(byteArrayInputStream);
                        IOUtil.closeQuietly(gZIPInputStream);
                        IOUtil.closeQuietly(r2);
                        return byteArray;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    Closeable closeable2 = r2;
                    th = th3;
                    closeable = closeable2;
                    IOUtil.closeQuietly(byteArrayInputStream);
                    IOUtil.closeQuietly(gZIPInputStream);
                    IOUtil.closeQuietly(closeable);
                    throw th;
                }
            } catch (Exception e3) {
                throw e3;
            } catch (Throwable th4) {
                th = th4;
                IOUtil.closeQuietly(byteArrayInputStream);
                IOUtil.closeQuietly(gZIPInputStream);
                IOUtil.closeQuietly(closeable);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            r2 = 0;
            Exception exc = e;
            gZIPInputStream = r2;
            throw exc;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
        }
    }

    public static byte[] compress(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    IOUtil.closeQuietly(byteArrayOutputStream);
                    IOUtil.closeQuietly(gZIPOutputStream2);
                    return byteArray;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    IOUtil.closeQuietly(byteArrayOutputStream);
                    IOUtil.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }
}
