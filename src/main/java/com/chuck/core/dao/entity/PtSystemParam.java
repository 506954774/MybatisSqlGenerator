package com.chuck.core.dao.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * <p>
 * 系统参数
 * </p>
 *
 * @author chuck
 * @since 2020-12-08
 */
@Data
@ApiModel(value="PtSystemParam对象", description="系统参数")
public class PtSystemParam extends Model<PtSystemParam> {

    private static final long serialVersionUID = 1L;


/**
自动生成mybatis里的insert语句模板:

        INSERT INTO
          pt_system_param(
             Param_ID,
             Param_Name,
             Param_Value,
             Param_Type,
             Param_Desc,
             CTime,
          )
          VALUES (
              #{paramId,jdbcType=INTEGER},
              #{paramName,jdbcType=VARCHAR},
              #{paramValue,jdbcType=VARCHAR},
              #{paramType,jdbcType=INTEGER},
              #{paramDesc,jdbcType=VARCHAR},
              #{CTime,jdbcType=TIMESTAMP},
        )

**/





    /*****
        * 数据库原始字段
    *******/
    public static final String PARAM_ID="Param_ID";
    public static final String PARAM_NAME="Param_Name";
    public static final String PARAM_VALUE="Param_Value";
    public static final String PARAM_TYPE="Param_Type";
    public static final String PARAM_DESC="Param_Desc";
    public static final String CTIME="CTime";


    @ApiModelProperty( value = "参数ID" , required = true)
    @TableId(value = "Param_ID", type = IdType.AUTO)
    private Integer paramId;

    @ApiModelProperty( value = "参数名" , required = true)
    private String paramName;

    @ApiModelProperty( value = "参数值" , required = true)
    private String paramValue;

    @ApiModelProperty( value = "参数类型 1-系统自动确认收货时间，单位天 2-系统自动完成订单时间，单位天 3-体验官套餐金额，单位分 4-邀请体验官奖励金额，单位分 5-官方头像url 6-官方昵称 7-购物业绩奖百比例，单位% 8-团队奖百分比，单位% 9-成为体验官可享受多少金额的特权卡，单位分" , required = true)
    private Integer paramType;

    private String paramDesc;

    @ApiModelProperty( value = "创建时间" , required = true)
    private Date CTime;

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
