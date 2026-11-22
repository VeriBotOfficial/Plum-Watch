package io.livekit.android.room.datastream.outgoing;

import com.wakeup.module.device.work.BleFailStage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: BaseStreamSender.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\nJl\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\r\u001a\u00028\u00002F\u0010\u000e\u001aB\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0016H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "T", "", "isOpen", "", "()Z", "close", "", "reason", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BleFailStage.WRITE, "Lkotlin/Result;", "data", "chunker", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "chunkSize", "", "", "Lio/livekit/android/room/datastream/outgoing/DataChunker;", "write-0E7RQCE", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StreamDestination<T> {
    Object close(String str, Continuation<? super Unit> continuation);

    boolean isOpen();

    /* renamed from: write-0E7RQCE */
    Object mo13883write0E7RQCE(T t, Function2<? super T, ? super Integer, ? extends List<byte[]>> function2, Continuation<? super Result<Unit>> continuation);
}
