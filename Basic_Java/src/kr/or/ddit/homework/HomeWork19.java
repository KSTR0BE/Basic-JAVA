package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HomeWork19 {
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
	}
	public void process() {
		List<Map> list = dataInput();
		//전체 출력하기
		printAll(list);
		System.out.println("===============");
		
		//차량 번호를 입력하면 시간 계산
		int min = getMin(list, 5916);
		System.out.println("시간 : " + min);
		System.out.println("---------------");
		//차량 시간별 요금 계산
		int pay = pay(min);
		System.out.println("요금 : "+pay);
	}
	
	public int pay(int min) {
//		기본시간(분)	기본요금(원)	단위시간(분)	단위요금(원)
//		180			5000		10			600
		int money = 5000;
		if(min > 180) {
			money += 600;
			int pMin = (min - 180)/10;
			if(pMin>0)
				money += (600*pMin);
		}
		
		return money;
	}
	
	public int getMin(List<Map> list, int carNum) {
		int total = 0;
		int sTime = 0;
		int lTime = 0;
		
		for(Map<String, String> map : list) {
			
			if(carNum == Integer.parseInt(map.get("차량번호")) && map.get("내역").equals("입차")) {
				sTime = getTime(map.get("시각"));
			}
			
			if(carNum == Integer.parseInt(map.get("차량번호")) && map.get("내역").equals("출차"))
			{
				lTime = getTime(map.get("시각"));
			}
			
			if(sTime != 0 && lTime != 0) {
				total += (lTime-sTime);
			}
		}
			
		
		return total;
	}
	public int getTime(String time) {
		//07:59 0은 앞에꺼 1은 뒤에꺼
		String hours = time.split(":")[0];
		String mins = time.split(":")[1];
		return Integer.parseInt(hours)*60 + Integer.parseInt(mins);
	}
	
	public void printAll(List<Map> list) {
		for(Map map : list) {
			System.out.println("---------------");
			String carNum = (String)map.get("차량번호");
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
			String key = (String)it.next();
			Object value = map.get(key);
			System.out.println(key + " : " + value);
			}
		}
	}
	
	public List<Map> dataInput() {
//		시각 	차량번호 	내역
//		05:34	5961 	입차
//		06:00	0000 	입차
//		06:34	0000 	출차
//		07:59	5961 	출차
//		07:59	0148 	입차
//		18:59	0000 	입차
//		19:09	0148 	입차
//		22:59	5961 	출차
//		23:00	5961 	입차
//		23:59	0000 	출차
		List<Map> list = new ArrayList();
		Map<String, Object> map1 = new HashMap();
		map1.put("시각", "05:34");
		map1.put("차량번호", "5961");
		map1.put("내역", "입차");
		
		Map<String, Object> map2 = new HashMap();
		map2.put("시각", "06:00");
		map2.put("차량번호", "0000");
		map2.put("내역", "입차");
		
		Map<String, Object> map3 = new HashMap();
		map3.put("시각", "06:34");
		map3.put("차량번호", "0000");
		map3.put("내역", "출차");
		
		Map<String, Object> map4 = new HashMap();
		map4.put("시각", "07:59");
		map4.put("차량번호", "5961");
		map4.put("내역", "출차");
		
		Map<String, Object> map5 = new HashMap();
		map5.put("시각", "07:59");
		map5.put("차량번호", "0148");
		map5.put("내역", "입차");
		
		Map<String, Object> map6 = new HashMap();
		map6.put("시각", "18:59");
		map6.put("차량번호", "0000");
		map6.put("내역", "입차");
		
		Map<String, Object> map7 = new HashMap();
		map7.put("시각", "19:09");
		map7.put("차량번호", "0148");
		map7.put("내역", "입차");
		
		Map<String, Object> map8 = new HashMap();
		map8.put("시각", "22:59");
		map8.put("차량번호", "5961");
		map8.put("내역", "출차");
		
		Map<String, Object> map9 = new HashMap();
		map9.put("시각", "23:00");
		map9.put("차량번호", "5961");
		map9.put("내역", "입차");
		
		Map<String, Object> map10 = new HashMap();
		map10.put("시각", "23:59");
		map10.put("차량번호", "0000");
		map10.put("내역", "출차");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		
		return list;
		
		
	}

}
