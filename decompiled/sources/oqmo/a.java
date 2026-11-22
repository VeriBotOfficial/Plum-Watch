package oqmo;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.qumeng.overseas.advlib.__remote__.ui.elements.toaster.ui.ToastTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public class a extends Toast {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: oqmo.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1009a {
    }

    public a(View view) {
        super(view.getContext());
        setView(view);
    }

    public static Toast a(Context context, View view, int i) {
        a aVar = new a(view);
        aVar.setDuration(i);
        return aVar;
    }

    public static void b(Context context, View view, int i) {
        a(context, view, i).show();
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        ToastTextView toastTextView = new ToastTextView(context);
        toastTextView.setText(charSequence);
        return a(context, toastTextView, i);
    }

    public static void a(Context context, CharSequence charSequence, int i) {
        makeText(context, charSequence, i).show();
    }
}
