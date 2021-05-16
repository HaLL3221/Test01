package com.example.newsinformation.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.newsinformation.R;
import com.example.newsinformation.activity.main.NewsActivity;
import com.example.newsinformation.po.News;

import java.util.List;

public class NewsInfoRecycleAdapter extends RecyclerView.Adapter<NewsInfoRecycleAdapter.ViewHolder> {
    private List<News> newsList;
    private Context context;

    public NewsInfoRecycleAdapter(List<News> newsList) {
        newsList = newsList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView newsDate;
        TextView newsTitle;
        TextView newsAuthor;

        public ViewHolder( View view) {
            super(view);
            newsAuthor = view.findViewById(R.id.news_author);
            newsDate = view.findViewById(R.id.news_date);
            newsTitle = view.findViewById(R.id.news_title);

        }
    }
    public NewsInfoRecycleAdapter(List<News> newsList, Context context) {
        newsList = newsList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.newsTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(context, NewsActivity.class);
                intent.putExtra("news",newsList.get(position));
                context.startActivity(intent);
            }
        });
        holder.newsAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(context, NewsActivity.class);
                intent.putExtra("news",newsList.get(position));
                context.startActivity(intent);
            }
        });
        holder.newsDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(context, NewsActivity.class);
                intent.putExtra("news",newsList.get(position));
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.newsTitle.setText(news.getTitle());
        holder.newsAuthor.setText(news.getAuthor());
        holder.newsDate.setText(news.getPublishedAt());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


}
