package example.com.retrofit.api;

import example.com.retrofit.model.BaseModel;
import example.com.retrofit.model.TestModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by weihuajian on 16/6/22.
 */
public interface ApiService {

    @GET("top/list")
    Call<BaseModel<TestModel>> addPara(@Query("page") int page, @Query("rows") int rows);
}
