package com.wakeup.common;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.HealthChangeManager;
import com.wakeup.common.device.HealthSyncUiQuiet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class HealthChangeManager {
    public static final int TYPE_MENSTRUAL = 30002;
    public static final int TYPE_STEP_GOAL = 30001;
    private final Map<Integer, List<OnHealthChangeListener>> mCallbackMap;
    private final Handler mHandler;

    public interface OnHealthChangeListener {
        void onDataChange(int type);
    }

    private HealthChangeManager() {
        this.mCallbackMap = new HashMap();
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static HealthChangeManager getInstance() {
        return Holder.INSTANCE;
    }

    public void sendDataChange(final int type) {
        if (HealthSyncUiQuiet.isQuiet()) {
            HealthSyncUiQuiet.markPending(type);
            return;
        }
        if (this.mCallbackMap.containsKey(Integer.valueOf(type))) {
            List<OnHealthChangeListener> list = this.mCallbackMap.get(Integer.valueOf(type));
            if (CollectionUtils.isNotEmpty(list)) {
                for (final OnHealthChangeListener onHealthChangeListener : list) {
                    this.mHandler.post(new Runnable() { // from class: com.wakeup.common.HealthChangeManager$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthChangeManager.OnHealthChangeListener.this.onDataChange(type);
                        }
                    });
                }
            }
        }
    }

    public void registerListener(int type, OnHealthChangeListener listener) {
        List<OnHealthChangeListener> arrayList;
        if (this.mCallbackMap.containsKey(Integer.valueOf(type))) {
            arrayList = this.mCallbackMap.get(Integer.valueOf(type));
        } else {
            arrayList = new ArrayList<>();
        }
        arrayList.add(listener);
        this.mCallbackMap.put(Integer.valueOf(type), arrayList);
    }

    public void unregisterListener(int type, OnHealthChangeListener listener) {
        List<OnHealthChangeListener> list;
        if (!this.mCallbackMap.containsKey(Integer.valueOf(type)) || (list = this.mCallbackMap.get(Integer.valueOf(type))) == null) {
            return;
        }
        list.remove(listener);
    }

    private static class Holder {
        private static final HealthChangeManager INSTANCE = new HealthChangeManager();

        private Holder() {
        }
    }
}
