package com.dragon.myserviceimplementation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;

import static com.dragon.myserviceimplementation.entities.Company.TABLE_NAME;


/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/18
 */
@Entity
/**这是Spring Data JPA的注解，用于自动填充审计相关的字段，如创建时间、修改时间等。AuditingEntityListener 类特别用于处理这些自动填充操作*/
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = TABLE_NAME, schema = "public")
public class Company extends BaseEntity {
    public static final String TABLE_NAME = "company";

    @Serial
    private static final long serialVersionUID = 2137607105409362080L;

    @Id
    private Long id;
}
