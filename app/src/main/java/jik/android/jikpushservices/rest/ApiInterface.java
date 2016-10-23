package jik.android.jikpushservices.rest;

import jik.android.jikpushservices.model.SampleModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tosantechnolocal on 10/23/2016.
 */
public interface ApiInterface {

    @GET("/someURL")
    Call<SampleModel> getPosts();
}
