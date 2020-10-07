package com.imooc;

import org.springframework.core.ResolvableType;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 16:28 2020-10-08
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public class ResolvableDemo {
	private HashMap<String, List<Integer>> customizedMap;

	public static void main(String[] args) throws NoSuchFieldException {
		ResolvableType resolvableType = ResolvableType.forField(ResolvableDemo.class.getDeclaredField("customizedMap"));
		System.out.println("resolvableType.getGeneric(0).resolve():" + resolvableType.getGeneric(0).resolve());
		System.out.println("resolvableType.getGeneric(1).resolve():" + resolvableType.getGeneric(1).resolve());
		System.out.println("resolvableType.getGeneric(1):" + resolvableType.getGeneric(1));
		System.out.println("resolvableType.getSuperType():" + resolvableType.getSuperType());
		System.out.println("resolvableType.asMap():" + resolvableType.asMap());
		System.out.println("resolvableType.resolveGeneric(1,0):" + resolvableType.resolveGeneric(1,0));
	}
}
