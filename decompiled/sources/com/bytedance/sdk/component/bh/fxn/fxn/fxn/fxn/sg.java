package com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class sg extends gff {
    protected List<String> fxn;
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn gff;

    public byte fxn() {
        return (byte) 1;
    }

    public byte gff() {
        return (byte) 2;
    }

    public sg(Context context, com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        super(context);
        this.fxn = new ArrayList();
        this.gff = fxnVar;
        if (fxnVar == null) {
            this.gff = com.bytedance.sdk.component.bh.fxn.hm.kg.fxn.gff();
        }
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    protected long bh() {
        return com.bytedance.sdk.component.bh.fxn.sg.fxn.kg();
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    public String kg() {
        return tw.sg().hm().hm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hm() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.rb()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r9.kg()     // Catch: java.lang.Throwable -> L28
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "count(1)"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L28
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L22
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L29
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L29
        L22:
            if (r1 == 0) goto L2c
        L24:
            r1.close()     // Catch: java.lang.Exception -> L2c
            goto L2c
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto L2c
            goto L24
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.sg.hm():int");
    }

    public List<com.bytedance.sdk.component.bh.fxn.hm.fxn> fxn(int i, String str) {
        long fxn = com.bytedance.sdk.component.bh.fxn.kg.fxn.fxn(i, rb());
        if (fxn <= 0) {
            fxn = 1;
        } else if (fxn > 100) {
            fxn = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.fxn.clear();
        Cursor fxn2 = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + fxn);
        if (fxn2 != null) {
            while (fxn2.moveToNext()) {
                try {
                    try {
                        String string = fxn2.getString(fxn2.getColumnIndex("id"));
                        String string2 = fxn2.getString(fxn2.getColumnIndex("value"));
                        if (fxn2.getInt(fxn2.getColumnIndex("encrypt")) == 1) {
                            string2 = tw.sg().xdg().fxn(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.fxn.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn fxnVar = new com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn(string, new JSONObject(string2));
                            fxnVar.kg(gff());
                            fxnVar.fxn(fxn());
                            arrayList.add(fxnVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            if (fxn2 != null) {
                try {
                    fxn2.close();
                    if (!this.fxn.isEmpty()) {
                        fxn(this.fxn);
                        this.fxn.clear();
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return arrayList;
    }

    protected void fxn(List<String> list) {
        kg();
        list.size();
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), "DELETE FROM " + kg() + " WHERE " + fxn("id", list, 1000, true));
        com.bytedance.sdk.component.bh.fxn.gff.kg.fxn(com.bytedance.sdk.component.bh.fxn.kg.hm.hm.ln(), list.size());
        gff(list);
    }

    public List<com.bytedance.sdk.component.bh.fxn.hm.fxn> kg(String str) {
        com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar = this.gff;
        if (fxnVar == null) {
            return new ArrayList();
        }
        return fxn(fxnVar.kg(), str);
    }

    public void kg(List<com.bytedance.sdk.component.bh.fxn.hm.fxn> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar : list) {
            linkedList.add(fxnVar.gff());
            com.bytedance.sdk.component.bh.fxn.gff.fxn.hie(fxnVar);
        }
        kg();
        linkedList.size();
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), "DELETE FROM " + kg() + " WHERE " + fxn("id", linkedList, 1000, true));
        gff(linkedList);
    }

    public void fxn(int i, long j) {
        kg(i, j);
    }

    private void kg(int i, long j) {
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public boolean fxn(int i) {
        return this.gff != null && hm() >= this.gff.fxn();
    }

    public static String gff(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static String fxn(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String fxn = fxn(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str).append(str2).append("('").append(fxn).append("')");
        }
        return fxn(sb.toString(), str + str2 + "('')");
    }

    private static String fxn(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
