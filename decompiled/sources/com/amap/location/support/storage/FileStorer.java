package com.amap.location.support.storage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class FileStorer {
    @Deprecated
    public static boolean appendToFile(String str, File file) {
        return writeToFile(str, file, true);
    }

    public static boolean deleteFileOrDir(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(file);
        while (arrayList2.size() > 0) {
            File file2 = (File) arrayList2.remove(0);
            arrayList.add(file2);
            File[] listFiles = file2.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file3 : listFiles) {
                    if (file3.isDirectory()) {
                        arrayList2.add(file3);
                    } else if (file3.exists() && !file3.delete()) {
                        return false;
                    }
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            File file4 = (File) arrayList.get(size);
            if (file4.exists() && !file4.delete()) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    private static boolean deleteFileOrDirDep(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!deleteFileOrDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:16:0x001c */
    public static byte[] readBytes(File file) {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] readBytes = IOUtil.readBytes(fileInputStream);
                    IOUtil.closeQuietly(fileInputStream);
                    return readBytes;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    IOUtil.closeQuietly(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                IOUtil.closeQuietly(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            IOUtil.closeQuietly(closeable2);
            throw th;
        }
    }

    public static List<String> readLines(File file) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            arrayList.add(readLine);
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            IOUtil.closeQuietly(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedReader = bufferedReader2;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        IOUtil.closeQuietly(bufferedReader);
        return arrayList;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:16:0x001c */
    public static String readString(File file) {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    String readString = IOUtil.readString(fileInputStream);
                    IOUtil.closeQuietly(fileInputStream);
                    return readString;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    IOUtil.closeQuietly(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                IOUtil.closeQuietly(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            IOUtil.closeQuietly(closeable2);
            throw th;
        }
    }

    public static boolean writeToFile(String str, File file, boolean z) {
        FileWriter fileWriter;
        if (file == null) {
            return false;
        }
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file.getAbsolutePath(), z);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            fileWriter.write(str);
            IOUtil.closeQuietly(fileWriter);
            return true;
        } catch (Exception e2) {
            e = e2;
            fileWriter2 = fileWriter;
            e.printStackTrace();
            IOUtil.closeQuietly(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            IOUtil.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public static boolean writeToFile(byte[] bArr, File file, boolean z) {
        FileOutputStream fileOutputStream;
        if (file == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath(), z);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            fileOutputStream.write(bArr);
            IOUtil.closeQuietly(fileOutputStream);
            return true;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            IOUtil.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            IOUtil.closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}
