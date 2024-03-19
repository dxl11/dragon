package com.dxl.mysqlstudy.service;

import com.dxl.mysqlstudy.entity.SellOrder;
import com.dxl.mysqlstudy.mappers.SellOrderMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class SellOrderService  {

    @Resource
    private SellOrderMapper sellOrderMapper;


    public void insert() {

        


        while (true) {
            int minValue = 1;
            int maxValue = 100;
            Random random = new Random();
            int randomInt = random.nextInt(maxValue - minValue + 1) + minValue;

            int start = '\u4e00';
            int end = '\u9fa5';
            // 生成随机的汉字索引
            int index = random.nextInt((end - start + 1));
            // 将索引转换为相应的汉字
            char chineseChar = (char) (start + index);

            UUID uuid = UUID.randomUUID();
            SellOrder sellOrder = new SellOrder();
            sellOrder.setAccountBatchNumberUnit("[{\"account\":50,\"batchNumber\":\"AMB2314-B04-202402001\",\"unit\":\"克\"}]");
            sellOrder.setSigningTime(new Date());
            sellOrder.setContractNo(uuid.toString());
            sellOrder.setProductName("张三");
            sellOrder.setCasOrder("Ethyl (4R,5R)-4,5-dimethyl-3-oxo-5- (trifluoromethyl)tetrahydrofuran-2-carboxylate");
            sellOrder.setUnit("克");
            sellOrder.setAmount(new BigDecimal(randomInt));
            sellOrder.setUnitPrice(new BigDecimal(randomInt + 1));
            sellOrder.setTotalPrice(new BigDecimal(randomInt + 100));
            sellOrder.setCustomerName("艾立康药业股份有限公司" + chineseChar);
            sellOrder.setSalesPerson("张三" + chineseChar);
            sellOrder.setShipmentsTime(new Date());
            sellOrder.setBillingTime(new Date());
            sellOrder.setAccountsDueTime(new Date());
            sellOrder.setAccountsTime(new Date());
            sellOrder.setCreateTime(new Date());
            sellOrderMapper.insertSelective(sellOrder);
        }
    }
}
