package com.mbridge.msdk.playercommon.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int r2) {
            this(r2, new Random());
        }

        private static int[] createShuffledList(int r5, Random random) {
            int[] r0 = new int[r5];
            int r1 = 0;
            while (r1 < r5) {
                int r2 = r1 + 1;
                int r3 = random.nextInt(r2);
                r0[r1] = r0[r3];
                r0[r3] = r1;
                r1 = r2;
            }
            return r0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int r9, int r10) {
            int[] r0 = new int[r10];
            int[] r1 = new int[r10];
            int r2 = 0;
            int r3 = 0;
            while (r3 < r10) {
                r0[r3] = this.random.nextInt(this.shuffled.length + 1);
                int r5 = r3 + 1;
                int r4 = this.random.nextInt(r5);
                r1[r3] = r1[r4];
                r1[r4] = r3 + r9;
                r3 = r5;
            }
            Arrays.sort(r0);
            int[] r6 = new int[this.shuffled.length + r10];
            int r7 = 0;
            int r8 = 0;
            while (true) {
                int[] r11 = this.shuffled;
                if (r2 >= r11.length + r10) {
                    return new DefaultShuffleOrder(r6, new Random(this.random.nextLong()));
                }
                if (r7 >= r10 || r8 != r0[r7]) {
                    int r12 = r8 + 1;
                    int r13 = r11[r8];
                    r6[r2] = r13;
                    if (r13 >= r9) {
                        r6[r2] = r13 + r10;
                    }
                    r8 = r12;
                } else {
                    r6[r2] = r1[r7];
                    r7++;
                }
                r2++;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int r7) {
            int[] r0 = new int[this.shuffled.length - 1];
            int r2 = 0;
            boolean z = false;
            while (true) {
                int[] r4 = this.shuffled;
                if (r2 >= r4.length) {
                    return new DefaultShuffleOrder(r0, new Random(this.random.nextLong()));
                }
                int r5 = r4[r2];
                if (r5 == r7) {
                    z = true;
                } else {
                    int r6 = z ? r2 - 1 : r2;
                    if (r5 > r7) {
                        r5--;
                    }
                    r0[r6] = r5;
                }
                r2++;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] r0 = this.shuffled;
            if (r0.length > 0) {
                return r0[0];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] r0 = this.shuffled;
            if (r0.length > 0) {
                return r0[r0.length - 1];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int r3) {
            int r4 = this.indexInShuffled[r3] + 1;
            int[] r0 = this.shuffled;
            if (r4 < r0.length) {
                return r0[r4];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int r2) {
            int r3 = this.indexInShuffled[r2] - 1;
            if (r3 >= 0) {
                return this.shuffled[r3];
            }
            return -1;
        }

        public DefaultShuffleOrder(int r2, long j) {
            this(r2, new Random(j));
        }

        private DefaultShuffleOrder(int r1, Random random) {
            this(createShuffledList(r1, random), random);
        }

        private DefaultShuffleOrder(int[] r3, Random random) {
            this.shuffled = r3;
            this.random = random;
            this.indexInShuffled = new int[r3.length];
            for (int r4 = 0; r4 < r3.length; r4++) {
                this.indexInShuffled[r3[r4]] = r4;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int r1) {
            this.length = r1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int r2, int r3) {
            return new UnshuffledShuffleOrder(this.length + r3);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int r2) {
            return new UnshuffledShuffleOrder(this.length - 1);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int r0 = this.length;
            if (r0 > 0) {
                return r0 - 1;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int r2) {
            int r3 = r2 + 1;
            if (r3 < this.length) {
                return r3;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int r2) {
            int r3 = r2 - 1;
            if (r3 >= 0) {
                return r3;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int r1, int r2);

    ShuffleOrder cloneAndRemove(int r1);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int r1);

    int getPreviousIndex(int r1);
}
