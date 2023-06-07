package com.gyq.product;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gyq.product.entity.PmsBrand;
import com.gyq.product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    PmsBrandService brandService;


    @Test
    public void contextLoads() {
        List<PmsBrand> brandId = brandService.list(new QueryWrapper<PmsBrand>().eq("brand_id", 1L));
        brandId.forEach((item) -> {
            System.out.println("hello world");
            System.out.println(item);
        });
    }



}
