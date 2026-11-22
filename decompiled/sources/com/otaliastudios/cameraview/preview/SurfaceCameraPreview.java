package com.otaliastudios.cameraview.preview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.R;

/* loaded from: classes17.dex */
public class SurfaceCameraPreview extends CameraPreview<SurfaceView, SurfaceHolder> {
    private static final CameraLogger LOG = CameraLogger.create("SurfaceCameraPreview");
    private boolean mDispatched;
    private View mRootView;

    public SurfaceCameraPreview(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.otaliastudios.cameraview.preview.CameraPreview
    public SurfaceView onCreateView(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        SurfaceView surfaceView = (SurfaceView) inflate.findViewById(R.id.surface_view);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new SurfaceHolder.Callback() { // from class: com.otaliastudios.cameraview.preview.SurfaceCameraPreview.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                SurfaceCameraPreview.LOG.i("callback: surfaceCreated.");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                SurfaceCameraPreview.LOG.i("callback:", "surfaceChanged", "w:", Integer.valueOf(i2), "h:", Integer.valueOf(i3), "dispatched:", Boolean.valueOf(SurfaceCameraPreview.this.mDispatched));
                if (!SurfaceCameraPreview.this.mDispatched) {
                    SurfaceCameraPreview.this.dispatchOnSurfaceAvailable(i2, i3);
                    SurfaceCameraPreview.this.mDispatched = true;
                } else {
                    SurfaceCameraPreview.this.dispatchOnSurfaceSizeChanged(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceCameraPreview.LOG.i("callback: surfaceDestroyed");
                SurfaceCameraPreview.this.dispatchOnSurfaceDestroyed();
                SurfaceCameraPreview.this.mDispatched = false;
            }
        });
        this.mRootView = inflate;
        return surfaceView;
    }

    @Override // com.otaliastudios.cameraview.preview.CameraPreview
    public View getRootView() {
        return this.mRootView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.otaliastudios.cameraview.preview.CameraPreview
    public SurfaceHolder getOutput() {
        return getView().getHolder();
    }

    @Override // com.otaliastudios.cameraview.preview.CameraPreview
    public Class<SurfaceHolder> getOutputClass() {
        return SurfaceHolder.class;
    }
}
