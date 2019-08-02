package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //set/get  ,必要的构造方法
@NoArgsConstructor   //无参构造
@AllArgsConstructor  //所有的有参构造
public class Item {

	private Integer id;
	private String name;
	private Integer number;
}
