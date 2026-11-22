package com.wakeup.common.storage;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wakeup.common.storage.model.DeviceModel;
import com.wakeup.common.storage.model.MessageAppEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DeviceDao {
    private static final String CACHE_CONNECTED_DEVICE_LIST = "CACHE_CONNECTED_DEVICE_LIST";
    public static final String CACHE_CURRENT_DEVICE_MAC = "CACHE_CURRENT_DEVICE_MAC";
    private static final String CACHE_DEVICE_LIST = "CACHE_DEVICE_LIST";
    public static final String CACHE_LAST_DEVICE_MAC = "CACHE_LAST_DEVICE_MAC";
    private static final Gson gson = new Gson();

    public static DeviceModel getCurrentDevice() {
        String lastDeviceMac = getLastDeviceMac();
        DeviceModel device = !TextUtils.isEmpty(lastDeviceMac) ? getDevice(lastDeviceMac) : null;
        if (device != null) {
            return device;
        }
        List<DeviceModel> deviceList = getDeviceList();
        if (deviceList.isEmpty()) {
            return null;
        }
        return deviceList.get(0);
    }

    public static DeviceModel getLastDevice() {
        String lastDeviceMac = getLastDeviceMac();
        if (TextUtils.isEmpty(lastDeviceMac)) {
            return null;
        }
        return getDevice(lastDeviceMac);
    }

    public static boolean isSupportHs(String mac) {
        if (TextUtils.isEmpty(mac)) {
            mac = getLastDeviceMac();
        }
        return DeviceLocalSupports.getType(mac) == 11 && DeviceLocalSupports.isSupportFileTrans(mac);
    }

    public static boolean isSupport(int id2) {
        return isSupport(getCurrentDevice(), id2);
    }

    public static boolean isSupport(DeviceModel deviceModel, int id2) {
        if (deviceModel != null && !TextUtils.isEmpty(deviceModel.getSupports())) {
            Iterator<Integer> it = deviceModel.getSupportList().iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == id2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static DeviceModel getDevice(String mac) {
        if (mac == null) {
            return null;
        }
        for (DeviceModel deviceModel : getDeviceList()) {
            if (!TextUtils.isEmpty(deviceModel.getMac()) && deviceModel.getMac().equals(mac)) {
                return deviceModel;
            }
        }
        return null;
    }

    public static synchronized void syncBindDevices(List<DeviceModel> serviceList) {
        synchronized (DeviceDao.class) {
            List<DeviceModel> deviceList = getDeviceList();
            ArrayList arrayList = new ArrayList();
            for (final DeviceModel deviceModel : deviceList) {
                DeviceModel deviceModel2 = (DeviceModel) CollectionUtils.find(serviceList, new CollectionUtils.Predicate() { // from class: com.wakeup.common.storage.DeviceDao$$ExternalSyntheticLambda0
                    @Override // com.blankj.utilcode.util.CollectionUtils.Predicate
                    public final boolean evaluate(Object obj) {
                        boolean equals;
                        equals = Objects.equals(((DeviceModel) obj).getMac(), DeviceModel.this.getMac());
                        return equals;
                    }
                });
                if (deviceModel2 != null) {
                    deviceModel2.setTemp(false);
                    arrayList.add(deviceModel2);
                } else if (deviceModel.isTemp()) {
                    arrayList.add(deviceModel);
                }
            }
            for (final DeviceModel deviceModel3 : serviceList) {
                if (((DeviceModel) CollectionUtils.find(deviceList, new CollectionUtils.Predicate() { // from class: com.wakeup.common.storage.DeviceDao$$ExternalSyntheticLambda1
                    @Override // com.blankj.utilcode.util.CollectionUtils.Predicate
                    public final boolean evaluate(Object obj) {
                        boolean equals;
                        equals = Objects.equals(DeviceModel.this.getMac(), ((DeviceModel) obj).getMac());
                        return equals;
                    }
                })) == null) {
                    arrayList.add(deviceModel3);
                }
            }
            saveList(arrayList);
        }
    }

    public static synchronized void saveSortList(List<DeviceModel> list) {
        synchronized (DeviceDao.class) {
            saveList(list);
        }
    }

    public static synchronized void addDevice(DeviceModel device) {
        synchronized (DeviceDao.class) {
            List<DeviceModel> deviceList = getDeviceList();
            Iterator<DeviceModel> it = deviceList.iterator();
            while (true) {
                if (it.hasNext()) {
                    DeviceModel next = it.next();
                    if (next.getMac().equals(device.getMac())) {
                        deviceList.set(deviceList.indexOf(next), device);
                        break;
                    }
                } else {
                    deviceList.add(0, device);
                    break;
                }
            }
            saveList(deviceList);
            addConnectedDevice(device);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r3.setVersion(r7);
        saveConnectedList(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean updateDeviceVersion(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.Class<com.wakeup.common.storage.DeviceDao> r0 = com.wakeup.common.storage.DeviceDao.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            if (r1 != 0) goto L68
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L11
            goto L68
        L11:
            java.util.List r1 = getDeviceList()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L6a
        L19:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6a
            com.wakeup.common.storage.model.DeviceModel r4 = (com.wakeup.common.storage.model.DeviceModel) r4     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r4.getMac()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = isSameMac(r5, r6)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L19
            java.lang.String r5 = r4.getVersion()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = android.text.TextUtils.equals(r5, r7)     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L19
            r4.setVersion(r7)     // Catch: java.lang.Throwable -> L6a
            saveList(r1)     // Catch: java.lang.Throwable -> L6a
            java.util.List r1 = getConnectedDeviceList()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L6a
        L47:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L63
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6a
            com.wakeup.common.storage.model.DeviceModel r3 = (com.wakeup.common.storage.model.DeviceModel) r3     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r3.getMac()     // Catch: java.lang.Throwable -> L6a
            boolean r4 = isSameMac(r4, r6)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L47
            r3.setVersion(r7)     // Catch: java.lang.Throwable -> L6a
            saveConnectedList(r1)     // Catch: java.lang.Throwable -> L6a
        L63:
            monitor-exit(r0)
            r6 = 1
            return r6
        L66:
            monitor-exit(r0)
            return r2
        L68:
            monitor-exit(r0)
            return r2
        L6a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.DeviceDao.updateDeviceVersion(java.lang.String, java.lang.String):boolean");
    }

    private static boolean isSameMac(String first, String second) {
        return (TextUtils.isEmpty(first) || TextUtils.isEmpty(second) || !first.equalsIgnoreCase(second)) ? false : true;
    }

    public static synchronized void markRecentConnection(String mac) {
        synchronized (DeviceDao.class) {
            if (TextUtils.isEmpty(mac)) {
                return;
            }
            DeviceModel device = getDevice(mac);
            if (device == null) {
                return;
            }
            addConnectedDevice(device);
        }
    }

    private static synchronized void addConnectedDevice(DeviceModel device) {
        synchronized (DeviceDao.class) {
            List<DeviceModel> connectedDeviceList = getConnectedDeviceList();
            Iterator<DeviceModel> it = connectedDeviceList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Objects.equals(it.next().getMac(), device.getMac())) {
                    it.remove();
                    break;
                }
            }
            connectedDeviceList.add(0, device);
            saveConnectedList(connectedDeviceList);
        }
    }

    public static void removeDevice(String mac) {
        List<DeviceModel> deviceList = getDeviceList();
        Iterator<DeviceModel> it = deviceList.iterator();
        while (it.hasNext()) {
            if (it.next().getMac().equals(mac)) {
                it.remove();
            }
        }
        saveList(deviceList);
    }

    public static synchronized void removeCommonDevice() {
        synchronized (DeviceDao.class) {
            List<DeviceModel> deviceList = getDeviceList();
            Iterator<DeviceModel> it = deviceList.iterator();
            while (it.hasNext()) {
                if (!it.next().isTemp()) {
                    it.remove();
                }
            }
            saveList(deviceList);
        }
    }

    public static synchronized void removeAllDevice() {
        synchronized (DeviceDao.class) {
            CacheManager.INSTANCE.remove(CACHE_DEVICE_LIST);
        }
    }

    public static synchronized void removeAllConnectedDevice() {
        synchronized (DeviceDao.class) {
            CacheManager.INSTANCE.remove(CACHE_CONNECTED_DEVICE_LIST);
        }
    }

    public static synchronized List<DeviceModel> getDeviceList() {
        synchronized (DeviceDao.class) {
            List<DeviceModel> list = (List) gson.fromJson(CacheManager.INSTANCE.getString(CACHE_DEVICE_LIST), new TypeToken<List<DeviceModel>>() { // from class: com.wakeup.common.storage.DeviceDao.1
            }.getType());
            if (!CollectionUtils.isEmpty(list)) {
                return list;
            }
            return new ArrayList();
        }
    }

    public static synchronized List<DeviceModel> getConnectedDeviceList() {
        synchronized (DeviceDao.class) {
            List<DeviceModel> list = (List) gson.fromJson(CacheManager.INSTANCE.getString(CACHE_CONNECTED_DEVICE_LIST), new TypeToken<List<DeviceModel>>() { // from class: com.wakeup.common.storage.DeviceDao.2
            }.getType());
            if (!CollectionUtils.isEmpty(list)) {
                return list;
            }
            return new ArrayList();
        }
    }

    public static Map<String, Integer> getAppNoticeMap(String mac) {
        HashMap hashMap = new HashMap();
        try {
            DeviceModel device = getDevice(mac);
            if (device != null) {
                List<MessageAppEntity> messageAppList = device.getMessageAppList();
                if (!CollectionUtils.isEmpty(messageAppList)) {
                    for (MessageAppEntity messageAppEntity : messageAppList) {
                        if (messageAppEntity != null) {
                            hashMap.put(messageAppEntity.getPackageName(), Integer.valueOf(messageAppEntity.getMessageId()));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private static synchronized void saveList(List<DeviceModel> list) {
        synchronized (DeviceDao.class) {
            CacheManager.INSTANCE.saveString(CACHE_DEVICE_LIST, gson.toJson(list));
        }
    }

    private static synchronized void saveConnectedList(List<DeviceModel> list) {
        synchronized (DeviceDao.class) {
            CacheManager.INSTANCE.saveString(CACHE_CONNECTED_DEVICE_LIST, gson.toJson(list));
        }
    }

    public static String getLastDeviceMac() {
        return CacheManager.INSTANCE.getString(CACHE_LAST_DEVICE_MAC);
    }

    public static String getCurrentDeviceMac() {
        return CacheManager.INSTANCE.getString(CACHE_CURRENT_DEVICE_MAC);
    }

    public static void saveLastDeviceMac(String mac) {
        CacheManager.INSTANCE.saveString(CACHE_LAST_DEVICE_MAC, mac);
        CacheManager.INSTANCE.saveString(CACHE_CURRENT_DEVICE_MAC, mac);
    }

    public static void removeLastMac() {
        List<DeviceModel> deviceList = getDeviceList();
        if (CollectionUtils.isEmpty(deviceList)) {
            clearLastMac();
        } else {
            if (TextUtils.isEmpty(deviceList.get(0).getMac())) {
                return;
            }
            saveLastDeviceMac(deviceList.get(0).getMac());
        }
    }

    public static void clearLastMac() {
        CacheManager.INSTANCE.remove(CACHE_LAST_DEVICE_MAC);
    }
}
