
## 问题:
>在平时的项目开发中，为了实现圆角矩形、带边框的矩形、圆、椭圆等效果，然后在drawble文件下创建大量的 shape 标签的xml。项目不断迭代，还会出现完全效果一样的设计，因为时间太久而忘记是那个xml了，然后就又新建一个xml，用于实现。最终导致文件太多，不便维护。

## 解决:
>为了解决上面的问题，小弟我自己封装了一个 ShapeCreator 工具类，用于动态的创建圆角矩形、带边框的矩形、圆、椭圆等效果。

## ShapeCreator介绍
> ShapeCreator支持动态设置shape标签下的 \<solid /> \<size /> \<corners /> \<stroke /> \<gradient /> 以及\<shape shape=''>,同时还支持state_press,state_enabled 状态变化。<br>
\<shape>标签对应的Android类为GradientDrawable，所以ShapeCreator就是对GradientDrawable进行了一个方法封装，使用起来简单方便。

<img src='img\img.gif'>

## 使用：
### 圆角
<img src='img\img_1.png'>

        //圆角
        ShapeCreator.create()
                .setCornerRadius(10)
                .setSolidColor(Color.GRAY)
                .into(btn1);

### 圆角边框
![圆角边框](img\img_2.png)

        //圆角边框
        ShapeCreator.create()
                .setCornerRadius(10)
                .setSolidColor(Color.GRAY)
                .setStrokeColor(Color.CYAN)
                .setStrokeWidth(2)
                .into(btn2);


### 圆角边框-虚线效果
![圆角边框](img\img_4.png)

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


### 单独设置四个圆角
![单独设置四个圆角](img\img_3.png)

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

### 圆形
![圆形](img\img_5.png)

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

### 线
![线](img\img_6.png)

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

### 渐变效果
![渐变效果](img\img_7.png)

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

### 带交互状态
![带交互状态](img\img_8.png)

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

