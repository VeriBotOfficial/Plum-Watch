package com.bytedance.sdk.component.adexpress.fxn.kg;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.fxn.gff.fxn;
import com.bytedance.sdk.component.utils.ggo;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class gff {
    public abstract File fxn();

    protected boolean fxn(Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar = map.get(it.next());
            if (fxnVar != null && !fxn(fxnVar.bh())) {
                return false;
            }
        }
        return true;
    }

    protected boolean fxn(List<fxn.C0474fxn> list) {
        if (list == null || list.size() <= 0 || fxn() == null) {
            return false;
        }
        for (fxn.C0474fxn c0474fxn : list) {
            String fxn = com.bytedance.sdk.component.utils.rb.fxn(c0474fxn.fxn());
            if (TextUtils.isEmpty(fxn)) {
                return false;
            }
            File file = new File(fxn(), fxn);
            String fxn2 = com.bytedance.sdk.component.utils.rb.fxn(file);
            if (!file.exists() || !file.isFile() || c0474fxn.kg() == null || !c0474fxn.kg().equals(fxn2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean fxn(fxn.kg kgVar) {
        if (kgVar == null || fxn() == null) {
            return false;
        }
        List<Pair<String, String>> kg = kgVar.kg();
        if (kg == null || kg.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = kg.iterator();
        while (it.hasNext()) {
            File file = new File(fxn(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public List<fxn.C0474fxn> fxn(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> fxn = fxnVar.fxn();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (fxn.size() == 0) {
            if (fxnVar2 != null && fxnVar2.fxn().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> fxn2 = fxnVar2.fxn();
                Iterator<String> it = fxn2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar3 = fxn2.get(it.next());
                    if (fxnVar3 != null) {
                        arrayList.addAll(fxnVar3.bh());
                    }
                }
            }
        } else if (fxnVar2 == null || fxnVar2.fxn().size() == 0) {
            if (fxn.size() != 0) {
                Iterator<String> it2 = fxn.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar4 = fxn.get(it2.next());
                    if (fxnVar4 != null) {
                        arrayList2.addAll(fxnVar4.bh());
                    }
                }
            }
        } else {
            Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> fxn3 = fxnVar2.fxn();
            for (String str : fxn.keySet()) {
                com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar5 = fxn.get(str);
                com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar6 = fxn3.get(str);
                if (fxnVar6 == null && fxnVar5 != null) {
                    arrayList2.addAll(fxnVar5.bh());
                } else if (fxnVar5 == null && fxnVar6 != null) {
                    arrayList.addAll(fxnVar6.bh());
                } else if (fxnVar5 != null) {
                    for (fxn.C0474fxn c0474fxn : fxnVar5.bh()) {
                        if (c0474fxn != null && !fxnVar6.bh().contains(c0474fxn) && c0474fxn.kg() != null && c0474fxn.fxn() != null) {
                            arrayList2.add(c0474fxn);
                        }
                    }
                    for (fxn.C0474fxn c0474fxn2 : fxnVar6.bh()) {
                        if (c0474fxn2 != null && !fxnVar5.bh().contains(c0474fxn2)) {
                            arrayList.add(c0474fxn2);
                        }
                    }
                }
            }
        }
        if (fxn(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean fxn(List<fxn.C0474fxn> list, List<fxn.C0474fxn> list2) {
        for (fxn.C0474fxn c0474fxn : list) {
            String fxn = c0474fxn.fxn();
            String fxn2 = com.bytedance.sdk.component.utils.rb.fxn(fxn);
            File file = new File(fxn(), fxn2);
            File file2 = new File(file + DefaultDiskStorage.FileType.TEMP);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.sg.kg.fxn bh = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().bh();
            bh.kg(fxn);
            bh.fxn(fxn().getAbsolutePath(), fxn2);
            com.bytedance.sdk.component.sg.kg fxn3 = bh.fxn();
            list2.add(c0474fxn);
            if (fxn3 == null || !fxn3.bh() || fxn3.rb() == null || !fxn3.rb().exists()) {
                gff(list2);
                return false;
            }
        }
        return true;
    }

    public List<fxn.C0474fxn> kg(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (fxnVar2 == null || fxnVar2.bh().isEmpty()) {
            arrayList2.addAll(fxnVar.bh());
        } else if (fxnVar.bh().isEmpty()) {
            arrayList.addAll(fxnVar2.bh());
        } else {
            for (fxn.C0474fxn c0474fxn : fxnVar.bh()) {
                if (!fxnVar2.bh().contains(c0474fxn) && c0474fxn != null && c0474fxn.fxn() != null && c0474fxn.kg() != null) {
                    arrayList2.add(c0474fxn);
                }
            }
            for (fxn.C0474fxn c0474fxn2 : fxnVar2.bh()) {
                if (!fxnVar.bh().contains(c0474fxn2)) {
                    arrayList.add(c0474fxn2);
                }
            }
        }
        if (fxn(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void kg(List<fxn.C0474fxn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<fxn.C0474fxn> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(fxn(), com.bytedance.sdk.component.utils.rb.fxn(it.next().fxn()));
            File file2 = new File(file + DefaultDiskStorage.FileType.TEMP);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean fxn(String str) {
        File file = new File(fxn().getAbsoluteFile(), com.bytedance.sdk.component.utils.rb.fxn(str) + ".zip");
        com.bytedance.sdk.component.sg.kg.fxn bh = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().bh();
        bh.kg(str);
        bh.fxn(file.getParent(), file.getName());
        com.bytedance.sdk.component.sg.kg fxn = bh.fxn();
        if (fxn.bh() && fxn.rb() != null && fxn.rb().exists()) {
            File rb = fxn.rb();
            try {
                ggo.fxn(rb.getAbsolutePath(), file.getParent());
                if (!rb.exists()) {
                    return true;
                }
                rb.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void fxn(int i) {
        if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().hm() != null) {
            com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().hm().fxn(i);
        }
    }

    public void gff(List<fxn.C0474fxn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<fxn.C0474fxn> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(fxn(), com.bytedance.sdk.component.utils.rb.fxn(it.next().fxn()));
            File file2 = new File(file + DefaultDiskStorage.FileType.TEMP);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void fxn(File file, com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, String str) {
        FileOutputStream fileOutputStream;
        if (fxnVar == null) {
            return;
        }
        String hie = fxnVar.hie();
        if (TextUtils.isEmpty(hie)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + DefaultDiskStorage.FileType.TEMP);
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(hie.getBytes("utf-8"));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                fileOutputStream.close();
            } catch (Throwable unused2) {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    public static boolean gff(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar2) {
        if (fxnVar != null) {
            try {
                if (!TextUtils.isEmpty(fxnVar.gff())) {
                    if (fxnVar2 == null) {
                        return false;
                    }
                    String sg2 = fxnVar.sg();
                    String sg3 = fxnVar2.sg();
                    if ((!TextUtils.isEmpty(sg3) && !sg3.equals(sg2)) || fxn(fxnVar.gff(), fxnVar2.gff())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> fxn = fxnVar.fxn();
                    Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> fxn2 = fxnVar2.fxn();
                    if (fxn.isEmpty()) {
                        return !fxn2.isEmpty();
                    }
                    if (fxn2.isEmpty()) {
                        return false;
                    }
                    return fxn(fxn, fxn2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean fxn(Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> map, Map<String, com.bytedance.sdk.component.adexpress.fxn.gff.fxn> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar = map.get(str);
            if (fxnVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar2 = map2.get(str);
            if (fxnVar2 == null) {
                return false;
            }
            if (fxn(fxnVar.gff(), fxnVar2.gff())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean fxn(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.fxn.kg.gff.fxn(java.lang.String, java.lang.String):boolean");
    }

    public static boolean fxn(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, String str) {
        if (fxnVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(fxnVar.gff())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return fxn(fxnVar.gff(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void kg(File file, com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar, String str) {
        if (fxnVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (fxnVar.bh() != null) {
            Iterator<fxn.C0474fxn> it = fxnVar.bh().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.rb.fxn(it.next().fxn())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
