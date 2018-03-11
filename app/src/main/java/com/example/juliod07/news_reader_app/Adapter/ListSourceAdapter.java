package com.example.juliod07.news_reader_app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.juliod07.news_reader_app.Common.Common;
import com.example.juliod07.news_reader_app.Interface.IconBetterIdeaService;
import com.example.juliod07.news_reader_app.Interface.ItemClickListener;
import com.example.juliod07.news_reader_app.ListNews;
import com.example.juliod07.news_reader_app.Model.IconBetterIdea;
import com.example.juliod07.news_reader_app.Model.WebSite;
import com.example.juliod07.news_reader_app.R;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by JulioD07 on 3/8/2018.
 */

public class ListSourceAdapter extends RecyclerView.Adapter<ListSourceViewHolder>{

    private Context context;
    private WebSite webSite;
    private IconBetterIdeaService mService;

    public ListSourceAdapter(Context context, WebSite webSite) {
        this.context = context;
        this.webSite = webSite;

        mService = Common.getIconService();

    }

    @Override
    public ListSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.source_layout,parent,false);

        return  new ListSourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ListSourceViewHolder holder, int position) {
        StringBuilder iconBetterApi = new StringBuilder("https://icons-better-idea.org/allicons.json?url=");
        iconBetterApi.append(webSite.getSources().get(position).getUrl());

        mService.getIconUrl(iconBetterApi.toString())
                .enqueue(new Callback<IconBetterIdea>() {
                    @Override
                    public void onResponse(Call<IconBetterIdea> call, Response<IconBetterIdea> response) {
                        if (response.body().getIcons().size() > 0)
                        {
                            Picasso.with(context)
                                    .load(response.body().getIcons().get(0).getUrl())
                                    .into(holder.source_image);

                        }
                    }

                    @Override
                    public void onFailure(Call<IconBetterIdea> call, Throwable t) {

                    }
                });


        holder.source_title.setText(webSite.getSources().get(position).getName());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent intent = new Intent(context, ListNews.class);
                intent.putExtra("source",webSite.getSources().get(position).getId());
                intent.putExtra("sortBy",webSite.getSources().get(position).getSortByAvailable().get(0)); //Para obtener el metodo de ordenar por default
                context.startActivity(intent);




            }
        });


    }

    @Override
    public int getItemCount() {
        return webSite.getSources().size();
    }
}
