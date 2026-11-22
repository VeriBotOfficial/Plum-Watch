package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes17.dex */
public class d {

    class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f13078a;

        a(String[] strArr) {
            this.f13078a = strArr;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (!str.startsWith("tombstone_")) {
                return false;
            }
            for (String str2 : this.f13078a) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    class b implements Comparator<File> {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    class c implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f13079a;

        c(String[] strArr) {
            this.f13079a = strArr;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (!str.startsWith("tombstone_")) {
                return false;
            }
            for (String str2 : this.f13079a) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    private d() {
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str3 == null) {
            return false;
        }
        return com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().a(str, "\n\n" + str2 + ":\n" + str3 + "\n\n");
    }

    public static boolean b(File file) {
        return file.getName().endsWith(".java.xcrash");
    }

    public static File[] c() {
        return b(new String[]{".java.xcrash"});
    }

    public static File[] b() {
        return b(new String[]{".java.xcrash"});
    }

    private static File[] b(String[] strArr) {
        String c2 = g.c();
        if (c2 == null) {
            return new File[0];
        }
        File file = new File(c2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles(new a(strArr));
            if (listFiles == null) {
                return new File[0];
            }
            Arrays.sort(listFiles, new b());
            return listFiles;
        }
        return new File[0];
    }

    public static boolean a(File file) {
        return com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().d(file);
    }

    public static boolean a(String str) {
        return com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().d(new File(str));
    }

    public static boolean a() {
        return a(new String[]{".java.xcrash"});
    }

    private static boolean a(String[] strArr) {
        File[] listFiles;
        String c2 = g.c();
        if (c2 == null) {
            return false;
        }
        File file = new File(c2);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles(new c(strArr))) == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (!com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.b.b().d(file2)) {
                z = false;
            }
        }
        return z;
    }
}
