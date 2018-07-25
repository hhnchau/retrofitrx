package info.kingpes.retrofitrx.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import info.kingpes.retrofitrx.R;
import info.kingpes.retrofitrx.model.Post;

/**
 * Created by Chau Huynh on 7/25/2018.
 */

public class AdapterPost extends RecyclerView.Adapter<ViewHolderPost> {
    private Context context;
    private List<Post> postList;

    public AdapterPost(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @Override
    public ViewHolderPost onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);
        return new ViewHolderPost(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPost holder, int position) {
        holder.title.setText(String.valueOf(postList.get(position).getTitle()));
        holder.content.setText(new StringBuilder(postList.get(position).getBody()).append("..."));
        holder.author.setText(String.valueOf(postList.get(position).getUserId()));
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
