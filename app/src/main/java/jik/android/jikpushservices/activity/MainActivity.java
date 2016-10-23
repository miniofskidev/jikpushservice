package jik.android.jikpushservices.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import jik.android.jikpushservices.R;
import jik.android.jikpushservices.model.SampleModel;
import jik.android.jikpushservices.rest.ApiClient;
import jik.android.jikpushservices.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<SampleModel> call = apiService.getPosts();
        call.enqueue(new Callback<SampleModel>() {
            @Override
            public void onResponse(Call<SampleModel> call, Response<SampleModel> response) {

            }

            @Override
            public void onFailure(Call<SampleModel> call, Throwable t) {
                Log.d("amianamiana", t.toString());
            }
        });


    }
}
