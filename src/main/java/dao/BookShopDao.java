package dao;

import cn.youyinnn.youdbutils.dao.YouDao;
import cn.youyinnn.youdbutils.exceptions.NoneffectiveUpdateExecuteException;
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
        int saveModel = 0;
        try {
            saveModel = modelHandler.saveModel(bookShop);
        } catch (NoneffectiveUpdateExecuteException e) {
            e.printStackTrace();
        }
        return saveModel;
    }

    public int sellBook(Integer bookId , int sell) {
        int subtraction = 0;

        try {
            subtraction = modelHandler.subtraction("store", sell, YouCollectionsUtils.getYouHashMap("bookId", bookId));
        } catch (NoneffectiveUpdateExecuteException e) {
            e.printStackTrace();
        }

        return subtraction;
    }

    public ArrayList<BookShop> getBook(HashMap<String, Object> conditionsMap) {

        return modelHandler.getListWhereLikeAndLike(conditionsMap,null);
    }

    public Integer getBookPrice(Integer bookId) {
        return (Integer) modelHandler.getModelFieldValue("price",YouCollectionsUtils.getYouHashMap("bookId",bookId));
    }
}
