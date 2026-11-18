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

/* JADX INFO: loaded from: classes15.dex */
public class AssetsLoadUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f8347a = true;

    private static String a(String str, String str2, Context context) throws Throwable {
        File file;
        File file2;
        StringBuilder sb = new StringBuilder(context.getFilesDir().getAbsolutePath());
        ZipFile zipFile = null;
        try {
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(f8347a ? context.getPackageCodePath() : "");
                    try {
                        int r2 = str2.lastIndexOf("/");
                        if (r2 > 0) {
                            file = new File(context.getFilesDir().getAbsolutePath());
                            file2 = new File(file.getAbsolutePath() + "/" + str2.substring(0, r2), str2.substring(r2 + 1, str2.length()));
                        } else {
                            file = new File(context.getFilesDir(), "assets");
                            file2 = new File(file.getAbsolutePath(), str2);
                        }
                        file.mkdirs();
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            try {
                                zipFile2.close();
                            } catch (IOException unused) {
                            }
                            return null;
                        }
                        a(zipFile2.getInputStream(entry), new FileOutputStream(file2));
                        sb.append("/").append(str);
                        zipFile2.close();
                    } catch (Exception e) {
                        e = e;
                        zipFile = zipFile2;
                        Log.e("AssetsLoadUtil", "copyAssetsError", e);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException unused3) {
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009c A[Catch: IOException -> 0x0098, TRY_LEAVE, TryCatch #2 {IOException -> 0x0098, blocks: (B:38:0x0094, B:42:0x009c), top: B:49:0x0094 }] */
    public static void copyFileFromAsset(String str, String str2, Context context) throws Throwable {
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen != null) {
                try {
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        file.createNewFile();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.close();
                            fileOutputStream = fileOutputStream2;
                        } catch (Exception unused) {
                            fileOutputStream = fileOutputStream2;
                            a("assets/" + str, str2, context);
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    throw th;
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused2) {
                }
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Exception unused3) {
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: IOException -> 0x0070, TRY_LEAVE, TryCatch #7 {IOException -> 0x0070, blocks: (B:29:0x006c, B:33:0x0074), top: B:61:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d A[Catch: IOException -> 0x0099, TRY_LEAVE, TryCatch #0 {IOException -> 0x0099, blocks: (B:41:0x0095, B:45:0x009d), top: B:49:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getAssetsFilePath(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        String absolutePath;
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        absolutePath = context.getFilesDir().getAbsolutePath();
                        try {
                            File file = new File(absolutePath + "/" + str);
                            if (file.exists()) {
                                file.delete();
                            }
                            file.createNewFile();
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                fileOutputStream.write(bArr);
                                try {
                                    inputStreamOpen.close();
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            fileOutputStream = null;
                            e = e;
                            e.printStackTrace();
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return absolutePath + "/" + str;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        absolutePath = null;
                    }
                    return absolutePath + "/" + str;
                } catch (Throwable th) {
                    th = th;
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    } else if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                absolutePath = null;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpen = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
        }
    }

    public static Bitmap loadAssetsFile(String str, Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen != null) {
                return BitmapFactory.decodeStream(inputStreamOpen);
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
                int r1 = inputStream.read(bArr);
                if (r1 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, r1);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (IOException unused3) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused4) {
        }
    }
}
