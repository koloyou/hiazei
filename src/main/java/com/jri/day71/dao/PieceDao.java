package com.jri.day71.dao;

import com.jri.day71.entity.Piece;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PieceDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Piece record);

    int insertSelective(Piece record);

    Piece selectByPrimaryKey(Integer id);

    List<Piece> selectPieces();

    int updateByPrimaryKeySelective(Piece record);

    int updateByPrimaryKey(Piece record);
}