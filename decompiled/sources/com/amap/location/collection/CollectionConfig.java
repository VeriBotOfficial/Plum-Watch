package com.amap.location.collection;

import com.amap.location.support.log.ALLog;
import com.baidu.platform.comapi.bmsdk.BmLocated;

/* loaded from: classes11.dex */
public class CollectionConfig {
    public static boolean sUseHttps = true;
    public static boolean sUseTestNet = false;
    private boolean mStopCollectionWhenScreenOff = false;
    private final FpsCollectorConfig mFpsCollectorConfig = new FpsCollectorConfig();
    private final TrackCollectorConfig mTrackCollectorConfig = new TrackCollectorConfig();
    private final UploadConfig mUploadConfig = new UploadConfig();

    public static class FpsCollectorConfig {
        private boolean mIsEnabled = true;
        private boolean mIsScanWifiAllowed = true;
        private boolean mIsScanActiveAllowed = true;
        private boolean mIsFilterByUpdated = true;
        private int mScanWifiInterval = 20000;

        public int getScanWifiInterval() {
            return this.mScanWifiInterval;
        }

        public boolean isEnabled() {
            return this.mIsEnabled;
        }

        public boolean isScanActiveAllowed() {
            return this.mIsScanActiveAllowed;
        }

        public boolean isScanWifiAllowed() {
            return this.mIsScanWifiAllowed;
        }

        public boolean isWifiFilterByUpdated() {
            return this.mIsFilterByUpdated;
        }

        public void setEnabled(boolean z) {
            this.mIsEnabled = z;
        }

        public void setScanActiveAllowed(boolean z) {
            this.mIsScanActiveAllowed = z;
        }

        public void setScanWifiAllowed(boolean z) {
            this.mIsScanWifiAllowed = z;
        }

        public void setScanWifiInterval(int i) {
            if (i < 3000) {
                i = 3000;
            }
            this.mScanWifiInterval = i;
        }

        public void setWifiFilterByUpdated(boolean z) {
            this.mIsFilterByUpdated = z;
        }
    }

    public static class TrackCollectorConfig {
        private boolean mIsEnabled = true;
        public volatile byte mLocScene = -1;
        private boolean mIsCollectSatellites = false;

        public byte getLocScene() {
            return this.mLocScene;
        }

        public boolean isCollectSatellites() {
            return this.mIsCollectSatellites;
        }

        public boolean isEnabled() {
            return this.mIsEnabled;
        }

        public void setCollectSatellites(boolean z) {
            this.mIsCollectSatellites = z;
        }

        public void setEnabled(boolean z) {
            this.mIsEnabled = z;
        }

        public void setLocScene(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            try {
                this.mLocScene = Byte.parseByte(str);
            } catch (Exception e) {
                ALLog.d(e);
            }
        }
    }

    public static class UploadConfig {
        private boolean mIsUploadWithLocatorEnabled = true;
        private boolean mIsNonWifiUploadEnabled = false;
        private int mMaxWifiUploadSizePerDay = BmLocated.ALIGN_RIGHT_BOTTOM;
        private int mMaxMobileUploadSizePerDay = 307200;
        private int mMaxUploadFailCount = 5;

        public int getMaxMobileUploadSizePerDay() {
            return this.mMaxMobileUploadSizePerDay;
        }

        public int getMaxUploadFailCount() {
            return this.mMaxUploadFailCount;
        }

        public int getMaxWifiUploadSizePerDay() {
            return this.mMaxWifiUploadSizePerDay;
        }

        public boolean isNonWifiUploadEnabled() {
            return this.mIsNonWifiUploadEnabled;
        }

        public boolean isUploadWithLocatorEnabled() {
            return this.mIsUploadWithLocatorEnabled;
        }

        public void setMaxMobileUploadSizePerDay(int i) {
            if (i > 614400) {
                i = 614400;
            }
            this.mMaxMobileUploadSizePerDay = i;
        }

        public void setMaxUploadFailCount(int i) {
            if (i > 5) {
                i = 5;
            } else if (i < 0) {
                i = 0;
            }
            this.mMaxUploadFailCount = i;
        }

        public void setMaxWifiUploadSizePerDay(int i) {
            if (i > 20971520) {
                i = 20971520;
            }
            this.mMaxWifiUploadSizePerDay = i;
        }

        public void setNonWifiUploadEnabled(boolean z) {
            this.mIsNonWifiUploadEnabled = z;
        }

        public void setUploadWithLocatorEnabled(boolean z) {
            this.mIsUploadWithLocatorEnabled = z;
        }
    }

    public FpsCollectorConfig getFpsCollectorConfig() {
        return this.mFpsCollectorConfig;
    }

    public TrackCollectorConfig getTrackCollectorConfig() {
        return this.mTrackCollectorConfig;
    }

    public UploadConfig getUploadConfig() {
        return this.mUploadConfig;
    }

    public boolean isStopCollectionWhenScreenOff() {
        return this.mStopCollectionWhenScreenOff;
    }

    public void setStopCollectionWhenScreenOff(boolean z) {
        this.mStopCollectionWhenScreenOff = z;
    }
}
