package com.corwin.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author Sbaby
 * @Date 2022/5/24 0:01
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Serializable {

	private Long id;
	private String name;
	private Integer age;
}
