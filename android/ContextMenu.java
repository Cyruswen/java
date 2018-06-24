public class ContextMenuActivity extends Activity{
    private static final int ITEM1 = Menu.FIRST;
    private static final int ITEM2 = Menu.FIRST + 1;
    private static final int ITEM3 = Menu.FIRST + 3;
    private static final int ITEM4 = Menu.FIRST + 4;
    private static final int ITEM5 = Menu.FIRST + 5;

    private TextView myTv;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myTv = (TextView)findViewById(R.id.TextView01);
        registerForContextMenu(myTv);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, ITEM1, 0, "开始");
        menu.add(0, ITEM1, 0, "退出");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case ITEM1:
                setTitle("开始游戏!");
                break;
            case ITEM2:
                setTitle("退出！");
                break;
        }
        return true;
    }

    public void onCreateConTextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo){
        menu.add(0, ITEM3, 0, "红色背景");
        menu.add(0, ITEM4, 0, "绿色背景");
        menu.add(0, ITEM5, 0, "白色背景");
    }
}
