package will.github.com.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import will.github.com.annotations.BindView;


public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.tv_test)
    TextView tv_test;
    @BindView(id = R.id.tv_test1)
    TextView tv_test1;
    @BindView(id = R.id.iv_image)
    ImageView iv_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bind_MainActivity.bindView(this);
        tv_test.setText("test_1");
        tv_test1.setText("test_2");
        iv_image.setImageDrawable(getDrawable(R.mipmap.ic_launcher));
    }

}
