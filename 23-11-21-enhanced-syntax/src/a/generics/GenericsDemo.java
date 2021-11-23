package a.generics;

import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		BloodOrange[] arr = new BloodOrange[3];
		m1Arr(arr);

//		List<Orange> list1 = new ArrayList<>();
//		list1.add(new Orange());
//		list1.add(new BloodOrange());
//		m1(list1);
//		System.out.println(list1);
//
//		List<BloodOrange> list2 = new ArrayList<>();
//		list2.add(new BloodOrange());
//		m2(list2);
//		System.out.println("=============");
//
//		List<BloodOrange> list3 = new ArrayList<>();
//		list3.add(new BloodOrange());
//		m3(list3);
//		System.out.println(list3);
	}

	// pros - get and add
	// cons - the method will accept only List<Orange> exactly
	public static void m1(List<Orange> list) {
		// 1. get an orange from the list
		if (!list.isEmpty()) {
			Orange orange = list.get(0);
			System.out.println(orange);
		}

		// 2. add oranges to the list
		list.add(new Orange());
		list.add(new BloodOrange());
	}

	// pros - the method will accept any type of List
	// cons - get returns Object and add will accept null only
	public static void m2(List<?> list) {
		// 1. get an orange from the list
		if (!list.isEmpty()) {
			Object obj = list.get(0);
			System.out.println(obj);
		}

		// 2. add oranges to the list
//		list.add(new Orange());
//		list.add(new BloodOrange());
		list.add(null);
	}

	// pros - the method will accept any type that extends Orange
	// pros - get returns Orange
	// cons - get returns Object and add will accept null only
	public static void m3(List<? extends Orange> list) {
		// 1. get an orange from the list
		if (!list.isEmpty()) {
			Orange orange = list.get(0);
			System.out.println(orange);
		}

		// 2. add oranges to the list
//		list.add(new Orange());
//		list.add(new BloodOrange());
		list.add(null);
	}

	// pros - the method will accept any type that is super Orange
	// pros - we can add Orange and all subtypes
	// cons - get returns Object
	public static void m4(List<? super Orange> list) {
		// 1. get an orange from the list
		if (!list.isEmpty()) {
			Object obj = list.get(0);
			System.out.println(obj);
		}

		// 2. add oranges to the list
		// list.add(new Fruit());
		list.add(new Orange());
		list.add(new BloodOrange());
	}

	// in arrays we do have sub typing - might fail at runtime
	public static void m1Arr(Orange[] arr) {
		arr[0] = new BloodOrange(); // will always work
		arr[0] = new Orange(); // might fail at runtime
	}
}
