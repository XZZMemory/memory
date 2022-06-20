package other.函数式接口;


import java.util.LinkedList;
import java.util.List;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/13
 */
public class FunctionExecute<T, R> {
    public List<T> doSth(List<R> param, MyFunction<T, R> function) {
        List<T> res = new LinkedList<>();
        System.out.println("【执行前】....");
        param.stream().forEach(e -> {
                    res.add(function.execute(e));
                }
        );
        System.out.println("【执行后】....");
        return res;

    }
}
