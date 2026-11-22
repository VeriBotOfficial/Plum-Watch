package org.xmind.core.internal;

import com.luck.picture.lib.config.PictureMimeType;
import org.xmind.core.marker.IMarkerVariation;

/* loaded from: classes7.dex */
public class MarkerVariation implements IMarkerVariation {
    private int applicableHeight;
    private int applicableWidth;
    private String suffix;

    public MarkerVariation(String str, int i, int i2) {
        this.suffix = str;
        this.applicableWidth = i;
        this.applicableHeight = i2;
    }

    @Override // org.xmind.core.marker.IMarkerVariation
    public String getVariedPath(String str) {
        int i;
        if (str.endsWith(PictureMimeType.PNG) || str.endsWith(PictureMimeType.JPG) || str.endsWith(".gif") || str.endsWith("bmp")) {
            i = 4;
        } else {
            i = str.endsWith(".jpeg") ? 5 : 0;
        }
        if (i > 0) {
            return String.valueOf(str.substring(0, str.length() - i)) + this.suffix + str.substring(str.length() - i);
        }
        return String.valueOf(str) + this.suffix + str.substring(str.length() - i);
    }

    @Override // org.xmind.core.marker.IMarkerVariation
    public boolean isApplicable(int i, int i2) {
        return i <= this.applicableWidth && i2 <= this.applicableHeight;
    }
}
