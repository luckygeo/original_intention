package me.relations.interfaces;

/**
 * Created by gao on 2017/7/16 21:36.
 *
 * @星期日
 */
public class Li {
    public void exec(CallBackSolve backSolve,String ques){
        System.out.println("问题是？" + ques);
        String result = "2";
        backSolve.slove(result);

    }
}
