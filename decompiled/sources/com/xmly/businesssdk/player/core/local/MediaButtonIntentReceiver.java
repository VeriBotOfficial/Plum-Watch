package com.xmly.businesssdk.player.core.local;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import com.xmly.businesssdk.player.command.CommandFactory;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class MediaButtonIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_USER = "com.xmly.businesssdk.player";
    public static final String TAG = "MediaBtnIntentReceiver";
    public static boolean actionEnable = true;
    private static int continueClickTimer = 1;
    private static long lastClickTime;
    private static final Handler mHandler = new Handler();

    public interface CommandCallback {
        void onCommand(String str);
    }

    private void analyseHeadSetHookCommand(final String str, final CommandCallback commandCallback) {
        if (System.currentTimeMillis() - lastClickTime < 300) {
            continueClickTimer++;
        } else {
            continueClickTimer = 1;
        }
        lastClickTime = System.currentTimeMillis();
        int i = continueClickTimer;
        if (i == 2) {
            mHandler.removeCallbacksAndMessages(null);
            str = CommandFactory.Command.ACTION_NEXT;
        } else if (i >= 3) {
            mHandler.removeCallbacksAndMessages(null);
            str = CommandFactory.Command.ACTION_PRE;
        }
        mHandler.postDelayed(new Runnable() { // from class: com.xmly.businesssdk.player.core.local.MediaButtonIntentReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                commandCallback.onCommand(str);
            }
        }, 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(final android.content.Context r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.player.core.local.MediaButtonIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void sendCommand(Context context, String str) {
        CommandFactory commandFactory = CommandFactory.getInstance(context);
        HashMap hashMap = new HashMap();
        hashMap.put("from", TAG);
        commandFactory.sendCommand(str, hashMap);
    }
}
