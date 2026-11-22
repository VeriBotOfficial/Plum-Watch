package com.qumeng.overseas.advlib.__remote__.ui.behavior.event;

import android.app.Dialog;
import com.qumeng.overseas.advlib.__remote__.ui.incite.c;
import com.qumeng.overseas.advlib.__remote__.ui.incite.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f13091a = new ArrayList();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.behavior.event.a$a, reason: collision with other inner class name */
    private static class C0828a implements Observer {
        WeakReference<Dialog> t;

        public C0828a(Dialog dialog) {
            this.t = new WeakReference<>(dialog);
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            if (((d) obj).f13153a == 100) {
                try {
                    c.a().b(this);
                    WeakReference<Dialog> weakReference = this.t;
                    if (weakReference == null || weakReference.get() == null || !this.t.get().isShowing()) {
                        return;
                    }
                    this.t.get().dismiss();
                    a.f13091a.remove(String.valueOf(this.t.get().hashCode()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void a(Dialog dialog) {
        if (f13091a.contains(String.valueOf(dialog.hashCode()))) {
            return;
        }
        c.a().a(new C0828a(dialog));
        f13091a.add(String.valueOf(dialog.hashCode()));
    }
}
