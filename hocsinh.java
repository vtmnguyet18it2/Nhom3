package nguyet;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import duc.Quanlynhanvien;

public class hocsinh {
	Vector list = new Vector();
	public hocsinh() {
		while(true) {
			System.out.println("******Quan ly hoc sinh******");
			System.out.println("1. Nhap Thong Tin");
			System.out.println("2. Xem Thong Tin");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("-----------Moi ban chon chuc nang ----------");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong hoc sinh= ");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap so bao danh ");
			String so=key.nextLine();
			System.out.println("Nhap ten hoc sinh= ");
			String ten=key.nextLine();
			System.out.println("Nam sinh= ");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namSinh=key.nextLine();
			System.out.println("Tong diem= ");
			double diem=Double.parseDouble(key.nextLine());
			hs a = new hs(so,ten,namSinh,diem);
			list.add(a);
		}	
		
	}
	public void InTT() {
		Enumeration enumerationnhanvien = list.elements();
		int i=1;
		while(enumerationnhanvien.hasMoreElements()) {
			hs b = (hs)enumerationnhanvien.nextElement();
			System.out.println("So Bao Danh="+b.getSo()+"\nTen: "+b.getTen()+
					"\nNam sinh: "+b.getNam()+"\nDiem: "+b.getDiem());
		}
	}
	public static void main(String [] args) {
		new hocsinh();
	}
}