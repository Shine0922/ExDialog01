package com.example.win7.checkbox01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private CheckBox chk1,chk2,chk3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  取得介面原件的 ID
        txtResult=(TextView)findViewById(R.id.txtResult);
        chk1=(CheckBox)findViewById(R.id.chk1);
        chk2=(CheckBox)findViewById(R.id.chk2);
        chk3=(CheckBox)findViewById(R.id.chk3);

        //  設定CheckBox 原件 CheckedChange 事件的 listener 為 myListner
        chk1.setOnCheckedChangeListener(myListener);
        chk2.setOnCheckedChangeListener(myListener);
        chk3.setOnCheckedChangeListener(myListener);
    }

    //  定義  onCheckedChanged方法
    private CheckBox.OnCheckedChangeListener myListener = new CheckBox.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
        {
            int n=0;    //  記錄共選了多少項
            String se1="";  //所有的選項結果
            String s1="",s2="",s3="";   //單一選項的結果
            if(chk1.isChecked())
            {
                n++;
                s1=chk1.getText().toString()+"  ";
            }
            else
            {
                s1="    ";
            }

            if(chk2.isChecked())
            {
                n++;
                s2=chk2.getText().toString()+"  ";
            }
            else
            {
                s2="    ";
            }

            if(chk3.isChecked())
            {
                n++;
                s3=chk3.getText().toString()+"  ";
            }
            else
            {
                s3="    ";
            }

            se1=s1+s2+s3;
            txtResult.setText("最喜歡的小說有: " + se1 + " 共 "+ n +" 種 ");
        }

    };
}
