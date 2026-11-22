package com.otaliastudios.cameraview;

import android.graphics.BitmapFactory;
import android.location.Location;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.size.Size;
import java.io.File;

/* loaded from: classes17.dex */
public class PictureResult {
    private final byte[] data;
    private final Facing facing;
    private final PictureFormat format;
    private final boolean isSnapshot;
    private final Location location;
    private final int rotation;
    private final Size size;

    public static class Stub {
        public byte[] data;
        public Facing facing;
        public PictureFormat format;
        public boolean isSnapshot;
        public Location location;
        public int rotation;
        public Size size;

        Stub() {
        }
    }

    PictureResult(Stub stub) {
        this.isSnapshot = stub.isSnapshot;
        this.location = stub.location;
        this.rotation = stub.rotation;
        this.size = stub.size;
        this.facing = stub.facing;
        this.data = stub.data;
        this.format = stub.format;
    }

    public boolean isSnapshot() {
        return this.isSnapshot;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getRotation() {
        return this.rotation;
    }

    public Size getSize() {
        return this.size;
    }

    public Facing getFacing() {
        return this.facing;
    }

    public byte[] getData() {
        return this.data;
    }

    public PictureFormat getFormat() {
        return this.format;
    }

    public void toBitmap(int i, int i2, BitmapCallback bitmapCallback) {
        if (this.format == PictureFormat.JPEG) {
            CameraUtils.decodeBitmap(getData(), i, i2, new BitmapFactory.Options(), this.rotation, bitmapCallback);
        } else {
            if (this.format == PictureFormat.DNG) {
                CameraUtils.decodeBitmap(getData(), i, i2, new BitmapFactory.Options(), this.rotation, bitmapCallback);
                return;
            }
            throw new UnsupportedOperationException("PictureResult.toBitmap() does not support this picture format: " + this.format);
        }
    }

    public void toBitmap(BitmapCallback bitmapCallback) {
        toBitmap(-1, -1, bitmapCallback);
    }

    public void toFile(File file, FileCallback fileCallback) {
        CameraUtils.writeToFile(getData(), file, fileCallback);
    }
}
