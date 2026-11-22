package com.iab.omid.library.bigosg.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class f extends a {
    public f(b.InterfaceC0621b interfaceC0621b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0621b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.bigosg.b.a a2 = com.iab.omid.library.bigosg.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : a2.b()) {
                if (this.f10921a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.bigosg.d.b.b(this.b, this.d.b())) {
            return null;
        }
        this.d.a(this.b);
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.bigosg.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
