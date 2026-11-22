package com.baidu.mapsdkplatform.comapi.commonutils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes13.dex */
public class AssetsLoadUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f8347a = true;

    private static String a(String str, String str2, Context context) {
        ZipFile zipFile;
        File file;
        File file2;
        ZipEntry entry;
        StringBuilder sb = new StringBuilder(context.getFilesDir().getAbsolutePath());
        ZipFile zipFile2 = null;
        try {
            try {
                try {
                    zipFile = new ZipFile(f8347a ? context.getPackageCodePath() : "");
                } catch (IOException unused) {
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf > 0) {
                file = new File(context.getFilesDir().getAbsolutePath());
                file2 = new File(file.getAbsolutePath() + "/" + str2.substring(0, lastIndexOf), str2.substring(lastIndexOf + 1, str2.length()));
            } else {
                file = new File(context.getFilesDir(), "assets");
                file2 = new File(file.getAbsolutePath(), str2);
            }
            file.mkdirs();
            entry = zipFile.getEntry(str);
        } catch (Exception e2) {
            e = e2;
            zipFile2 = zipFile;
            Log.e("AssetsLoadUtil", "copyAssetsError", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
        if (entry == null) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            return null;
        }
        a(zipFile.getInputStream(entry), new FileOutputStream(file2));
        sb.append("/").append(str);
        zipFile.close();
        return sb.toString();
    }

    public static void copyFileFromAsset(String str, String str2, Context context) {
        InputStream inputStream;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            if (inputStream != null) {
                try {
                    try {
                        bArr = new byte[inputStream.available()];
                        inputStream.read(bArr);
                        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        file.createNewFile();
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    fileOutputStream2 = fileOutputStream;
                } catch (Exception unused2) {
                    fileOutputStream2 = fileOutputStream;
                    a("assets/" + str, str2, context);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    throw th;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: IOException -> 0x0070, TRY_LEAVE, TryCatch #7 {IOException -> 0x0070, blocks: (B:34:0x006c, B:28:0x0074), top: B:33:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAssetsFilePath(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "/"
            r1 = 0
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            java.io.InputStream r2 = r2.open(r7)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r2.read(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            java.io.File r6 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            java.io.File r4 = new java.io.File     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            r4.<init>(r5)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            boolean r5 = r4.exists()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            if (r5 == 0) goto L3f
            r4.delete()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
        L3f:
            r4.createNewFile()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            r5.<init>(r4)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L5a
            r5.write(r3)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L91
            r2.close()     // Catch: java.io.IOException -> L51
            r5.close()     // Catch: java.io.IOException -> L51
            goto L7b
        L51:
            r1 = move-exception
            r1.printStackTrace()
            goto L7b
        L56:
            r1 = move-exception
            goto L67
        L58:
            r3 = move-exception
            goto L65
        L5a:
            r6 = move-exception
            goto L93
        L5c:
            r3 = move-exception
            r6 = r1
            goto L65
        L5f:
            r6 = move-exception
            r2 = r1
            goto L93
        L62:
            r3 = move-exception
            r6 = r1
            r2 = r6
        L65:
            r5 = r1
            r1 = r3
        L67:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L72
            r2.close()     // Catch: java.io.IOException -> L70
            goto L72
        L70:
            r1 = move-exception
            goto L78
        L72:
            if (r5 == 0) goto L7b
            r5.close()     // Catch: java.io.IOException -> L70
            goto L7b
        L78:
            r1.printStackTrace()
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
        L91:
            r6 = move-exception
            r1 = r5
        L93:
            if (r2 == 0) goto L9b
            r2.close()     // Catch: java.io.IOException -> L99
            goto L9b
        L99:
            r7 = move-exception
            goto La1
        L9b:
            if (r1 == 0) goto La4
            r1.close()     // Catch: java.io.IOException -> L99
            goto La4
        La1:
            r7.printStackTrace()
        La4:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapsdkplatform.comapi.commonutils.AssetsLoadUtil.getAssetsFilePath(android.content.Context, java.lang.String):java.lang.String");
    }

    public static Bitmap loadAssetsFile(String str, Context context) {
        try {
            InputStream open = context.getAssets().open(str);
            if (open != null) {
                return BitmapFactory.decodeStream(open);
            }
            return null;
        } catch (Exception unused) {
            return BitmapFactory.decodeFile(a("assets/" + str, str, context));
        }
    }

    private static void a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
    }
}
