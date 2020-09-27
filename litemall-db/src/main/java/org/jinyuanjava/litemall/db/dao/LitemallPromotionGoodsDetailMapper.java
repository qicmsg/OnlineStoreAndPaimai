package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallPromotionGoodsDetail;
import org.jinyuanjava.litemall.db.domain.LitemallPromotionGoodsDetailExample;

public interface LitemallPromotionGoodsDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    long countByExample(LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int insert(LitemallPromotionGoodsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int insertSelective(LitemallPromotionGoodsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallPromotionGoodsDetail selectOneByExample(LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallPromotionGoodsDetail selectOneByExampleSelective(@Param("example") LitemallPromotionGoodsDetailExample example, @Param("selective") LitemallPromotionGoodsDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallPromotionGoodsDetail> selectByExampleSelective(@Param("example") LitemallPromotionGoodsDetailExample example, @Param("selective") LitemallPromotionGoodsDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    List<LitemallPromotionGoodsDetail> selectByExample(LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallPromotionGoodsDetail selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallPromotionGoodsDetail.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    LitemallPromotionGoodsDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallPromotionGoodsDetail selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallPromotionGoodsDetail record, @Param("example") LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallPromotionGoodsDetail record, @Param("example") LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallPromotionGoodsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallPromotionGoodsDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallPromotionGoodsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_promotion_goods_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}