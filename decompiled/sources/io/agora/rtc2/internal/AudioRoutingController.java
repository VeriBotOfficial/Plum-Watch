package io.agora.rtc2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.webkit.Profile;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.voiceengine.WebRtcAudioRecord;
import io.agora.base.internal.voiceengine.WebRtcAudioTrack;
import io.agora.utils2.internal.Logging;
import java.lang.ref.WeakReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AudioRoutingController {
    public static final int AUDIO_DEVICE_EVENT_FALLBACK_TO_A2DP = 4;
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 3000;
    private static final int BT_SCO_STATE_CONNECTED = 1;
    private static final int BT_SCO_STATE_CONNECTING = 0;
    private static final int BT_SCO_STATE_DISCONNECTED = 3;
    private static final int BT_SCO_STATE_DISCONNECTING = 2;
    public static final int CMD_FORCE_TO_A2DP = 16;
    public static final int CMD_FORCE_TO_SPEAKER = 11;
    public static final int CMD_SET_DEFAULT_ROUTING = 10;
    private static final int CMD_SET_PREFER_ROUTING = 25;
    private static final int CMD_SET_ROUTING_FREEZE = 26;
    public static final int CMD_START_BT_SCO = 15;
    public static final int DEVICE_EVT_BT_OFF = 0;
    public static final int DEVICE_EVT_BT_RECONNECT = 1;
    public static final int DEVICE_OUTPUT_OUT_IP = 8388608;
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    private static final int ERROR = 4;
    private static final int EVT_BT_HEADSET = 2;
    private static final int EVT_BT_HEADSET_RECONNECT = 23;
    private static final int EVT_BT_SCO = 3;
    public static final int EVT_CHANNEL_PROFILE = 20;
    public static final int EVT_ENGINE_ROLE_CHANGED = 21;
    private static final int EVT_HDMI = 6;
    private static final int EVT_HEADSET = 1;
    public static final int EVT_PHONE_STATE_CHANGED = 22;
    private static final int EVT_USB = 4;
    private static final int EVT_USB_HEADSET = 5;
    private static final int MAX_SCO_CONNECT_ATTEMPS = 2;
    public static final int OFF = 0;
    public static final int ON = 1;
    private static final int PHONE_STATE_MONITOR_TIMEOUT_MS = 2000;
    private static final SparseIntArray ROUTE_TYPE_TO_EVT;
    public static final int SDK_INT_FOR_DEVICE_INVENTORY = 23;
    private static final int START = 1;
    private static final int STOP = 2;
    private static final String TAG = "AudioRoute";
    private static final int UNINIT = 0;
    public static final int UNSET = -1;
    private static AudioDeviceChangedSpecialMonitor deviceSpecialMonitor = null;
    private static boolean mockBlueToothEnable = false;
    private static AudioManager mockedAudioManager;
    private static MockedBroadcaseter mockedBroadcaster;
    private AudioDeviceInventory mAudioDeviceInventory;
    private final WeakReference<Context> mContext;
    private EventHandler mEventHandler;
    private long mNativeHandle;
    private int mScoConnectionAttemps;
    private ControllerState mState;
    private boolean mIsWiredHeadsetPlugged = false;
    private int mHeadsetType = -1;
    private boolean mIsBTHeadsetPlugged = false;
    private int ROUTING_ATTR_SPEAKER_SWITCH_SUPPORT = 1;
    private int mCurrentRouting = -1;
    private int mDefaultRouting = 3;
    private int mForcedRouting = -1;
    private int mChannelProfile = -1;
    private int mEngineRole = -1;
    private boolean mPhoneInCall = false;
    private int mSpeakerCommVolume = -1;
    private int mForceUseA2dp = -1;
    private int mBtScoState = 3;
    private boolean mIsBTScoStarted = false;
    private int dynamic_timeout = 3000;
    private boolean mIsFreezed = false;
    private ControllerStopState mStopState = null;
    private ControllerStartState mStartState = null;
    private ControllerErrorState mErrorState = null;
    private final Runnable bluetoothTimeoutRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.bluetoothTimeout();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private final Runnable scoMonitorInPhoneCallRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.scoMonitorTimeout();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private ControllerAudioDeviceChangeCallback ctrlAudioDeviceCb = null;
    private boolean mDisposed = false;
    AudioManagerScoStateReceiver mScoStateReceiver = null;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    private int mVersionInUsed = 1;

    public interface AudioDeviceChangedCallback {
        void onAudioDeviceChanged(boolean connect, int route);

        void onAudioDeviceEvent(int evt);
    }

    private class AudioDeviceChangedCallbackImpl implements AudioDeviceChangedCallback {
        private AudioDeviceChangedCallbackImpl() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r5v1, types: [io.agora.rtc2.internal.AudioRoutingController] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceChanged(boolean z, int i) {
            StringBuilder append;
            int i2 = AudioRoutingController.ROUTE_TYPE_TO_EVT.get(i);
            if (i2 == 0) {
                append = new StringBuilder("Not handle ").append(AudioRoutingController.this.getAudioRouteDesc(i)).append(" device event yet!");
            } else {
                ?? r4 = z;
                if (i != 5) {
                    r4 = z ? i : -1;
                }
                AudioRoutingController.this.sendEvent(i2, r4);
                append = new StringBuilder("Device event: ").append(AudioRoutingController.this.evtAsString(i2)).append(", arg: ").append(r4);
            }
            Logging.i(AudioRoutingController.TAG, append.toString());
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceEvent(int evt) {
            if (evt == 0) {
                AudioRoutingController.this.cancelTimer();
                AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            } else if (evt == 1) {
                AudioRoutingController.this.sendEvent(23, 0);
            }
        }
    }

    public interface AudioDeviceChangedSpecialMonitor {
        void AudioDeviceChangeCallback(boolean isRecorder, AudioDeviceInfo audioDevice);

        String GetUSBDevicePID(int mic_or_spk);

        String GetUSBDeviceVID(int mic_or_spk);

        int GetUSBRouteType();
    }

    public interface AudioDeviceInventory {
        void dispose();

        void initialize();

        boolean isDeviceAvaliable(int route);

        void setAudioDeviceChangeCallback(AudioDeviceChangedCallback cb);
    }

    private class AudioManagerScoStateReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private AudioManagerScoStateReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                Logging.i(AudioRoutingController.TAG, "Receive SCO state event, prev: " + intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99) + ", curr: " + intExtra);
                if (intExtra == 0) {
                    Logging.i(AudioRoutingController.TAG, "SCO state disconnected");
                    AudioRoutingController.this.sendEvent(3, 0);
                } else if (intExtra != 1) {
                    Logging.i(AudioRoutingController.TAG, "SCO device unknown event, state=" + intExtra);
                } else {
                    Logging.i(AudioRoutingController.TAG, "SCO state connected");
                    AudioRoutingController.this.sendEvent(3, 1);
                }
            }
        }

        public void setRegistered(boolean isReg) {
            this.isRegistered = isReg;
        }
    }

    private class ControllerAudioDeviceChangeCallback implements WebRtcAudioRecord.AudioRecordRouteCallback, WebRtcAudioTrack.AudioTrackRouteCallback {
        private ControllerAudioDeviceChangeCallback() {
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioRecord.AudioRecordRouteCallback
        public void onAudioRecordRouteNotify(int i, AudioDeviceInfo audioRecord) {
            Logging.i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioRecordRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(true, audioRecord);
                AudioRoutingController.this.nativeAudioDeviceStateChanged(Integer.toString(audioRecord.getId()), audioRecord.getProductName().toString(), 1, 1);
            }
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioTrack.AudioTrackRouteCallback
        public void onAudioTrackRouteNotify(int i, AudioDeviceInfo audioTrack) {
            Logging.i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioTrackRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(false, audioTrack);
                AudioRoutingController.this.sendEvent(4, AudioRoutingController.deviceSpecialMonitor.GetUSBRouteType());
            }
        }
    }

    private abstract class ControllerBaseState implements ControllerState {
        private ControllerBaseState() {
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 0;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int event, int info) {
            if (event == 1) {
                int handleHeadsetEvent = AudioRoutingController.this.handleHeadsetEvent(info);
                if (handleHeadsetEvent == -1) {
                    return;
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(handleHeadsetEvent);
                return;
            }
            if (event == 2) {
                AudioRoutingController.this.notifyAudioRoutingChanged(AudioRoutingController.this.handleBluetoothHeadsetEvent(info));
                return;
            }
            if (event == 4 || event == 5 || event == 6) {
                if (info != 6 && info != 7) {
                    info = AudioRoutingController.this.queryCurrentAudioRouting();
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(info);
                return;
            }
            if (event == 10) {
                AudioRoutingController.this.mDefaultRouting = info;
                StringBuilder sb = new StringBuilder("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                Logging.i(AudioRoutingController.TAG, sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting)).toString());
                return;
            }
            if (event != 16) {
                if (event == 20) {
                    AudioRoutingController.this.mChannelProfile = info;
                    return;
                } else if (event == 22) {
                    AudioRoutingController.this.mPhoneInCall = info > 0;
                    return;
                } else {
                    if (event != 26) {
                        return;
                    }
                    AudioRoutingController.this.mIsFreezed = info > 0;
                    return;
                }
            }
            int i = AudioRoutingController.this.mForceUseA2dp;
            AudioRoutingController.this.mForceUseA2dp = info == 1 ? 1 : 0;
            Logging.w(AudioRoutingController.TAG, "bluetooth protocol to: ".concat(AudioRoutingController.this.mForceUseA2dp == 1 ? "a2dp" : "hfp"));
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            audioRoutingController2.updateBluetoothSco(audioRoutingController2.mCurrentRouting);
            if (AudioRoutingController.this.mForceUseA2dp == i || AudioRoutingController.this.mCurrentRouting != 5) {
                return;
            }
            AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
            audioRoutingController3.notifyAudioRoutingChanged(audioRoutingController3.mCurrentRouting);
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void setState(int state) {
            if (state == getState()) {
                Logging.i(AudioRoutingController.TAG, "setState: state not changed!");
            } else {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.mState = audioRoutingController.changeState(state);
            }
        }
    }

    private class ControllerErrorState extends ControllerBaseState {
        private ControllerErrorState() {
            super();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 4;
        }
    }

    private class ControllerStartState extends ControllerBaseState {
        public ControllerStartState() {
            super();
            resetImpl();
            Logging.i(AudioRoutingController.TAG, "ControllerStartState ctor, default routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting) + ", current routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mCurrentRouting));
        }

        private void resetImpl() {
            AudioRoutingController audioRoutingController;
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                int i = 1;
                if (AudioRoutingController.this.mChannelProfile == 1) {
                    audioRoutingController = AudioRoutingController.this;
                    i = 3;
                } else {
                    audioRoutingController = AudioRoutingController.this;
                }
                audioRoutingController.mDefaultRouting = i;
            }
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mForcedRouting = -1;
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int event, int info) {
            Logging.d(AudioRoutingController.TAG, "StartState: onEvent: " + AudioRoutingController.this.evtAsString(event) + ", info: " + info);
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            if (event == 10) {
                AudioRoutingController.this.mDefaultRouting = info;
                StringBuilder sb = new StringBuilder("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                Logging.i(AudioRoutingController.TAG, sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting)).toString());
                return;
            }
            if (event == 11) {
                if (AudioRoutingController.this.mCurrentRouting == 2 || AudioRoutingController.this.mCurrentRouting == 0 || AudioRoutingController.this.mCurrentRouting == 6 || AudioRoutingController.this.mCurrentRouting == 8 || AudioRoutingController.this.mCurrentRouting == 5) {
                    Logging.i(AudioRoutingController.TAG, "StartState: not proceed with force speaker event for BT/HS");
                    return;
                }
                AudioRoutingController.this.mForcedRouting = info == 1 ? 3 : 1;
                if (AudioRoutingController.this.mPhoneInCall) {
                    return;
                }
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                if (info == 1) {
                    audioRoutingController2.doSetAudioOutputRouting(3);
                    return;
                } else {
                    audioRoutingController2.resetAudioRouting();
                    return;
                }
            }
            if (event == 22) {
                Logging.i(AudioRoutingController.TAG, "Phone state changed: " + info);
                AudioRoutingController.this.mPhoneInCall = info > 0;
                AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                if (info == 0) {
                    audioRoutingController3.resetAudioRouting();
                    return;
                } else {
                    audioRoutingController3.mCurrentRouting = -1;
                    return;
                }
            }
            if (event == 23) {
                Logging.i(AudioRoutingController.TAG, "Try reconnect bt: ");
                if (AudioRoutingController.this.mCurrentRouting == 5) {
                    AudioRoutingController audioRoutingController4 = AudioRoutingController.this;
                    audioRoutingController4.doSetAudioOutputRouting(audioRoutingController4.mCurrentRouting);
                    return;
                }
                return;
            }
            if (event == 25) {
                AudioRoutingController.this.selectRoutingForCommunication(info);
                return;
            }
            if (event == 26) {
                Logging.i(AudioRoutingController.TAG, "set routing freeze " + info);
                AudioRoutingController audioRoutingController5 = AudioRoutingController.this;
                if (info != 0) {
                    audioRoutingController5.mIsFreezed = true;
                    return;
                } else {
                    audioRoutingController5.mIsFreezed = false;
                    AudioRoutingController.this.resetAudioRouting();
                    return;
                }
            }
            switch (event) {
                case 1:
                    if (info >= 0) {
                        AudioRoutingController.this.mHeadsetType = info;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = true;
                    } else if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
                        AudioRoutingController.this.mHeadsetType = info;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = false;
                    }
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (AudioRoutingController.this.mIsWiredHeadsetPlugged && AudioRoutingController.this.mCurrentRouting != info) {
                            AudioRoutingController.this.doSetAudioOutputRouting(info);
                            break;
                        } else {
                            AudioRoutingController.this.resetAudioRouting();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (info != 0 || AudioRoutingController.this.mIsBTHeadsetPlugged) {
                        AudioRoutingController audioRoutingController6 = AudioRoutingController.this;
                        if (!audioRoutingController6.mAudioDeviceInventory.isDeviceAvaliable(5) && info != 1) {
                            r7 = false;
                        }
                        audioRoutingController6.mIsBTHeadsetPlugged = r7;
                        Logging.i(AudioRoutingController.TAG, "Process BT event, final state: " + AudioRoutingController.this.mIsBTHeadsetPlugged + Separators.LPAREN + info + Separators.RPAREN);
                        if (!AudioRoutingController.this.mPhoneInCall) {
                            if (!AudioRoutingController.this.mIsBTHeadsetPlugged) {
                                AudioRoutingController.this.resetAudioRouting();
                                break;
                            } else {
                                AudioRoutingController.this.doSetAudioOutputRouting(5);
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (AudioRoutingController.mockBlueToothEnable && audioManager != null) {
                        audioManager.setBluetoothScoOn(false);
                    }
                    AudioRoutingController.this.mBtScoState = info == 1 ? 1 : 2;
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (info != 1) {
                            if (info == 0 && AudioRoutingController.this.mCurrentRouting == 5) {
                                Logging.w(AudioRoutingController.TAG, "Sco disconnect when using Bluetooth device, use a2dp: " + AudioRoutingController.this.mForceUseA2dp);
                                if (AudioRoutingController.this.mForceUseA2dp != 1 && audioManager != null) {
                                    int mode = audioManager.getMode();
                                    if (mode != 1 && mode != 2) {
                                        if (mode == 3) {
                                            Logging.w(AudioRoutingController.TAG, "Sco try reconnect");
                                            audioManager.stopBluetoothSco();
                                            AudioRoutingController.this.doStartBTSco(audioManager);
                                            AudioRoutingController.this.startTimer();
                                            break;
                                        }
                                    } else {
                                        AudioRoutingController.this.startScoPhonestateMonitorTimer();
                                        break;
                                    }
                                }
                            }
                        } else {
                            AudioRoutingController.this.mScoConnectionAttemps = 0;
                            break;
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (info != 6 && info != 7) {
                        AudioRoutingController.this.resetAudioRouting();
                        break;
                    } else {
                        AudioRoutingController.this.doSetAudioOutputRouting(info);
                        break;
                    }
                default:
                    super.onEvent(event, info);
                    break;
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            resetImpl();
            StringBuilder sb = new StringBuilder("Monitor reset: default routing: ");
            AudioRoutingController audioRoutingController = AudioRoutingController.this;
            StringBuilder append = sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting)).append(", current routing: ");
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            Logging.i(AudioRoutingController.TAG, append.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mCurrentRouting)).toString());
        }
    }

    private interface ControllerState {
        int getState();

        void onEvent(int event, int info);

        void reset();

        void setState(int state);
    }

    private class ControllerStopState extends ControllerBaseState {
        public ControllerStopState() {
            super();
            Logging.i(AudioRoutingController.TAG, "ControllerStopState ctor");
            AudioRoutingController.this.mIsBTScoStarted = false;
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        private void resetImpl() {
            AudioRoutingController.this.cancelTimer();
            AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            if (AudioRoutingController.this.mIsBTScoStarted || (audioManager != null && audioManager.isBluetoothScoOn())) {
                AudioRoutingController.this.mIsBTScoStarted = false;
                AudioRoutingController.this.stopBtSco();
            }
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 2;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int evt, int info) {
            Logging.d(AudioRoutingController.TAG, "StopState: onEvent: " + AudioRoutingController.this.evtAsString(evt) + ", info: " + info);
            try {
                AudioManager audioManager = AudioRoutingController.this.getAudioManager();
                if (evt != 11) {
                    super.onEvent(evt, info);
                    return;
                }
                audioManager.setSpeakerphoneOn(info == 1);
                AudioRoutingController.this.mCurrentRouting = info == 1 ? 3 : -1;
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.queryCurrentAudioRouting());
            } catch (Exception e) {
                Logging.e(AudioRoutingController.TAG, "onEvent: Exception ", e);
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            Logging.i(AudioRoutingController.TAG, "Monitor stop state, reset");
            resetImpl();
        }
    }

    private class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (AudioRoutingController.this.mState != null) {
                AudioRoutingController.this.mState.onEvent(msg.what, msg.arg1);
            }
        }
    }

    public interface MockedBroadcaseter {
        void registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

        void unRegisterReceiver(BroadcastReceiver receiver);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ROUTE_TYPE_TO_EVT = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 4);
        sparseIntArray.put(7, 6);
    }

    public AudioRoutingController(Context context, long handle) {
        this.mContext = new WeakReference<>(context);
        this.mNativeHandle = handle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothTimeout() {
        AudioManager audioManager = getAudioManager();
        boolean isBluetoothScoOn = audioManager != null ? audioManager.isBluetoothScoOn() : false;
        if (this.mScoConnectionAttemps >= 2) {
            Logging.e(TAG, "Start bluetooth sco timeout, actual routing: " + queryCurrentAudioRouting());
            cancelTimer();
            nativeAudioRoutingError(1030);
            checkFallbackA2dpIfNeed();
            return;
        }
        Logging.i(TAG, "Attemps trying, bt sco started: " + this.mIsBTScoStarted + " sco connected: " + isBluetoothScoOn + " " + this.mScoConnectionAttemps + " times " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "]");
        if (isBluetoothScoOn) {
            Logging.d(TAG, "Sco connected success.");
            cancelTimer();
            return;
        }
        startTimer();
        this.mScoConnectionAttemps++;
        stopBtSco();
        audioManager.stopBluetoothSco();
        doStartBTSco(audioManager);
    }

    private String btStateAsString(int state) {
        return state != 0 ? state != 1 ? state != 2 ? state != 3 ? "Unknown " + state : "SCO_DISCONNECTED" : "SCO_DISCONNECTING" : "SCO_CONNECTED" : "SCO_CONNECTING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScoPhonestateMonitorTimer() {
        Logging.d(TAG, "cancel sco monitor timer");
        this.mEventHandler.removeCallbacks(this.scoMonitorInPhoneCallRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        this.mScoConnectionAttemps = 0;
        Logging.d(TAG, "cancel bluetooth timer");
        this.mEventHandler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ControllerState changeState(int state) {
        if (state == 2) {
            ControllerStopState controllerStopState = this.mStopState;
            if (controllerStopState == null) {
                this.mStopState = new ControllerStopState();
            } else {
                controllerStopState.reset();
            }
            return this.mStopState;
        }
        if (state == 1) {
            ControllerStartState controllerStartState = this.mStartState;
            if (controllerStartState == null) {
                this.mStartState = new ControllerStartState();
            } else {
                controllerStartState.reset();
            }
            return this.mStartState;
        }
        ControllerErrorState controllerErrorState = this.mErrorState;
        if (controllerErrorState == null) {
            this.mErrorState = new ControllerErrorState();
        } else {
            controllerErrorState.reset();
        }
        return this.mErrorState;
    }

    private void checkFallbackA2dpIfNeed() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && this.mIsBTHeadsetPlugged && audioManager.isBluetoothA2dpOn()) {
            nativeAudioRoutingCallbackEvent(4);
            return;
        }
        Logging.i(TAG, "could not use a2dp also..");
        this.mIsBTHeadsetPlugged = false;
        resetAudioRouting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doSetAudioOutputRouting(int routing) {
        Logging.i(TAG, "Set audio output routing from " + getAudioRouteDesc(this.mCurrentRouting) + " to " + getAudioRouteDesc(routing));
        if (this.mIsFreezed) {
            Logging.i(TAG, "Ignore set routing for freezed");
            return 0;
        }
        try {
            AudioManager audioManager = getAudioManager();
            boolean z = true;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(routing == 3);
            }
            if (queryCurrentAudioRouting() != routing) {
                int queryCurrentAudioRouting = queryCurrentAudioRouting();
                Logging.i(TAG, "Different audio routing from target " + routing + ", actual routing: " + queryCurrentAudioRouting + "[" + getAudioRouteDesc(queryCurrentAudioRouting) + "]");
                if (((routing == 3 && queryCurrentAudioRouting != 3) || (routing == 1 && queryCurrentAudioRouting != 1)) && audioManager != null && audioManager.getMode() == 3) {
                    Logging.d(TAG, "In communication mode try recover routing! ");
                    audioManager.setMode(0);
                    audioManager.setMode(3);
                    Logging.i(TAG, "Recover mode to : " + audioManager.getMode());
                    if (routing != 3) {
                        z = false;
                    }
                    audioManager.setSpeakerphoneOn(z);
                    Logging.i(TAG, "Final speaker is on : " + audioManager.isSpeakerphoneOn());
                }
            }
            updateBluetoothSco(routing);
        } catch (Exception e) {
            Logging.e(TAG, "Set audio output routing failed:", e);
        }
        if (routing == this.mCurrentRouting) {
            Logging.i(TAG, "Audio routing not changed, ignore: " + routing);
            return 0;
        }
        this.mCurrentRouting = routing;
        notifyAudioRoutingChanged(routing);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartBTSco(AudioManager am) {
        try {
            int mode = am.getMode();
            Logging.i(TAG, "doStartBTSco " + Build.VERSION.SDK_INT + " sco on: " + am.isBluetoothScoOn() + " " + mode + "[" + modeAsString(mode) + "]");
            if (am.isBluetoothScoOn()) {
                am.stopBluetoothSco();
                Thread.sleep(600L);
                Logging.i(TAG, "doStartBTSco in sco already on, try stop old connect firstly!");
            }
            am.startBluetoothSco();
        } catch (Exception e) {
            Logging.e(TAG, "doStartBTSco fail ", e);
        }
    }

    private void doStopBTSco(AudioManager am) {
        Logging.i(TAG, "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + am.isBluetoothScoOn());
        try {
            am.stopBluetoothSco();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String evtAsString(int evt) {
        return evt != 1 ? evt != 2 ? evt != 3 ? evt != 4 ? evt != 10 ? evt != 11 ? evt != 16 ? evt != 20 ? evt != 22 ? evt != 26 ? "evt " + evt : "CMD_SET_ROUTING_FREEZE" : "EVT_PHONE_STATE_CHANGED" : "EVT_CHANNEL_PROFILE" : "CMD_FORCE_TO_A2DP" : "CMD_FORCE_TO_SPEAKER" : "CMD_SET_DEFAULT_ROUTING" : "EVT_USB" : "EVT_BT_SCO" : "EVT_BT_HEADSET" : "EVT_HEADSET";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            return audioManager;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAudioRouteDesc(int route) {
        switch (route) {
            case -1:
                return Profile.DEFAULT_PROFILE_NAME;
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            case 6:
                return "USBDevice";
            case 7:
            default:
                return "Unknown";
            case 8:
                return "USB_HEADSET";
        }
    }

    private int getOutputDevicesByStream(int stream) {
        try {
            return ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(getAudioManager(), Integer.valueOf(stream))).intValue();
        } catch (Exception e) {
            Logging.e(TAG, "Error while getDevicesForStream! ", e);
            return 0;
        }
    }

    private int getSdkDeviceByAndroidType(int devices) {
        if (devices == 2) {
            return 3;
        }
        if (devices == 4) {
            return 0;
        }
        if (devices == 8) {
            return 2;
        }
        if (devices == 128 || devices == 256 || devices == 512) {
            return 5;
        }
        if (devices != 1024) {
            return (devices == 16384 || devices == 67108864 || (devices & 8388608) != 0) ? 6 : 3;
        }
        return 7;
    }

    private String modeAsString(int mode) {
        return mode != 0 ? mode != 1 ? mode != 2 ? mode != 3 ? "Unknown " + mode : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAudioDeviceStateChanged(String devId, String devName, int devType, int devState);

    private native void nativeAudioRoutingCallbackEvent(int cbEvt);

    private native void nativeAudioRoutingChanged(int routing);

    private native void nativeAudioRoutingError(int errCode);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioRoutingChanged(final int routing) {
        Logging.i(TAG, "Enter notifyAudioRoutingChanged: " + routing + ", force a2dp: " + this.mForceUseA2dp);
        if (this.mDisposed) {
            Logging.w(TAG, "notifyAudioRoutingChanged returned cause of disposed");
            return;
        }
        if (routing == 5 && this.mForceUseA2dp == 1 && mockedBroadcaster == null) {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null && !audioManager.isBluetoothA2dpOn()) {
                Logging.w(TAG, "callback A2DP but its not stable yet");
            }
            routing = 10;
        }
        nativeAudioRoutingChanged(routing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioRouting() {
        boolean z = this.mIsBTHeadsetPlugged;
        int i = 5;
        if (z && this.mIsWiredHeadsetPlugged) {
            AudioManager audioManager = getAudioManager();
            int outputDevicesByStream = getOutputDevicesByStream((audioManager == null ? 0 : audioManager.getMode()) == 0 ? 3 : 0);
            int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(outputDevicesByStream);
            Logging.i(TAG, "In multidevice connect, query target: " + sdkDeviceByAndroidType + ", " + outputDevicesByStream);
            if (sdkDeviceByAndroidType == 5 || sdkDeviceByAndroidType == this.mHeadsetType) {
                i = sdkDeviceByAndroidType;
            }
        } else if (!z) {
            if (this.mIsWiredHeadsetPlugged) {
                i = this.mHeadsetType;
            } else {
                i = this.mForcedRouting;
                if (i == -1) {
                    i = this.mDefaultRouting;
                }
            }
        }
        Logging.i(TAG, "Reset audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (this.mCurrentRouting == i && queryCurrentAudioRouting() == this.mCurrentRouting) {
            return;
        }
        doSetAudioOutputRouting(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scoMonitorTimeout() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || this.mCurrentRouting != 5 || this.mForceUseA2dp == 1) {
            return;
        }
        int mode = audioManager.getMode();
        if (mode == 1 || mode == 2) {
            startScoPhonestateMonitorTimer();
            return;
        }
        Logging.d(TAG, "detect phone state exit, mode=" + mode + ", mForceUseA2dp=" + this.mForceUseA2dp);
        if (mode == 3) {
            audioManager.stopBluetoothSco();
            startTimer();
            startBtSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void selectRoutingForCommunication(int r5) {
        /*
            r4 = this;
            android.media.AudioManager r0 = r4.getAudioManager()
            if (r0 == 0) goto L55
            int r1 = r0.getMode()
            r2 = 3
            if (r1 == r2) goto Le
            goto L55
        Le:
            r1 = 1
            if (r5 != r1) goto L18
            boolean r0 = r0.isWiredHeadsetOn()
            if (r0 == 0) goto L18
            goto L55
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Api select prefer communication route: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "AudioRoute"
            io.agora.utils2.internal.Logging.i(r3, r0)
            r0 = -1
            if (r5 == 0) goto L42
            if (r5 == r1) goto L50
            r1 = 2
            if (r5 == r1) goto L42
            if (r5 == r2) goto L50
            r1 = 5
            if (r5 == r1) goto L42
            r1 = 6
            if (r5 == r1) goto L42
            r1 = 8
            if (r5 == r1) goto L42
            r5 = r0
            goto L50
        L42:
            io.agora.rtc2.internal.AudioRoutingController$AudioDeviceInventory r1 = r4.mAudioDeviceInventory
            boolean r1 = r1.isDeviceAvaliable(r5)
            if (r1 != 0) goto L50
            java.lang.String r5 = "Selected route is not connected"
            io.agora.utils2.internal.Logging.w(r3, r5)
            return
        L50:
            if (r5 == r0) goto L55
            r4.doSetAudioOutputRouting(r5)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc2.internal.AudioRoutingController.selectRoutingForCommunication(int):void");
    }

    public static void setAudioDeviceChangedSpecialMonitor(AudioDeviceChangedSpecialMonitor specialMonitor) {
        Logging.i(TAG, "setAudioDeviceChangedSpecialMonitor");
        deviceSpecialMonitor = specialMonitor;
    }

    public static void setMockBlueToothEnable(boolean mockBlueToothEnable2) {
        mockBlueToothEnable = mockBlueToothEnable2;
    }

    public static void setMockedAudioManager(AudioManager mockedAudioManager2) {
        mockedAudioManager = mockedAudioManager2;
    }

    public static void setMockedBroadcaster(MockedBroadcaseter mockedBroadcaster2) {
        mockedBroadcaster = mockedBroadcaster2;
        AudioDeviceInventoryMocker.setMockedBroadcaster(mockedBroadcaster2);
    }

    private void setupHotPlugDeviceInitValue() {
        int i = this.mIsBTHeadsetPlugged ? 5 : this.mIsWiredHeadsetPlugged ? this.mHeadsetType : this.mAudioDeviceInventory.isDeviceAvaliable(6) ? 6 : -1;
        if (i != -1) {
            notifyAudioRoutingChanged(i);
        }
    }

    private void startBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.i(TAG, "Start opening bt sco " + this.mScoConnectionAttemps + " " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = 0;
            doStartBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScoPhonestateMonitorTimer() {
        Logging.d(TAG, "start sco monitor timer for phone state");
        this.mEventHandler.postDelayed(this.scoMonitorInPhoneCallRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        this.dynamic_timeout += this.mScoConnectionAttemps * 3000;
        Logging.w(TAG, "start bluetooth timer " + this.dynamic_timeout);
        this.mEventHandler.postDelayed(this.bluetoothTimeoutRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBtSco() {
        if (this.mIsFreezed) {
            Logging.i(TAG, "stop sco ignored for freezed");
            return;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.i(TAG, "try to stopping bt sco " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = !audioManager.isBluetoothScoOn() ? 3 : 2;
            doStopBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r5.mIsBTScoStarted != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateBluetoothSco(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.mPhoneInCall
            r1 = 0
            java.lang.String r2 = "AudioRoute"
            if (r0 == 0) goto Ld
            java.lang.String r6 = "Not process updateBluetoothSco in call"
            io.agora.utils2.internal.Logging.d(r2, r6)
            return r1
        Ld:
            boolean r0 = r5.mIsFreezed
            if (r0 == 0) goto L17
            java.lang.String r6 = "update bluetoosh sco ignore for freezed"
            io.agora.utils2.internal.Logging.i(r2, r6)
            return r1
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Update sco control, current sco : "
            r0.<init>(r3)
            boolean r3 = r5.mIsBTScoStarted
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = ", audio route target: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r4 = r5.getAudioRouteDesc(r6)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = "] current: "
            java.lang.StringBuilder r0 = r0.append(r4)
            int r4 = r5.mCurrentRouting
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r3)
            int r3 = r5.mCurrentRouting
            java.lang.String r3 = r5.getAudioRouteDesc(r3)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            io.agora.utils2.internal.Logging.d(r2, r0)
            r0 = 5
            if (r6 != r0) goto L83
            int r6 = r5.mForceUseA2dp
            r0 = 1
            if (r6 == r0) goto L79
            java.lang.String r6 = "Enable hfp"
            io.agora.utils2.internal.Logging.i(r2, r6)
            r5.mIsBTScoStarted = r0
            r5.startTimer()
            r5.startBtSco()
            goto L93
        L79:
            boolean r6 = r5.mIsBTScoStarted
            if (r6 == 0) goto L93
            java.lang.String r6 = "Enable a2dp"
            io.agora.utils2.internal.Logging.i(r2, r6)
            goto L8b
        L83:
            int r6 = r5.mCurrentRouting
            if (r6 != r0) goto L93
            boolean r6 = r5.mIsBTScoStarted
            if (r6 == 0) goto L93
        L8b:
            r5.mIsBTScoStarted = r1
            r5.cancelTimer()
            r5.stopBtSco()
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc2.internal.AudioRoutingController.updateBluetoothSco(int):int");
    }

    public boolean checkVersion(int version) {
        int i = this.mVersionInUsed;
        boolean z = true;
        if ((i == 0 && version == 1) || (i == 1 && version == 0)) {
            this.mVersionInUsed = version;
        } else {
            z = false;
        }
        if (z) {
            dispose();
            initialize();
        }
        return z;
    }

    public void dispose() {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        this.mNativeHandle = 0L;
        AudioDeviceInventory audioDeviceInventory = this.mAudioDeviceInventory;
        if (audioDeviceInventory != null) {
            audioDeviceInventory.dispose();
        }
        try {
            AudioManagerScoStateReceiver audioManagerScoStateReceiver = this.mScoStateReceiver;
            if (audioManagerScoStateReceiver != null && audioManagerScoStateReceiver.getRegistered()) {
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.unRegisterReceiver(this.mScoStateReceiver);
                }
                Context context = this.mContext.get();
                if (context != null) {
                    context.unregisterReceiver(this.mScoStateReceiver);
                }
                this.mScoStateReceiver.setRegistered(false);
            }
            this.mEventHandler.getLooper().quit();
        } catch (Exception e) {
            Logging.e(TAG, "AudioRoutingController dispose fail: ", e);
        }
        Logging.d(TAG, "dispose");
    }

    public String getCurrentUsbAudioDevicePID(int mic_or_spk) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String GetUSBDevicePID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDevicePID(mic_or_spk) : null;
        Logging.d(TAG, String.format("getPIDFromNative: mic_or_spk=%d, pid=%s", Integer.valueOf(mic_or_spk), GetUSBDevicePID == null ? AbstractJsonLexerKt.NULL : GetUSBDevicePID));
        return GetUSBDevicePID;
    }

    public String getCurrentUsbAudioDeviceVID(int mic_or_spk) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String GetUSBDeviceVID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDeviceVID(mic_or_spk) : null;
        Logging.d(TAG, String.format("getVIDFromNative: mic_or_spk=%d, vid=%s", Integer.valueOf(mic_or_spk), GetUSBDeviceVID == null ? AbstractJsonLexerKt.NULL : GetUSBDeviceVID));
        return GetUSBDeviceVID;
    }

    public long getNativeHandle() {
        this.mThreadChecker.checkIsOnValidThread();
        return this.mNativeHandle;
    }

    public int handleBluetoothHeadsetEvent(int info) {
        boolean z = info == 1;
        this.mIsBTHeadsetPlugged = z;
        if (z) {
            return 5;
        }
        return queryCurrentAudioRouting();
    }

    public int handleHeadsetEvent(int info) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isWiredHeadsetOn() && this.mIsWiredHeadsetPlugged && info < 0) {
            Logging.i(TAG, "not handle extra headset event, as headset still connect");
            return -1;
        }
        this.mHeadsetType = info;
        boolean z = info >= 0;
        this.mIsWiredHeadsetPlugged = z;
        return z ? info : queryCurrentAudioRouting();
    }

    public int initialize() {
        String str;
        Logging.i(TAG, "AudioRoutingController initialize+ (Android: " + Build.VERSION.SDK_INT + Separators.RPAREN);
        Context context = this.mContext.get();
        if (context == null) {
            str = "context has been GCed";
        } else {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                ControllerAudioDeviceChangeCallback controllerAudioDeviceChangeCallback = new ControllerAudioDeviceChangeCallback();
                this.ctrlAudioDeviceCb = controllerAudioDeviceChangeCallback;
                WebRtcAudioRecord.setRecordRouteCallback(controllerAudioDeviceChangeCallback);
                WebRtcAudioTrack.setTrackRouteCallback(this.ctrlAudioDeviceCb);
                HandlerThread handlerThread = new HandlerThread(TAG);
                handlerThread.start();
                this.mEventHandler = new EventHandler(handlerThread.getLooper());
                this.mAudioDeviceInventory = mockedBroadcaster != null ? new AudioDeviceInventoryMocker() : this.mVersionInUsed == 1 ? new AudioDeviceInventoryMorHigher(context) : new AudioDeviceInventoryLowerThanM(context);
                this.mAudioDeviceInventory.setAudioDeviceChangeCallback(new AudioDeviceChangedCallbackImpl());
                this.mAudioDeviceInventory.initialize();
                if (this.mAudioDeviceInventory.isDeviceAvaliable(0)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 0;
                } else if (this.mAudioDeviceInventory.isDeviceAvaliable(2)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 2;
                }
                this.mIsBTHeadsetPlugged = this.mAudioDeviceInventory.isDeviceAvaliable(5);
                this.mBtScoState = audioManager.isBluetoothScoOn() ? 1 : 3;
                Logging.i(TAG, "Headset state: " + this.mIsWiredHeadsetPlugged + "(type:" + this.mHeadsetType + "), BT state:" + this.mIsBTHeadsetPlugged + "(sco: " + (this.mBtScoState == 1 ? " enable " : " disable") + Separators.RPAREN);
                this.mScoStateReceiver = new AudioManagerScoStateReceiver();
                IntentFilter intentFilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                context.registerReceiver(this.mScoStateReceiver, intentFilter);
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.registerReceiver(this.mScoStateReceiver, intentFilter);
                }
                this.mScoStateReceiver.setRegistered(true);
                this.mDisposed = false;
                this.mState = changeState(2);
                setupHotPlugDeviceInitValue();
                Logging.i(TAG, "AudioRoutingController initialize-");
                return 0;
            }
            str = "invalid context: can't get AudioManager";
        }
        Logging.e(TAG, str);
        return -1;
    }

    public int queryCurrentAudioRouting() {
        int i;
        AudioManager audioManager = getAudioManager();
        try {
            int i2 = 3;
            if (audioManager.isSpeakerphoneOn()) {
                return 3;
            }
            if (!audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn()) {
                if (audioManager.isWiredHeadsetOn()) {
                    return 0;
                }
                if (audioManager.getMode() == 0) {
                    i = 3;
                } else {
                    i = 1;
                    i2 = 0;
                }
                int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(getOutputDevicesByStream(i2));
                return (sdkDeviceByAndroidType == 7 || sdkDeviceByAndroidType == 6) ? sdkDeviceByAndroidType : i;
            }
            return 5;
        } catch (Exception e) {
            Logging.e(TAG, "fatal error @queryCurrentAudioRouting", e);
            return -1;
        }
    }

    public void sendEvent(int event, int arg) {
        Logging.d(TAG, "sendEvent: [" + event + "], extra arg: " + arg + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(event, arg, 0));
        }
    }

    public int startMonitoring() {
        Logging.d(TAG, "startMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.3
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(1);
                }
            }
        });
        if (this.mIsBTHeadsetPlugged) {
            return 5;
        }
        if (this.mIsWiredHeadsetPlugged) {
            return this.mHeadsetType;
        }
        if (this.mAudioDeviceInventory.isDeviceAvaliable(6)) {
            return 6;
        }
        return this.mDefaultRouting;
    }

    public void stopMonitoring() {
        Logging.d(TAG, "stopMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.4
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(2);
                }
            }
        });
    }
}
