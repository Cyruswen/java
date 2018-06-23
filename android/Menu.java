public class OptionMenuActivity extends Activity{
    private final static int ITEM = Menu.FIRST;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu_act);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, ITEM, 0, "开始");
        menu.add(0, ITEM + 1, 0, "退出");
        return true;
    }

    public boolean onOptionsItemSelect(MenuItem item){
        switch(item.getItemId()){
            case ITEM:
                setTitle("开始游戏");
                break;
            case ITEM + 1:
                setTitle("退出！");
                breakl
        }
        return true;
    }
}
