package com.mark.aptdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.mark.aop_annotation.OnClick;
import com.mark.aoplibrary.annotation.TimeLog;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.tv_1)
    private TextView tv_1;

    @InjectView(R.id.tv_2)
    private TextView tv_2;
    @InjectView(R.id.tv_3)
    private TextView tv_3;
    @InjectView(R.id.tv_4)
    private TextView tv_4;
    @InjectView(R.id.tv_5)
    private TextView tv_5;
    @InjectView(R.id.tv_6)
    private TextView tv_6;
    @InjectView(R.id.tv_7)
    private TextView tv_7;
    @InjectView(R.id.tv_8)
    private TextView tv_8;
    @InjectView(R.id.tv_9)
    private TextView tv_9;
    @InjectView(R.id.tv_10)
    private TextView tv_10;
    @InjectView(R.id.tv_11)
    private TextView tv_11;
    @InjectView(R.id.tv_12)
    private TextView tv_12;
    @InjectView(R.id.tv_13)
    private TextView tv_13;
    @InjectView(R.id.tv_14)
    private TextView tv_14;
    @InjectView(R.id.tv_15)
    private TextView tv_15;
    @InjectView(R.id.tv_16)
    private TextView tv_16;
    @InjectView(R.id.tv_17)
    private TextView tv_17;
    @InjectView(R.id.tv_18)
    private TextView tv_18;
    @InjectView(R.id.tv_19)
    private TextView tv_19;
    @InjectView(R.id.tv_20)
    private TextView tv_20;
    @InjectView(R.id.tv_21)
    private TextView tv_21;
    @InjectView(R.id.tv_22)
    private TextView tv_23;
    @InjectView(R.id.tv_23)
    private TextView tv_24;
    @InjectView(R.id.tv_24)
    private TextView tv_25;
    @InjectView(R.id.tv_25)
    private TextView tv_26;
    @InjectView(R.id.tv_26)
    private TextView tv_27;
    @InjectView(R.id.tv_27)
    private TextView tv_28;
    @InjectView(R.id.tv_28)
    private TextView tv_29;
    @InjectView(R.id.tv_29)
    private TextView tv_30;
    @InjectView(R.id.tv_30)
    private TextView tv_31;
    @InjectView(R.id.tv_31)
    private TextView tv_32;
    @InjectView(R.id.tv_32)
    private TextView tv_33;
    @InjectView(R.id.tv_33)
    private TextView tv_34;
    @InjectView(R.id.tv_34)
    private TextView tv_35;
    @InjectView(R.id.tv_35)
    private TextView tv_22;


    @com.mark.aop_annotation.InjectView(R.id.tv_aop)
    TextView tv_aop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti1();
        inti2();
        tv_aop.setText("找到了");
    }

    @OnClick(R.id.tv_aop)
    public void myOnclick(){
        Toast.makeText(this, "点击了", Toast.LENGTH_SHORT).show();
    }

    /**
     * 通过注解反射findViewByID,性能损耗
     * MainActivity.inti1:[Ljava.lang.Object;@14bcf7b --->:[5ms]
     */
    @TimeLog
    private void inti1() {
        AnnotiteUtils.injectViews(this);
        tv_11.setText("=============================");
    }

    /**
     * 通过API findViewByID
     * MainActivity.inti2:[Ljava.lang.Object;@aa10198 --->:[0ms]
     */
    @TimeLog
    private void inti2() {
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_3 = findViewById(R.id.tv_3);
        tv_4 = findViewById(R.id.tv_4);
        tv_5 = findViewById(R.id.tv_5);
        tv_6 = findViewById(R.id.tv_6);
        tv_7 = findViewById(R.id.tv_7);
        tv_8 = findViewById(R.id.tv_8);
        tv_9 = findViewById(R.id.tv_9);
        tv_10 = findViewById(R.id.tv_10);
        tv_11 = findViewById(R.id.tv_11);
        tv_12 = findViewById(R.id.tv_12);
        tv_13 = findViewById(R.id.tv_13);
        tv_14 = findViewById(R.id.tv_14);
        tv_15 = findViewById(R.id.tv_15);
        tv_16 = findViewById(R.id.tv_16);
        tv_17 = findViewById(R.id.tv_17);
        tv_18 = findViewById(R.id.tv_18);
        tv_19 = findViewById(R.id.tv_19);
        tv_20 = findViewById(R.id.tv_20);
        tv_21 = findViewById(R.id.tv_21);
        tv_22 = findViewById(R.id.tv_22);
        tv_23 = findViewById(R.id.tv_23);
        tv_24 = findViewById(R.id.tv_24);
        tv_25 = findViewById(R.id.tv_25);
        tv_26 = findViewById(R.id.tv_26);
        tv_27 = findViewById(R.id.tv_27);
        tv_28 = findViewById(R.id.tv_28);
        tv_29 = findViewById(R.id.tv_29);
        tv_30 = findViewById(R.id.tv_30);
        tv_31 = findViewById(R.id.tv_31);
        tv_32 = findViewById(R.id.tv_32);
        tv_33 = findViewById(R.id.tv_33);
        tv_34 = findViewById(R.id.tv_34);
        tv_35 = findViewById(R.id.tv_35);
        tv_11.setText("=============================");
    }
}
