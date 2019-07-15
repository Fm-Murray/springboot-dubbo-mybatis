package com.yx.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private  String id;
    private  String name;
    private  int sex;
    private  int age;
    private  String ctime;


}
