package com.wakeup.commponent.module.bi;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SPUtils;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.wakeup.common.Constants;
import com.wakeup.common.PreferencesUtils;
import com.wakeup.common.ab.NorthStarABManager;
import com.wakeup.common.ab.NorthStartConfigs;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.burypoint.BuryPointManager;
import com.wakeup.common.burypoint.monitor.AppEventMonitor;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.storage.AppConfigManager;
import com.wakeup.common.utils.DeviceIdUtils;
import com.wakeup.common.utils.SystemUtils;
import com.wakeup.commponent.module.data.EventData;
import com.wakeup.commponent.module.data.HiDataManager;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PageEventManager {
    private static final String TAG = "PageEventManager";
    private static PageEventManager mInstance;
    private int eventCount;
    private final Map<String, String> pageMap = new HashMap();
    private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    private boolean isAgreePrivacy = false;
    private boolean reliabilityInited = false;

    private interface OnPostEventCallback {
        void onPostEventFail();

        void onPostEventSuccess();
    }

    public static PageEventManager get() {
        if (mInstance == null) {
            synchronized (PageEventManager.class) {
                if (mInstance == null) {
                    mInstance = new PageEventManager();
                }
            }
        }
        return mInstance;
    }

    public void onPageStart(String str) {
        this.pageMap.put(str, String.valueOf(System.currentTimeMillis() / 1000));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|8|(2:22|(1:24)(7:25|11|12|13|14|15|16))|10|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageEnd(java.lang.String r12) {
        /*
            r11 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.pageMap
            boolean r0 = r0.containsKey(r12)
            if (r0 == 0) goto L4d
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.pageMap
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4d
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L40
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L40
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            long r2 = r2 - r0
            r0 = 30
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L2c
        L2a:
            r8 = r0
            goto L34
        L2c:
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L33
            goto L2a
        L33:
            r8 = r2
        L34:
            com.wakeup.commponent.module.bi.PageEventEnum r6 = com.wakeup.commponent.module.bi.PageEventEnum.PAGE     // Catch: java.lang.Exception -> L40
            java.lang.String r10 = ""
            r5 = r11
            r7 = r12
            r5.postMessage(r6, r7, r8, r10)     // Catch: java.lang.Exception -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L43
        L40:
            r0 = move-exception
            r5 = r11
            r7 = r12
        L43:
            r12 = r0
            r12.printStackTrace()
        L47:
            java.util.Map<java.lang.String, java.lang.String> r12 = r5.pageMap
            r12.remove(r7)
            goto L4e
        L4d:
            r5 = r11
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.bi.PageEventManager.onPageEnd(java.lang.String):void");
    }

    public void onPage(String str) {
        postMessage(PageEventEnum.PAGE, str, 0L, "");
    }

    public void onEventMessage(String str) {
        postMessage(PageEventEnum.EVENT, str, 0L, "");
    }

    public void onEventMessage(String str, String str2) {
        postMessage(PageEventEnum.EVENT, str, 0L, str2);
    }

    public int getTrackingNumber() {
        int i = SPUtils.getInstance().getInt(Constants.SPKey.ANDROID_TRACKING_NUMBER);
        if (i != 0) {
            return i;
        }
        return 10;
    }

    public void readEventCache() {
        HiDataManager.INSTANCE.queryEventData(0, new BaseCallback<List<EventData>>() { // from class: com.wakeup.commponent.module.bi.PageEventManager.1
            @Override // com.wakeup.common.base.BaseCallback
            public void callback(int i, List<EventData> list) {
                LogUtils.i(PageEventManager.TAG, ": eventDaoList = " + list.size());
                PageEventManager.this.eventCount = list.size();
                if (!SPUtils.getInstance().getBoolean(Constants.SPKey.PAGE_EVENT_CACHE)) {
                    HiDataManager.INSTANCE.deleteAllEventData();
                    SPUtils.getInstance().put(Constants.SPKey.PAGE_EVENT_CACHE, true);
                    PageEventManager.this.eventCount = 0;
                } else if (list.size() > 0) {
                    PageEventManager.this.readEventCache(0, list.size());
                }
            }
        });
    }

    public void flush() {
        try {
            readEventCache();
        } catch (Throwable th) {
            LogUtils.e(TAG, "flush error: " + th.getMessage());
        }
    }

    public void initReliability() {
        if (this.reliabilityInited) {
            return;
        }
        this.reliabilityInited = true;
        flush();
        AppEventMonitor.getInstance().register(new AppEventMonitor.IAppEventListener() { // from class: com.wakeup.commponent.module.bi.PageEventManager.2
            @Override // com.wakeup.common.burypoint.monitor.AppEventMonitor.IAppEventListener
            public void onAppIn() {
            }

            @Override // com.wakeup.common.burypoint.monitor.AppEventMonitor.IAppEventListener
            public void onAppOut(long j) {
                PageEventManager.this.flush();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readEventCache(final int i, final int i2) {
        if (SystemUtils.hasNetwork()) {
            this.singleThreadExecutor.execute(new Runnable() { // from class: com.wakeup.commponent.module.bi.PageEventManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PageEventManager.this.lambda$readEventCache$0(i2, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readEventCache$0(final int i, final int i2) {
        final int min = Math.min(i - i2, getTrackingNumber());
        LogUtils.i(TAG, ": limit = " + min + " ; index = " + i2 + " ; count = " + i);
        HiDataManager.INSTANCE.queryEventData(min, new BaseCallback<List<EventData>>() { // from class: com.wakeup.commponent.module.bi.PageEventManager.3
            @Override // com.wakeup.common.base.BaseCallback
            public void callback(int i3, final List<EventData> list) {
                if (list.size() > 0) {
                    PageEventManager.this.post(list, new OnPostEventCallback() { // from class: com.wakeup.commponent.module.bi.PageEventManager.3.1
                        @Override // com.wakeup.commponent.module.bi.PageEventManager.OnPostEventCallback
                        public void onPostEventFail() {
                        }

                        @Override // com.wakeup.commponent.module.bi.PageEventManager.OnPostEventCallback
                        public void onPostEventSuccess() {
                            HiDataManager.INSTANCE.deleteEventData(list);
                            if (PageEventManager.this.eventCount < min) {
                                PageEventManager.this.eventCount = 0;
                            } else {
                                PageEventManager.this.eventCount -= min;
                            }
                            if (min + i2 < i) {
                                PageEventManager.this.readEventCache(min + i2, i);
                            }
                        }
                    });
                }
            }
        });
    }

    private synchronized void postMessage(PageEventEnum pageEventEnum, String str, long j, String str2) {
        String str3;
        if (!this.isAgreePrivacy) {
            this.isAgreePrivacy = AppConfigManager.getConfig().isAgreePrivacy();
            return;
        }
        if (isBridgeToBuryPoint()) {
            if (pageEventEnum == PageEventEnum.PAGE && j > 0) {
                str3 = "{\"residenceTime\":" + j + "}";
            } else if (str2 != null && !str2.isEmpty()) {
                str3 = "{\"value\":\"" + str2.replace("\\", "\\\\").replace("\"", "\\\"") + "\"}";
            } else {
                str3 = "";
            }
            BuryPointManager.INSTANCE.postEvent(pageEventEnum == PageEventEnum.PAGE ? "page" : "event", str, "", "", System.currentTimeMillis(), str3);
        }
        EventData createEventData = EventData.INSTANCE.createEventData(pageEventEnum == PageEventEnum.PAGE ? 1 : 2, str, j, str2, DeviceIdUtils.getUUID(BaseApplication.getContext()), PreferencesUtils.getString("city"), PreferencesUtils.getString("province"), AppUtils.getAppVersionName(), true, PreferencesUtils.getString("countryName"), PreferencesUtils.getString(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode), PreferencesUtils.getString("provinceCode"), PreferencesUtils.getString("cityCode"));
        this.eventCount++;
        HiDataManager.INSTANCE.saveEventData(createEventData);
        LogUtils.i(TAG, ": eventCount = " + this.eventCount + " ; eventData = " + createEventData);
        if (this.eventCount % getTrackingNumber() == 0) {
            readEventCache(0, getTrackingNumber());
        }
    }

    private boolean isBridgeToBuryPoint() {
        try {
            return NorthStarABManager.getABTestBoolean(NorthStartConfigs.ENABLE_BI_BRIDGE_TO_BURYPOINT, true);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void post(List<EventData> list, final OnPostEventCallback onPostEventCallback) {
        JSONArray jSONArray = new JSONArray();
        for (EventData eventData : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("optKey", eventData.getOptKey());
                jSONObject.put("optType", eventData.getOptType());
                jSONObject.put("otherValue", eventData.getOtherValue());
                jSONObject.put("userId", eventData.getUserId());
                jSONObject.put("userName", eventData.getUserName());
                jSONObject.put("otherValue", eventData.getOtherValue());
                jSONObject.put("remainIntegral", eventData.getRemainIntegral());
                jSONObject.put("residenceTime", eventData.getResidenceTime());
                jSONObject.put("appVersion", eventData.getApp_version());
                jSONObject.put(HttpConstants.HTTP_OS_TYPE_OLD, eventData.getOs_type());
                jSONObject.put("createTime", eventData.getTimeStamp() / 1000);
                jSONObject.put("areaType", eventData.getAreaType());
                jSONObject.put("deviceNumber", eventData.getDeviceNumber());
                if (TextUtils.isEmpty(eventData.getCountryName())) {
                    jSONObject.put("countryName", "无");
                } else {
                    jSONObject.put("countryName", eventData.getCountryName());
                }
                if (TextUtils.isEmpty(eventData.getProvinceName())) {
                    jSONObject.put("provinceName", "无");
                } else {
                    jSONObject.put("provinceName", eventData.getProvinceName());
                }
                if (TextUtils.isEmpty(eventData.getCityName())) {
                    jSONObject.put("cityName", "无");
                } else {
                    jSONObject.put("cityName", eventData.getCityName());
                }
                jSONObject.put(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, eventData.getCountryCode());
                jSONObject.put("provinceCode", eventData.getProvinceCode());
                jSONObject.put("cityCode", eventData.getCityCode());
                jSONObject.put("appName", 3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        RetrofitManager.getInstance().getApiWakeEvent().uploadEvent(RequestBody.INSTANCE.create(jSONArray.toString(), MediaType.parse("application/json; charset=utf-8"))).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<BaseResult<String>>() { // from class: com.wakeup.commponent.module.bi.PageEventManager.4
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.Observer
            public void onNext(BaseResult<String> baseResult) {
                if (baseResult.getCode() == 200) {
                    OnPostEventCallback onPostEventCallback2 = onPostEventCallback;
                    if (onPostEventCallback2 != null) {
                        onPostEventCallback2.onPostEventSuccess();
                    }
                } else {
                    OnPostEventCallback onPostEventCallback3 = onPostEventCallback;
                    if (onPostEventCallback3 != null) {
                        onPostEventCallback3.onPostEventFail();
                    }
                }
                LogUtils.i(PageEventManager.TAG, "onNext = " + baseResult);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                OnPostEventCallback onPostEventCallback2 = onPostEventCallback;
                if (onPostEventCallback2 != null) {
                    onPostEventCallback2.onPostEventFail();
                }
                LogUtils.e(PageEventManager.TAG, ": error = " + th.getMessage());
            }
        });
    }
}
