package com.genesis.gamedb.orm.entity;

import com.genesis.core.orm.BaseEntity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据库版本号
 * @author Joey
 *
 */
@Entity
@Table(name = "t_db_version")
public class DbVersion implements BaseEntity {

    /***/
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    private int id;
    /** 版本更新时间 */
    private Timestamp updateTime;

    @Id
    @Column
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
