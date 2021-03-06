package top.ulane.springtest.model;

import java.util.Date;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Mytable {
    /**
     * 
     */
	@NumberFormat(pattern="##.##",style=Style.PERCENT)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private Date date;

    /**
     * 
     * @return id 
     */
	@NumberFormat(pattern="##.##",style=Style.PERCENT)
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     * @return date 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }
}