package com.example.android_food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android_food_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.loginbutton.setOnClickListener{
            startOrStopProgressBar()
        }


    }


    private fun startOrStopProgressBar() {

        binding.apply {
            if (editTextPersonName.getText().length > 0 && editTextPassword.getText().length > 0) {
               // String toastMessage = "Username: " + usernameEditText.getText().toString() + ", Password: " + passwordEditText.getText().toString();
                Toast.makeText(getApplicationContext(), "correct email", Toast.LENGTH_SHORT).show();
            } else {
                //String toastMessage = "Username or Password are not populated";
                Toast.makeText(getApplicationContext(), "incorrect email and password", Toast.LENGTH_SHORT).show();
            }
        }
        }
    }




//b1.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        if(ed1.getText().toString().equals("admin") &&
//            ed2.getText().toString().equals("admin")) {
//            Toast.makeText(getApplicationContext(),
//                "Redirecting...",Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(getApplicationContext(), "Wrong
//                    Credentials",Toast.LENGTH_SHORT).show();
//
//                    tx1.setVisibility(View.VISIBLE);
//            tx1.setBackgroundColor(Color.RED);
//            counter--;
//            tx1.setText(Integer.toString(counter));
//
//            if (counter == 0) {
//                b1.setEnabled(false);
//            }
//        }
//    }
//});
//
//b2.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        finish();
//    }
//});
//}
//}