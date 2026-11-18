package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.1
        @Override // java.util.Comparator
        public int compare(Sample sample, Sample sample2) {
            return sample.index - sample2.index;
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.2
        @Override // java.util.Comparator
        public int compare(Sample sample, Sample sample2) {
            float f = sample.value;
            float f2 = sample2.value;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    private static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    public SlidingPercentile(int r1) {
        this.maxWeight = r1;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public void addSample(int r4, float f) {
        Sample sample;
        ensureSortedByIndex();
        int r0 = this.recycledSampleCount;
        if (r0 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int r1 = r0 - 1;
            this.recycledSampleCount = r1;
            sample = sampleArr[r1];
        } else {
            sample = new Sample();
        }
        int r2 = this.nextSampleIndex;
        this.nextSampleIndex = r2 + 1;
        sample.index = r2;
        sample.weight = r4;
        sample.value = f;
        this.samples.add(sample);
        this.totalWeight += r4;
        while (true) {
            int r5 = this.totalWeight;
            int r6 = this.maxWeight;
            if (r5 <= r6) {
                return;
            }
            int r7 = r5 - r6;
            Sample sample2 = this.samples.get(0);
            int r3 = sample2.weight;
            if (r3 <= r7) {
                this.totalWeight -= r3;
                this.samples.remove(0);
                int r8 = this.recycledSampleCount;
                if (r8 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = r8 + 1;
                    sampleArr2[r8] = sample2;
                }
            } else {
                sample2.weight = r3 - r7;
                this.totalWeight -= r7;
            }
        }
    }

    public float getPercentile(float f) {
        ensureSortedByValue();
        float f2 = f * this.totalWeight;
        int r1 = 0;
        for (int r0 = 0; r0 < this.samples.size(); r0++) {
            Sample sample = this.samples.get(r0);
            r1 += sample.weight;
            if (r1 >= f2) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<Sample> arrayList = this.samples;
        return arrayList.get(arrayList.size() - 1).value;
    }
}
