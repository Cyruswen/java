public class Activity1 extends Activity{
    public void onCreate(Bundle savedInstanceState){
        RadioGroup RG_OS;
        RadioButton RG_OS_RB1, RG_OS_RB2, RG_OS_RB3;
        Button button_submit;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        
        RG_OS = (RadioGroup)findViewById(R.id.RG_OS);
        RG_OS_RB1 = (RadioButton)findViewById(R.id.RG_OS_RB2);
        RG_OS_RB3 = (RadioButton)findViewById(R.id.RG_OS_RB3);
        button_submit = (Button)findViewById(R.id.button_submit);

        button_submit.setOnClickListener(new OnClickListener());
    }

    class ButtonClickListener implements OnClickListener{
        public void onClick(View v){
            Intent myIntent = new Intent();

            myIntent.setClass(Activity1.this, Activity2.class);
          
            //启动另外一个Activity
            Activity1.this.startActivity(myIntent);
            //关闭当前activity
            Activity1.this.finish();
        }
    }

}

public class Activity2 extends Activity{
    Button button_back;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Actiity2);

        button_back = (Button)findViewById(R.id.button_back);

        button_back.setOnClickListener(new OnClickListener());
    }

    class ButtonClickListener implements OnClickListener{
        public onClick(View v){
            Intent myIntent = new Intent();
            myIntent.setClass(Actiity2.this, Activity1.class);

            Actiity2.this.startActivity(myIntent);

            Actiity2.this.finish();
        }
    }
}
