package com.baidu.platform.comjni.bikenavi;

import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class JNIGuidanceControl {
    public native byte[] GetProtobufResult(long j, int r3);

    public native int SearchRoutePlan(long j, String str);

    public native int calcRoute(long j, int r3, int r4, int r5, int r6, byte[] bArr, int r8, String str);

    public native int calcRouteForRouteBook(long j, int r3, int r4, byte[] bArr);

    public native boolean cancelCalcRoute(long j);

    public native boolean changePDRStrategyConfig(long j, Bundle bundle);

    public native void changeWalkDirectionStrategyConfig(long j, Bundle bundle);

    public native boolean checkPointNearbyRoute(long j, double d, double d2, int r7);

    public native void clearMapRender(long j);

    public native void enterFreeStatus(long j);

    public native void exchangeKeyForCarNavi(long j, String str, String str2);

    public native boolean getAllNaviNodes(long j, Bundle bundle);

    public native boolean getCarPoint(long j, int[] r3, int[] r4);

    public native boolean getCarPointMC(long j, int[] r3, int[] r4);

    public native void getConnectedPois(long j, Bundle bundle);

    public native float getCurCorrectDirection(long j);

    public native byte[] getCurPanoImage(long j);

    public native boolean getCurPanoramaRoute(long j, int r3, int r4, int r5, int r6, Bundle bundle);

    public native boolean getCurViaPoiPanoImage(long j, Bundle bundle);

    public native void getFacePoiInfo(long j, Bundle bundle);

    public native boolean getFirstParagraph(long j, Bundle bundle);

    public native boolean getGPSMatchResult(long j, Bundle bundle);

    public native boolean getGuideParagraph(long j, int r3, int r4, Bundle bundle);

    public native void getIndoorAllPoi(long j, Bundle bundle);

    public native void getLastLocationRouteInfo(long j, Bundle bundle);

    public native boolean getLeftNaviRouteBound(long j, Bundle bundle);

    public native Bundle[] getLightInfos(long j);

    public native boolean getMapGraphItems(long j, Bundle bundle);

    public native void getMatchRouteInfo(long j, Bundle bundle);

    public native int getNavId(long j);

    public native boolean getNaviRouteBoundWithNoMargin(long j, Bundle bundle);

    public native boolean getNormalWalkSignDes(long j, Bundle bundle, Bundle bundle2);

    public native boolean getPDRUsingStatusInTurningCorner(long j);

    public native boolean getParagraphBound(long j, int r3, Bundle bundle);

    public native void getPois(long j, Bundle bundle);

    public native int getRealTimeInfo(long j, Bundle bundle);

    public native byte[] getRouteDataBuffer(long j);

    public native boolean getRouteIDInfo(long j, Bundle bundle);

    public native boolean getRouteInfoItemPano(long j, int r3, Bundle bundle);

    public native boolean getRouteResult(long j, int r3, Bundle bundle);

    public native Bundle[] getRouteSegments(long j);

    public native boolean getSimpleMapInfo(long j, Bundle bundle);

    public native boolean getTrafficFacilities(long j, Bundle bundle);

    public native boolean getTravelData(long j, Bundle bundle);

    public native String getUploadParamBundle(long j);

    public native boolean getViaNaviNodes(long j, Bundle bundle);

    public native String getWalkCountData(long j);

    public native void handleSingleTap(long j, double d, double d2, int r7);

    public native boolean isBrowseStatus(long j);

    public native boolean isEngineIndoorNaviDefine(long j);

    public native void leaveFreeStatus(long j);

    public native void needShowPoiPanoImage(long j, boolean z);

    public native void pauseReRouteCalcRoute(long j);

    public native boolean pauseRouteGuide(long j);

    public native boolean playSound(long j, String str);

    public native boolean prepareRouteGuide(long j);

    public native void registerGetLaunchSystemTime(long j);

    public native boolean removeRoute(long j);

    public native void resumeReRouteCalcRoute(long j);

    public native boolean resumeRouteGuide(long j);

    public native boolean setARRouteResID(long j, int r3, int r4);

    public native void setAvageSpeed(long j, float f);

    public native boolean setBrowseStatus(long j, boolean z);

    public native void setGPSDriftModeStatus(long j, boolean z);

    public native boolean setGpsTrackFile(long j, String str);

    public native boolean setGuidanceSpeed(long j, int r3);

    public native void setGuideTextMaxWordCnt(long j, int r3);

    public native void setInitalGPS(long j, double[] dArr, double[] dArr2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, String[] strArr, String[] strArr2, int[] r11, int[] r12);

    public native boolean setLocateMode(long j, int r3);

    public native void setMaterialConfigJson(long j, String str);

    public native boolean setNaviMode(long j, int r3);

    public native boolean setNaviNodes(long j, int[] r3, int[] r4, int[] r5, int[] r6, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);

    public native boolean setNaviScene(long j, int r3);

    public native void setNaviSettings(long j, Bundle bundle);

    public native boolean setNaviType(long j, int r3);

    public native boolean setNetStatistics(long j, String str);

    public native boolean setOperateStatus(long j, int r3);

    public native boolean setOriNaviOverlooking(long j, int r3);

    public native void setPDRModeStatus(long j, boolean z);

    public native void setPDRTurningCornerModeStatus(long j, boolean z);

    public native void setParagraphFocus(long j, int r3);

    public native void setPhoneConfig(long j, Bundle bundle);

    public native boolean setRotateMode(long j, int r3);

    public native boolean setShowLight(long j, boolean z);

    public native void setTrackRecordValid(long j, boolean z);

    public native boolean setUserMapScale(long j, int r3);

    public native void setVdJsonString(long j, String str);

    public native boolean setVehiclePos(long j, int r3, int r4, int r5, String str, String str2);

    public native boolean setViewAllStatus(long j, boolean z);

    public native void setYawByHMMStatus(long j, boolean z);

    public native void setYawConfigJson(long j, String str);

    public native void showArLayerInVPS(long j, boolean z);

    public native void showFloor(long j, String str, String str2);

    public native void showNPCModel(long j, boolean z);

    public native boolean startRouteGuide(long j);

    public native boolean startWalkRecord(long j, String str);

    public native boolean stopRouteGuide(long j);

    public native boolean stopWalkRecord(long j);

    public native void supportIndoorNavi(long j, boolean z);

    public native boolean triggerGPSDataChange(long j, double d, double d2, float f, float f2, float f3, float f4, String str, String str2, int r13, int r14, int r15, int r16, int r17, float f5);

    public native boolean triggerNetStatusChange(long j, int r3);

    public native boolean triggerPDRDataChange(long j, double d, double d2, float f, float f2, float f3, float f4, String str, String str2, int r13, int r14, int r15, int r16, int r17, float f5);

    public native void triggerSensorVerification(long j, boolean z);

    public native void updateConfig(long j, boolean z);

    public native void updateSensor(long j, double d, double d2, double d3, double d4, double d5, double d6);

    public native int uploadOperationIntegral(long j, long j2, int r5, String str, Bundle bundle);
}
