package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //set/get  ,��Ҫ�Ĺ��췽��
@NoArgsConstructor   //�޲ι���
@AllArgsConstructor  //���е��вι���
public class Item {

	private Integer id;
	private String name;
	private Integer number;
}
