package org.repackage.com.vivo.identifier;

import android.content.Context;

/* loaded from: classes7.dex */
public class DataBaseOperation {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18850a = "VMS_IDLG_SDK_DB";
    private static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String c = "value";
    private static final String d = "OAID";
    private static final String e = "AAID";
    private static final String f = "VAID";
    private static final String g = "OAIDSTATUS";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 4;
    private Context l;

    public DataBaseOperation(Context context) {
        this.l = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3d
            r1 = 1
            if (r8 == r1) goto L29
            r1 = 2
            if (r8 == r1) goto L15
            r9 = 4
            if (r8 == r9) goto Le
            r2 = r0
            goto L44
        Le:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L43
        L15:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.<init>(r1)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L43
        L29:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.<init>(r1)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L43
        L3d:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L43:
            r2 = r8
        L44:
            android.content.Context r8 = r7.l
            android.content.ContentResolver r1 = r8.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L68
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L64
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r0 = r8.getString(r9)
        L64:
            r8.close()
            return r0
        L68:
            java.lang.String r8 = "VMS_IDLG_SDK_DB"
            java.lang.String r9 = "return cursor is null,return"
            android.util.Log.d(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.vivo.identifier.DataBaseOperation.a(int, java.lang.String):java.lang.String");
    }
}
