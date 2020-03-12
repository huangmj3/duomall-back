package huangmaojie.duomll.user.service;

/**
 * @author huangmaojie
 * @date 2020/3/11
 */
public interface UserService {
    /**
     * 增加普通用户
     */
    void addNormalUser();
    /**
     * 增加商品管理员用户
     */
    void addProductManager();
    /**
     * 增加物流管理员用户
     */
    void addLogisticManager();
}
