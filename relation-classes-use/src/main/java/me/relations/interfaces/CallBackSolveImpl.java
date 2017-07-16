package me.relations.interfaces;

/**
 * Created by gao on 2017/7/16 21:34.
 *
 * @星期日
 */
public class CallBackSolveImpl implements CallBackSolve {

    private Li li;

    public CallBackSolveImpl(Li li){
        this.li = li;
    }

    @Override
    public void slove(String result) {
        System.out.println("我知道了"+result);

    }

    public void ask(String question){
        System.out.println("提问："+question);
        li.exec(CallBackSolveImpl.this, question);
    }
}
