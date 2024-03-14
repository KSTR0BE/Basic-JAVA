package kr.or.ddit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FolderGenerate {
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		for(int i=0; i<30; i++) {
			String folder = sdf.format(cal.getTime());
			File f = new File("D:\\공유폴더\\JAVA\\숙제\\"+folder);
			f.mkdirs();
			cal.add(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if(day ==1 || day ==7 ) continue;
		}
	}
}
