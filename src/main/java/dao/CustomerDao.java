package dao;

import cn.youyinnn.youdbutils.dao.YouDao;
import cn.youyinnn.youdbutils.exceptions.NoneffectiveUpdateExecuteException;
import cn.youyinnn.youdbutils.utils.YouCollectionsUtils;
import model.Customer;

import java.util.ArrayList;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/16
 */
public class CustomerDao extends YouDao<Customer>{

    public int insertCustomer(Customer customer) {

        int saveModel = 0;
        try {
            saveModel = modelHandler.saveModel(customer);
        } catch (NoneffectiveUpdateExecuteException e) {
            e.printStackTrace();
        }
        return saveModel;
    }

    public ArrayList<Customer> getAllCustomer(ArrayList<String> queryList) {

        return modelHandler.getListForAll(queryList);
    }

    public int buy(Integer id,Integer cost) {

        int subtraction = 0;

        try {
            subtraction = modelHandler.subtraction("balance", Double.valueOf(cost + ""), YouCollectionsUtils.getYouHashMap("id", id));
        } catch (NoneffectiveUpdateExecuteException e) {
            e.printStackTrace();
        }

        return subtraction;
    }

}
