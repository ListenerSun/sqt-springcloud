package com.sqt.service;

import com.sqt.entities.Dept;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

import java.util.ArrayList;
import java.util.List;

@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptno(id)
                        .setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                List<Dept> msg = new ArrayList<>();
                msg.add(new Dept().setDeptno(null)
                        .setDname("该服务已经关闭")
                        .setDb_source("no this database in MySQL"));
                return msg;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
         
         
         