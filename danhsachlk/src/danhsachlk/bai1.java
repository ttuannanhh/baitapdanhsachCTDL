package danhsachlk;
import java.util.LinkedList;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> myList = new LinkedList<Integer>();
		 LinkedList<Integer> myList2 = new LinkedList<Integer>();
		 LinkedList<Integer> myList3 = new LinkedList<Integer>();
		 Scanner input = new Scanner(System.in);

		 System.out.print("Nhap so luong phan tu cua day: ");
		 int n = input.nextInt();

		 System.out.println("Nhap cac phan tu cua day:");
		 for (int i = 0; i < n; i++) {
		    int num = input.nextInt();
		       myList.add(num);
		       myList2.addFirst(num);
		 }

		 System.out.println("Danh sach dac vua nhap la:");
		 for (int num : myList) {
		    System.out.print(num + " ");
		 }
		 
		 System.out.println();
		 
		 System.out.println("Danh sach dac theo thu tu nguoc voi thu tu nhap vao la:");
		 for (int num : myList2) {
			 System.out.print(num + " ");
		 }
		 
		 System.out.println();
		 
		 int[] a = new int[n];
		 
		 System.out.println("Nhap cac phan tu cua danh sach dac theo thu tu khong giam:");
		 for (int i = 0; i < n; i++) {
			 a[i] = input.nextInt();
		 }
		 
		 for (int i = 0; i < n; i++) {
			 if (i == 0 || a[i] != a[i - 1]) {
				 myList3.add(a[i]);
			 }
		 }
		 
		 System.out.println("Danh sach dac sau khi loai bo cac phan tu trung nhau la:");
		 for (int num : myList3) {
			 System.out.print(num + " ");
		 }
		 
		 System.out.println();
		 
		 for (int i = 0; i < myList.size(); i++) {
			 if (myList.get(i) % 2 == 1) {
				 myList.remove(i);
				 i--;
			 }
		 }
		 
		 System.out.println("Danh sach dac sau khi xoa cac phan tu la so nguyen le la:");
		 for (int num : myList) {
			 System.out.println(num + " ");
		 } 
	}

}



