# java
#### 安卓复习
##### 第一章：安卓概述
- windows7不属于移动操作系统
- java虚拟机JVM不属于安卓平台的技术架构
- activity通常就是一个单独的屏幕

##### 第二章：活动（activity）

Activity具有生命周期：
1. 激活或运行状态：此时的activity运行在屏幕的前台。
2. 暂停状态：此时activity失去焦点但仍对用户可见。
3. 停止状态：此时activity被其它activity完全覆盖。
4. 终止状态：此时activity将会被系统清理出内存。

Activity的7个方法定义了activity的生命周期：

|方法|功能描述|下一个方法|
|-|-|-|
|onCreate（）|activity初次被创建的时候使用|onStart（）、onRestart（）
|onStart（）|当activity即将对用户可见的时候被调用|onRestart()、onResume()
|onRestart()|当activity从停止状态重启的时候被调用|onResume()
|onResume()|当activity即将与用户进行交互时被调用|onPause（）
|onPause（）|当系统要启动其他的activity的时候被调用|onResume()、onStop（）
|onStop（）|当另外一个activity恢复并遮挡住当前activity时被调用|onStart()、onDestroy()
|onDestroy()|activity被销毁前调用的最后一个方法|无

Activity的生命周期还可以根据不同的标准划分为完整生命周期、可见生命周期、前台生命周期。

- 完整生命周期：onCreate（）到onDestroy（）
- 可见生命周期：onStart（）到onStop（）
- 前台生命周期：onResume（）到onPause（）

使用图片资源设置activity的背景：
> 新建Android项目，复制图片到res/drawable-mdpi目录，编辑res/layout/activity_main.xml

    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"	  
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:background="@drawable/td">
    <TextView
	    android:layout_width="fill_parent"
	    android:layout_height="wrap_content"
	    android:text="@string/hello"/>  
    </LinearLayout>

暂停下的Activity失去了焦点但是仍然对用户可见

android中的界面元素有以下三个部分构成：
- 视图组件
- 视图容器
- 布局管理


事件处理机制：
> 安卓系统采用java的时间处理机制，包括事件，事件源，事件监听器
> 事件：描述事件源状态改变的对象，由用户触发。
> 事件源：产生事件的对象，通常指UI组件。
> 事件监听器：对事件进行响应和处理。

> 事件包括：单击事件、按键事件、创建上下文菜单事件、焦点事件、触碰事件、选项事件

实现事件处理的步骤：
> 1.创建事件监听器
> 2.事件响应代码
> 3.在相应的组件上注册监听器

**对话框提示信息Toast**

    public class ToastActivity extends Activity{
	    private Button b1;
	    public void onCreate(Bundle savedInstanceState){
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.main);
		    b1 = (Button)findViewById(R.id.Button01);
		    b1.setOnClickListener(new OnClickListener(){
			    public void onClick(view v){
				    Toast t1 = Toast.makeText(getApplicationContext(),"我多显示一会儿"，Toast.LENGTH_LONG);
				    t1.show();
			    }
		    })
	    }
    }



**menu 选项菜单(OptionsMenu)**

    public class OptionMenuActivity extends Activity{
	    private final static int ITEM = Menu.FIRST;

		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.option_menu_act);
		}
		
		public boolean onCreateOptionsMenu(Menu menu){
			menu.add(0,ITEM,0,"开始游戏");
			menu.add(0, ITEM + 1, 0, "结束游戏");
			return true;
		}

		public boolean onOptionsItemSelected(MenuItem item){
			switch(item.getItemId()){
			case ITEM:
				setTitle("开始游戏");
				break;
			case ITEM + 1:
				setTitle("游戏退出");
				break;
			}
			return true;
		}
    }


