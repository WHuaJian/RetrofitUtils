package example.com.retrofit.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import example.com.retrofit.R;
import example.com.retrofit.api.ApiService;
import example.com.retrofit.callback.BaseCallback;
import example.com.retrofit.model.BaseModel;
import example.com.retrofit.model.TestModel;
import example.com.retrofit.utils.RetrofitUtils;

public class MainActivity extends BaseActivity implements OnClickListener {

    private TextView tvGET, tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGET = (TextView) findViewById(R.id.tvGET);
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvGET.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvGET:
                requestApi();
                break;
        }
    }


    private void requestApi() {
        showWaitingMessage();
        RetrofitUtils.getInstance(this)
                .create(ApiService.class)
                .addPara(2, 20)
                .enqueue(new BaseCallback<BaseModel<TestModel>>() {

                    @Override
                    protected void onAfter() {
                        dismissProgress();
                    }

                    @Override
                    protected void onSuccess(BaseModel<TestModel> response) {

                        tvResult.setText("status：" + response.isStatus() + "\n" + response.getData().get(0).getDescription());
                    }

                    @Override
                    protected void onNoData(String msg) {
                        showToast(msg);
                    }

                    @Override
                    protected void onFail(String msg) {
                        showToast(msg);
                    }
                });
    }

    private void showToast(String msg) {
        if (TextUtils.isEmpty(msg))
            return;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
