package top.ityf.service.impl;

import top.ityf.service.AccountService;

/**
 * ClassName:AccountService
 * Package: top.ityf.service.impl
 * Description: 账户的业务层实现类
 *
 * @Date: 2020/2/13 18:13
 * @Author: YanFei
 */
public class AccountServiceImpl implements AccountService {
    public void saveAccount() {
        System.out.println("执行了保存操作");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新操作" + i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除操作");
        return 0;
    }
}