**上下文菜单**
> 1. 重写 onCreateContextMenu(),调用add方法，添加菜单项
> 2. 重写onContextItemSelected(), 响应菜单点击事件
> 3. 在onCreate()方法中调用registerForContextMenu(),为视图注册上下文菜单

    public class ContextMenuAtivity extends Activity{
	    private static final int ITEM1 = Menu.FIRST;
	    private static final int ITEM2 = Menu.FIRST + 1;
	    private static final int ITEM3 = Menu.FIRST + 2;
	    private static final int ITEM4 = Menu.FIRST + 3;
	    private static final int ITEM5 = Menu.FIRST + 4;

		private TextView myTv;

		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstaneState);
			setContentView(R.id.layout.main);

			myTv = (TextView)findViewById(R.id.textView01);
			registerForContextMenu(myTv);
		}

		public boolean onCreateOptionsMenu(Menu menu){
			menu.add(0, ITEM1, 0, "开始游戏");
			menu.add(0, ITEM2, 0, "退出游戏");
			return true;
		}

		public boolean onOptionsItemSelected(MenuItem item){
			switch(item.getItemId()){
			case ITEM1:
				setTitle("开始");
				break;
			case ITEM2:
				setTitle("结束");
				break;
			}
			return true;
		}

		public void onCreateContextMenu(ContexMenu menu, View v, ContextMenuInFo menuInfo){
			menu.add(0, ITEM3, 0, "红色背景");
			menu.add(0, ITEm4, 0, "绿色背景");
			menu.add(0, ITEM5, 0, "白色背景");
		}

		public boolean onContextItemSelected(MenuItem item){
			switch(item.getItemId()){
			case ITEM3：
				setBackgroundColor(Color.RED);
				break;
			case ITEM4:
				setBackgroundColor(Color.GREEN);
				break;
			case ITEM5:
				setBackgroundColor(Color.WHITE);
				break;
			}
			return true;
		}
    }

**创建选项菜单的步骤：**
> 1. 覆盖Activity的onCreateOptionsMenu（）方法，当第一次打开菜单时，该方法被调用。
> 2.调用Menu的add（）方法添加菜单项
> 3.覆盖Activity的onOptionsItemSelected()方法来响应事件。

**创建上下文菜单的步骤：**
> 1.在onCreate()方法中调用registerForContextMenu()方法为视图注册上下文菜单
> 2.重写onCreateContextMenu()方法，调用add()添加菜单项
> 3.重写onContextItemMenu()方法，响应菜单点击事件。


**用于开发用户应用程序交互功能的组件**
> - 广播接收器
> - 意图
> - 适配器
> - 内容提供器

**Intent由动作、数据、分类、类型、组件和扩展信息组成**

    public class Activity1 extends Activity{
	    
	    public void onCreate(Bundle savedInstanceState){
		    RadioGroup RG_OS;
		    RadioButton RG_OS_BT1;
		    RadioButton RG_OS_BT2;
		    RadioButton RG_OS_BT3;
		    Button button_submit;
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity1);

			RG_OS = (RadioGroup)findViewById(R.id.RG_OS);
			RG_OS_BT1 = (RadioButton)findViewById(R.id.RG_OS_BT1);
			RG_OS_BT2 = (RadioButton)findViewById(R.id.RG_OS_BT2);
			RG_OS_BT3 = (RadioButton)findViewById(R.id.RG_OS_BT3);
			button_submit = (Button)findViewById(R.id.button_submit);
			button_submit.setOnClickListener(new ButtonOnClickListener());
		}
		
		class ButtonOnClickListener implements OnClickListener{
			public void onClick(View v){
				Intent myIntent = new Intent();
				myIntent.setClass(Activity1.this, Activity2.class);
				Activity1.this.startActivity(myIntent);
				Activity1.this.finish();
			}
		}
    }

    public class Activity2 extends Activity{
	    Button button_back;
	    public void onCreate(Bundle savedInstanceState){
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity2);
		    button_back = (Button)findViewById(R.id.button_back);
			button_back.setOnCliclListener(new ButtonOnClickListener());
	    }
	    
	    class ButtonOnClickListener implements OnClickListener{
		    Intent myIntent = new Intent();
		    myIntent.setClass(Activity2.this, Activity1.class);
		    Activity2.this.startActivity(myIntent);
		    Activity2.this.finish();
	    }
    }
    
简述Intent的过滤机制
> Intent过滤器是一种根据Intent中的动作(action)、类别(category)和数据(data)等内容。对适合接收该 Intent 的组件进行匹配和筛选的机制。Intent过滤器可以匹配数据类型、路径和协议，还可以确定多个匹配项顺序的优先级（priority）。应用程序的Activity、Service和 BroadcastReceiver 组件都可以注册Intent过滤器。这样，这些组件在特定的数据格式上则可以产生相应的动作。 


**Service类似于Linux操作系统中的守护进程。**

**Service具有以下特点：**
1. 没有用户界面，不与用户交互
2. 长时间运行，不占用程序控制权。
3. 比Activity的 优先级更高，不会轻易的倍Android系统终止，即使Service倍系统终止，在系统资源恢复之后Service仍将自动运行。
4. 用于进程间通信，解决两个不同进程间的调用和通信问题。

实现Service
> 1. 创建一个Service类并配置
> 2. 启动或绑定Service
> 3. 停止Service
