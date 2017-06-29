package com.app;

import com.app.dao.impl.JPQLDeviceDao;
import com.app.model.Device;

import java.util.List;

/**
 * Created by User on 29.06.2017.
 */
public class JPQLSample {

    public static void main(String[] args) {
        JPQLDeviceDao jpqlDeviceDao = new JPQLDeviceDao();
        jpqlDeviceDao.createDevice(100);
        List<Device> devices=jpqlDeviceDao.readAllDevices();
        for(Device d: devices){
            System.out.println(d);
        }
        System.out.println("----------------");
        long count = jpqlDeviceDao.readAllDevicesCount();
        System.out.println(count);

        System.out.println("----------------");
        long priceSum = jpqlDeviceDao.readSumOfPriceOfAllDevices();
        System.out.println(priceSum);
        System.out.println("----------------");
        devices=jpqlDeviceDao.readAllDevicesByModel("Model5");
        for(Device d: devices){
            System.out.println(d);
        }
        System.out.println("-------Pagination---------");
        //show 20 items on1 page
        /*
        1-20
        20-40
        */
        //limit
        //rownum
        devices=jpqlDeviceDao.readAllDevicesForPaging(4, 120);
        for(Device d: devices){
            System.out.println(d);
        }
    }
}
