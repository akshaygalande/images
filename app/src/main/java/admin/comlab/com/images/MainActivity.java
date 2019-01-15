package admin.comlab.com.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.img);
    }

    public void ld1(View view) {
        imageView.setImageResource(R.drawable.img1);

    }

    public void ld2(View view) {
        imageView.setImageResource(R.drawable.img2);
    }

    public void ld4(View view) {
        imageView.setImageResource(R.drawable.img3);
    }

    public void ld3(View view) {
        imageView.setImageResource(R.drawable.img4);
    }
}
