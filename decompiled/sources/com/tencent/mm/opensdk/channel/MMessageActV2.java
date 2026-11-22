package com.tencent.mm.opensdk.channel;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

/* loaded from: classes2.dex */
public class MMessageActV2 {
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    private static final String TAG = "MicroMsg.SDK.MMessageAct";

    public static class Args {
        public static final int INVALID_FLAGS = -1;
        public Bundle bundle;
        public String content;
        public int flags = -1;
        public int launchMode = 2;
        public String targetClassName;
        public String targetPkgName;
        public String token;

        public String toString() {
            return "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
        }
    }

    public static final class SendResult {
        public final int actualLaunchMode;
        public final boolean success;

        public SendResult(boolean z, int i) {
            this.success = z;
            this.actualLaunchMode = i;
        }

        static SendResult fail() {
            return new SendResult(false, 1);
        }
    }

    public static boolean send(Context context, Args args) {
        return sendWithResult(context, args).success;
    }

    private static int sendUsingPendingIntent(Context context, Intent intent) {
        Context context2;
        PendingIntent activity;
        PendingIntent.OnFinished onFinished;
        try {
            Log.i(TAG, "sendUsingPendingIntent");
            activity = PendingIntent.getActivity(context, 3, intent, 201326592);
            onFinished = new PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.channel.MMessageActV2.1
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent2, int i, String str, Bundle bundle) {
                    Log.i(MMessageActV2.TAG, "sendUsingPendingIntent onSendFinished resultCode: " + i + ", resultData: " + str);
                }
            };
        } catch (Exception e) {
            e = e;
            context2 = context;
        }
        try {
            if (Build.VERSION.SDK_INT < 35) {
                context2 = context;
                activity.send(context2, 4, null, onFinished, null);
                return 2;
            }
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            makeBasic.setPendingIntentBackgroundActivityStartMode(1);
            activity.send(context, 4, null, onFinished, null, null, makeBasic.toBundle());
            return 2;
        } catch (Exception e2) {
            e = e2;
            Log.e(TAG, "sendUsingPendingIntent fail, ex = " + e.getMessage());
            context2.startActivity(intent);
            return 1;
        }
    }

    public static SendResult sendWithResult(Context context, Args args) {
        String str;
        StringBuilder append;
        int i;
        if (context == null || args == null) {
            str = "send fail, invalid argument";
        } else {
            if (d.f(args.targetPkgName)) {
                append = new StringBuilder("send fail, invalid targetPkgName, targetPkgName = ").append(args.targetPkgName);
            } else {
                if (d.f(args.targetClassName)) {
                    args.targetClassName = args.targetPkgName + DEFAULT_ENTRY_CLASS_NAME;
                }
                Log.i(TAG, "send, targetPkgName = " + args.targetPkgName + ", targetClassName = " + args.targetClassName + ", launchMode = " + args.launchMode);
                Intent intent = new Intent();
                intent.setClassName(args.targetPkgName, args.targetClassName);
                if (args.bundle != null) {
                    intent.putExtras(args.bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, args.content);
                intent.putExtra(ConstantsAPI.CHECK_SUM, b.a(args.content, com.tencent.mm.opensdk.constants.Build.SDK_INT, packageName));
                intent.putExtra(ConstantsAPI.TOKEN, args.token);
                if (args.flags == -1) {
                    intent.addFlags(268435456).addFlags(134217728);
                } else {
                    intent.setFlags(args.flags);
                }
                try {
                    if (Build.VERSION.SDK_INT < 29 || args.launchMode != 2) {
                        context.startActivity(intent);
                        i = 1;
                    } else {
                        i = sendUsingPendingIntent(context, intent);
                    }
                    Log.d(TAG, "send mm message, intent=".concat(String.valueOf(intent)));
                    return new SendResult(true, i);
                } catch (Exception e) {
                    append = new StringBuilder("send fail, ex = ").append(android.util.Log.getStackTraceString(e));
                }
            }
            str = append.toString();
        }
        Log.e(TAG, str);
        return SendResult.fail();
    }
}
