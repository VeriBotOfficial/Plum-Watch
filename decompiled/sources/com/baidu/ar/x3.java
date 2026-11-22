package com.baidu.ar;

import android.content.Context;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Scanner;

/* loaded from: classes12.dex */
public class x3 extends ArrayList<t3> {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f7329a;
    public boolean b = false;
    public String c;
    public int d;
    public int e;

    public x3(Context context, String str, int i, int i2) {
        this.f7329a = new WeakReference<>(context);
        this.d = i;
        this.c = str;
        this.e = i2;
    }

    public void a() {
        if (this.b) {
            return;
        }
        c();
        this.b = true;
    }

    public void a(int i) {
        if (i > 0) {
            t3[] t3VarArr = new t3[i];
            for (int i2 = 0; i2 < i; i2++) {
                t3VarArr[i2] = get(i2);
            }
            removeRange(0, i);
            t3.a(t3VarArr);
        }
    }

    public void a(t3 t3Var) {
        if (size() < this.d) {
            add(t3Var);
        }
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public void b() {
        Context context;
        if (this.e > 0 && (context = this.f7329a.get()) != null) {
            int size = size();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    fileOutputStream = context.openFileOutput(this.c, 0);
                    if (size > 0) {
                        int i = this.e;
                        if (size > i) {
                            size = i;
                        }
                        for (int i2 = 0; i2 < size; i2++) {
                            fileOutputStream.write((t3.b((t3) get(i2)) + "\n").getBytes("utf-8"));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                a(fileOutputStream);
            }
        }
    }

    public final void c() {
        Context context;
        Scanner scanner;
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        FileInputStream fileInputStream2;
        Scanner scanner2;
        Throwable th2;
        t3 b;
        if (this.e <= 0 || (context = this.f7329a.get()) == null || !context.getFileStreamPath(this.c).exists()) {
            return;
        }
        try {
            fileInputStream = context.openFileInput(this.c);
            try {
                scanner = new Scanner(fileInputStream, "utf-8");
                while (scanner.hasNextLine()) {
                    try {
                        String nextLine = scanner.nextLine();
                        if (nextLine != null && !nextLine.isEmpty() && (b = t3.b(nextLine)) != null) {
                            add(b);
                        }
                    } catch (Exception e2) {
                        fileInputStream2 = fileInputStream;
                        scanner2 = scanner;
                        e = e2;
                        try {
                            e.printStackTrace();
                            a(fileInputStream2);
                            a(scanner2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            scanner = scanner2;
                            fileInputStream = fileInputStream2;
                            th = th2;
                            a(fileInputStream);
                            a(scanner);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        a(fileInputStream);
                        a(scanner);
                        throw th;
                    }
                }
                a(fileInputStream);
                a(scanner);
            } catch (Exception e3) {
                e = e3;
                fileInputStream2 = fileInputStream;
                scanner2 = null;
                e.printStackTrace();
                a(fileInputStream2);
                a(scanner2);
            } catch (Throwable th5) {
                th2 = th5;
                scanner = null;
                th = th2;
                a(fileInputStream);
                a(scanner);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th6) {
            scanner = null;
            th = th6;
            fileInputStream = null;
        }
    }
}
