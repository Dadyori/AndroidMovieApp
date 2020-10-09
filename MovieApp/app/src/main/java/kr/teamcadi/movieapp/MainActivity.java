package kr.teamcadi.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView reviewspace;

    boolean upstate=false;
    boolean downstate=false;
    TextView tv_thumbup;
    TextView tv_thumbdown;
    ImageView iv_thumbup;
    ImageView iv_thumbdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reviewspace = (ListView)findViewById(R.id.reviewspace);
        ReviewAdapter adapter = new ReviewAdapter();
        adapter.addItem(new ReviewItem("1234","3일전",
                "적당히 재밌다. 오랜만에 잠 안오는 영화를 봤네요.","3"));
        adapter.addItem(new ReviewItem("5678","1일전",
                "적당히 재밌다. 오랜만에 잠 안오는 영화를 봤네요.","0"));
        adapter.addItem(new ReviewItem("9101","3시간 전",
                "적당히 재밌다. 오랜만에 잠 안오는 영화를 봤네요.","12"));

        reviewspace.setAdapter(adapter);

        tv_thumbup = (TextView)findViewById(R.id.tv_thumbup);
        tv_thumbdown = (TextView)findViewById(R.id.tv_thumbdown);
        iv_thumbup = (ImageView)findViewById(R.id.iv_thumbup);
        iv_thumbdown = (ImageView)findViewById(R.id.iv_thumbdown);

        TextView tv_movInfo = (TextView)findViewById(R.id.tv_movInfo);
        TextView tv_movStory = (TextView)findViewById(R.id.tv_story);
        TextView tv_movActor = (TextView)findViewById(R.id.tv_actor);
        TextView tv_movDirector = (TextView)findViewById(R.id.tv_director);


        tv_movStory.setText("전원 백수로 살 길 막막하지만 사이는 좋은 기택가족.\n장남 기우에게 명문대 생 친구가" +
                "연결시켜 준 고액 과외 자리는 모처럼 싹튼 고정수입의 희망이다.\n온 가족의 도움과 기대 속에" +
                "박사장 집으로 향하는 기우.\n글로벌 IT기업 CEO인 박사장의 저택에 도착하자 젊고 " +
                "아름다운 사모님 연교가 기우를 맞이한다.\n그러나 이렇게 시작된 두 가족의 만남 뒤로," +
                "걷잡을 수 없는 사건이 기다리고 있었으니 ...\n");
        tv_movDirector.setText(tv_movDirector.getText().toString()+"봉준호");
        tv_movActor.setText(tv_movActor.getText().toString()+"송강호, 이선균, 조여정, 최우식, 박소담");

        iv_thumbup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thumbupClick();
            }
        });

        iv_thumbdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thumbdownClick();
            }
        });
    }

    class ReviewAdapter extends BaseAdapter {
        ArrayList<ReviewItem> items = new ArrayList<>();

        @Override
        public int getCount() {
            //리스트에 몇 개 있는가?
            return items.size();
        }

        public void addItem(ReviewItem item){
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            //몇 번째 데이터인지
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ReviewItemView view = new ReviewItemView(getApplicationContext());
            ReviewItem item = items.get(position);
            view.setId(item.getId());
            view.setWritetime(item.getTime());
            view.setReviewContent(item.getReview());
            view.setReviewupcount(item.getLike());

            return view;
        }
    }

    public void thumbupClick(){
        String cnt=tv_thumbup.getText().toString();
        int count=Integer.parseInt(cnt);
        if(upstate){
            count--;
            iv_thumbup.setImageResource(R.drawable.thumbsup);
            upstate=false;
            tv_thumbup.setText(count+"");
        }else{
            if (downstate){
                thumbdownClick();
            }
            count++;
            iv_thumbup.setImageResource(R.drawable.thumbsup_click);
            upstate=true;
            tv_thumbup.setText(count+"");
        }
    }

    public void thumbdownClick(){
        String cnt=tv_thumbdown.getText().toString();
        int count=Integer.parseInt(cnt);
        if(downstate){
            count--;
            iv_thumbdown.setImageResource(R.drawable.thumbsdown);
            downstate=false;
            tv_thumbdown.setText(count+"");
        }else{
            if(upstate){
                thumbupClick();
            }
            count++;
            iv_thumbdown.setImageResource(R.drawable.thumbsdown_click);
            downstate=true;
            tv_thumbdown.setText(count+"");
        }
    }



}