## 源码
    public class ShapeCreator {

        /**
        * 对应标签 shape
        */
        private int shape;
        public static final int RECTANGLE = 0;
        public static final int OVAL = 1;
        public static final int LINE = 2;

        /**
        * 对应标签 corners
        */
        private float cornerRadius;  //四个角的半径
        private float cornerRadiusLT; //左上角半径
        private float cornerRadiusRT; //右上角半径
        private float cornerRadiusLB; //左下角半径
        private float cornerRadiusRB; //右下角半径
        /**
        * 对应标签 solid
        */
        private int solidColor;
        private int solidPressColor = 0;
        private int solidDisableColor = 0;

        /**
        * 对应标签stroke
        */
        private int strokeColor;
        private int strokePressColor = 0;
        private int strokeDisableColor = 0;
        private int strokeWidth;
        private int strokeDashWidth;
        private int strokeDashGap;

        /**
        * 对应标签gradient
        */
        private int gradientType = -1;
        public static final int LINEAR_GRADIENT = 0;
        public static final int RADIAL_GRADIENT = 1;
        public static final int SWEEP_GRADIENT = 2;
        private int gradientAngle;
        private float gradientCenterX;
        private float gradientCenterY;
        private int gradientStartColor;
        private int gradientCenterColor = 0;
        private int gradientEndColor;
        private float gradientRadius;

        /**
        * 对应标签 size
        */
        private int width;
        private int height;

        /**
        * true 默认dp
        * false 默认px
        */
        private boolean dpUnitEnabled = true;
        /**
        * 状态标签是否启用  selector 标签
        */
        private boolean stateEnabled = false;
        /**
        * 是否支持设置文字颜色state
        */
        private boolean stateTextColorEnabled = false;
        private int textColor, textPressColor, textDisableColor;

        public static ShapeCreator create() {
            return new ShapeCreator();
        }

        /**
        * 直接指定类型 shape line
        * @return
        */
        public static ShapeCreator line() {
            return new ShapeCreator().setShape(LINE);
        }
        /**
        * 直接指定类型 shape oval
        * @return
        */
        public static ShapeCreator oval() {
            return new ShapeCreator().setShape(OVAL);
        }

        /**
        * <corners android:radius=""/>
        *
        * @param radius
        * @return
        */
        public ShapeCreator setCornerRadius(float radius) {
            this.cornerRadius = radius;
            return this;
        }

        /**
        * <corners android:topLeftRadius=""/>
        *
        * @param cornerRadiusLT
        * @return
        */
        public ShapeCreator setCornerRadiusLT(float cornerRadiusLT) {
            this.cornerRadiusLT = cornerRadiusLT;
            return this;
        }

        /**
        * <corners android:topRightRadius=""/>
        *
        * @param cornerRadiusRT
        * @return
        */
        public ShapeCreator setCornerRadiusRT(float cornerRadiusRT) {
            this.cornerRadiusRT = cornerRadiusRT;
            return this;
        }

        /**
        * <corners android:bottomLeftRadius=""/>
        *
        * @param cornerRadiusLB
        * @return
        */
        public ShapeCreator setCornerRadiusLB(float cornerRadiusLB) {
            this.cornerRadiusLB = cornerRadiusLB;
            return this;
        }

        /**
        * <corners android:bottomRightRadius=""/>
        *
        * @param cornerRadiusRB
        * @return
        */
        public ShapeCreator setCornerRadiusRB(float cornerRadiusRB) {
            this.cornerRadiusRB = cornerRadiusRB;
            return this;
        }

        /**
        * <solid android:color=""/>
        *
        * @param solidColor
        * @return
        */
        public ShapeCreator setSolidColor(int solidColor) {
            this.solidColor = solidColor;
            return this;
        }

        /**
        * state_press='true' color
        *
        * @param solidPressColor
        * @return
        */
        public ShapeCreator setSolidPressColor(int solidPressColor) {
            this.solidPressColor = solidPressColor;
            return this;
        }

        /**
        * state_enabled='false' color
        *
        * @param solidDisableColor
        * @return
        */
        public ShapeCreator setSolidDisableColor(int solidDisableColor) {
            this.solidDisableColor = solidDisableColor;
            return this;
        }

        /**
        * <stroke android:color=""/>
        *
        * @param strokeColor
        * @return
        */
        public ShapeCreator setStrokeColor(int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        /**
        * state_press='true' color
        *
        * @param strokePressColor
        * @return
        */
        public ShapeCreator setStrokePressColor(int strokePressColor) {
            this.strokePressColor = strokePressColor;
            return this;
        }

        /**
        * state_enabled='false' color
        *
        * @param strokeDisableColor
        * @return
        */
        public ShapeCreator setStrokeDisableColor(int strokeDisableColor) {
            this.strokeDisableColor = strokeDisableColor;
            return this;
        }

        /**
        * <stroke android:width=""/>
        *
        * @param strokeWidth
        * @return
        */
        public ShapeCreator setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        /**
        * <stroke android:dashWidth=""/>
        *
        * @param strokeDashWidth
        * @return
        */
        public ShapeCreator setStrokeDashWidth(int strokeDashWidth) {
            this.strokeDashWidth = strokeDashWidth;
            return this;
        }

        /**
        * <stroke android:dashGap=""/>
        *
        * @param strokeDashGap
        * @return
        */
        public ShapeCreator setStrokeDashGap(int strokeDashGap) {
            this.strokeDashGap = strokeDashGap;
            return this;
        }

        /**
        * <shape xmlns:android="http://schemas.android.com/apk/res/android"
        * android:shape="">
        *
        * @param shape
        * @return
        */
        public ShapeCreator setShape(int shape) {
            this.shape = shape;
            return this;
        }

        /**
        * <gradient android:type=""/>
        *
        * @param gradientType
        * @return
        */
        public ShapeCreator setGradientType(int gradientType) {
            this.gradientType = gradientType;
            return this;
        }

        /**
        * <gradient android:angle=""/>
        *
        * @param gradientAngle
        * @return
        */
        public ShapeCreator setGradientAngle(int gradientAngle) {
            this.gradientAngle = gradientAngle;
            defaultGradientType();
            return this;
        }

        /**
        * <gradient android:centerX=""/>
        *
        * @param gradientCenterX
        * @return
        */
        public ShapeCreator setGradientCenterX(float gradientCenterX) {
            this.gradientCenterX = gradientCenterX;
            defaultGradientType();
            return this;
        }

        /**
        * <gradient android:centerY=""/>
        *
        * @param gradientCenterY
        * @return
        */
        public ShapeCreator setGradientCenterY(float gradientCenterY) {
            this.gradientCenterY = gradientCenterY;
            defaultGradientType();
            return this;
        }

        /**
        * <gradient android:startColor=""/>
        *
        * @param gradientStartColor
        * @return
        */
        public ShapeCreator setGradientStartColor(int gradientStartColor) {
            this.gradientStartColor = gradientStartColor;
            defaultGradientType();
            return this;
        }

        /**
        * <gradient android:centerColor=""/>
        *
        * @param gradientCenterColor
        * @return
        */
        public ShapeCreator setGradientCenterColor(int gradientCenterColor) {
            this.gradientCenterColor = gradientCenterColor;
            defaultGradientType();
            return this;
        }

        /**
        * * <gradient android:endColor=""/>
        *
        * @param gradientEndColor
        * @return
        */
        public ShapeCreator setGradientEndColor(int gradientEndColor) {
            this.gradientEndColor = gradientEndColor;
            defaultGradientType();
            return this;
        }

        /**
        * * <gradient android:gradientRadius=""/>
        *
        * @param gradientRadius
        * @return
        */
        public ShapeCreator setGradientRadius(float gradientRadius) {
            this.gradientRadius = gradientRadius;
            defaultGradientType();
            return this;
        }

        /**
        * <size android:width="" android:height=""/>
        *
        * @param w
        * @param h
        * @return
        */
        public ShapeCreator setSize(int w, int h) {
            this.width = w;
            this.height = h;
            return this;
        }


        /**
        * 是否dp转px
        *
        * @param dpUnitEnabled true dp false px
        * @return
        */
        public ShapeCreator setDpUnitEnabled(boolean dpUnitEnabled) {
            this.dpUnitEnabled = dpUnitEnabled;
            return this;
        }

        /**
        * 是否开启交互状态
        *
        * @param stateEnabled true 支持 state_press="true' state_enabled="false"
        * @return
        */
        public ShapeCreator setStateEnabled(boolean stateEnabled) {
            this.stateEnabled = stateEnabled;
            return this;
        }

        /**
        * 文字颜色交互状态
        *
        * @param stateTextColorEnabled
        * @return
        */
        public ShapeCreator setStateTextColorEnabled(boolean stateTextColorEnabled) {
            this.stateTextColorEnabled = stateTextColorEnabled;
            return this;
        }

        /**
        * 默认颜色
        *
        * @param textColor
        * @return
        */
        public ShapeCreator setTextColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        /**
        * 按下颜色
        *
        * @param textPressColor
        * @return
        */
        public ShapeCreator setTextPressColor(int textPressColor) {
            this.textPressColor = textPressColor;
            return this;
        }

        /**
        * 禁用颜色
        *
        * @param textDisableColor
        * @return
        */
        public ShapeCreator setTextDisableColor(int textDisableColor) {
            this.textDisableColor = textDisableColor;
            return this;
        }

        public void into(View view) {
            Context context = view.getContext();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                GradientDrawable drawable = createGradientDrawable(context, -1);
                drawable.setUseLevel(false);
                ViewCompat.setBackground(view, drawable);
            } else {
                if (!stateEnabled) {
                    GradientDrawable drawable = createGradientDrawable(context, -1);
                    drawable.setUseLevel(false);
                    ViewCompat.setBackground(view, drawable);
                } else {
                    StateListDrawable drawable = new StateListDrawable();
                    GradientDrawable press = createGradientDrawable(context, 1);
                    press.setUseLevel(false);
                    GradientDrawable disable = createGradientDrawable(context, 2);
                    disable.setUseLevel(false);
                    GradientDrawable normal = createGradientDrawable(context, 3);
                    normal.setUseLevel(false);


                    drawable.addState(new int[]{android.R.attr.state_pressed}, press);
                    drawable.addState(new int[]{-android.R.attr.state_enabled}, disable);
                    drawable.addState(new int[]{}, normal);
                    ViewCompat.setBackground(view, drawable);
                }
            }

            if (stateTextColorEnabled && view instanceof TextView) {

                int[][] state = new int[3][];
                state[0] = new int[]{android.R.attr.state_pressed};
                state[1] = new int[]{-android.R.attr.state_enabled};
                state[2] = new int[]{};

                if (textColor != 0) {

                    if (textPressColor == 0) {
                        textPressColor = textColor;
                    }

                    if (textDisableColor == 0) {
                        textDisableColor = textColor;
                    }

                    ColorStateList colorStateList = new ColorStateList(state, new int[]{textPressColor, textDisableColor, textColor});

                    ((TextView) view).setTextColor(colorStateList);
                }


            }

        }


        private GradientDrawable createGradientDrawable(Context context, int type) {

            GradientDrawable drawable = new GradientDrawable();

            setXmlShapeType(drawable);
            setXmlSolid(drawable, type);
            setXmlSize(drawable, context);
            setXmlCorners(drawable, context);
            setXmlStroke(drawable, context, type);
            setXmlGradient(drawable, context);


            return drawable;

        }

        /**
        * <shape
        * android:shape='xxxx'>
        *
        * @param drawable
        */
        private void setXmlShapeType(GradientDrawable drawable) {
            drawable.setShape(shape);
        }

        /**
        * <corners />
        *
        * @param drawable
        * @param context
        */
        private void setXmlCorners(GradientDrawable drawable, Context context) {
            if (shape == RECTANGLE) {
                //矩形可以设置圆角
                if (cornerRadius != 0) {
                    drawable.setCornerRadius(dip2px(context, cornerRadius));
                } else {
                    drawable.setCornerRadii(new float[]{
                            //左上
                            dip2px(context, cornerRadiusLT),
                            dip2px(context, cornerRadiusLT),
                            //右上
                            dip2px(context, cornerRadiusRT),
                            dip2px(context, cornerRadiusRT),
                            //右下
                            dip2px(context, cornerRadiusRB),
                            dip2px(context, cornerRadiusRB),
                            //左下
                            dip2px(context, cornerRadiusLB),
                            dip2px(context, cornerRadiusLB)
                    });
                }
            }
        }

        /**
        * <solid/>
        *
        * @param drawable
        * @param type     当stateEnabled=true,同时Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP 生效
        *                 1:state_pressed=true
        *                 2:state_enabled=false
        *                 3:默认状态
        */
        private void setXmlSolid(GradientDrawable drawable, int type) {
            if (!stateEnabled) {
                drawable.setColor(solidColor);
            } else {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    int[][] state = new int[3][];
                    state[0] = new int[]{android.R.attr.state_pressed};
                    state[1] = new int[]{-android.R.attr.state_enabled};
                    state[2] = new int[]{};

                    ColorStateList colorStateList = new ColorStateList(state, new int[]{solidPressColor, solidDisableColor, solidColor});
                    drawable.setColor(colorStateList);
                } else {
                    switch (type) {
                        case 1:
                            drawable.setColor(solidPressColor);
                            break;
                        case 2:
                            drawable.setColor(solidDisableColor);
                            break;
                        case 3:
                            drawable.setColor(solidColor);
                            break;
                    }
                }
            }
        }

        /**
        * <stroke/>
        *
        * @param drawable
        * @param context
        * @param type     当stateEnabled=true,同时Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP 生效
        *                 1:state_pressed=true
        *                 2:state_enabled=false
        *                 3:默认状态
        */
        private void setXmlStroke(GradientDrawable drawable, Context context, int type) {


            if (!stateEnabled) {
                drawable.setStroke(dip2px(context, strokeWidth), strokeColor,
                        dip2px(context, strokeDashWidth), dip2px(context, strokeDashGap));
            } else {


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    int[][] state = new int[3][];
                    state[0] = new int[]{android.R.attr.state_pressed};
                    state[1] = new int[]{-android.R.attr.state_enabled};
                    state[2] = new int[]{};

                    ColorStateList colorStateList = new ColorStateList(state, new int[]{strokePressColor, strokeDisableColor, strokeColor});
                    drawable.setStroke(dip2px(context, strokeWidth), colorStateList,
                            dip2px(context, strokeDashWidth), dip2px(context, strokeDashGap));
                } else {
                    int color = solidColor;
                    switch (type) {
                        case 1:
                            color = strokePressColor;
                            break;
                        case 2:
                            color = strokeDisableColor;
                            break;
                        case 3:
                            color = strokeColor;
                            break;
                    }
                    drawable.setStroke(dip2px(context, strokeWidth), color,
                            dip2px(context, strokeDashWidth), dip2px(context, strokeDashGap));
                }
            }

        }

        /**
        * <size/>
        *
        * @param drawable
        * @param context
        */
        private void setXmlSize(GradientDrawable drawable, Context context) {
            if (width > 0 && height > 0) {
                drawable.setSize(dip2px(context, width), dip2px(context, height));
            }
        }


        /**
        * <gradient/>
        *
        * @param drawable
        * @param context
        */
        private void setXmlGradient(GradientDrawable drawable, Context context) {
            if (gradientType == -1) return;
            if (gradientType == LINEAR_GRADIENT) {
                drawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);
            } else if (gradientType == RADIAL_GRADIENT) {
                drawable.setGradientType(GradientDrawable.RADIAL_GRADIENT);
            } else if (gradientType == SWEEP_GRADIENT) {
                drawable.setGradientType(GradientDrawable.SWEEP_GRADIENT);
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                if (gradientCenterColor == 0) {
                    drawable.setColors(new int[]{gradientStartColor, gradientEndColor});
                } else {
                    drawable.setColors(new int[]{gradientStartColor, gradientCenterColor, gradientEndColor});
                }

                GradientDrawable.Orientation mOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
                switch (gradientAngle) {
                    case 0:
                        mOrientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        break;
                    case 45:
                        mOrientation = GradientDrawable.Orientation.BL_TR;
                        break;
                    case 90:
                        mOrientation = GradientDrawable.Orientation.BOTTOM_TOP;
                        break;
                    case 135:
                        mOrientation = GradientDrawable.Orientation.BR_TL;
                        break;
                    case 180:
                        mOrientation = GradientDrawable.Orientation.RIGHT_LEFT;
                        break;
                    case 225:
                        mOrientation = GradientDrawable.Orientation.TR_BL;
                        break;
                    case 270:
                        mOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
                        break;
                    case 315:
                        mOrientation = GradientDrawable.Orientation.TL_BR;
                        break;
                }
                drawable.setOrientation(mOrientation);

            } else {
                drawable.setColor(solidColor);
            }

            drawable.setGradientCenter(gradientCenterX, gradientCenterY);
            drawable.setGradientRadius(dip2px(context, gradientRadius));
        }

        /**
        * 设置默认渐变类型
        */
        private void defaultGradientType() {
            if (gradientType == -1) {
                gradientType = LINEAR_GRADIENT;
            }
        }

        private int dip2px(Context context, float dipValue) {
            if (dpUnitEnabled) {
                final float scale = context.getResources().getDisplayMetrics().density;
                return (int) (dipValue * scale + 0.5f);
            } else {
                return (int) dipValue;
            }
        }

    }
