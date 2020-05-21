package org.hnitacm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GoodInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "good_id", type = IdType.AUTO)
    private Long goodId;

    /**
     * 商品编号
     */
    private Integer goodNumber;

    /**
     * 商品名
     */
    private String goodName;

    /**
     * 商品价格
     */
    private Float goodPrice;

    /**
     * 商家id
     */
    private Long sellerId;

    /**
     * 类型id 外键关系(type_info.type_id)
     */
    private Long typeId;

    /**
     * 商品图图床地址
     */
    private String goodImage;

    /**
     * 商品描述
     */
    private String goodDescribe;

    private LocalDateTime created;

    private LocalDateTime modified;


}
