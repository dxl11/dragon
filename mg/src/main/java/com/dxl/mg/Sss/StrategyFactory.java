package com.dxl.mg.Sss;

import com.dxl.mg.config.SaTokenConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class StrategyFactory implements ApplicationContextAware {

    private final Map<AdvertisingTypeEnum, AdertisingDataReported> STRATEGY_MAP = new ConcurrentHashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //返回该接口的所有的实现类
        Map<String, AdertisingDataReported> tempMap = applicationContext.getBeansOfType(AdertisingDataReported.class);
        tempMap.values().forEach(strategyService -> STRATEGY_MAP.put(strategyService.advertisingType(), strategyService));
    }

    public <T extends AdertisingDataReported> AdertisingDataReported getInstance(Class<T> clazz) {
        return STRATEGY_MAP.get(clazz.getName());

    }

}
