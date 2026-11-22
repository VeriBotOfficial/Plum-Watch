package com.sifli.siflicore.util;

import com.sifli.siflicore.log.SFLog;
import java.util.LinkedList;

/* loaded from: classes14.dex */
public class FpsCounter {
    private static final long STATISTICS_WINDOW = 10000;
    private static final String TAG = "FpsCounter";
    private float fps;
    private final LinkedList<Long> frameTimestamps = new LinkedList<>();

    public void recordFrame() {
        long currentTimeMillis = System.currentTimeMillis();
        this.frameTimestamps.add(Long.valueOf(currentTimeMillis));
        while (!this.frameTimestamps.isEmpty() && currentTimeMillis - this.frameTimestamps.getFirst().longValue() > 10000) {
            this.frameTimestamps.removeFirst();
        }
        if (this.frameTimestamps.isEmpty()) {
            return;
        }
        long longValue = currentTimeMillis - this.frameTimestamps.getFirst().longValue();
        if (longValue > 0) {
            float size = this.frameTimestamps.size() / (longValue / 1000.0f);
            this.fps = size;
            SFLog.d(TAG, "Current FPS: %.1f (based on %d frames in %d ms)", Float.valueOf(size), Integer.valueOf(this.frameTimestamps.size()), Long.valueOf(longValue));
        }
    }

    public float getFps() {
        return this.fps;
    }

    public int getFrameCount() {
        return this.frameTimestamps.size();
    }
}
