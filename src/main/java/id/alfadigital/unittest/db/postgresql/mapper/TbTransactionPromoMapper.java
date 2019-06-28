package id.alfadigital.unittest.db.postgresql.mapper;

import id.alfadigital.unittest.db.postgresql.model.TbTransactionPromo;
import id.alfadigital.unittest.db.postgresql.model.TbTransactionPromoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTransactionPromoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    long countByExample(TbTransactionPromoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int deleteByExample(TbTransactionPromoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long tbtoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int insert(TbTransactionPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int insertSelective(TbTransactionPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    List<TbTransactionPromo> selectByExample(TbTransactionPromoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    TbTransactionPromo selectByPrimaryKey(Long tbtoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbTransactionPromo record, @Param("example") TbTransactionPromoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbTransactionPromo record, @Param("example") TbTransactionPromoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbTransactionPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_transaction_promo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbTransactionPromo record);
}