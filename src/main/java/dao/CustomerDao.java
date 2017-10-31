package dao;

import cn.youyinnn.youdbutils.dao.YouDao;
import model.Customer;

import java.util.ArrayList;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/16
 */
public class CustomerDao extends YouDao<Customer>{

    public int insertCustomer(Customer customer) {

        return modelHandler.saveModel(customer);
    }

    public ArrayList<Customer> getAllCustomer(ArrayList<String> queryList) {

        return modelHandler.getListForAll(queryList);
    }

}
