package com.lj.daily;

import com.lj.daily.coupon.Coupon;

import java.util.*;

/**
 * Created by zhouzhanghe on 2016/10/9.
 */
public class Test {

    public static void tryAfter() {
        try {
            System.out.println("try 1");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally!");
        }

        try {
            System.out.println("try 2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tmap() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","b");
        map.put("a","c");
        System.out.println(map.get("a"));
    }

    public static List<String> getList(List<String> list) {
        list.add("after");
        return list;
    }

    public static List<String> processList() {
        List<String> l = new ArrayList<String>();
        l.add("pre");
        getList(l);
        return l;
    }

    public static void aslist() {
        String s = "31432,234525,23424,2425,";
        List<String> list = Arrays.asList(s.split(","));
        for (String str : list) {
            if(!"".equals(str)) {
                System.out.println(str);
            }
        }
    }

    public static void listAll(List candidate, String prefix) {
        if(prefix.length()==4){
            System.out.println(prefix);
        }
        for(int i=0;i<candidate.size();i++) {
            List tmp = new LinkedList(candidate);
            listAll(tmp, prefix + tmp.remove(i));//函数中的参数从右边开始解析
        }
    }

    public static int indexOfForHis(String t,int num) {
        int hashCode = t.hashCode();
        return Math.abs(hashCode % num);
    }

    public static void main(String args[]) {
        //int a = 986;
        //System.out.println(a/100);

        //tryAfter();

        //tmap();

        /**List<String> list = processList();
        for(String s : list) {
            System.out.println(s);
        }*/

        //aslist();

        //Integer b = 1;
        //System.out.println(b.equals(1));

        /**Coupon coupon = new Coupon();
        coupon.setCouponId(1l);
        coupon.setType(5);
        coupon.setCouponName(null);

        if(coupon.getType() == 5 && null != coupon.getCouponName() && !"".equals(coupon.getCouponName())) {
            System.out.println(coupon.getCouponName());
        }*/

        //String dep = "2398#198#38929";
        //System.out.print(dep.substring(dep.lastIndexOf("#")+1,dep.length()));

        //String s = "1.非叫我二姐夫;2.金佛微积分;3.分Joe我覅;";
        //System.out.println(s.replaceAll(";",";</br>"));

        //String s = "123#234#23423";
        //System.out.println(s.split("#")[1]);

        //String[] array = new String[]{"1","2","3","4"};
        //listAll(Arrays.asList(array), "");

        System.out.println(indexOfForHis("JD_336i36a3bb88",16));
        System.out.println(indexOfForHis("JD_72u2526cda2",64));

        /**StringBuffer sb = new StringBuffer();
        sb.append("fowejfowf");
        sb.append("fjweofowjf");
        System.out.println(sb.toString());
        sb.setLength(0);
        sb.append("a");
        System.out.println(sb.toString());*/

        /**List<String> remainStationNos=new ArrayList<String>() ;
        String coupons = "'11657480, 11641189, 11053711, 11001198, 11000176, 10055533, 10054403, 10054361, 10053112, 10051443, 10050693, 10050623, 10050212, 10047044, 10044080, 10043034, 10042733, 10037048, 10034750, 10029853, 10025916, 10017951, 10017324, 10013640, 10006548, 10006396, 10006391, 10006172";
        List<String> stations = Arrays.asList("10050693, 10050623, 11644750, 10043862, 11036283, 11028108, 11665179, 11663874".split(","));
        System.out.println(stations.toString());
        System.out.println(stations.toString().replaceAll(" ",""));

        //多门店，根据逗号隔开的门店编号判断，List使用toString会在每个值的前面加空格
        List<String> stationForCoupon=Arrays.asList(coupons.replace(" ","").split(","));
        for(String sno:stations){
            if(stationForCoupon.contains(sno.trim())){
                remainStationNos.add(sno.trim());
            }
        }
        System.out.println(remainStationNos.toString());*/

        /**List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0;i < 10;i++) {
            if(i%2 == 0) {
                list1.add(i);
                continue;
            }
            list2.add(i);
        }
        System.out.println(list1.toString());
        System.out.println(list2.toString()); */

        /**Coupon coupon1 = new Coupon();
        coupon1.setCouponId(1l);
        coupon1.setCouponName("优惠券1");
        coupon1.setType(1);
        coupon1.setCrateDate(new Date());
        List<Coupon> list = new ArrayList<>();
        list.add(coupon1);

        String STATION_HEADER = "station_";
        String stations = "11000176,10055533,10050693,10050623";
        Map<String, List<Coupon>> data = new HashMap<>();
        Coupon coupon2 = new Coupon();
        coupon2.setCouponId(2l);
        coupon2.setCouponName("优惠券2");
        coupon2.setType(2);
        coupon2.setCrateDate(new Date());
        List<Coupon> list2 = new ArrayList<>();
        list2.add(coupon2);
        data.put("station_10050623",list2);
        String key = null;

        for(Coupon c : list) {
            String ss[] = stations.split(",");
            for (int i = 0; i < ss.length; i++) {
                key = ss[i];
                key = STATION_HEADER + key;
                if (!data.containsKey(key)) {
                    data.put(key, new ArrayList<>());
                }
                data.get(key).add(c);
            }
        }

        for(Map.Entry entryValue : data.entrySet()) {
            System.out.println(entryValue.getKey());
            System.out.println(((List<Coupon>)entryValue.getValue()).get(0).getCouponName());
        }*/

        String s = "9.01";
        System.out.println(s.replaceAll("0+?$","").replaceAll("[.]$",""));

        System.out.println("hello world");
    }
}
