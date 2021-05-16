package com.example.newsinformation.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsinformation.R;
import com.example.newsinformation.adapter.NewsInfoRecycleAdapter;
import com.example.newsinformation.po.News;
import com.example.newsinformation.util.DataTool;

import java.util.ArrayList;
import java.util.List;

public class NewsInfoFragment extends Fragment {
    private List<News> newsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private String str;
    private Handler handler;
    private DataTool dataTool;
    private NewsInfoRecycleAdapter newsRecycleAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      final  View view = inflater.inflate(R.layout.fragment_newsinfo,container,false);
//      dataTool = new DataTool();//自己封装处理数据的工具
//      if(Build.VERSION.SDK_INT>9){
//          StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//          StrictMode.setThreadPolicy(policy);
//      }
//      new Thread(new Runnable() {
//          @Override
//          public void run() {
//              try {
//                  str = dataTool.getNetData(new URL("https://gank.io/api/v2/data/category/Article/type/Android/page/1/count/10"));
//                  newsList = dataTool.getNewsData(str).getNewsList();
//                  Message msg = new Message();
//                  Bundle data = new Bundle();
//                  data.putParcelableArrayList("news",(ArrayList<? extends Parcelable>) newsList);
//                  msg.setData(data);
//                  msg.what=1;
//                  //发消息到主线程
//                  handler.sendMessage(msg);
//              }catch (IOException | JSONException e) {
//                  e.printStackTrace();
//              }
//          }
//      }).start();
//      handler = new Handler(){
//          @Override
//          public void handleMessage(@NonNull Message msg) {
//              super.handleMessage(msg);
//              if (msg.what==1){
//                  Bundle data = msg.getData();
//                  newsList = data.getParcelableArrayList("newsList");
//                  //设置UI
//                  recyclerView = view.findViewById(R.id.recyclerView_news);
//                  LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
//                  recyclerView.setLayoutManager(layoutManager);
//                  NewsInfoRecycleAdapter newsRecycleAdapter = new NewsInfoRecycleAdapter(newsList);
//                  recyclerView.setAdapter(newsRecycleAdapter);
//                 // recyclerView.addItemDecoration(new MyDecoration(getActivity(), MyDecoration.VERTICAL_LIST));
//              }else if(msg.what==0) {
//                  Toast.makeText(getActivity(),"请求资源不成功",Toast.LENGTH_SHORT).show();
//              }
//
//          }
//      };
        return view;
    }





}