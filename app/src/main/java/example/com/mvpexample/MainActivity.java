package example.com.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.com.mvpexample.model.SignInPresentrImp;
import example.com.mvpexample.view.SignInView;

public class MainActivity extends AppCompatActivity implements SignInView{
    private SignInPresentrImp signInPresentrImp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInPresentrImp = new SignInPresentrImp(MainActivity.this);
        signInPresentrImp.signIn("piyush6348","123456");
    }

    @Override
    public void showValidationError() {

    }

    @Override
    public void signInSuccess() {

    }

    @Override
    public void signInError() {

    }
}
