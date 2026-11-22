package com.wakeup.common.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ClsUtils {
    private static final String TAG = "ClsUtils";
    static BluetoothDevice remoteDevice;

    public static boolean createBond(Class btClass, BluetoothDevice btDevice) throws Exception {
        return ((Boolean) btClass.getMethod("createBond", new Class[0]).invoke(btDevice, new Object[0])).booleanValue();
    }

    public static boolean removeBond(Class btClass, BluetoothDevice btDevice) throws Exception {
        return ((Boolean) btClass.getMethod("removeBond", new Class[0]).invoke(btDevice, new Object[0])).booleanValue();
    }

    public static boolean setPin(Class btClass, BluetoothDevice btDevice, String str) {
        try {
            Log.e("returnValue", "" + ((Boolean) btClass.getDeclaredMethod("setPin", byte[].class).invoke(btDevice, str.getBytes())));
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
        }
        return true;
    }

    public static boolean setPasskey(Class btClass, BluetoothDevice btDevice, String str) {
        try {
            Log.e("returnValue", "" + ((Boolean) btClass.getDeclaredMethod("setPasskey", byte[].class).invoke(btDevice, str.getBytes())));
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
        }
        return true;
    }

    public static boolean cancelPairingUserInput(Class btClass, BluetoothDevice device) {
        Boolean bool;
        try {
            bool = (Boolean) btClass.getMethod("cancelPairingUserInput", new Class[0]).invoke(device, new Object[0]);
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
            bool = null;
        }
        return bool.booleanValue();
    }

    public static boolean cancelBondProcess(Class btClass, BluetoothDevice device) {
        Boolean bool;
        try {
            bool = (Boolean) btClass.getMethod("cancelBondProcess", new Class[0]).invoke(device, new Object[0]);
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
            bool = null;
        }
        return bool.booleanValue();
    }

    public static void setPairingConfirmation(Class<?> btClass, BluetoothDevice device, boolean isConfirm) {
        try {
            btClass.getDeclaredMethod("setPairingConfirmation", Boolean.TYPE).invoke(device, Boolean.valueOf(isConfirm));
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
        }
    }

    public static void printAllInform(Class clsShow) {
        try {
            Method[] methods = clsShow.getMethods();
            for (int i = 0; i < methods.length; i++) {
                Log.e("method name", methods[i].getName() + ";and the i is:" + i);
            }
            for (Field field : clsShow.getFields()) {
                Log.e("Field name", field.getName());
            }
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
        }
    }

    public static boolean pair(String strAddr, String strPsw) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        defaultAdapter.cancelDiscovery();
        if (!defaultAdapter.isEnabled()) {
            defaultAdapter.enable();
        }
        if (!BluetoothAdapter.checkBluetoothAddress(strAddr)) {
            Log.d("mylog", "devAdd un effient!");
        }
        BluetoothDevice remoteDevice2 = defaultAdapter.getRemoteDevice(strAddr);
        if (remoteDevice2.getBondState() != 12) {
            try {
                Log.d("mylog", "NOT BOND_BONDED");
                setPin(remoteDevice2.getClass(), remoteDevice2, strPsw);
                createBond(remoteDevice2.getClass(), remoteDevice2);
                remoteDevice = remoteDevice2;
                return true;
            } catch (Exception e) {
                Log.d("mylog", "setPiN failed!");
                Log.e(TAG, "" + e.getMessage());
                return false;
            }
        }
        Log.d("mylog", "HAS BOND_BONDED");
        try {
            createBond(remoteDevice2.getClass(), remoteDevice2);
            setPin(remoteDevice2.getClass(), remoteDevice2, strPsw);
            createBond(remoteDevice2.getClass(), remoteDevice2);
            remoteDevice = remoteDevice2;
            return true;
        } catch (Exception e2) {
            Log.d("mylog", "setPiN failed!");
            Log.e(TAG, "" + e2.getMessage());
            return false;
        }
    }
}
