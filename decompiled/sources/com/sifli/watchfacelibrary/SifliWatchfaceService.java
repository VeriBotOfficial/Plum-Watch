package com.sifli.watchfacelibrary;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sifli.serialtransport.OnSerialTransListener;
import com.sifli.serialtransport.serialTransService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class SifliWatchfaceService extends IntentService implements IWatchfaceService {
    private static final String ACTION_WATCHFACE = "com.sifli.watchfacelibrary.action.WATCHFACE";
    private static final String ACTION_WATCHFACE_MKII = "com.sifli.watchfacelibrary.action.WATCHFACE.MKII";
    public static final String BROADCAST_WATCHFACE_LOG = "com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_WATCHFACE_PROGRESS = "com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS";
    public static final String BROADCAST_WATCHFACE_STATE = "com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE";
    private static final int DATA_HEADER_LEN = 4;
    private static final String EXTRA_ADDRESS = "com.sifli.watchfacelibrary.extra.ADDRESS";
    private static final String EXTRA_ADD_ALIGN = "com.sifli.watchfacelibrary.extra.ADD_ALIGN";
    private static final String EXTRA_DATA = "com.sifli.watchfacelibrary.extra.DATA";
    private static final String EXTRA_PATH = "com.sifli.watchfacelibrary.extra.PATH";
    private static final String EXTRA_TYPE = "com.sifli.watchfacelibrary.extra.TYPE";
    private static final String EXTRA_URI = "com.sifli.watchfacelibrary.extra.URI";
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
    private static final int PROGRESS_TYPE_MULTI = 1;
    private static final int PROGRESS_TYPE_SINGLE = 0;
    private static final int SERIAL_ID_WATCHFACE = 4;
    private static final String TAG = "watchfaceService";
    private static final int TIMEOUT_SEND_COMMAND = 60000;
    private static final int TIMEOUT_START_SERIAL = 60000;
    private static boolean debugProgress = false;
    private static long mAllFileLen = 0;
    private static int mAlreadySendLen = 0;
    private static int mCurrentSendLen = 0;
    private static int mFileLen = 0;
    static boolean mIsUpdateConnection = false;
    private static int mLastProgress;
    private static int mProgressSendCount;
    private static int mProgressTotalCount;
    private static int mSendLen;
    private static long mSendLenTemp;
    private static Intent mWatchfaceService;
    private static WatchfaceView mWatchfaceView;
    private static IWatchfaceService watchfaceStopService;
    ArrayList<String> MTUIssueList;
    ArrayList<String> blankArrayList;
    private boolean isBroadcastRegistered;
    private boolean isRspReceived;
    boolean mAbortFinish;
    private final Runnable mAbortHandler;
    private serialTransService.serialTransBinder mBinder;
    private BroadcastReceiver mBleBroadcastReceiver;
    private boolean mConnectSuccess;
    private final ServiceConnection mConnection;
    int mEndState;
    private int mError;
    private boolean mIsSerialServiceOn;
    private final Object mLock;
    private int mMaxPartLen;
    private int mProgressType;
    long mRemoteBlockLeft;
    int mRemoteBlockLength;
    private int mRemoteExpectIndex;
    int mRemoteVersion;
    int mResumeCount;
    int mResumeState;
    private int mRspResult;
    private boolean mSendAvailable;
    private final Runnable mSendStartCommandRunnable;
    private final Runnable mStartSerialServiceRunnable;
    private Handler mTimerHandler;
    String md5;

    static /* synthetic */ long access$1314(long j) {
        long j2 = mSendLenTemp + j;
        mSendLenTemp = j2;
        return j2;
    }

    public SifliWatchfaceService() {
        super("SifliWatchfaceService");
        this.mMaxPartLen = 4096;
        this.isRspReceived = false;
        this.mLock = new Object();
        this.mIsSerialServiceOn = false;
        this.blankArrayList = new ArrayList<>();
        this.MTUIssueList = new ArrayList<>();
        this.mTimerHandler = new Handler();
        this.mEndState = 0;
        this.mAbortFinish = false;
        this.mAbortHandler = new Runnable() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d(SifliWatchfaceService.TAG, "wait abort send");
                SifliWatchfaceService.this.mAbortFinish = true;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
            }
        };
        this.mConnection = new ServiceConnection() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Log.d(SifliWatchfaceService.TAG, "onServiceConnected, " + componentName.toString());
                SifliWatchfaceService.this.mBinder = (serialTransService.serialTransBinder) iBinder;
                serialTransService service = SifliWatchfaceService.this.mBinder.getService();
                SifliWatchfaceService.this.mIsSerialServiceOn = true;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
                service.setOnSerialTransListener(new OnSerialTransListener() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.2.1
                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialTransSend(int i) {
                        if (i == 0 && !SifliWatchfaceService.this.mSendAvailable) {
                            SifliWatchfaceService.this.mSendAvailable = true;
                            synchronized (SifliWatchfaceService.this.mLock) {
                                SifliWatchfaceService.this.mLock.notifyAll();
                            }
                        }
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialDataReceive(int i, byte[] bArr) {
                        if (i == 4) {
                            byte b = bArr[0];
                            if (b == 1) {
                                SifliWatchfaceService.this.processTotalStartRsp(bArr);
                                return;
                            }
                            if (b == 3) {
                                SifliWatchfaceService.this.processWatchfaceStartRsp(bArr);
                                return;
                            }
                            if (b == 5) {
                                SifliWatchfaceService.this.processWatchfaceDataRsp(bArr);
                                return;
                            }
                            if (b == 7) {
                                SifliWatchfaceService.this.processWatchfaceEndRsp(bArr);
                                return;
                            }
                            if (b == 14) {
                                SifliWatchfaceService.this.processWatchfaceInfoRsp(bArr);
                            } else if (b == 9) {
                                SifliWatchfaceService.this.processWatchfaceTotalEndRsp(bArr);
                            } else {
                                if (b != 10) {
                                    return;
                                }
                                SifliWatchfaceService.this.processWatchfaceLoseCheck(bArr);
                            }
                        }
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialTransBLEStateChanged(int i) {
                        if (i == 0) {
                            SifliWatchfaceService.this.closeTransService();
                            SifliWatchfaceService.this.mError = 6;
                            synchronized (SifliWatchfaceService.this.mLock) {
                                SifliWatchfaceService.this.mLock.notifyAll();
                            }
                        }
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialTranSendFinish() {
                        synchronized (SifliWatchfaceService.this.mLock) {
                            SifliWatchfaceService.this.mLock.notifyAll();
                        }
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialTransProgress(int i) {
                        SifliWatchfaceService.access$1314(i);
                        int i2 = (int) ((SifliWatchfaceService.mSendLenTemp * 100) / SifliWatchfaceService.mAllFileLen);
                        if (SifliWatchfaceService.debugProgress) {
                            Log.d(SifliWatchfaceService.TAG, "progress " + i2);
                            Log.d(SifliWatchfaceService.TAG, "progress " + SifliWatchfaceService.mSendLenTemp + ", " + SifliWatchfaceService.mAllFileLen);
                        }
                        if (i2 == SifliWatchfaceService.mLastProgress) {
                            return;
                        }
                        int unused = SifliWatchfaceService.mLastProgress = i2;
                        SifliWatchfaceService.this.sendWatchfaceProgress(i2);
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialBluetoothConnect(int i) {
                        SifliWatchfaceService.this.mConnectSuccess = true;
                        if (i == 132) {
                            SifliWatchfaceService.this.mError = i;
                        }
                        synchronized (SifliWatchfaceService.this.mLock) {
                            SifliWatchfaceService.this.mLock.notifyAll();
                        }
                    }

                    @Override // com.sifli.serialtransport.OnSerialTransListener
                    public void onSerialMTUChangeResult(int i) {
                        if (i == 23) {
                            Log.d(SifliWatchfaceService.TAG, "onSerialMTUChangeResult use short packet");
                            SifliWatchfaceService.this.mMaxPartLen = 1024;
                        }
                        SifliWatchfaceService.this.MTUIssueList.clear();
                        SifliWatchfaceService.this.MTUIssueList.add("V23");
                        String str = Build.MODEL;
                        if (str.length() > 3) {
                            str = str.substring(0, 3);
                        }
                        if (SifliWatchfaceService.this.MTUIssueList.contains(str)) {
                            Log.w(SifliWatchfaceService.TAG, "use short packet for issue list");
                            SifliWatchfaceService.this.mMaxPartLen = 1024;
                        }
                        Log.i(SifliWatchfaceService.TAG, "packet len final " + SifliWatchfaceService.this.mMaxPartLen);
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.d(SifliWatchfaceService.TAG, "onServiceDisconnected" + componentName.toString());
                SifliWatchfaceService.this.mIsSerialServiceOn = false;
                SifliWatchfaceService.this.mError = 4;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
            }
        };
        this.mStartSerialServiceRunnable = new Runnable() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.3
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliWatchfaceService.TAG, "start serial trans overtime!");
                SifliWatchfaceService.this.mError = 1;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
            }
        };
        this.mSendStartCommandRunnable = new Runnable() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.4
            @Override // java.lang.Runnable
            public void run() {
                Log.e(SifliWatchfaceService.TAG, "serial trans command overtime!");
                SifliWatchfaceService.this.mError = 3;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
            }
        };
        this.mBleBroadcastReceiver = new BroadcastReceiver() { // from class: com.sifli.watchfacelibrary.SifliWatchfaceService.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) != 10) {
                    return;
                }
                Log.e(SifliWatchfaceService.TAG, "Bluetooth off");
                SifliWatchfaceService.this.mError = 5;
                synchronized (SifliWatchfaceService.this.mLock) {
                    SifliWatchfaceService.this.mLock.notifyAll();
                }
            }
        };
    }

    public static void setView(WatchfaceView watchfaceView) {
        Log.d(TAG, "setView");
        mWatchfaceView = watchfaceView;
    }

    public static void setProgressDebug(boolean z) {
        debugProgress = z;
    }

    public static void setUpdateFromPhone(boolean z) {
        mIsUpdateConnection = z;
    }

    public static void startActionWatchface(Context context, ArrayList<WatchfaceFile> arrayList, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        mWatchfaceService = intent;
        intent.setAction(ACTION_WATCHFACE);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_DATA, arrayList);
        intent.putExtra(EXTRA_ADDRESS, str);
        mProgressSendCount = 0;
        context.startService(intent);
    }

    public static void stopActionWatchface(Context context) {
        IWatchfaceService watchfaceStopService2 = getWatchfaceStopService();
        if (watchfaceStopService2 != null) {
            watchfaceStopService2.stopSend();
        }
    }

    public static Intent startActionWatchface(Context context, Uri uri, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(ACTION_WATCHFACE_MKII);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_URI, uri);
        intent.putExtra(EXTRA_ADDRESS, str);
        context.startService(intent);
        return intent;
    }

    public static void startActionWatchface(Context context, String str, String str2, int i) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(ACTION_WATCHFACE_MKII);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_PATH, str);
        intent.putExtra(EXTRA_ADDRESS, str2);
        context.startService(intent);
    }

    public static void startActionWatchface(Context context, String str, String str2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(ACTION_WATCHFACE_MKII);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_PATH, str);
        intent.putExtra(EXTRA_ADDRESS, str2);
        intent.putExtra(EXTRA_ADD_ALIGN, i2);
        context.startService(intent);
    }

    public static Intent startActionWatchface(Context context, Uri uri, String str, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(ACTION_WATCHFACE_MKII);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_URI, uri);
        intent.putExtra(EXTRA_ADDRESS, str);
        intent.putExtra(EXTRA_ADD_ALIGN, i2);
        context.startService(intent);
        return intent;
    }

    public static void startActionWatchface(Context context, byte[] bArr, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) SifliWatchfaceService.class);
        intent.setAction(ACTION_WATCHFACE_MKII);
        intent.putExtra(EXTRA_TYPE, i);
        intent.putExtra(EXTRA_DATA, bArr);
        intent.putExtra(EXTRA_ADDRESS, str);
        context.startService(intent);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Log.e(TAG, "onDestroy");
        super.onDestroy();
        watchfaceStopService = null;
        this.mError = 101;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
        mWatchfaceView = null;
        unregisterBleBroadcast();
        closeTransService();
    }

    public static IWatchfaceService getWatchfaceStopService() {
        return watchfaceStopService;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "version " + WatchfaceUtil.VersionStr);
        this.mRemoteVersion = 0;
        watchfaceStopService = this;
        this.mError = 0;
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (ACTION_WATCHFACE.equals(action)) {
                Log.d(TAG, "watchface");
                registerBleBroadcast();
                handleActionWatchface(intent.getStringExtra(EXTRA_ADDRESS), intent.getParcelableArrayListExtra(EXTRA_DATA), intent.getIntExtra(EXTRA_TYPE, 0));
                return;
            }
            if (ACTION_WATCHFACE_MKII.equals(action)) {
                registerBleBroadcast();
                String stringExtra = intent.getStringExtra(EXTRA_ADDRESS);
                int intExtra = intent.getIntExtra(EXTRA_TYPE, 0);
                Uri uri = (Uri) intent.getParcelableExtra(EXTRA_URI);
                String stringExtra2 = intent.getStringExtra(EXTRA_PATH);
                byte[] byteArrayExtra = intent.getByteArrayExtra(EXTRA_DATA);
                int intExtra2 = intent.getIntExtra(EXTRA_ADD_ALIGN, 0);
                Log.i(TAG, "type " + intExtra + ", addAlignAndCRC " + intExtra2);
                if (stringExtra2 != null) {
                    Log.d(TAG, "get path");
                } else if (uri != null) {
                    Log.d(TAG, "get uri");
                    stringExtra2 = getFilePathFromURI(this, uri);
                } else if (byteArrayExtra != null) {
                    Log.d(TAG, "get zip data");
                    stringExtra2 = saveZipData(byteArrayExtra);
                } else {
                    Log.e(TAG, "uri, path and zip data are null");
                    sendWatchfaceResult(8);
                    return;
                }
                Log.d(TAG, "zip path: " + stringExtra2);
                if (stringExtra2 == null) {
                    sendWatchfaceResult(8);
                    return;
                }
                String str = getCacheDir() + "/wf";
                Log.d(TAG, "new path: " + str);
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileProcess.deleteFolderFile(str, false);
                this.md5 = FileProcess.getMD5(stringExtra2);
                Log.i(TAG, "wf md5 " + this.md5);
                FileProcess.unzipFolder(stringExtra2, str);
                ArrayList<WatchfaceFile> allFiles = getAllFiles(str, new ArrayList<>());
                if (allFiles == null) {
                    sendWatchfaceResult(8);
                    return;
                }
                if (intExtra == 3 || intExtra == 4) {
                    formatData(allFiles);
                } else if (intExtra2 == 1) {
                    formatData(allFiles, intExtra);
                }
                mAllFileLen = 0L;
                Iterator<WatchfaceFile> it = allFiles.iterator();
                while (it.hasNext()) {
                    mAllFileLen += it.next().getFileData().length;
                }
                Collections.sort(allFiles, new WatchfaceFileComparator());
                Log.d(TAG, "watchfaceFile size " + allFiles.size() + ", all files len " + mAllFileLen);
                if (mAllFileLen == 0) {
                    Log.e(TAG, "file is null");
                    sendWatchfaceResult(9);
                } else {
                    mProgressSendCount = 0;
                    handleActionWatchface(stringExtra, allFiles, intExtra);
                }
            }
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

    private String saveZipData(byte[] bArr) {
        String str = getCacheDir() + "/zip";
        File file = new File(str);
        FileProcess.deleteFolderFile(str, false);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str + "/wf.zip");
        Log.d(TAG, "ss " + (str + "/wf.zip"));
        try {
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str2 = getCacheDir() + "/zip/wf.zip";
        if (new File(str2).exists()) {
            Log.d(TAG, "save file success");
            return str2;
        }
        Log.d(TAG, "not exits");
        return null;
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

    private void handleActionWatchface(String str, ArrayList<WatchfaceFile> arrayList, int i) {
        Log.d(TAG, "send type " + i);
        if (this.mError != 0) {
            Log.e(TAG, "exit before start " + this.mError);
            sendWatchfaceResult(this.mError);
            closeTransService();
            return;
        }
        this.mEndState = 0;
        startTransService(str);
        if (this.mError != 0) {
            Log.e(TAG, "exit " + this.mError);
        } else {
            handleSendWatchface(arrayList, i);
            if (this.mError == 100) {
                sendWatchfaceAbortCmd(10);
            }
        }
        sendWatchfaceResult(this.mError);
        closeTransService();
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
                this.mBinder.serialTransSendBlank();
            }
        }
    }

    private void calculateSendSize(ArrayList<WatchfaceFile> arrayList, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += arrayList.get(i3).getFileData().length;
        }
        mAlreadySendLen = i2;
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
            int fileBlockCheck = fileBlockCheck(arrayList);
            if (this.mRemoteVersion >= 3) {
                sendWatchfaceInfoReq(fileBlockCheck, this.md5);
            } else {
                sendWatchfaceInfoReq(fileBlockCheck);
            }
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
            this.mBinder.serialTransDebugProgress();
        }
        int i2 = 0;
        mCurrentSendLen = 0;
        mLastProgress = 0;
        int i3 = this.mResumeState;
        if (i3 != 0 && i3 == 1) {
            i2 = this.mResumeCount - 1;
            Log.i(TAG, "enable resume, send from " + this.mResumeCount);
        }
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

    private void sendWatchfaceTotalStart(int i) {
        byte[] bArr = new byte[11];
        WatchfaceUtil.addShortToByteArray(0, bArr, 0);
        WatchfaceUtil.addShortToByteArray(7, bArr, 2);
        WatchfaceUtil.addShortToByteArray(i, bArr, 4);
        bArr[6] = 2;
        WatchfaceUtil.addIntToByteArray((int) mAllFileLen, bArr, 7);
        Log.d(TAG, "sendWatchfaceTotalStart " + i + ", file len " + mAllFileLen);
        sendWatchfaceLog("sendWatchfaceTotalStart type " + i + ", file len " + mAllFileLen);
        this.mBinder.serialTransSend(bArr, 4);
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
        this.mBinder.serialTransSend(bArr, 4);
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
        mFileLen = bArr.length;
        mSendLen = 0;
        Log.d(TAG, "mMaxPartLen " + this.mMaxPartLen);
        CurrentSendFile currentSendFile = new CurrentSendFile(bArr, this.mMaxPartLen);
        int totalCount = currentSendFile.getTotalCount();
        int i = 0;
        int i2 = 0;
        while (i < totalCount) {
            if (totalCount == 1) {
                this.mProgressType = 0;
            } else {
                this.mProgressType = 1;
            }
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
            this.mBinder.serialTransSendProgress(bArr2, 4);
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
            if (i5 == 0) {
                mSendLen = i2;
            } else if (i5 == 4 || i5 == 7) {
                Log.w(TAG, "index error, continue with " + this.mRemoteExpectIndex);
                i2 -= length;
                i = this.mRemoteExpectIndex - 2;
                this.mError = 0;
            } else {
                this.mError = 2;
                return;
            }
            if (this.mError != 0) {
                Log.w(TAG, "download interrupt with " + this.mError);
                return;
            }
            i++;
        }
    }

    private void sendWatchfaceData(byte[] bArr) {
        Log.d(TAG, "sendWatchfaceData");
        if (bArr.length > this.mMaxPartLen) {
            mSendLen = 0;
            mCurrentSendLen = 0;
            this.mProgressType = 1;
            mFileLen = bArr.length;
            int i = 0;
            int i2 = 0;
            while (i != bArr.length) {
                i2++;
                int min = Math.min(bArr.length - i, this.mMaxPartLen);
                byte[] bArr2 = new byte[min + 8];
                WatchfaceUtil.addShortToByteArray(4, bArr2, 0);
                WatchfaceUtil.addShortToByteArray(min + 4, bArr2, 2);
                WatchfaceUtil.addIntToByteArray(i2, bArr2, 4);
                System.arraycopy(bArr, i, bArr2, 8, min);
                i += min;
                mCurrentSendLen = min;
                this.mBinder.serialTransSend(bArr2, 4);
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
                mSendLen = i;
                if (this.mRspResult != 0) {
                    if (this.mRemoteExpectIndex == 4) {
                        this.mError = 0;
                    }
                    this.mError = 2;
                    return;
                }
            }
            return;
        }
        this.mProgressType = 0;
        byte[] bArr3 = new byte[bArr.length + 8];
        WatchfaceUtil.addShortToByteArray(4, bArr3, 0);
        WatchfaceUtil.addShortToByteArray(bArr.length + 4, bArr3, 2);
        WatchfaceUtil.addIntToByteArray(0, bArr3, 4);
        System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
        this.mBinder.serialTransSend(bArr3, 4);
        this.isRspReceived = false;
        synchronized (this.mLock) {
            while (!this.isRspReceived && this.mError == 0) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (this.mRspResult != 0) {
            this.mError = 2;
        }
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

    private void sendWatchfaceEnd() {
        Log.d(TAG, "sendWatchfaceEnd");
        byte[] bArr = new byte[4];
        this.mEndState = 1;
        sendWatchfaceLog("sendWatchfaceEnd");
        WatchfaceUtil.addShortToByteArray(6, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mBinder.serialTransSend(bArr, 4);
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

    private void sendWatchfaceTotalEnd() {
        Log.d(TAG, "sendWatchfaceTotalEnd");
        byte[] bArr = new byte[4];
        WatchfaceUtil.addShortToByteArray(8, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mBinder.serialTransSend(bArr, 4);
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

    private void sendWatchfaceLoseCheckRsp() {
        Log.d(TAG, "sendWatchfaceLoseCheckRsp");
        byte[] bArr = new byte[4];
        WatchfaceUtil.addShortToByteArray(11, bArr, 0);
        WatchfaceUtil.addShortToByteArray(0, bArr, 2);
        this.mBinder.serialTransSend(bArr, 4);
    }

    private void sendWatchfaceAbortCmd(int i) {
        Log.d(TAG, "sendWatchfaceAbortCmd");
        byte[] bArr = new byte[5];
        WatchfaceUtil.addShortToByteArray(12, bArr, 0);
        WatchfaceUtil.addShortToByteArray(1, bArr, 2);
        bArr[4] = (byte) i;
        this.mBinder.serialTransSend(bArr, 4);
        this.mAbortFinish = false;
        this.mTimerHandler.postDelayed(this.mAbortHandler, 1000L);
        synchronized (this.mLock) {
            while (!this.mAbortFinish) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void sendWatchfaceInfoReq(int i) {
        Log.d(TAG, "sendWatchfaceInfoReq");
        byte[] bArr = new byte[8];
        WatchfaceUtil.addShortToByteArray(13, bArr, 0);
        WatchfaceUtil.addShortToByteArray(4, bArr, 2);
        WatchfaceUtil.addIntToByteArray(i, bArr, 4);
        this.mBinder.serialTransSend(bArr, 4);
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

    private void sendWatchfaceInfoReq(int i, String str) {
        Log.d(TAG, "sendWatchfaceInfoReq md5 " + str);
        byte[] bArr = new byte[40];
        WatchfaceUtil.addShortToByteArray(13, bArr, 0);
        WatchfaceUtil.addShortToByteArray(36, bArr, 2);
        WatchfaceUtil.addIntToByteArray(i, bArr, 4);
        System.arraycopy(str.getBytes(StandardCharsets.UTF_8), 0, bArr, 8, 32);
        this.mBinder.serialTransSend(bArr, 4);
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
        if (this.mRemoteVersion >= 3 && bArr.length > 4) {
            this.mResumeState = WatchfaceUtil.getUnsignedShortFromByteArray(bArr, 4);
            this.mResumeCount = WatchfaceUtil.getUnsignedShortFromByteArray(bArr, 6);
            Log.d(TAG, "info rsp resume state " + this.mResumeState + ", resume count " + this.mResumeCount);
        } else {
            this.mResumeState = 0;
        }
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

    private void startTransService(String str) {
        Intent intent = new Intent(this, (Class<?>) serialTransService.class);
        Log.d(TAG, "startTransService " + str);
        intent.putExtra(serialTransService.EXTRA_DEVICE_ADDRESS, str);
        this.mIsSerialServiceOn = false;
        startService(intent);
        bindService(intent, this.mConnection, 1);
        this.mTimerHandler.postDelayed(this.mStartSerialServiceRunnable, 60000L);
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
        this.mTimerHandler.removeCallbacks(this.mStartSerialServiceRunnable);
        if (this.mIsSerialServiceOn && this.mError == 0) {
            this.mTimerHandler.postDelayed(this.mStartSerialServiceRunnable, 60000L);
            this.mConnectSuccess = false;
            serialTransService.serialTransBinder serialtransbinder = this.mBinder;
            if (serialtransbinder == null) {
                this.mError = 1;
                return;
            }
            serialtransbinder.connectBluetoothWithUpdate(Boolean.valueOf(mIsUpdateConnection));
            synchronized (this.mLock) {
                while (!this.mConnectSuccess && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.mTimerHandler.removeCallbacks(this.mStartSerialServiceRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeTransService() {
        if (this.mIsSerialServiceOn) {
            this.mIsSerialServiceOn = false;
            unbindService(this.mConnection);
            stopService(new Intent(this, (Class<?>) serialTransService.class));
        }
    }

    protected void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                this.mLock.wait(j);
            } catch (InterruptedException unused) {
                Log.e(TAG, "Sleeping interrupted");
            }
        }
    }

    void sendWatchfaceResult(int i) {
        Log.e(TAG, "send result broadcast " + i + ", result " + this.mRspResult);
        if (mWatchfaceView != null) {
            mWatchfaceView.getMutableLiveData().postValue(new WatchfaceMessage(1, i, this.mRspResult, null));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE");
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE", i);
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE", this.mRspResult);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    void sendWatchfaceProgress(int i) {
        if (debugProgress) {
            Log.d(TAG, "sendWatchfaceProgress " + i);
        }
        if (mWatchfaceView != null) {
            mWatchfaceView.getMutableLiveData().postValue(new WatchfaceMessage(0, 0, i, null));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS");
            intent.putExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS", i);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    void sendWatchfaceLog(String str) {
        if (mWatchfaceView != null) {
            mWatchfaceView.getMutableLiveData().postValue(new WatchfaceMessage(2, 0, 0, str));
        } else {
            Intent intent = new Intent("com.sifli.watchfacelibrary.broadcast.BROADCAST_LOG");
            intent.putExtra("com.sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_LOG", str);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    private void registerBleBroadcast() {
        registerReceiver(this.mBleBroadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.isBroadcastRegistered = true;
    }

    private void unregisterBleBroadcast() {
        if (this.isBroadcastRegistered) {
            this.isBroadcastRegistered = false;
            unregisterReceiver(this.mBleBroadcastReceiver);
        }
    }

    public static String getFilePathFromURI(Context context, Uri uri) {
        File externalFilesDir = context.getExternalFilesDir(null);
        String fileName = getFileName(uri);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(externalFilesDir + File.separator + fileName);
        copyFile(context, uri, file);
        return file.getAbsolutePath();
    }

    public static void copyFile(Context context, Uri uri, File file) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            copyStream(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int copyStream(InputStream inputStream, OutputStream outputStream) throws Exception, IOException {
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 2048);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 2048);
        int i = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, "out close error", e);
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e2) {
            Log.e(TAG, "in close error", e2);
        }
        return i;
    }

    public static String getFileName(Uri uri) {
        String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    @Override // com.sifli.watchfacelibrary.IWatchfaceService
    public void stopSend() {
        Log.d(TAG, "stopSend");
        this.mError = 100;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }
}
