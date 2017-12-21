package example.com.mvpexample.model;

import android.text.TextUtils;

import example.com.mvpexample.presenter.SignInPresenter;
import example.com.mvpexample.view.SignInView;

/**
 * Created by piyush on 21/12/17.
 */

public class SignInPresentrImp implements SignInPresenter {

    private SignInView signInView;

    public SignInPresentrImp(SignInView signInView) {
        this.signInView = signInView;
    }

    @Override
    public void signIn(String userName, String passWord) {

        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(passWord))
            signInView.showValidationError();
        else{
            if(userName.equalsIgnoreCase("piyush6348") && passWord.equalsIgnoreCase("123456"))
                signInView.signInSuccess();
            else
                signInView.signInError();
        }
    }
}
