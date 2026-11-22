package com.sifli.siflicore.blecore.actions;

import android.bluetooth.BluetoothGatt;
import android.util.Log;
import com.iflytek.cloud.SpeechConstant;
import com.sifli.siflicore.blecore.queue.BtLEAction;

/* loaded from: classes14.dex */
public class RequestConnectionPriorityAction extends BtLEAction {
    private boolean highSpeedMode;
    private int priority;

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return false;
    }

    public void setHighSpeedMode(boolean z) {
        this.highSpeedMode = z;
    }

    public RequestConnectionPriorityAction(int i) {
        super(null);
        this.highSpeedMode = false;
        this.priority = i;
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean run(BluetoothGatt bluetoothGatt) {
        boolean requestConnectionPriority = bluetoothGatt.requestConnectionPriority(this.priority);
        if (!requestConnectionPriority) {
            Log.w(SpeechConstant.BLUETOOTH, "requestConnectionPriority 设置失败");
        }
        if (this.priority == 1) {
            if (this.highSpeedMode) {
                bluetoothGatt.setPreferredPhy(2, 2, 0);
                return requestConnectionPriority;
            }
            bluetoothGatt.setPreferredPhy(1, 1, 0);
        }
        return requestConnectionPriority;
    }
}
