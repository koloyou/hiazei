package com.jri.day71.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jri.day71.dao.PieceDao;
import com.jri.day71.entity.Piece;
import com.jri.day71.service.PieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Demo class
 *
 * @author hijri
 * @version V9.10
 * @date 2021/10/22
 */
@Service
public class PieceServiceImpl implements PieceService {

    @Autowired
    private PieceDao pieceDao;
    @Override
    public List<Piece> queryPieces() {

        return pieceDao.selectPieces();
    }

    @Override
    public PageInfo queryPieceByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Piece> pieces = pieceDao.selectPieces();
        PageInfo pageInfo = new PageInfo(pieces);
        return pageInfo;
    }

    @Override
    public Integer addPiece(Piece piece) {
        return pieceDao.insertSelective(piece);
    }

    @Override
    public Integer removePiece(Integer id) {
        return pieceDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer modifyPiece(Piece piece) {
        return pieceDao.updateByPrimaryKeySelective(piece);
    }
}
