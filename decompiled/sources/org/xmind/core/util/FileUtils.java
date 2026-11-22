package org.xmind.core.util;

import androidx.media3.common.MimeTypes;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmind.core.CoreException;
import org.xmind.core.IFileEntryFilter;
import org.xmind.core.io.IInputSource;
import org.xmind.core.io.IOutputTarget;
import org.xmind.core.io.IStorage;

/* loaded from: classes7.dex */
public class FileUtils {
    private static Pattern FileNamePattern;

    public static File ensureFileParent(File file) {
        ensureDirectory(file.getParentFile());
        return file;
    }

    public static File ensureDirectory(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void copy(String str, String str2) throws IOException {
        transfer((InputStream) new FileInputStream(str), (OutputStream) new FileOutputStream(str2), true);
    }

    public static void copy(File file, File file2) throws IOException {
        transfer((InputStream) new FileInputStream(file), (OutputStream) new FileOutputStream(file2), true);
    }

    public static void transfer(IStorage iStorage, IStorage iStorage2) throws IOException, CoreException {
        transfer(iStorage, iStorage2, (IFileEntryFilter) null);
    }

    public static void transfer(IStorage iStorage, IStorage iStorage2, IFileEntryFilter iFileEntryFilter) throws IOException, CoreException {
        transfer(iStorage.getInputSource(), iStorage2.getOutputTarget(), iFileEntryFilter);
    }

    public static void transfer(IInputSource iInputSource, IOutputTarget iOutputTarget) throws IOException {
        transfer(iInputSource, iOutputTarget, (IFileEntryFilter) null);
    }

    public static void transfer(IInputSource iInputSource, IOutputTarget iOutputTarget, IFileEntryFilter iFileEntryFilter) throws IOException {
        Iterator<String> entries = iInputSource.getEntries();
        while (entries.hasNext()) {
            String next = entries.next();
            if (iFileEntryFilter == null || iFileEntryFilter.select(next, null, false)) {
                InputStream entryStream = iInputSource.getEntryStream(next);
                if (entryStream != null) {
                    try {
                        try {
                            transfer(entryStream, iOutputTarget.openEntryStream(next));
                        } finally {
                        }
                    } finally {
                        entryStream.close();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static void transfer(InputStream inputStream, OutputStream outputStream) throws IOException {
        transfer(inputStream, outputStream, true, null);
    }

    public static void transfer(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        transfer(inputStream, outputStream, z, null);
    }

    public static void transfer(InputStream inputStream, OutputStream outputStream, boolean z, String str) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
            if (z) {
                try {
                    inputStream.close();
                } finally {
                }
            }
        } catch (Throwable th) {
            if (z) {
                try {
                    inputStream.close();
                } finally {
                }
            }
            throw th;
        }
    }

    public static boolean delete(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        return file.delete() & clearDir(file);
    }

    public static boolean clearDir(File file) {
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles == null || listFiles.length == 0) {
            return true;
        }
        for (File file2 : listFiles) {
            z &= delete(file2);
        }
        return z;
    }

    public static String getMediaType(String str) {
        if (str != null) {
            String extension = getExtension(str);
            if (PictureMimeType.JPG.equals(extension) || ".jpeg".equals(extension)) {
                return "image/jpeg";
            }
            if (PictureMimeType.PNG.equals(extension)) {
                return "image/png";
            }
            if (PictureMimeType.BMP.equals(extension)) {
                return MimeTypes.IMAGE_BMP;
            }
            if (".gif".equals(extension)) {
                return "image/gif";
            }
            return "";
        }
        return "";
    }

    public static String getFileName(String str) {
        if (FileNamePattern == null) {
            FileNamePattern = Pattern.compile("([^/\\\\]*)[/|\\\\]?$");
        }
        Matcher matcher = FileNamePattern.matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }

    public static String getExtension(String str) {
        String fileName = getFileName(str);
        int lastIndexOf = fileName.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return fileName.substring(lastIndexOf);
        }
        return "";
    }

    public static String getNoExtensionFileName(String str) {
        String fileName = getFileName(str);
        int lastIndexOf = fileName.lastIndexOf(46);
        return lastIndexOf >= 0 ? fileName.substring(0, lastIndexOf) : fileName;
    }

    public static void extractZipFile(String str, IOutputTarget iOutputTarget) throws IOException {
        extractZipFile(str, iOutputTarget, (IFileEntryFilter) null);
    }

    public static void extractZipFile(String str, IOutputTarget iOutputTarget, IFileEntryFilter iFileEntryFilter) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
            try {
                extractZipFile(zipInputStream, iOutputTarget, iFileEntryFilter);
            } finally {
                zipInputStream.close();
            }
        } finally {
            fileInputStream.close();
        }
    }

    public static void extractZipFile(File file, IOutputTarget iOutputTarget) throws IOException {
        extractZipFile(file, iOutputTarget, (IFileEntryFilter) null);
    }

    public static void extractZipFile(File file, IOutputTarget iOutputTarget, IFileEntryFilter iFileEntryFilter) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
            try {
                extractZipFile(zipInputStream, iOutputTarget, iFileEntryFilter);
            } finally {
                zipInputStream.close();
            }
        } finally {
            fileInputStream.close();
        }
    }

    public static void extractZipFile(ZipInputStream zipInputStream, IOutputTarget iOutputTarget) throws IOException {
        extractZipFile(zipInputStream, iOutputTarget, (IFileEntryFilter) null);
    }

    public static void extractZipFile(ZipInputStream zipInputStream, IOutputTarget iOutputTarget, IFileEntryFilter iFileEntryFilter) throws IOException {
        OutputStream entryStream;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            String name = nextEntry.getName();
            if (!nextEntry.isDirectory() && (iFileEntryFilter == null || iFileEntryFilter.select(name, null, false))) {
                if (iOutputTarget.isEntryAvaialble(name) && (entryStream = iOutputTarget.getEntryStream(name)) != null) {
                    try {
                        transfer((InputStream) zipInputStream, entryStream, false);
                    } finally {
                        try {
                            entryStream.close();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    }

    public static void extractZipStream(InputStream inputStream, IOutputTarget iOutputTarget) throws IOException {
        extractZipStream(inputStream, iOutputTarget, null);
    }

    public static void extractZipStream(InputStream inputStream, IOutputTarget iOutputTarget, IFileEntryFilter iFileEntryFilter) throws IOException {
        extractZipFile(new ZipInputStream(inputStream), iOutputTarget, iFileEntryFilter);
    }
}
