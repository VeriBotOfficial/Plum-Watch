package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class kg {
    private static fxn fxn;

    public interface fxn {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();

        boolean isStartActivityBySubThread();
    }

    /* renamed from: com.bytedance.sdk.component.utils.kg$kg, reason: collision with other inner class name */
    public interface InterfaceC0490kg {
        void fxn();

        void fxn(Throwable th);
    }

    public static void fxn(fxn fxnVar) {
        fxn = fxnVar;
    }

    public static void fxn(final Context context, final Intent intent, final InterfaceC0490kg interfaceC0490kg) {
        ExecutorService asyncStartActivityThreadPool;
        fxn fxnVar = fxn;
        if (fxnVar != null && fxnVar.isStartActivityBySubThread() && (asyncStartActivityThreadPool = fxn.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.tw.tw("startAct") { // from class: com.bytedance.sdk.component.utils.kg.1
                @Override // java.lang.Runnable
                public void run() {
                    kg.gff(context, intent, interfaceC0490kg);
                }
            });
        } else {
            gff(context, intent, interfaceC0490kg);
        }
    }

    public static boolean fxn(final Context context, final Intent intent, final InterfaceC0490kg interfaceC0490kg, boolean z) {
        fxn fxnVar;
        ExecutorService asyncStartActivityThreadPool;
        if (z && (fxnVar = fxn) != null && fxnVar.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = fxn.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.tw.tw("startAct") { // from class: com.bytedance.sdk.component.utils.kg.2
                @Override // java.lang.Runnable
                public void run() {
                    kg.gff(context, intent, interfaceC0490kg);
                }
            });
            return true;
        }
        return gff(context, intent, interfaceC0490kg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean gff(Context context, Intent intent, InterfaceC0490kg interfaceC0490kg) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0490kg == null) {
                    return true;
                }
                interfaceC0490kg.fxn();
                return true;
            } catch (Throwable th) {
                if (interfaceC0490kg != null) {
                    interfaceC0490kg.fxn(th);
                }
            }
        }
        return false;
    }

    public static Activity fxn(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(R.id.content)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean fxn(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
