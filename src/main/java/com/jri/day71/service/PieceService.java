package com.jri.day71.service;

import com.github.pagehelper.PageInfo;
import com.jri.day71.entity.Piece;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Demo class
 *
 * @author hijri
 * @version V9.10
 * @date 2021/10/22
 */

public interface PieceService {

    /**
     * 查询所有
     * @return
     */
    List<Piece> queryPieces();


    /**
     * 分页
     * @param page
     * @param limit
     * @return
     */
    PageInfo queryPieceByPage(Integer page, Integer limit);


    /**
     * 添加
     * @param piece
     * @return
     */
    Integer addPiece(Piece piece);

    /**
     * 删除
     * @param id
     * @return
     */
    Integer removePiece(Integer id);

    /**
     * 修改
     * @param piece
     * @return
     */
    Integer modifyPiece(Piece piece);

}
