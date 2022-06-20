package object;

import java.util.Date;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/13
 */
public class ProjectOrder {
    private Long projectOrderId;
    private Integer brandId;
    private Date ctime;

    public ProjectOrder() {

    }

    public Long getProjectOrderId() {
        return projectOrderId;
    }

    public void setProjectOrderId(Long projectOrderId) {
        this.projectOrderId = projectOrderId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
