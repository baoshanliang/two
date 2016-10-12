package com.jwy.excel;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * ��ȡExcel�ĵ�����
 * @author Jingweiyu 
 */
public class ReadExcel {
	public static void main(String[] args) throws Exception {
		//�����ļ�����������
		FileInputStream is = new FileInputStream("readExcel.xls");
		//���� POI�ļ�ϵͳ����
		POIFSFileSystem ts = new POIFSFileSystem(is);
		//��ȡ�ĵ�����
		HSSFWorkbook wb = new HSSFWorkbook(ts);
		//��ȡ������
		HSSFSheet sheet = wb.getSheetAt(0);
		//�����ж���
		HSSFRow row = null;
		//ͨ��ѭ����ȡÿһ��
		for (int i = 0; sheet.getRow(i)!=null; i++) {
			row = sheet.getRow(i);
			//ѭ����ȡһ�е�����
			for (int j = 0; row.getCell(j)!=null; j++) {
				System.out.print(row.getCell(j).toString()+" ");
			}
			System.out.println("ddd");
		}
	}
}
