package digiplus.ma.myuserprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView NameFiled = (TextView) findViewById(R.id.Name);
            NameFiled.setText("Zakaria");
            NameFiled.setTextSize(30);
            NameFiled.setTextColor(Color.RED);

            ImageView ProfilePic = (ImageView) findViewById(R.id.Profile_Picture);
            ProfilePic.setImageResource(R.drawable.profilepic);
            TextView birthday = (TextView) findViewById(R.id.Birthday);
            birthday.setText("23/04/2020");
            TextView Country = (TextView) findViewById(R.id.Country);
            Country.setText("Morocco");
            Country.setTextSize(30);
        }
        }







