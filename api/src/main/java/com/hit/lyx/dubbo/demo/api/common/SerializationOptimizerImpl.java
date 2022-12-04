package com.hit.lyx.dubbo.demo.api.common;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.hit.lyx.dubbo.demo.api.entity.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * kyro序列化时，要有一个辅助类明确指定类型
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(User.class);
        return classes;
    }
}
