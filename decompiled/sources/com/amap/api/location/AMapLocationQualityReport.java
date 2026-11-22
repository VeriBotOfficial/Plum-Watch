package com.amap.api.location;

import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.utils.CoreUtil;

/* loaded from: classes11.dex */
public class AMapLocationQualityReport implements Cloneable {
    public static final int GPS_STATUS_MODE_SAVING = 3;
    public static final int GPS_STATUS_NOGPSPERMISSION = 4;
    public static final int GPS_STATUS_NOGPSPROVIDER = 1;
    public static final int GPS_STATUS_OFF = 2;
    public static final int GPS_STATUS_OK = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2016a = false;
    private int b = 2;
    private int c = 0;
    private String d = "UNKNOWN";
    private long e = 0;
    private boolean f = false;
    AMapLocationClientOption.AMapLocationMode g = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;

    public String getAdviseMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        AMapLocationClientOption.AMapLocationMode aMapLocationMode = this.g;
        if (aMapLocationMode != AMapLocationClientOption.AMapLocationMode.Battery_Saving) {
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    stringBuffer.append("您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n");
                } else if (i == 2) {
                    stringBuffer.append("您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n");
                } else if (i == 3) {
                    stringBuffer.append("您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n");
                } else if (i == 4) {
                    stringBuffer.append("您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n");
                }
            } else if (aMapLocationMode == AMapLocationClientOption.AMapLocationMode.Device_Sensors && this.c < 4) {
                stringBuffer.append("当前GPS信号弱，位置更新可能会延迟\n");
            }
        }
        if (this.g != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            if ("DISCONNECTED".equals(this.d)) {
                stringBuffer.append("您的设备未连接到网络，无法进行网络定位\n");
            } else if ("2G".equals(this.d)) {
                stringBuffer.append("您的设备网络状态不太好，网络定位可能会有延迟\n");
            }
            if (!this.f2016a) {
                stringBuffer.append("您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n");
            }
        }
        return stringBuffer.toString();
    }

    public int getGPSSatellites() {
        return this.c;
    }

    public int getGPSStatus() {
        return this.b;
    }

    public long getNetUseTime() {
        return this.e;
    }

    public String getNetworkType() {
        return this.d;
    }

    public boolean isInstalledHighDangerMockApp() {
        return this.f;
    }

    public boolean isWifiAble() {
        return this.f2016a;
    }

    public void setGPSSatellites(int i) {
        this.c = i;
    }

    public void setGpsStatus(int i) {
        this.b = i;
    }

    public void setInstallHighDangerMockApp(boolean z) {
        this.f = z;
    }

    public void setLocationMode(AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.g = aMapLocationMode;
    }

    public void setNetUseTime(long j) {
        this.e = j;
    }

    public void setNetworkType(String str) {
        this.d = str;
    }

    public void setWifiAble(boolean z) {
        this.f2016a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AMapLocationQualityReport m6871clone() {
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        try {
            aMapLocationQualityReport.setGpsStatus(this.b);
            aMapLocationQualityReport.setGPSSatellites(this.c);
            aMapLocationQualityReport.setWifiAble(this.f2016a);
            aMapLocationQualityReport.setNetUseTime(this.e);
            aMapLocationQualityReport.setNetworkType(this.d);
            aMapLocationQualityReport.setLocationMode(this.g);
            aMapLocationQualityReport.setInstallHighDangerMockApp(this.f);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapLocationQualityReport", "clone");
        }
        return aMapLocationQualityReport;
    }
}
