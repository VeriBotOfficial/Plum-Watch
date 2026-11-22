package com.sifli.siflidfu;

import android.app.IntentService;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.autonavi.aps.amapapi.config.Const;
import com.hjq.permissions.Permission;
import com.iflytek.cloud.SpeechConstant;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes15.dex */
public class SifliDFUService extends IntentService {
    private static final String ACTION_NAND = "com.sifli.siflidfu.action.NAND";
    private static final String ACTION_NOR_V1 = "com.sifli.siflidfu.action.NOR_V1";
    private static final String ACTION_NOR_V2 = "com.sifli.siflidfu.action.NOR_V2";
    public static final String BROADCAST_DFU_LOG = "com.sifli.siflidfu.BROADCAST_DFU_LOG";
    public static final String BROADCAST_DFU_PROGRESS = "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS";
    public static final String BROADCAST_DFU_STATE = "com.sifli.siflidfu.BROADCAST_DFU_STATE";
    private static final String EXTRA_ADDRESS = "com.sifli.siflidfu.extra.ADDRESS";
    private static final String EXTRA_BLE_DATA = "com.sifli.siflidfu.extra.BLE_DATA";
    public static final String EXTRA_DFU_PROGRESS = "com.sifli.siflidfu.EXTRA_DFU_PROGRESS";
    public static final String EXTRA_DFU_PROGRESS_TYPE = "com.sifli.siflidfu.EXTRA_DFU_PROGRESS_TYPE";
    public static final String EXTRA_DFU_STATE = "com.sifli.siflidfu.EXTRA_DFU_STATE";
    public static final String EXTRA_DFU_STATE_RESULT = "com.sifli.siflidfu.EXTRA_DFU_STATE_RESULT";
    private static final String EXTRA_IMAGES = "com.sifli.siflidfu.extra.IMAGES";
    public static final String EXTRA_LOG_LEVEL = "com.sifli.siflidfu.LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "com.sifli.siflidfu.EXTRA_LOG_MESSAGE";
    private static final String EXTRA_NUM_OF_RSP = "com.sifli.siflidfu.extra.PARAM2";
    private static final String EXTRA_RESUME_MODE = "com.sifli.siflidfu.extra.PARAM1";
    private static final String TAG = "sifli-DFU";
    private static final Boolean progressDebug = false;
    private final int MAX_RETRY_CONNECT_COUNT;
    private String VersionStr;
    int countAll;
    int countCurrent;
    int countPrevious;
    private boolean isReleased;
    private BroadcastReceiver mBleBroadcastReceiver;
    private Handler mBleHandler;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    private final Runnable mConnectTimerRunnable;
    private int mConnectionState;
    private int mConnectionStatus;
    private int mCurrentRetryCount;
    DFUState mDFUState;
    private final Runnable mDfuCommandTimerRunnable;
    private final Runnable mDiscoveryTimerRunnable;
    private int mError;
    private int mFsBlock;
    private BluetoothGattCallback mGattCallback;
    private int mImageSkipInfo;
    private boolean mIsDescriptorWrite;
    private boolean mIsRemoteBoot;
    private int mLastCateID;
    private final int mLoadFileMode;
    private final Object mLock;
    private long mLoseCheckTime;
    private int mMaxPacketLen;
    int mProgressType;
    private int mRemoteBoot;
    private int mRemoteCurrentIndex;
    private int mRemoteImageID;
    private int mRemoteResume;
    private int mRemoteResumeCount;
    private int mRemoteResumeNumOfRsp;
    private int mRemoteResumeRestart;
    private int mRemoteVersion;
    private int mRspFreq;
    private boolean mRspReceive;
    private boolean mSendAvailable;
    private Handler mTimerHandler;
    private int mWaitEndMode;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private final Runnable mWriteDescriptorTimerRunnable;
    private boolean misAlreadyConnect;
    byte[] receiveData;
    int receiveDataCurrentLen;
    int receiveDataLen;

