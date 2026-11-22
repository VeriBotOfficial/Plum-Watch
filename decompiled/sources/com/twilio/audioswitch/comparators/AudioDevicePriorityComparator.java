package com.twilio.audioswitch.comparators;

import com.baidu.ar.o1;
import com.twilio.audioswitch.AudioDevice;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioDevicePriorityComparator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/twilio/audioswitch/comparators/AudioDevicePriorityComparator;", "Ljava/util/Comparator;", "Lcom/twilio/audioswitch/AudioDevice;", "Lkotlin/Comparator;", "order", "", "Ljava/lang/Class;", "(Ljava/util/List;)V", "getOrder", "()Ljava/util/List;", "compare", "", o1.r, "o2", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class AudioDevicePriorityComparator implements Comparator<AudioDevice> {
    private final List<Class<? extends AudioDevice>> order;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioDevicePriorityComparator(List<? extends Class<? extends AudioDevice>> order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.order = order;
    }

    public final List<Class<? extends AudioDevice>> getOrder() {
        return this.order;
    }

    @Override // java.util.Comparator
    public int compare(AudioDevice o1, AudioDevice o2) {
        Object obj;
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        Class<?> cls = o1.getClass();
        Class<?> cls2 = o2.getClass();
        if (Intrinsics.areEqual(cls, cls2)) {
            return 0;
        }
        Iterator<T> it = this.order.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Class cls3 = (Class) obj;
            if (Intrinsics.areEqual(cls3, cls) || Intrinsics.areEqual(cls3, cls2)) {
                break;
            }
        }
        return Intrinsics.areEqual((Class) obj, cls) ? -1 : 1;
    }
}
