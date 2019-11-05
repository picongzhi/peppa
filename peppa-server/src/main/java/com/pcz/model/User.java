package com.pcz.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author picongzhi
 */
@Data
@Table(name = "user")
public class User {
    private long id;
    private String name;
}
