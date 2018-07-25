package info.kingpes.retrofitrx.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import info.kingpes.retrofitrx.R;

/**
 * Created by Chau Huynh on 7/25/2018.
 */

public class ViewHolderPost extends RecyclerView.ViewHolder {
    TextView title, content, author;
    public ViewHolderPost(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        content = itemView.findViewById(R.id.content);
        author = itemView.findViewById(R.id.author);
    }
}
