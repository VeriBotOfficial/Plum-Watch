package com.baidu.ar.mdl;

import android.content.res.AssetManager;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class ARMdlInterfaceJNI {
    public static native int getVersion();

    public static native int initBodyKeyPoint(String str, String str2);

    public static native int initBodyKeyPointFromAssetDir(String str, String str2);

    public static native int initGesture(String str, String str2, String str3, int r3, int r4, float f, float f2, float f3, int r8);

    public static native int initGestureFromAsset(String str, String str2, String str3, int r3, int r4, float f, float f2, float f3, int r8);

    public static native int initHairSeg(String str);

    public static native int initHairSegFromAssetDir(String str);

    public static native int initHandSkeleton(String str, String str2);

    public static native int initHandSkeletonFromAsset(String str, String str2);

    public static native int initHeadSeg(String str);

    public static native int initHeadSegFromAsset(String str);

    public static native int initHumanSeg(String str, int r1, int[] r2, boolean z);

    public static native int initHumanSegFromAssetDir(String str, int r1, int[] r2, boolean z);

    public static native int initObjDetect(String str, String str2);

    public static native int initObjDetectFromAsset(String str, String str2);

    public static native int initPose(String str, String str2, String str3, int r3, float f, float[] fArr, float[] fArr2);

    public static native int initPoseFromAsset(String str, String str2, String str3, int r3, float f, float[] fArr, float[] fArr2);

    public static native int initSkySeg(String str);

    public static native int initSkySegFromAssetDir(String str);

    public static native int predictBodyKeyPoint(ByteBuffer byteBuffer, int r1, int r2, int r3, float[] fArr);

    public static native int predictGesture(ByteBuffer byteBuffer, int r1, int r2, int r3, boolean z, float[] fArr);

    public static native int predictHairSeg(ByteBuffer byteBuffer, int r1, int r2, int r3, int r4, int r5, int r6, boolean z, byte[] bArr, long j);

    public static native float[] predictHandSkeleton(ByteBuffer byteBuffer, int r1, int r2, int r3, boolean z);

    public static native int predictHandSkeletonByHandle(long j, int r2);

    public static native int predictHeadSeg(long j, boolean z);

    public static native int predictHumanSeg(ByteBuffer byteBuffer, int r1, int r2, int r3, boolean z, byte[] bArr, int[] r6, long j);

    public static native int predictObjDetect(ByteBuffer byteBuffer, int r1, int r2, int r3, boolean z, float[] fArr);

    public static native int predictPose(ByteBuffer byteBuffer, int r1, int r2, int r3, boolean z, float[] fArr);

    public static native int predictSkySeg(ByteBuffer byteBuffer, int r1, int r2, int r3, int r4, int r5, int r6, boolean z, byte[] bArr, long j);

    public static native int releaseBodyKeyPoint();

    public static native int releaseGesture();

    public static native int releaseHairSeg();

    public static native int releaseHandSkeleton();

    public static native int releaseHeadSeg();

    public static native int releaseHumanSeg();

    public static native int releaseObjDetect();

    public static native int releasePose();

    public static native int releaseSkySeg();

    public static native int setAssetManager(AssetManager assetManager);

    public static native int setCacheDir(String str);

    public static native int updateLastFaceInfo(long j);
}
