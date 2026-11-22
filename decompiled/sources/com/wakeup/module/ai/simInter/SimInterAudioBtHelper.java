package com.wakeup.module.ai.simInter;

import android.content.IntentFilter;
import kotlin.Metadata;

/* compiled from: SimInterAudioBtHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/ai/simInter/SimInterAudioBtHelper;", "", "<init>", "()V", "TAG", "", "RECHECK_DELAY_MS", "", "createAudioBtIntentFilter", "Landroid/content/IntentFilter;", "isAudioBtConnected", "", "context", "Landroid/content/Context;", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimInterAudioBtHelper {
    public static final SimInterAudioBtHelper INSTANCE = new SimInterAudioBtHelper();
    public static final long RECHECK_DELAY_MS = 800;
    private static final String TAG = "SimInterAudioBtHelper";

    private SimInterAudioBtHelper() {
    }

    public final IntentFilter createAudioBtIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        return intentFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:7:0x0023, B:10:0x002a, B:12:0x0030, B:14:0x003a, B:16:0x0042, B:20:0x004c, B:22:0x0056, B:24:0x005c, B:32:0x0074, B:35:0x0065), top: B:6:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isAudioBtConnected(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "audio bt connected: "
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String[] r1 = com.wakeup.common.permissions.PermissionGroup.BLE_PERMISSIONS
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            boolean r1 = com.wakeup.common.permissions.PermissionsManager.checkPermission(r1)
            java.lang.String r2 = "SimInterAudioBtHelper"
            r3 = 0
            if (r1 != 0) goto L23
            java.lang.String r8 = "audio bt disconnected: no bluetooth permission"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.wakeup.common.log.LogUtils.i(r2, r8)
            return r3
        L23:
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch: java.lang.Exception -> L9d
            if (r1 != 0) goto L2a
            return r3
        L2a:
            boolean r4 = r1.isEnabled()     // Catch: java.lang.Exception -> L9d
            if (r4 != 0) goto L3a
            java.lang.String r8 = "audio bt disconnected: bluetooth disabled"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L9d
            com.wakeup.common.log.LogUtils.i(r2, r8)     // Catch: java.lang.Exception -> L9d
            return r3
        L3a:
            r4 = 2
            int r5 = r1.getProfileConnectionState(r4)     // Catch: java.lang.Exception -> L9d
            r6 = 1
            if (r5 == r4) goto L4b
            int r1 = r1.getProfileConnectionState(r6)     // Catch: java.lang.Exception -> L9d
            if (r1 != r4) goto L49
            goto L4b
        L49:
            r1 = r3
            goto L4c
        L4b:
            r1 = r6
        L4c:
            java.lang.String r4 = "audio"
            java.lang.Object r8 = r8.getSystemService(r4)     // Catch: java.lang.Exception -> L9d
            boolean r4 = r8 instanceof android.media.AudioManager     // Catch: java.lang.Exception -> L9d
            if (r4 == 0) goto L59
            android.media.AudioManager r8 = (android.media.AudioManager) r8     // Catch: java.lang.Exception -> L9d
            goto L5a
        L59:
            r8 = 0
        L5a:
            if (r8 == 0) goto L63
            boolean r4 = r8.isBluetoothA2dpOn()     // Catch: java.lang.Exception -> L9d
            if (r4 != r6) goto L63
            goto L6b
        L63:
            if (r8 == 0) goto L6d
            boolean r8 = r8.isBluetoothScoOn()     // Catch: java.lang.Exception -> L9d
            if (r8 != r6) goto L6d
        L6b:
            r8 = r6
            goto L6e
        L6d:
            r8 = r3
        L6e:
            if (r1 != 0) goto L74
            if (r8 == 0) goto L73
            goto L74
        L73:
            r6 = r3
        L74:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r4.<init>(r0)     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r0 = r4.append(r6)     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = ", profile: "
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = ", route: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r8 = r0.append(r8)     // Catch: java.lang.Exception -> L9d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L9d
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L9d
            com.wakeup.common.log.LogUtils.i(r2, r8)     // Catch: java.lang.Exception -> L9d
            return r6
        L9d:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "check audio bt connected error: "
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.wakeup.common.log.LogUtils.e(r2, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.simInter.SimInterAudioBtHelper.isAudioBtConnected(android.content.Context):boolean");
    }
}
