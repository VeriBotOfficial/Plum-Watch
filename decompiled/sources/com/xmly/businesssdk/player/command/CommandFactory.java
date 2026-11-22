package com.xmly.businesssdk.player.command;

import android.content.Context;
import android.content.Intent;
import com.xmly.businesssdk.player.core.local.PlayerService;
import com.xmly.businesssdk.utils.Logger;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CommandFactory {
    private static CommandFactory factory;
    private final Context mContext;
    private final Class<? extends PlayerService> target = PlayerService.class;

    public interface Command {
        public static final String ACTION_NEXT = "com.fmxos.player.next";
        public static final String ACTION_PAUSE = "com.fmxos.player.pause";
        public static final String ACTION_PLAY = "com.fmxos.player.play";
        public static final String ACTION_PRE = "com.fmxos.player.pre";
        public static final String ACTION_STOP = "com.fmxos.player.stop";
        public static final String ACTION_TOGGLE_PLAY = "com.fmxos.player.toggle";
    }

    public interface Extra {
        public static final String EXTRA_FROM = "from";
    }

    private CommandFactory(Context context) {
        this.mContext = context;
    }

    public static CommandFactory getInstance(Context context) {
        if (factory == null) {
            factory = new CommandFactory(context);
        }
        return factory;
    }

    private Intent getIntent(Context context, String str) {
        Intent intent = new Intent(str);
        Class<? extends PlayerService> cls = this.target;
        if (cls == null) {
            return null;
        }
        intent.setClass(context, cls);
        return intent;
    }

    public void sendCommand(String str) {
        startService(this.mContext, getIntent(this.mContext, str));
    }

    public static boolean startService(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                context.startForegroundService(intent);
                return true;
            } catch (Exception e) {
                Logger.w("CommandFactory", "startService()", e);
            }
        }
        return false;
    }

    public void sendCommand(String str, Map<String, Object> map) {
        Intent intent = getIntent(this.mContext, str);
        if (intent != null && map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Boolean) {
                    intent.putExtra(key, (Boolean) value);
                }
            }
        }
        startService(this.mContext, intent);
    }
}
