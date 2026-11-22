package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.geckox.utils.f;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChannelCleanHelper.java */
/* loaded from: classes13.dex */
public final class c {
    public static void a(final String str) {
        f.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.c(str);
                } catch (Throwable th) {
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    public static boolean b(String str) {
        try {
            com.bykv.vk.openvk.preload.geckox.g.a a2 = com.bykv.vk.openvk.preload.geckox.g.a.a(str + File.separator + "update.lock");
            if (a2 == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.g.b a3 = com.bykv.vk.openvk.preload.geckox.g.b.a(str + File.separator + "select.lock");
                try {
                    com.bykv.vk.openvk.preload.geckox.utils.b.c(new File(str));
                } catch (Throwable unused) {
                }
                a3.a();
                return true;
            } finally {
                a2.a();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static List<File> a(File[] fileArr) {
        long j;
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = parseLong;
                                a(file2);
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    private static void a(final File file) {
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x00a2, LOOP:0: B:21:0x0067->B:23:0x006d, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:8:0x003c, B:10:0x004c, B:12:0x004f, B:15:0x0054, B:17:0x005c, B:20:0x0063, B:21:0x0067, B:23:0x006d), top: B:7:0x003c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void c(java.lang.String r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "update.lock"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.openvk.preload.geckox.g.a r0 = com.bykv.vk.openvk.preload.geckox.g.a.a(r0)
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "select.lock"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La7
            com.bykv.vk.openvk.preload.geckox.g.b r1 = com.bykv.vk.openvk.preload.geckox.g.b.a(r1)     // Catch: java.lang.Throwable -> La7
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> La2
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La2
            com.bykv.vk.openvk.preload.geckox.a.c$2 r4 = new com.bykv.vk.openvk.preload.geckox.a.c$2     // Catch: java.lang.Throwable -> La2
            r4.<init>()     // Catch: java.lang.Throwable -> La2
            java.io.File[] r4 = r2.listFiles(r4)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L59
            int r2 = r4.length     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L59
            int r2 = r4.length     // Catch: java.lang.Throwable -> La2
            r3 = 1
            if (r2 != r3) goto L54
            goto L59
        L54:
            java.util.List r4 = a(r4)     // Catch: java.lang.Throwable -> La2
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L9b
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L63
            goto L9b
        L63:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> La2
        L67:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L94
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> La2
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r3.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "using.lock"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La2
            com.bykv.vk.openvk.preload.geckox.g.c.c(r2)     // Catch: java.lang.Throwable -> La2
            goto L67
        L94:
            r1.a()     // Catch: java.lang.Throwable -> La7
            r0.a()
            return
        L9b:
            r1.a()     // Catch: java.lang.Throwable -> La7
            r0.a()
            return
        La2:
            r4 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Throwable -> La7
        La7:
            r4 = move-exception
            r0.a()
            throw r4
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.c.c(java.lang.String):void");
    }

    public c(Field field) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(field);
    }
}
