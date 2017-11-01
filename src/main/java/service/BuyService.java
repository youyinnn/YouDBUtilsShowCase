package service;

import cn.youyinnn.youdbutils.ioc.annotations.Autowired;
import cn.youyinnn.youdbutils.ioc.annotations.Transaction;
import cn.youyinnn.youdbutils.ioc.annotations.YouService;
import dao.BookShopDao;
import dao.CustomerDao;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/28
 */
@YouService
public class BuyService {

    @Autowired
    private BookShopDao bookShopDao;
    @Autowired
    private CustomerDao customerDao;

    @Transaction(allowNoneffectiveUpdate = false)
    public void buy(Integer buyerId, Integer bookId, Integer number) {

        Integer bookPrice = bookShopDao.getBookPrice(bookId);

        System.out.println("buy :"+customerDao.buy(buyerId, bookPrice * number));

        System.out.println("sell :"+bookShopDao.sellBook(bookId, number));
    }
}
