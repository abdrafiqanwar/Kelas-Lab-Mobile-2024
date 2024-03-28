package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.ViewHolder> {
    private ArrayList<Chat> chats;
    public AdapterChat(ArrayList<Chat> chats){
        this.chats = chats;
    }

    @NonNull
    @Override
    public AdapterChat.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterChat.ViewHolder holder, int position) {
        Chat chat = chats.get(position);
        holder.iv_user.setImageResource(chat.getImage());
        holder.tv_username.setText(chat.getUsername());
        holder.tv_preview.setText(chat.getPreview());
        holder.tv_time.setText(chat.getTime());
        holder.itemView.setOnClickListener(view ->
                        Toast.makeText(view.getContext(), "zaky tampan", Toast.LENGTH_LONG).show()
                );
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_user;
        private TextView tv_username, tv_preview, tv_time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_user = itemView.findViewById(R.id.iv_user);
            tv_username = itemView.findViewById(R.id.tv_username);
            tv_preview = itemView.findViewById(R.id.tv_preview);
            tv_time = itemView.findViewById(R.id.tv_time);
        }
    }
}
