package sg.bigo.ads.common.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19565a;
    private final List<WeakReference<b>> b;

    /* renamed from: sg.bigo.ads.common.d.a$a, reason: collision with other inner class name */
    static class C1070a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f19568a = new a(0);
    }

    private a() {
        this.f19565a = false;
        this.b = new ArrayList();
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C1070a.f19568a;
    }

    public final void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f19565a = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(this, intentFilter);
        }
    }

    public final void a(Context context, final b bVar) {
        if (!this.f19565a) {
            a(context);
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.common.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = a.this.b.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) ((WeakReference) it.next()).get();
                    if (bVar2 != null && bVar2 == bVar) {
                        return;
                    }
                }
                a.this.b.add(new WeakReference(bVar));
            }
        }, 1L);
    }

    public final void a(final b bVar) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.common.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = a.this.b.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) ((WeakReference) it.next()).get();
                    b bVar3 = bVar;
                    if (bVar3 != null && bVar2 == bVar3) {
                        it.remove();
                        return;
                    }
                }
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Iterator<WeakReference<b>> it = this.b.iterator();
        while (it.hasNext()) {
            b bVar = it.next().get();
            if (bVar != null) {
                String action = intent.getAction();
                boolean z2 = true;
                if ((bVar instanceof c) && !TextUtils.isEmpty(action) && BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(action)) {
                    bVar.a(context, intent);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String action2 = intent.getAction();
                    if ((bVar instanceof e) && q.b((CharSequence) action2)) {
                        action2.hashCode();
                        switch (action2) {
                            case "android.intent.action.SCREEN_OFF":
                            case "android.intent.action.SCREEN_ON":
                            case "android.intent.action.ACTION_POWER_CONNECTED":
                                bVar.a(context, intent);
                                break;
                        }
                        z = z2;
                    }
                    z2 = false;
                    z = z2;
                }
                if (!z) {
                    String action3 = intent.getAction();
                    if ((bVar instanceof d) && !TextUtils.isEmpty(action3) && "android.intent.action.CONFIGURATION_CHANGED".equals(action3)) {
                        bVar.a(context, intent);
                    }
                }
            }
        }
    }
}
