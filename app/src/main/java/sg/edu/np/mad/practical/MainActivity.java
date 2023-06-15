package sg.edu.np.mad.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sg.edu.np.mad.madpract2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("", "App started!");
        Button followButton = findViewById(R.id.button_fllw);
        TextView userHeader = findViewById(R.id.textView);
        TextView userDesc = findViewById(R.id.textView2);

        User newUser = new User("NewUser123", "Weeeee buuurtt burrtt", 1, Boolean.FALSE);

        userHeader.setText(newUser.getName());
        userDesc.setText(newUser.getDescription());

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("","Follow button clicked");
                if (newUser.getFollowed() == Boolean.FALSE ){
                    newUser.setFollowed(Boolean.TRUE);
                    followButton.setText("Unfollow");
                }
                else{
                    newUser.setFollowed(Boolean.FALSE);
                    followButton.setText("Follow");
                }
            }
        });
    }
}