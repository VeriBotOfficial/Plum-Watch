package com.compress.view;

import com.facebook.react.views.scroll.ReactScrollViewHelper;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialClick extends ObjectData {
    private int displayMode;
    private android.graphics.Rect rect;
    private int type;
    private ClickTypeUnion unionType;

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return 12;
    }

    public DialClick() {
        this.type = 0;
        this.displayMode = 0;
    }

    public DialClick(int i, android.graphics.Rect rect, ClickTypeUnion clickTypeUnion, int i2) {
        this.type = i;
        this.rect = rect;
        this.unionType = clickTypeUnion;
        this.displayMode = i2;
    }

    public void parseAttributes(Attributes attributes) {
        String[] split = attributes.getValue("rect").split(" ");
        if (split.length != 4) {
            throw new IllegalStateException("rect must have 4 values");
        }
        int parseInt = Integer.parseInt(split[0]);
        if (parseInt < Integer.MIN_VALUE || parseInt > Integer.MAX_VALUE) {
            throw new IllegalStateException("rect.x out of range");
        }
        int parseInt2 = Integer.parseInt(split[1]);
        if (parseInt2 < Integer.MIN_VALUE || parseInt2 > Integer.MAX_VALUE) {
            throw new IllegalStateException("rect.y out of range");
        }
        int parseInt3 = Integer.parseInt(split[2]);
        if (parseInt3 < Integer.MIN_VALUE || parseInt3 > Integer.MAX_VALUE) {
            throw new IllegalStateException("rect.w out of range");
        }
        int parseInt4 = Integer.parseInt(split[3]);
        if (parseInt4 < Integer.MIN_VALUE || parseInt4 > Integer.MAX_VALUE) {
            throw new IllegalStateException("rect.h out of range");
        }
        String value = attributes.getValue("action_slice");
        if (value.equals("") || value.isEmpty() || value == null) {
            throw new IllegalStateException("action_slice must be set");
        }
        this.unionType.sliceId = Integer.parseInt(value);
        this.type = 0;
        String value2 = attributes.getValue("action_bundle");
        if (value2.equals("") || value2.isEmpty() || value2 == null) {
            throw new IllegalStateException("action_bundle must be set");
        }
        this.unionType.bundleName = value2;
        this.type = 1;
        String value3 = attributes.getValue("display_mode");
        if (value3 == null) {
            throw new IllegalStateException("display_mode must be set");
        }
        if (value3.equals("normal")) {
            this.displayMode = 0;
        } else if (value3.equals("ambient")) {
            this.displayMode = 1;
        } else {
            if (value3.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = 2;
                return;
            }
            throw new IllegalStateException("invalid display_mode value");
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        return new byte[4];
    }

    static class ClickTypeUnion {
        private String bundleName;
        private int sliceId;

        public ClickTypeUnion() {
        }

        public ClickTypeUnion(int i, String str) {
            this.sliceId = i;
            this.bundleName = str;
        }
    }
}
