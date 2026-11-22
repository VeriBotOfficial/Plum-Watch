package com.efs.sdk.memleaksdk.monitor;

import android.os.Build;
import com.efs.sdk.memleaksdk.monitor.shark.ai;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.w;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* loaded from: classes14.dex */
public class UMonitorConfigJava {
    private int analysisMaxTimesPerVersion;
    private int analysisPeriodPerVersion;
    private boolean debugMode;
    private float deviceMemoryThreshold;
    private boolean enableHprofDumpAnalysis;
    private int fdThreshold;
    private int forceDumpJavaHeapDeltaThreshold;
    private float forceDumpJavaHeapMaxThreshold;
    private float heapThreshold;
    private long loopInterval;
    private int maxOverThresholdCount;
    private UMonitorReporter reporter;
    private int threadThreshold;

    public int getAnalysisMaxTimesPerVersion() {
        return this.analysisMaxTimesPerVersion;
    }

    public int getAnalysisPeriodPerVersion() {
        return this.analysisPeriodPerVersion;
    }

    public float getHeapThreshold() {
        return this.heapThreshold;
    }

    public int getFdThreshold() {
        return this.fdThreshold;
    }

    public int getThreadThreshold() {
        return this.threadThreshold;
    }

    public float getDeviceMemoryThreshold() {
        return this.deviceMemoryThreshold;
    }

    public int getMaxOverThresholdCount() {
        return this.maxOverThresholdCount;
    }

    public float getForceDumpJavaHeapMaxThreshold() {
        return this.forceDumpJavaHeapMaxThreshold;
    }

    public int getForceDumpJavaHeapDeltaThreshold() {
        return this.forceDumpJavaHeapDeltaThreshold;
    }

    public long getLoopInterval() {
        return this.loopInterval;
    }

    public boolean getEnableHprofDumpAnalysis() {
        return this.enableHprofDumpAnalysis;
    }

    public UMonitorReporter getReporter() {
        return this.reporter;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    private UMonitorConfigJava() {
    }

    public static class Builder {
        private UMonitorReporter reporter;
        private int analysisMaxTimesPerVersion = 5;
        private int analysisPeriodPerVersion = 1296000000;
        private int maxOverThresholdCount = 3;
        private Float heapThreshold = null;
        private int fdThreshold = 1000;
        private Integer threadThreshold = null;
        private float deviceMemoryThreshold = 0.05f;
        private float forceDumpJavaHeapMaxThreshold = 0.9f;
        private int forceDumpJavaHeapDeltaThreshold = 358400;
        private long loopInterval = 15000;
        private boolean enableHprofDumpAnalysis = true;
        private boolean debugMode = true;

        public Builder setDebugMode(boolean z) {
            this.debugMode = z;
            return this;
        }

        public Builder setAnalysisMaxTimesPerVersion(int i) {
            this.analysisMaxTimesPerVersion = i;
            return this;
        }

        public Builder setAnalysisPeriodPerVersion(int i) {
            this.analysisPeriodPerVersion = i;
            return this;
        }

        public Builder setHeapThreshold(float f) {
            this.heapThreshold = Float.valueOf(f);
            return this;
        }

        public Builder setFdThreshold(int i) {
            this.fdThreshold = i;
            return this;
        }

        public Builder setThreadThreshold(int i) {
            this.threadThreshold = Integer.valueOf(i);
            return this;
        }

        public Builder setMaxOverThresholdCount(int i) {
            this.maxOverThresholdCount = i;
            return this;
        }

        public Builder setLoopInterval(long j) {
            this.loopInterval = j;
            return this;
        }

        public Builder setEnableHprofDumpAnalysis(boolean z) {
            this.enableHprofDumpAnalysis = z;
            return this;
        }

        public Builder setDeviceMemoryThreshold(float f) {
            this.deviceMemoryThreshold = f;
            return this;
        }

        public Builder setForceDumpJavaHeapDeltaThreshold(int i) {
            this.forceDumpJavaHeapDeltaThreshold = i;
            return this;
        }

        public Builder setForceDumpJavaHeapMaxThreshold(float f) {
            this.forceDumpJavaHeapMaxThreshold = f;
            return this;
        }

        public Builder setReporter(UMonitorReporter uMonitorReporter) {
            this.reporter = uMonitorReporter;
            return this;
        }

        public UMonitorConfigJava build() {
            if (this.heapThreshold == null) {
                float b = ai.f9681a.b(Runtime.getRuntime().maxMemory());
                if (b >= 502.0f) {
                    this.heapThreshold = Float.valueOf(0.8f);
                } else if (b >= 246.0f) {
                    this.heapThreshold = Float.valueOf(0.85f);
                } else {
                    this.heapThreshold = Float.valueOf(0.9f);
                }
            }
            if (this.threadThreshold == null) {
                String upperCase = Build.MANUFACTURER.toUpperCase(Locale.US);
                if (("HUAWEI".equals(upperCase) || w.b.equals(upperCase)) && Build.VERSION.SDK_INT <= 26) {
                    this.threadThreshold = 450;
                } else {
                    this.threadThreshold = Integer.valueOf(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }
            UMonitorConfigJava uMonitorConfigJava = new UMonitorConfigJava();
            uMonitorConfigJava.analysisMaxTimesPerVersion = this.analysisMaxTimesPerVersion;
            uMonitorConfigJava.analysisPeriodPerVersion = this.analysisPeriodPerVersion;
            uMonitorConfigJava.heapThreshold = this.heapThreshold.floatValue();
            uMonitorConfigJava.fdThreshold = this.fdThreshold;
            uMonitorConfigJava.threadThreshold = this.threadThreshold.intValue();
            uMonitorConfigJava.deviceMemoryThreshold = this.deviceMemoryThreshold;
            uMonitorConfigJava.maxOverThresholdCount = this.maxOverThresholdCount;
            uMonitorConfigJava.forceDumpJavaHeapMaxThreshold = this.forceDumpJavaHeapMaxThreshold;
            uMonitorConfigJava.forceDumpJavaHeapDeltaThreshold = this.forceDumpJavaHeapDeltaThreshold;
            uMonitorConfigJava.loopInterval = this.loopInterval;
            uMonitorConfigJava.enableHprofDumpAnalysis = this.enableHprofDumpAnalysis;
            uMonitorConfigJava.reporter = this.reporter;
            uMonitorConfigJava.debugMode = this.debugMode;
            return uMonitorConfigJava;
        }
    }
}
