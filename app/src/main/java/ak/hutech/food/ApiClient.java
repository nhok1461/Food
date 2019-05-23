package ak.hutech.food;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Create by AK-Hutech
 */
public class ApiClient {
    public static final String BASE_URL ="http://127.0.0.1/food/";
    public static Retrofit retrofit=null;

    public  static Retrofit getApiClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
