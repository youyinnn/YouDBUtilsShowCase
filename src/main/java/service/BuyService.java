package service;

import cn.youyinnn.youdbutils.ioc.annotations.Transaction;
import cn.youyinnn.youdbutils.ioc.annotations.YouService;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/28
 */
@YouService
public class BuyService {

    @Transaction
    public void buy(Integer buyerId, Integer bookId, Integer number) {

        

    }
}
