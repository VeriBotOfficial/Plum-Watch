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
public class fxn extends gff {
    protected List<String> fxn;
    private final Context gff;
    private com.bytedance.sdk.component.bh.fxn.hm.kg.fxn hm;

    public byte gff() {
        return (byte) 2;
    }

    public byte hm() {
        return (byte) 0;
    }

    public fxn(Context context, com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar) {
        super(context);
        this.fxn = new ArrayList();
        this.gff = context;
        this.hm = fxnVar;
        if (fxnVar == null) {
            this.hm = com.bytedance.sdk.component.bh.fxn.hm.kg.fxn.gff();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int fxn() {
        /*
            r10 = this;
            r1 = 0
            r0 = 0
            android.content.Context r2 = r10.rb()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            java.lang.String r3 = r10.kg()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            java.lang.String r5 = "count(1)"
            r4[r0] = r5     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            if (r1 == 0) goto L23
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L30
        L23:
            if (r1 == 0) goto L33
        L25:
            r1.close()     // Catch: java.lang.Exception -> L33
            goto L33
        L29:
            r0 = move-exception
            if (r1 == 0) goto L2f
            r1.close()     // Catch: java.lang.Exception -> L2f
        L2f:
            throw r0
        L30:
            if (r1 == 0) goto L33
            goto L25
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.fxn.fxn():int");
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff
    public String kg() {
        com.bytedance.sdk.component.bh.fxn.fxn.rb hm = tw.sg().hm();
        if (hm != null) {
            return hm.kg();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.bh.fxn.hm.fxn> fxn(int i, String str) {
        String str2;
        String[] strArr;
        int i2;
        int i3;
        String str3;
        byte b;
        Cursor fxn;
        int i4;
        long fxn2 = com.bytedance.sdk.component.bh.fxn.kg.fxn.fxn(i, rb());
        kg();
        if (fxn2 <= 0) {
            fxn2 = 1;
        } else if (fxn2 > 100) {
            fxn2 = 100;
        }
        String str4 = str + " DESC limit " + fxn2;
        ArrayList arrayList = new ArrayList();
        this.fxn.clear();
        long rmu = tw.sg().rmu();
        if (rmu > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - rmu)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.bh.fxn.gff.fxn.hm() && hm() == 3) {
            i2 = 0;
            i3 = 1;
            str3 = "id";
            b = 3;
            fxn = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            i2 = 0;
            i3 = 1;
            str3 = "id";
            b = 3;
            fxn = com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = fxn;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i5 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i6 = (com.bytedance.sdk.component.bh.fxn.gff.fxn.hm() && hm() == b) ? cursor.getInt(cursor.getColumnIndex("channel")) : i2;
                        i4 = i3;
                        if (i5 == i4) {
                            try {
                                string2 = xdg.fxn(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                                i3 = i4;
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.fxn.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn fxnVar = new com.bytedance.sdk.component.bh.fxn.hm.fxn.fxn(string, jSONObject);
                            fxnVar.fxn(hm());
                            fxnVar.kg(gff());
                            if (com.bytedance.sdk.component.bh.fxn.gff.fxn.hm() && hm() == b) {
                                fxnVar.fxn(i6);
                            }
                            com.bytedance.sdk.component.bh.fxn.gff.fxn.fxn(jSONObject, fxnVar);
                            arrayList.add(fxnVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i4 = i3;
                    }
                    i3 = i4;
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.fxn.isEmpty()) {
                            fxn(this.fxn);
                            this.fxn.clear();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.fxn.isEmpty()) {
                            fxn(this.fxn);
                            this.fxn.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        kg();
        arrayList.size();
        return arrayList;
    }

    public List<com.bytedance.sdk.component.bh.fxn.hm.fxn> fxn(String str) {
        com.bytedance.sdk.component.bh.fxn.hm.kg.fxn fxnVar = this.hm;
        if (fxnVar == null) {
            return new ArrayList();
        }
        return fxn(fxnVar.kg(), str);
    }

    protected void fxn(List<String> list) {
        kg();
        list.size();
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), "DELETE FROM " + kg() + " WHERE " + fxn("id", list, 1000, true));
        com.bytedance.sdk.component.bh.fxn.gff.kg.fxn(com.bytedance.sdk.component.bh.fxn.kg.hm.hm.ln(), list.size());
        gff(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            kg();
        }
    }

    public boolean fxn(int i) {
        if (this.hm == null) {
            return false;
        }
        int fxn = fxn();
        int fxn2 = this.hm.fxn();
        kg();
        return (com.bytedance.sdk.component.bh.fxn.gff.fxn.gff() && (i == 1 || i == 2)) ? fxn > 0 : fxn >= fxn2;
    }

    public static String kg(String str) {
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
