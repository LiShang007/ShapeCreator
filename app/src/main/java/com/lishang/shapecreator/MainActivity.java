package com.lishang.shapecreator;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lishang.shapecreator.util.ShapeCreator;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private TextView btn13;
    private TextView btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //圆角
        ShapeCreator.create()
                .setCornerRadius(10)
                .setSolidColor(Color.GRAY)
                .into(btn1);

        //圆角边框
        ShapeCreator.create()
                .setCornerRadius(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn2);

        //左上圆角
        ShapeCreator.create()
                .setCornerRadiusLT(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn3);

        //右上圆角
        ShapeCreator.create()
                .setCornerRadiusRT(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn4);

        //左下圆角
        ShapeCreator.create()
                .setCornerRadiusLB(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn5);

        //右下圆角
        ShapeCreator.create()
                .setCornerRadiusRB(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn6);

        //对角圆角
        ShapeCreator.create()
                .setCornerRadiusLT(10)
                .setCornerRadiusRB(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn7);

        //对角圆角
        ShapeCreator.create()
                .setCornerRadiusRT(10)
                .setCornerRadiusLB(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn8);


        //圆角边框-虚线
        ShapeCreator.create()
                .setCornerRadius(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .setStrokeDashWidth(10)
                .setStrokeDashGap(10)
                .into(btn9);


        //半圆角
        ShapeCreator.create()
                .setCornerRadius(100)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .setStrokeDashWidth(10)
                .setStrokeDashGap(10)
                .into(btn10);


        //圆形
        ShapeCreator.oval()
                .setSolidColor(Color.GRAY)
                .into(btn11);

        //椭圆
        ShapeCreator.oval()
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn12);

        //线
        ShapeCreator.line()
                .setStrokeColor(Color.RED)
                .setStrokeWidth(1)
                .into(btn13);

        //虚线
        ShapeCreator.line()
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(1)
                .setStrokeDashWidth(10)
                .setStrokeDashGap(10)
                .into(btn14);


        //渐变 线性
        ShapeCreator.create()
                .setGradientType(ShapeCreator.LINEAR_GRADIENT)
                .setGradientAngle(90)
                .setGradientStartColor(Color.RED)
                .setGradientEndColor(Color.BLUE)
                .into(btn15);
        //渐变 圆形
        ShapeCreator.create()
                .setGradientType(ShapeCreator.RADIAL_GRADIENT)
                .setGradientRadius(50)
                .setGradientCenterX(0.5f)
                .setGradientCenterY(0.5f)
                .setGradientStartColor(Color.RED)
                .setGradientCenterColor(Color.CYAN)
                .setGradientEndColor(Color.BLUE)
                .into(btn16);
        //渐变 sweep
        ShapeCreator.create()
                .setGradientType(ShapeCreator.SWEEP_GRADIENT)
                .setGradientCenterX(0.5f)
                .setGradientCenterY(0.5f)
                .setGradientStartColor(Color.RED)
                .setGradientCenterColor(Color.YELLOW)
                .setGradientEndColor(Color.BLUE)
                .into(btn17);

        //状态
        ShapeCreator.create()
                .setCornerRadius(10)
                .setStateEnabled(true)
                .setSolidColor(Color.GRAY)
                .setSolidPressColor(Color.DKGRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokePressColor(Color.MAGENTA)
                .setStrokeWidth(2)
                .setStateTextColorEnabled(true)
                .setTextColor(Color.BLACK)
                .setTextPressColor(Color.WHITE)
                .into(btn18);

        //状态
        ShapeCreator.create()
                .setCornerRadius(10)
                .setStateEnabled(true)
                .setSolidColor(Color.GRAY)
                .setSolidPressColor(Color.DKGRAY)
                .setSolidDisableColor(Color.LTGRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokePressColor(Color.MAGENTA)
                .setStrokeDisableColor(Color.LTGRAY)
                .setStrokeWidth(2)
                .setStateTextColorEnabled(true)
                .setTextColor(Color.BLACK)
                .setTextDisableColor(Color.WHITE)
                .into(btn19);

        btn19.setEnabled(false);
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn10 = (Button) findViewById(R.id.btn_10);
        btn11 = (Button) findViewById(R.id.btn_11);
        btn12 = (Button) findViewById(R.id.btn_12);
        btn13 = (TextView) findViewById(R.id.btn_13);
        btn14 = (TextView) findViewById(R.id.btn_14);
        btn15 = (Button) findViewById(R.id.btn_15);
        btn16 = (Button) findViewById(R.id.btn_16);
        btn17 = (Button) findViewById(R.id.btn_17);
        btn18 = (Button) findViewById(R.id.btn_18);
        btn19 = (Button) findViewById(R.id.btn_19);
    }
}
