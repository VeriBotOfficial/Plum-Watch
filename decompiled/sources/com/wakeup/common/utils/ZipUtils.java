package com.wakeup.common.utils;

import com.wakeup.common.log.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class ZipUtils {
    public static final String TAG = "ZipUtils";

    public static void UnZipFolder(String zipFileString, String outPathString) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileString));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    new File(outPathString + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                } else {
                    String str = TAG;
                    LogUtils.d(str, outPathString + File.separator + name);
                    File file = new File(outPathString + File.separator + name);
                    if (!file.exists()) {
                        LogUtils.d(str, "Create the file:" + outPathString + File.separator + name);
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    public static void UnZipFolder(String zipFileString, String outPathString, String szName) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileString));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                if (nextEntry.isDirectory()) {
                    szName = szName.substring(0, szName.length() - 1);
                    new File(outPathString + File.separator + szName).mkdirs();
                } else {
                    String str = TAG;
                    LogUtils.d(str, outPathString + File.separator + szName);
                    File file = new File(outPathString + File.separator + szName);
                    if (!file.exists()) {
                        LogUtils.d(str, "Create the file:" + outPathString + File.separator + szName);
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    public static void ZipFolder(String srcFileString, String zipFileString, String zipListFile) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFileString));
        File file = new File(srcFileString);
        LogUtils.d(TAG, "---->" + file.getParent() + "===" + file.getAbsolutePath());
        ZipFiles(file.getParent() + File.separator, file.getName(), zipOutputStream, zipListFile);
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    public static void zipMoreFolder(String srcFileString, String zipFileString, String zipListFile) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFileString));
        File file = new File(srcFileString);
        LogUtils.d(TAG, "zipMoreFolder ---->" + file.getParent() + "zipMoreFolder ===" + file.getAbsolutePath());
        ZipFilesMore(file.getParent() + File.separator, file.getName(), zipOutputStream, zipListFile);
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    private static void ZipFiles(String folderString, String fileString, ZipOutputStream zipOutputSteam, String zipListFile) throws Exception {
        LogUtils.d(TAG, "folderString:" + folderString + "\nfileString:" + fileString + "\n==========================");
        if (zipOutputSteam == null) {
            return;
        }
        File file = new File(folderString + fileString);
        if (file.isFile()) {
            ZipEntry zipEntry = new ZipEntry(zipListFile);
            FileInputStream fileInputStream = new FileInputStream(file);
            zipOutputSteam.putNextEntry(zipEntry);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    zipOutputSteam.write(bArr, 0, read);
                } else {
                    zipOutputSteam.closeEntry();
                    return;
                }
            }
        } else {
            String[] list = file.list();
            if (list.length <= 0) {
                zipOutputSteam.putNextEntry(new ZipEntry(fileString + File.separator));
                zipOutputSteam.closeEntry();
            }
            for (String str : list) {
                ZipFiles(folderString + fileString + "/", str, zipOutputSteam, zipListFile);
            }
        }
    }

    private static void ZipFilesMore(String folderString, String fileString, ZipOutputStream zipOutputSteam, String zipListFile) throws Exception {
        LogUtils.d(TAG, "ZipFilesMore folderString:" + folderString + "\nZipFilesMore fileString:" + fileString + "\n==========================");
        if (zipOutputSteam == null) {
            return;
        }
        File file = new File(folderString + fileString);
        if (file.isFile()) {
            ZipEntry zipEntry = new ZipEntry(zipListFile + fileString);
            FileInputStream fileInputStream = new FileInputStream(file);
            zipOutputSteam.putNextEntry(zipEntry);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    zipOutputSteam.write(bArr, 0, read);
                } else {
                    zipOutputSteam.closeEntry();
                    return;
                }
            }
        } else {
            String[] list = file.list();
            if (list.length <= 0) {
                zipOutputSteam.putNextEntry(new ZipEntry(fileString + File.separator));
                zipOutputSteam.closeEntry();
            }
            for (String str : list) {
                ZipFilesMore(folderString + fileString + "/", str, zipOutputSteam, zipListFile);
            }
        }
    }

    public static InputStream UpZip(String zipFileString, String fileString) throws Exception {
        ZipFile zipFile = new ZipFile(zipFileString);
        return zipFile.getInputStream(zipFile.getEntry(fileString));
    }

    public static List<File> GetFileList(String zipFileString, boolean bContainFolder, boolean bContainFile) throws Exception {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileString));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    File file = new File(name.substring(0, name.length() - 1));
                    if (bContainFolder) {
                        arrayList.add(file);
                    }
                } else {
                    File file2 = new File(name);
                    if (bContainFile) {
                        arrayList.add(file2);
                    }
                }
            } else {
                zipInputStream.close();
                return arrayList;
            }
        }
    }
}
