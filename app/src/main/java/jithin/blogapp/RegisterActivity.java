package jithin.blogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {


    private EditText Email, Password, ConfirmPassword;
    private TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Register =findViewById(R.id.register_btn);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isvalid = validate();

            }
        });

    }

    private boolean validate() {
        Email = findViewById(R.id.reg_email_input);
        Password = findViewById(R.id.reg_password_input);
        ConfirmPassword = findViewById(R.id.reg_confirm_password_input);

        String email = Email.getText().toString().trim();
        String password = Password.getText().toString().trim();
        String confirmPassword = ConfirmPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Email.setError("Type the email");
            Email.requestFocus();
        }
        else if (TextUtils.isEmpty(password)) {
            Password.setError("Type the password");
            Password.requestFocus();
        }
        else if (TextUtils.isEmpty(confirmPassword)) {
            ConfirmPassword.setError("Re-type the password");
            ConfirmPassword.requestFocus();
        }
        return  true;
    }
}
