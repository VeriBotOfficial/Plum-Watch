package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.iflytek.cloud.SpeechConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final int f3960a = 1;
    private static final String b = "InnerBroadcastManager";
    private static final boolean c = false;
    private static final Object i = new Object();
    private static l j;
    private final Context d;
    private final HashMap<BroadcastReceiver, ArrayList<b>> e = new HashMap<>();
    private final HashMap<String, ArrayList<b>> f = new HashMap<>();
    private final ArrayList<a> g = new ArrayList<>();
    private final Handler h;

    public static l a(Context context) {
        l lVar;
        synchronized (i) {
            if (j == null) {
                j = new l(context.getApplicationContext());
            }
            lVar = j;
        }
        return lVar;
    }

    private l(Context context) {
        this.d = context;
        this.h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.l.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    l.this.a();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.e) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.e.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.e.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<b> arrayList2 = this.f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.e) {
            ArrayList<b> remove = this.e.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    b bVar = remove.get(size);
                    bVar.d = true;
                    for (int i2 = 0; i2 < bVar.f3964a.countActions(); i2++) {
                        String action = bVar.f3964a.getAction(i2);
                        ArrayList<b> arrayList = this.f.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = arrayList.get(size2);
                                if (bVar2.b == broadcastReceiver) {
                                    bVar2.d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean a(Intent intent) {
        String str;
        String str2;
        synchronized (this.e) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.d.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList = this.f.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                }
                ArrayList arrayList2 = null;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    b bVar = arrayList.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f3964a);
                    }
                    if (bVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        str = action;
                    } else {
                        int match = bVar.f3964a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                str = action;
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            } else {
                                str = action;
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(bVar);
                            bVar.c = true;
                        } else {
                            str = action;
                            if (z) {
                                if (match == -4) {
                                    str2 = SpeechConstant.ISE_CATEGORY;
                                } else if (match == -3) {
                                    str2 = "action";
                                } else if (match == -2) {
                                    str2 = "data";
                                } else if (match == -1) {
                                    str2 = "type";
                                } else {
                                    str2 = "unknown reason";
                                }
                                Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(String.valueOf(str2)));
                            }
                        }
                    }
                    i2++;
                    action = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((b) arrayList2.get(i3)).c = false;
                    }
                    this.g.add(new a(intent, arrayList2));
                    if (!this.h.hasMessages(1)) {
                        this.h.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    final void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.e) {
                size = this.g.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.g.toArray(aVarArr);
                this.g.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = aVarArr[i2];
                int size2 = aVar.b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    b bVar = aVar.b.get(i3);
                    if (!bVar.d) {
                        bVar.b.onReceive(this.d, aVar.f3962a);
                    }
                }
            }
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f3962a;
        final ArrayList<b> b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f3962a = intent;
            this.b = arrayList;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f3964a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3964a = intentFilter;
            this.b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.f3964a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
