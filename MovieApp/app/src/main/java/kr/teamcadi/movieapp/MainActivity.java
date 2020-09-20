package kr.teamcadi.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_movInfo = (TextView)findViewById(R.id.tv_movInfo);
        TextView tv_movStory = (TextView)findViewById(R.id.tv_story);
        TextView tv_movActor = (TextView)findViewById(R.id.tv_actor);

        tv_movInfo.setText("개봉 : 2019.05.30\n등급 : 15세 관람가 \n장르 : 드라마 \n러닝타임 : 131분");
        tv_movStory.setText("전원 백수로 살 길 막막하지만 사이는 좋은 기택가족.\n장남 기우에게 명문대 생 친구가" +
                "연결시켜 준 고액 과외 자리는 모처럼 싹튼 고정수입의 희망이다.\n온 가족의 도움과 기대 속에" +
                "박사장 집으로 향하는 기우.\n글로벌 IT기업 CEO인 박사장의 저택에 도착하자 젊고 " +
                "아름다운 사모님 연교가 기우를 맞이한다.\n그러나 이렇게 시작된 두 가족의 만남 뒤로," +
                "걷잡을 수 없는 사건이 기다리고 있었으니 ...\n");
        tv_movActor.setText("출연 : 송강호, 이선균, 조여정, 최우식, 박소담");


    }
}