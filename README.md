# MybatisSqlGenerator
 本项目，适用于尚未集成mybatis-plus的项目，作为可以单独运行的工具工程，它能迅速生成基于mybatis的单表的常用sql语句。如插入，批量插入，更新，批量查找。

 ## 1，添加数据库配置:</br>
  ```Java
public class Generator {

     //数据库配置
     private static String url = "jdbc:mysql://0.0.0.1:3306/test?autoReconnect=true&characterEncoding=UTF-8&serverTimezone=UTC";
     private static String driverName = "com.mysql.cj.jdbc.Driver";
     private static String userName = "";
     private static String userPwd = "";

     // 待生成的表名，注意是覆盖更新
     private static String[] tableNames;

     //表名，一次可以设置多个。每个表的字段名，建议全部小写，单词之间下划线隔开！
     static{
        tableNames = new String[]{
                "pt_soldier_info_review",
        };
     }
}
  ```



  ## 2，执行Generator的main方法，将通过Beetl得到pojo类，生成的sql（全部自动生成）写在了注释了。示例：com.chuck.core.dao.entity.PtSoldierInfoReview.java : </br>
  ```Java
  package com.chuck.core.dao.entity;
  import com.baomidou.mybatisplus.extension.activerecord.Model;
  import java.util.Date;
  import java.time.LocalDate;
  import com.baomidou.mybatisplus.annotation.TableField;
  import java.io.Serializable;
  import io.swagger.annotations.ApiModel;
  import io.swagger.annotations.ApiModelProperty;
  import lombok.Data;
  import lombok.EqualsAndHashCode;
  import lombok.experimental.Accessors;
  /**
   * <p>
   * 基本信息-审核表
   * </p>
   *
   * @author chuck
   * @since 2020-12-08
   */
  @Data
  @ApiModel(value="PtSoldierInfoReview对象", description="基本信息-审核表")
  public class PtSoldierInfoReview extends Model<PtSoldierInfoReview> {
  
      private static final long serialVersionUID = 1L;
  
  
  /**
  自动生成pt_soldier_info_review表相关的，mybatis里的insert语句:
  
      INSERT INTO
        pt_soldier_info_review(
           Soldier_Info_Id,
           Soldier_Name,
           Soldier_Gender,
           Soldier_Marital_Status,
           Soldier_Bithday,
           Soldier_Nation,
           Soldier_Political_Outlook,
           Soldier_Education_Level,
           Soldier_Id_No,
           Soldier_Hukou_Type,
           Soldier_Hukou_Province,
           Soldier_Hukou_City,
           Soldier_Hukou_District,
           Soldier_Hukou_Street,
           Soldier_Hukou_Village,
           Soldier_Tel,
           Soldier_Address,
           Soldier_Type,
           Soldier_Jiuye,
           Soldier_Xgzdw,
           Soldier_Xgzdw_Type,
           Soldier_Ruwushijian,
           Soldier_Ruwuhukou,
           Soldier_Retire_Time,
           Soldier_Retire_No,
           Soldier_Apply_Glory_Card_Time,
           Soldier_Hang_Glory_Card,
           Soldier_Resettlement_Place,
           Soldier_Housing_Situation,
           Soldier_Medical_Insurance,
           Soldier_Endowment_Insurance,
           Soldier_Xsgjfxbzj,
           Soldier_Xscjrlxbt,
           Soldier_Social_Assistance,
           Soldier_Removed,
           Soldier_Removed_Reason,
           Soldier_Removed_Time,
           Soldier_Creator_Id,
           Soldier_CTime,
           Soldier_UTime,
           Soldier_Azd_Province,
           Soldier_Azd_City,
           Soldier_Azd_District,
           Next_Reviewer_Area_Code,
           Review_Status,
           Review_Type,
           Reject_Msg,
           Reviewer_Id,
           Review_Time
        )
        VALUES
        (
            #{soldierInfoId,jdbcType=VARCHAR},
            #{soldierName,jdbcType=VARCHAR},
            #{soldierGender,jdbcType=VARCHAR},
            #{soldierMaritalStatus,jdbcType=VARCHAR},
            #{soldierBithday,jdbcType=TIMESTAMP},
            #{soldierNation,jdbcType=VARCHAR},
            #{soldierPoliticalOutlook,jdbcType=VARCHAR},
            #{soldierEducationLevel,jdbcType=VARCHAR},
            #{soldierIdNo,jdbcType=VARCHAR},
            #{soldierHukouType,jdbcType=VARCHAR},
            #{soldierHukouProvince,jdbcType=VARCHAR},
            #{soldierHukouCity,jdbcType=VARCHAR},
            #{soldierHukouDistrict,jdbcType=VARCHAR},
            #{soldierHukouStreet,jdbcType=VARCHAR},
            #{soldierHukouVillage,jdbcType=VARCHAR},
            #{soldierTel,jdbcType=VARCHAR},
            #{soldierAddress,jdbcType=VARCHAR},
            #{soldierType,jdbcType=VARCHAR},
            #{soldierJiuye,jdbcType=VARCHAR},
            #{soldierXgzdw,jdbcType=VARCHAR},
            #{soldierXgzdwType,jdbcType=VARCHAR},
            #{soldierRuwushijian,jdbcType=TIMESTAMP},
            #{soldierRuwuhukou,jdbcType=VARCHAR},
            #{soldierRetireTime,jdbcType=TIMESTAMP},
            #{soldierRetireNo,jdbcType=VARCHAR},
            #{soldierApplyGloryCardTime,jdbcType=TIMESTAMP},
            #{soldierHangGloryCard,jdbcType=VARCHAR},
            #{soldierResettlementPlace,jdbcType=VARCHAR},
            #{soldierHousingSituation,jdbcType=VARCHAR},
            #{soldierMedicalInsurance,jdbcType=VARCHAR},
            #{soldierEndowmentInsurance,jdbcType=VARCHAR},
            #{soldierXsgjfxbzj,jdbcType=VARCHAR},
            #{soldierXscjrlxbt,jdbcType=VARCHAR},
            #{soldierSocialAssistance,jdbcType=VARCHAR},
            #{soldierRemoved,jdbcType=INTEGER},
            #{soldierRemovedReason,jdbcType=INTEGER},
            #{soldierRemovedTime,jdbcType=TIMESTAMP},
            #{soldierCreatorId,jdbcType=VARCHAR},
            #{soldierCtime,jdbcType=TIMESTAMP},
            #{soldierUtime,jdbcType=TIMESTAMP},
            #{soldierAzdProvince,jdbcType=VARCHAR},
            #{soldierAzdCity,jdbcType=VARCHAR},
            #{soldierAzdDistrict,jdbcType=VARCHAR},
            #{nextReviewerAreaCode,jdbcType=VARCHAR},
            #{reviewStatus,jdbcType=INTEGER},
            #{reviewType,jdbcType=INTEGER},
            #{rejectMsg,jdbcType=VARCHAR},
            #{reviewerId,jdbcType=VARCHAR},
            #{reviewTime,jdbcType=TIMESTAMP}
        )
  
  **/
  
  /**
  自动生成pt_soldier_info_review表相关的，mybatis里的批量insert语句:
  
      INSERT INTO
        pt_soldier_info_review(
           Soldier_Info_Id,
           Soldier_Name,
           Soldier_Gender,
           Soldier_Marital_Status,
           Soldier_Bithday,
           Soldier_Nation,
           Soldier_Political_Outlook,
           Soldier_Education_Level,
           Soldier_Id_No,
           Soldier_Hukou_Type,
           Soldier_Hukou_Province,
           Soldier_Hukou_City,
           Soldier_Hukou_District,
           Soldier_Hukou_Street,
           Soldier_Hukou_Village,
           Soldier_Tel,
           Soldier_Address,
           Soldier_Type,
           Soldier_Jiuye,
           Soldier_Xgzdw,
           Soldier_Xgzdw_Type,
           Soldier_Ruwushijian,
           Soldier_Ruwuhukou,
           Soldier_Retire_Time,
           Soldier_Retire_No,
           Soldier_Apply_Glory_Card_Time,
           Soldier_Hang_Glory_Card,
           Soldier_Resettlement_Place,
           Soldier_Housing_Situation,
           Soldier_Medical_Insurance,
           Soldier_Endowment_Insurance,
           Soldier_Xsgjfxbzj,
           Soldier_Xscjrlxbt,
           Soldier_Social_Assistance,
           Soldier_Removed,
           Soldier_Removed_Reason,
           Soldier_Removed_Time,
           Soldier_Creator_Id,
           Soldier_CTime,
           Soldier_UTime,
           Soldier_Azd_Province,
           Soldier_Azd_City,
           Soldier_Azd_District,
           Next_Reviewer_Area_Code,
           Review_Status,
           Review_Type,
           Reject_Msg,
           Reviewer_Id,
           Review_Time
        )
      VALUES
        (
            #{item.soldierInfoId,jdbcType=VARCHAR},
            #{item.soldierName,jdbcType=VARCHAR},
            #{item.soldierGender,jdbcType=VARCHAR},
            #{item.soldierMaritalStatus,jdbcType=VARCHAR},
            #{item.soldierBithday,jdbcType=TIMESTAMP},
            #{item.soldierNation,jdbcType=VARCHAR},
            #{item.soldierPoliticalOutlook,jdbcType=VARCHAR},
            #{item.soldierEducationLevel,jdbcType=VARCHAR},
            #{item.soldierIdNo,jdbcType=VARCHAR},
            #{item.soldierHukouType,jdbcType=VARCHAR},
            #{item.soldierHukouProvince,jdbcType=VARCHAR},
            #{item.soldierHukouCity,jdbcType=VARCHAR},
            #{item.soldierHukouDistrict,jdbcType=VARCHAR},
            #{item.soldierHukouStreet,jdbcType=VARCHAR},
            #{item.soldierHukouVillage,jdbcType=VARCHAR},
            #{item.soldierTel,jdbcType=VARCHAR},
            #{item.soldierAddress,jdbcType=VARCHAR},
            #{item.soldierType,jdbcType=VARCHAR},
            #{item.soldierJiuye,jdbcType=VARCHAR},
            #{item.soldierXgzdw,jdbcType=VARCHAR},
            #{item.soldierXgzdwType,jdbcType=VARCHAR},
            #{item.soldierRuwushijian,jdbcType=TIMESTAMP},
            #{item.soldierRuwuhukou,jdbcType=VARCHAR},
            #{item.soldierRetireTime,jdbcType=TIMESTAMP},
            #{item.soldierRetireNo,jdbcType=VARCHAR},
            #{item.soldierApplyGloryCardTime,jdbcType=TIMESTAMP},
            #{item.soldierHangGloryCard,jdbcType=VARCHAR},
            #{item.soldierResettlementPlace,jdbcType=VARCHAR},
            #{item.soldierHousingSituation,jdbcType=VARCHAR},
            #{item.soldierMedicalInsurance,jdbcType=VARCHAR},
            #{item.soldierEndowmentInsurance,jdbcType=VARCHAR},
            #{item.soldierXsgjfxbzj,jdbcType=VARCHAR},
            #{item.soldierXscjrlxbt,jdbcType=VARCHAR},
            #{item.soldierSocialAssistance,jdbcType=VARCHAR},
            #{item.soldierRemoved,jdbcType=INTEGER},
            #{item.soldierRemovedReason,jdbcType=INTEGER},
            #{item.soldierRemovedTime,jdbcType=TIMESTAMP},
            #{item.soldierCreatorId,jdbcType=VARCHAR},
            #{item.soldierCtime,jdbcType=TIMESTAMP},
            #{item.soldierUtime,jdbcType=TIMESTAMP},
            #{item.soldierAzdProvince,jdbcType=VARCHAR},
            #{item.soldierAzdCity,jdbcType=VARCHAR},
            #{item.soldierAzdDistrict,jdbcType=VARCHAR},
            #{item.nextReviewerAreaCode,jdbcType=VARCHAR},
            #{item.reviewStatus,jdbcType=INTEGER},
            #{item.reviewType,jdbcType=INTEGER},
            #{item.rejectMsg,jdbcType=VARCHAR},
            #{item.reviewerId,jdbcType=VARCHAR},
            #{item.reviewTime,jdbcType=TIMESTAMP}
        )
        </foreach>
  
  **/
  
  /**
  自动生成pt_soldier_info_review表相关的，mybatis里的update语句:
  
      UPDATE
          pt_soldier_info_review
      SET
          <if test="soldierInfoId != null">
            Soldier_Info_Id = #{soldierInfoId,jdbcType=VARCHAR},
          </if>
          <if test="soldierName != null">
            Soldier_Name = #{soldierName,jdbcType=VARCHAR},
          </if>
          <if test="soldierGender != null">
            Soldier_Gender = #{soldierGender,jdbcType=VARCHAR},
          </if>
          <if test="soldierMaritalStatus != null">
            Soldier_Marital_Status = #{soldierMaritalStatus,jdbcType=VARCHAR},
          </if>
          <if test="soldierBithday != null">
            Soldier_Bithday = #{soldierBithday,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierNation != null">
            Soldier_Nation = #{soldierNation,jdbcType=VARCHAR},
          </if>
          <if test="soldierPoliticalOutlook != null">
            Soldier_Political_Outlook = #{soldierPoliticalOutlook,jdbcType=VARCHAR},
          </if>
          <if test="soldierEducationLevel != null">
            Soldier_Education_Level = #{soldierEducationLevel,jdbcType=VARCHAR},
          </if>
          <if test="soldierIdNo != null">
            Soldier_Id_No = #{soldierIdNo,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouType != null">
            Soldier_Hukou_Type = #{soldierHukouType,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouProvince != null">
            Soldier_Hukou_Province = #{soldierHukouProvince,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouCity != null">
            Soldier_Hukou_City = #{soldierHukouCity,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouDistrict != null">
            Soldier_Hukou_District = #{soldierHukouDistrict,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouStreet != null">
            Soldier_Hukou_Street = #{soldierHukouStreet,jdbcType=VARCHAR},
          </if>
          <if test="soldierHukouVillage != null">
            Soldier_Hukou_Village = #{soldierHukouVillage,jdbcType=VARCHAR},
          </if>
          <if test="soldierTel != null">
            Soldier_Tel = #{soldierTel,jdbcType=VARCHAR},
          </if>
          <if test="soldierAddress != null">
            Soldier_Address = #{soldierAddress,jdbcType=VARCHAR},
          </if>
          <if test="soldierType != null">
            Soldier_Type = #{soldierType,jdbcType=VARCHAR},
          </if>
          <if test="soldierJiuye != null">
            Soldier_Jiuye = #{soldierJiuye,jdbcType=VARCHAR},
          </if>
          <if test="soldierXgzdw != null">
            Soldier_Xgzdw = #{soldierXgzdw,jdbcType=VARCHAR},
          </if>
          <if test="soldierXgzdwType != null">
            Soldier_Xgzdw_Type = #{soldierXgzdwType,jdbcType=VARCHAR},
          </if>
          <if test="soldierRuwushijian != null">
            Soldier_Ruwushijian = #{soldierRuwushijian,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierRuwuhukou != null">
            Soldier_Ruwuhukou = #{soldierRuwuhukou,jdbcType=VARCHAR},
          </if>
          <if test="soldierRetireTime != null">
            Soldier_Retire_Time = #{soldierRetireTime,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierRetireNo != null">
            Soldier_Retire_No = #{soldierRetireNo,jdbcType=VARCHAR},
          </if>
          <if test="soldierApplyGloryCardTime != null">
            Soldier_Apply_Glory_Card_Time = #{soldierApplyGloryCardTime,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierHangGloryCard != null">
            Soldier_Hang_Glory_Card = #{soldierHangGloryCard,jdbcType=VARCHAR},
          </if>
          <if test="soldierResettlementPlace != null">
            Soldier_Resettlement_Place = #{soldierResettlementPlace,jdbcType=VARCHAR},
          </if>
          <if test="soldierHousingSituation != null">
            Soldier_Housing_Situation = #{soldierHousingSituation,jdbcType=VARCHAR},
          </if>
          <if test="soldierMedicalInsurance != null">
            Soldier_Medical_Insurance = #{soldierMedicalInsurance,jdbcType=VARCHAR},
          </if>
          <if test="soldierEndowmentInsurance != null">
            Soldier_Endowment_Insurance = #{soldierEndowmentInsurance,jdbcType=VARCHAR},
          </if>
          <if test="soldierXsgjfxbzj != null">
            Soldier_Xsgjfxbzj = #{soldierXsgjfxbzj,jdbcType=VARCHAR},
          </if>
          <if test="soldierXscjrlxbt != null">
            Soldier_Xscjrlxbt = #{soldierXscjrlxbt,jdbcType=VARCHAR},
          </if>
          <if test="soldierSocialAssistance != null">
            Soldier_Social_Assistance = #{soldierSocialAssistance,jdbcType=VARCHAR},
          </if>
          <if test="soldierRemoved != null">
            Soldier_Removed = #{soldierRemoved,jdbcType=INTEGER},
          </if>
          <if test="soldierRemovedReason != null">
            Soldier_Removed_Reason = #{soldierRemovedReason,jdbcType=INTEGER},
          </if>
          <if test="soldierRemovedTime != null">
            Soldier_Removed_Time = #{soldierRemovedTime,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierCreatorId != null">
            Soldier_Creator_Id = #{soldierCreatorId,jdbcType=VARCHAR},
          </if>
          <if test="soldierCtime != null">
            Soldier_CTime = #{soldierCtime,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierUtime != null">
            Soldier_UTime = #{soldierUtime,jdbcType=TIMESTAMP},
          </if>
          <if test="soldierAzdProvince != null">
            Soldier_Azd_Province = #{soldierAzdProvince,jdbcType=VARCHAR},
          </if>
          <if test="soldierAzdCity != null">
            Soldier_Azd_City = #{soldierAzdCity,jdbcType=VARCHAR},
          </if>
          <if test="soldierAzdDistrict != null">
            Soldier_Azd_District = #{soldierAzdDistrict,jdbcType=VARCHAR},
          </if>
          <if test="nextReviewerAreaCode != null">
            Next_Reviewer_Area_Code = #{nextReviewerAreaCode,jdbcType=VARCHAR},
          </if>
          <if test="reviewStatus != null">
            Review_Status = #{reviewStatus,jdbcType=INTEGER},
          </if>
          <if test="reviewType != null">
            Review_Type = #{reviewType,jdbcType=INTEGER},
          </if>
          <if test="rejectMsg != null">
            Reject_Msg = #{rejectMsg,jdbcType=VARCHAR},
          </if>
          <if test="reviewerId != null">
            Reviewer_Id = #{reviewerId,jdbcType=VARCHAR},
          </if>
          <if test="reviewTime != null">
            Review_Time = #{reviewTime,jdbcType=TIMESTAMP}
          </if>
      WHERE
      1==1
  **/
  
  /**
  自动生成pt_soldier_info_review表相关的，mybatis里的查询语句:
  
      SELECT
        Soldier_Info_Id  soldierInfoId,
        Soldier_Name  soldierName,
        Soldier_Gender  soldierGender,
        Soldier_Marital_Status  soldierMaritalStatus,
        Soldier_Bithday  soldierBithday,
        Soldier_Nation  soldierNation,
        Soldier_Political_Outlook  soldierPoliticalOutlook,
        Soldier_Education_Level  soldierEducationLevel,
        Soldier_Id_No  soldierIdNo,
        Soldier_Hukou_Type  soldierHukouType,
        Soldier_Hukou_Province  soldierHukouProvince,
        Soldier_Hukou_City  soldierHukouCity,
        Soldier_Hukou_District  soldierHukouDistrict,
        Soldier_Hukou_Street  soldierHukouStreet,
        Soldier_Hukou_Village  soldierHukouVillage,
        Soldier_Tel  soldierTel,
        Soldier_Address  soldierAddress,
        Soldier_Type  soldierType,
        Soldier_Jiuye  soldierJiuye,
        Soldier_Xgzdw  soldierXgzdw,
        Soldier_Xgzdw_Type  soldierXgzdwType,
        Soldier_Ruwushijian  soldierRuwushijian,
        Soldier_Ruwuhukou  soldierRuwuhukou,
        Soldier_Retire_Time  soldierRetireTime,
        Soldier_Retire_No  soldierRetireNo,
        Soldier_Apply_Glory_Card_Time  soldierApplyGloryCardTime,
        Soldier_Hang_Glory_Card  soldierHangGloryCard,
        Soldier_Resettlement_Place  soldierResettlementPlace,
        Soldier_Housing_Situation  soldierHousingSituation,
        Soldier_Medical_Insurance  soldierMedicalInsurance,
        Soldier_Endowment_Insurance  soldierEndowmentInsurance,
        Soldier_Xsgjfxbzj  soldierXsgjfxbzj,
        Soldier_Xscjrlxbt  soldierXscjrlxbt,
        Soldier_Social_Assistance  soldierSocialAssistance,
        Soldier_Removed  soldierRemoved,
        Soldier_Removed_Reason  soldierRemovedReason,
        Soldier_Removed_Time  soldierRemovedTime,
        Soldier_Creator_Id  soldierCreatorId,
        Soldier_CTime  soldierCtime,
        Soldier_UTime  soldierUtime,
        Soldier_Azd_Province  soldierAzdProvince,
        Soldier_Azd_City  soldierAzdCity,
        Soldier_Azd_District  soldierAzdDistrict,
        Next_Reviewer_Area_Code  nextReviewerAreaCode,
        Review_Status  reviewStatus,
        Review_Type  reviewType,
        Reject_Msg  rejectMsg,
        Reviewer_Id  reviewerId,
        Review_Time  reviewTime
      FROM
        pt_soldier_info_review
      WHERE
        1==1
  
  **/
  
  
  
  
  
      /*****
          * 数据库原始字段
      *******/
      public static final String SOLDIER_INFO_ID="Soldier_Info_Id";
      public static final String SOLDIER_NAME="Soldier_Name";
      public static final String SOLDIER_GENDER="Soldier_Gender";
      public static final String SOLDIER_MARITAL_STATUS="Soldier_Marital_Status";
      public static final String SOLDIER_BITHDAY="Soldier_Bithday";
      public static final String SOLDIER_NATION="Soldier_Nation";
      public static final String SOLDIER_POLITICAL_OUTLOOK="Soldier_Political_Outlook";
      public static final String SOLDIER_EDUCATION_LEVEL="Soldier_Education_Level";
      public static final String SOLDIER_ID_NO="Soldier_Id_No";
      public static final String SOLDIER_HUKOU_TYPE="Soldier_Hukou_Type";
      public static final String SOLDIER_HUKOU_PROVINCE="Soldier_Hukou_Province";
      public static final String SOLDIER_HUKOU_CITY="Soldier_Hukou_City";
      public static final String SOLDIER_HUKOU_DISTRICT="Soldier_Hukou_District";
      public static final String SOLDIER_HUKOU_STREET="Soldier_Hukou_Street";
      public static final String SOLDIER_HUKOU_VILLAGE="Soldier_Hukou_Village";
      public static final String SOLDIER_TEL="Soldier_Tel";
      public static final String SOLDIER_ADDRESS="Soldier_Address";
      public static final String SOLDIER_TYPE="Soldier_Type";
      public static final String SOLDIER_JIUYE="Soldier_Jiuye";
      public static final String SOLDIER_XGZDW="Soldier_Xgzdw";
      public static final String SOLDIER_XGZDW_TYPE="Soldier_Xgzdw_Type";
      public static final String SOLDIER_RUWUSHIJIAN="Soldier_Ruwushijian";
      public static final String SOLDIER_RUWUHUKOU="Soldier_Ruwuhukou";
      public static final String SOLDIER_RETIRE_TIME="Soldier_Retire_Time";
      public static final String SOLDIER_RETIRE_NO="Soldier_Retire_No";
      public static final String SOLDIER_APPLY_GLORY_CARD_TIME="Soldier_Apply_Glory_Card_Time";
      public static final String SOLDIER_HANG_GLORY_CARD="Soldier_Hang_Glory_Card";
      public static final String SOLDIER_RESETTLEMENT_PLACE="Soldier_Resettlement_Place";
      public static final String SOLDIER_HOUSING_SITUATION="Soldier_Housing_Situation";
      public static final String SOLDIER_MEDICAL_INSURANCE="Soldier_Medical_Insurance";
      public static final String SOLDIER_ENDOWMENT_INSURANCE="Soldier_Endowment_Insurance";
      public static final String SOLDIER_XSGJFXBZJ="Soldier_Xsgjfxbzj";
      public static final String SOLDIER_XSCJRLXBT="Soldier_Xscjrlxbt";
      public static final String SOLDIER_SOCIAL_ASSISTANCE="Soldier_Social_Assistance";
      public static final String SOLDIER_REMOVED="Soldier_Removed";
      public static final String SOLDIER_REMOVED_REASON="Soldier_Removed_Reason";
      public static final String SOLDIER_REMOVED_TIME="Soldier_Removed_Time";
      public static final String SOLDIER_CREATOR_ID="Soldier_Creator_Id";
      public static final String SOLDIER_CTIME="Soldier_CTime";
      public static final String SOLDIER_UTIME="Soldier_UTime";
      public static final String SOLDIER_AZD_PROVINCE="Soldier_Azd_Province";
      public static final String SOLDIER_AZD_CITY="Soldier_Azd_City";
      public static final String SOLDIER_AZD_DISTRICT="Soldier_Azd_District";
      public static final String NEXT_REVIEWER_AREA_CODE="Next_Reviewer_Area_Code";
      public static final String REVIEW_STATUS="Review_Status";
      public static final String REVIEW_TYPE="Review_Type";
      public static final String REJECT_MSG="Reject_Msg";
      public static final String REVIEWER_ID="Reviewer_Id";
      public static final String REVIEW_TIME="Review_Time";
  
  
      @ApiModelProperty( value = "军人基础信息id" , required = true)
      private String soldierInfoId;
  
      @ApiModelProperty( value = "姓名" , required = true)
      private String soldierName;
  
      @ApiModelProperty( value = "性别(取值参看:参数表)" , required = true)
      private String soldierGender;
  
      @ApiModelProperty( value = "婚姻状况(取值参看:参数表)" , required = true)
      private String soldierMaritalStatus;
  
      @ApiModelProperty( value = "生日" , required = true)
      private LocalDate soldierBithday;
  
      @ApiModelProperty( value = "民族,(取值参看:参数表)" , required = true)
      private String soldierNation;
  
      @ApiModelProperty( value = "政治面貌,(取值参看:参数表)" , required = true)
      private String soldierPoliticalOutlook;
  
      @ApiModelProperty( value = "文化程度,(取值参看:参数表)" , required = true)
      private String soldierEducationLevel;
  
      @ApiModelProperty( value = "身份证号码" , required = true)
      private String soldierIdNo;
  
      @ApiModelProperty( value = "户口类型,(取值参看:参数表)" , required = true)
      private String soldierHukouType;
  
      @ApiModelProperty( value = "户籍所在地,省代码" , required = true)
      private String soldierHukouProvince;
  
      @ApiModelProperty( value = "户籍所在地,市代码" , required = true)
      private String soldierHukouCity;
  
      @ApiModelProperty( value = "户口所在地,区代码" , required = true)
      private String soldierHukouDistrict;
  
      @ApiModelProperty( value = "户口所在地,街道代码" , required = true)
      private String soldierHukouStreet;
  
      @ApiModelProperty( value = "户口所在地,村代码" , required = true)
      private String soldierHukouVillage;
  
      @ApiModelProperty( value = "联系电话" , required = true)
      private String soldierTel;
  
      @ApiModelProperty( value = "家庭地址" , required = true)
      private String soldierAddress;
  
      @ApiModelProperty( value = "人员类型,(取值参看:参数表)" , required = true)
      private String soldierType;
  
      @ApiModelProperty( value = "现就业状态,(取值参看:参数表)" , required = true)
      private String soldierJiuye;
  
      @ApiModelProperty( value = "现工作单位(含离退休前单位)" , required = true)
      private String soldierXgzdw;
  
      @ApiModelProperty( value = "现单位性质（含离退休前单位）,(取值参看:参数表)" , required = true)
      private String soldierXgzdwType;
  
      @ApiModelProperty( value = "入伍或参加工作时间" , required = true)
      private Date soldierRuwushijian;
  
      @ApiModelProperty( value = "入伍时户籍性质,(取值参看:参数表)" , required = true)
      private String soldierRuwuhukou;
  
      @ApiModelProperty( value = "退役或离退休时间" , required = true)
      private Date soldierRetireTime;
  
      @ApiModelProperty( value = "退役(退休或复员)证件号" , required = true)
      private String soldierRetireNo;
  
      @ApiModelProperty( value = "申请光荣牌的时间" , required = true)
      private Date soldierApplyGloryCardTime;
  
      @ApiModelProperty( value = "是否悬挂光荣牌(取值参看:参数表)" , required = true)
      private String soldierHangGloryCard;
  
      @ApiModelProperty( value = "安置地" , required = true)
      private String soldierResettlementPlace;
  
      @ApiModelProperty( value = "住房状况" , required = true)
      private String soldierHousingSituation;
  
      @ApiModelProperty( value = "医疗保险,(取值参看:参数表)" , required = true)
      private String soldierMedicalInsurance;
  
      @ApiModelProperty( value = "养老保险,(取值参看:参数表)" , required = true)
      private String soldierEndowmentInsurance;
  
      @ApiModelProperty( value = "享受国家抚恤补助金,(取值参看:参数表)" , required = true)
      private String soldierXsgjfxbzj;
  
      @ApiModelProperty( value = "享受残疾人两项补贴,(取值参看:参数表)" , required = true)
      private String soldierXscjrlxbt;
  
      @ApiModelProperty( value = "社会救助状况" , required = true)
      private String soldierSocialAssistance;
  
      @ApiModelProperty( value = "删除(移出)标识 0:未删除 1:已删除" , required = true)
      private Integer soldierRemoved;
  
      @ApiModelProperty( value = "移出原因 1:死亡 2:调出 3:其他" , required = true)
      private Integer soldierRemovedReason;
  
      @ApiModelProperty( value = "删除时间" , required = true)
      private Date soldierRemovedTime;
  
      @ApiModelProperty( value = "创建者Id" , required = true)
      private String soldierCreatorId;
  
      @ApiModelProperty( value = "创建时间" , required = true)
      private Date soldierCtime;
  
      @ApiModelProperty( value = "修改时间" , required = true)
      private Date soldierUtime;
  
      @ApiModelProperty( value = "安置地,省code" , required = true)
      private String soldierAzdProvince;
  
      @ApiModelProperty( value = "安置地,市code" , required = true)
      private String soldierAzdCity;
  
      @ApiModelProperty( value = "安置地,区code" , required = true)
      private String soldierAzdDistrict;
  
      @ApiModelProperty( value = "所属区域的地区code值,由于地区等级不是连续的,所以手动修改此字段" , required = true)
      private String nextReviewerAreaCode;
  
      @ApiModelProperty( value = "审核状态 1:审核中 2:驳回 3审核通过" , required = true)
      private Integer reviewStatus;
  
      @ApiModelProperty( value = "审核类型 1:上传审核 2移出审核" , required = true)
      private Integer reviewType;
  
      @ApiModelProperty( value = "驳回原因" , required = true)
      private String rejectMsg;
  
      @ApiModelProperty( value = "操作人员的id" , required = true)
      private String reviewerId;
  
      @ApiModelProperty( value = "审核的时间" , required = true)
      private Date reviewTime;
  
      @Override
      protected Serializable pkVal() {
          return null;
      }
  
  }

  ```