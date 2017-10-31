package dao;

import cn.youyinnn.youdbutils.dao.YouDao;
import cn.youyinnn.youdbutils.utils.YouCollectionsUtils;
import model.BookShop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/22
 */
public class BookShopDao extends YouDao<BookShop> {

    public int insertBook(BookShop bookShop) {
        return modelHandler.saveModel(bookShop);
    }

    public int sellBook(Integer bookId , int sell) {

        return modelHandler.subtraction("store", sell , YouCollectionsUtils.getYouHashMap("bookId",bookId));
    }

    public ArrayList<BookShop> getBook(HashMap<String, Object> conditionsMap) {

        return modelHandler.getListWhereLikeAndLike(conditionsMap,null);
    }
}
