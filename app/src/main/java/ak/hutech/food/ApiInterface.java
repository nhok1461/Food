package ak.hutech.food;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Create by AK-hutech
 */
public interface ApiInterface {

    @GET("register.php")
    Call<User> performRegistration(@Query("user") String User,@Query("password") String Password,@Query("phone") String Phone,@Query("Address") String Address,@Query("email") String Email);

    @GET("login.php")
    Call<User> performUserLogin(@Query("user") String User,@Query("password") String Password);

}
