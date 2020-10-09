package kr.teamcadi.movieapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ReviewItemView extends RelativeLayout {
    TextView userid;
    TextView writetime;
    TextView reviewContent;
    TextView reviewupcount;

    public ReviewItemView(Context context) {
        super(context);
        init(context);
    }

    public ReviewItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.review_layout,this,true);

        userid = (TextView)findViewById(R.id.userid);
        writetime = (TextView)findViewById(R.id.writetime);
        reviewContent = (TextView)findViewById(R.id.review);
        reviewupcount = (TextView)findViewById(R.id.reviewupcount);
    }

    public void setId(String id){
        userid.setText(id);
    }

    public void setWritetime(String time){
        writetime.setText(time);
    }

    public void setReviewContent(String content){
        reviewContent.setText(content);
    }

    public void setReviewupcount(String count){
        reviewupcount.setText(count);
    }
}
