package com.corwin.serialization;

import java.io.*;

/**
 * @Author Sbaby
 * @Date 2022/5/24 0:02
 * @Version 1.0
 */
public class JdkSerialization {

	/**
	 * jdk序列化反序列化
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person(0L, "Corwin", 24);
		String fileName = person.getName();
		// 序列化
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			oos.writeObject(person);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 反序列化
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)));
			Person p = (Person) ois.readObject();
			System.out.println(p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
