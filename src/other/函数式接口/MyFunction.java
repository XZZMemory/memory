package other.函数式接口;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/13
 */
@FunctionalInterface
public interface MyFunction<R, T> {
    R execute(T param);
}
