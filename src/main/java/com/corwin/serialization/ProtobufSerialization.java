package com.corwin.serialization;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @Author Sbaby
 * @Date 2022/5/24 21:45
 * @Version 1.0
 */
public class ProtobufSerialization {

	public static void main(String[] args) {
		PersonProtobuf.Person.Builder personBuilder = PersonProtobuf.Person.newBuilder();
		personBuilder.setAge(24);
		personBuilder.setName("Corwin");
		PersonProtobuf.Person corwin = personBuilder.build();
		// 序列化
		byte[] data = corwin.toByteArray();
		System.out.println(data.length);
		// 反序列化
		try {
			PersonProtobuf.Person person = PersonProtobuf.Person.parseFrom(data);
			System.out.println(person.getAge());
			System.out.println(person.getName());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}

}
