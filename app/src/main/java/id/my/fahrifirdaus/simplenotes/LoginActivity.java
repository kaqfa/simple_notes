package id.my.fahrifirdaus.simplenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        Intent it = new Intent(this, MainActivity.class);
        it.addFlags((Intent.FLAG_ACTIVITY_CLEAR_TASK) | (Intent.FLAG_ACTIVITY_NEW_TASK));
        startActivity(it);
    }
}