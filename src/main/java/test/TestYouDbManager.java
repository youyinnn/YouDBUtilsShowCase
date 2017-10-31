package test;

import cn.youyinnn.youdbutils.YouDbManager;
import cn.youyinnn.youdbutils.exceptions.NoDataSourceInitException;

import java.sql.SQLException;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/22
 */
public class TestYouDbManager {

    public static void main(String[] args) throws NoDataSourceInitException, SQLException {
        YouDbManager.youDruid.initSQLiteDataSource();
        YouDbManager.scanPackageForModel("model");

        //YouDbManager.printModelFieldMap();
        //YouDbManager.printTableFieldMap();
        YouDbManager.printModelTableFieldMapping();
    }

}
