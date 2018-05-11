package com.hiboom.monent.back.microservice.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

/**
 * wujj
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseMapper<T, PK extends java.io.Serializable> {

    void insert(T model);

    void delete(PK modelPK);

    T load(PK modelPK);

    void update(T model);


    int countAll();

    int countAll(Map where);

    /**
     * @return
     * @Title: findAll
     * @Description: TODO
     * @return: List<T>
     */
    List<T> findAll();

    List<T> findAll(Map where);

    /**
     * @param where
     * @param rowBounds
     * @return
     * @Title: findAll
     * @Description: TODO
     * @return: List<T>
     */
    List<T> findAll(Map where, RowBounds rowBounds);

    List<PK> findAllIds();


}
