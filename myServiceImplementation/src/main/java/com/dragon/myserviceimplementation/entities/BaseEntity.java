package com.dragon.myserviceimplementation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/18
 */
@Getter
@Setter
/**成一个无参构造函数。如果类中存在final字段且没有被初始化，则编译器会报错*/
@NoArgsConstructor
/**为类生成一个包含所有字段的构造函数*/
@AllArgsConstructor
/**它是@Builder的增强版，支持在类层次结构中使用。它允许在子类中添加字段，并在构建对象时包含父类字段*/
@SuperBuilder
/**用于指示一个类应该是实体类的基类。这个类自身不是一个完整的实体类，不会映射到数据库表，但其子类是实体类并将继承其映射信息*/
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 7677353645504602647L;

    @CreatedBy
    @Column
    private String createdBy;

    @LastModifiedBy
    @Column
    private String updatedBy;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public abstract Long getId();
}
