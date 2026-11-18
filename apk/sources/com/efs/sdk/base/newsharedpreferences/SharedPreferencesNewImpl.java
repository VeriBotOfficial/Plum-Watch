package com.efs.sdk.base.newsharedpreferences;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class SharedPreferencesNewImpl implements SharedPreferences {
    private static final String BACKUP_FILE_SUFFIX = ".bak";
    private static final int CONTENT_LENGTH_LOST = 1;
    private static final int CONTENT_OVER_SIZE = 7;
    private static final int DATA_TYPE_ERROR = 8;
    private static final int DATA_TYPE_INVALID = 9;
    private static final long DELAY_TIME_TO_SAVE = 1000;
    private static final byte FINISH_MARK = 18;
    private static final int FINISH_MARK_LENGTH = 1;
    private static final int ID_LENGTH = 4;
    private static final int INIT_EXCEPTION = 10;
    private static final int LOAD_BAK_FILE = 12;
    private static final int MAPPED_BUFFER_ERROR = 4;
    private static final int MAX_HANDLERTHREAD = 3;
    private static final long MAX_LOCK_FILE_TIME = 10000;
    private static final int MAX_NUM = Integer.MAX_VALUE;
    private static final int MAX_TRY_TIME = 6;
    private static final int MIN_INCREASE_LENGTH = 1024;
    private static final int MODIFY_ID_LOST = 2;
    private static final int OTHER_EXCEPTION = 11;
    private static final String TAG = "SharedPreferencesNew";
    private static final long TRY_RELOAD_INTERVAL = 60;
    private static final int TRY_SAVE_TIME_DELAY = 2000;
    private static final int TYPE_CAST_EXCEPTION = 13;
    private static final int VALUE_LOST = 3;
    private static final Object mFileMonitorSyncObj = new Object();
    private static HandlerThread[] mHandlerThreadPool = new HandlerThread[3];
    private static final int mSaveMessageID = 21310;
    private static ExecutorService sCachedThreadPool;
    private String mBackupFilePath;
    private int mCurTryTime;
    private Vector<SharedPreferences.Editor> mEditorList;
    private OnSharedPreferenceErrorListener mErrorListener;
    private File mFile;
    private FileChannel mFileChannel;
    private FileMonitor mFileMonitor;
    private Handler mHandler;
    private boolean mIsSaving;
    private final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    private boolean mLoaded;
    private final LinkedHashMap<String, Object> mMap;
    private MappedByteBuffer mMappedByteBuffer;
    private int mModifyErrorCnt;
    private int mModifyID;
    private RunnableEx mSaveRunnable;
    private final Object mSyncObj;
    private final Object mSyncSaveObj;
    private final Runnable mTryReloadRunnable;
    private long mTryReloadStartTime;

    public interface OnSharedPreferenceErrorListener {
        void onError(String str, int r2, long j);
    }

    final boolean checkTypeValid(byte b) {
        return b == 4 || b == 2 || b == 1 || b == 3 || b == 5;
    }

    static {
        for (int r1 = 0; r1 < 3; r1++) {
            mHandlerThreadPool[r1] = new HandlerThread("newsp".concat(String.valueOf(r1)));
            mHandlerThreadPool[r1].start();
        }
        sCachedThreadPool = Executors.newCachedThreadPool();
    }

    class SUPPORTED_TYPE {
        static final byte TYPE_BOOLEAN = 4;
        static final byte TYPE_FLOAT = 2;
        static final byte TYPE_INT = 1;
        static final byte TYPE_LONG = 3;
        static final byte TYPE_STRING = 5;

        private SUPPORTED_TYPE() {
        }
    }

    public SharedPreferencesNewImpl(File file) {
        this(file, 0, null, false);
    }

    public SharedPreferencesNewImpl(File file, boolean z) {
        this(file, 0, null, z);
    }

    public SharedPreferencesNewImpl(File file, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, 0, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int r3, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, r3, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int r2, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener, boolean z) {
        this.mMap = new LinkedHashMap<>();
        this.mListeners = new ArrayList<>();
        this.mLoaded = true;
        this.mSyncObj = new Object();
        this.mSyncSaveObj = new Object();
        this.mEditorList = new Vector<>();
        this.mIsSaving = false;
        this.mTryReloadRunnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.2
            @Override // java.lang.Runnable
            public void run() {
                int modifyID = SharedPreferencesNewImpl.this.getModifyID();
                if (modifyID <= 0 || modifyID == SharedPreferencesNewImpl.this.mModifyID) {
                    return;
                }
                SharedPreferencesNewImpl.this.saveInner(false);
            }
        };
        this.mSaveRunnable = new RunnableEx() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferencesNewImpl.this.saveInner(((Boolean) getArg()).booleanValue());
            }
        };
        this.mErrorListener = onSharedPreferenceErrorListener;
        this.mHandler = new Handler(getHandlerThread().getLooper());
        this.mFile = file;
        this.mBackupFilePath = file.getAbsolutePath() + BACKUP_FILE_SUFFIX;
        if (initBuffer()) {
            startLoadFromDisk(z);
        }
        this.mHandler.post(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    File file2 = new File(SharedPreferencesNewImpl.this.mBackupFilePath);
                    if (file2.exists()) {
                        return;
                    }
                    file2.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap map;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            map = new HashMap(this.mMap);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    String str3 = (String) this.mMap.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (ClassCastException e) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        String string = sb.append(file != null ? file.getAbsolutePath() : null).append("#").append(str).append(e).toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        throw new RuntimeException("putStringSet is not supported!");
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int r7) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Integer num = (Integer) this.mMap.get(str);
                    if (num != null) {
                        r7 = num.intValue();
                    }
                } catch (ClassCastException e) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        String string = sb.append(file != null ? file.getAbsolutePath() : null).append("#").append(str).append(e).toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return r7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r7;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Long l = (Long) this.mMap.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (ClassCastException e) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        String string = sb.append(file != null ? file.getAbsolutePath() : null).append("#").append(str).append(e).toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Float f2 = (Float) this.mMap.get(str);
                    if (f2 != null) {
                        f = f2.floatValue();
                    }
                } catch (ClassCastException e) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        String string = sb.append(file != null ? file.getAbsolutePath() : null).append("#").append(str).append(e).toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    Boolean bool = (Boolean) this.mMap.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (ClassCastException e) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        String string = sb.append(file != null ? file.getAbsolutePath() : null).append("#").append(str).append(e).toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean zContainsKey;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            zContainsKey = this.mMap.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        awaitLoadedLocked();
        return new EditorImpl();
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.add(onSharedPreferenceChangeListener);
                if (this.mFileMonitor == null) {
                    try {
                        File file = new File(this.mBackupFilePath);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.mFileMonitor = new FileMonitor(this.mBackupFilePath, 2);
                }
            }
            synchronized (mFileMonitorSyncObj) {
                this.mFileMonitor.startWatching();
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.remove(onSharedPreferenceChangeListener);
                if (this.mFileMonitor != null && this.mListeners.size() <= 0) {
                    this.mFileMonitor.stopWatching();
                }
            }
        }
    }

    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear;
        private HashMap<String, Object> mModified = new HashMap<>();

        public EditorImpl() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new RuntimeException("putStringSet is not supported!");
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int r3) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(r3));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, null);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            SharedPreferencesNewImpl.this.save(this, false, true, false);
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            SharedPreferencesNewImpl.this.save(this, false, false, true);
        }

        final boolean doClear() {
            boolean z;
            synchronized (this) {
                z = this.mClear;
                this.mClear = false;
            }
            return z;
        }

        final HashMap<String, Object> getAll() {
            HashMap<String, Object> map;
            synchronized (this) {
                map = this.mModified;
            }
            return map;
        }
    }

    private boolean merge(SharedPreferences.Editor editor, Map map, boolean z) {
        if (editor == null) {
            return false;
        }
        EditorImpl editorImpl = (EditorImpl) editor;
        boolean zDoClear = editorImpl.doClear();
        if (zDoClear) {
            map.clear();
            this.mEditorList.clear();
        }
        HashMap<String, Object> all = editorImpl.getAll();
        if (all.size() == 0) {
            return zDoClear;
        }
        synchronized (editor) {
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    map.remove(key);
                } else {
                    if (map.containsKey(key)) {
                        map.remove(key);
                    }
                    map.put(key, value);
                }
                if (!z) {
                    notifyDataChanged(key);
                }
            }
        }
        return true;
    }

    private void notifyDataChanged(String str) {
        if (this.mListeners.size() > 0) {
            for (int r0 = 0; r0 < this.mListeners.size(); r0++) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.mListeners.get(r0);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryReload() {
        if (SystemClock.uptimeMillis() - this.mTryReloadStartTime > 60) {
            this.mTryReloadStartTime = SystemClock.uptimeMillis();
            this.mHandler.removeCallbacks(this.mTryReloadRunnable);
            this.mHandler.post(this.mTryReloadRunnable);
        }
    }

    private boolean tryReloadWhenSave() {
        int modifyID = getModifyID();
        if (modifyID <= 0 || modifyID == this.mModifyID) {
            return false;
        }
        load(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveInner(final boolean z) {
        synchronized (this.mSyncSaveObj) {
            FileLock fileLockLockFile = lockFile(false);
            if (fileLockLockFile != null) {
                try {
                    this.mIsSaving = true;
                    if (tryReloadWhenSave()) {
                        mergeWhenReload();
                        notifyDataChanged(null);
                    }
                    synchronized (this.mMap) {
                        if (this.mEditorList.size() <= 0) {
                            try {
                                fileLockLockFile.release();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            this.mIsSaving = false;
                            return;
                        }
                        saveToMappedBuffer(obtainTotalBytes(), z);
                        backup();
                        try {
                            fileLockLockFile.release();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        this.mIsSaving = false;
                        throw th;
                    }
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                        if (onSharedPreferenceErrorListener != null) {
                            onSharedPreferenceErrorListener.onError(th.getMessage(), 11, -1L);
                            try {
                                fileLockLockFile.release();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        } else {
                            fileLockLockFile.release();
                        }
                    } catch (Throwable th2) {
                        try {
                            fileLockLockFile.release();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        this.mIsSaving = false;
                        throw th2;
                    }
                }
            } else {
                int r1 = this.mCurTryTime;
                this.mCurTryTime = r1 + 1;
                if (r1 < 6) {
                    this.mHandler.postDelayed(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.3
                        @Override // java.lang.Runnable
                        public void run() {
                            SharedPreferencesNewImpl.this.saveInner(z);
                        }
                    }, 2000L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save(SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
        if (editor == null) {
            return;
        }
        synchronized (this.mMap) {
            this.mCurTryTime = 0;
            if (!merge(editor, this.mMap, false)) {
                if (this.mEditorList.size() == 0) {
                    return;
                }
            } else {
                this.mEditorList.add(editor);
            }
            if (z2) {
                saveInner(z);
                return;
            }
            long j = z3 ? 1000L : 0L;
            this.mSaveRunnable.setArg(Boolean.valueOf(z));
            Message messageObtain = Message.obtain(this.mHandler, this.mSaveRunnable);
            messageObtain.what = mSaveMessageID;
            this.mHandler.sendMessageDelayed(messageObtain, j);
        }
    }

    private Pair<Integer, byte[][]> getDataBytes() {
        byte[][] bArr;
        ArrayList arrayList;
        synchronized (this.mMap) {
            bArr = new byte[this.mMap.size() * 5][];
            arrayList = new ArrayList(this.mMap.entrySet());
            this.mEditorList.clear();
        }
        int r5 = 0;
        int r6 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Map.Entry entry = (Map.Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && str.trim().length() > 0 && value != null) {
                byte[] bytes = str.getBytes();
                byte[] bArrIntToBytes = ByteIntUtils.intToBytes(bytes.length);
                bArr[r6] = bArrIntToBytes;
                bArr[r6 + 1] = bytes;
                int length = r5 + bArrIntToBytes.length + bytes.length;
                byte[] bytes2 = getBytes(value);
                byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(bytes2.length);
                bArr[r6 + 2] = bArrIntToBytes2;
                bArr[r6 + 3] = bytes2;
                int length2 = length + bArrIntToBytes2.length + bytes2.length;
                bArr[r6 + 4] = new byte[]{(byte) getObjectType(value)};
                r5 = length2 + 1;
                r6 += 5;
            }
        }
        return new Pair<>(Integer.valueOf(r5), bArr);
    }

    private void saveToMappedBuffer(byte[] bArr, boolean z) {
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(0);
            safeBufferPut(this.mMappedByteBuffer, bArr);
            if (z) {
                this.mMappedByteBuffer.force();
            }
        }
    }

    private int increaseModifyID() {
        int r0 = (this.mModifyID + 1) % Integer.MAX_VALUE;
        this.mModifyID = r0;
        return r0;
    }

    private int getContentLength() {
        if (this.mMappedByteBuffer == null || this.mFileChannel == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(0);
            byte[] bArr = new byte[4];
            safeBufferGet(this.mMappedByteBuffer, bArr);
            int r4 = ByteIntUtils.bytesToInt(bArr);
            this.mMappedByteBuffer.position(4);
            byte b = this.mMappedByteBuffer.get();
            if ((b == 18 || b == getMaskByte(bArr)) && r4 >= 0) {
                if (r4 > Integer.MAX_VALUE) {
                    r4 = Integer.MAX_VALUE;
                }
                return r4;
            }
            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
            if (onSharedPreferenceErrorListener != null) {
                File file = this.mFile;
                String absolutePath = file != null ? file.getAbsolutePath() : null;
                File file2 = this.mFile;
                onSharedPreferenceErrorListener.onError(absolutePath, 1, file2 != null ? file2.length() : 0L);
            }
            return -1;
        }
    }

    private void reallocBuffer() {
        if (this.mMappedByteBuffer == null) {
            return;
        }
        synchronized (this.mSyncObj) {
            try {
                int contentLength = getContentLength();
                if (contentLength > this.mMappedByteBuffer.capacity()) {
                    allocBuffer(contentLength + 1024);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x00e7  */
    private void load(boolean z) {
        byte[] bArr = null;
        FileLock fileLockLockFile = z ? null : lockFile(true);
        if (fileLockLockFile == null && !z) {
            if (z) {
                return;
            }
            loadFromBakFile();
            return;
        }
        boolean bytesIntoMap = false;
        try {
            try {
                try {
                    reallocBuffer();
                    MappedByteBuffer mappedByteBuffer = this.mMappedByteBuffer;
                    if (mappedByteBuffer != null && mappedByteBuffer.capacity() != 0) {
                        long contentLength = getContentLength();
                        if (contentLength <= 10) {
                            try {
                                bytesIntoMap = parseBytesIntoMap(null, true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (!bytesIntoMap || this.mModifyID < 0) {
                                loadFromBakFile();
                            }
                            if (fileLockLockFile != null) {
                                try {
                                    fileLockLockFile.release();
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        }
                        int modifyID = getModifyID();
                        this.mModifyID = modifyID;
                        if (modifyID > 0) {
                            synchronized (this.mSyncObj) {
                                try {
                                    this.mMappedByteBuffer.position(10);
                                    bArr = new byte[((int) contentLength) - 10];
                                    safeBufferGet(this.mMappedByteBuffer, bArr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        try {
                            bytesIntoMap = parseBytesIntoMap(bArr, true);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        if (!bytesIntoMap || (bArr == null && this.mModifyID < 0)) {
                            loadFromBakFile();
                        }
                        if (fileLockLockFile != null) {
                            try {
                                fileLockLockFile.release();
                                return;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                return;
                            }
                        }
                        return;
                        try {
                            bytesIntoMap = parseBytesIntoMap(bArr, true);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        if (bytesIntoMap || (bArr == null && this.mModifyID < 0)) {
                            loadFromBakFile();
                        }
                        if (fileLockLockFile != null) {
                            try {
                                fileLockLockFile.release();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                return;
                            }
                        }
                    }
                    try {
                        bytesIntoMap = parseBytesIntoMap(null, true);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    if (!bytesIntoMap || this.mModifyID < 0) {
                        loadFromBakFile();
                    }
                    if (fileLockLockFile != null) {
                        try {
                            fileLockLockFile.release();
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                } catch (OutOfMemoryError unused) {
                    this.mFile.delete();
                    new File(this.mBackupFilePath).delete();
                    bytesIntoMap = parseBytesIntoMap(bArr, true);
                    if (bytesIntoMap) {
                        loadFromBakFile();
                    } else {
                        loadFromBakFile();
                    }
                    if (fileLockLockFile != null) {
                        fileLockLockFile.release();
                    }
                } catch (Throwable unused2) {
                    bytesIntoMap = parseBytesIntoMap(bArr, true);
                    if (bytesIntoMap) {
                        loadFromBakFile();
                    } else {
                        loadFromBakFile();
                    }
                    if (fileLockLockFile != null) {
                        try {
                            fileLockLockFile.release();
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (bytesIntoMap || (bArr == null && this.mModifyID < 0)) {
                loadFromBakFile();
            }
            if (fileLockLockFile != null) {
                fileLockLockFile.release();
            }
        }
    }

    final int getModifyID() {
        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener;
        if (this.mMappedByteBuffer == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            this.mMappedByteBuffer.position(5);
            byte[] bArr = new byte[4];
            safeBufferGet(this.mMappedByteBuffer, bArr);
            int r3 = ByteIntUtils.bytesToInt(bArr);
            this.mMappedByteBuffer.position(9);
            byte b = this.mMappedByteBuffer.get();
            if ((b == 18 || b == getMaskByte(bArr)) && r3 >= 0) {
                return r3;
            }
            int r2 = this.mModifyErrorCnt + 1;
            this.mModifyErrorCnt = r2;
            if (r2 < 3 && (onSharedPreferenceErrorListener = this.mErrorListener) != null) {
                File file = this.mFile;
                String absolutePath = file != null ? file.getAbsolutePath() : null;
                File file2 = this.mFile;
                onSharedPreferenceErrorListener.onError(absolutePath, 2, file2 != null ? file2.length() : 0L);
            }
            return -1;
        }
    }

    private void startLoadFromDisk(boolean z) {
        synchronized (this) {
            this.mLoaded = false;
        }
        Runnable runnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (SharedPreferencesNewImpl.this) {
                    SharedPreferencesNewImpl.this.loadFromDiskLocked();
                }
            }
        };
        if (z) {
            runnable.run();
        } else {
            sCachedThreadPool.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFromDiskLocked() {
        if (this.mLoaded) {
            return;
        }
        load(false);
        this.mLoaded = true;
        notifyAll();
    }

    private void awaitLoadedLocked() {
        if (!this.mLoaded) {
            synchronized (this) {
                while (!this.mLoaded) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        tryReload();
    }

    private boolean safeBufferGet(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        int r1 = mappedByteBuffer.position();
        if (r1 + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    private MappedByteBuffer allocBuffer(int r8) {
        MappedByteBuffer mappedByteBuffer = this.mMappedByteBuffer;
        int r0 = mappedByteBuffer != null ? mappedByteBuffer.position() : 0;
        try {
            this.mMappedByteBuffer = this.mFileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, r8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MappedByteBuffer mappedByteBuffer2 = this.mMappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.position(r0);
        }
        return this.mMappedByteBuffer;
    }

    private boolean initBuffer() {
        boolean zExists = true;
        if (this.mMappedByteBuffer != null) {
            return true;
        }
        try {
            if (!this.mFile.exists()) {
                this.mFile.getParentFile().mkdirs();
                this.mFile.createNewFile();
                zExists = new File(this.mBackupFilePath).exists();
            } else if (this.mFile.length() == 0) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mFile.getAbsolutePath(), 4, this.mFile.length());
                }
                zExists = false;
            }
            this.mFileChannel = new RandomAccessFile(this.mFile, "rw").getChannel();
            allocBuffer(10);
            if (zExists) {
                return zExists;
            }
            initFileHeader();
            return zExists;
        } catch (Exception e) {
            e.printStackTrace();
            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
            if (onSharedPreferenceErrorListener2 != null) {
                onSharedPreferenceErrorListener2.onError(this.mFile.getAbsolutePath() + " " + e.getCause(), 10, -1L);
            }
            return false;
        }
    }

    private FileLock lockFile(boolean z) throws IOException {
        FileChannel fileChannel = this.mFileChannel;
        FileLock fileLockTryLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            while (fileLockTryLock == null) {
                try {
                    fileLockTryLock = this.mFileChannel.tryLock();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (fileLockTryLock == null) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (SystemClock.uptimeMillis() - jUptimeMillis > 10000) {
                    return fileLockTryLock;
                }
            }
            return fileLockTryLock;
        }
        try {
            return fileChannel.tryLock();
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void setSharedPreferenceErrorListener(OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this.mErrorListener = onSharedPreferenceErrorListener;
    }

    private void safeBufferPut(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return;
        }
        if (mappedByteBuffer.position() + bArr.length >= mappedByteBuffer.capacity()) {
            mappedByteBuffer = allocBuffer(mappedByteBuffer.position() + bArr.length + 1024);
        }
        mappedByteBuffer.put(bArr);
    }

    private void mergeWhenReload() {
        synchronized (this.mMap) {
            if (this.mEditorList.size() > 0) {
                Iterator<SharedPreferences.Editor> it = this.mEditorList.iterator();
                while (it.hasNext()) {
                    merge(it.next(), this.mMap, true);
                }
            }
        }
    }

    private boolean parseBytesIntoMap(byte[] bArr, boolean z) {
        LinkedHashMap linkedHashMap;
        synchronized (this.mMap) {
            if (z) {
                try {
                    linkedHashMap = new LinkedHashMap(this.mMap);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                linkedHashMap = null;
            }
            if (z && this.mModifyID > 0) {
                this.mMap.clear();
            }
            if (bArr != null && bArr.length != 0) {
                boolean z2 = false;
                boolean z3 = true;
                int r5 = 0;
                while (true) {
                    if (r5 >= bArr.length) {
                        z2 = z3;
                        break;
                    }
                    try {
                        Pair<byte[], Integer> oneString = getOneString(bArr, r5);
                        Pair<byte[], Integer> oneString2 = getOneString(bArr, ((Integer) oneString.second).intValue());
                        int r8 = ((Integer) oneString2.second).intValue();
                        byte b = bArr[r8];
                        byte b2 = bArr[r8 + 1];
                        int r9 = r8 + 2;
                        if (b2 != 18 && b2 != getMaskByte(new byte[]{b})) {
                            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                            if (onSharedPreferenceErrorListener == null) {
                                break;
                            }
                            File file = this.mFile;
                            onSharedPreferenceErrorListener.onError(file != null ? file.getAbsolutePath() : null, 8, bArr.length);
                            break;
                        }
                        if (!checkTypeValid(b)) {
                            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
                            if (onSharedPreferenceErrorListener2 != null) {
                                File file2 = this.mFile;
                                onSharedPreferenceErrorListener2.onError(file2 != null ? file2.getAbsolutePath() : null, 9, bArr.length);
                            }
                            z3 = false;
                        } else {
                            Object objectByType = getObjectByType((byte[]) oneString2.first, b);
                            if (oneString.first != null && ((byte[]) oneString.first).length > 0 && objectByType != null) {
                                String str = new String((byte[]) oneString.first);
                                if (z || !this.mMap.containsKey(str)) {
                                    this.mMap.put(str, objectByType);
                                }
                            }
                        }
                        r5 = r9;
                    } catch (Exception e) {
                        e.printStackTrace();
                        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener3 = this.mErrorListener;
                        if (onSharedPreferenceErrorListener3 != null) {
                            StringBuilder sb = new StringBuilder();
                            File file3 = this.mFile;
                            onSharedPreferenceErrorListener3.onError(sb.append(file3 != null ? file3.getAbsolutePath() : null).append("#").append(e.getCause()).toString(), 3, bArr.length);
                        }
                    }
                }
                if (!z2 && z) {
                    this.mMap.putAll(linkedHashMap);
                }
                return z2;
            }
            return true;
        }
    }

    private Pair<byte[], Integer> getOneString(byte[] bArr, int r7) throws Exception {
        int r1;
        byte[] bArr2;
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, r7, bArr3, 0, 4);
        byte b = bArr[r7 + 4];
        if (b != 18 && b != getMaskByte(bArr3)) {
            throw new Exception("length string's finish mark missing");
        }
        int r8 = r7 + 5;
        int r0 = ByteIntUtils.bytesToInt(bArr3);
        if (r0 < 0 || (r1 = r8 + r0) >= bArr.length || r0 > Integer.MAX_VALUE) {
            throw new Exception("length string is invalid");
        }
        if (r0 != 0) {
            bArr2 = new byte[r0];
            System.arraycopy(bArr, r8, bArr2, 0, r0);
            byte b2 = bArr[r1];
            if (b2 != 18 && b2 != getMaskByte(bArr2)) {
                throw new Exception("Stored bytes' finish mark missing");
            }
            r8 = r1;
        } else {
            bArr2 = null;
        }
        return new Pair<>(bArr2, Integer.valueOf(r8 + 1));
    }

    private byte[] obtainTotalBytes() {
        Pair<Integer, byte[][]> dataBytes = getDataBytes();
        int r2 = ((Integer) dataBytes.first).intValue() + 10 + ((byte[][]) dataBytes.second).length;
        if (r2 > Integer.MAX_VALUE) {
            r2 = Integer.MAX_VALUE;
        }
        byte[] bArr = new byte[r2];
        byte[] bArrIntToBytes = ByteIntUtils.intToBytes(r2);
        System.arraycopy(bArrIntToBytes, 0, bArr, 0, bArrIntToBytes.length);
        int length = bArrIntToBytes.length;
        bArr[length] = getMaskByte(bArrIntToBytes);
        int r4 = length + 1;
        byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(increaseModifyID());
        System.arraycopy(bArrIntToBytes2, 0, bArr, r4, bArrIntToBytes2.length);
        int length2 = r4 + bArrIntToBytes2.length;
        bArr[length2] = getMaskByte(bArrIntToBytes2);
        int r5 = length2 + 1;
        for (byte[] bArr2 : (byte[][]) dataBytes.second) {
            if (bArr2 != null) {
                if (bArr2.length + r5 + 1 <= Integer.MAX_VALUE) {
                    System.arraycopy(bArr2, 0, bArr, r5, bArr2.length);
                    int length3 = r5 + bArr2.length;
                    bArr[length3] = getMaskByte(bArr2);
                    r5 = length3 + 1;
                } else {
                    StringBuilder sb = new StringBuilder("Write too much data in ");
                    File file = this.mFile;
                    Log.e(TAG, sb.append(file != null ? file.getAbsolutePath() : null).toString());
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener == null) {
                        break;
                    }
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(file2 != null ? file2.getAbsolutePath() : null, 7, -1L);
                    break;
                }
            }
        }
        return bArr;
    }

    private void initFileHeader() {
        if (this.mMappedByteBuffer != null) {
            byte[] bArr = new byte[10];
            byte[] bArrIntToBytes = ByteIntUtils.intToBytes(0);
            System.arraycopy(bArrIntToBytes, 0, bArr, 0, 4);
            bArr[4] = getMaskByte(bArrIntToBytes);
            byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(0);
            System.arraycopy(bArrIntToBytes2, 0, bArr, 5, 4);
            bArr[9] = getMaskByte(bArrIntToBytes2);
            this.mMappedByteBuffer.position(0);
            this.mMappedByteBuffer.put(bArr);
        }
    }

    private int getObjectType(Object obj) {
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof Boolean) {
            return 4;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        return obj instanceof Long ? 3 : 0;
    }

    private Object getObjectByType(byte[] bArr, int r4) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            if (r4 == 5) {
                return new String(bArr);
            }
            boolean z = true;
            if (r4 == 4) {
                if (bArr[0] != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (r4 == 2) {
                return Float.valueOf(ByteFloatUtils.bytesToFloat(bArr));
            }
            if (r4 == 1) {
                return Integer.valueOf(ByteIntUtils.bytesToInt(bArr));
            }
            if (r4 == 3) {
                return Long.valueOf(ByteLongUtils.bytesToLong(bArr));
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private byte[] getBytes(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                return ((String) obj).getBytes();
            }
            if (obj instanceof Boolean) {
                return new byte[]{((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0};
            }
            if (obj instanceof Float) {
                return ByteFloatUtils.floatToBytes(((Float) obj).floatValue());
            }
            if (obj instanceof Integer) {
                return ByteIntUtils.intToBytes(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return ByteLongUtils.longToBytes(((Long) obj).longValue());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    static class ByteLongUtils {
        private ByteLongUtils() {
        }

        public static byte[] longToBytes(long j) {
            return ByteBuffer.allocate(8).putLong(j).array();
        }

        public static long bytesToLong(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getLong();
        }
    }

    static class ByteIntUtils {
        private ByteIntUtils() {
        }

        public static byte[] intToBytes(int r1) {
            return ByteBuffer.allocate(4).putInt(r1).array();
        }

        public static int bytesToInt(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getInt();
        }
    }

    static class ByteFloatUtils {
        private ByteFloatUtils() {
        }

        public static byte[] floatToBytes(float f) {
            return ByteBuffer.allocate(4).putFloat(f).array();
        }

        public static float bytesToFloat(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getFloat();
        }
    }

    private void backup() {
        Throwable th;
        Closeable closeable;
        FileChannel channel = null;
        try {
            File file = new File(this.mBackupFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                channel = fileOutputStream.getChannel();
                this.mFileChannel.transferTo(0L, this.mMappedByteBuffer.capacity(), channel);
                safeClose(fileOutputStream);
                safeClose(channel);
            } catch (Throwable th2) {
                closeable = channel;
                channel = fileOutputStream;
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    safeClose(channel);
                    safeClose(closeable);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    private void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    private boolean loadFromBakFile() {
        byte[] bArr;
        int r2 = 0;
        int length = 0;
        boolean bytesIntoMap = true;
        RandomAccessFile randomAccessFile = null;
        byte[] bArr2 = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.mBackupFilePath, "r");
            try {
                byte[] bArr3 = new byte[4];
                randomAccessFile2.read(bArr3, 0, 4);
                int length2 = ByteIntUtils.bytesToInt(bArr3);
                if (length2 <= 10) {
                    safeClose(randomAccessFile2);
                    try {
                        parseBytesIntoMap(null, false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }
                if (length2 > Integer.MAX_VALUE) {
                    length2 = Integer.MAX_VALUE;
                }
                if (length2 > randomAccessFile2.length()) {
                    length2 = (int) randomAccessFile2.length();
                }
                int r6 = length2 - 10;
                bArr2 = new byte[r6];
                randomAccessFile2.seek(10L);
                randomAccessFile2.read(bArr2);
                safeClose(randomAccessFile2);
                try {
                    bytesIntoMap = parseBytesIntoMap(bArr2, false);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mBackupFilePath + "##" + bytesIntoMap, 12, r6);
                }
            } catch (Throwable th) {
                th = th;
                bArr = bArr2;
                randomAccessFile = randomAccessFile2;
                try {
                    th.printStackTrace();
                } finally {
                    safeClose(randomAccessFile);
                    try {
                        bytesIntoMap = parseBytesIntoMap(bArr, false);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
                    if (onSharedPreferenceErrorListener2 != null) {
                        onSharedPreferenceErrorListener2.onError(this.mBackupFilePath + "#" + th.getCause() + "#" + bytesIntoMap, 12, bArr != null ? bArr.length : 0);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
        return bytesIntoMap;
    }

    private byte getBCCCode(byte[] bArr) {
        byte b = 0;
        for (byte b2 : bArr) {
            b = (byte) (b ^ b2);
        }
        return b;
    }

    private byte getMaskByte(byte[] bArr) {
        return getBCCCode(bArr);
    }

    final class FileMonitor extends FileObserver {
        public FileMonitor(String str, int r3) {
            super(str, r3);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int r1, String str) {
            if (SharedPreferencesNewImpl.this.mListeners.size() > 0) {
                SharedPreferencesNewImpl.this.tryReload();
            } else {
                stopWatching();
            }
        }
    }

    final void onDestroy() {
        if (this.mIsSaving || this.mHandler.hasMessages(mSaveMessageID)) {
            saveInner(false);
        }
    }

    private HandlerThread getHandlerThread() {
        int r0 = new Random().nextInt();
        if (r0 < 0) {
            r0 = -r0;
        }
        return mHandlerThreadPool[r0 % 3];
    }

    public static abstract class RunnableEx implements Runnable {
        private Object mArg;

        public void setArg(Object obj) {
            this.mArg = obj;
        }

        public Object getArg() {
            return this.mArg;
        }
    }
}
