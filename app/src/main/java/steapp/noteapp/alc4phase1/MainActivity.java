package steapp.noteapp.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutALC(View view){

        Intent intent = new Intent(this,AboutALC.class);
        startActivity(intent);
    }
    public void myProfile(View view){

        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }
}
