package com.autonavi.base.ae.gmap.glyph;

import java.text.BreakIterator;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class GlyphBreakIterator {
    public static final int BREAK_BY_CHARACTER_SEQUENCES = 2;
    public static final int BREAK_BY_WORDS = 1;
    public ArrayList<Integer> breakResult = new ArrayList<>();
    public int mBreakMode;

    public GlyphBreakIterator(int i) {
        this.mBreakMode = i;
    }

    public int[] setText(String str) {
        BreakIterator breakIterator = null;
        if (str.isEmpty()) {
            return null;
        }
        if (!this.breakResult.isEmpty()) {
            this.breakResult.clear();
        }
        int i = this.mBreakMode;
        if (i == 1) {
            breakIterator = BreakIterator.getWordInstance();
        } else if (i == 2) {
            breakIterator = BreakIterator.getCharacterInstance();
        }
        breakIterator.setText(str);
        int first = breakIterator.first();
        int next = breakIterator.next();
        while (true) {
            int i2 = next;
            int i3 = first;
            first = i2;
            if (first == -1) {
                break;
            }
            this.breakResult.add(Integer.valueOf(i3));
            next = breakIterator.next();
        }
        this.breakResult.add(Integer.valueOf(str.length()));
        int size = this.breakResult.size();
        Integer[] numArr = new Integer[size];
        this.breakResult.toArray(numArr);
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }
}