    public SifliDFUService() {
        super("SifliDFUIntentService");
        this.VersionStr = " 1.1.17";
        this.mMaxPacketLen = 20;
        this.mRemoteBoot = 0;
        this.mLoadFileMode = 1;
        this.MAX_RETRY_CONNECT_COUNT = 2;
        this.mLock = new Object();
        this.mTimerHandler = new Handler();
        this.isReleased = false;
        this.mRemoteVersion = 0;
        this.mConnectTimerRunnable = new Runnable() { // from class: com.sifli.siflidfu.SifliDFUService.2
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliDFUService.TAG, "connect call timeout, system bt may error");
                SifliDFUService.this.mError = 62;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notify();
                }
            }
        };
        this.mWriteDescriptorTimerRunnable = new Runnable() { // from class: com.sifli.siflidfu.SifliDFUService.3
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliDFUService.TAG, "write descriptor timeout");
                SifliDFUService.this.mError = 68;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
        this.mDfuCommandTimerRunnable = new Runnable() { // from class: com.sifli.siflidfu.SifliDFUService.4
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliDFUService.TAG, "ota command timeout");
                SifliDFUService.this.mError = 79;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
        this.mDiscoveryTimerRunnable = new Runnable() { // from class: com.sifli.siflidfu.SifliDFUService.5
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliDFUService.TAG, "discovery timeout");
                SifliDFUService.this.sendLogBroadcast(5, "discovery timeout");
                SifliDFUService.this.mError = 67;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    public static void startActionDFUNor(Context context, String str, ArrayList<DFUImagePath> arrayList, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
        intent.setAction(ACTION_NOR_V1);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_IMAGES, arrayList);
        intent.putExtra(EXTRA_RESUME_MODE, i);
        intent.putExtra(EXTRA_NUM_OF_RSP, i2);
        context.startService(intent);
    }

    public static void startActionDFUNorExt(Context context, String str, ArrayList<DFUImagePath> arrayList, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
        intent.setAction(ACTION_NOR_V2);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_IMAGES, arrayList);
        intent.putExtra(EXTRA_RESUME_MODE, i);
        intent.putExtra(EXTRA_NUM_OF_RSP, i2);
        context.startService(intent);
    }

    public static void startActionDFUNand(Context context, String str, ArrayList<DFUImagePath> arrayList, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) SifliDFUService.class);
        intent.setAction(ACTION_NAND);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_IMAGES, arrayList);
        intent.putExtra(EXTRA_RESUME_MODE, i);
        intent.putExtra(EXTRA_NUM_OF_RSP, i2);
        context.startService(intent);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        Log.d(TAG, "onStart()");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "start with " + this.VersionStr);
        if (intent != null) {
            String action = intent.getAction();
            if (ACTION_NOR_V1.equals(action)) {
                int handleActionDFUNorV1 = handleActionDFUNorV1(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                try {
                    Thread.sleep(5000L);
                    Log.w(TAG, "nor ota end with " + handleActionDFUNorV1);
                    sendLogBroadcast(5, "DFU end with " + handleActionDFUNorV1);
                    sendDfuStateChangeBroadcast(100, handleActionDFUNorV1);
                    release();
                    return;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ACTION_NOR_V2.equals(action)) {
                int handleActionDFUNorV2 = handleActionDFUNorV2(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                try {
                    Thread.sleep(5000L);
                    Log.w(TAG, "end with " + handleActionDFUNorV2);
                    sendLogBroadcast(5, "DFU end with " + handleActionDFUNorV2);
                    sendDfuStateChangeBroadcast(100, handleActionDFUNorV2);
                    release();
                    return;
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            }
            if (ACTION_NAND.equals(action)) {
                int handleActionDFUNand = handleActionDFUNand(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_IMAGES), intent.getIntExtra(EXTRA_RESUME_MODE, 0), intent.getIntExtra(EXTRA_NUM_OF_RSP, 0));
                Log.w(TAG, "end with " + handleActionDFUNand);
                sendLogBroadcast(5, "DFU end with " + handleActionDFUNand);
                sendDfuStateChangeBroadcast(100, handleActionDFUNand);
                release();
            }
        }
    }

    private int handleActionDFUNorV1(String str, ArrayList<DFUImagePath> arrayList, int i, int i2) {
        Log.d(TAG, "handleActionDFUNorV1");
        int init = init();
        this.mRspFreq = i2;
        if (init != 0) {
            return init;
        }
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
        this.mBleHandler = handler;
        handler.removeCallbacksAndMessages(null);
        ArrayList<OTAFile> imageFile = FileProcess.getImageFile(arrayList, this, 1);
        String str2 = FileProcess.getmLogString();
        if (str2 != null) {
            sendLogBroadcast(5, str2);
        }
        if (imageFile == null) {
            return 60;
        }
        Collections.sort(imageFile, new OTAImageComparator());
        connectDevice(str, this.mGattCallback);
        if (this.mConnectionState != 3 || this.mError != 0) {
            return this.mError;
        }
        writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
        synchronized (this.mLock) {
            while (!this.mIsDescriptorWrite && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        int i3 = this.mError;
        if (i3 != 0) {
            return i3;
        }
        sendDfuImageInit(((OTAFile) Objects.requireNonNull(getImageByID(imageFile, -1))).getFileData(), i);
        int i4 = this.mError;
        if (i4 != 0) {
            return i4;
        }
        if (this.mRemoteBoot == 1) {
            this.mDFUState.setState(2);
        }
        if (i == 2) {
            sendDfuImageResumeComplete();
        } else {
            sendDfuImageInitComplete();
        }
        if (this.mRemoteBoot == 1) {
            Log.d(TAG, "wait reboot, mConnectionState " + this.mConnectionState);
            if (this.mConnectionState != 0) {
                synchronized (this.mLock) {
                    while (this.mConnectionState != 0) {
                        try {
                            this.mLock.wait();
                        } catch (InterruptedException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            this.mDFUState.setState(9);
            connectDevice(str, this.mGattCallback);
            if (this.mConnectionState != 3 || this.mError != 0) {
                return this.mError;
            }
            writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
            synchronized (this.mLock) {
                while (!this.mIsDescriptorWrite && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
            int i5 = this.mError;
            if (i5 != 0) {
                return i5;
            }
        }
        int i6 = i == 2 ? 1 : 0;
        this.mProgressType = 0;
        this.countAll = getAllFileLength(imageFile, 548);
        updateLink();
        int handleDFUImageSend = handleDFUImageSend(i6, imageFile, 548);
        Log.i(TAG, "send image end with " + handleDFUImageSend);
        if (handleDFUImageSend == 0) {
            Log.i(TAG, "wait end mode " + this.mWaitEndMode);
            int i7 = this.mWaitEndMode;
            if (i7 == 1) {
                sendDfuImageTransmissionEndWait();
            } else if (i7 == 0) {
                sendDfuImageTransmissionEnd();
            } else if (i7 == 2) {
                sendDfuImageTransmissionEndWait();
                sendDfuEndCommand(this.mError);
            }
            int i8 = this.mError;
            if (i8 != 0) {
                return i8;
            }
        }
        return handleDFUImageSend;
    }

    private int handleActionDFUNorV2(String str, ArrayList<DFUImagePath> arrayList, int i, int i2) {
        int i3;
        Log.d(TAG, "handleActionDFUNorV2");
        sendLogBroadcast(5, "OTA START");
        int init = init();
        this.mRspFreq = i2;
        if (init == 0) {
            HandlerThread handlerThread = new HandlerThread("BleWrite");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
            this.mBleHandler = handler;
            handler.removeCallbacksAndMessages(null);
            ArrayList<OTAFile> imageFile = FileProcess.getImageFile(arrayList, this, 1);
            String str2 = FileProcess.getmLogString();
            if (str2 != null) {
                sendLogBroadcast(5, str2);
            }
            if (imageFile == null) {
                return 60;
            }
            Collections.sort(imageFile, new OTAImageComparator());
            connectDevice(str, this.mGattCallback);
            if (this.mConnectionState != 3 || this.mError != 0) {
                return this.mError;
            }
            writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
            synchronized (this.mLock) {
                while (!this.mIsDescriptorWrite && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
            int i4 = this.mError;
            if (i4 != 0) {
                return i4;
            }
            sendDfuImageInitExt(((OTAFile) Objects.requireNonNull(getImageByID(imageFile, -1))).getFileData());
            int i5 = this.mError;
            if (i5 != 0) {
                return i5;
            }
            if (this.mRemoteBoot == 1) {
                this.mDFUState.setState(2);
            }
            Log.d(TAG, "sendDfuImageInitComplete resumeMode " + i + ", remote resume " + this.mRemoteResume);
            if (i != 1 || this.mRemoteResume == 0) {
                i3 = 0;
            } else {
                Log.i(TAG, "sendDfuImageInitComplete use resume");
                i3 = 1;
            }
            sendDfuImageInitCompleteExt(i3);
            if (i3 == 1) {
                i3 = this.mRemoteResume;
            }
            if (this.mRemoteBoot == 1) {
                Log.d(TAG, "wait reboot, mConnectionState " + this.mConnectionState);
                if (this.mConnectionState != 0) {
                    synchronized (this.mLock) {
                        while (this.mConnectionState != 0) {
                            try {
                                this.mLock.wait();
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
                this.mDFUState.setState(9);
                connectDevice(str, this.mGattCallback);
                if (this.mConnectionState != 3 || this.mError != 0) {
                    return this.mError;
                }
                writeCCCD(this.mBluetoothGatt, this.mWriteCharacteristic);
                synchronized (this.mLock) {
                    while (!this.mIsDescriptorWrite && this.mError == 0) {
                        try {
                            this.mLock.wait();
                        } catch (InterruptedException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
                int i6 = this.mError;
                if (i6 != 0) {
                    return i6;
                }
            }
            this.mProgressType = 0;
            this.countAll = getAllFileLength(imageFile, 548);
            updateLink();
            handleDFUImageSend(i3, imageFile, 548);
            int i7 = this.mError;
            if (i7 != 0) {
                return i7;
            }
            Log.i(TAG, "wait end mode " + this.mWaitEndMode);
            int i8 = this.mWaitEndMode;
            if (i8 == 1) {
                sendDfuImageTransmissionEndWait();
            } else if (i8 == 0) {
                sendDfuImageTransmissionEnd();
            } else if (i8 == 2) {
                sendDfuImageTransmissionEndWait();
                int i9 = this.mError;
                if (i9 == 0) {
                    sendDfuEndCommand(i9);
                    waitFor(5000L);
                }
            }
            int i10 = this.mError;
            if (i10 != 0) {
                return i10;
            }
        }
        return init;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleActionDFUNand(java.lang.String r15, java.util.ArrayList<com.sifli.siflidfu.DFUImagePath> r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflidfu.SifliDFUService.handleActionDFUNand(java.lang.String, java.util.ArrayList, int, int):int");
    }

    private int handleDFUImageSend(int i, ArrayList<OTAFile> arrayList, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        if (i == 1) {
            Log.d(TAG, "enable resume");
            i3 = this.mRemoteImageID;
            if (this.mRemoteResumeRestart == 1) {
                this.mRemoteResumeCount = 0;
            }
            this.mRspFreq = this.mRemoteResumeNumOfRsp;
            i4 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i11 = 2;
        if (i == 2) {
            Log.d(TAG, "resume query");
            i3 = this.mRemoteImageID;
            this.mRspFreq = this.mRemoteResumeNumOfRsp;
        }
        int i12 = i3;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            OTAFile oTAFile = arrayList.get(i13);
            this.countPrevious = getSendImageLength(arrayList, oTAFile.getImageID(), i2);
            this.countCurrent = i9;
            if (oTAFile.getImageID() != -1) {
                if (i == i11 && oTAFile.getImageID() == i12) {
                    Log.d(TAG, "resume psram image id " + i12 + ", " + this.mRemoteResumeCount);
                    i4 = i10;
                }
                if (i4 == 0) {
                    i5 = i9;
                } else if (oTAFile.getImageID() == i12) {
                    i5 = this.mRemoteResumeCount;
                    this.countCurrent = i5;
                    i4 = i9;
                }
                CurrentSendFile currentSendFile = new CurrentSendFile(oTAFile.getFileLength(), i2, oTAFile.getFileName());
                sendDfuImageStart(oTAFile.getFileLength(), currentSendFile.getTotalCount(), oTAFile.getImageID());
                int i14 = this.mError;
                if (i14 != 0) {
                    return i14;
                }
                if (this.mImageSkipInfo == i10) {
                    Log.i(TAG, "skip " + oTAFile.getImageID());
                } else {
                    int i15 = i5;
                    int i16 = i9;
                    while (i15 < currentSendFile.getTotalCount()) {
                        int i17 = i15 + 1;
                        if (i17 == currentSendFile.getTotalCount()) {
                            i8 = FileProcess.getFileSize(oTAFile.getFilePath()) - (i15 * i2);
                            i7 = i10;
                            Log.d(TAG, "last packet " + i8);
                        } else {
                            i7 = i10;
                            i8 = i2;
                        }
                        sendDfuImagePacket(oTAFile.getImageID(), i17, FileProcess.openFilePartly(this, oTAFile.getFilePath(), i15 * i2, i8));
                        if (currentSendFile.getTotalCount() == i17) {
                            i16 = i7;
                        }
                        if (this.mError != 0) {
                            i16 = i7;
                        }
                        int i18 = this.mRspFreq;
                        if (i18 != 0 && i17 % i18 == 0) {
                            i16 = i7;
                        }
                        if (i16 != 0) {
                            this.mRspReceive = false;
                            try {
                                synchronized (this.mLock) {
                                    while (!this.mRspReceive && this.mError == 0) {
                                        this.mLock.wait();
                                    }
                                }
                            } catch (InterruptedException unused) {
                                Log.e(TAG, "Sleeping interrupted");
                            }
                            int i19 = this.mError;
                            if (i19 != 0) {
                                if (i19 == 13) {
                                    int i20 = this.mRemoteCurrentIndex;
                                    i15 = i20 - 1;
                                    this.countCurrent = i20;
                                    Log.d(TAG, "continue with index " + i15);
                                    Log.d(TAG, "send lose rsp again");
                                    sendDfuLinkLoseResponse(0);
                                    waitFor(500L);
                                    this.mError = 0;
                                } else {
                                    Log.d(TAG, "download exit with " + this.mError);
                                    return this.mError;
                                }
                            }
                            i16 = 0;
                        }
                        i15++;
                        i10 = i7;
                    }
                    i6 = i10;
                    int i21 = this.mError;
                    if (i21 != 0) {
                        return i21;
                    }
                    sendDfuImageEnd(oTAFile.getImageID(), i13 + 1 != arrayList.size() ? i6 : 0);
                    i13++;
                    i10 = i6;
                    i9 = 0;
                    i11 = 2;
                }
            }
            i6 = i10;
            i13++;
            i10 = i6;
            i9 = 0;
            i11 = 2;
        }
        Log.d(TAG, "final progress " + (((this.countCurrent + this.countPrevious) * 100) / this.countAll) + " , always send");
        sendDFUProgressBroadcast(100, this.mProgressType);
        return 0;
    }

    private int handleDFUFileSend(int i, ArrayList<OTAFile> arrayList) {
        int i2;
        if (i == 1) {
            Log.d(TAG, "enable resume");
            i2 = this.mRemoteResumeCount;
        } else {
            i2 = 0;
        }
        while (i2 < arrayList.size()) {
            OTAFile oTAFile = arrayList.get(i2);
            CurrentSendFile currentSendFile = new CurrentSendFile(oTAFile.getFileData(), 10240, oTAFile.getFileName());
            sendDfuFileStart(oTAFile.getFilePath(), currentSendFile.getTotalSize(), currentSendFile.getTotalCount(), oTAFile.getFileIndex());
            this.countPrevious = getSendFileLength(arrayList, oTAFile.getFileIndex(), 10240);
            this.countCurrent = 0;
            int i3 = this.mError;
            if (i3 != 0) {
                return i3;
            }
            int i4 = 0;
            boolean z = false;
            while (i4 < currentSendFile.getTotalCount()) {
                int i5 = i4 + 1;
                sendDfuFilePacket(i5, currentSendFile.getData(i4));
                if (currentSendFile.getTotalCount() == i5) {
                    z = true;
                }
                int i6 = this.mRspFreq;
                if (i6 != 0 && i5 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    this.mRspReceive = false;
                    try {
                        synchronized (this.mLock) {
                            while (!this.mRspReceive && this.mError == 0) {
                                this.mLock.wait();
                            }
                        }
                    } catch (InterruptedException unused) {
                        Log.e(TAG, "Sleeping interrupted");
                    }
                    int i7 = this.mError;
                    if (i7 != 0) {
                        if (i7 == 13) {
                            int i8 = this.mRemoteCurrentIndex;
                            this.countCurrent = i8;
                            i4 = i8 - 1;
                        } else {
                            Log.d(TAG, "download exit with " + this.mError);
                            return this.mError;
                        }
                    }
                    z = false;
                }
                i4++;
            }
            int i9 = this.mError;
            if (i9 != 0) {
                return i9;
            }
            sendDfuFileEnd(oTAFile.getFileIndex());
            int i10 = this.mError;
            if (i10 != 0) {
                return i10;
            }
            i2++;
        }
        return 0;
    }

    private BluetoothGatt connect(BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = 1;
        Log.i(TAG, "connecting to " + bluetoothDevice);
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return null;
        }
        sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M|LE_2M)");
        BluetoothGatt connectGatt = bluetoothDevice.connectGatt(this, false, bluetoothGattCallback, 2, 3);
        this.mTimerHandler.postDelayed(this.mConnectTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (true) {
                    int i = this.mConnectionState;
                    if ((i == 1 || i == 2) && this.mError == 0) {
                        this.mLock.wait();
                    }
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mConnectTimerRunnable);
        if (this.mError == 62) {
            return null;
        }
        return connectGatt;
    }

    protected void close(BluetoothGatt bluetoothGatt) {
        Log.d(TAG, "Cleaning up...");
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        if (bluetoothGatt != null) {
            Log.d(TAG, "gatt.disconnect()");
            bluetoothGatt.disconnect();
            Log.d(TAG, "gatt.close()");
            bluetoothGatt.close();
        }
        this.mConnectionState = 5;
    }

    private void writeCCCD(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            this.mError = 68;
            Log.e(TAG, "desc null!!!");
            return;
        }
        this.mIsDescriptorWrite = false;
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        Log.d(TAG, "Write descriptor");
        this.mTimerHandler.postDelayed(this.mWriteDescriptorTimerRunnable, 30000L);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        android.util.Log.d(com.sifli.siflidfu.SifliDFUService.TAG, "retry success");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean connectDevice(java.lang.String r14, android.bluetooth.BluetoothGattCallback r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflidfu.SifliDFUService.connectDevice(java.lang.String, android.bluetooth.BluetoothGattCallback):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMtu(BluetoothGatt bluetoothGatt, int i) {
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission update mtu");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        bluetoothGatt.requestMtu(i);
    }

    protected void refreshDeviceCache(BluetoothGatt bluetoothGatt) {
        try {
            Log.i(TAG, "Refreshing result: " + ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue());
        } catch (Exception e) {
            Log.e(TAG, "An exception occurred while refreshing device", e);
            sendLogBroadcast(15, "Refreshing failed");
        }
    }

    private BluetoothGattCallback getEmptyGattCallback() {
        return new BluetoothGattCallback() { // from class: com.sifli.siflidfu.SifliDFUService.1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                super.onConnectionStateChange(bluetoothGatt, i, i2);
                Log.d(SifliDFUService.TAG, "onConnectionStateChange status " + i + ", new state " + i2);
                if (i2 == 2) {
                    if (!SifliDFUService.this.misAlreadyConnect) {
                        SifliDFUService.this.misAlreadyConnect = true;
                    } else {
                        Log.e(SifliDFUService.TAG, "return for repeat");
                        return;
                    }
                } else if (i2 == 0) {
                    SifliDFUService.this.misAlreadyConnect = false;
                }
                if (i2 == 2) {
                    if (SifliDFUService.this.mConnectionState == 3) {
                        Log.e(SifliDFUService.TAG, "state is ready!");
                        return;
                    }
                    if (SifliDFUService.this.mDFUState.getState() == 2 || SifliDFUService.this.mDFUState.getState() == 10) {
                        SifliDFUService.this.mDFUState.setState(3);
                    }
                    SifliDFUService.this.mConnectionState = 2;
                    SifliDFUService.this.waitFor(1000L);
                    SifliDFUService.this.updateMtu(bluetoothGatt, 247);
                    SifliDFUService.this.waitFor(1000L);
                    SifliDFUService.this.refreshDeviceCache(bluetoothGatt);
                    SifliDFUService.this.waitFor(2000L);
                    if (SifliDFUService.this.mError != 0) {
                        Log.d(SifliDFUService.TAG, "abort connect due to error");
                        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(SifliDFUService.this, Permission.BLUETOOTH_CONNECT) != 0) {
                            Log.e(SifliDFUService.TAG, "no Permission");
                            SifliDFUService.this.mError = 61;
                            synchronized (SifliDFUService.this.mLock) {
                                SifliDFUService.this.mLock.notifyAll();
                            }
                            return;
                        }
                        bluetoothGatt.close();
                        synchronized (SifliDFUService.this.mLock) {
                            SifliDFUService.this.mLock.notifyAll();
                        }
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(SifliDFUService.this, Permission.BLUETOOTH_CONNECT) != 0) {
                        Log.e(SifliDFUService.TAG, "no Permission");
                        SifliDFUService.this.mError = 61;
                        synchronized (SifliDFUService.this.mLock) {
                            SifliDFUService.this.mLock.notifyAll();
                        }
                        return;
                    }
                    boolean discoverServices = bluetoothGatt.discoverServices();
                    SifliDFUService.this.mTimerHandler.postDelayed(SifliDFUService.this.mDiscoveryTimerRunnable, 40000L);
                    Log.i(SifliDFUService.TAG, "Attempting to start service discovery:" + discoverServices);
                    if (discoverServices) {
                        return;
                    } else {
                        SifliDFUService.this.mError = 66;
                    }
                } else if (i2 == 0) {
                    Log.i(SifliDFUService.TAG, "disconnect with " + i);
                    SifliDFUService.this.sendLogBroadcast(5, "disconnect with " + i);
                    SifliDFUService.this.mConnectionStatus = i;
                    Log.i(SifliDFUService.TAG, "clear state");
                    SifliDFUService.this.mConnectionState = 0;
                    bluetoothGatt.close();
                    if (SifliDFUService.this.mDFUState.getState() == 2) {
                        Log.d(SifliDFUService.TAG, "disconnect remote reboot");
                    } else if (SifliDFUService.this.mDFUState.getState() != 9 && SifliDFUService.this.mDFUState.getState() != 10) {
                        SifliDFUService.this.mError = 70;
                    } else if (i != 133 && i != 62) {
                        SifliDFUService.this.mError = 70;
                    } else {
                        Log.w(SifliDFUService.TAG, "retry due to reboot connect 133");
                        SifliDFUService.this.mDFUState.setState(10);
                    }
                }
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
                super.onServicesDiscovered(bluetoothGatt, i);
                SifliDFUService.this.mTimerHandler.removeCallbacks(SifliDFUService.this.mDiscoveryTimerRunnable);
                int i2 = 0;
                if (i == 0) {
                    Log.d(SifliDFUService.TAG, "onServicesDiscovered");
                    int i3 = 0;
                    while (i2 < bluetoothGatt.getServices().size()) {
                        Iterator<BluetoothGattCharacteristic> it = bluetoothGatt.getServices().get(i2).getCharacteristics().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                BluetoothGattCharacteristic next = it.next();
                                Log.e(SifliDFUService.TAG, "find uuid: " + next.getUuid().toString() + ", expect: 00000000-0000-0200-6473-5f696c666973");
                                if (next.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                                    Log.i(SifliDFUService.TAG, "find serial trans UUID");
                                    SifliDFUService.this.mWriteCharacteristic = next;
                                    SifliDFUService.this.mConnectionState = 3;
                                    i3 = 1;
                                    break;
                                }
                            }
                        }
                        i2++;
                    }
                    i2 = i3;
                } else {
                    Log.w(SifliDFUService.TAG, "onServicesDiscovered received: " + i);
                    SifliDFUService.this.mError = 101;
                    SifliDFUService.this.mConnectionStatus = i;
                    SifliDFUService.this.mConnectionState = 4;
                    SifliDFUService sifliDFUService = SifliDFUService.this;
                    sifliDFUService.sendDfuStateChangeBroadcast(sifliDFUService.mError, i);
                }
                if (i2 == 0) {
                    Log.e(SifliDFUService.TAG, "fail to find target uuid");
                    SifliDFUService.this.sendLogBroadcast(20, "fail to find target uuid");
                    SifliDFUService.this.mError = 102;
                    SifliDFUService.this.mConnectionState = 4;
                    SifliDFUService sifliDFUService2 = SifliDFUService.this;
                    sifliDFUService2.sendDfuStateChangeBroadcast(sifliDFUService2.mError, i);
                }
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                if (bluetoothGattCharacteristic.getUuid().toString().equals(SifliDFUService.this.mWriteCharacteristic.getUuid().toString())) {
                    SifliDFUService.this.processNotify(bluetoothGattCharacteristic.getValue());
                    synchronized (SifliDFUService.this.mLock) {
                        SifliDFUService.this.mLock.notifyAll();
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
                SifliDFUService.this.mSendAvailable = true;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
                Log.d(SifliDFUService.TAG, "onMtuChanged " + i + ", status " + i2);
                if (i > 247) {
                    SifliDFUService.this.mMaxPacketLen = 244;
                } else if (i < 23) {
                    SifliDFUService.this.mMaxPacketLen = 20;
                } else {
                    SifliDFUService.this.mMaxPacketLen = i - 3;
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
                Log.i(SifliDFUService.TAG, "onDescriptorWrite");
                SifliDFUService.this.mIsDescriptorWrite = true;
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    private void updateLink() {
        Log.i(TAG, "update link");
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        this.mBluetoothGatt.requestConnectionPriority(1);
        waitFor(1000L);
        this.mBluetoothGatt.setPreferredPhy(2, 2, 0);
        waitFor(1000L);
    }

    private void sendToBleHandler(byte[] bArr, int i, boolean z) {
        Message message = new Message();
        message.what = i;
        Bundle bundle = new Bundle();
        bundle.putByteArray(EXTRA_BLE_DATA, bArr);
        message.setData(bundle);
        if (z) {
            this.mBleHandler.sendMessageAtFrontOfQueue(message);
        } else {
            this.mBleHandler.sendMessage(message);
        }
    }

    private void sendToSerialExt(byte[] bArr, int i, boolean z) {
        int length = bArr.length;
        int i2 = length + 4;
        if (i2 > 65535) {
            Log.e(TAG, "serial length over");
            return;
        }
        int i3 = this.mMaxPacketLen;
        if (i2 <= i3) {
            byte[] bArr2 = new byte[i2];
            bArr2[0] = 1;
            bArr2[1] = 0;
            Utils.addShortToByteArray(length, bArr2, 2);
            System.arraycopy(bArr, 0, bArr2, 4, length);
            sendToBleHandler(bArr2, i, z);
            return;
        }
        byte[] bArr3 = new byte[i3];
        bArr3[0] = 1;
        bArr3[1] = 1;
        Utils.addShortToByteArray(length, bArr3, 2);
        System.arraycopy(bArr, 0, bArr3, 4, this.mMaxPacketLen - 4);
        int i4 = this.mMaxPacketLen - 4;
        sendToBleHandler(bArr3, i, z);
        while (i4 < length) {
            int i5 = length - i4;
            int i6 = this.mMaxPacketLen;
            if (i5 > i6 - 2) {
                byte[] bArr4 = new byte[i6];
                bArr4[0] = 1;
                bArr4[1] = 2;
                System.arraycopy(bArr, i4, bArr4, 2, i6 - 2);
                i4 += this.mMaxPacketLen - 2;
                sendToBleHandler(bArr4, i, z);
            } else {
                byte[] bArr5 = new byte[i5 + 2];
                bArr5[0] = 1;
                bArr5[1] = 3;
                System.arraycopy(bArr, i4, bArr5, 2, i5);
                sendToBleHandler(bArr5, i, z);
                i4 = length;
            }
        }
    }

    private void sendToSerial(byte[] bArr, int i) {
        sendToSerialExt(bArr, i, false);
    }

    public static String byte2hex(byte[] bArr) {
        if (bArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            sb.append(" ");
        }
        return sb.toString();
    }

    private class bleHandlerCallback implements Handler.Callback {
        private bleHandlerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (SifliDFUService.this.mConnectionState == 0 || SifliDFUService.this.mError != 0) {
                Log.e(SifliDFUService.TAG, "handle exit " + SifliDFUService.this.mError);
                return false;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    byte b = message.getData().getByteArray(SifliDFUService.EXTRA_BLE_DATA)[1];
                    if (b == 0 || b == 1) {
                        SifliDFUService.this.countCurrent++;
                        int i2 = ((SifliDFUService.this.countCurrent + SifliDFUService.this.countPrevious) * 100) / SifliDFUService.this.countAll;
                        SifliDFUService sifliDFUService = SifliDFUService.this;
                        sifliDFUService.sendDFUProgressBroadcast(i2, sifliDFUService.mProgressType);
                        if (SifliDFUService.progressDebug.booleanValue()) {
                            Log.d(SifliDFUService.TAG, "progress " + i2 + ", countCurrent " + SifliDFUService.this.countCurrent + ", countPrevious " + SifliDFUService.this.countPrevious + ", countAll " + SifliDFUService.this.countAll);
                        }
                    }
                }
                return false;
            }
            byte[] byteArray = message.getData().getByteArray(SifliDFUService.EXTRA_BLE_DATA);
            if (SifliDFUService.this.mWriteCharacteristic == null || SifliDFUService.this.mBluetoothGatt == null) {
                return false;
            }
            SifliDFUService.this.mWriteCharacteristic.setValue(byteArray);
            SifliDFUService.this.mWriteCharacteristic.setWriteType(1);
            SifliDFUService.this.mSendAvailable = false;
            if (Build.VERSION.SDK_INT < 31 || ActivityCompat.checkSelfPermission(SifliDFUService.this, Permission.BLUETOOTH_CONNECT) == 0) {
                SifliDFUService.this.mBluetoothGatt.writeCharacteristic(SifliDFUService.this.mWriteCharacteristic);
                synchronized (SifliDFUService.this.mLock) {
                    while (!SifliDFUService.this.mSendAvailable && SifliDFUService.this.mError == 0) {
                        try {
                            SifliDFUService.this.mLock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return false;
            }
            Log.e(SifliDFUService.TAG, "no Permission");
            SifliDFUService.this.mError = 61;
            synchronized (SifliDFUService.this.mLock) {
                SifliDFUService.this.mLock.notifyAll();
            }
            return false;
        }
    }

    private byte[] serialReceive(byte[] bArr) {
        this.mLastCateID = bArr[0];
        byte b = bArr[1];
        if (b == 0) {
            int unsignedShortFromByteArray = Utils.getUnsignedShortFromByteArray(bArr, 2);
            this.receiveDataLen = unsignedShortFromByteArray;
            byte[] bArr2 = new byte[unsignedShortFromByteArray];
            this.receiveData = bArr2;
            System.arraycopy(bArr, 4, bArr2, 0, unsignedShortFromByteArray);
            return this.receiveData;
        }
        if (b == 1) {
            this.receiveDataCurrentLen = 0;
            int unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(bArr, 2);
            this.receiveDataLen = unsignedShortFromByteArray2;
            this.receiveData = new byte[unsignedShortFromByteArray2];
            Log.d(TAG, "receiveDataLen " + this.receiveDataLen);
            System.arraycopy(bArr, 4, this.receiveData, 0, bArr.length - 4);
            this.receiveDataCurrentLen += bArr.length - 4;
            return null;
        }
        if (b == 2) {
            System.arraycopy(bArr, 2, this.receiveData, this.receiveDataCurrentLen, bArr.length - 2);
            this.receiveDataCurrentLen += bArr.length - 2;
            return null;
        }
        if (b != 3) {
            return null;
        }
        System.arraycopy(bArr, 2, this.receiveData, this.receiveDataCurrentLen, bArr.length - 2);
        int length = this.receiveDataCurrentLen + (bArr.length - 2);
        this.receiveDataCurrentLen = length;
        if (length != this.receiveDataLen) {
            Log.e(TAG, "length error, final: " + this.receiveDataCurrentLen + ", expect: " + this.receiveDataLen);
            return null;
        }
        Log.d(TAG, "receive finish");
        return this.receiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNotify(byte[] bArr) {
        byte[] serialReceive = serialReceive(bArr);
        if (serialReceive != null && this.mLastCateID == 1) {
            int unsignedShortFromByteArray = Utils.getUnsignedShortFromByteArray(serialReceive, 0);
            int unsignedShortFromByteArray2 = Utils.getUnsignedShortFromByteArray(serialReceive, 2);
            switch (unsignedShortFromByteArray) {
                case 1:
                    Log.d(TAG, "receive init response len " + serialReceive.length);
                    this.mRspReceive = true;
                    int unsignedShortFromByteArray3 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendLogBroadcast(5, "image init response " + unsignedShortFromByteArray3);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray3);
                    if (unsignedShortFromByteArray3 != 0) {
                        Log.d(TAG, "receive init response " + unsignedShortFromByteArray3);
                        this.mError = unsignedShortFromByteArray3;
                        break;
                    } else {
                        byte b = serialReceive[6];
                        Log.d(TAG, "receive init response, result: " + unsignedShortFromByteArray3 + ", boot: " + ((int) b));
                        this.mRemoteBoot = b;
                        break;
                    }
                case 4:
                    Log.d(TAG, "receive resume response");
                    this.mRspReceive = true;
                    int unsignedShortFromByteArray4 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray4);
                    if (unsignedShortFromByteArray4 != 0) {
                        this.mError = unsignedShortFromByteArray4;
                        break;
                    } else {
                        byte b2 = serialReceive[6];
                        this.mRemoteBoot = b2;
                        this.mRemoteResumeRestart = serialReceive[7];
                        Log.i(TAG, "resume message len " + unsignedShortFromByteArray2);
                        if (unsignedShortFromByteArray2 != 8) {
                            if (unsignedShortFromByteArray2 != 12) {
                                Log.i(TAG, "fail to resume due to get data error");
                                this.mError = 71;
                                break;
                            } else {
                                this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                                this.mRemoteImageID = serialReceive[12];
                                this.mRemoteResumeNumOfRsp = serialReceive[13];
                                Log.i(TAG, "resume rsp, img id " + this.mRemoteImageID + ", img num " + this.mRemoteResumeNumOfRsp + ",reply freq " + this.mRemoteResumeNumOfRsp);
                            }
                        } else {
                            this.mRemoteResumeCount = Utils.getUnsignedShortFromByteArray(serialReceive, 8);
                            this.mRemoteImageID = serialReceive[10];
                            Log.i(TAG, "resume rsp, img id " + this.mRemoteImageID + ", img num " + this.mRemoteResumeCount);
                        }
                        Log.i(TAG, "resume rsp: boot " + ((int) b2) + ", resume restart " + this.mRemoteResumeRestart);
                        break;
                    }
                case 7:
                    int unsignedShortFromByteArray5 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray5);
                    Log.d(TAG, "SIFLI_DFU_IMAGE_SEND_START_RESPONSE " + unsignedShortFromByteArray5);
                    sendLogBroadcast(5, "image start rsp " + unsignedShortFromByteArray5);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray5 != 0) {
                        this.mError = unsignedShortFromByteArray5;
                        break;
                    } else if (serialReceive.length == 8) {
                        this.mWaitEndMode = serialReceive[6];
                        Log.d(TAG, "wait end mode " + this.mWaitEndMode);
                        this.mImageSkipInfo = serialReceive[7];
                        Log.w(TAG, "image skip " + this.mImageSkipInfo);
                        break;
                    }
                    break;
                case 9:
                    byte b3 = serialReceive[4];
                    Log.d(TAG, "DFU_IMAGE_END_RESPONSE " + ((int) b3));
                    sendLogBroadcast(5, "image end rsp " + ((int) b3));
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, b3);
                    this.mRspReceive = true;
                    if (b3 != 0) {
                        this.mError = b3;
                        break;
                    }
                    break;
                case 11:
                    int unsignedShortFromByteArray6 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    Log.d(TAG, "DFU_IMAGE_PACKET_DATA_RESPONSE " + unsignedShortFromByteArray6);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray6);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray6 != 0) {
                        this.mError = unsignedShortFromByteArray6;
                        break;
                    }
                    break;
                case 13:
                    byte b4 = serialReceive[4];
                    Log.d(TAG, "DFU_END " + ((int) b4));
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, b4);
                    this.mRspReceive = true;
                    if (b4 != 0) {
                        this.mError = b4;
                        break;
                    }
                    break;
                case 22:
                    this.mRspReceive = true;
                    int unsignedShortFromByteArray7 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray7);
                    Log.d(TAG, "processNotify: result " + unsignedShortFromByteArray7 + ", data len " + serialReceive.length);
                    sendLogBroadcast(5, "dfu file init rsp result " + unsignedShortFromByteArray7);
                    if (unsignedShortFromByteArray7 != 0) {
                        this.mError = unsignedShortFromByteArray7;
                        break;
                    } else {
                        this.mRemoteResume = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                        this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                        Log.e(TAG, "processNotify: init response " + unsignedShortFromByteArray7 + ", mode " + this.mRemoteResume + ", " + this.mRemoteResumeCount);
                        if (serialReceive.length >= 16) {
                            this.mRemoteVersion = serialReceive[12];
                            this.mFsBlock = Utils.getUnsignedShortFromByteArray(serialReceive, 14);
                            Log.d(TAG, "ver " + this.mRemoteVersion + ", fs block " + this.mFsBlock);
                            break;
                        }
                    }
                    break;
                case 25:
                    int unsignedShortFromByteArray8 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray8);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray8 != 0) {
                        this.mError = unsignedShortFromByteArray8;
                        break;
                    }
                    break;
                case 27:
                    int unsignedShortFromByteArray9 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray9);
                    this.mRspReceive = true;
                    if (unsignedShortFromByteArray9 != 0) {
                        Log.e(TAG, "file packet result " + unsignedShortFromByteArray9);
                        this.mError = unsignedShortFromByteArray9;
                    }
                    this.mRspFreq = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                    this.mRemoteCurrentIndex = Utils.getIntFromByteArray(serialReceive, 8);
                    break;
                case 29:
                    int unsignedShortFromByteArray10 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray10);
                    Log.d(TAG, "file end " + unsignedShortFromByteArray10);
                    this.mError = unsignedShortFromByteArray10;
                    this.mRspReceive = true;
                    break;
                case 31:
                    int unsignedShortFromByteArray11 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray11);
                    Log.d(TAG, "file total end " + unsignedShortFromByteArray11);
                    sendLogBroadcast(5, "file total end " + unsignedShortFromByteArray11);
                    this.mError = unsignedShortFromByteArray11;
                    this.mRspReceive = true;
                    break;
                case 33:
                    this.mRspReceive = true;
                    Log.d(TAG, "data length " + serialReceive.length);
                    int unsignedShortFromByteArray12 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    Log.i(TAG, "dfu init rsp ext result " + unsignedShortFromByteArray12);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray12);
                    if (unsignedShortFromByteArray12 != 0) {
                        this.mError = unsignedShortFromByteArray12;
                        break;
                    } else {
                        this.mRemoteResume = serialReceive[6];
                        this.mRemoteResumeRestart = serialReceive[7];
                        this.mRemoteResumeCount = Utils.getIntFromByteArray(serialReceive, 8);
                        this.mRemoteImageID = serialReceive[12];
                        this.mRemoteResumeNumOfRsp = serialReceive[13];
                        this.mRemoteBoot = serialReceive[14];
                        Log.w(TAG, "remote dfu version " + ((int) serialReceive[15]));
                        Log.i(TAG, "dfu init rsp ext resume " + this.mRemoteResume + ", restart " + this.mRemoteResumeRestart);
                        Log.i(TAG, "dfu init rsp ext count " + this.mRemoteResumeCount + ", id " + this.mRemoteImageID + ", rsp " + this.mRemoteResumeNumOfRsp + ", boot " + this.mRemoteBoot);
                        sendLogBroadcast(5, "init rsp ext " + unsignedShortFromByteArray12);
                        sendLogBroadcast(0, "dfu init rsp ext resume " + this.mRemoteResume + ", restart " + this.mRemoteResumeRestart);
                        sendLogBroadcast(0, "dfu init rsp ext count " + this.mRemoteResumeCount + ", id " + this.mRemoteImageID + ", rsp " + this.mRemoteResumeNumOfRsp + ", boot " + this.mRemoteBoot);
                        break;
                    }
                case 35:
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, serialReceive[4]);
                    this.mRspFreq = Utils.getUnsignedShortFromByteArray(serialReceive, 6);
                    if (this.mRemoteCurrentIndex == Utils.getIntFromByteArray(serialReceive, 8) && System.currentTimeMillis() - this.mLoseCheckTime < 2000) {
                        Log.w(TAG, "repeat message, ignore");
                        break;
                    } else {
                        this.mRemoteCurrentIndex = Utils.getIntFromByteArray(serialReceive, 8);
                        this.mLoseCheckTime = System.currentTimeMillis();
                        Log.e(TAG, "lost check at index " + this.mRemoteCurrentIndex);
                        this.mBleHandler.removeMessages(1);
                        sendDfuLinkLoseResponse(0);
                        this.mError = 13;
                        break;
                    }
                case 37:
                    int unsignedShortFromByteArray13 = Utils.getUnsignedShortFromByteArray(serialReceive, 4);
                    sendDfuStateChangeBroadcast(unsignedShortFromByteArray, unsignedShortFromByteArray13);
                    Log.d(TAG, "dfu abort with " + unsignedShortFromByteArray13);
                    sendLogBroadcast(5, "dfu abort " + unsignedShortFromByteArray13);
                    this.mError = unsignedShortFromByteArray13;
                    this.mRspReceive = true;
                    break;
            }
        }
    }

    private void sendDfuLinkLoseResponse(int i) {
        Log.e(TAG, "sendDfuLinkLoseResponse");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(36, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i, bArr, 4);
        sendToSerialExt(bArr, 0, true);
    }

    private void sendDfuImageInit(byte[] bArr, int i) {
        int i2;
        if (bArr == null) {
            this.mError = 76;
            return;
        }
        Log.d(TAG, "sendDfuInit " + bArr.length + ", mode " + i);
        byte[] bArr2 = new byte[bArr.length + 4];
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 3;
            if (i != 2) {
                if (i != 3) {
                    Log.e(TAG, "error mode " + i);
                }
                i2 = 14;
            }
        }
        Utils.addShortToByteArray(i2, bArr2, 0);
        Utils.addShortToByteArray(bArr.length, bArr2, 2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        sendToSerial(bArr2, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageInitExt(byte[] bArr) {
        if (bArr == null) {
            this.mError = 76;
            return;
        }
        Log.d(TAG, "sendDfuInitExt " + bArr.length);
        byte[] bArr2 = new byte[bArr.length + 4];
        Utils.addShortToByteArray(32, bArr2, 0);
        Utils.addShortToByteArray(bArr.length, bArr2, 2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        sendToSerial(bArr2, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageInitComplete() {
        Log.i(TAG, "sendDfuImageInitComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(2, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) 1;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageResumeComplete() {
        Log.i(TAG, "sendDfuImageResumeComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(5, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) 1;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageInitCompleteExt(int i) {
        Log.i(TAG, "sendDfuImageInitCompleteExt");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(34, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) i;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageStart(int i, int i2, int i3) {
        Log.i(TAG, "send dfu start id " + i3 + ", count " + i2 + ", len " + i);
        sendLogBroadcast(5, "IMG ID: " + i3);
        byte[] bArr = new byte[14];
        Utils.addShortToByteArray(6, bArr, 0);
        Utils.addShortToByteArray(10, bArr, 2);
        Utils.addIntToByteArray(i, bArr, 4);
        Utils.addIntToByteArray(i2, bArr, 8);
        bArr[12] = (byte) this.mRspFreq;
        bArr[13] = (byte) i3;
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, Const.MIN_TIME_LOADLASTLOCFROMDB);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImagePacket(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 10];
        Utils.addShortToByteArray(10, bArr2, 0);
        Utils.addShortToByteArray(bArr.length + 6, bArr2, 2);
        Utils.addShortToByteArray(i, bArr2, 4);
        Utils.addShortToByteArray(i2, bArr2, 6);
        Utils.addShortToByteArray(bArr.length, bArr2, 8);
        System.arraycopy(bArr, 0, bArr2, 10, bArr.length);
        sendToSerial(bArr2, 1);
    }

    private void sendDfuImageEnd(int i, int i2) {
        Log.i(TAG, "sendDfuImageEnd");
        sendLogBroadcast(5, "send dfu image end");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(8, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        bArr[4] = (byte) i;
        bArr[5] = (byte) i2;
        Log.d(TAG, "sendDfuImageEnd, id " + i + ",more image: " + i2);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, Const.MIN_TIME_LOADLASTLOCFROMDB);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuImageTransmissionEnd() {
        Log.i(TAG, "sendDfuImageTransmissionEnd");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(12, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = 0;
        sendToSerial(bArr, 0);
    }

    private void sendDfuImageTransmissionEndWait() {
        Log.i(TAG, "sendDfuImageTransmissionEndWait");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(12, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = 0;
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuEndCommand(int i) {
        Log.i(TAG, "sendDfuEndCommand " + i);
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(13, bArr, 0);
        Utils.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) i;
        sendToSerial(bArr, 0);
    }

    private void sendDfuFileInit(int i, int i2) {
        Log.d(TAG, "sendDfuFileInit " + i + ", count " + i2);
        byte[] bArr = new byte[20];
        Utils.addShortToByteArray(21, bArr, 0);
        Utils.addShortToByteArray(16, bArr, 2);
        Utils.addIntToByteArray(i2, bArr, 4);
        Utils.addIntToByteArray(i, bArr, 8);
        Utils.addShortToByteArray(2, bArr, 12);
        Utils.addShortToByteArray(4, bArr, 14);
        Utils.addIntToByteArray(100, bArr, 16);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFileInitComplete(int i) {
        Log.d(TAG, "sendDfuFileInitComplete");
        byte[] bArr = new byte[5];
        Utils.addShortToByteArray(23, bArr, 0);
        int i2 = 1;
        Utils.addShortToByteArray(1, bArr, 2);
        if (i == 1 && this.mRemoteResume == 1) {
            Log.e(TAG, "sendDfuFileInitComplete resume");
        } else {
            i2 = 0;
        }
        bArr[4] = (byte) i2;
        sendToSerial(bArr, 0);
    }

    private void sendDfuFileInitComplete(int i, int i2) {
        Log.d(TAG, "sendDfuFileInitComplete with block len");
        byte[] bArr = new byte[9];
        Utils.addShortToByteArray(23, bArr, 0);
        Utils.addShortToByteArray(5, bArr, 2);
        int i3 = 1;
        if (i == 1 && this.mRemoteResume == 1) {
            Log.e(TAG, "sendDfuFileInitComplete resume");
        } else {
            i3 = 0;
        }
        bArr[4] = (byte) i3;
        Utils.addIntToByteArray(i2, bArr, 5);
        sendToSerial(bArr, 0);
    }

    private void sendDfuFileStart(String str, int i, int i2, int i3) {
        Log.d(TAG, "sendDfuFileStart " + str + ", len " + i + ", count " + i2 + ", index " + i3);
        Log.d(TAG, "sendDfuFileStart freq " + this.mRspFreq);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 16];
        Utils.addShortToByteArray(24, bArr, 0);
        Utils.addShortToByteArray(bytes.length + 12, bArr, 2);
        Utils.addShortToByteArray(i3, bArr, 4);
        Utils.addShortToByteArray(this.mRspFreq, bArr, 6);
        Utils.addIntToByteArray(i, bArr, 8);
        Utils.addShortToByteArray(i2, bArr, 12);
        Utils.addShortToByteArray(bytes.length, bArr, 14);
        System.arraycopy(bytes, 0, bArr, 16, bytes.length);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFilePacket(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 8];
        Utils.addShortToByteArray(26, bArr2, 0);
        Utils.addShortToByteArray(bArr.length + 4, bArr2, 2);
        Utils.addShortToByteArray(i, bArr2, 4);
        Utils.addShortToByteArray(bArr.length, bArr2, 6);
        System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        sendToSerial(bArr2, 1);
    }

    private void sendDfuFileEnd(int i) {
        Log.d(TAG, "sendDfuFileEnd");
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(28, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i, bArr, 4);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private void sendDfuFileTotalEnd(int i) {
        Log.d(TAG, "sendDfuFileTotalEnd " + i);
        byte[] bArr = new byte[6];
        Utils.addShortToByteArray(30, bArr, 0);
        Utils.addShortToByteArray(2, bArr, 2);
        Utils.addShortToByteArray(i, bArr, 4);
        sendToSerial(bArr, 0);
        this.mRspReceive = false;
        this.mTimerHandler.postDelayed(this.mDfuCommandTimerRunnable, 60000L);
        try {
            synchronized (this.mLock) {
                while (!this.mRspReceive && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
        this.mTimerHandler.removeCallbacks(this.mDfuCommandTimerRunnable);
    }

    private int init() {
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService(SpeechConstant.BLUETOOTH);
        if (bluetoothManager == null) {
            Log.e(TAG, "Unable to initialize BluetoothManager.");
            return 62;
        }
        this.isReleased = false;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBluetoothAdapter = adapter;
        if (adapter == null) {
            Log.e(TAG, "Unable to obtain a BluetoothAdapter.");
            return 62;
        }
        this.mDFUState = new DFUState();
        this.mGattCallback = getEmptyGattCallback();
        this.misAlreadyConnect = false;
        this.mRemoteVersion = 0;
        this.mIsRemoteBoot = false;
        this.mWaitEndMode = 0;
        registerBleBroadcast();
        return 0;
    }

    private void release() {
        if (this.isReleased) {
            Log.d(TAG, "already released");
            return;
        }
        Log.i(TAG, "release");
        this.isReleased = true;
        unregisterReceiver(this.mBleBroadcastReceiver);
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 61;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null || this.mConnectionState == 0) {
            return;
        }
        bluetoothGatt.disconnect();
        this.mBluetoothGatt.close();
    }

    private int getNandUnCompressImageLength(int i) {
        int i2;
        Log.d(TAG, "image total len " + i);
        if (i % 2084 == 0) {
            i2 = i / 2084;
        } else {
            i2 = (i / 2084) + 1;
        }
        int i3 = i - (i2 * 36);
        Log.d(TAG, "imageLen " + i3);
        return i3;
    }

    private int getAllFileLength(ArrayList<OTAFile> arrayList, int i) {
        int fileLength;
        Iterator<OTAFile> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() != -1) {
                if (next.getFileLength() % i == 0) {
                    fileLength = next.getFileLength() / i;
                } else {
                    fileLength = (next.getFileLength() / i) + 1;
                }
                i2 += fileLength;
            }
        }
        Log.d(TAG, "all file len " + i2);
        return i2;
    }

    private int getSendImageLength(ArrayList<OTAFile> arrayList, int i, int i2) {
        int fileLength;
        Iterator<OTAFile> it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() != -1) {
                if (next.getImageID() >= i) {
                    break;
                }
                if (next.getFileLength() % i2 == 0) {
                    fileLength = next.getFileLength() / i2;
                } else {
                    fileLength = (next.getFileLength() / i2) + 1;
                }
                i3 += fileLength;
            }
        }
        return i3;
    }

    private int getSendFileLength(ArrayList<OTAFile> arrayList, int i, int i2) {
        int fileLength;
        Iterator<OTAFile> it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getFileIndex() < i) {
                if (next.getFileLength() % i2 == 0) {
                    fileLength = next.getFileLength() / i2;
                } else {
                    fileLength = (next.getFileLength() / i2) + 1;
                }
                i3 += fileLength;
            }
        }
        return i3;
    }

    private OTAFile getImageByID(ArrayList<OTAFile> arrayList, int i) {
        Iterator<OTAFile> it = arrayList.iterator();
        while (it.hasNext()) {
            OTAFile next = it.next();
            if (next.getImageID() == i) {
                return next;
            }
        }
        return null;
    }

    protected void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + j + Separators.RPAREN);
                this.mLock.wait(j);
            } catch (InterruptedException unused) {
                Log.e(TAG, "Sleeping interrupted");
            }
        }
    }

    private void registerBleBroadcast() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        BroadcastReceiver bLEBroadcastReceiver = getBLEBroadcastReceiver();
        this.mBleBroadcastReceiver = bLEBroadcastReceiver;
        registerReceiver(bLEBroadcastReceiver, intentFilter);
    }

    private BroadcastReceiver getBLEBroadcastReceiver() {
        return new BroadcastReceiver() { // from class: com.sifli.siflidfu.SifliDFUService.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) != 10) {
                    return;
                }
                Log.e(SifliDFUService.TAG, "Bluetooth off");
                SifliDFUService.this.mError = 74;
                SifliDFUService.this.mBleHandler.removeMessages(1);
                synchronized (SifliDFUService.this.mLock) {
                    SifliDFUService.this.mLock.notifyAll();
                }
            }
        };
    }

    void sendLogBroadcast(int i, String str) {
        Intent intent = new Intent(BROADCAST_DFU_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, "[DFU] " + str);
        intent.putExtra(EXTRA_LOG_LEVEL, i);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendDfuStateChangeBroadcast(int i, int i2) {
        Intent intent = new Intent(BROADCAST_DFU_STATE);
        intent.putExtra(EXTRA_DFU_STATE, i);
        intent.putExtra(EXTRA_DFU_STATE_RESULT, i2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendDFUProgressBroadcast(int i, int i2) {
        Intent intent = new Intent(BROADCAST_DFU_PROGRESS);
        intent.putExtra(EXTRA_DFU_PROGRESS, i);
        intent.putExtra(EXTRA_DFU_PROGRESS_TYPE, i2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        release();
        Log.i(TAG, "onDestroy");
    }
}
