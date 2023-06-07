package com.gyq.product.service.impl;

/**
 * @author GYQ
 * @date 2022/11/28 09:16
 */

public class TestA {
    interface Cal{

        void Test11(String aa);
        //void Add();
    }

    public static void main(String[] args) {
     /* Cal cal = new Cal() {
          @Override
          public void Test11(String aa) {
              System.out.println("test");
          }
      };*/

      Cal cal1 = (String aa)->{
          System.out.println("test");
      };

      cal1.Test11("uj");
    }
}
