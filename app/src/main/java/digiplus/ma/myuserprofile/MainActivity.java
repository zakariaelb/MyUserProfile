package digiplus.ma.myuserprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView NameFiled = (TextView) findViewById(R.id.Name);
            NameFiled.setText("Zakaria");
        }
    }


