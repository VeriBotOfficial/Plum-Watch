package oqmx;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public class c extends FrameLayout {
    public c(Activity activity) {
        super(activity);
        Window window = activity.getWindow();
        window.setGravity(53);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
        activity.finish();
    }
}
