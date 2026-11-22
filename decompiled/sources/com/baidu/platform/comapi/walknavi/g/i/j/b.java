package com.baidu.platform.comapi.walknavi.g.i.j;

import android.os.AsyncTask;
import android.text.TextUtils;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: DownLoaderTask.java */
/* loaded from: classes13.dex */
public class b extends AsyncTask<String, Integer, String> {

    /* renamed from: a, reason: collision with root package name */
    private String f8741a;
    private int b;
    private a<String> c;
    private boolean d = false;
    private boolean e;
    private String f;

    public b(String str, int i, boolean z, a<String> aVar) {
        this.f8741a = str;
        this.b = i;
        this.c = aVar;
        this.e = z;
    }

    private boolean b(String str) {
        return (str == null || str.length() <= 0 || str.contains("../")) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:10|(1:12))(3:197|(2:199|(1:201))|165)|16|17|18|(5:22|(3:24|25|(5:140|141|(2:149|150)|(2:145|146)|144)(2:27|(5:125|126|(2:134|135)|(2:130|131)|129)(11:29|(1:31)|32|(1:34)|35|36|37|(3:39|40|(1:42)(1:43))|44|45|46)))(3:155|156|157)|47|19|20)|158|159|(2:170|171)|(2:166|167)|162|(1:164)|165) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String d(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.walknavi.g.i.j.b.d(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        a<String> aVar = this.c;
        if (aVar != null) {
            aVar.a(numArr[0].intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a<String> aVar;
        if (TextUtils.isEmpty(str)) {
            a<String> aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a("download error!");
                return;
            }
            return;
        }
        if (MediaConstraintKeys.TRUE.equalsIgnoreCase(str) || "false".equalsIgnoreCase(str) || (aVar = this.c) == null) {
            return;
        }
        aVar.a(100);
        this.c.onResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0189, code lost:
    
        com.baidu.platform.comapi.walknavi.g.i.k.a.a(com.wakeup.howear.game.offline.GamePackageManager.Stage.CANCELLED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018e, code lost:
    
        r8.close();
        r0.close();
     */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.String... r13) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.walknavi.g.i.j.b.doInBackground(java.lang.String[]):java.lang.String");
    }

    private int a(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(10000);
            return openConnection.getContentLength();
        } catch (MalformedURLException | IOException unused) {
            return 0;
        }
    }

    private boolean a(String str, String str2) {
        return str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str.startsWith(str2);
    }

    private boolean a(String str, File file) {
        String[] list;
        return (file.exists() && file.isDirectory() && (list = file.list()) != null && list.length != 0 && com.baidu.platform.comapi.walknavi.g.i.k.f.a(str, ".successUnzip.txt")) ? false : true;
    }
}
