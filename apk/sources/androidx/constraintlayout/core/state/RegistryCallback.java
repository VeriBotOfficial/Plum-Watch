package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes8.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int r1, int r2);

    void onNewMotionScene(String str);

    void onProgress(float f);

    void setDrawDebug(int r1);

    void setLayoutInformationMode(int r1);
}
