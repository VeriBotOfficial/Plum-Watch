package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static String f7000a;

    public class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f7001a;
        public final /* synthetic */ File b;

        public a(File file, File file2) {
            this.f7001a = file;
            this.b = file2;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            j4.a(this.f7001a, this.b, false);
            return null;
        }
    }

    public static File a(Bitmap bitmap, File file, int i) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    e.printStackTrace();
                    return file;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String a(Context context) {
        String str = f7000a;
        if (str != null) {
            return str;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        f7000a = externalFilesDir == null ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
        return f7000a;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return k(new File(str));
    }

    public static String a(String str, Bitmap bitmap, int i) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return str;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdir();
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            a(bitmap, file, i);
            return file.getPath();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(File file, File file2, boolean z) {
        if (file.exists()) {
            if (z) {
                new a(file, file2).execute(new Void[0]);
                return;
            }
            e(file2);
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    a(file3, new File(file2, file3.getName()), Boolean.TRUE);
                } else {
                    a(file3, new File(file2, file3.getName()), false);
                }
            }
        }
    }

    public static void a(File file, boolean z) {
        if (file == null || !file.isDirectory()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, z);
                } else {
                    file2.delete();
                }
            }
        }
        if (z) {
            file.delete();
        }
    }

    public static boolean a(File file) {
        return new File(file, "succeed.txt").exists();
    }

    public static boolean a(File file, File file2, Boolean bool) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        FileOutputStream fileOutputStream;
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return false;
        }
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (file2.exists() && bool.booleanValue()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                x7.a(fileInputStream, fileOutputStream);
                fileOutputStream.flush();
            } catch (Exception e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                try {
                    e.printStackTrace();
                    fileOutputStream = fileOutputStream2;
                    x7.a((Closeable) fileInputStream);
                    x7.a(fileOutputStream);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    x7.a((Closeable) fileInputStream);
                    x7.a(fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = fileOutputStream;
                x7.a((Closeable) fileInputStream);
                x7.a(fileOutputStream2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
        x7.a((Closeable) fileInputStream);
        x7.a(fileOutputStream);
        return true;
    }

    public static boolean a(File file, String str) {
        return new File(file, str).exists();
    }

    public static String[] a(ArrayList<File> arrayList) {
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = arrayList.get(i).getPath();
        }
        return strArr;
    }

    public static boolean b(File file) {
        try {
            return new File(file, "succeed.txt").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void c(File file) {
        a(file, true);
    }

    public static boolean d(File file) {
        if (file != null && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static void e(File file) {
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isFile()) {
            file.delete();
            file.mkdirs();
        }
    }

    public static void f(File file) {
        File parentFile;
        if (file == null || (parentFile = file.getParentFile()) == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static boolean g(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean h(File file) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z = false;
        for (File file2 : listFiles) {
            if (file2.getName().endsWith("succeed.txt")) {
                z = true;
            }
        }
        return z;
    }

    public static ArrayList<File> i(File file) {
        File[] listFiles = file.listFiles();
        ArrayList<File> arrayList = new ArrayList<>();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                } else {
                    i(file2);
                }
            }
        }
        return arrayList;
    }

    public static FileOutputStream j(File file) {
        d(file);
        f(file);
        file.createNewFile();
        return new FileOutputStream(file);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    public static String k(File file) {
        FileInputStream fileInputStream;
        ?? g = g(file);
        FileInputStream fileInputStream2 = null;
        try {
            if (g != 0) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        String a2 = x7.a((InputStream) fileInputStream);
                        x7.a((Closeable) fileInputStream);
                        try {
                            fileInputStream.close();
                            return a2;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return a2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        x7.a((Closeable) fileInputStream);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    x7.a((Closeable) fileInputStream2);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = g;
        }
    }

    public static boolean l(File file) {
        File file2 = new File(file, "succeed.txt");
        if (file2.exists()) {
            return file2.delete();
        }
        return false;
    }
}
