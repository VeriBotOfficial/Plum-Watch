package com.baidu.location.indoor.mapversion;

import android.util.Log;
import com.baidu.location.f.f;
import com.baidu.location.h.a.b;

/* loaded from: classes13.dex */
public class IndoorJni {
    public static boolean loadJniSuccess = false;
    private static StringBuffer sb;
    private static StringBuffer sbReport;
    private static StringBuffer sbStartPoint;

    static {
        try {
            System.loadLibrary("indoor");
            loadJniSuccess = true;
            System.err.println("load vdr indoor lib success.");
            Log.i("indoorJNI", "indoor lib loadJniSuccess:" + loadJniSuccess);
        } catch (Throwable th) {
            Log.i("indoorJNI", "indoor lib annot load indoor lib:" + th.toString());
            System.err.println("Cannot load indoor lib");
            th.printStackTrace();
            loadJniSuccess = false;
        }
    }

    private static native void addRecord(int i, String str);

    public static void addRecord(int i, String str, Object... objArr) {
        if (loadJniSuccess) {
            try {
                addRecord(i, String.format(str, objArr));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static native String decrypt(int i, int i2, byte[] bArr, byte[] bArr2);

    public static native int destroyGpsChecker();

    public static native void destroyHeavyVdrPf();

    public static native void destroyPaddleSpeedPredict();

    public static native void destroyVdrPf();

    public static native float gameToOritation(float f, float f2, float f3, float f4);

    public static native String getAndroidRawToObs();

    public static native double[] getAzG();

    public static native double[] getAzGEC();

    public static native double[] getBleRes();

    public static native String getBuildingId(long j);

    public static native double[] getElG();

    public static native double[] getElGEC();

    public static native String getFloor(long j, int i);

    public static native int getGpsStatus(int i, String str);

    public static native String getIndoorArea();

    public static native String getIndoorLocName();

    public static native String getIndoorParkUid();

    public static native String getIndoorParkingLotName();

    public static native String getIndoorParkingLotUid();

    public static native int getIndoorUserStatus(long j);

    public static native int getInout(long j, int i);

    public static native int getMotionState();

    public static native double[] getNewIndoorLocRes(long j);

    public static native String getOffLineLoc(String str, int i);

    public static native String getParkArea();

    public static native String getParkLocName();

    public static native String getParkParkUid();

    public static native String getParkParkingLotName();

    public static native String getParkParkingLotUid();

    public static native int[] getPrnG();

    public static native int[] getPrnGEC();

    public static native String getStartPreInfoStr();

    public static native String getSubwayStatus(String str);

    public static native String getSubwayTrace();

    public static native String getTrafficStatus(String str, String str2);

    public static native double[] getVdrNaviRes(long j);

    public static native double[] getVdrPfRes(long j);

    public static native double getVdrSpeed();

    public static native double[] getWalkNaviPdrRes(long j);

    public static int hdYawCallback(String str, int i, int i2) {
        StringBuffer stringBuffer;
        if (sb == null) {
            sb = new StringBuffer();
        }
        if (i == 0) {
            sb = null;
            stringBuffer = new StringBuffer();
            sb = stringBuffer;
        } else {
            stringBuffer = sb;
        }
        stringBuffer.append(str);
        if (i != i2 - 1) {
            return 0;
        }
        sb.toString();
        return 0;
    }

    public static int hdYawReportCallback(String str, int i, int i2) {
        StringBuffer stringBuffer;
        if (sbReport == null) {
            sbReport = new StringBuffer();
        }
        if (i == 0) {
            sbReport = null;
            stringBuffer = new StringBuffer();
            sbReport = stringBuffer;
        } else {
            stringBuffer = sbReport;
        }
        stringBuffer.append(str);
        if (i != i2 - 1) {
            return 0;
        }
        String str2 = "&hd_yaw_report=" + sbReport.toString();
        return 0;
    }

    public static native void init(String str, String str2, String str3);

    public static native void initBle();

    public static native int initGpsChecker(int i, String str, String str2);

    public static native void initHDYaw(int i, int i2);

    public static native void initHeavyVdrPf();

    public static native int initOfflineLoc(int i, String str, String str2);

    public static native void initPaddleSpeedPredict();

    public static native void initPf();

    public static native int initSubwayRecognition(String str, String str2);

    public static native int initTrafficRecognition(String str, String str2);

    public static native void initVdrParkingScenarioDetector(String str);

    public static native void initVdrPf();

    public static native boolean isNearBorderPoint(long j);

    public static boolean isWifiConnected() {
        return f.a().m();
    }

    public static native void loadNav(long j, double d, double d2, double d3);

    public static void locTraffic(String str, long j, long j2, String str2) {
    }

    public static native void newIndoorLocInit(String str);

    public static native void newIndoorLocReset();

    public static int onParkingActionCallback(int i, String str, int i2, int i3) {
        StringBuffer stringBuffer;
        if (sbStartPoint == null) {
            sbStartPoint = new StringBuffer();
        }
        if (i2 == 0) {
            sbStartPoint = null;
            stringBuffer = new StringBuffer();
            sbStartPoint = stringBuffer;
        } else {
            stringBuffer = sbStartPoint;
        }
        stringBuffer.append(str);
        if (i2 != i3 - 1) {
            return 0;
        }
        sbStartPoint.toString();
        return 0;
    }

    public static native void parkManagerInit();

    public static native void parkManagerReset();

    public static native void parkManagerSetParkDataDir(String str);

    public static native float pgo();

    public static native String phs(int i, float f, float f2, float f3, long j);

    public static native int removeRoadnet();

    public static native void reset();

    public static native void resetPf();

    public static native void resetVdrPfIndoor();

    public static native void setAlgoRect(String str);

    public static native int setAndroidRawToObs(int i, boolean z, int i2, long j, long j2, double d, long j3, float f, double d2, double d3, int i3, int i4, double d4);

    public static native void setBarometers(float f, long j);

    public static native void setBasementMode(int i);

    public static native void setBatteryStatus(boolean z);

    public static native void setBleLoc(double d, double d2, long j);

    public static native void setBleLoc4Scenario(double d, double d2, String str, int i, long j, int i2);

    public static native void setBleParams(int i, float f, float f2, float f3, float f4, int i2);

    public static native void setBleReckon(long j);

    public static native void setBleRoadData(String str);

    public static native void setCommonConfig(int i, String str);

    public static native void setEndPoint(float f, float f2);

    public static native void setExtraData(String str, long j, int i);

    public static native void setGameRotation(float f, float f2, float f3, float f4, long j);

    public static native void setGps(double d, double d2, float f, float f2, float f3, double d3, int i, long j);

    public static native void setGpsPark(double d, double d2, float f, float f2, float f3, double d3, int i, long j);

    public static native void setHDYawConf(String str);

    public static native void setHDYawGnss(double d, double d2, double d3, double d4, double d5, double d6, long j, double d7, double d8);

    public static native void setHDYawHDGnss(double d, double d2, double d3, double d4, double d5, double d6, long j, int i);

    public static native void setHDYawMMData(double d, double d2, String str, long j);

    public static native void setHDYawSensor(int i, double d, double d2, double d3, long j);

    public static native void setIsVdrHighWay(int i);

    public static native void setLastHighGpsSpeedTimestamp(long j);

    public static native void setLogFilePath(String str);

    public static native void setNavPath(String str);

    public static native void setNewIndoorLocBleLoc(double d, double d2, double d3, String str, int i, long j);

    public static native void setNewIndoorLocGnssSPP(double d, double d2, double d3, double d4, double d5, long j);

    public static native void setNewIndoorLocGps(double d, double d2, double d3, double d4, double d5, double d6, long j, int i, int i2);

    public static native void setOutsideMotionState(int i);

    public static native void setPaddleModelPath(String str, int i, int i2, int i3, int i4, String str2, int i5);

    public static native void setParklotDataDir(String str);

    public static native void setPdrCoordInfo(double d, double d2, double d3, double d4);

    public static native void setPdrRoadNet(String str);

    public static native void setPdrUsingStatus(int i);

    public static native double[] setPfBle(double d, double d2, double d3, double d4, String str, String str2, long j, int i, String str3);

    public static native void setPfCfgs(float[] fArr);

    public static native double[] setPfDr(double d, double d2, String str, long j);

    public static native void setPfGeoMap(double[][] dArr, String str, int i, int i2);

    public static native void setPfGeoMapAll(String str, double[][] dArr, double d, double d2, int i, int i2, double d3, double d4);

    public static native void setPfGeomag(double d);

    public static native double[] setPfGps(double d, double d2, double d3, double d4, double d5, int i, long j);

    public static native void setPfRdnt(String str, short[][] sArr, double d, double d2, int i, int i2, double d3, double d4, String str2);

    public static native double[] setPfWf(double d, double d2, double d3, long j);

    public static native void setSensorData(float f, float f2, float f3, long j, long j2);

    public static native void setTunnelInfo(float f, float f2, float f3, int i, int i2, float f4, float f5, float f6, float f7, int i3, float f8, float f9, float f10, float f11, float f12, float f13, int i4, float f14, float f15, float f16);

    public static native void setVdrBleLoc(double d, double d2, double d3, double d4, int i, String str, int i2, long j);

    public static native void setVdrCellLoc(double d, double d2, double d3, String str, String str2, long j);

    public static native void setVdrGnssLoc(double d, double d2, double d3, long j);

    public static native void setVdrGnssSPP(double d, double d2, double d3, double d4, double d5, long j);

    public static native void setVdrGps(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, float f, int i, double d9, long j, int i2, int i3, double d10, double d11, int i4, long j2, int i5);

    public static native void setVdrIndoorFloor(String str, long j);

    public static native void setVdrLogState(int i);

    public static native void setVdrNaviCurStartPoint(double d, double d2, double d3, long j);

    public static native void setVdrNaviFinalEndPoint(double d, double d2, long j, String str);

    public static native void setVdrNaviMm(double d, double d2, double d3, String str, long j);

    public static native void setVdrNaviYaw();

    public static native void setVdrOrientation(float f, float f2, long j);

    public static native void setVdrParams(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, int i3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i4, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, int i5, int i6, int i7, float f28, int i8, int i9, int i10, int i11, int i12, float f29, int i13, int i14, int i15, int i16, int i17, int i18, float f30, float[] fArr, int i19, int i20, int i21, int i22, int i23, String str);

    public static native void setVdrRoadData(String str, int i, String str2, long j);

    public static native void setVdrRoadDataBorderPoint(double d, double d2, String str, String str2);

    public static native void setVdrRoadLinkInfo(int i, int i2, String str, long j);

    public static native void setVdrWfFp(String str, long j);

    public static native void setVdrWfLoc(String str, double d, double d2, double d3, double d4, int i, long j);

    public static native void setVdrWfLocWithMm(double d, double d2, double d3, double d4, int i, long j, double d5);

    public static native void setWalkNaviBindingPoint(double d, double d2);

    public static native void setWalkNaviPdrGps(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, long j);

    public static native void setWalkNaviPdrRoadData(String str, long j);

    public static native void startAndStopControl(boolean z);

    public static native void startHDYaw();

    public static native void startPdr();

    public static native void startWalkNaviPdr(int i);

    public static native int stopAndroidRawToObs();

    public static native void stopHDYaw();

    public static native int stopOfflineLoc();

    public static native void stopPdr();

    public static native boolean stopSubwayRecognition();

    public static native boolean stopTrafficRecognition();

    public static native void stopWalkNaviPdr();

    public static native void triggerStepCount(double d, long j);

    public static native void updateHDYawColorData(String str, int i);

    public static native void updateHDYawNaviLink(String str, long j);

    public static native void updateStartControl(String str);

    public static native void updateStartLocationInfo(double d, double d2, double d3, float f, float f2, float f3, int i, int i2, int i3);

    public static native void updateStartSensorInfo(double d, double d2, double d3, int i);

    public static native void updateWalkNaviPdrConfig(double[] dArr);

    public static native void updateWalkNaviPdrSensor(int i, double d, double d2, double d3, long j);

    public static native void updateYaw(int i);

    public static native float[] vdrPgo();

    public static native void vdrPhs(int i, float[] fArr, int i2, long j, long j2);

    public static void z(int i, String str) {
        if (i != 1) {
            b.a(i, str);
            return;
        }
        try {
            String[] split = str.split(",");
            if (split == null || split.length != 4) {
                return;
            }
            locTraffic(split[0], Long.valueOf(split[1]).longValue(), Long.valueOf(split[2]).longValue(), split[3]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
