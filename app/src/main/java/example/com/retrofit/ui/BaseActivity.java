package example.com.retrofit.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by weihuajian on 16/6/25.
 */
public class BaseActivity extends AppCompatActivity {

    public ProgressDialog progress;

    public void showProgress(String title, String msg) {
        if (progress != null) {
            progress.dismiss();
        }
        progress = ProgressDialog.show(this, title, msg, true, false);
        progress.setCancelable(true);
        progress.setCanceledOnTouchOutside(false);
    }

    public void dismissProgress() {
        if (progress != null) {
            progress.dismiss();
        }
    }

    public void showWaitingMessage() {
        showProgress("", "加载中...");
    }

}
