package com.autonavi.base.ae.gmap.glyph;

import java.text.BreakIterator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class GlyphBreakIterator {
    public static final int BREAK_BY_CHARACTER_SEQUENCES = 2;
    public static final int BREAK_BY_WORDS = 1;
    public ArrayList<Integer> breakResult = new ArrayList<>();
    public int mBreakMode;

    public GlyphBreakIterator(int r2) {
        this.mBreakMode = r2;
    }

    public int[] setText(String str) {
        BreakIterator wordInstance = null;
        if (str.isEmpty()) {
            return null;
        }
        if (!this.breakResult.isEmpty()) {
            this.breakResult.clear();
        }
        int r0 = this.mBreakMode;
        if (r0 == 1) {
            wordInstance = BreakIterator.getWordInstance();
        } else if (r0 == 2) {
            wordInstance = BreakIterator.getCharacterInstance();
        }
        wordInstance.setText(str);
        int r1 = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int r4 = next;
            int r2 = r1;
            r1 = r4;
            if (r1 == -1) {
                break;
            }
            this.breakResult.add(Integer.valueOf(r2));
            next = wordInstance.next();
        }
        this.breakResult.add(Integer.valueOf(str.length()));
        int size = this.breakResult.size();
        Integer[] numArr = new Integer[size];
        this.breakResult.toArray(numArr);
        int[] r3 = new int[size];
        for (int r5 = 0; r5 < size; r5++) {
            r3[r5] = numArr[r5].intValue();
        }
        return r3;
    }
}
