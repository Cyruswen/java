public class ToastActivity extends Activity{
    private Button b1;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b1 = (Button)findViewById(R.id.Button01);

        b1.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Toast t1 = Toast.makeText(getApplicationContext(), "long", Toast.LENGTH_LONG);
                t1.show();
            }
        })
    }
}
