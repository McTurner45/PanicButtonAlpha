package com.danielkim.soundrecorder.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.danielkim.soundrecorder.Model.Comment;
import com.danielkim.soundrecorder.R;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder>{

    Context mContext;
    List<Comment> comments;

    public CommentsAdapter(Context mContext, List<Comment> comments) {
        this.mContext = mContext;
        this.comments = comments;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.comment_item, parent, false);

        mContext = parent.getContext();
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comment comment = comments.get(position);

        holder.commentTxtView.setText(comment.getComment());
        holder.commentor_nameTxtView.setText(comment.getCommentor());

    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView commentor_nameTxtView;
        TextView commentTxtView;

        public ViewHolder(View itemView) {
            super(itemView);

            commentor_nameTxtView= (TextView) itemView.findViewById(R.id.commentor_name);
            commentTxtView= (TextView) itemView.findViewById(R.id.comment_text);
        }
    }
}
