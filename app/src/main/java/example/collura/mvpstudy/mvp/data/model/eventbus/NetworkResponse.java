package example.collura.mvpstudy.mvp.data.model.eventbus;

/**
 * Created by Betto on 26/03/2018.
 */

public class NetworkResponse {
    private String response;

    public NetworkResponse (String response) {
        this.response = response;
    }

    public String getString () {
        return response;
    }
}
