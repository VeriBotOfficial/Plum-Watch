package com.wakeup.common.network.entity.health;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthUserCalculateDataBean.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\bR\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010j\u001a\u00020\u001bHÆ\u0003J \u0002\u0010k\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020n2\b\u0010o\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010q\u001a\u00020\u0003HÖ\u0001J\t\u0010r\u001a\u00020sHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010!R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010!R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010!R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006t"}, d2 = {"Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;", "Ljava/io/Serializable;", "blutdruckDiastolic", "", "blutdruckSystolic", "blutdruckUnusually", "breatheMax", "breatheMin", "breatheUnusually", "distance", "", "glucoseMax", "glucoseMin", "glucoseUnusually", "heartbeatMax", "heartbeatMin", "heartbeatUnusually", Constants.BundleKey.KCAL, "oxygenMax", "oxygenMin", "oxygenUnusually", "sleepTime", "step", "stressMax", "stressMin", "stressUnusually", "appTime", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;J)V", "getBlutdruckDiastolic", "()Ljava/lang/Integer;", "setBlutdruckDiastolic", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBlutdruckSystolic", "setBlutdruckSystolic", "getBlutdruckUnusually", "setBlutdruckUnusually", "getBreatheMax", "setBreatheMax", "getBreatheMin", "setBreatheMin", "getBreatheUnusually", "setBreatheUnusually", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getGlucoseMax", "setGlucoseMax", "getGlucoseMin", "setGlucoseMin", "getGlucoseUnusually", "setGlucoseUnusually", "getHeartbeatMax", "setHeartbeatMax", "getHeartbeatMin", "setHeartbeatMin", "getHeartbeatUnusually", "setHeartbeatUnusually", "getKcal", "setKcal", "getOxygenMax", "setOxygenMax", "getOxygenMin", "setOxygenMin", "getOxygenUnusually", "setOxygenUnusually", "getSleepTime", "setSleepTime", "getStep", "setStep", "getStressMax", "setStressMax", "getStressMin", "setStressMin", "getStressUnusually", "setStressUnusually", "getAppTime", "()J", "setAppTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;J)Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;", "equals", "", "other", "", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthUserCalculateDataBean implements Serializable {
    private long appTime;
    private Integer blutdruckDiastolic;
    private Integer blutdruckSystolic;
    private Integer blutdruckUnusually;
    private Integer breatheMax;
    private Integer breatheMin;
    private Integer breatheUnusually;
    private Float distance;
    private Float glucoseMax;
    private Float glucoseMin;
    private Integer glucoseUnusually;
    private Integer heartbeatMax;
    private Integer heartbeatMin;
    private Integer heartbeatUnusually;
    private Integer kcal;
    private Integer oxygenMax;
    private Integer oxygenMin;
    private Integer oxygenUnusually;
    private Integer sleepTime;
    private Integer step;
    private Integer stressMax;
    private Integer stressMin;
    private Integer stressUnusually;

    public HealthUserCalculateDataBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 8388607, null);
    }

    public static /* synthetic */ HealthUserCalculateDataBean copy$default(HealthUserCalculateDataBean healthUserCalculateDataBean, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f, Float f2, Float f3, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, long j, int i, Object obj) {
        long j2;
        Integer num20;
        Integer num21;
        Integer num22 = (i & 1) != 0 ? healthUserCalculateDataBean.blutdruckDiastolic : num;
        Integer num23 = (i & 2) != 0 ? healthUserCalculateDataBean.blutdruckSystolic : num2;
        Integer num24 = (i & 4) != 0 ? healthUserCalculateDataBean.blutdruckUnusually : num3;
        Integer num25 = (i & 8) != 0 ? healthUserCalculateDataBean.breatheMax : num4;
        Integer num26 = (i & 16) != 0 ? healthUserCalculateDataBean.breatheMin : num5;
        Integer num27 = (i & 32) != 0 ? healthUserCalculateDataBean.breatheUnusually : num6;
        Float f4 = (i & 64) != 0 ? healthUserCalculateDataBean.distance : f;
        Float f5 = (i & 128) != 0 ? healthUserCalculateDataBean.glucoseMax : f2;
        Float f6 = (i & 256) != 0 ? healthUserCalculateDataBean.glucoseMin : f3;
        Integer num28 = (i & 512) != 0 ? healthUserCalculateDataBean.glucoseUnusually : num7;
        Integer num29 = (i & 1024) != 0 ? healthUserCalculateDataBean.heartbeatMax : num8;
        Integer num30 = (i & 2048) != 0 ? healthUserCalculateDataBean.heartbeatMin : num9;
        Integer num31 = (i & 4096) != 0 ? healthUserCalculateDataBean.heartbeatUnusually : num10;
        Integer num32 = (i & 8192) != 0 ? healthUserCalculateDataBean.kcal : num11;
        Integer num33 = num22;
        Integer num34 = (i & 16384) != 0 ? healthUserCalculateDataBean.oxygenMax : num12;
        Integer num35 = (i & 32768) != 0 ? healthUserCalculateDataBean.oxygenMin : num13;
        Integer num36 = (i & 65536) != 0 ? healthUserCalculateDataBean.oxygenUnusually : num14;
        Integer num37 = (i & 131072) != 0 ? healthUserCalculateDataBean.sleepTime : num15;
        Integer num38 = (i & 262144) != 0 ? healthUserCalculateDataBean.step : num16;
        Integer num39 = (i & 524288) != 0 ? healthUserCalculateDataBean.stressMax : num17;
        Integer num40 = (i & 1048576) != 0 ? healthUserCalculateDataBean.stressMin : num18;
        Integer num41 = (i & 2097152) != 0 ? healthUserCalculateDataBean.stressUnusually : num19;
        if ((i & 4194304) != 0) {
            num21 = num34;
            num20 = num41;
            j2 = healthUserCalculateDataBean.appTime;
        } else {
            j2 = j;
            num20 = num41;
            num21 = num34;
        }
        return healthUserCalculateDataBean.copy(num33, num23, num24, num25, num26, num27, f4, f5, f6, num28, num29, num30, num31, num32, num21, num35, num36, num37, num38, num39, num40, num20, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getBlutdruckDiastolic() {
        return this.blutdruckDiastolic;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getGlucoseUnusually() {
        return this.glucoseUnusually;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getHeartbeatMax() {
        return this.heartbeatMax;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getHeartbeatMin() {
        return this.heartbeatMin;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getHeartbeatUnusually() {
        return this.heartbeatUnusually;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getKcal() {
        return this.kcal;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getOxygenMax() {
        return this.oxygenMax;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getOxygenMin() {
        return this.oxygenMin;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getOxygenUnusually() {
        return this.oxygenUnusually;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getSleepTime() {
        return this.sleepTime;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getStep() {
        return this.step;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getBlutdruckSystolic() {
        return this.blutdruckSystolic;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getStressMax() {
        return this.stressMax;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getStressMin() {
        return this.stressMin;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getStressUnusually() {
        return this.stressUnusually;
    }

    /* renamed from: component23, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getBlutdruckUnusually() {
        return this.blutdruckUnusually;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBreatheMax() {
        return this.breatheMax;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBreatheMin() {
        return this.breatheMin;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getBreatheUnusually() {
        return this.breatheUnusually;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getGlucoseMax() {
        return this.glucoseMax;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getGlucoseMin() {
        return this.glucoseMin;
    }

    public final HealthUserCalculateDataBean copy(Integer blutdruckDiastolic, Integer blutdruckSystolic, Integer blutdruckUnusually, Integer breatheMax, Integer breatheMin, Integer breatheUnusually, Float distance, Float glucoseMax, Float glucoseMin, Integer glucoseUnusually, Integer heartbeatMax, Integer heartbeatMin, Integer heartbeatUnusually, Integer kcal, Integer oxygenMax, Integer oxygenMin, Integer oxygenUnusually, Integer sleepTime, Integer step, Integer stressMax, Integer stressMin, Integer stressUnusually, long appTime) {
        return new HealthUserCalculateDataBean(blutdruckDiastolic, blutdruckSystolic, blutdruckUnusually, breatheMax, breatheMin, breatheUnusually, distance, glucoseMax, glucoseMin, glucoseUnusually, heartbeatMax, heartbeatMin, heartbeatUnusually, kcal, oxygenMax, oxygenMin, oxygenUnusually, sleepTime, step, stressMax, stressMin, stressUnusually, appTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthUserCalculateDataBean)) {
            return false;
        }
        HealthUserCalculateDataBean healthUserCalculateDataBean = (HealthUserCalculateDataBean) other;
        return Intrinsics.areEqual(this.blutdruckDiastolic, healthUserCalculateDataBean.blutdruckDiastolic) && Intrinsics.areEqual(this.blutdruckSystolic, healthUserCalculateDataBean.blutdruckSystolic) && Intrinsics.areEqual(this.blutdruckUnusually, healthUserCalculateDataBean.blutdruckUnusually) && Intrinsics.areEqual(this.breatheMax, healthUserCalculateDataBean.breatheMax) && Intrinsics.areEqual(this.breatheMin, healthUserCalculateDataBean.breatheMin) && Intrinsics.areEqual(this.breatheUnusually, healthUserCalculateDataBean.breatheUnusually) && Intrinsics.areEqual((Object) this.distance, (Object) healthUserCalculateDataBean.distance) && Intrinsics.areEqual((Object) this.glucoseMax, (Object) healthUserCalculateDataBean.glucoseMax) && Intrinsics.areEqual((Object) this.glucoseMin, (Object) healthUserCalculateDataBean.glucoseMin) && Intrinsics.areEqual(this.glucoseUnusually, healthUserCalculateDataBean.glucoseUnusually) && Intrinsics.areEqual(this.heartbeatMax, healthUserCalculateDataBean.heartbeatMax) && Intrinsics.areEqual(this.heartbeatMin, healthUserCalculateDataBean.heartbeatMin) && Intrinsics.areEqual(this.heartbeatUnusually, healthUserCalculateDataBean.heartbeatUnusually) && Intrinsics.areEqual(this.kcal, healthUserCalculateDataBean.kcal) && Intrinsics.areEqual(this.oxygenMax, healthUserCalculateDataBean.oxygenMax) && Intrinsics.areEqual(this.oxygenMin, healthUserCalculateDataBean.oxygenMin) && Intrinsics.areEqual(this.oxygenUnusually, healthUserCalculateDataBean.oxygenUnusually) && Intrinsics.areEqual(this.sleepTime, healthUserCalculateDataBean.sleepTime) && Intrinsics.areEqual(this.step, healthUserCalculateDataBean.step) && Intrinsics.areEqual(this.stressMax, healthUserCalculateDataBean.stressMax) && Intrinsics.areEqual(this.stressMin, healthUserCalculateDataBean.stressMin) && Intrinsics.areEqual(this.stressUnusually, healthUserCalculateDataBean.stressUnusually) && this.appTime == healthUserCalculateDataBean.appTime;
    }

    public int hashCode() {
        Integer num = this.blutdruckDiastolic;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.blutdruckSystolic;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.blutdruckUnusually;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.breatheMax;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.breatheMin;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.breatheUnusually;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Float f = this.distance;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.glucoseMax;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.glucoseMin;
        int hashCode9 = (hashCode8 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num7 = this.glucoseUnusually;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.heartbeatMax;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.heartbeatMin;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.heartbeatUnusually;
        int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.kcal;
        int hashCode14 = (hashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.oxygenMax;
        int hashCode15 = (hashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.oxygenMin;
        int hashCode16 = (hashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.oxygenUnusually;
        int hashCode17 = (hashCode16 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.sleepTime;
        int hashCode18 = (hashCode17 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.step;
        int hashCode19 = (hashCode18 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.stressMax;
        int hashCode20 = (hashCode19 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.stressMin;
        int hashCode21 = (hashCode20 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.stressUnusually;
        return ((hashCode21 + (num19 != null ? num19.hashCode() : 0)) * 31) + Long.hashCode(this.appTime);
    }

    public String toString() {
        return "HealthUserCalculateDataBean(blutdruckDiastolic=" + this.blutdruckDiastolic + ", blutdruckSystolic=" + this.blutdruckSystolic + ", blutdruckUnusually=" + this.blutdruckUnusually + ", breatheMax=" + this.breatheMax + ", breatheMin=" + this.breatheMin + ", breatheUnusually=" + this.breatheUnusually + ", distance=" + this.distance + ", glucoseMax=" + this.glucoseMax + ", glucoseMin=" + this.glucoseMin + ", glucoseUnusually=" + this.glucoseUnusually + ", heartbeatMax=" + this.heartbeatMax + ", heartbeatMin=" + this.heartbeatMin + ", heartbeatUnusually=" + this.heartbeatUnusually + ", kcal=" + this.kcal + ", oxygenMax=" + this.oxygenMax + ", oxygenMin=" + this.oxygenMin + ", oxygenUnusually=" + this.oxygenUnusually + ", sleepTime=" + this.sleepTime + ", step=" + this.step + ", stressMax=" + this.stressMax + ", stressMin=" + this.stressMin + ", stressUnusually=" + this.stressUnusually + ", appTime=" + this.appTime + Separators.RPAREN;
    }

    public HealthUserCalculateDataBean(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f, Float f2, Float f3, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, long j) {
        this.blutdruckDiastolic = num;
        this.blutdruckSystolic = num2;
        this.blutdruckUnusually = num3;
        this.breatheMax = num4;
        this.breatheMin = num5;
        this.breatheUnusually = num6;
        this.distance = f;
        this.glucoseMax = f2;
        this.glucoseMin = f3;
        this.glucoseUnusually = num7;
        this.heartbeatMax = num8;
        this.heartbeatMin = num9;
        this.heartbeatUnusually = num10;
        this.kcal = num11;
        this.oxygenMax = num12;
        this.oxygenMin = num13;
        this.oxygenUnusually = num14;
        this.sleepTime = num15;
        this.step = num16;
        this.stressMax = num17;
        this.stressMin = num18;
        this.stressUnusually = num19;
        this.appTime = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HealthUserCalculateDataBean(java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Float r31, java.lang.Float r32, java.lang.Float r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Integer r38, java.lang.Integer r39, java.lang.Integer r40, java.lang.Integer r41, java.lang.Integer r42, java.lang.Integer r43, java.lang.Integer r44, java.lang.Integer r45, java.lang.Integer r46, long r47, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.health.HealthUserCalculateDataBean.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getBlutdruckDiastolic() {
        return this.blutdruckDiastolic;
    }

    public final void setBlutdruckDiastolic(Integer num) {
        this.blutdruckDiastolic = num;
    }

    public final Integer getBlutdruckSystolic() {
        return this.blutdruckSystolic;
    }

    public final void setBlutdruckSystolic(Integer num) {
        this.blutdruckSystolic = num;
    }

    public final Integer getBlutdruckUnusually() {
        return this.blutdruckUnusually;
    }

    public final void setBlutdruckUnusually(Integer num) {
        this.blutdruckUnusually = num;
    }

    public final Integer getBreatheMax() {
        return this.breatheMax;
    }

    public final void setBreatheMax(Integer num) {
        this.breatheMax = num;
    }

    public final Integer getBreatheMin() {
        return this.breatheMin;
    }

    public final void setBreatheMin(Integer num) {
        this.breatheMin = num;
    }

    public final Integer getBreatheUnusually() {
        return this.breatheUnusually;
    }

    public final void setBreatheUnusually(Integer num) {
        this.breatheUnusually = num;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final void setDistance(Float f) {
        this.distance = f;
    }

    public final Float getGlucoseMax() {
        return this.glucoseMax;
    }

    public final void setGlucoseMax(Float f) {
        this.glucoseMax = f;
    }

    public final Float getGlucoseMin() {
        return this.glucoseMin;
    }

    public final void setGlucoseMin(Float f) {
        this.glucoseMin = f;
    }

    public final Integer getGlucoseUnusually() {
        return this.glucoseUnusually;
    }

    public final void setGlucoseUnusually(Integer num) {
        this.glucoseUnusually = num;
    }

    public final Integer getHeartbeatMax() {
        return this.heartbeatMax;
    }

    public final void setHeartbeatMax(Integer num) {
        this.heartbeatMax = num;
    }

    public final Integer getHeartbeatMin() {
        return this.heartbeatMin;
    }

    public final void setHeartbeatMin(Integer num) {
        this.heartbeatMin = num;
    }

    public final Integer getHeartbeatUnusually() {
        return this.heartbeatUnusually;
    }

    public final void setHeartbeatUnusually(Integer num) {
        this.heartbeatUnusually = num;
    }

    public final Integer getKcal() {
        return this.kcal;
    }

    public final void setKcal(Integer num) {
        this.kcal = num;
    }

    public final Integer getOxygenMax() {
        return this.oxygenMax;
    }

    public final void setOxygenMax(Integer num) {
        this.oxygenMax = num;
    }

    public final Integer getOxygenMin() {
        return this.oxygenMin;
    }

    public final void setOxygenMin(Integer num) {
        this.oxygenMin = num;
    }

    public final Integer getOxygenUnusually() {
        return this.oxygenUnusually;
    }

    public final void setOxygenUnusually(Integer num) {
        this.oxygenUnusually = num;
    }

    public final Integer getSleepTime() {
        return this.sleepTime;
    }

    public final void setSleepTime(Integer num) {
        this.sleepTime = num;
    }

    public final Integer getStep() {
        return this.step;
    }

    public final void setStep(Integer num) {
        this.step = num;
    }

    public final Integer getStressMax() {
        return this.stressMax;
    }

    public final void setStressMax(Integer num) {
        this.stressMax = num;
    }

    public final Integer getStressMin() {
        return this.stressMin;
    }

    public final void setStressMin(Integer num) {
        this.stressMin = num;
    }

    public final Integer getStressUnusually() {
        return this.stressUnusually;
    }

    public final void setStressUnusually(Integer num) {
        this.stressUnusually = num;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final void setAppTime(long j) {
        this.appTime = j;
    }
}
