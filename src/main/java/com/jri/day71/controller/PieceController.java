package com.jri.day71.controller;

import com.github.pagehelper.PageInfo;
import com.jri.day71.dao.PieceDao;
import com.jri.day71.entity.Piece;
import com.jri.day71.entity.ResultBean;
import com.jri.day71.service.PieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Demo class
 *
 * @author hijri
 * @version V9.10
 * @date 2021/10/22
 */
@RequestMapping("/piece")
@RestController
@CrossOrigin
public class PieceController {


    @Autowired
    private PieceService pieceService;


    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/getPieces")
    public ResultBean getPieces(){
        List<Piece> pieces = pieceService.queryPieces();
        ResultBean resultBean  = new ResultBean();
        resultBean.setCode(1000);
        resultBean.setMessage("查询成功");
        resultBean.setData(pieces);
        return resultBean;
    }

    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/getPiecePage/{page}/{limit}")
    public ResultBean getPiecePage(@PathVariable Integer page, @PathVariable Integer limit){

        ResultBean resultBean  = new ResultBean();
        PageInfo pageInfo = pieceService.queryPieceByPage(page,limit);
        resultBean.setCode(1000);
        resultBean.setMessage("查询成功");
        resultBean.setData(pageInfo);
        return resultBean;
    }



    @Autowired
    private PieceDao pieceDao;

    /**
     * 数据回显查询
     * @param id
     * @return
     */
    @RequestMapping("/getPieceById/{id}")
    public ResultBean getPieceById(@PathVariable Integer id){
        Piece piece = pieceDao.selectByPrimaryKey(id);
        ResultBean resultBean = new ResultBean();
        resultBean.setData(1000);
        resultBean.setMessage("查询成功");
        resultBean.setData(piece);
        return resultBean;
   }

   @RequestMapping("/modifyPiece")
    public ResultBean modifyPiece(@RequestBody Piece piece){
       Integer ret = pieceService.modifyPiece(piece);
        ResultBean resultBean = new ResultBean();
       resultBean.setCode(1000);
       resultBean.setMessage("查询成功");
       resultBean.setData(piece);
       return resultBean;

   }

   @RequestMapping("/register")
    public ResultBean addPiece(@RequestBody Piece piece){
       Integer ret = pieceService.addPiece(piece);

       ResultBean resultBean = new ResultBean();
       resultBean.setCode(1000);
       resultBean.setMessage("查询成功");
       resultBean.setData(piece);
       return resultBean;

   }

   @RequestMapping("/removePiece/{id}")
    public ResultBean removePiece(@PathVariable Integer id){
       Integer ret = pieceService.removePiece(id);

       ResultBean resultBean = new ResultBean();
       resultBean.setCode(1000);
       resultBean.setMessage("删除成功");
       resultBean.setData(ret);
       return resultBean;

   }


}
