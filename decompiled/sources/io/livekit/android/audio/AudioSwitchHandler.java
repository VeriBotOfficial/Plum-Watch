package io.livekit.android.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.twilio.audioswitch.AbstractAudioSwitch;
import com.twilio.audioswitch.AudioDevice;
import com.twilio.audioswitch.AudioSwitch;
import com.yandex.div.core.timer.TimerController;
import io.livekit.android.audio.AudioSwitchHandler$audioDeviceChangeDispatcher$2;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioSwitchHandler.kt */
@Singleton
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u000f\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JJ\u0010X\u001a\u00020\u001c2B\u0010Y\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015j\u0002`\u001dJ\u000e\u0010Z\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020EJ\u0010\u0010[\u001a\u00020\u001c2\b\u0010\\\u001a\u0004\u0018\u00010\u0017J\b\u0010]\u001a\u00020\u001cH\u0016J\b\u0010^\u001a\u00020\u001cH\u0016JJ\u0010_\u001a\u00020\u001c2B\u0010Y\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015j\u0002`\u001dJ\u000e\u0010`\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020ER\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011Rd\u0010\u0014\u001aB\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0015j\u0004\u0018\u0001`\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R¬\u0002\u0010$\u001a\u009f\u0002\u0012\u0087\u0001\u0012\u0084\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c &*B\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0015j\u0004\u0018\u0001`\u001d0\u0015j\u0002`\u001d &*\u008e\u0001\u0012\u0087\u0001\u0012\u0084\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c &*B\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0015j\u0004\u0018\u0001`\u001d0\u0015j\u0002`\u001d\u0018\u00010'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u001a\u0010+\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00109\"\u0004\b@\u0010;R\u001a\u0010A\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u001b\u0010D\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bF\u0010GR&\u0010I\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010MR2\u0010N\u001a&\u0012\f\u0012\n &*\u0004\u0018\u00010E0E &*\u0012\u0012\f\u0012\n &*\u0004\u0018\u00010E0E\u0018\u00010'0%X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010O\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170P\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00102\"\u0004\bR\u0010SR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lio/livekit/android/audio/AudioSwitchHandler;", "Lio/livekit/android/audio/AudioHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioAttributeContentType", "", "getAudioAttributeContentType", "()I", "setAudioAttributeContentType", "(I)V", "audioAttributeUsageType", "getAudioAttributeUsageType", "setAudioAttributeUsageType", "audioDeviceChangeDispatcher", "io/livekit/android/audio/AudioSwitchHandler$audioDeviceChangeDispatcher$2$1", "getAudioDeviceChangeDispatcher", "()Lio/livekit/android/audio/AudioSwitchHandler$audioDeviceChangeDispatcher$2$1;", "audioDeviceChangeDispatcher$delegate", "Lkotlin/Lazy;", "audioDeviceChangeListener", "Lkotlin/Function2;", "", "Lcom/twilio/audioswitch/AudioDevice;", "Lkotlin/ParameterName;", "name", "audioDevices", "selectedAudioDevice", "", "Lcom/twilio/audioswitch/AudioDeviceChangeListener;", "getAudioDeviceChangeListener$annotations", "()V", "getAudioDeviceChangeListener", "()Lkotlin/jvm/functions/Function2;", "setAudioDeviceChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "audioDeviceChangeListeners", "", "kotlin.jvm.PlatformType", "", "audioMode", "getAudioMode", "setAudioMode", "audioStreamType", "getAudioStreamType", "setAudioStreamType", "audioSwitch", "Lcom/twilio/audioswitch/AbstractAudioSwitch;", "availableAudioDevices", "getAvailableAudioDevices", "()Ljava/util/List;", "focusMode", "getFocusMode", "setFocusMode", "forceHandleAudioRouting", "", "getForceHandleAudioRouting", "()Z", "setForceHandleAudioRouting", "(Z)V", "handler", "Landroid/os/Handler;", "loggingEnabled", "getLoggingEnabled", "setLoggingEnabled", "manageAudioFocus", "getManageAudioFocus", "setManageAudioFocus", "onAudioFocusChangeDispatcher", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "getOnAudioFocusChangeDispatcher", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onAudioFocusChangeDispatcher$delegate", "onAudioFocusChangeListener", "getOnAudioFocusChangeListener$annotations", "getOnAudioFocusChangeListener", "setOnAudioFocusChangeListener", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "onAudioFocusChangeListeners", "preferredDeviceList", "Ljava/lang/Class;", "getPreferredDeviceList", "setPreferredDeviceList", "(Ljava/util/List;)V", "getSelectedAudioDevice", "()Lcom/twilio/audioswitch/AudioDevice;", "thread", "Landroid/os/HandlerThread;", "registerAudioDeviceChangeListener", "listener", "registerOnAudioFocusChangeListener", "selectDevice", "audioDevice", "start", TimerController.STOP_COMMAND, "unregisterAudioDeviceChangeListener", "unregisterOnAudioFocusChangeListener", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioSwitchHandler implements AudioHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<List<Class<? extends AudioDevice>>> defaultPreferredDeviceList$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<List<? extends Class<? extends AudioDevice>>>() { // from class: io.livekit.android.audio.AudioSwitchHandler$Companion$defaultPreferredDeviceList$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Class<? extends AudioDevice>> invoke() {
            return CollectionsKt.listOf((Object[]) new Class[]{AudioDevice.BluetoothHeadset.class, AudioDevice.WiredHeadset.class, AudioDevice.Speakerphone.class, AudioDevice.Earpiece.class});
        }
    });
    private int audioAttributeContentType;
    private int audioAttributeUsageType;

    /* renamed from: audioDeviceChangeDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy audioDeviceChangeDispatcher;
    private Function2<? super List<? extends AudioDevice>, ? super AudioDevice, Unit> audioDeviceChangeListener;
    private final Set<Function2<List<? extends AudioDevice>, AudioDevice, Unit>> audioDeviceChangeListeners;
    private int audioMode;
    private int audioStreamType;
    private AbstractAudioSwitch audioSwitch;
    private final Context context;
    private int focusMode;
    private boolean forceHandleAudioRouting;
    private Handler handler;
    private boolean loggingEnabled;
    private boolean manageAudioFocus;

    /* renamed from: onAudioFocusChangeDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy onAudioFocusChangeDispatcher;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
    private final Set<AudioManager.OnAudioFocusChangeListener> onAudioFocusChangeListeners;
    private List<? extends Class<? extends AudioDevice>> preferredDeviceList;
    private HandlerThread thread;

    @Deprecated(message = "Use registerAudioDeviceChangeListener.")
    public static /* synthetic */ void getAudioDeviceChangeListener$annotations() {
    }

    @Deprecated(message = "Use registerOnAudioFocusChangeListener.")
    public static /* synthetic */ void getOnAudioFocusChangeListener$annotations() {
    }

    @Inject
    public AudioSwitchHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.audioDeviceChangeListeners = Collections.synchronizedSet(new LinkedHashSet());
        this.audioDeviceChangeDispatcher = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<AudioSwitchHandler$audioDeviceChangeDispatcher$2.AnonymousClass1>() { // from class: io.livekit.android.audio.AudioSwitchHandler$audioDeviceChangeDispatcher$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [io.livekit.android.audio.AudioSwitchHandler$audioDeviceChangeDispatcher$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass1 invoke() {
                final AudioSwitchHandler audioSwitchHandler = AudioSwitchHandler.this;
                return new Function2<List<? extends AudioDevice>, AudioDevice, Unit>() { // from class: io.livekit.android.audio.AudioSwitchHandler$audioDeviceChangeDispatcher$2.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AudioDevice> list, AudioDevice audioDevice) {
                        invoke2(list, audioDevice);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(List<? extends AudioDevice> audioDevices, AudioDevice selectedAudioDevice) {
                        Set set;
                        Set set2;
                        Intrinsics.checkNotNullParameter(audioDevices, "audioDevices");
                        Function2<List<? extends AudioDevice>, AudioDevice, Unit> audioDeviceChangeListener = AudioSwitchHandler.this.getAudioDeviceChangeListener();
                        if (audioDeviceChangeListener != null) {
                            audioDeviceChangeListener.invoke(audioDevices, selectedAudioDevice);
                        }
                        set = AudioSwitchHandler.this.audioDeviceChangeListeners;
                        Intrinsics.checkNotNullExpressionValue(set, "access$getAudioDeviceChangeListeners$p(...)");
                        AudioSwitchHandler audioSwitchHandler2 = AudioSwitchHandler.this;
                        synchronized (set) {
                            set2 = audioSwitchHandler2.audioDeviceChangeListeners;
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                ((Function2) it.next()).invoke(audioDevices, selectedAudioDevice);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                };
            }
        });
        this.onAudioFocusChangeListeners = Collections.synchronizedSet(new LinkedHashSet());
        this.onAudioFocusChangeDispatcher = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new AudioSwitchHandler$onAudioFocusChangeDispatcher$2(this));
        this.manageAudioFocus = true;
        this.audioMode = 3;
        this.focusMode = 1;
        this.audioAttributeUsageType = 2;
        this.audioAttributeContentType = 1;
    }

    public final boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    public final Function2<List<? extends AudioDevice>, AudioDevice, Unit> getAudioDeviceChangeListener() {
        return this.audioDeviceChangeListener;
    }

    public final void setAudioDeviceChangeListener(Function2<? super List<? extends AudioDevice>, ? super AudioDevice, Unit> function2) {
        this.audioDeviceChangeListener = function2;
    }

    private final AudioSwitchHandler$audioDeviceChangeDispatcher$2.AnonymousClass1 getAudioDeviceChangeDispatcher() {
        return (AudioSwitchHandler$audioDeviceChangeDispatcher$2.AnonymousClass1) this.audioDeviceChangeDispatcher.getValue();
    }

    public final AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.onAudioFocusChangeListener;
    }

    public final void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.onAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    private final AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeDispatcher() {
        return (AudioManager.OnAudioFocusChangeListener) this.onAudioFocusChangeDispatcher.getValue();
    }

    public final List<Class<? extends AudioDevice>> getPreferredDeviceList() {
        return this.preferredDeviceList;
    }

    public final void setPreferredDeviceList(List<? extends Class<? extends AudioDevice>> list) {
        this.preferredDeviceList = list;
    }

    public final boolean getManageAudioFocus() {
        return this.manageAudioFocus;
    }

    public final void setManageAudioFocus(boolean z) {
        this.manageAudioFocus = z;
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public final void setAudioMode(int i) {
        this.audioMode = i;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final void setFocusMode(int i) {
        this.focusMode = i;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    public final void setAudioStreamType(int i) {
        this.audioStreamType = i;
    }

    public final int getAudioAttributeUsageType() {
        return this.audioAttributeUsageType;
    }

    public final void setAudioAttributeUsageType(int i) {
        this.audioAttributeUsageType = i;
    }

    public final int getAudioAttributeContentType() {
        return this.audioAttributeContentType;
    }

    public final void setAudioAttributeContentType(int i) {
        this.audioAttributeContentType = i;
    }

    public final boolean getForceHandleAudioRouting() {
        return this.forceHandleAudioRouting;
    }

    public final void setForceHandleAudioRouting(boolean z) {
        this.forceHandleAudioRouting = z;
    }

    @Override // io.livekit.android.audio.AudioHandler
    public synchronized void start() {
        LKLog.Logger logger;
        if (this.handler != null || this.thread != null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion.getLogger()) != null) {
                logger.log(loggingLevel, null, "AudioSwitchHandler called start multiple times?");
            }
        }
        if (this.thread == null) {
            HandlerThread handlerThread = new HandlerThread("AudioSwitchHandlerThread");
            handlerThread.start();
            this.thread = handlerThread;
        }
        if (this.handler == null) {
            HandlerThread handlerThread2 = this.thread;
            Intrinsics.checkNotNull(handlerThread2);
            this.handler = new Handler(handlerThread2.getLooper());
        }
        if (this.audioSwitch == null) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.postAtFrontOfQueue(new Runnable() { // from class: io.livekit.android.audio.AudioSwitchHandler$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSwitchHandler.start$lambda$2(AudioSwitchHandler.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$2(AudioSwitchHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.context;
        boolean z = this$0.loggingEnabled;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeDispatcher = this$0.getOnAudioFocusChangeDispatcher();
        List<? extends Class<? extends AudioDevice>> list = this$0.preferredDeviceList;
        if (list == null) {
            list = INSTANCE.getDefaultPreferredDeviceList();
        }
        AudioSwitch audioSwitch = new AudioSwitch(context, z, onAudioFocusChangeDispatcher, list);
        audioSwitch.setManageAudioFocus(this$0.manageAudioFocus);
        audioSwitch.setAudioMode(this$0.audioMode);
        audioSwitch.setFocusMode(this$0.focusMode);
        audioSwitch.setAudioStreamType(this$0.audioStreamType);
        audioSwitch.setAudioAttributeUsageType(this$0.audioAttributeUsageType);
        audioSwitch.setAudioAttributeContentType(this$0.audioAttributeContentType);
        audioSwitch.setForceHandleAudioRouting(this$0.forceHandleAudioRouting);
        this$0.audioSwitch = audioSwitch;
        audioSwitch.start(this$0.getAudioDeviceChangeDispatcher());
        audioSwitch.activate();
    }

    @Override // io.livekit.android.audio.AudioHandler
    public synchronized void stop() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.postAtFrontOfQueue(new Runnable() { // from class: io.livekit.android.audio.AudioSwitchHandler$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSwitchHandler.stop$lambda$3(AudioSwitchHandler.this);
                }
            });
        }
        HandlerThread handlerThread = this.thread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handler = null;
        this.thread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$3(AudioSwitchHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractAudioSwitch abstractAudioSwitch = this$0.audioSwitch;
        if (abstractAudioSwitch != null) {
            abstractAudioSwitch.stop();
        }
        this$0.audioSwitch = null;
    }

    public final AudioDevice getSelectedAudioDevice() {
        AbstractAudioSwitch abstractAudioSwitch = this.audioSwitch;
        if (abstractAudioSwitch != null) {
            return abstractAudioSwitch.getSelectedAudioDevice();
        }
        return null;
    }

    public final List<AudioDevice> getAvailableAudioDevices() {
        List<AudioDevice> availableAudioDevices;
        AbstractAudioSwitch abstractAudioSwitch = this.audioSwitch;
        return (abstractAudioSwitch == null || (availableAudioDevices = abstractAudioSwitch.getAvailableAudioDevices()) == null) ? CollectionsKt.emptyList() : availableAudioDevices;
    }

    public final synchronized void selectDevice(final AudioDevice audioDevice) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.handler;
        if (Intrinsics.areEqual(myLooper, handler != null ? handler.getLooper() : null)) {
            AbstractAudioSwitch abstractAudioSwitch = this.audioSwitch;
            if (abstractAudioSwitch != null) {
                abstractAudioSwitch.selectDevice(audioDevice);
            }
        } else {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: io.livekit.android.audio.AudioSwitchHandler$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSwitchHandler.selectDevice$lambda$4(AudioSwitchHandler.this, audioDevice);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectDevice$lambda$4(AudioSwitchHandler this$0, AudioDevice audioDevice) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractAudioSwitch abstractAudioSwitch = this$0.audioSwitch;
        if (abstractAudioSwitch != null) {
            abstractAudioSwitch.selectDevice(audioDevice);
        }
    }

    public final void registerAudioDeviceChangeListener(Function2<? super List<? extends AudioDevice>, ? super AudioDevice, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.audioDeviceChangeListeners.add(listener);
    }

    public final void unregisterAudioDeviceChangeListener(Function2<? super List<? extends AudioDevice>, ? super AudioDevice, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.audioDeviceChangeListeners.remove(listener);
    }

    public final void registerOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onAudioFocusChangeListeners.add(listener);
    }

    public final void unregisterOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onAudioFocusChangeListeners.remove(listener);
    }

    /* compiled from: AudioSwitchHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R)\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lio/livekit/android/audio/AudioSwitchHandler$Companion;", "", "()V", "defaultPreferredDeviceList", "", "Ljava/lang/Class;", "Lcom/twilio/audioswitch/AudioDevice;", "getDefaultPreferredDeviceList", "()Ljava/util/List;", "defaultPreferredDeviceList$delegate", "Lkotlin/Lazy;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Class<? extends AudioDevice>> getDefaultPreferredDeviceList() {
            return (List) AudioSwitchHandler.defaultPreferredDeviceList$delegate.getValue();
        }
    }
}
