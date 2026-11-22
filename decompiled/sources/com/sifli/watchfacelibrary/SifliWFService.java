package com.sifli.watchfacelibrary;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sifli.serialtransport.OnSerialTransListener;
import com.sifli.serialtransport.serialTransService;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class SifliWFService extends Service {
    public static final String BROADCAST_WATCHFACE_LOG = "com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_WATCHFACE_PROGRESS = "com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS";
    public static final String BROADCAST_WATCHFACE_STATE = "com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE";
    private static final int DATA_HEADER_LEN = 4;
    public static final String EXTRA_WATCHFACE_LOG = "com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG";
    public static final String EXTRA_WATCHFACE_PROGRESS = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS";
    public static final String EXTRA_WATCHFACE_STATE = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE";
    public static final String EXTRA_WATCHFACE_STATE_RSP = "Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE";
    public static final int FILE_TYPE_BACKGROUND_PIC = 2;
    public static final int FILE_TYPE_CUSTOMIZED = 3;
    public static final int FILE_TYPE_EQ = 6;
    public static final int FILE_TYPE_MULTIPLE_LANGUAGE = 1;
    public static final int FILE_TYPE_MUSIC = 4;
    public static final int FILE_TYPE_WATCHFACE = 0;
    public static final int FILE_TYPE_WATCHFACE_JS = 5;
    private static final int MAX_PART_LEN_LESS = 1024;
    private static final int MAX_PART_LEN_NORMAL = 4096;
    private static final int SERIAL_ID_WATCHFACE = 4;
    private static final String TAG = "wf-service";
    private static final int TIMEOUT_SEND_COMMAND = 60000;
    private static final int TIMEOUT_START_SERIAL = 60000;
    private static boolean debugProgress = false;
    private static int mAllFileLen;
    private static int mAlreadySendLen;
    private static int mProgressSendCount;
    private static int mSendLenTemp;
    private WFBinder mBinder;
    private boolean mConnectSuccess;
    private int mError;
    long mRemoteBlockLeft;
    int mRemoteBlockLength;
    private int mRemoteExpectIndex;
    int mRemoteVersion;
    private int mRspResult;
    private boolean mSendAvailable;
    private serialTransService.serialTransBinder mSerialBinder;
    private OnWFListener onWFListener;
    private boolean mIsSerialServiceOn = false;
    private Handler mTimerHandler = new Handler();
    private final Object mLock = new Object();
    ArrayList<String> blankArrayList = new ArrayList<>();
    private boolean isRspReceived = false;
    int mEndState = 0;
    private int mMaxPartLen = 4096;
    private final Runnable mSendStartCommandRunnable = new Runnable() { // from class: com.sifli.watchfacelibrary.SifliWFService.1
        @Override // java.lang.Runnable
        public void run() {
            Log.e(SifliWFService.TAG, "serial trans command overtime!");
            SifliWFService.this.mError = 3;
            synchronized (SifliWFService.this.mLock) {
                SifliWFService.this.mLock.notifyAll();
            }
        }
    };
    private final ServiceConnection mConnection = new ServiceConnection() { // from class: com.sifli.watchfacelibrary.SifliWFService.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(SifliWFService.TAG, "onServiceConnected, " + componentName.toString());
            SifliWFService.this.mIsSerialServiceOn = true;
            SifliWFService.this.mSerialBinder = (serialTransService.serialTransBinder) iBinder;
            serialTransService service = SifliWFService.this.mSerialBinder.getService();
            synchronized (SifliWFService.this.mLock) {
                SifliWFService.this.mLock.notifyAll();
            }
            service.setOnSerialTransListener(new OnSerialTransListener() { // from class: com.sifli.watchfacelibrary.SifliWFService.2.1
                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialTransSend(int i) {
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialDataReceive(int i, byte[] bArr) {
                    if (i == 4) {
                        byte b = bArr[0];
                        if (b == 1) {
                            SifliWFService.this.processTotalStartRsp(bArr);
                            return;
                        }
                        if (b == 3) {
                            SifliWFService.this.processWatchfaceStartRsp(bArr);
                            return;
                        }
                        if (b == 5) {
                            SifliWFService.this.processWatchfaceDataRsp(bArr);
                            return;
                        }
                        if (b == 7) {
                            SifliWFService.this.processWatchfaceEndRsp(bArr);
                            return;
                        }
                        if (b == 14) {
                            SifliWFService.this.processWatchfaceInfoRsp(bArr);
                        } else if (b == 9) {
                            SifliWFService.this.processWatchfaceTotalEndRsp(bArr);
                        } else {
                            if (b != 10) {
                                return;
                            }
                            SifliWFService.this.processWatchfaceLoseCheck(bArr);
                        }
                    }
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialTransBLEStateChanged(int i) {
                    if (i == 0) {
                        Log.d(SifliWFService.TAG, "disconnect close");
                        SifliWFService.this.mBinder.disconnectDevice();
                        SifliWFService.this.mError = 6;
                        SifliWFService.this.onWFListener.onConnectionState(1);
                        synchronized (SifliWFService.this.mLock) {
                            SifliWFService.this.mLock.notifyAll();
                        }
                    }
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialTranSendFinish() {
                    synchronized (SifliWFService.this.mLock) {
                        SifliWFService.this.mLock.notifyAll();
                    }
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialTransProgress(int i) {
                    SifliWFService.access$1312(i);
                    int i2 = (SifliWFService.mSendLenTemp * 100) / SifliWFService.mAllFileLen;
                    if (SifliWFService.debugProgress) {
                        Log.d(SifliWFService.TAG, "progress " + i2);
                        Log.d(SifliWFService.TAG, "progress " + SifliWFService.mSendLenTemp + ", " + SifliWFService.mAllFileLen);
                    }
                    SifliWFService.this.sendWatchfaceProgress(i2);
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialBluetoothConnect(int i) {
                    SifliWFService.this.onWFListener.onConnectionState(i);
                }

                @Override // com.sifli.serialtransport.OnSerialTransListener
                public void onSerialMTUChangeResult(int i) {
                    if (i == 23) {
                        Log.d(SifliWFService.TAG, "onSerialMTUChangeResult use short packet");
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(SifliWFService.TAG, "onServiceDisconnected" + componentName.toString());
            SifliWFService.this.mIsSerialServiceOn = false;
            synchronized (SifliWFService.this.mLock) {
                SifliWFService.this.mLock.notifyAll();
            }
        }
    };

    static /* synthetic */ int access$1312(int i) {
        int i2 = mSendLenTemp + i;
        mSendLenTemp = i2;
        return i2;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "version " + WatchfaceUtil.VersionStr);
        this.mRemoteVersion = 0;
        this.mBinder = new WFBinder();
    }

    public void setOnWFListener(OnWFListener onWFListener) {
        this.onWFListener = onWFListener;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        WFBinder wFBinder = this.mBinder;
        if (wFBinder != null) {
            return wFBinder;
        }
        return null;
    }

    void initSend() {
        this.mRspResult = 0;
        mAlreadySendLen = 0;
        mSendLenTemp = 0;
        mAllFileLen = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWFFile(String str, Uri uri, int i, int i2) {
        initSend();
        if (str != null) {
            Log.d(TAG, "get path");
        } else if (uri != null) {
            Log.d(TAG, "get uri");
            str = SifliWatchfaceService.getFilePathFromURI(this, uri);
        } else {
            Log.e(TAG, "uri, path and zip data are null");
            this.onWFListener.onFileSend(8);
            return;
        }
        if (str == null) {
            this.onWFListener.onFileSend(8);
            return;
        }
        String str2 = getCacheDir() + "/wf";
        Log.d(TAG, "new path: " + str2);
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileProcess.deleteFolderFile(str2, false);
        FileProcess.unzipFolder(str, str2);
        ArrayList<WatchfaceFile> allFiles = getAllFiles(str2, new ArrayList<>());
        if (allFiles == null) {
            this.onWFListener.onFileSend(8);
            return;
        }
        if (i == 3 || i == 4) {
            formatData(allFiles);
        } else if (i2 == 1) {
            formatData(allFiles, i);
        }
        mAllFileLen = 0;
        Iterator<WatchfaceFile> it = allFiles.iterator();
        while (it.hasNext()) {
            mAllFileLen += it.next().getFileData().length;
        }
        Collections.sort(allFiles, new WatchfaceFileComparator());
        Log.d(TAG, "watchfaceFile size " + allFiles.size() + ", all files len " + mAllFileLen);
        if (mAllFileLen == 0) {
            Log.e(TAG, "file is null");
            this.onWFListener.onFileSend(9);
            return;
        }
        mProgressSendCount = 0;
        this.mError = 0;
        this.mEndState = 0;
        handleSendWatchface(allFiles, i);
        this.onWFListener.onFileSend(this.mError);
    }

    private void handleSendWatchface(ArrayList<WatchfaceFile> arrayList, int i) {
        sendWatchfaceTotalStart(i);
        if (this.mError != 0) {
            return;
        }
        if (this.mRspResult != 0) {
            this.mError = 2;
            return;
        }
        if (this.mRemoteVersion >= 1) {
            sendWatchfaceInfoReq(fileBlockCheck(arrayList));
            if (this.mError != 0) {
                return;
            }
            if (this.mRspResult != 0) {
                this.mError = 2;
                return;
            }
        }
        sendBlankData();
        if (debugProgress) {
            Log.d(TAG, "debug progress info");
            this.mSerialBinder.serialTransDebugProgress();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                break;
            }
            WatchfaceFile watchfaceFile = arrayList.get(i2);
            String filePath = watchfaceFile.getFilePath();
            byte[] fileData = watchfaceFile.getFileData();
            sendWatchfaceStart(fileData.length, filePath);
            if (this.mError != 0) {
                break;
            }
            if (this.mRspResult != 0) {
                this.mError = 2;
                break;
            }
            calculateSendSize(arrayList, i2);
            if (debugProgress) {
                Log.d(TAG, "calculateSendSize " + mAlreadySendLen);
            }
            sendWatchfaceDataExt(fileData);
            mProgressSendCount += 100;
            if (this.mError != 0) {
                Log.d(TAG, "error before end " + this.mError);
                break;
            }
            sendWatchfaceEnd();
            if (this.mError != 0) {
                Log.d(TAG, "error after end " + this.mError);
                break;
            } else {
                if (this.mRspResult != 0) {
                    this.mError = 2;
                    break;
                }
                i2++;
            }
        }
        Log.d(TAG, "end error " + this.mError);
        if (this.mError == 0) {
            sendWatchfaceTotalEnd();
            Log.i(TAG, "finish");
        }
    }

    private void calculateSendSize(ArrayList<WatchfaceFile> arrayList, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += arrayList.get(i3).getFileData().length;
        }
        mAlreadySendLen = i2;
    }

    private void sendBlankData() {
        this.blankArrayList.clear();
        this.blankArrayList.add("LLD");
        this.blankArrayList.add("PRA");
        this.blankArrayList.add("VCE");
        this.blankArrayList.add("MAR");
        String str = Build.MODEL;
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        Log.e(TAG, "model " + str);
        if (this.blankArrayList.contains(str)) {
            Log.w(TAG, "sendDfuBlankData");
            for (int i = 0; i < 5; i++) {
                this.mSerialBinder.serialTransSendBlank();
            }
        }
    }

    private int fileBlockCheck(ArrayList<WatchfaceFile> arrayList) {
        int length;
        Log.i(TAG, "fileBlockCheck");
        Iterator<WatchfaceFile> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            WatchfaceFile next = it.next();
            if (next.getFileData().length % this.mRemoteBlockLength == 0) {
                length = next.getFileData().length / this.mRemoteBlockLength;
            } else {
                length = (next.getFileData().length / this.mRemoteBlockLength) + 1;
            }
            i += length;
        }
        Log.i(TAG, "total block use " + i + ", remote block left " + this.mRemoteBlockLeft);
        sendWatchfaceLog("total block use " + i + ", remote block left " + this.mRemoteBlockLeft);
        return i;
    }

    private void sendWatchfaceTotalStart(int i) {
        Log.d(TAG, "sendWatchfaceTotalStart " + i);
        byte[] bArr = new byte[11];
        WatchfaceUtil.addShortToByteArray(0, bArr, 0);
        WatchfaceUtil.addShortToByteArray(7, bArr, 2);
        WatchfaceUtil.addShortToByteArray(i, bArr, 4);
        bArr[6] = 2;
        WatchfaceUtil.addIntToByteArray(mAllFileLen, bArr, 7);
        sendWatchfaceLog("sendWatchfaceTotalStart type " + i + ", file len " + mAllFileLen);
        this.mSerialBinder.serialTransSend(bArr, 4);
        this.isRspReceived = false;
        this.mTimerHandler.postDelayed(this.mSendStartCommandRunnable, 60000L);
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mSendStartCommandRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTotalStartRsp(byte[] bArr) {
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        Log.d(TAG, "COMMAND_SEND_WATCHFACE_START_RSP " + this.mRspResult);
        this.isRspReceived = true;
        Log.d(TAG, "mMaxPartLen " + WatchfaceUtil.getUnsignedShortFromByteArray(bArr, 4));
        if (bArr.length == 14) {
            this.mRemoteVersion = WatchfaceUtil.getUnsignedShortFromByteArray(bArr, 6);
            this.mRemoteBlockLength = WatchfaceUtil.getUnsignedShortFromByteArray(bArr, 8);
            this.mRemoteBlockLeft = WatchfaceUtil.getUnsignedIntFromByteArray(bArr, 10);
            Log.i(TAG, "remote version " + this.mRemoteVersion + ", block length " + this.mRemoteBlockLength + ", remote block " + this.mRemoteBlockLeft);
        }
        sendWatchfaceLog("processTotalStartRsp " + this.mRspResult + ", len " + this.mMaxPartLen);
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void sendWatchfaceStart(int i, String str) {
        int length = str.getBytes(StandardCharsets.UTF_8).length;
        Log.d(TAG, "sendWatchfaceStart " + i + ",name: " + str + ", " + length);
        byte[] bArr = new byte[length + 10];
        WatchfaceUtil.addShortToByteArray(2, bArr, 0);
        WatchfaceUtil.addShortToByteArray(length + 6, bArr, 2);
        WatchfaceUtil.addIntToByteArray(i, bArr, 4);
        WatchfaceUtil.addIntToByteArray(length, bArr, 8);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        sendWatchfaceLog("sendWatchfaceStart len: " + i + ",name: " + str);
        this.mSerialBinder.serialTransSend(bArr, 4);
        this.isRspReceived = false;
        this.mTimerHandler.postDelayed(this.mSendStartCommandRunnable, 60000L);
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mSendStartCommandRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceStartRsp(byte[] bArr) {
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        Log.d(TAG, "processWatchfaceStartRsp " + this.mRspResult);
        sendWatchfaceLog("processWatchfaceStartRsp: " + this.mRspResult);
        this.isRspReceived = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void sendWatchfaceDataExt(byte[] bArr) {
        Log.d(TAG, "sendWatchfaceDataExt");
        Log.d(TAG, "mMaxPartLen " + this.mMaxPartLen);
        CurrentSendFile currentSendFile = new CurrentSendFile(bArr, this.mMaxPartLen);
        int totalCount = currentSendFile.getTotalCount();
        int i = 0;
        int i2 = 0;
        while (i < totalCount) {
            int i3 = mAlreadySendLen;
            for (int i4 = 0; i4 < i; i4++) {
                i3 += currentSendFile.getData(i4).length;
            }
            if (debugProgress) {
                Log.d(TAG, "mAlreadySendLen " + i3);
            }
            mSendLenTemp = i3;
            int length = currentSendFile.getData(i).length;
            byte[] bArr2 = new byte[length + 8];
            WatchfaceUtil.addShortToByteArray(4, bArr2, 0);
            WatchfaceUtil.addShortToByteArray(length + 4, bArr2, 2);
            WatchfaceUtil.addIntToByteArray(i + 1, bArr2, 4);
            System.arraycopy(bArr, i2, bArr2, 8, length);
            i2 += length;
            this.mSerialBinder.serialTransSendProgress(bArr2, 4);
            this.isRspReceived = false;
            synchronized (this.mLock) {
                while (!this.isRspReceived && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            int i5 = this.mRspResult;
            if (i5 != 0) {
                if (i5 == 4 || i5 == 7) {
                    Log.w(TAG, "index error, continue with " + this.mRemoteExpectIndex);
                    i2 -= length;
                    i = this.mRemoteExpectIndex - 2;
                    this.mError = 0;
                } else {
                    this.mError = 2;
                    return;
                }
            }
            if (this.mError != 0) {
                Log.w(TAG, "download interrupt with " + this.mError);
                return;
            }
            i++;
        }
    }

    private void sendWatchfaceInfoReq(int i) {
        Log.d(TAG, "sendWatchfaceInfoReq");
        byte[] bArr = new byte[8];
        WatchfaceUtil.addShortToByteArray(13, bArr, 0);
        WatchfaceUtil.addShortToByteArray(2, bArr, 2);
        WatchfaceUtil.addIntToByteArray(i, bArr, 4);
        this.mSerialBinder.serialTransSend(bArr, 4);
        this.isRspReceived = false;
        this.mTimerHandler.postDelayed(this.mSendStartCommandRunnable, 60000L);
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mSendStartCommandRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceInfoRsp(byte[] bArr) {
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        Log.d(TAG, "processWatchfaceInfoCheck " + this.mRspResult);
        sendWatchfaceLog("processWatchfaceInfoCheck: " + this.mRspResult);
        this.isRspReceived = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void sendWatchfaceEnd() {
        Log.d(TAG, "sendWatchfaceEnd");
        byte[] bArr = new byte[4];
        this.mEndState = 1;
        sendWatchfaceLog("sendWatchfaceEnd");
        WatchfaceUtil.addShortToByteArray(6, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mSerialBinder.serialTransSend(bArr, 4);
        this.isRspReceived = false;
        this.mTimerHandler.postDelayed(this.mSendStartCommandRunnable, 60000L);
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mSendStartCommandRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceEndRsp(byte[] bArr) {
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        Log.d(TAG, "processWatchfaceEndRsp " + this.mRspResult);
        sendWatchfaceLog("processWatchfaceEndRsp " + this.mRspResult);
        this.isRspReceived = true;
        this.mEndState = 0;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceLoseCheck(byte[] bArr) {
        this.isRspReceived = true;
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        this.mRemoteExpectIndex = WatchfaceUtil.getIntFromByteArray(bArr, 4);
        Log.i(TAG, "receive lose check + " + this.mRspResult + ", index " + this.mRemoteExpectIndex);
        if (this.mRspResult == 8) {
            Log.e(TAG, "remote abort");
            this.mError = 7;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        sendWatchfaceLoseCheckRsp();
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void sendWatchfaceLoseCheckRsp() {
        Log.d(TAG, "sendWatchfaceLoseCheckRsp");
        byte[] bArr = new byte[4];
        WatchfaceUtil.addShortToByteArray(11, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mSerialBinder.serialTransSend(bArr, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceDataRsp(byte[] bArr) {
        if (this.mEndState == 1) {
            Log.w(TAG, "processWatchfaceDataRsp: wait end rsp, ignore!");
            return;
        }
        this.isRspReceived = true;
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        sendWatchfaceLog("processWatchfaceDataRsp " + this.mRspResult);
        this.mRemoteExpectIndex = WatchfaceUtil.getIntFromByteArray(bArr, 4);
        if (this.mRspResult != 0) {
            Log.e(TAG, "processWatchfaceDataRsp " + this.mRspResult + ", index " + this.mRemoteExpectIndex);
        }
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void sendWatchfaceTotalEnd() {
        Log.d(TAG, "sendWatchfaceTotalEnd");
        byte[] bArr = new byte[4];
        WatchfaceUtil.addShortToByteArray(8, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mSerialBinder.serialTransSend(bArr, 4);
        this.isRspReceived = false;
        this.mTimerHandler.postDelayed(this.mSendStartCommandRunnable, 60000L);
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.mTimerHandler.removeCallbacks(this.mSendStartCommandRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWatchfaceTotalEndRsp(byte[] bArr) {
        Log.d(TAG, "processWatchfaceTotalEndRsp");
        this.isRspReceived = true;
        this.mRspResult = WatchfaceUtil.getShortFromByteArray(bArr, 2);
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    private void formatData(ArrayList<WatchfaceFile> arrayList) {
        Iterator<WatchfaceFile> it = arrayList.iterator();
        while (it.hasNext()) {
            WatchfaceFile next = it.next();
            next.makeAlignment();
            next.addCRC();
        }
    }

    private void formatData(ArrayList<WatchfaceFile> arrayList, int i) {
        Iterator<WatchfaceFile> it = arrayList.iterator();
        while (it.hasNext()) {
            WatchfaceFile next = it.next();
            next.makeAlignment(i);
            next.addCRC();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTransService(String str) {
        this.mError = 0;
        Intent intent = new Intent(this, (Class<?>) serialTransService.class);
        Log.d(TAG, "startTransService " + str);
        intent.putExtra(serialTransService.EXTRA_DEVICE_ADDRESS, str);
        this.mIsSerialServiceOn = false;
        startService(intent);
        bindService(intent, this.mConnection, 1);
        synchronized (this.mLock) {
            while (!this.mIsSerialServiceOn && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        Log.d(TAG, "start finish " + this.mIsSerialServiceOn + ", error " + this.mError);
        if (this.mIsSerialServiceOn && this.mError == 0) {
            this.mConnectSuccess = false;
            serialTransService.serialTransBinder serialtransbinder = this.mSerialBinder;
            if (serialtransbinder == null) {
                this.mError = 1;
            } else {
                serialtransbinder.connectBluetooth();
            }
        }
    }

    void sendWatchfaceResult(int i) {
        Log.e(TAG, "send result broadcast " + i + ", result " + this.mRspResult);
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE");
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE", i);
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE", this.mRspResult);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendWatchfaceLog(String str) {
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG");
        intent.putExtra("com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendWatchfaceProgress(int i) {
        if (debugProgress) {
            Log.d(TAG, "sendWatchfaceProgress " + i);
        }
        Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS");
        intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS", i);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private ArrayList<WatchfaceFile> getAllFiles(String str, ArrayList<WatchfaceFile> arrayList) {
        File[] listFiles;
        String str2 = getCacheDir() + "/wf";
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                String name = file2.getName();
                byte[] openFile = FileProcess.openFile(absolutePath);
                String substring = absolutePath.substring(str2.length());
                arrayList.add(new WatchfaceFile(substring, openFile, name));
                Log.d(TAG, "fileName:" + name);
                Log.d(TAG, "filePath:" + substring);
                Log.d(TAG, "data len:" + openFile.length);
            } else if (file2.isDirectory()) {
                getAllFiles(file2.getAbsolutePath(), arrayList);
            }
        }
        return arrayList;
    }

    public class WFBinder extends Binder {
        public WFBinder() {
        }

        public SifliWFService getService() {
            return SifliWFService.this;
        }

        public void connectDevice(String str) {
            Log.d(SifliWFService.TAG, "connect device " + str);
            SifliWFService.this.startTransService(str);
        }

        public void sendFile(String str, Uri uri, int i, int i2) {
            SifliWFService.this.sendWFFile(str, uri, i, i2);
        }

        public void disconnectDevice() {
            if (SifliWFService.this.mIsSerialServiceOn) {
                SifliWFService.this.mIsSerialServiceOn = false;
                SifliWFService sifliWFService = SifliWFService.this;
                sifliWFService.unbindService(sifliWFService.mConnection);
                SifliWFService.this.stopService(new Intent(SifliWFService.this, (Class<?>) serialTransService.class));
            }
        }
    }
}
