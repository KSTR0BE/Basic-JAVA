package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	
	public void process() {
		List<Map> list = dataInput();
		//1. 제일 높은 월급 구하기.
		int max = maxSalary(list);
		System.out.println("제일 높은 월급: " + max);
		
		//2. 각 부서별 월급 총합 구하기
		getDeptSalSum(list);
		
		//3. emp_no를 파라미터로 모든정보를 출력하는 메소드 만들기.
		printAll(7369,list);
	}
	public void printAll(int empno, List<Map> list) {
		for (Map map : list) {
			int eno = (int)map.get("emp_no");
			if(eno != empno) continue;
			
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = (String)it.next();
				Object value = map.get(key);
				System.out.println(key + " : " + value);
			}
//			System.out.println("empno : " + map.get("emp_no"));
//			System.out.println("empno : " + map.get("emp_name"));
//			System.out.println("empno : " + map.get("job"));
//			System.out.println("empno : " + map.get("sal"));
//			System.out.println("empno : " + map.get("dept"));
		
		}
		
		
	}
	
	public Map<String, Integer> getDeptSalSum(List<Map> list) {
		
		Map<String, Integer> result = new HashMap();
		for(Map map : list) {
			int sal = (int)map.get("sal");
			String dname = (String)map.get("dname");
			if(result.containsKey(dname)) {
				sal+=result.get(dname);
			}
			result.put(dname, sal);
		}

		return null;
	}
	public int maxSalary(List<Map> list) {
		//Map
		int max = 0;
		for(Map m : list) {
			int sal = (int) m.get("sal");
			if(sal>max) max = sal;
		}
		return max;
	}
	
	public List<Map> dataInput() {
		List<Map> list = new ArrayList();
//		7369	장길동	프로그래머	650	조사부
		Map<String, Object> map1 = new HashMap();
		map1.put("emp_no", 7369);
		map1.put("emp_name", "장길동");
		map1.put("job", "프로그래머");
		map1.put("sal", 650);
		map1.put("dept", "조사부");
//		7499	고영우	영업사원	340	영업부
		Map<String, Object> map2 = new HashMap();
		map2.put("emp_no", 7499);
		map2.put("emp_name", "고영우");
		map2.put("job", "영업사원");
		map2.put("sal", 340);
		map2.put("dept", "영업부");
//		7521	구기현	영업사원	250	영업부
		Map<String, Object> map3 = new HashMap();
		map3.put("emp_no", 7521);
		map3.put("emp_name", "구기현");
		map3.put("job", "영업사원");
		map3.put("sal", 250);
		map3.put("dept", "영업부");
//		7566	김동혁	관리자	295	관리부
		Map<String, Object> map4 = new HashMap();
		map4.put("emp_no", 7566);
		map4.put("emp_name", "김동혁");
		map4.put("job", "관리자");
		map4.put("sal", 295);
		map4.put("dept", "관리부");
//		7654	김민욱	영업사원	950	영업부
		Map<String, Object> map5 = new HashMap();
		map5.put("emp_no", 7654);
		map5.put("emp_name", "김민욱");
		map5.put("job", "영업사원");
		map5.put("sal", 950);
		map5.put("dept", "영업부");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		
		
		return list;
		
	} 
	

}
