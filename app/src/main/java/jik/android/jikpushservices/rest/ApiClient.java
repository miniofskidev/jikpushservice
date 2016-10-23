package jik.android.jikpushservices.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Part;

/**
 * Created by tosantechnolocal on 10/23/2016.
 */
public class ApiClient {

    public static String BASE_URL = "somebaseurl";
    private static Retrofit retrofit = null ;

    public static Retrofit getClient(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
