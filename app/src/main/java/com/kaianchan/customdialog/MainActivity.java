package com.kaianchan.customdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attaching click listener
        findViewById(R.id.buttonShowDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calling this method to show our android custom alert dialog
                error();
            }
        });
    }

//    private void showCustomDialog() {
//        ViewGroup viewGroup = findViewById(android.R.id.content);
//        View dialogView = LayoutInflater.from(this).inflate(R.layout.my_dialog, viewGroup, false);
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setView(dialogView);
//
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }

//    public void okClick(View view) {
////        Toast.makeText(MainActivity.this, "okclick", Toast.LENGTH_SHORT).show();
//    }

    private void error() {
        LayoutInflater factory=LayoutInflater.from(MainActivity.this);
        final View v1 = factory.inflate(R.layout.my_dialog,null);

        AlertDialog.Builder inputDialog = new AlertDialog.Builder(MainActivity.this);
        inputDialog.setView(v1);
        inputDialog.setPositiveButton("next",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "aaa", Toast.LENGTH_SHORT).show();
                    }
                    //}).show();
                });
        AlertDialog dialog = inputDialog.create();
        // 點撃dialog外, 不能取消個alert
        dialog.setCancelable(false);
        final Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextSize(20);

    }

    private void correct(){
    }
}
