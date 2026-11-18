package com.iab.omid.library.toponad.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11031a;
    protected final InterfaceC0725b b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.toponad.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0725b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0725b interfaceC0725b) {
        this.b = interfaceC0725b;
    }

    public void a(a aVar) {
        this.f11031a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f11031a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
