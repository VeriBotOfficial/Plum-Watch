package com.baidu.platform.comapi.walknavi.k.g;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.autonavi.aps.amapapi.config.Const;
import java.util.List;

/* compiled from: TipTool.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static Toast f8814a;

    public static void a(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> list;
        if (context == null) {
            return;
        }
        try {
            list = ((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).getRunningTasks(1);
        } catch (SecurityException unused) {
            Log.e("TipTool", "catch SecurityException");
            list = null;
        }
        if (list == null || list.get(0) == null || !context.getPackageName().equals(list.get(0).baseActivity.getPackageName())) {
            return;
        }
        Toast toast = f8814a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, str.length() <= 15 ? 0 : 1);
        f8814a = makeText;
        makeText.show();
    }
}
