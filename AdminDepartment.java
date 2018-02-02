package admanage.core.enity;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

import java.util.Date;

/**
 * Created by blood on 16/11/9.
 */
@TableName("admin_department")
@PrimaryKey("id")
public class AdminDepartment {

    // Id
    private int id;
    // 部门名称
    private String name;
    // 创建时间
    private Date createDate;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getCreateDate(){
        return createDate;
    }

    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }

}
