package androidx.media3.exoplayer.upstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    public SlidingPercentile(int r1) {
        this.maxWeight = r1;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
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
            if (sample2.weight <= r7) {
                this.totalWeight -= sample2.weight;
                this.samples.remove(0);
                int r8 = this.recycledSampleCount;
                if (r8 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = r8 + 1;
                    sampleArr2[r8] = sample2;
                }
            } else {
                sample2.weight -= r7;
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

    /* JADX INFO: Access modifiers changed from: private */
    static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }
}
