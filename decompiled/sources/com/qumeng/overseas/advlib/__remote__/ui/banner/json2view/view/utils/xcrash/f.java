package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13084a = "xcrash";
    static final String b = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    static final String c = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    static final String d = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";
    static final String e = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    static final String f = "java";
    static final String g = "tombstone";
    static final String h = ".java.xcrash";

    private f() {
    }

    static String a(Context context, int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            } catch (Exception unused) {
            }
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    String trim = readLine.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                        }
                        return trim;
                    }
                }
                bufferedReader.close();
            } catch (Exception unused3) {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return null;
    }

    static boolean a(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.mkdirs();
                return file.exists() && file.isDirectory();
            }
            return file.isDirectory();
        } catch (Exception unused) {
            return false;
        }
    }

    static String a(Date date, Date date2, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e, Locale.US);
        return "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nCrash type: '" + str + "'\nStart time: '" + simpleDateFormat.format(date) + "'\nCrash time: '" + simpleDateFormat.format(date2) + "'\nApp ID: '" + str2 + "'\nApp version: '" + str3 + "'\n";
    }
}
