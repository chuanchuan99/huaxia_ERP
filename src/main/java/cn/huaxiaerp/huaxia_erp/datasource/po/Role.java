package cn.huaxiaerp.huaxia_erp.datasource.po;

import lombok.Data;

/**
 * * kjc
 */
@Data
public class Role {
    private Long id;

    private String name;

    private String type;

    private String priceLimit;

    private String value;

    private String description;

    private Boolean enabled;

    private String sort;

    private Long tenantId;

    private String deleteFlag;


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public void setPriceLimit(String priceLimit) {
        this.priceLimit = priceLimit == null ? null : priceLimit.trim();
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}
