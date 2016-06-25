# RetrofitUtils

请求:
</br>

```Java
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
```
