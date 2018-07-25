package info.kingpes.retrofitrx.retrofit;

import java.util.List;

import info.kingpes.retrofitrx.model.Post;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Chau Huynh on 7/25/2018.
 */

public interface APIService {
    @GET("post")
    Observable<List<Post>> getPosts();
}
