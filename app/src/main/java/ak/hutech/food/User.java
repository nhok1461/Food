package ak.hutech.food;

import com.google.gson.annotations.SerializedName;

/**
 * Create by AK-Hutech
 */
public class User {
    @SerializedName("response")
    private String Response;

    @SerializedName("user")
    private String User;

    public String getResponse() {
        return Response;
    }

    public String getUser() {
        return User;
    }
}
