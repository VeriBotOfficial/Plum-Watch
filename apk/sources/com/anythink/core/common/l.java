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

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
            for (int r7 = 0; r7 < intentFilter.countActions(); r7++) {
                String action = intentFilter.getAction(r7);
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
            ArrayList<b> arrayListRemove = this.e.remove(broadcastReceiver);
            if (arrayListRemove != null) {
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    b bVar = arrayListRemove.get(size);
                    bVar.d = true;
                    for (int r5 = 0; r5 < bVar.f3963a.countActions(); r5++) {
                        String action = bVar.f3963a.getAction(r5);
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
        int r17;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        String str3;
        synchronized (this.e) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.d.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.f.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int r6 = 0;
                while (r6 < arrayList3.size()) {
                    b bVar = arrayList3.get(r6);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f3963a);
                    }
                    if (bVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        r17 = r6;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        r17 = r6;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int r3 = bVar.f3963a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (r3 >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(r3));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.c = true;
                        } else if (z) {
                            if (r3 == -4) {
                                str3 = SpeechConstant.ISE_CATEGORY;
                            } else if (r3 == -3) {
                                str3 = "action";
                            } else if (r3 == -2) {
                                str3 = "data";
                            } else if (r3 == -1) {
                                str3 = "type";
                            } else {
                                str3 = "unknown reason";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(String.valueOf(str3)));
                        }
                        r6 = r17 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    r6 = r17 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int r4 = 0; r4 < arrayList5.size(); r4++) {
                        ((b) arrayList5.get(r4)).c = false;
                    }
                    this.g.add(new a(intent, arrayList5));
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
            for (int r3 = 0; r3 < size; r3++) {
                a aVar = aVarArr[r3];
                int size2 = aVar.b.size();
                for (int r6 = 0; r6 < size2; r6++) {
                    b bVar = aVar.b.get(r6);
                    if (!bVar.d) {
                        bVar.b.onReceive(this.d, aVar.f3962a);
                    }
                }
            }
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f3962a;
        final ArrayList<b> b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f3962a = intent;
            this.b = arrayList;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f3963a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3963a = intentFilter;
            this.b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.f3963a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
