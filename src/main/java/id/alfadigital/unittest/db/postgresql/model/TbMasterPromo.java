package id.alfadigital.unittest.db.postgresql.model;

import java.math.BigDecimal;

public class TbMasterPromo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_master_promo.tbmpro_id
     *
     * @mbg.generated
     */
    private Long tbmproId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_master_promo.tbmpro_name
     *
     * @mbg.generated
     */
    private String tbmproName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_master_promo.tbmpro_disc_precentage
     *
     * @mbg.generated
     */
    private BigDecimal tbmproDiscPrecentage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_master_promo.tbmpro_id
     *
     * @return the value of public.tb_master_promo.tbmpro_id
     * @mbg.generated
     */
    public Long getTbmproId() {
        return tbmproId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_master_promo.tbmpro_id
     *
     * @param tbmproId the value for public.tb_master_promo.tbmpro_id
     * @mbg.generated
     */
    public void setTbmproId(Long tbmproId) {
        this.tbmproId = tbmproId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_master_promo.tbmpro_name
     *
     * @return the value of public.tb_master_promo.tbmpro_name
     * @mbg.generated
     */
    public String getTbmproName() {
        return tbmproName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_master_promo.tbmpro_name
     *
     * @param tbmproName the value for public.tb_master_promo.tbmpro_name
     * @mbg.generated
     */
    public void setTbmproName(String tbmproName) {
        this.tbmproName = tbmproName == null ? null : tbmproName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_master_promo.tbmpro_disc_precentage
     *
     * @return the value of public.tb_master_promo.tbmpro_disc_precentage
     * @mbg.generated
     */
    public BigDecimal getTbmproDiscPrecentage() {
        return tbmproDiscPrecentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_master_promo.tbmpro_disc_precentage
     *
     * @param tbmproDiscPrecentage the value for public.tb_master_promo.tbmpro_disc_precentage
     * @mbg.generated
     */
    public void setTbmproDiscPrecentage(BigDecimal tbmproDiscPrecentage) {
        this.tbmproDiscPrecentage = tbmproDiscPrecentage;
    }
}