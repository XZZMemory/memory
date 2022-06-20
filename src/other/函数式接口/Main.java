package other.函数式接口;

import object.ProjectOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/13
 */
public class Main {
    public static void main(String[] args) {


        List<ProjectOrder> orderList = new ArrayList<>();

//        MyFunction function=


        FunctionExecute execute = new FunctionExecute<Long, ProjectOrder>();
        List<Long> res = execute.doSth(orderList, new MyFunction<Long, ProjectOrder>() {
            @Override
            public Long execute(ProjectOrder param) {
                return param.getProjectOrderId() + 1;
            }
        });


        List<Long> projectOrderIdList1 = orderList.stream().map(new Function<ProjectOrder, Long>() {

            @Override
            public Long apply(ProjectOrder dto) {
                return dto.getProjectOrderId();
            }
        }).collect(Collectors.toList());
        List<Long> projectOrderIdList2 = orderList.stream().map(dto -> dto.getProjectOrderId()).collect(Collectors.toList());
        List<Long> projectOrderIdList3 = orderList.stream().map(ProjectOrder::getProjectOrderId).collect(Collectors.toList());

    }
}
