package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbTransactionSeq;

public interface HbTransactionSeqMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HbTransactionSeq record);

    int insertSelective(HbTransactionSeq record);

    HbTransactionSeq selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HbTransactionSeq record);

    int updateByPrimaryKey(HbTransactionSeq record);
}