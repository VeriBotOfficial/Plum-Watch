package com.sifli.siflicore.btbr.actions;

import android.bluetooth.BluetoothSocket;
import com.sifli.siflicore.btbr.BtBRAction;
import com.sifli.siflicore.log.SFLog;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes14.dex */
public class WriteAction extends BtBRAction {
    private static final String TAG = "WriteAction";
    private OutputStream mOutputStream = null;
    private final byte[] value;

    @Override // com.sifli.siflicore.btbr.BtBRAction
    public boolean expectsResult() {
        return true;
    }

    public WriteAction(byte[] bArr) {
        this.value = bArr;
    }

    @Override // com.sifli.siflicore.btbr.BtBRAction
    public boolean run(BluetoothSocket bluetoothSocket) {
        try {
            OutputStream outputStream = bluetoothSocket.getOutputStream();
            this.mOutputStream = outputStream;
            if (outputStream == null) {
                SFLog.e(TAG, "mOutStream is null");
                return false;
            }
            return writeValue(this.value);
        } catch (IOException unused) {
            SFLog.e(TAG, "Can not get the output stream");
            return false;
        }
    }

    protected boolean writeValue(byte[] bArr) {
        try {
            this.mOutputStream.write(bArr);
            this.mOutputStream.flush();
            return true;
        } catch (IOException e) {
            SFLog.e(TAG, "Error writing to socket: ", e);
            return false;
        }
    }

    protected final byte[] getValue() {
        return this.value;
    }
}
