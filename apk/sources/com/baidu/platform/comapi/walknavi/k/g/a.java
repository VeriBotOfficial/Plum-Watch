package com.baidu.platform.comapi.walknavi.k.g;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.autonavi.aps.amapapi.config.Const;
import java.util.List;

/* JADX INFO: compiled from: TipTool.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Toast f8814a;

    public static void a(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        if (context == null) {
            return;
        }
        try {
            runningTasks = ((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).getRunningTasks(1);
        } catch (SecurityException unused) {
            Log.e("TipTool", "catch SecurityException");
            runningTasks = null;
        }
        if (runningTasks == null || runningTasks.get(0) == null || !context.getPackageName().equals(runningTasks.get(0).baseActivity.getPackageName())) {
            return;
        }
        Toast toast = f8814a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(context, str, str.length() <= 15 ? 0 : 1);
        f8814a = toastMakeText;
        toastMakeText.show();
    }
}
