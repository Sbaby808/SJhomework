package com.corwin.serialization;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author Sbaby
 * @Date 2022/5/24 21:57
 * @Version 1.0
 */
public class JsonSerialization {

	public static void main(String[] args) {
		Person person = new Person(0L, "Corwin", 24);
		// 序列化
		String data = JSONObject.toJSONString(person);
		System.out.println(data);

		// 反序列化
		Person parsePerson = JSONObject.parseObject(data, Person.class);
		System.out.println(parsePerson.getId());
		System.out.println(parsePerson.getName());
		System.out.println(parsePerson.getAge());
	}
}
