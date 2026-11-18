package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Preview$$ExternalSyntheticBackport0 {
    public static /* synthetic */ String m(String str) {
        int length = str.length();
        while (length > 0) {
            int r1 = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(r1)) {
                break;
            }
            length -= Character.charCount(r1);
        }
        return str.substring(0, length);
    }

    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ boolean m154m(String str) {
        int length = str.length();
        int r2 = 0;
        while (r2 < length) {
            int r3 = str.codePointAt(r2);
            if (!Character.isWhitespace(r3)) {
                return false;
            }
            r2 += Character.charCount(r3);
        }
        return true;
    }
}
