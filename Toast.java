public class ToastActivity extends Activity{
    private Button b1;
    private Button b2;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b1 = (Button)findViewById(R.id.Button01);
        b2 = (Button)findViewById(R.id.Button02);

        b1.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Toast t1 = Toast.makeText(getApplicationContext(), "我多显示一会儿", Toast.LENGTH_LONG);
                t1.show();
            }
        })

        b2.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Toast t2 = Toast.makeText(getApplicationContext(), "我少显示一会儿", Toast.LENGTH_SHORT);
                t2.show();
            }
        })
    }
}
