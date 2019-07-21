package com.nikosval.aepp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater inflater;
    List<Oros> modellist;
    ArrayList<Oros> arrayList;

    public ListViewAdapter(Context context, List<Oros> modellist) {
       this. mContext = context;
        this.modellist = modellist;
        inflater=LayoutInflater.from(mContext);
        this.arrayList=new ArrayList<Oros>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
TextView mTitletv,mDesctv;
ImageView mIcontv;

    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){

            holder=new ViewHolder();
            view=inflater.inflate(R.layout.oros,null);

            holder.mTitletv=view.findViewById(R.id.titleorou);
            holder.mDesctv=view.findViewById(R.id.description);
            holder.mIcontv=view.findViewById(R.id.centermenuicon);
             view.setTag(holder);


        }

        else
        {

            holder=(ViewHolder)view.getTag();
        }

        holder.mTitletv.setText(modellist.get(position).getTitle());
        holder.mDesctv.setText(modellist.get(position).getDesc());
        holder.mIcontv.setImageResource(modellist.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if  (modellist.get(position).getTitle().equals("Πρόβλημα")){

                    Intent intent=new Intent(mContext,thewria1oukefalaiou.class);
                    mContext.startActivity(intent);
                }


                if  (modellist.get(position).getTitle().equals("Επιλύσιμο")){

                    Intent intent=new Intent(mContext,thewria1oukefalaiou.class);
                    mContext.startActivity(intent);
                }

                if  (modellist.get(position).getTitle().equals("Ανοικτό")){

                    Intent intent=new Intent(mContext,thewria1oukefalaiou.class);
                    mContext.startActivity(intent);
                }

                if  (modellist.get(position).getTitle().equals("Άλυτο")){

                    Intent intent=new Intent(mContext,thewria1oukefalaiou.class);
                    mContext.startActivity(intent);
                }

            }
        });

        return view;
    }

    public void filter(String charText){

        charText=charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if(charText.length()==0){
            modellist.addAll(arrayList);
        }
        else
        {
            for (Oros oros : arrayList){
             if (oros.getTitle().toLowerCase(Locale.getDefault()).contains(charText)){
                 modellist.add(oros);
             }

            }
        }
        notifyDataSetChanged();
    }
}
