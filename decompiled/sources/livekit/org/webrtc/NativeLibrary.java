package livekit.org.webrtc;

/* loaded from: classes8.dex */
class NativeLibrary {
    private static final String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static final Object lock = new Object();

    NativeLibrary() {
    }

    static class DefaultLoader implements NativeLibraryLoader {
        DefaultLoader() {
        }

        @Override // livekit.org.webrtc.NativeLibraryLoader
        public boolean load(String name) {
            Logging.d(NativeLibrary.TAG, "Loading library: " + name);
            System.loadLibrary(name);
            return true;
        }
    }

    static void initialize(NativeLibraryLoader loader, String libraryName) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.d(TAG, "Native library has already been loaded.");
            } else {
                Logging.d(TAG, "Loading native library: " + libraryName);
                libraryLoaded = loader.load(libraryName);
            }
        }
    }

    static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
